package com.facebook.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookException;
import com.facebook.NativeAppCallAttachmentStore;
import com.facebook.Settings;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.DialogFeatureConfig;
import java.util.EnumSet;
import java.util.Iterator;

public class FacebookDialog
{
  public static final String COMPLETION_GESTURE_CANCEL = "cancel";
  private static final String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";
  private static final String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";
  private static final String EXTRA_DIALOG_COMPLETION_ID_KEY = "com.facebook.platform.extra.POST_ID";
  private static NativeAppCallAttachmentStore attachmentStore;
  private Activity activity;
  private FacebookDialog.PendingCall appCall;
  private Fragment fragment;
  private FacebookDialog.OnPresentCallback onPresentCallback;

  private FacebookDialog(Activity paramActivity, Fragment paramFragment, FacebookDialog.PendingCall paramPendingCall, FacebookDialog.OnPresentCallback paramOnPresentCallback)
  {
    this.activity = paramActivity;
    this.fragment = paramFragment;
    this.appCall = paramPendingCall;
    this.onPresentCallback = paramOnPresentCallback;
  }

  public static boolean canPresentMessageDialog(Context paramContext, FacebookDialog.MessageDialogFeature[] paramArrayOfMessageDialogFeature)
  {
    return handleCanPresent(paramContext, EnumSet.of(FacebookDialog.MessageDialogFeature.MESSAGE_DIALOG, paramArrayOfMessageDialogFeature));
  }

  public static boolean canPresentOpenGraphActionDialog(Context paramContext, FacebookDialog.OpenGraphActionDialogFeature[] paramArrayOfOpenGraphActionDialogFeature)
  {
    return handleCanPresent(paramContext, EnumSet.of(FacebookDialog.OpenGraphActionDialogFeature.OG_ACTION_DIALOG, paramArrayOfOpenGraphActionDialogFeature));
  }

  public static boolean canPresentOpenGraphMessageDialog(Context paramContext, FacebookDialog.OpenGraphMessageDialogFeature[] paramArrayOfOpenGraphMessageDialogFeature)
  {
    return handleCanPresent(paramContext, EnumSet.of(FacebookDialog.OpenGraphMessageDialogFeature.OG_MESSAGE_DIALOG, paramArrayOfOpenGraphMessageDialogFeature));
  }

  public static boolean canPresentShareDialog(Context paramContext, FacebookDialog.ShareDialogFeature[] paramArrayOfShareDialogFeature)
  {
    return handleCanPresent(paramContext, EnumSet.of(FacebookDialog.ShareDialogFeature.SHARE_DIALOG, paramArrayOfShareDialogFeature));
  }

  private static String getActionForFeatures(Iterable<? extends FacebookDialog.DialogFeature> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    boolean bool = localIterator.hasNext();
    String str = null;
    if (bool)
      str = ((FacebookDialog.DialogFeature)localIterator.next()).getAction();
    return str;
  }

  private static NativeAppCallAttachmentStore getAttachmentStore()
  {
    if (attachmentStore == null)
      attachmentStore = new NativeAppCallAttachmentStore();
    return attachmentStore;
  }

