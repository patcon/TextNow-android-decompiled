package com.facebook.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.model.GraphObject;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class Utility
{
  private static final String APPLICATION_FIELDS = "fields";
  private static final String[] APP_SETTING_FIELDS = { "supports_attribution", "supports_implicit_sdk_logging" };
  public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
  private static final String HASH_ALGORITHM_MD5 = "MD5";
  private static final String HASH_ALGORITHM_SHA1 = "SHA-1";
  static final String LOG_TAG = "FacebookSDK";
  private static final String SUPPORTS_ATTRIBUTION = "supports_attribution";
  private static final String SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
  private static final String URL_SCHEME = "https";
  private static Map<String, Utility.FetchedAppSettings> fetchedAppSettings = new ConcurrentHashMap();

  public static <T> boolean areObjectsEqual(T paramT1, T paramT2)
  {
    if (paramT1 == null)
      return paramT2 == null;
    return paramT1.equals(paramT2);
  }

  public static <T> ArrayList<T> arrayList(T[] paramArrayOfT)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfT.length);
    int i = paramArrayOfT.length;
    for (int j = 0; j < i; j++)
      localArrayList.add(paramArrayOfT[j]);
    return localArrayList;
  }

  public static <T> List<T> asListNoNulls(T[] paramArrayOfT)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfT.length;
    for (int j = 0; j < i; j++)
    {
      T ? = paramArrayOfT[j];
      if (? != null)
        localArrayList.add(?);
    }
    return localArrayList;
  }

  public static Uri buildUri(String paramString1, String paramString2, Bundle paramBundle)
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("https");
    localBuilder.authority(paramString1);
    localBuilder.path(paramString2);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if ((localObject instanceof String))
        localBuilder.appendQueryParameter(str, (String)localObject);
    }
    return localBuilder.build();
  }

  public static void clearCaches(Context paramContext)
  {
    ImageDownloader.clearCache(paramContext);
  }

  private static void clearCookiesForDomain(Context paramContext, String paramString)
  {
    CookieSyncManager.createInstance(paramContext).sync();
    CookieManager localCookieManager = CookieManager.getInstance();
    String str = localCookieManager.getCookie(paramString);
    if (str == null)
      return;
    String[] arrayOfString1 = str.split(";");
    int i = arrayOfString1.length;
    for (int j = 0; j < i; j++)
    {
      String[] arrayOfString2 = arrayOfString1[j].split("=");
      if (arrayOfString2.length > 0)
        localCookieManager.setCookie(paramString, arrayOfString2[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
    }
    localCookieManager.removeExpiredCookie();
  }

  public static void clearFacebookCookies(Context paramContext)
  {
    clearCookiesForDomain(paramContext, "facebook.com");
    clearCookiesForDomain(paramContext, ".facebook.com");
    clearCookiesForDomain(paramContext, "https://facebook.com");
    clearCookiesForDomain(paramContext, "https://.facebook.com");
  }

  public static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  static Map<String, Object> convertJSONObjectToHashMap(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    JSONArray localJSONArray = paramJSONObject.names();
    int i = 0;
    while (true)
    {
      if (i < localJSONArray.length());
      try
      {
        String str = localJSONArray.getString(i);
        Object localObject = paramJSONObject.get(str);
        if ((localObject instanceof JSONObject))
          localObject = convertJSONObjectToHashMap((JSONObject)localObject);
        localHashMap.put(str, localObject);
        label65: i++;
        continue;
        return localHashMap;
      }
      catch (JSONException localJSONException)
      {
        break label65;
      }
    }
  }

  public static void deleteDirectory(File paramFile)
  {
    if (!paramFile.exists())
      return;
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
        deleteDirectory(arrayOfFile[j]);
    }
    paramFile.delete();
  }

  public static void disconnectQuietly(URLConnection paramURLConnection)
  {
    if ((paramURLConnection instanceof HttpURLConnection))
      ((HttpURLConnection)paramURLConnection).disconnect();
  }

  public static String getHashedDeviceAndAppID(Context paramContext, String paramString)
  {
    String str = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
    if (str == null)
      return null;
    return sha1hash(str + paramString);
  }

  public static String getMetadataApplicationId(Context paramContext)
  {
    Validate.notNull(paramContext, "context");
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if (localApplicationInfo.metaData != null)
      {
        String str = localApplicationInfo.metaData.getString("com.facebook.sdk.ApplicationId");
        return str;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  public static Object getStringPropertyAsJSON(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    Object localObject1 = paramJSONObject.opt(paramString1);
    if ((localObject1 != null) && ((localObject1 instanceof String)));
    for (Object localObject2 = new JSONTokener((String)localObject1).nextValue(); ; localObject2 = localObject1)
    {
      if ((localObject2 != null) && (!(localObject2 instanceof JSONObject)) && (!(localObject2 instanceof JSONArray)))
      {
        if (paramString2 != null)
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.putOpt(paramString2, localObject2);
          return localJSONObject;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
      }
      return localObject2;
    }
  }

  private static String hashWithAlgorithm(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(paramString1);
      localMessageDigest.update(paramString2.getBytes());
      byte[] arrayOfByte = localMessageDigest.digest();
      localStringBuilder = new StringBuilder();
      int i = arrayOfByte.length;
      for (int j = 0; j < i; j++)
      {
        int k = arrayOfByte[j];
        localStringBuilder.append(Integer.toHexString(0xF & k >> 4));
        localStringBuilder.append(Integer.toHexString(0xF & k >> 0));
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      return null;
    }
    return localStringBuilder.toString();
  }

  public static boolean isNullOrEmpty(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }

  public static <T> boolean isNullOrEmpty(Collection<T> paramCollection)
  {
    return (paramCollection == null) || (paramCollection.size() == 0);
  }

  public static <T> boolean isSubset(Collection<T> paramCollection1, Collection<T> paramCollection2)
  {
    if ((paramCollection2 == null) || (paramCollection2.size() == 0))
    {
      boolean bool;
      if (paramCollection1 != null)
      {
        int i = paramCollection1.size();
        bool = false;
        if (i != 0);
      }
      else
      {
        bool = true;
      }
      return bool;
    }
    HashSet localHashSet = new HashSet(paramCollection2);
    Iterator localIterator = paramCollection1.iterator();
    while (localIterator.hasNext())
      if (!localHashSet.contains(localIterator.next()))
        return false;
    return true;
  }

  public static void logd(String paramString, Exception paramException)
  {
  }

  public static void logd(String paramString1, String paramString2)
  {
  }

  static String md5hash(String paramString)
  {
    return hashWithAlgorithm("MD5", paramString);
  }

  public static void putObjectInBundle(Bundle paramBundle, String paramString, Object paramObject)
  {
    if ((paramObject instanceof String))
    {
      paramBundle.putString(paramString, (String)paramObject);
      return;
    }
    if ((paramObject instanceof Parcelable))
    {
      paramBundle.putParcelable(paramString, (Parcelable)paramObject);
      return;
    }
    if ((paramObject instanceof byte[]))
    {
      paramBundle.putByteArray(paramString, (byte[])paramObject);
      return;
    }
    throw new FacebookException("attempted to add unsupported type to Bundle");
  }

  public static Utility.FetchedAppSettings queryAppSettings(String paramString, boolean paramBoolean)
  {
    if ((!paramBoolean) && (fetchedAppSettings.containsKey(paramString)))
      return (Utility.FetchedAppSettings)fetchedAppSettings.get(paramString);
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", TextUtils.join(",", APP_SETTING_FIELDS));
    Request localRequest = Request.newGraphPathRequest(null, paramString, null);
    localRequest.setParameters(localBundle);
    GraphObject localGraphObject = localRequest.executeAndWait().getGraphObject();
    Utility.FetchedAppSettings localFetchedAppSettings = new Utility.FetchedAppSettings(safeGetBooleanFromResponse(localGraphObject, "supports_attribution"), safeGetBooleanFromResponse(localGraphObject, "supports_implicit_sdk_logging"), null);
    fetchedAppSettings.put(paramString, localFetchedAppSettings);
    return localFetchedAppSettings;
  }

  // ERROR //
  public static String readStreamToString(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 449	java/io/BufferedInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 452	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   8: astore_1
    //   9: new 454	java/io/InputStreamReader
    //   12: dup
    //   13: aload_1
    //   14: invokespecial 455	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   17: astore_2
    //   18: new 154	java/lang/StringBuilder
    //   21: dup
    //   22: invokespecial 155	java/lang/StringBuilder:<init>	()V
    //   25: astore_3
    //   26: sipush 2048
    //   29: newarray char
    //   31: astore 6
    //   33: aload_2
    //   34: aload 6
    //   36: invokevirtual 459	java/io/InputStreamReader:read	([C)I
    //   39: istore 7
    //   41: iload 7
    //   43: iconst_m1
    //   44: if_icmpeq +33 -> 77
    //   47: aload_3
    //   48: aload 6
    //   50: iconst_0
    //   51: iload 7
    //   53: invokevirtual 462	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: goto -24 -> 33
    //   60: astore 4
    //   62: aload_1
    //   63: astore 5
    //   65: aload 5
    //   67: invokestatic 464	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   70: aload_2
    //   71: invokestatic 464	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   74: aload 4
    //   76: athrow
    //   77: aload_3
    //   78: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: astore 9
    //   83: aload_1
    //   84: invokestatic 464	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   87: aload_2
    //   88: invokestatic 464	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   91: aload 9
    //   93: areturn
    //   94: astore 4
    //   96: aconst_null
    //   97: astore_2
    //   98: aconst_null
    //   99: astore 5
    //   101: goto -36 -> 65
    //   104: astore 4
    //   106: aload_1
    //   107: astore 5
    //   109: aconst_null
    //   110: astore_2
    //   111: goto -46 -> 65
    //
    // Exception table:
    //   from	to	target	type
    //   18	33	60	finally
    //   33	41	60	finally
    //   47	57	60	finally
    //   77	83	60	finally
    //   0	9	94	finally
    //   9	18	104	finally
  }

  private static boolean safeGetBooleanFromResponse(GraphObject paramGraphObject, String paramString)
  {
    Object localObject = Boolean.valueOf(false);
    if (paramGraphObject != null)
      localObject = paramGraphObject.getProperty(paramString);
    if (!(localObject instanceof Boolean))
      localObject = Boolean.valueOf(false);
    return ((Boolean)localObject).booleanValue();
  }

  public static void setAppEventAttributionParameters(GraphObject paramGraphObject, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramString1 != null)
    {
      paramGraphObject.setProperty("attribution", paramString1);
      if (paramBoolean)
        break label53;
    }
    label53: for (boolean bool = true; ; bool = false)
    {
      paramGraphObject.setProperty("application_tracking_enabled", Boolean.valueOf(bool));
      return;
      if (paramString2 == null)
        break;
      paramGraphObject.setProperty("advertiser_id", paramString2);
      break;
    }
  }

  private static String sha1hash(String paramString)
  {
    return hashWithAlgorithm("SHA-1", paramString);
  }

  public static boolean stringsEqualOrEmpty(String paramString1, String paramString2)
  {
    boolean bool1 = TextUtils.isEmpty(paramString1);
    boolean bool2 = TextUtils.isEmpty(paramString2);
    if ((bool1) && (bool2))
      return true;
    if ((!bool1) && (!bool2))
      return paramString1.equals(paramString2);
    return false;
  }

  public static <T> Collection<T> unmodifiableCollection(T[] paramArrayOfT)
  {
    return Collections.unmodifiableCollection(Arrays.asList(paramArrayOfT));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.Utility
 * JD-Core Version:    0.6.2
 */