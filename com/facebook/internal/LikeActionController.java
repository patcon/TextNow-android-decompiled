package com.facebook.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.m;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.RequestBatch;
import com.facebook.RequestBatch.Callback;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.Settings;
import com.facebook.widget.FacebookDialog;
import com.facebook.widget.FacebookDialog.Callback;
import com.facebook.widget.FacebookDialog.PendingCall;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class LikeActionController
{
  public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR = "com.facebook.sdk.LikeActionController.DID_ERROR";
  public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_RESET = "com.facebook.sdk.LikeActionController.DID_RESET";
  public static final String ACTION_LIKE_ACTION_CONTROLLER_UPDATED = "com.facebook.sdk.LikeActionController.UPDATED";
  public static final String ACTION_OBJECT_ID_KEY = "com.facebook.sdk.LikeActionController.OBJECT_ID";
  private static final int ERROR_CODE_OBJECT_ALREADY_LIKED = 3501;
  public static final String ERROR_INVALID_OBJECT_ID = "Invalid Object Id";
  private static final String JSON_BOOL_IS_OBJECT_LIKED_KEY = "is_object_liked";
  private static final String JSON_BUNDLE_PENDING_CALL_ANALYTICS_BUNDLE = "pending_call_analytics_bundle";
  private static final String JSON_INT_VERSION_KEY = "com.facebook.internal.LikeActionController.version";
  private static final String JSON_STRING_LIKE_COUNT_WITHOUT_LIKE_KEY = "like_count_string_without_like";
  private static final String JSON_STRING_LIKE_COUNT_WITH_LIKE_KEY = "like_count_string_with_like";
  private static final String JSON_STRING_OBJECT_ID_KEY = "object_id";
  private static final String JSON_STRING_PENDING_CALL_ID_KEY = "pending_call_id";
  private static final String JSON_STRING_SOCIAL_SENTENCE_WITHOUT_LIKE_KEY = "social_sentence_without_like";
  private static final String JSON_STRING_SOCIAL_SENTENCE_WITH_LIKE_KEY = "social_sentence_with_like";
  private static final String JSON_STRING_UNLIKE_TOKEN_KEY = "unlike_token";
  private static final String LIKE_ACTION_CONTROLLER_STORE = "com.facebook.LikeActionController.CONTROLLER_STORE_KEY";
  private static final String LIKE_ACTION_CONTROLLER_STORE_OBJECT_SUFFIX_KEY = "OBJECT_SUFFIX";
  private static final String LIKE_ACTION_CONTROLLER_STORE_PENDING_OBJECT_ID_KEY = "PENDING_CONTROLLER_KEY";
  private static final int LIKE_ACTION_CONTROLLER_VERSION = 2;
  private static final String LIKE_DIALOG_RESPONSE_LIKE_COUNT_STRING_KEY = "like_count_string";
  private static final String LIKE_DIALOG_RESPONSE_OBJECT_IS_LIKED_KEY = "object_is_liked";
  private static final String LIKE_DIALOG_RESPONSE_SOCIAL_SENTENCE_KEY = "social_sentence";
  private static final String LIKE_DIALOG_RESPONSE_UNLIKE_TOKEN_KEY = "unlike_token";
  private static final int MAX_CACHE_SIZE = 128;
  private static final int MAX_OBJECT_SUFFIX = 1000;
  private static final String TAG = LikeActionController.class.getSimpleName();
  private static final ConcurrentHashMap<String, LikeActionController> cache = new ConcurrentHashMap();
  private static FileLruCache controllerDiskCache;
  private static WorkQueue diskIOWorkQueue = new WorkQueue(1);
  private static Handler handler;
  private static boolean isInitialized;
  private static boolean isPendingBroadcastReset;
  private static WorkQueue mruCacheWorkQueue = new WorkQueue(1);
  private static String objectIdForPendingController;
  private static volatile int objectSuffix;
  private AppEventsLogger appEventsLogger;
  private Context context;
  private boolean isObjectLiked;
  private boolean isObjectLikedOnServer;
  private boolean isPendingLikeOrUnlike;
  private String likeCountStringWithLike;
  private String likeCountStringWithoutLike;
  private String objectId;
  private boolean objectIsPage;
  private Bundle pendingCallAnalyticsBundle;
  private UUID pendingCallId;
  private Session session;
  private String socialSentenceWithLike;
  private String socialSentenceWithoutLike;
  private String unlikeToken;
  private String verifiedObjectId;

  private LikeActionController(Context paramContext, Session paramSession, String paramString)
  {
    this.context = paramContext;
    this.session = paramSession;
    this.objectId = paramString;
    this.appEventsLogger = AppEventsLogger.newLogger(paramContext, paramSession);
  }

  private static void broadcastAction(Context paramContext, LikeActionController paramLikeActionController, String paramString)
  {
    broadcastAction(paramContext, paramLikeActionController, paramString, null);
  }

  private static void broadcastAction(Context paramContext, LikeActionController paramLikeActionController, String paramString, Bundle paramBundle)
  {
    Intent localIntent = new Intent(paramString);
    if (paramLikeActionController != null)
    {
      if (paramBundle == null)
        paramBundle = new Bundle();
      paramBundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", paramLikeActionController.getObjectId());
    }
    if (paramBundle != null)
      localIntent.putExtras(paramBundle);
    m.a(paramContext.getApplicationContext()).a(localIntent);
  }

  private boolean canUseOGPublish(boolean paramBoolean)
  {
    return (!this.objectIsPage) && (this.verifiedObjectId != null) && (this.session != null) && (this.session.getPermissions() != null) && (this.session.getPermissions().contains("publish_actions")) && ((paramBoolean) || (!Utility.isNullOrEmpty(this.unlikeToken)));
  }

  private static void createControllerForObjectId(Context paramContext, String paramString, LikeActionController.CreationCallback paramCreationCallback)
  {
    LikeActionController localLikeActionController1 = getControllerFromInMemoryCache(paramString);
    if (localLikeActionController1 != null)
    {
      invokeCallbackWithController(paramCreationCallback, localLikeActionController1);
      return;
    }
    LikeActionController localLikeActionController2 = deserializeFromDiskSynchronously(paramContext, paramString);
    if (localLikeActionController2 == null)
    {
      localLikeActionController2 = new LikeActionController(paramContext, Session.getActiveSession(), paramString);
      serializeToDiskAsync(localLikeActionController2);
    }
    putControllerInMemoryCache(paramString, localLikeActionController2);
    handler.post(new Runnable()
    {
      public final void run()
      {
        LikeActionController.this.refreshStatusAsync();
      }
    });
    invokeCallbackWithController(paramCreationCallback, localLikeActionController2);
  }

  // ERROR //
  private static LikeActionController deserializeFromDiskSynchronously(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 369	com/facebook/internal/LikeActionController:getCacheKeyForObjectId	(Ljava/lang/String;)Ljava/lang/String;
    //   4: astore 8
    //   6: getstatic 260	com/facebook/internal/LikeActionController:controllerDiskCache	Lcom/facebook/internal/FileLruCache;
    //   9: aload 8
    //   11: invokevirtual 375	com/facebook/internal/FileLruCache:get	(Ljava/lang/String;)Ljava/io/InputStream;
    //   14: astore 9
    //   16: aload 9
    //   18: astore_3
    //   19: aconst_null
    //   20: astore 7
    //   22: aload_3
    //   23: ifnull +36 -> 59
    //   26: aload_3
    //   27: invokestatic 379	com/facebook/internal/Utility:readStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   30: astore 11
    //   32: aload 11
    //   34: invokestatic 328	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   37: istore 12
    //   39: aconst_null
    //   40: astore 7
    //   42: iload 12
    //   44: ifne +15 -> 59
    //   47: aload_0
    //   48: aload 11
    //   50: invokestatic 382	com/facebook/internal/LikeActionController:deserializeFromJson	(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    //   53: astore 13
    //   55: aload 13
    //   57: astore 7
    //   59: aload_3
    //   60: ifnull +7 -> 67
    //   63: aload_3
    //   64: invokestatic 386	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   67: aload 7
    //   69: areturn
    //   70: astore 5
    //   72: aconst_null
    //   73: astore_3
    //   74: getstatic 125	com/facebook/internal/LikeActionController:TAG	Ljava/lang/String;
    //   77: pop
    //   78: aconst_null
    //   79: astore 7
    //   81: aload_3
    //   82: ifnull -15 -> 67
    //   85: aload_3
    //   86: invokestatic 386	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   89: aconst_null
    //   90: areturn
    //   91: astore_2
    //   92: aconst_null
    //   93: astore_3
    //   94: aload_2
    //   95: astore 4
    //   97: aload_3
    //   98: ifnull +7 -> 105
    //   101: aload_3
    //   102: invokestatic 386	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   105: aload 4
    //   107: athrow
    //   108: astore 4
    //   110: goto -13 -> 97
    //   113: astore 10
    //   115: goto -41 -> 74
    //
    // Exception table:
    //   from	to	target	type
    //   0	16	70	java/io/IOException
    //   0	16	91	finally
    //   26	39	108	finally
    //   47	55	108	finally
    //   74	78	108	finally
    //   26	39	113	java/io/IOException
    //   47	55	113	java/io/IOException
  }

  private static LikeActionController deserializeFromJson(Context paramContext, String paramString)
  {
    try
    {
      JSONObject localJSONObject1 = new JSONObject(paramString);
      if (localJSONObject1.optInt("com.facebook.internal.LikeActionController.version", -1) != 2)
        return null;
      localLikeActionController = new LikeActionController(paramContext, Session.getActiveSession(), localJSONObject1.getString("object_id"));
      localLikeActionController.likeCountStringWithLike = localJSONObject1.optString("like_count_string_with_like", null);
      localLikeActionController.likeCountStringWithoutLike = localJSONObject1.optString("like_count_string_without_like", null);
      localLikeActionController.socialSentenceWithLike = localJSONObject1.optString("social_sentence_with_like", null);
      localLikeActionController.socialSentenceWithoutLike = localJSONObject1.optString("social_sentence_without_like", null);
      localLikeActionController.isObjectLiked = localJSONObject1.optBoolean("is_object_liked");
      localLikeActionController.unlikeToken = localJSONObject1.optString("unlike_token", null);
      String str = localJSONObject1.optString("pending_call_id", null);
      if (!Utility.isNullOrEmpty(str))
        localLikeActionController.pendingCallId = UUID.fromString(str);
      JSONObject localJSONObject2 = localJSONObject1.optJSONObject("pending_call_analytics_bundle");
      if (localJSONObject2 != null)
        localLikeActionController.pendingCallAnalyticsBundle = BundleJSONConverter.convertToBundle(localJSONObject2);
      return localLikeActionController;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        LikeActionController localLikeActionController = null;
    }
  }

  private void fetchVerifiedObjectId(final LikeActionController.RequestCompletionCallback paramRequestCompletionCallback)
  {
    if (!Utility.isNullOrEmpty(this.verifiedObjectId))
    {
      if (paramRequestCompletionCallback != null)
        paramRequestCompletionCallback.onComplete();
      return;
    }
    final LikeActionController.GetOGObjectIdRequestWrapper localGetOGObjectIdRequestWrapper = new LikeActionController.GetOGObjectIdRequestWrapper(this, this.objectId);
    final LikeActionController.GetPageIdRequestWrapper localGetPageIdRequestWrapper = new LikeActionController.GetPageIdRequestWrapper(this, this.objectId);
    RequestBatch localRequestBatch = new RequestBatch();
    localGetOGObjectIdRequestWrapper.addToBatch(localRequestBatch);
    localGetPageIdRequestWrapper.addToBatch(localRequestBatch);
    localRequestBatch.addCallback(new RequestBatch.Callback()
    {
      public void onBatchCompleted(RequestBatch paramAnonymousRequestBatch)
      {
        LikeActionController.access$1402(LikeActionController.this, localGetOGObjectIdRequestWrapper.verifiedObjectId);
        if (Utility.isNullOrEmpty(LikeActionController.this.verifiedObjectId))
        {
          LikeActionController.access$1402(LikeActionController.this, localGetPageIdRequestWrapper.verifiedObjectId);
          LikeActionController.access$2502(LikeActionController.this, localGetPageIdRequestWrapper.objectIsPage);
        }
        LikeActionController localLikeActionController;
        if (Utility.isNullOrEmpty(LikeActionController.this.verifiedObjectId))
        {
          LoggingBehavior localLoggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
          String str = LikeActionController.TAG;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = LikeActionController.this.objectId;
          Logger.log(localLoggingBehavior, str, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", arrayOfObject);
          localLikeActionController = LikeActionController.this;
          if (localGetPageIdRequestWrapper.error == null)
            break label158;
        }
        label158: for (FacebookRequestError localFacebookRequestError = localGetPageIdRequestWrapper.error; ; localFacebookRequestError = localGetOGObjectIdRequestWrapper.error)
        {
          localLikeActionController.logAppEventForError("get_verified_id", localFacebookRequestError);
          if (paramRequestCompletionCallback != null)
            paramRequestCompletionCallback.onComplete();
          return;
        }
      }
    });
    localRequestBatch.executeAsync();
  }

  private static String getCacheKeyForObjectId(String paramString)
  {
    Session localSession = Session.getActiveSession();
    String str = null;
    if (localSession != null)
    {
      boolean bool = localSession.isOpened();
      str = null;
      if (bool)
        str = localSession.getAccessToken();
    }
    if (str != null)
      str = Utility.md5hash(str);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Utility.coerceValueIfNullOrEmpty(str, "");
    arrayOfObject[2] = Integer.valueOf(objectSuffix);
    return String.format("%s|%s|com.fb.sdk.like|%d", arrayOfObject);
  }

  public static void getControllerForObjectId(Context paramContext, String paramString, LikeActionController.CreationCallback paramCreationCallback)
  {
    if (!isInitialized)
      performFirstInitialize(paramContext);
    LikeActionController localLikeActionController = getControllerFromInMemoryCache(paramString);
    if (localLikeActionController != null)
    {
      invokeCallbackWithController(paramCreationCallback, localLikeActionController);
      return;
    }
    diskIOWorkQueue.addActiveWorkItem(new LikeActionController.CreateLikeActionControllerWorkItem(paramContext, paramString, paramCreationCallback));
  }

  private static LikeActionController getControllerFromInMemoryCache(String paramString)
  {
    String str = getCacheKeyForObjectId(paramString);
    LikeActionController localLikeActionController = (LikeActionController)cache.get(str);
    if (localLikeActionController != null)
      mruCacheWorkQueue.addActiveWorkItem(new LikeActionController.MRUCacheWorkItem(str, false));
    return localLikeActionController;
  }

  private FacebookDialog.Callback getFacebookDialogCallback(final Bundle paramBundle)
  {
    return new FacebookDialog.Callback()
    {
      public void onComplete(FacebookDialog.PendingCall paramAnonymousPendingCall, Bundle paramAnonymousBundle)
      {
        if (!paramAnonymousBundle.containsKey("object_is_liked"))
          return;
        boolean bool = paramAnonymousBundle.getBoolean("object_is_liked");
        String str1 = paramAnonymousBundle.getString("like_count_string");
        String str2 = paramAnonymousBundle.getString("social_sentence");
        String str3 = paramAnonymousBundle.getString("unlike_token");
        if (paramBundle == null);
        for (Bundle localBundle = new Bundle(); ; localBundle = paramBundle)
        {
          localBundle.putString("call_id", paramAnonymousPendingCall.getCallId().toString());
          LikeActionController.this.appEventsLogger.logSdkEvent("fb_like_control_dialog_did_succeed", null, localBundle);
          LikeActionController.this.updateState(bool, str1, str1, str2, str2, str3);
          return;
        }
      }

      public void onError(FacebookDialog.PendingCall paramAnonymousPendingCall, Exception paramAnonymousException, Bundle paramAnonymousBundle)
      {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Like Dialog failed with error : %s", new Object[] { paramAnonymousException });
        if (paramBundle == null);
        for (Bundle localBundle = new Bundle(); ; localBundle = paramBundle)
        {
          localBundle.putString("call_id", paramAnonymousPendingCall.getCallId().toString());
          LikeActionController.this.logAppEventForError("present_dialog", localBundle);
          LikeActionController.broadcastAction(LikeActionController.this.context, LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", paramAnonymousBundle);
          return;
        }
      }
    };
  }

  public static boolean handleOnActivityResult(Context paramContext, int paramInt1, final int paramInt2, final Intent paramIntent)
  {
    final UUID localUUID = NativeProtocol.getCallIdFromIntent(paramIntent);
    if (localUUID == null);
    do
    {
      return false;
      if (Utility.isNullOrEmpty(objectIdForPendingController))
        objectIdForPendingController = paramContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
    }
    while (Utility.isNullOrEmpty(objectIdForPendingController));
    getControllerForObjectId(paramContext, objectIdForPendingController, new LikeActionController.CreationCallback()
    {
      public final void onComplete(LikeActionController paramAnonymousLikeActionController)
      {
        paramAnonymousLikeActionController.onActivityResult(this.val$requestCode, paramInt2, paramIntent, localUUID);
      }
    });
    return true;
  }

  private static void invokeCallbackWithController(LikeActionController.CreationCallback paramCreationCallback, final LikeActionController paramLikeActionController)
  {
    if (paramCreationCallback == null)
      return;
    handler.post(new Runnable()
    {
      public final void run()
      {
        LikeActionController.this.onComplete(paramLikeActionController);
      }
    });
  }

  private void logAppEventForError(String paramString, Bundle paramBundle)
  {
    Bundle localBundle = new Bundle(paramBundle);
    localBundle.putString("object_id", this.objectId);
    localBundle.putString("current_action", paramString);
    this.appEventsLogger.logSdkEvent("fb_like_control_error", null, localBundle);
  }

  private void logAppEventForError(String paramString, FacebookRequestError paramFacebookRequestError)
  {
    Bundle localBundle = new Bundle();
    if (paramFacebookRequestError != null)
    {
      JSONObject localJSONObject = paramFacebookRequestError.getRequestResult();
      if (localJSONObject != null)
        localBundle.putString("error", localJSONObject.toString());
    }
    logAppEventForError(paramString, localBundle);
  }

  private boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent, UUID paramUUID)
  {
    if ((this.pendingCallId == null) || (!this.pendingCallId.equals(paramUUID)));
    FacebookDialog.PendingCall localPendingCall;
    do
    {
      return false;
      localPendingCall = PendingCallStore.getInstance().getPendingCallById(this.pendingCallId);
    }
    while (localPendingCall == null);
    FacebookDialog.handleActivityResult(this.context, localPendingCall, paramInt1, paramIntent, getFacebookDialogCallback(this.pendingCallAnalyticsBundle));
    stopTrackingPendingCall();
    return true;
  }

  private static void performFirstInitialize(Context paramContext)
  {
    try
    {
      boolean bool = isInitialized;
      if (bool);
      while (true)
      {
        return;
        handler = new Handler(Looper.getMainLooper());
        objectSuffix = paramContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
        controllerDiskCache = new FileLruCache(paramContext, TAG, new FileLruCache.Limits());
        registerSessionBroadcastReceivers(paramContext);
        isInitialized = true;
      }
    }
    finally
    {
    }
  }

  private void performLikeOrUnlike(Activity paramActivity, boolean paramBoolean, Bundle paramBundle)
  {
    if (canUseOGPublish(paramBoolean))
    {
      if (paramBoolean)
      {
        publishLikeAsync(paramActivity, paramBundle);
        return;
      }
      publishUnlikeAsync(paramActivity, paramBundle);
      return;
    }
    presentLikeDialog(paramActivity, paramBundle);
  }

  private void presentLikeDialog(Activity paramActivity, Bundle paramBundle)
  {
    LikeActionController.LikeDialogBuilder localLikeDialogBuilder = new LikeActionController.LikeDialogBuilder(paramActivity, this.objectId);
    if (localLikeDialogBuilder.canPresent())
    {
      trackPendingCall(localLikeDialogBuilder.build().present(), paramBundle);
      this.appEventsLogger.logSdkEvent("fb_like_control_did_present_dialog", null, paramBundle);
    }
    String str;
    do
    {
      return;
      str = localLikeDialogBuilder.getWebFallbackUrl();
    }
    while ((Utility.isNullOrEmpty(str)) || (!FacebookWebFallbackDialog.presentWebFallback(paramActivity, str, localLikeDialogBuilder.getApplicationId(), localLikeDialogBuilder.getAppCall(), getFacebookDialogCallback(paramBundle))));
    this.appEventsLogger.logSdkEvent("fb_like_control_did_present_fallback_dialog", null, paramBundle);
  }

  private void publishLikeAsync(final Activity paramActivity, final Bundle paramBundle)
  {
    this.isPendingLikeOrUnlike = true;
    fetchVerifiedObjectId(new LikeActionController.RequestCompletionCallback()
    {
      public void onComplete()
      {
        if (Utility.isNullOrEmpty(LikeActionController.this.verifiedObjectId))
        {
          Bundle localBundle = new Bundle();
          localBundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
          LikeActionController.broadcastAction(LikeActionController.this.context, LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", localBundle);
          return;
        }
        RequestBatch localRequestBatch = new RequestBatch();
        final LikeActionController.PublishLikeRequestWrapper localPublishLikeRequestWrapper = new LikeActionController.PublishLikeRequestWrapper(LikeActionController.this, LikeActionController.this.verifiedObjectId);
        localPublishLikeRequestWrapper.addToBatch(localRequestBatch);
        localRequestBatch.addCallback(new RequestBatch.Callback()
        {
          public void onBatchCompleted(RequestBatch paramAnonymous2RequestBatch)
          {
            LikeActionController.access$1502(LikeActionController.this, false);
            if (localPublishLikeRequestWrapper.error != null)
            {
              LikeActionController.this.updateState(false, LikeActionController.this.likeCountStringWithLike, LikeActionController.this.likeCountStringWithoutLike, LikeActionController.this.socialSentenceWithLike, LikeActionController.this.socialSentenceWithoutLike, LikeActionController.this.unlikeToken);
              LikeActionController.this.presentLikeDialog(LikeActionController.6.this.val$activity, LikeActionController.6.this.val$analyticsParameters);
              return;
            }
            LikeActionController.access$2002(LikeActionController.this, Utility.coerceValueIfNullOrEmpty(localPublishLikeRequestWrapper.unlikeToken, null));
            LikeActionController.access$2202(LikeActionController.this, true);
            LikeActionController.this.appEventsLogger.logSdkEvent("fb_like_control_did_like", null, LikeActionController.6.this.val$analyticsParameters);
            LikeActionController.this.toggleAgainIfNeeded(LikeActionController.6.this.val$activity, LikeActionController.6.this.val$analyticsParameters);
          }
        });
        localRequestBatch.executeAsync();
      }
    });
  }

  private void publishUnlikeAsync(final Activity paramActivity, final Bundle paramBundle)
  {
    this.isPendingLikeOrUnlike = true;
    RequestBatch localRequestBatch = new RequestBatch();
    final LikeActionController.PublishUnlikeRequestWrapper localPublishUnlikeRequestWrapper = new LikeActionController.PublishUnlikeRequestWrapper(this, this.unlikeToken);
    localPublishUnlikeRequestWrapper.addToBatch(localRequestBatch);
    localRequestBatch.addCallback(new RequestBatch.Callback()
    {
      public void onBatchCompleted(RequestBatch paramAnonymousRequestBatch)
      {
        LikeActionController.access$1502(LikeActionController.this, false);
        if (localPublishUnlikeRequestWrapper.error != null)
        {
          LikeActionController.this.updateState(true, LikeActionController.this.likeCountStringWithLike, LikeActionController.this.likeCountStringWithoutLike, LikeActionController.this.socialSentenceWithLike, LikeActionController.this.socialSentenceWithoutLike, LikeActionController.this.unlikeToken);
          LikeActionController.this.presentLikeDialog(paramActivity, paramBundle);
          return;
        }
        LikeActionController.access$2002(LikeActionController.this, null);
        LikeActionController.access$2202(LikeActionController.this, false);
        LikeActionController.this.appEventsLogger.logSdkEvent("fb_like_control_did_unlike", null, paramBundle);
        LikeActionController.this.toggleAgainIfNeeded(paramActivity, paramBundle);
      }
    });
    localRequestBatch.executeAsync();
  }

  private static void putControllerInMemoryCache(String paramString, LikeActionController paramLikeActionController)
  {
    String str = getCacheKeyForObjectId(paramString);
    mruCacheWorkQueue.addActiveWorkItem(new LikeActionController.MRUCacheWorkItem(str, true));
    cache.put(str, paramLikeActionController);
  }

  private void refreshStatusAsync()
  {
    if ((this.session == null) || (this.session.isClosed()) || (SessionState.CREATED.equals(this.session.getState())))
    {
      refreshStatusViaService();
      return;
    }
    fetchVerifiedObjectId(new LikeActionController.RequestCompletionCallback()
    {
      public void onComplete()
      {
        final LikeActionController.GetOGObjectLikesRequestWrapper localGetOGObjectLikesRequestWrapper = new LikeActionController.GetOGObjectLikesRequestWrapper(LikeActionController.this, LikeActionController.this.verifiedObjectId);
        final LikeActionController.GetEngagementRequestWrapper localGetEngagementRequestWrapper = new LikeActionController.GetEngagementRequestWrapper(LikeActionController.this, LikeActionController.this.verifiedObjectId);
        RequestBatch localRequestBatch = new RequestBatch();
        localGetOGObjectLikesRequestWrapper.addToBatch(localRequestBatch);
        localGetEngagementRequestWrapper.addToBatch(localRequestBatch);
        localRequestBatch.addCallback(new RequestBatch.Callback()
        {
          public void onBatchCompleted(RequestBatch paramAnonymous2RequestBatch)
          {
            if ((localGetOGObjectLikesRequestWrapper.error != null) || (localGetEngagementRequestWrapper.error != null))
            {
              LoggingBehavior localLoggingBehavior = LoggingBehavior.REQUESTS;
              String str = LikeActionController.TAG;
              Object[] arrayOfObject = new Object[1];
              arrayOfObject[0] = LikeActionController.this.objectId;
              Logger.log(localLoggingBehavior, str, "Unable to refresh like state for id: '%s'", arrayOfObject);
              return;
            }
            LikeActionController.this.updateState(localGetOGObjectLikesRequestWrapper.objectIsLiked, localGetEngagementRequestWrapper.likeCountStringWithLike, localGetEngagementRequestWrapper.likeCountStringWithoutLike, localGetEngagementRequestWrapper.socialSentenceStringWithLike, localGetEngagementRequestWrapper.socialSentenceStringWithoutLike, localGetOGObjectLikesRequestWrapper.unlikeToken);
          }
        });
        localRequestBatch.executeAsync();
      }
    });
  }

  private void refreshStatusViaService()
  {
    LikeStatusClient localLikeStatusClient = new LikeStatusClient(this.context, Settings.getApplicationId(), this.objectId);
    if (!localLikeStatusClient.start())
      return;
    localLikeStatusClient.setCompletedListener(new PlatformServiceClient.CompletedListener()
    {
      public void completed(Bundle paramAnonymousBundle)
      {
        if ((paramAnonymousBundle == null) || (!paramAnonymousBundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")))
          return;
        boolean bool = paramAnonymousBundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
        String str1 = paramAnonymousBundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
        String str2 = paramAnonymousBundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
        String str3 = paramAnonymousBundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
        String str4 = paramAnonymousBundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
        String str5 = paramAnonymousBundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
        LikeActionController.this.updateState(bool, str1, str2, str3, str4, str5);
      }
    });
  }

  private static void registerSessionBroadcastReceivers(Context paramContext)
  {
    m localm = m.a(paramContext);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
    localIntentFilter.addAction("com.facebook.sdk.ACTIVE_SESSION_CLOSED");
    localIntentFilter.addAction("com.facebook.sdk.ACTIVE_SESSION_OPENED");
    localm.a(new BroadcastReceiver()
    {
      public final void onReceive(final Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        if (LikeActionController.isPendingBroadcastReset)
          return;
        String str = paramAnonymousIntent.getAction();
        if ((Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_UNSET", str)) || (Utility.areObjectsEqual("com.facebook.sdk.ACTIVE_SESSION_CLOSED", str)));
        for (final boolean bool = true; ; bool = false)
        {
          LikeActionController.access$202(true);
          LikeActionController.handler.postDelayed(new Runnable()
          {
            public void run()
            {
              if (bool)
              {
                LikeActionController.access$302((1 + LikeActionController.objectSuffix) % 1000);
                paramAnonymousContext.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.objectSuffix).apply();
                LikeActionController.cache.clear();
                LikeActionController.controllerDiskCache.clearCache();
              }
              LikeActionController.broadcastAction(paramAnonymousContext, null, "com.facebook.sdk.LikeActionController.DID_RESET");
              LikeActionController.access$202(false);
            }
          }
          , 100L);
          return;
        }
      }
    }
    , localIntentFilter);
  }

  private static void serializeToDiskAsync(LikeActionController paramLikeActionController)
  {
    String str1 = serializeToJson(paramLikeActionController);
    String str2 = getCacheKeyForObjectId(paramLikeActionController.objectId);
    if ((!Utility.isNullOrEmpty(str1)) && (!Utility.isNullOrEmpty(str2)))
      diskIOWorkQueue.addActiveWorkItem(new LikeActionController.SerializeToDiskWorkItem(str2, str1));
  }

  // ERROR //
  private static void serializeToDiskSynchronously(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 260	com/facebook/internal/LikeActionController:controllerDiskCache	Lcom/facebook/internal/FileLruCache;
    //   5: aload_0
    //   6: invokevirtual 752	com/facebook/internal/FileLruCache:openPutStream	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   9: astore 9
    //   11: aload 9
    //   13: astore_2
    //   14: aload_2
    //   15: aload_1
    //   16: invokevirtual 756	java/lang/String:getBytes	()[B
    //   19: invokevirtual 762	java/io/OutputStream:write	([B)V
    //   22: aload_2
    //   23: ifnull +7 -> 30
    //   26: aload_2
    //   27: invokestatic 386	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   30: return
    //   31: astore 6
    //   33: getstatic 125	com/facebook/internal/LikeActionController:TAG	Ljava/lang/String;
    //   36: pop
    //   37: aload_2
    //   38: ifnull -8 -> 30
    //   41: aload_2
    //   42: invokestatic 386	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   45: return
    //   46: astore_3
    //   47: aconst_null
    //   48: astore 4
    //   50: aload_3
    //   51: astore 5
    //   53: aload 4
    //   55: ifnull +8 -> 63
    //   58: aload 4
    //   60: invokestatic 386	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   63: aload 5
    //   65: athrow
    //   66: astore 7
    //   68: aload_2
    //   69: astore 4
    //   71: aload 7
    //   73: astore 5
    //   75: goto -22 -> 53
    //
    // Exception table:
    //   from	to	target	type
    //   2	11	31	java/io/IOException
    //   14	22	31	java/io/IOException
    //   2	11	46	finally
    //   14	22	66	finally
    //   33	37	66	finally
  }

  private static String serializeToJson(LikeActionController paramLikeActionController)
  {
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      localJSONObject1.put("com.facebook.internal.LikeActionController.version", 2);
      localJSONObject1.put("object_id", paramLikeActionController.objectId);
      localJSONObject1.put("like_count_string_with_like", paramLikeActionController.likeCountStringWithLike);
      localJSONObject1.put("like_count_string_without_like", paramLikeActionController.likeCountStringWithoutLike);
      localJSONObject1.put("social_sentence_with_like", paramLikeActionController.socialSentenceWithLike);
      localJSONObject1.put("social_sentence_without_like", paramLikeActionController.socialSentenceWithoutLike);
      localJSONObject1.put("is_object_liked", paramLikeActionController.isObjectLiked);
      localJSONObject1.put("unlike_token", paramLikeActionController.unlikeToken);
      if (paramLikeActionController.pendingCallId != null)
        localJSONObject1.put("pending_call_id", paramLikeActionController.pendingCallId.toString());
      if (paramLikeActionController.pendingCallAnalyticsBundle != null)
      {
        JSONObject localJSONObject2 = BundleJSONConverter.convertToJSON(paramLikeActionController.pendingCallAnalyticsBundle);
        if (localJSONObject2 != null)
          localJSONObject1.put("pending_call_analytics_bundle", localJSONObject2);
      }
      return localJSONObject1.toString();
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  private void stopTrackingPendingCall()
  {
    PendingCallStore.getInstance().stopTrackingPendingCall(this.pendingCallId);
    this.pendingCallId = null;
    this.pendingCallAnalyticsBundle = null;
    storeObjectIdForPendingController(null);
  }

  private void storeObjectIdForPendingController(String paramString)
  {
    objectIdForPendingController = paramString;
    this.context.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", objectIdForPendingController).apply();
  }

  private void toggleAgainIfNeeded(Activity paramActivity, Bundle paramBundle)
  {
    if (this.isObjectLiked != this.isObjectLikedOnServer)
      performLikeOrUnlike(paramActivity, this.isObjectLiked, paramBundle);
  }

  private void trackPendingCall(FacebookDialog.PendingCall paramPendingCall, Bundle paramBundle)
  {
    PendingCallStore.getInstance().trackPendingCall(paramPendingCall);
    this.pendingCallId = paramPendingCall.getCallId();
    storeObjectIdForPendingController(this.objectId);
    this.pendingCallAnalyticsBundle = paramBundle;
    serializeToDiskAsync(this);
  }

  private void updateState(boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    String str1 = Utility.coerceValueIfNullOrEmpty(paramString1, null);
    String str2 = Utility.coerceValueIfNullOrEmpty(paramString2, null);
    String str3 = Utility.coerceValueIfNullOrEmpty(paramString3, null);
    String str4 = Utility.coerceValueIfNullOrEmpty(paramString4, null);
    String str5 = Utility.coerceValueIfNullOrEmpty(paramString5, null);
    if ((paramBoolean != this.isObjectLiked) || (!Utility.areObjectsEqual(str1, this.likeCountStringWithLike)) || (!Utility.areObjectsEqual(str2, this.likeCountStringWithoutLike)) || (!Utility.areObjectsEqual(str3, this.socialSentenceWithLike)) || (!Utility.areObjectsEqual(str4, this.socialSentenceWithoutLike)) || (!Utility.areObjectsEqual(str5, this.unlikeToken)));
    for (int i = 1; i == 0; i = 0)
      return;
    this.isObjectLiked = paramBoolean;
    this.likeCountStringWithLike = str1;
    this.likeCountStringWithoutLike = str2;
    this.socialSentenceWithLike = str3;
    this.socialSentenceWithoutLike = str4;
    this.unlikeToken = str5;
    serializeToDiskAsync(this);
    broadcastAction(this.context, this, "com.facebook.sdk.LikeActionController.UPDATED", null);
  }

  public String getLikeCountString()
  {
    if (this.isObjectLiked)
      return this.likeCountStringWithLike;
    return this.likeCountStringWithoutLike;
  }

  public String getObjectId()
  {
    return this.objectId;
  }

  public String getSocialSentence()
  {
    if (this.isObjectLiked)
      return this.socialSentenceWithLike;
    return this.socialSentenceWithoutLike;
  }

  public boolean isObjectLiked()
  {
    return this.isObjectLiked;
  }

  public void toggleLike(Activity paramActivity, Bundle paramBundle)
  {
    this.appEventsLogger.logSdkEvent("fb_like_control_did_tap", null, paramBundle);
    if (!this.isObjectLiked);
    for (boolean bool = true; canUseOGPublish(bool); bool = false)
    {
      updateState(bool, this.likeCountStringWithLike, this.likeCountStringWithoutLike, this.socialSentenceWithLike, this.socialSentenceWithoutLike, this.unlikeToken);
      if (!this.isPendingLikeOrUnlike)
        break;
      this.appEventsLogger.logSdkEvent("fb_like_control_did_undo_quickly", null, paramBundle);
      return;
    }
    performLikeOrUnlike(paramActivity, bool, paramBundle);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.LikeActionController
 * JD-Core Version:    0.6.2
 */