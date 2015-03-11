package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Logger;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphMultiResult;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import com.facebook.model.GraphPlace;
import com.facebook.model.GraphUser;
import com.facebook.model.OpenGraphAction;
import com.facebook.model.OpenGraphObject;
import com.facebook.model.OpenGraphObject.Factory;
import java.io.File;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class Request
{
  private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
  private static final String ACCESS_TOKEN_PARAM = "access_token";
  private static final String ATTACHED_FILES_PARAM = "attached_files";
  private static final String ATTACHMENT_FILENAME_PREFIX = "file";
  private static final String BATCH_APP_ID_PARAM = "batch_app_id";
  private static final String BATCH_BODY_PARAM = "body";
  private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
  private static final String BATCH_ENTRY_NAME_PARAM = "name";
  private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
  private static final String BATCH_METHOD_PARAM = "method";
  private static final String BATCH_PARAM = "batch";
  private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
  private static final String CONTENT_TYPE_HEADER = "Content-Type";
  private static final String FORMAT_JSON = "json";
  private static final String FORMAT_PARAM = "format";
  private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
  public static final int MAXIMUM_BATCH_SIZE = 50;
  private static final String ME = "me";
  private static final String MIME_BOUNDARY = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f";
  private static final String MY_ACTION_FORMAT = "me/%s";
  private static final String MY_FEED = "me/feed";
  private static final String MY_FRIENDS = "me/friends";
  private static final String MY_OBJECTS_FORMAT = "me/objects/%s";
  private static final String MY_PHOTOS = "me/photos";
  private static final String MY_STAGING_RESOURCES = "me/staging_resources";
  private static final String MY_VIDEOS = "me/videos";
  private static final String OBJECT_PARAM = "object";
  private static final String PICTURE_PARAM = "picture";
  private static final String SDK_ANDROID = "android";
  private static final String SDK_PARAM = "sdk";
  private static final String SEARCH = "search";
  private static final String STAGING_PARAM = "file";
  public static final String TAG = Request.class.getSimpleName();
  private static final String USER_AGENT_BASE = "FBAndroidSDK";
  private static final String USER_AGENT_HEADER = "User-Agent";
  private static final String VIDEOS_SUFFIX = "/videos";
  private static String defaultBatchApplicationId;
  private static volatile String userAgent;
  private static Pattern versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
  private String batchEntryDependsOn;
  private String batchEntryName;
  private boolean batchEntryOmitResultOnSuccess = true;
  private Request.Callback callback;
  private GraphObject graphObject;
  private String graphPath;
  private HttpMethod httpMethod;
  private String overriddenURL;
  private Bundle parameters;
  private Session session;
  private boolean skipClientToken = false;
  private Object tag;
  private String version;

  public Request()
  {
    this(null, null, null, null, null);
  }

  public Request(Session paramSession, String paramString)
  {
    this(paramSession, paramString, null, null, null);
  }

  public Request(Session paramSession, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod)
  {
    this(paramSession, paramString, paramBundle, paramHttpMethod, null);
  }

  public Request(Session paramSession, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod, Request.Callback paramCallback)
  {
    this(paramSession, paramString, paramBundle, paramHttpMethod, paramCallback, null);
  }

  public Request(Session paramSession, String paramString1, Bundle paramBundle, HttpMethod paramHttpMethod, Request.Callback paramCallback, String paramString2)
  {
    this.session = paramSession;
    this.graphPath = paramString1;
    this.callback = paramCallback;
    this.version = paramString2;
    setHttpMethod(paramHttpMethod);
    if (paramBundle != null);
    for (this.parameters = new Bundle(paramBundle); ; this.parameters = new Bundle())
    {
      if (this.version == null)
        this.version = ServerProtocol.getAPIVersion();
      return;
    }
  }

  Request(Session paramSession, URL paramURL)
  {
    this.session = paramSession;
    this.overriddenURL = paramURL.toString();
    setHttpMethod(HttpMethod.GET);
    this.parameters = new Bundle();
  }

  private void addCommonParameters()
  {
    if (this.session != null)
    {
      if (!this.session.isOpened())
        throw new FacebookException("Session provided to a Request in un-opened state.");
      if (!this.parameters.containsKey("access_token"))
      {
        String str4 = this.session.getAccessToken();
        Logger.registerAccessToken(str4);
        this.parameters.putString("access_token", str4);
      }
    }
    while (true)
    {
      this.parameters.putString("sdk", "android");
      this.parameters.putString("format", "json");
      return;
      if ((!this.skipClientToken) && (!this.parameters.containsKey("access_token")))
      {
        String str1 = Settings.getApplicationId();
        String str2 = Settings.getClientToken();
        if ((!Utility.isNullOrEmpty(str1)) && (!Utility.isNullOrEmpty(str2)))
        {
          String str3 = str1 + "|" + str2;
          this.parameters.putString("access_token", str3);
        }
      }
    }
  }

  private String appendParametersToBaseUrl(String paramString)
  {
    Uri.Builder localBuilder = new Uri.Builder().encodedPath(paramString);
    Iterator localIterator = this.parameters.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = this.parameters.get(str);
      if (localObject == null)
        localObject = "";
      if (isSupportedParameterType(localObject))
      {
        localBuilder.appendQueryParameter(str, parameterToString(localObject).toString());
      }
      else if (this.httpMethod == HttpMethod.GET)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localObject.getClass().getSimpleName();
        throw new IllegalArgumentException(String.format("Unsupported parameter type for GET request: %s", arrayOfObject));
      }
    }
    return localBuilder.toString();
  }

  static HttpURLConnection createConnection(URL paramURL)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
    localHttpURLConnection.setRequestProperty("User-Agent", getUserAgent());
    localHttpURLConnection.setRequestProperty("Content-Type", getMimeContentType());
    localHttpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
    localHttpURLConnection.setChunkedStreamingMode(0);
    return localHttpURLConnection;
  }

  public static Response executeAndWait(Request paramRequest)
  {
    List localList = executeBatchAndWait(new Request[] { paramRequest });
    if ((localList == null) || (localList.size() != 1))
      throw new FacebookException("invalid state: expected a single response");
    return (Response)localList.get(0);
  }

  public static List<Response> executeBatchAndWait(RequestBatch paramRequestBatch)
  {
    Validate.notEmptyAndContainsNoNulls(paramRequestBatch, "requests");
    try
    {
      HttpURLConnection localHttpURLConnection = toHttpConnection(paramRequestBatch);
      return executeConnectionAndWait(localHttpURLConnection, paramRequestBatch);
    }
    catch (Exception localException)
    {
      List localList = Response.constructErrorResponses(paramRequestBatch.getRequests(), null, new FacebookException(localException));
      runCallbacks(paramRequestBatch, localList);
      return localList;
    }
  }

  public static List<Response> executeBatchAndWait(Collection<Request> paramCollection)
  {
    return executeBatchAndWait(new RequestBatch(paramCollection));
  }

  public static List<Response> executeBatchAndWait(Request[] paramArrayOfRequest)
  {
    Validate.notNull(paramArrayOfRequest, "requests");
    return executeBatchAndWait(Arrays.asList(paramArrayOfRequest));
  }

  public static RequestAsyncTask executeBatchAsync(RequestBatch paramRequestBatch)
  {
    Validate.notEmptyAndContainsNoNulls(paramRequestBatch, "requests");
    RequestAsyncTask localRequestAsyncTask = new RequestAsyncTask(paramRequestBatch);
    localRequestAsyncTask.executeOnSettingsExecutor();
    return localRequestAsyncTask;
  }

  public static RequestAsyncTask executeBatchAsync(Collection<Request> paramCollection)
  {
    return executeBatchAsync(new RequestBatch(paramCollection));
  }

  public static RequestAsyncTask executeBatchAsync(Request[] paramArrayOfRequest)
  {
    Validate.notNull(paramArrayOfRequest, "requests");
    return executeBatchAsync(Arrays.asList(paramArrayOfRequest));
  }

  public static List<Response> executeConnectionAndWait(HttpURLConnection paramHttpURLConnection, RequestBatch paramRequestBatch)
  {
    List localList = Response.fromHttpConnection(paramHttpURLConnection, paramRequestBatch);
    Utility.disconnectQuietly(paramHttpURLConnection);
    int i = paramRequestBatch.size();
    if (i != localList.size())
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localList.size());
      arrayOfObject[1] = Integer.valueOf(i);
      throw new FacebookException(String.format("Received %d responses while expecting %d", arrayOfObject));
    }
    runCallbacks(paramRequestBatch, localList);
    HashSet localHashSet = new HashSet();
    Iterator localIterator1 = paramRequestBatch.iterator();
    while (localIterator1.hasNext())
    {
      Request localRequest = (Request)localIterator1.next();
      if (localRequest.session != null)
        localHashSet.add(localRequest.session);
    }
    Iterator localIterator2 = localHashSet.iterator();
    while (localIterator2.hasNext())
      ((Session)localIterator2.next()).extendAccessTokenIfNeeded();
    return localList;
  }

  public static List<Response> executeConnectionAndWait(HttpURLConnection paramHttpURLConnection, Collection<Request> paramCollection)
  {
    return executeConnectionAndWait(paramHttpURLConnection, new RequestBatch(paramCollection));
  }

  public static RequestAsyncTask executeConnectionAsync(Handler paramHandler, HttpURLConnection paramHttpURLConnection, RequestBatch paramRequestBatch)
  {
    Validate.notNull(paramHttpURLConnection, "connection");
    RequestAsyncTask localRequestAsyncTask = new RequestAsyncTask(paramHttpURLConnection, paramRequestBatch);
    paramRequestBatch.setCallbackHandler(paramHandler);
    localRequestAsyncTask.executeOnSettingsExecutor();
    return localRequestAsyncTask;
  }

  public static RequestAsyncTask executeConnectionAsync(HttpURLConnection paramHttpURLConnection, RequestBatch paramRequestBatch)
  {
    return executeConnectionAsync(null, paramHttpURLConnection, paramRequestBatch);
  }

  @Deprecated
  public static RequestAsyncTask executeGraphPathRequestAsync(Session paramSession, String paramString, Request.Callback paramCallback)
  {
    return newGraphPathRequest(paramSession, paramString, paramCallback).executeAsync();
  }

  @Deprecated
  public static RequestAsyncTask executeMeRequestAsync(Session paramSession, Request.GraphUserCallback paramGraphUserCallback)
  {
    return newMeRequest(paramSession, paramGraphUserCallback).executeAsync();
  }

  @Deprecated
  public static RequestAsyncTask executeMyFriendsRequestAsync(Session paramSession, Request.GraphUserListCallback paramGraphUserListCallback)
  {
    return newMyFriendsRequest(paramSession, paramGraphUserListCallback).executeAsync();
  }

  @Deprecated
  public static RequestAsyncTask executePlacesSearchRequestAsync(Session paramSession, Location paramLocation, int paramInt1, int paramInt2, String paramString, Request.GraphPlaceListCallback paramGraphPlaceListCallback)
  {
    return newPlacesSearchRequest(paramSession, paramLocation, paramInt1, paramInt2, paramString, paramGraphPlaceListCallback).executeAsync();
  }

  @Deprecated
  public static RequestAsyncTask executePostRequestAsync(Session paramSession, String paramString, GraphObject paramGraphObject, Request.Callback paramCallback)
  {
    return newPostRequest(paramSession, paramString, paramGraphObject, paramCallback).executeAsync();
  }

  @Deprecated
  public static RequestAsyncTask executeStatusUpdateRequestAsync(Session paramSession, String paramString, Request.Callback paramCallback)
  {
    return newStatusUpdateRequest(paramSession, paramString, paramCallback).executeAsync();
  }

  @Deprecated
  public static RequestAsyncTask executeUploadPhotoRequestAsync(Session paramSession, Bitmap paramBitmap, Request.Callback paramCallback)
  {
    return newUploadPhotoRequest(paramSession, paramBitmap, paramCallback).executeAsync();
  }

  @Deprecated
  public static RequestAsyncTask executeUploadPhotoRequestAsync(Session paramSession, File paramFile, Request.Callback paramCallback)
  {
    return newUploadPhotoRequest(paramSession, paramFile, paramCallback).executeAsync();
  }

  private static String getBatchAppId(RequestBatch paramRequestBatch)
  {
    if (!Utility.isNullOrEmpty(paramRequestBatch.getBatchApplicationId()))
      return paramRequestBatch.getBatchApplicationId();
    Iterator localIterator = paramRequestBatch.iterator();
    while (localIterator.hasNext())
    {
      Session localSession = ((Request)localIterator.next()).session;
      if (localSession != null)
        return localSession.getApplicationId();
    }
    return defaultBatchApplicationId;
  }

  public static final String getDefaultBatchApplicationId()
  {
    return defaultBatchApplicationId;
  }

  private String getGraphPathWithVersion()
  {
    if (versionPattern.matcher(this.graphPath).matches())
      return this.graphPath;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.version;
    arrayOfObject[1] = this.graphPath;
    return String.format("%s/%s", arrayOfObject);
  }

  private static String getMimeContentType()
  {
    return String.format("multipart/form-data; boundary=%s", new Object[] { "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" });
  }

  private static String getUserAgent()
  {
    if (userAgent == null)
      userAgent = String.format("%s.%s", new Object[] { "FBAndroidSDK", "3.20.0" });
    return userAgent;
  }

  private static boolean hasOnProgressCallbacks(RequestBatch paramRequestBatch)
  {
    Iterator localIterator1 = paramRequestBatch.getCallbacks().iterator();
    while (localIterator1.hasNext())
      if (((RequestBatch.Callback)localIterator1.next() instanceof RequestBatch.OnProgressCallback))
        return true;
    Iterator localIterator2 = paramRequestBatch.iterator();
    while (localIterator2.hasNext())
      if ((((Request)localIterator2.next()).getCallback() instanceof Request.OnProgressCallback))
        return true;
    return false;
  }

  private static boolean isMeRequest(String paramString)
  {
    Matcher localMatcher = versionPattern.matcher(paramString);
    if (localMatcher.matches())
      paramString = localMatcher.group(1);
    return (paramString.startsWith("me/")) || (paramString.startsWith("/me/"));
  }

  private static boolean isSupportedAttachmentType(Object paramObject)
  {
    return ((paramObject instanceof Bitmap)) || ((paramObject instanceof byte[])) || ((paramObject instanceof ParcelFileDescriptor)) || ((paramObject instanceof Request.ParcelFileDescriptorWithMimeType));
  }

  private static boolean isSupportedParameterType(Object paramObject)
  {
    return ((paramObject instanceof String)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof Number)) || ((paramObject instanceof Date));
  }

  public static Request newCustomAudienceThirdPartyIdRequest(Session paramSession, Context paramContext, Request.Callback paramCallback)
  {
    return newCustomAudienceThirdPartyIdRequest(paramSession, paramContext, null, paramCallback);
  }

  public static Request newCustomAudienceThirdPartyIdRequest(Session paramSession, Context paramContext, String paramString, Request.Callback paramCallback)
  {
    if (paramSession == null);
    for (Session localSession = Session.getActiveSession(); ; localSession = paramSession)
    {
      if ((localSession != null) && (!localSession.isOpened()))
        localSession = null;
      if (paramString == null)
        if (localSession == null)
          break label55;
      label55: for (paramString = localSession.getApplicationId(); paramString == null; paramString = Utility.getMetadataApplicationId(paramContext))
        throw new FacebookException("Facebook App ID cannot be determined");
      String str1 = paramString + "/custom_audience_third_party_id";
      AttributionIdentifiers localAttributionIdentifiers = AttributionIdentifiers.getAttributionIdentifiers(paramContext);
      Bundle localBundle = new Bundle();
      if (localSession == null)
        if (localAttributionIdentifiers.getAttributionId() == null)
          break label182;
      label182: for (String str2 = localAttributionIdentifiers.getAttributionId(); ; str2 = localAttributionIdentifiers.getAndroidAdvertiserId())
      {
        if (localAttributionIdentifiers.getAttributionId() != null)
          localBundle.putString("udid", str2);
        if ((Settings.getLimitEventAndDataUsage(paramContext)) || (localAttributionIdentifiers.isTrackingLimited()))
          localBundle.putString("limit_event_usage", "1");
        return new Request(localSession, str1, localBundle, HttpMethod.GET, paramCallback);
      }
    }
  }

  public static Request newDeleteObjectRequest(Session paramSession, String paramString, Request.Callback paramCallback)
  {
    return new Request(paramSession, paramString, null, HttpMethod.DELETE, paramCallback);
  }

  public static Request newGraphPathRequest(Session paramSession, String paramString, Request.Callback paramCallback)
  {
    return new Request(paramSession, paramString, null, null, paramCallback);
  }

  public static Request newMeRequest(Session paramSession, Request.GraphUserCallback paramGraphUserCallback)
  {
    return new Request(paramSession, "me", null, null, new Request.Callback()
    {
      public final void onCompleted(Response paramAnonymousResponse)
      {
        if (Request.this != null)
          Request.this.onCompleted((GraphUser)paramAnonymousResponse.getGraphObjectAs(GraphUser.class), paramAnonymousResponse);
      }
    });
  }

  public static Request newMyFriendsRequest(Session paramSession, Request.GraphUserListCallback paramGraphUserListCallback)
  {
    return new Request(paramSession, "me/friends", null, null, new Request.Callback()
    {
      public final void onCompleted(Response paramAnonymousResponse)
      {
        if (Request.this != null)
          Request.this.onCompleted(Request.typedListFromResponse(paramAnonymousResponse, GraphUser.class), paramAnonymousResponse);
      }
    });
  }

  public static Request newPlacesSearchRequest(Session paramSession, Location paramLocation, int paramInt1, int paramInt2, String paramString, Request.GraphPlaceListCallback paramGraphPlaceListCallback)
  {
    if ((paramLocation == null) && (Utility.isNullOrEmpty(paramString)))
      throw new FacebookException("Either location or searchText must be specified.");
    Bundle localBundle = new Bundle(5);
    localBundle.putString("type", "place");
    localBundle.putInt("limit", paramInt2);
    if (paramLocation != null)
    {
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Double.valueOf(paramLocation.getLatitude());
      arrayOfObject[1] = Double.valueOf(paramLocation.getLongitude());
      localBundle.putString("center", String.format(localLocale, "%f,%f", arrayOfObject));
      localBundle.putInt("distance", paramInt1);
    }
    if (!Utility.isNullOrEmpty(paramString))
      localBundle.putString("q", paramString);
    Request.Callback local3 = new Request.Callback()
    {
      public final void onCompleted(Response paramAnonymousResponse)
      {
        if (Request.this != null)
          Request.this.onCompleted(Request.typedListFromResponse(paramAnonymousResponse, GraphPlace.class), paramAnonymousResponse);
      }
    };
    return new Request(paramSession, "search", localBundle, HttpMethod.GET, local3);
  }

  public static Request newPostOpenGraphActionRequest(Session paramSession, OpenGraphAction paramOpenGraphAction, Request.Callback paramCallback)
  {
    if (paramOpenGraphAction == null)
      throw new FacebookException("openGraphAction cannot be null");
    if (Utility.isNullOrEmpty(paramOpenGraphAction.getType()))
      throw new FacebookException("openGraphAction must have non-null 'type' property");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramOpenGraphAction.getType();
    return newPostRequest(paramSession, String.format("me/%s", arrayOfObject), paramOpenGraphAction, paramCallback);
  }

  public static Request newPostOpenGraphObjectRequest(Session paramSession, OpenGraphObject paramOpenGraphObject, Request.Callback paramCallback)
  {
    if (paramOpenGraphObject == null)
      throw new FacebookException("openGraphObject cannot be null");
    if (Utility.isNullOrEmpty(paramOpenGraphObject.getType()))
      throw new FacebookException("openGraphObject must have non-null 'type' property");
    if (Utility.isNullOrEmpty(paramOpenGraphObject.getTitle()))
      throw new FacebookException("openGraphObject must have non-null 'title' property");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramOpenGraphObject.getType();
    String str = String.format("me/objects/%s", arrayOfObject);
    Bundle localBundle = new Bundle();
    localBundle.putString("object", paramOpenGraphObject.getInnerJSONObject().toString());
    return new Request(paramSession, str, localBundle, HttpMethod.POST, paramCallback);
  }

  public static Request newPostOpenGraphObjectRequest(Session paramSession, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, GraphObject paramGraphObject, Request.Callback paramCallback)
  {
    OpenGraphObject localOpenGraphObject = OpenGraphObject.Factory.createForPost(OpenGraphObject.class, paramString1, paramString2, paramString3, paramString4, paramString5);
    if (paramGraphObject != null)
      localOpenGraphObject.setData(paramGraphObject);
    return newPostOpenGraphObjectRequest(paramSession, localOpenGraphObject, paramCallback);
  }

  public static Request newPostRequest(Session paramSession, String paramString, GraphObject paramGraphObject, Request.Callback paramCallback)
  {
    Request localRequest = new Request(paramSession, paramString, null, HttpMethod.POST, paramCallback);
    localRequest.graphObject = paramGraphObject;
    return localRequest;
  }

  public static Request newStatusUpdateRequest(Session paramSession, String paramString, Request.Callback paramCallback)
  {
    return newStatusUpdateRequest(paramSession, paramString, null, null, paramCallback);
  }

  public static Request newStatusUpdateRequest(Session paramSession, String paramString, GraphPlace paramGraphPlace, List<GraphUser> paramList, Request.Callback paramCallback)
  {
    if (paramList != null)
    {
      localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        localArrayList.add(((GraphUser)localIterator.next()).getId());
    }
    ArrayList localArrayList = null;
    if (paramGraphPlace == null);
    for (String str = null; ; str = paramGraphPlace.getId())
      return newStatusUpdateRequest(paramSession, paramString, str, localArrayList, paramCallback);
  }

  private static Request newStatusUpdateRequest(Session paramSession, String paramString1, String paramString2, List<String> paramList, Request.Callback paramCallback)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("message", paramString1);
    if (paramString2 != null)
      localBundle.putString("place", paramString2);
    if ((paramList != null) && (paramList.size() > 0))
      localBundle.putString("tags", TextUtils.join(",", paramList));
    return new Request(paramSession, "me/feed", localBundle, HttpMethod.POST, paramCallback);
  }

  public static Request newUpdateOpenGraphObjectRequest(Session paramSession, OpenGraphObject paramOpenGraphObject, Request.Callback paramCallback)
  {
    if (paramOpenGraphObject == null)
      throw new FacebookException("openGraphObject cannot be null");
    String str = paramOpenGraphObject.getId();
    if (str == null)
      throw new FacebookException("openGraphObject must have an id");
    Bundle localBundle = new Bundle();
    localBundle.putString("object", paramOpenGraphObject.getInnerJSONObject().toString());
    return new Request(paramSession, str, localBundle, HttpMethod.POST, paramCallback);
  }

  public static Request newUpdateOpenGraphObjectRequest(Session paramSession, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, GraphObject paramGraphObject, Request.Callback paramCallback)
  {
    OpenGraphObject localOpenGraphObject = OpenGraphObject.Factory.createForPost(OpenGraphObject.class, null, paramString2, paramString3, paramString4, paramString5);
    localOpenGraphObject.setId(paramString1);
    localOpenGraphObject.setData(paramGraphObject);
    return newUpdateOpenGraphObjectRequest(paramSession, localOpenGraphObject, paramCallback);
  }

  public static Request newUploadPhotoRequest(Session paramSession, Bitmap paramBitmap, Request.Callback paramCallback)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("picture", paramBitmap);
    return new Request(paramSession, "me/photos", localBundle, HttpMethod.POST, paramCallback);
  }

  public static Request newUploadPhotoRequest(Session paramSession, File paramFile, Request.Callback paramCallback)
  {
    ParcelFileDescriptor localParcelFileDescriptor = ParcelFileDescriptor.open(paramFile, 268435456);
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("picture", localParcelFileDescriptor);
    return new Request(paramSession, "me/photos", localBundle, HttpMethod.POST, paramCallback);
  }

  public static Request newUploadStagingResourceWithImageRequest(Session paramSession, Bitmap paramBitmap, Request.Callback paramCallback)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("file", paramBitmap);
    return new Request(paramSession, "me/staging_resources", localBundle, HttpMethod.POST, paramCallback);
  }

  public static Request newUploadStagingResourceWithImageRequest(Session paramSession, File paramFile, Request.Callback paramCallback)
  {
    Request.ParcelFileDescriptorWithMimeType localParcelFileDescriptorWithMimeType = new Request.ParcelFileDescriptorWithMimeType(ParcelFileDescriptor.open(paramFile, 268435456), "image/png");
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("file", localParcelFileDescriptorWithMimeType);
    return new Request(paramSession, "me/staging_resources", localBundle, HttpMethod.POST, paramCallback);
  }

  public static Request newUploadVideoRequest(Session paramSession, File paramFile, Request.Callback paramCallback)
  {
    ParcelFileDescriptor localParcelFileDescriptor = ParcelFileDescriptor.open(paramFile, 268435456);
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable(paramFile.getName(), localParcelFileDescriptor);
    return new Request(paramSession, "me/videos", localBundle, HttpMethod.POST, paramCallback);
  }

  private static String parameterToString(Object paramObject)
  {
    if ((paramObject instanceof String))
      return (String)paramObject;
    if (((paramObject instanceof Boolean)) || ((paramObject instanceof Number)))
      return paramObject.toString();
    if ((paramObject instanceof Date))
      return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(paramObject);
    throw new IllegalArgumentException("Unsupported parameter type.");
  }

  private static void processGraphObject(GraphObject paramGraphObject, String paramString, Request.KeyValueSerializer paramKeyValueSerializer)
  {
    int m;
    if (isMeRequest(paramString))
    {
      int j = paramString.indexOf(":");
      int k = paramString.indexOf("?");
      if ((j > 3) && ((k == -1) || (j < k)))
        m = 1;
    }
    for (int i = m; ; i = 0)
    {
      Iterator localIterator = paramGraphObject.asMap().entrySet().iterator();
      label68: if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if ((i != 0) && (((String)localEntry.getKey()).equalsIgnoreCase("image")));
        for (boolean bool = true; ; bool = false)
        {
          processGraphObjectProperty((String)localEntry.getKey(), localEntry.getValue(), paramKeyValueSerializer, bool);
          break label68;
          m = 0;
          break;
        }
      }
      return;
    }
  }

  private static void processGraphObjectProperty(String paramString, Object paramObject, Request.KeyValueSerializer paramKeyValueSerializer, boolean paramBoolean)
  {
    Class localClass1 = paramObject.getClass();
    Class localClass2;
    Object localObject;
    if (GraphObject.class.isAssignableFrom(localClass1))
    {
      JSONObject localJSONObject2 = ((GraphObject)paramObject).getInnerJSONObject();
      localClass2 = localJSONObject2.getClass();
      localObject = localJSONObject2;
    }
    while (true)
    {
      JSONObject localJSONObject1;
      if (JSONObject.class.isAssignableFrom(localClass2))
      {
        localJSONObject1 = (JSONObject)localObject;
        if (paramBoolean)
        {
          Iterator localIterator = localJSONObject1.keys();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            processGraphObjectProperty(String.format("%s[%s]", new Object[] { paramString, str }), localJSONObject1.opt(str), paramKeyValueSerializer, paramBoolean);
          }
          if (GraphObjectList.class.isAssignableFrom(localClass1))
          {
            JSONArray localJSONArray2 = ((GraphObjectList)paramObject).getInnerJSONArray();
            localClass2 = localJSONArray2.getClass();
            localObject = localJSONArray2;
          }
        }
        else if (localJSONObject1.has("id"))
        {
          processGraphObjectProperty(paramString, localJSONObject1.optString("id"), paramKeyValueSerializer, paramBoolean);
        }
      }
      else
      {
        do
        {
          while (true)
          {
            return;
            if (localJSONObject1.has("url"))
            {
              processGraphObjectProperty(paramString, localJSONObject1.optString("url"), paramKeyValueSerializer, paramBoolean);
              return;
            }
            if (localJSONObject1.has("fbsdk:create_object"))
            {
              processGraphObjectProperty(paramString, localJSONObject1.toString(), paramKeyValueSerializer, paramBoolean);
              return;
              if (!JSONArray.class.isAssignableFrom(localClass2))
                break;
              JSONArray localJSONArray1 = (JSONArray)localObject;
              int i = localJSONArray1.length();
              for (int j = 0; j < i; j++)
              {
                Object[] arrayOfObject = new Object[2];
                arrayOfObject[0] = paramString;
                arrayOfObject[1] = Integer.valueOf(j);
                processGraphObjectProperty(String.format("%s[%d]", arrayOfObject), localJSONArray1.opt(j), paramKeyValueSerializer, paramBoolean);
              }
            }
          }
          if ((String.class.isAssignableFrom(localClass2)) || (Number.class.isAssignableFrom(localClass2)) || (Boolean.class.isAssignableFrom(localClass2)))
          {
            paramKeyValueSerializer.writeString(paramString, localObject.toString());
            return;
          }
        }
        while (!Date.class.isAssignableFrom(localClass2));
        Date localDate = (Date)localObject;
        paramKeyValueSerializer.writeString(paramString, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(localDate));
        return;
        localClass2 = localClass1;
        localObject = paramObject;
      }
    }
  }

  private static void processRequest(RequestBatch paramRequestBatch, Logger paramLogger, int paramInt, URL paramURL, OutputStream paramOutputStream)
  {
    Request.Serializer localSerializer = new Request.Serializer(paramOutputStream, paramLogger);
    if (paramInt == 1)
    {
      Request localRequest = paramRequestBatch.get(0);
      HashMap localHashMap2 = new HashMap();
      Iterator localIterator = localRequest.parameters.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        Object localObject = localRequest.parameters.get(str2);
        if (isSupportedAttachmentType(localObject))
          localHashMap2.put(str2, new Request.Attachment(localRequest, localObject));
      }
      if (paramLogger != null)
        paramLogger.append("  Parameters:\n");
      serializeParameters(localRequest.parameters, localSerializer, localRequest);
      if (paramLogger != null)
        paramLogger.append("  Attachments:\n");
      serializeAttachments(localHashMap2, localSerializer);
      if (localRequest.graphObject != null)
        processGraphObject(localRequest.graphObject, paramURL.getPath(), localSerializer);
      return;
    }
    String str1 = getBatchAppId(paramRequestBatch);
    if (Utility.isNullOrEmpty(str1))
      throw new FacebookException("At least one request in a batch must have an open Session, or a default app ID must be specified.");
    localSerializer.writeString("batch_app_id", str1);
    HashMap localHashMap1 = new HashMap();
    serializeRequestsAsJSON(localSerializer, paramRequestBatch, localHashMap1);
    if (paramLogger != null)
      paramLogger.append("  Attachments:\n");
    serializeAttachments(localHashMap1, localSerializer);
  }

  static void runCallbacks(final RequestBatch paramRequestBatch, List<Response> paramList)
  {
    int i = paramRequestBatch.size();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      Request localRequest = paramRequestBatch.get(j);
      if (localRequest.callback != null)
        localArrayList.add(new Pair(localRequest.callback, paramList.get(j)));
    }
    Runnable local4;
    Handler localHandler;
    if (localArrayList.size() > 0)
    {
      local4 = new Runnable()
      {
        public final void run()
        {
          Iterator localIterator1 = Request.this.iterator();
          while (localIterator1.hasNext())
          {
            Pair localPair = (Pair)localIterator1.next();
            ((Request.Callback)localPair.first).onCompleted((Response)localPair.second);
          }
          Iterator localIterator2 = paramRequestBatch.getCallbacks().iterator();
          while (localIterator2.hasNext())
            ((RequestBatch.Callback)localIterator2.next()).onBatchCompleted(paramRequestBatch);
        }
      };
      localHandler = paramRequestBatch.getCallbackHandler();
      if (localHandler == null)
        local4.run();
    }
    else
    {
      return;
    }
    localHandler.post(local4);
  }

  private static void serializeAttachments(Map<String, Request.Attachment> paramMap, Request.Serializer paramSerializer)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Request.Attachment localAttachment = (Request.Attachment)paramMap.get(str);
      if (isSupportedAttachmentType(localAttachment.getValue()))
        paramSerializer.writeObject(str, localAttachment.getValue(), localAttachment.getRequest());
    }
  }

  private static void serializeParameters(Bundle paramBundle, Request.Serializer paramSerializer, Request paramRequest)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if (isSupportedParameterType(localObject))
        paramSerializer.writeObject(str, localObject, paramRequest);
    }
  }

  private static void serializeRequestsAsJSON(Request.Serializer paramSerializer, Collection<Request> paramCollection, Map<String, Request.Attachment> paramMap)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      ((Request)localIterator.next()).serializeToBatch(localJSONArray, paramMap);
    paramSerializer.writeRequestsAsJson("batch", localJSONArray, paramCollection);
  }

  private void serializeToBatch(JSONArray paramJSONArray, Map<String, Request.Attachment> paramMap)
  {
    JSONObject localJSONObject = new JSONObject();
    if (this.batchEntryName != null)
    {
      localJSONObject.put("name", this.batchEntryName);
      localJSONObject.put("omit_response_on_success", this.batchEntryOmitResultOnSuccess);
    }
    if (this.batchEntryDependsOn != null)
      localJSONObject.put("depends_on", this.batchEntryDependsOn);
    String str1 = getUrlForBatchedRequest();
    localJSONObject.put("relative_url", str1);
    localJSONObject.put("method", this.httpMethod);
    if (this.session != null)
      Logger.registerAccessToken(this.session.getAccessToken());
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator = this.parameters.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      Object localObject = this.parameters.get(str2);
      if (isSupportedAttachmentType(localObject))
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = "file";
        arrayOfObject[1] = Integer.valueOf(paramMap.size());
        String str3 = String.format("%s%d", arrayOfObject);
        localArrayList1.add(str3);
        paramMap.put(str3, new Request.Attachment(this, localObject));
      }
    }
    if (!localArrayList1.isEmpty())
      localJSONObject.put("attached_files", TextUtils.join(",", localArrayList1));
    if (this.graphObject != null)
    {
      final ArrayList localArrayList2 = new ArrayList();
      processGraphObject(this.graphObject, str1, new Request.KeyValueSerializer()
      {
        public void writeString(String paramAnonymousString1, String paramAnonymousString2)
        {
          ArrayList localArrayList = localArrayList2;
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = paramAnonymousString1;
          arrayOfObject[1] = URLEncoder.encode(paramAnonymousString2, "UTF-8");
          localArrayList.add(String.format("%s=%s", arrayOfObject));
        }
      });
      localJSONObject.put("body", TextUtils.join("&", localArrayList2));
    }
    paramJSONArray.put(localJSONObject);
  }

  // ERROR //
  static final void serializeToUrlConnection(RequestBatch paramRequestBatch, HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: new 244	com/facebook/internal/Logger
    //   3: dup
    //   4: getstatic 1062	com/facebook/LoggingBehavior:REQUESTS	Lcom/facebook/LoggingBehavior;
    //   7: ldc_w 1064
    //   10: invokespecial 1067	com/facebook/internal/Logger:<init>	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V
    //   13: astore_2
    //   14: aload_0
    //   15: invokevirtual 456	com/facebook/RequestBatch:size	()I
    //   18: istore_3
    //   19: iload_3
    //   20: iconst_1
    //   21: if_icmpne +127 -> 148
    //   24: aload_0
    //   25: iconst_0
    //   26: invokevirtual 929	com/facebook/RequestBatch:get	(I)Lcom/facebook/Request;
    //   29: getfield 317	com/facebook/Request:httpMethod	Lcom/facebook/HttpMethod;
    //   32: astore 4
    //   34: aload_1
    //   35: aload 4
    //   37: invokevirtual 1069	com/facebook/HttpMethod:name	()Ljava/lang/String;
    //   40: invokevirtual 1072	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   43: aload_1
    //   44: invokevirtual 1076	java/net/HttpURLConnection:getURL	()Ljava/net/URL;
    //   47: astore 5
    //   49: aload_2
    //   50: ldc_w 1078
    //   53: invokevirtual 947	com/facebook/internal/Logger:append	(Ljava/lang/String;)V
    //   56: aload_2
    //   57: ldc_w 1080
    //   60: aload_0
    //   61: invokevirtual 1081	com/facebook/RequestBatch:getId	()Ljava/lang/String;
    //   64: invokevirtual 1085	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   67: aload_2
    //   68: ldc_w 1087
    //   71: aload 5
    //   73: invokevirtual 1085	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   76: aload_2
    //   77: ldc_w 1089
    //   80: aload_1
    //   81: invokevirtual 1092	java/net/HttpURLConnection:getRequestMethod	()Ljava/lang/String;
    //   84: invokevirtual 1085	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   87: aload_2
    //   88: ldc 106
    //   90: aload_1
    //   91: ldc 106
    //   93: invokevirtual 1095	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   96: invokevirtual 1085	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   99: aload_2
    //   100: ldc 44
    //   102: aload_1
    //   103: ldc 44
    //   105: invokevirtual 1095	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   108: invokevirtual 1085	com/facebook/internal/Logger:appendKeyValue	(Ljava/lang/String;Ljava/lang/Object;)V
    //   111: aload_1
    //   112: aload_0
    //   113: invokevirtual 1098	com/facebook/RequestBatch:getTimeout	()I
    //   116: invokevirtual 1101	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   119: aload_1
    //   120: aload_0
    //   121: invokevirtual 1098	com/facebook/RequestBatch:getTimeout	()I
    //   124: invokevirtual 1104	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   127: aload 4
    //   129: getstatic 749	com/facebook/HttpMethod:POST	Lcom/facebook/HttpMethod;
    //   132: if_acmpne +24 -> 156
    //   135: iconst_1
    //   136: istore 6
    //   138: iload 6
    //   140: ifne +22 -> 162
    //   143: aload_2
    //   144: invokevirtual 1107	com/facebook/internal/Logger:log	()V
    //   147: return
    //   148: getstatic 749	com/facebook/HttpMethod:POST	Lcom/facebook/HttpMethod;
    //   151: astore 4
    //   153: goto -119 -> 34
    //   156: iconst_0
    //   157: istore 6
    //   159: goto -21 -> 138
    //   162: aload_1
    //   163: iconst_1
    //   164: invokevirtual 1111	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   167: aload_0
    //   168: invokestatic 1113	com/facebook/Request:hasOnProgressCallbacks	(Lcom/facebook/RequestBatch;)Z
    //   171: ifeq +90 -> 261
    //   174: new 1115	com/facebook/ProgressNoopOutputStream
    //   177: dup
    //   178: aload_0
    //   179: invokevirtual 988	com/facebook/RequestBatch:getCallbackHandler	()Landroid/os/Handler;
    //   182: invokespecial 1117	com/facebook/ProgressNoopOutputStream:<init>	(Landroid/os/Handler;)V
    //   185: astore 9
    //   187: aload_0
    //   188: aconst_null
    //   189: iload_3
    //   190: aload 5
    //   192: aload 9
    //   194: invokestatic 1119	com/facebook/Request:processRequest	(Lcom/facebook/RequestBatch;Lcom/facebook/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;)V
    //   197: aload 9
    //   199: invokevirtual 1122	com/facebook/ProgressNoopOutputStream:getMaxProgress	()I
    //   202: istore 10
    //   204: aload 9
    //   206: invokevirtual 1125	com/facebook/ProgressNoopOutputStream:getProgressMap	()Ljava/util/Map;
    //   209: astore 11
    //   211: new 1127	com/facebook/ProgressOutputStream
    //   214: dup
    //   215: new 1129	java/io/BufferedOutputStream
    //   218: dup
    //   219: aload_1
    //   220: invokevirtual 1133	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   223: invokespecial 1136	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   226: aload_0
    //   227: aload 11
    //   229: iload 10
    //   231: i2l
    //   232: invokespecial 1139	com/facebook/ProgressOutputStream:<init>	(Ljava/io/OutputStream;Lcom/facebook/RequestBatch;Ljava/util/Map;J)V
    //   235: astore 12
    //   237: aload 12
    //   239: astore 8
    //   241: aload_0
    //   242: aload_2
    //   243: iload_3
    //   244: aload 5
    //   246: aload 8
    //   248: invokestatic 1119	com/facebook/Request:processRequest	(Lcom/facebook/RequestBatch;Lcom/facebook/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;)V
    //   251: aload 8
    //   253: invokevirtual 1144	java/io/OutputStream:close	()V
    //   256: aload_2
    //   257: invokevirtual 1107	com/facebook/internal/Logger:log	()V
    //   260: return
    //   261: new 1129	java/io/BufferedOutputStream
    //   264: dup
    //   265: aload_1
    //   266: invokevirtual 1133	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   269: invokespecial 1136	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   272: astore 8
    //   274: goto -33 -> 241
    //   277: astore 7
    //   279: aconst_null
    //   280: astore 8
    //   282: aload 8
    //   284: ifnull +8 -> 292
    //   287: aload 8
    //   289: invokevirtual 1144	java/io/OutputStream:close	()V
    //   292: aload 7
    //   294: athrow
    //   295: astore 7
    //   297: goto -15 -> 282
    //
    // Exception table:
    //   from	to	target	type
    //   167	237	277	finally
    //   261	274	277	finally
    //   241	251	295	finally
  }

  public static final void setDefaultBatchApplicationId(String paramString)
  {
    defaultBatchApplicationId = paramString;
  }

  // ERROR //
  public static HttpURLConnection toHttpConnection(RequestBatch paramRequestBatch)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 456	com/facebook/RequestBatch:size	()I
    //   4: iconst_1
    //   5: if_icmpne +34 -> 39
    //   8: new 196	java/net/URL
    //   11: dup
    //   12: aload_0
    //   13: iconst_0
    //   14: invokevirtual 929	com/facebook/RequestBatch:get	(I)Lcom/facebook/Request;
    //   17: invokevirtual 1154	com/facebook/Request:getUrlForSingleRequest	()Ljava/lang/String;
    //   20: invokespecial 1155	java/net/URL:<init>	(Ljava/lang/String;)V
    //   23: astore_2
    //   24: aload_2
    //   25: invokestatic 1157	com/facebook/Request:createConnection	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   28: astore 5
    //   30: aload_0
    //   31: aload 5
    //   33: invokestatic 1159	com/facebook/Request:serializeToUrlConnection	(Lcom/facebook/RequestBatch;Ljava/net/HttpURLConnection;)V
    //   36: aload 5
    //   38: areturn
    //   39: new 196	java/net/URL
    //   42: dup
    //   43: invokestatic 1162	com/facebook/internal/ServerProtocol:getGraphUrlBase	()Ljava/lang/String;
    //   46: invokespecial 1155	java/net/URL:<init>	(Ljava/lang/String;)V
    //   49: astore_2
    //   50: goto -26 -> 24
    //   53: astore_1
    //   54: new 230	com/facebook/FacebookException
    //   57: dup
    //   58: ldc_w 1164
    //   61: aload_1
    //   62: invokespecial 1167	com/facebook/FacebookException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   65: athrow
    //   66: astore 4
    //   68: new 230	com/facebook/FacebookException
    //   71: dup
    //   72: ldc_w 1169
    //   75: aload 4
    //   77: invokespecial 1167	com/facebook/FacebookException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   80: athrow
    //   81: astore_3
    //   82: new 230	com/facebook/FacebookException
    //   85: dup
    //   86: ldc_w 1169
    //   89: aload_3
    //   90: invokespecial 1167	com/facebook/FacebookException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   93: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	24	53	java/net/MalformedURLException
    //   39	50	53	java/net/MalformedURLException
    //   24	36	66	java/io/IOException
    //   24	36	81	org/json/JSONException
  }

  public static HttpURLConnection toHttpConnection(Collection<Request> paramCollection)
  {
    Validate.notEmptyAndContainsNoNulls(paramCollection, "requests");
    return toHttpConnection(new RequestBatch(paramCollection));
  }

  public static HttpURLConnection toHttpConnection(Request[] paramArrayOfRequest)
  {
    return toHttpConnection(Arrays.asList(paramArrayOfRequest));
  }

  private static <T extends GraphObject> List<T> typedListFromResponse(Response paramResponse, Class<T> paramClass)
  {
    GraphMultiResult localGraphMultiResult = (GraphMultiResult)paramResponse.getGraphObjectAs(GraphMultiResult.class);
    if (localGraphMultiResult == null)
      return null;
    GraphObjectList localGraphObjectList = localGraphMultiResult.getData();
    if (localGraphObjectList == null)
      return null;
    return localGraphObjectList.castToListOf(paramClass);
  }

  public final Response executeAndWait()
  {
    return executeAndWait(this);
  }

  public final RequestAsyncTask executeAsync()
  {
    return executeBatchAsync(new Request[] { this });
  }

  public final String getBatchEntryDependsOn()
  {
    return this.batchEntryDependsOn;
  }

  public final String getBatchEntryName()
  {
    return this.batchEntryName;
  }

  public final boolean getBatchEntryOmitResultOnSuccess()
  {
    return this.batchEntryOmitResultOnSuccess;
  }

  public final Request.Callback getCallback()
  {
    return this.callback;
  }

  public final GraphObject getGraphObject()
  {
    return this.graphObject;
  }

  public final String getGraphPath()
  {
    return this.graphPath;
  }

  public final HttpMethod getHttpMethod()
  {
    return this.httpMethod;
  }

  public final Bundle getParameters()
  {
    return this.parameters;
  }

  public final Session getSession()
  {
    return this.session;
  }

  public final Object getTag()
  {
    return this.tag;
  }

  final String getUrlForBatchedRequest()
  {
    if (this.overriddenURL != null)
      throw new FacebookException("Can't override URL for a batch request");
    String str = getGraphPathWithVersion();
    addCommonParameters();
    return appendParametersToBaseUrl(str);
  }

  final String getUrlForSingleRequest()
  {
    if (this.overriddenURL != null)
      return this.overriddenURL.toString();
    if ((getHttpMethod() == HttpMethod.POST) && (this.graphPath != null) && (this.graphPath.endsWith("/videos")));
    for (String str1 = ServerProtocol.getGraphVideoUrlBase(); ; str1 = ServerProtocol.getGraphUrlBase())
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str1;
      arrayOfObject[1] = getGraphPathWithVersion();
      String str2 = String.format("%s/%s", arrayOfObject);
      addCommonParameters();
      return appendParametersToBaseUrl(str2);
    }
  }

  public final String getVersion()
  {
    return this.version;
  }

  public final void setBatchEntryDependsOn(String paramString)
  {
    this.batchEntryDependsOn = paramString;
  }

  public final void setBatchEntryName(String paramString)
  {
    this.batchEntryName = paramString;
  }

  public final void setBatchEntryOmitResultOnSuccess(boolean paramBoolean)
  {
    this.batchEntryOmitResultOnSuccess = paramBoolean;
  }

  public final void setCallback(Request.Callback paramCallback)
  {
    this.callback = paramCallback;
  }

  public final void setGraphObject(GraphObject paramGraphObject)
  {
    this.graphObject = paramGraphObject;
  }

  public final void setGraphPath(String paramString)
  {
    this.graphPath = paramString;
  }

  public final void setHttpMethod(HttpMethod paramHttpMethod)
  {
    if ((this.overriddenURL != null) && (paramHttpMethod != HttpMethod.GET))
      throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    if (paramHttpMethod != null);
    while (true)
    {
      this.httpMethod = paramHttpMethod;
      return;
      paramHttpMethod = HttpMethod.GET;
    }
  }

  public final void setParameters(Bundle paramBundle)
  {
    this.parameters = paramBundle;
  }

  public final void setSession(Session paramSession)
  {
    this.session = paramSession;
  }

  public final void setSkipClientToken(boolean paramBoolean)
  {
    this.skipClientToken = paramBoolean;
  }

  public final void setTag(Object paramObject)
  {
    this.tag = paramObject;
  }

  public final void setVersion(String paramString)
  {
    this.version = paramString;
  }

  public String toString()
  {
    return "{Request: " + " session: " + this.session + ", graphPath: " + this.graphPath + ", graphObject: " + this.graphObject + ", httpMethod: " + this.httpMethod + ", parameters: " + this.parameters + "}";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.Request
 * JD-Core Version:    0.6.2
 */