  private static String getEventName(Intent paramIntent)
  {
    return getEventName(paramIntent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION"), paramIntent.hasExtra("com.facebook.platform.extra.PHOTOS"));
  }

  private static String getEventName(String paramString, boolean paramBoolean)
  {
    if (paramString.equals("com.facebook.platform.action.request.FEED_DIALOG"))
    {
      if (paramBoolean)
        return "fb_dialogs_present_share_photo";
      return "fb_dialogs_present_share";
    }
    if (paramString.equals("com.facebook.platform.action.request.MESSAGE_DIALOG"))
    {
      if (paramBoolean)
        return "fb_dialogs_present_message_photo";
      return "fb_dialogs_present_message";
    }
    if (paramString.equals("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"))
      return "fb_dialogs_present_share_og";
    if (paramString.equals("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"))
      return "fb_dialogs_present_message_og";
    if (paramString.equals("com.facebook.platform.action.request.LIKE_DIALOG"))
      return "fb_dialogs_present_like";
    throw new FacebookException("An unspecified action was presented");
  }

  public static String getNativeDialogCompletionGesture(Bundle paramBundle)
  {
    return paramBundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
  }

  public static boolean getNativeDialogDidComplete(Bundle paramBundle)
  {
    return paramBundle.getBoolean("com.facebook.platform.extra.DID_COMPLETE", false);
  }

  public static String getNativeDialogPostId(Bundle paramBundle)
  {
    return paramBundle.getString("com.facebook.platform.extra.POST_ID");
  }

  private static int getProtocolVersionForNativeDialog(Context paramContext, String paramString, int[] paramArrayOfInt)
  {
    return NativeProtocol.getLatestAvailableProtocolVersionForAction(paramContext, paramString, paramArrayOfInt);
  }

  private static int[] getVersionSpecForFeature(String paramString1, String paramString2, FacebookDialog.DialogFeature paramDialogFeature)
  {
    Utility.DialogFeatureConfig localDialogFeatureConfig = Utility.getDialogFeatureConfig(paramString1, paramString2, paramDialogFeature.name());
    if (localDialogFeatureConfig != null)
      return localDialogFeatureConfig.getVersionSpec();
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = paramDialogFeature.getMinVersion();
    return arrayOfInt;
  }

  private static int[] getVersionSpecForFeatures(String paramString1, String paramString2, Iterable<? extends FacebookDialog.DialogFeature> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    for (int[] arrayOfInt = null; localIterator.hasNext(); arrayOfInt = Utility.intersectRanges(arrayOfInt, getVersionSpecForFeature(paramString1, paramString2, (FacebookDialog.DialogFeature)localIterator.next())));
    return arrayOfInt;
  }

  public static boolean handleActivityResult(Context paramContext, FacebookDialog.PendingCall paramPendingCall, int paramInt, Intent paramIntent, FacebookDialog.Callback paramCallback)
  {
    if (paramInt != paramPendingCall.getRequestCode())
      return false;
    if (attachmentStore != null)
      attachmentStore.cleanupAttachmentsForCall(paramContext, paramPendingCall.getCallId());
    if (paramCallback != null)
    {
      if (!NativeProtocol.isErrorResult(paramIntent))
        break label62;
      Bundle localBundle = NativeProtocol.getErrorDataFromResultIntent(paramIntent);
      paramCallback.onError(paramPendingCall, NativeProtocol.getExceptionFromErrorData(localBundle), localBundle);
    }
    while (true)
    {
      return true;
      label62: paramCallback.onComplete(paramPendingCall, NativeProtocol.getSuccessResultsFromIntent(paramIntent));
    }
  }

  private static boolean handleCanPresent(Context paramContext, Iterable<? extends FacebookDialog.DialogFeature> paramIterable)
  {
    String str1 = getActionForFeatures(paramIterable);
    String str2 = Settings.getApplicationId();
    if (Utility.isNullOrEmpty(str2))
      str2 = Utility.getMetadataApplicationId(paramContext);
    return getProtocolVersionForNativeDialog(paramContext, str1, getVersionSpecForFeatures(str2, str1, paramIterable)) != -1;
  }

  private static void logDialogActivity(Activity paramActivity, Fragment paramFragment, String paramString1, String paramString2)
  {
    if (paramFragment != null)
      paramActivity = paramFragment.getActivity();
    AppEventsLogger localAppEventsLogger = AppEventsLogger.newLogger(paramActivity);
    Bundle localBundle = new Bundle();
    localBundle.putString("fb_dialog_outcome", paramString2);
    localAppEventsLogger.logSdkEvent(paramString1, null, localBundle);
  }

  public FacebookDialog.PendingCall present()
  {
    logDialogActivity(this.activity, this.fragment, getEventName(this.appCall.getRequestIntent()), "Completed");
    if (this.onPresentCallback != null);
    while (true)
    {
      try
      {
        this.onPresentCallback.onPresent(this.activity);
        if (this.fragment != null)
        {
          this.fragment.startActivityForResult(this.appCall.getRequestIntent(), this.appCall.getRequestCode());
          return this.appCall;
        }
      }
      catch (Exception localException)
      {
        throw new FacebookException(localException);
      }
      this.activity.startActivityForResult(this.appCall.getRequestIntent(), this.appCall.getRequestCode());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.FacebookDialog
 * JD-Core Version:    0.6.2
 */