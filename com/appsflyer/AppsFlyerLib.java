package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLib extends BroadcastReceiver
{
  static final String AF_COUNTER_PREF = "appsFlyerCount";
  protected static final String AF_SHARED_PREF = "appsflyer-data";
  private static final String ANDROID_ID_CACHED_PREF = "androidIdCached";
  public static final String APPS_TRACKING_URL = "https://track.appsflyer.com/api/v2.3/androidevent?buildnumber=1.13&app_id=";
  public static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
  public static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
  static final String ATTRIBUTION_ID_PREF = "attributionId";
  private static final String CACHED_CHANNEL_PREF = "CACHED_CHANNEL";
  private static final String CACHED_URL_PARAMTER = "&isCachedRequest=true";
  private static final String CALL_SERVER_ACTION = "call server.";
  private static final String DEEPLINK_ATTR_PREF = "deeplinkAttribution";
  private static final String ERROR_PREFIX = "ERROR:";
  static final String FIRST_INSTALL_PREF = "appsFlyerFirstInstall";
  private static final List<String> IGNORABLE_KEYS = Arrays.asList(new String[] { "is_cache" });
  private static final String IMEI_CACHED_PREF = "imeiCached";
  private static final String INSTALL_STORE_PREF = "INSTALL_STORE";
  private static final String INSTALL_UPDATE_DATE_FORMAT = "yyyy-MM-dd_hhmmZ";
  public static final String LOG_TAG = "AppsFlyer_1.13";
  private static final String ON_RECIEVE_CALLED = "onRecieve called. refferer=";
  private static final String PREPARE_DATA_ACTION = "collect data for server";
  private static final String PRE_INSTALL_PREF = "preInstallName";
  protected static final String REFERRER_PREF = "referrer";
  public static final String SDK_BUILD_NUMBER = "1.13";
  static final String SENT_SUCCESSFULLY_PREF = "sentSuccessfully";
  public static final String SERVER_BUILD_NUMBER = "2.3";
  private static final String SERVER_RESPONDED_ACTION = "response from server. status=";
  private static final String UNINSTALL_URL = "https://track.appsflyer.com/api/v2.3/uninsall?buildnumber=1.13";
  private static final String WARNING_PREFIX = "WARNING:";
  private static ScheduledExecutorService cacheScheduler = null;
  private static AppsFlyerConversionListener conversionDataListener = null;
  private static boolean isDuringCheckCache = false;
  private static long lastCacheCheck;

  private static void addAdvertiserIDData(Context paramContext, Map<String, String> paramMap)
  {
    try
    {
      Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
      AdvertisingIdClient.Info localInfo = AdvertisingIdClient.getAdvertisingIdInfo(paramContext);
      String str3 = localInfo.getId();
      paramMap.put("advertiserId", str3);
      if (!localInfo.isLimitAdTrackingEnabled());
      for (boolean bool = true; ; bool = false)
      {
        String str4 = Boolean.toString(bool);
        paramMap.put("advertiserIdEnabled", str4);
        AppsFlyerProperties.getInstance().set("advertiserId", str3);
        AppsFlyerProperties.getInstance().set("advertiserIdEnabled", str4);
        return;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      shouldLog(paramContext);
      return;
    }
    catch (Exception localException)
    {
      String str1 = AppsFlyerProperties.getInstance().getString("advertiserId");
      if (str1 != null)
        paramMap.put("advertiserId", str1);
      String str2 = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
      if (str2 != null)
        paramMap.put("advertiserIdEnabled", str2);
      if (localException.getLocalizedMessage() == null)
        break label167;
    }
    localException.getLocalizedMessage();
    while (true)
    {
      debugAction("Could not fetch advertiser id: ", localException.getLocalizedMessage(), paramContext);
      return;
      label167: localException.toString();
    }
  }

  private static void addDeviceTracking(Context paramContext, Map<String, String> paramMap)
  {
    if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false))
      paramMap.put("deviceTrackingDisabled", "true");
    while (true)
    {
      return;
      SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("appsflyer-data", 0);
      boolean bool1 = AppsFlyerProperties.getInstance().getBoolean("collectIMEI", true);
      String str1 = localSharedPreferences.getString("imeiCached", null);
      if (bool1);
      try
      {
        TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
        String str3 = (String)localTelephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(localTelephonyManager, new Object[0]);
        label111: Object localObject;
        if (str3 == null)
        {
          str3 = str1;
          if (str3 != null)
            paramMap.put("imei", str3);
          label128: boolean bool2 = AppsFlyerProperties.getInstance().getBoolean("collectAndroidId", true);
          localObject = localSharedPreferences.getString("androidIdCached", null);
          if (!bool2)
            continue;
        }
        while (true)
        {
          String str2;
          try
          {
            str2 = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
            if (str2 != null)
              break label248;
            if (localObject == null)
              break;
            paramMap.put("android_id", localObject);
            return;
          }
          catch (Exception localException1)
          {
            return;
          }
          if (str1 != null)
            break label111;
          SharedPreferences.Editor localEditor2 = localSharedPreferences.edit();
          localEditor2.putString("imeiCached", str3);
          if (Build.VERSION.SDK_INT >= 9)
          {
            localEditor2.apply();
            break label111;
          }
          localEditor2.commit();
          break label111;
          label248: SharedPreferences.Editor localEditor1 = localSharedPreferences.edit();
          localEditor1.putString("androidIdCached", str2);
          if (Build.VERSION.SDK_INT >= 9)
          {
            localEditor1.apply();
            localObject = str2;
          }
          else
          {
            localEditor1.commit();
            localObject = str2;
          }
        }
      }
      catch (Exception localException2)
      {
        break label128;
      }
    }
  }

  private static Map<String, String> attributionStringToMap(String paramString)
  {
    HashMap localHashMap = new HashMap();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!IGNORABLE_KEYS.contains(str))
          localHashMap.put(str, localJSONObject.getString(str));
      }
    }
    catch (JSONException localJSONException)
    {
      return null;
    }
    return localHashMap;
  }

  // ERROR //
  private static void callServer(URL paramURL, String paramString1, String paramString2, WeakReference<Context> paramWeakReference, String paramString3, String paramString4, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual 381	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   4: checkcast 268	android/content/Context
    //   7: astore 7
    //   9: aload_0
    //   10: invokevirtual 387	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   13: checkcast 389	java/net/HttpURLConnection
    //   16: astore 9
    //   18: aload 9
    //   20: ldc_w 391
    //   23: invokevirtual 394	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   26: aload_1
    //   27: invokevirtual 398	java/lang/String:getBytes	()[B
    //   30: arraylength
    //   31: istore 10
    //   33: aload 9
    //   35: ldc_w 400
    //   38: new 402	java/lang/StringBuilder
    //   41: dup
    //   42: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   45: iload 10
    //   47: invokevirtual 407	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   50: ldc_w 409
    //   53: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: invokevirtual 416	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   62: aload 9
    //   64: ldc_w 418
    //   67: ldc_w 420
    //   70: invokevirtual 416	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   73: aload 9
    //   75: sipush 10000
    //   78: invokevirtual 424	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   81: aload 9
    //   83: iconst_1
    //   84: invokevirtual 428	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   87: new 430	java/io/OutputStreamWriter
    //   90: dup
    //   91: aload 9
    //   93: invokevirtual 434	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   96: invokespecial 437	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   99: astore 11
    //   101: aload 11
    //   103: aload_1
    //   104: invokevirtual 440	java/io/OutputStreamWriter:write	(Ljava/lang/String;)V
    //   107: aload 11
    //   109: invokevirtual 442	java/io/OutputStreamWriter:close	()V
    //   112: aload 9
    //   114: invokevirtual 446	java/net/HttpURLConnection:getResponseCode	()I
    //   117: istore 13
    //   119: aload 7
    //   121: invokestatic 187	com/appsflyer/AppsFlyerLib:shouldLog	(Landroid/content/Context;)Z
    //   124: ifeq +25 -> 149
    //   127: new 402	java/lang/StringBuilder
    //   130: dup
    //   131: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   134: ldc_w 448
    //   137: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: iload 13
    //   142: invokevirtual 407	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   145: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: pop
    //   149: aload 7
    //   151: aload 5
    //   153: ldc_w 450
    //   156: iload 13
    //   158: invokestatic 455	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   161: invokestatic 459	com/appsflyer/AppsFlyerLib:monitor	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   164: ldc 82
    //   166: iload 13
    //   168: invokestatic 455	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   171: aload 7
    //   173: invokestatic 255	com/appsflyer/AppsFlyerLib:debugAction	(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    //   176: aload 7
    //   178: ldc 11
    //   180: iconst_0
    //   181: invokevirtual 272	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   184: astore 14
    //   186: iload 13
    //   188: sipush 200
    //   191: if_icmpne +65 -> 256
    //   194: aload 4
    //   196: ifnull +13 -> 209
    //   199: invokestatic 464	com/appsflyer/cache/CacheManager:getInstance	()Lcom/appsflyer/cache/CacheManager;
    //   202: aload 4
    //   204: aload 7
    //   206: invokevirtual 468	com/appsflyer/cache/CacheManager:deleteRequest	(Ljava/lang/String;Landroid/content/Context;)V
    //   209: aload_3
    //   210: invokevirtual 381	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   213: ifnull +43 -> 256
    //   216: aload 4
    //   218: ifnonnull +38 -> 256
    //   221: aload 14
    //   223: invokeinterface 324 1 0
    //   228: astore 20
    //   230: aload 20
    //   232: ldc 76
    //   234: ldc_w 266
    //   237: invokeinterface 330 3 0
    //   242: pop
    //   243: aload 20
    //   245: invokeinterface 342 1 0
    //   250: pop
    //   251: aload 7
    //   253: invokestatic 472	com/appsflyer/AppsFlyerLib:checkCache	(Landroid/content/Context;)V
    //   256: aload 14
    //   258: ldc 25
    //   260: aconst_null
    //   261: invokeinterface 279 3 0
    //   266: ifnonnull +90 -> 356
    //   269: aload_2
    //   270: ifnull +86 -> 356
    //   273: iload 6
    //   275: ifeq +81 -> 356
    //   278: invokestatic 477	java/util/concurrent/Executors:newSingleThreadScheduledExecutor	()Ljava/util/concurrent/ScheduledExecutorService;
    //   281: astore 18
    //   283: aload 18
    //   285: new 479	com/appsflyer/AppsFlyerLib$AttributionIdFetcher
    //   288: dup
    //   289: aload 7
    //   291: invokevirtual 483	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   294: aload_2
    //   295: aload 18
    //   297: invokespecial 486	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:<init>	(Landroid/content/Context;Ljava/lang/String;Ljava/util/concurrent/ScheduledExecutorService;)V
    //   300: ldc2_w 487
    //   303: getstatic 494	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   306: invokeinterface 500 5 0
    //   311: pop
    //   312: aload 9
    //   314: ifnull +8 -> 322
    //   317: aload 9
    //   319: invokevirtual 503	java/net/HttpURLConnection:disconnect	()V
    //   322: return
    //   323: astore 12
    //   325: aconst_null
    //   326: astore 11
    //   328: aload 11
    //   330: ifnull +8 -> 338
    //   333: aload 11
    //   335: invokevirtual 442	java/io/OutputStreamWriter:close	()V
    //   338: aload 12
    //   340: athrow
    //   341: astore 8
    //   343: aload 9
    //   345: ifnull +8 -> 353
    //   348: aload 9
    //   350: invokevirtual 503	java/net/HttpURLConnection:disconnect	()V
    //   353: aload 8
    //   355: athrow
    //   356: aload_2
    //   357: ifnull -45 -> 312
    //   360: iload 6
    //   362: ifeq -50 -> 312
    //   365: getstatic 122	com/appsflyer/AppsFlyerLib:conversionDataListener	Lcom/appsflyer/AppsFlyerConversionListener;
    //   368: ifnull -56 -> 312
    //   371: aload 14
    //   373: ldc 25
    //   375: aconst_null
    //   376: invokeinterface 279 3 0
    //   381: ifnull -69 -> 312
    //   384: aload 7
    //   386: iconst_0
    //   387: invokestatic 163	com/appsflyer/AppsFlyerLib:getCounter	(Landroid/content/Context;Z)I
    //   390: istore 15
    //   392: iload 15
    //   394: iconst_1
    //   395: if_icmple -83 -> 312
    //   398: aload 7
    //   400: invokestatic 507	com/appsflyer/AppsFlyerLib:getConversionData	(Landroid/content/Context;)Ljava/util/Map;
    //   403: astore 17
    //   405: aload 17
    //   407: ifnull -95 -> 312
    //   410: getstatic 122	com/appsflyer/AppsFlyerLib:conversionDataListener	Lcom/appsflyer/AppsFlyerConversionListener;
    //   413: aload 17
    //   415: invokeinterface 513 2 0
    //   420: goto -108 -> 312
    //   423: astore 16
    //   425: goto -113 -> 312
    //   428: astore 8
    //   430: aconst_null
    //   431: astore 9
    //   433: goto -90 -> 343
    //   436: astore 12
    //   438: goto -110 -> 328
    //
    // Exception table:
    //   from	to	target	type
    //   87	101	323	finally
    //   18	87	341	finally
    //   107	149	341	finally
    //   149	186	341	finally
    //   199	209	341	finally
    //   209	216	341	finally
    //   221	256	341	finally
    //   256	269	341	finally
    //   278	312	341	finally
    //   333	338	341	finally
    //   338	341	341	finally
    //   365	392	341	finally
    //   398	405	341	finally
    //   410	420	341	finally
    //   398	405	423	com/appsflyer/AttributionIDNotReady
    //   410	420	423	com/appsflyer/AttributionIDNotReady
    //   9	18	428	finally
    //   101	107	436	finally
  }

  private static void checkCache(Context paramContext)
  {
    if ((isDuringCheckCache) || (System.currentTimeMillis() - lastCacheCheck < 15000L));
    while (cacheScheduler != null)
      return;
    ScheduledExecutorService localScheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    cacheScheduler = localScheduledExecutorService;
    localScheduledExecutorService.schedule(new AppsFlyerLib.CachedRequestSender(paramContext), 1L, TimeUnit.SECONDS);
  }

  private static void debugAction(String paramString1, String paramString2, Context paramContext)
  {
    if ((paramContext != null) && ("com.appsflyer".equals(paramContext.getPackageName())))
      DebugLogQueue.getInstance().push(paramString1 + paramString2);
  }

  private static String fixKeyNameToV3(String paramString)
  {
    if (paramString.equals("c"))
      paramString = "campaign";
    while (!paramString.equals("pid"))
      return paramString;
    return "media_source";
  }

  public static String getAppId()
  {
    return getProperty("appid");
  }

  public static String getAppUserId()
  {
    return getProperty("AppUserId");
  }

  public static String getAppsFlyerUID(Context paramContext)
  {
    return Installation.id(paramContext);
  }

  // ERROR //
  public static String getAttributionId(android.content.ContentResolver paramContentResolver)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 110	java/lang/String
    //   4: dup
    //   5: iconst_0
    //   6: ldc 20
    //   8: aastore
    //   9: astore_1
    //   10: aload_0
    //   11: getstatic 108	com/appsflyer/AppsFlyerLib:ATTRIBUTION_ID_CONTENT_URI	Landroid/net/Uri;
    //   14: aload_1
    //   15: aconst_null
    //   16: aconst_null
    //   17: aconst_null
    //   18: invokevirtual 576	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   21: astore_2
    //   22: aload_2
    //   23: ifnull +16 -> 39
    //   26: aload_2
    //   27: invokeinterface 581 1 0
    //   32: istore 9
    //   34: iload 9
    //   36: ifne +17 -> 53
    //   39: aconst_null
    //   40: astore_3
    //   41: aload_2
    //   42: ifnull +9 -> 51
    //   45: aload_2
    //   46: invokeinterface 582 1 0
    //   51: aload_3
    //   52: areturn
    //   53: aload_2
    //   54: aload_2
    //   55: ldc 20
    //   57: invokeinterface 586 2 0
    //   62: invokeinterface 588 2 0
    //   67: astore 10
    //   69: aload 10
    //   71: astore_3
    //   72: aload_2
    //   73: ifnull -22 -> 51
    //   76: aload_2
    //   77: invokeinterface 582 1 0
    //   82: aload_3
    //   83: areturn
    //   84: astore 11
    //   86: aload_3
    //   87: areturn
    //   88: astore 7
    //   90: aconst_null
    //   91: astore_3
    //   92: aload_2
    //   93: ifnull -42 -> 51
    //   96: aload_2
    //   97: invokeinterface 582 1 0
    //   102: aconst_null
    //   103: areturn
    //   104: astore 8
    //   106: aconst_null
    //   107: areturn
    //   108: astore 5
    //   110: aload_2
    //   111: ifnull +9 -> 120
    //   114: aload_2
    //   115: invokeinterface 582 1 0
    //   120: aload 5
    //   122: athrow
    //   123: astore 4
    //   125: aconst_null
    //   126: areturn
    //   127: astore 6
    //   129: goto -9 -> 120
    //
    // Exception table:
    //   from	to	target	type
    //   76	82	84	java/lang/Exception
    //   26	34	88	java/lang/Exception
    //   53	69	88	java/lang/Exception
    //   96	102	104	java/lang/Exception
    //   26	34	108	finally
    //   53	69	108	finally
    //   45	51	123	java/lang/Exception
    //   114	120	127	java/lang/Exception
  }

  private static String getCachedChannel(Context paramContext, String paramString)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("appsflyer-data", 0);
    if (localSharedPreferences.contains("CACHED_CHANNEL"))
      return localSharedPreferences.getString("CACHED_CHANNEL", null);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putString("CACHED_CHANNEL", paramString);
    localEditor.commit();
    return paramString;
  }

  private static String getCachedStore(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("appsflyer-data", 0);
    if (localSharedPreferences.contains("INSTALL_STORE"))
      return localSharedPreferences.getString("INSTALL_STORE", null);
    boolean bool = isAppsFlyerFirstLaunch(paramContext);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    String str = null;
    if (bool)
      str = getCurrentStore(paramContext);
    localEditor.putString("INSTALL_STORE", str);
    localEditor.commit();
    return str;
  }

  private static String getConfiguredChannel(Context paramContext)
  {
    Object localObject1 = AppsFlyerProperties.getInstance().getString("channel");
    if (localObject1 == null)
    {
      try
      {
        Bundle localBundle = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
        if (localBundle != null)
        {
          Object localObject2 = localBundle.get("CHANNEL");
          if (localObject2 != null)
            if ((localObject2 instanceof String))
            {
              localObject3 = (String)localObject2;
            }
            else
            {
              String str = localObject2.toString();
              localObject3 = str;
            }
        }
      }
      catch (Exception localException)
      {
        return localObject1;
      }
      Object localObject3 = localObject1;
      localObject1 = localObject3;
    }
    return localObject1;
  }

  public static Map<String, String> getConversionData(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("appsflyer-data", 0);
    String str1 = AppsFlyerProperties.getInstance().getReferrer(paramContext);
    if ((str1 != null) && (str1.length() > 0) && (str1.contains("af_tranid")))
      return referrerStringToMap(str1, paramContext);
    String str2 = localSharedPreferences.getString("attributionId", null);
    if ((str2 != null) && (str2.length() > 0))
      return attributionStringToMap(str2);
    throw new AttributionIDNotReady();
  }

  @Deprecated
  public static void getConversionData(Context paramContext, ConversionDataListener paramConversionDataListener)
  {
    registerConversionListener(paramContext, new AppsFlyerConversionListener()
    {
      public final void onAppOpenAttribution(Map<String, String> paramAnonymousMap)
      {
      }

      public final void onInstallConversionDataLoaded(Map<String, String> paramAnonymousMap)
      {
        AppsFlyerLib.this.onConversionDataLoaded(paramAnonymousMap);
      }

      public final void onInstallConversionFailure(String paramAnonymousString)
      {
        AppsFlyerLib.this.onConversionFailure(paramAnonymousString);
      }
    });
  }

  private static int getCounter(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("appsflyer-data", 0);
    int i = localSharedPreferences.getInt("appsFlyerCount", 0);
    if (paramBoolean)
    {
      i++;
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      localEditor.putInt("appsFlyerCount", i);
      localEditor.commit();
    }
    return i;
  }

  private static String getCurrentStore(Context paramContext)
  {
    try
    {
      Bundle localBundle = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
      if (localBundle != null)
      {
        Object localObject = localBundle.get("AF_STORE");
        if (localObject != null)
        {
          if ((localObject instanceof String))
            return (String)localObject;
          String str = localObject.toString();
          return str;
        }
      }
    }
    catch (Exception localException)
    {
      shouldLog(paramContext);
    }
    return null;
  }

  private static String getEventTag(Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("af_timestamp");
    if ((str == null) || (str.length() < 5))
      return "AppsFlyer_1.13";
    return "AppsFlyer_1.13-" + str.substring(4);
  }

  private static String getFirstInstallDate(SimpleDateFormat paramSimpleDateFormat, Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("appsflyer-data", 0);
    String str = localSharedPreferences.getString("appsFlyerFirstInstall", null);
    if (str == null)
    {
      if (!isAppsFlyerFirstLaunch(paramContext))
        break label103;
      shouldLog(paramContext);
    }
    label103: for (str = paramSimpleDateFormat.format(new Date()); ; str = "")
    {
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      localEditor.putString("appsFlyerFirstInstall", str);
      localEditor.commit();
      if (shouldLog(paramContext))
        new StringBuilder().append("AppsFlyer: first launch date: ").append(str).toString();
      return str;
    }
  }

  private static String getNetwork(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localConnectivityManager.getNetworkInfo(1).isConnectedOrConnecting())
      return "WIFI";
    if (localConnectivityManager.getNetworkInfo(0).isConnectedOrConnecting())
      return "MOBILE";
    return "unkown";
  }

  private static String getPreInstallName(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("appsflyer-data", 0);
    if (localSharedPreferences.contains("preInstallName"))
      return localSharedPreferences.getString("preInstallName", null);
    boolean bool = isAppsFlyerFirstLaunch(paramContext);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    Object localObject1 = null;
    if (bool);
    try
    {
      Bundle localBundle = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
      if (localBundle != null)
      {
        Object localObject2 = localBundle.get("AF_PRE_INSTALL_NAME");
        if (localObject2 != null)
        {
          if ((localObject2 instanceof String));
          String str;
          for (localObject3 = (String)localObject2; ; localObject3 = str)
          {
            localObject1 = localObject3;
            localEditor.putString("preInstallName", localObject1);
            localEditor.commit();
            return localObject1;
            str = localObject2.toString();
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        shouldLog(paramContext);
        localObject1 = null;
        continue;
        Object localObject3 = null;
      }
    }
  }

  public static String getProperty(String paramString)
  {
    return AppsFlyerProperties.getInstance().getString(paramString);
  }

  private static boolean isAppsFlyerFirstLaunch(Context paramContext)
  {
    boolean bool1 = paramContext.getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount");
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    return bool2;
  }

  public static boolean isPreInstalledApp(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 0).flags;
      int j = i & 0x1;
      boolean bool = false;
      if (j != 0)
        bool = true;
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  private static String mapToString(Map<String, String> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.keySet().iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = (String)paramMap.get(str1);
      if (str2 == null);
      for (String str3 = ""; ; str3 = URLEncoder.encode(str2, "UTF-8"))
      {
        if (localStringBuilder.length() > 0)
          localStringBuilder.append('&');
        localStringBuilder.append(str1).append('=').append(str3);
        break;
      }
    }
    return localStringBuilder.toString();
  }

  private static void monitor(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if (AppsFlyerProperties.getInstance().getBoolean("shouldMonitor", false))
    {
      Intent localIntent = new Intent("com.appsflyer.MonitorBroadcast");
      localIntent.setPackage("com.appsflyer.nightvision");
      localIntent.putExtra("message", paramString2);
      localIntent.putExtra("value", paramString3);
      localIntent.putExtra("packageName", "true");
      localIntent.putExtra("pid", new Integer(Process.myPid()));
      localIntent.putExtra("eventIdentifier", paramString1);
      localIntent.putExtra("sdk", "2.3.1.13");
      paramContext.sendBroadcast(localIntent);
    }
  }

  private static Map<String, String> referrerStringToMap(String paramString, Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    int i = paramString.indexOf('&');
    if ((i >= 0) && (paramString.length() > i + 1))
    {
      String[] arrayOfString1 = paramString.split("\\&");
      int j = arrayOfString1.length;
      int k = 0;
      if (k < j)
      {
        String[] arrayOfString2 = arrayOfString1[k].split("=");
        String str1 = fixKeyNameToV3(arrayOfString2[0]);
        if (arrayOfString2.length > 1);
        for (String str2 = arrayOfString2[1]; ; str2 = "")
        {
          localHashMap.put(str1, str2);
          k++;
          break;
        }
      }
    }
    try
    {
      if (!localHashMap.containsKey("install_time"))
      {
        long l = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).firstInstallTime;
        localHashMap.put("install_time", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(l)));
      }
      label174: if (!localHashMap.containsKey("af_status"))
        localHashMap.put("af_status", "Non-organic");
      return localHashMap;
    }
    catch (Exception localException)
    {
      break label174;
    }
  }

  public static void registerConversionListener(Context paramContext, AppsFlyerConversionListener paramAppsFlyerConversionListener)
  {
    if (paramAppsFlyerConversionListener == null)
      return;
    conversionDataListener = paramAppsFlyerConversionListener;
  }

  private static void runInBackground(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    ScheduledExecutorService localScheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    localScheduledExecutorService.schedule(new AppsFlyerLib.DataCollector(paramContext, paramString1, paramString2, paramString3, paramString4, localScheduledExecutorService, null), 5L, TimeUnit.MILLISECONDS);
  }

  private static void sendRequestToServer(String paramString1, String paramString2, String paramString3, WeakReference<Context> paramWeakReference, String paramString4, String paramString5, boolean paramBoolean)
  {
    URL localURL = new URL(paramString1);
    if (shouldLog((Context)paramWeakReference.get()))
      new StringBuilder().append("url: ").append(localURL.toString()).toString();
    debugAction("call server.", "\n" + localURL.toString() + "\nPOST:" + paramString2, (Context)paramWeakReference.get());
    if (shouldLog((Context)paramWeakReference.get()))
      new StringBuilder().append("data: ").append(paramString2).toString();
    monitor((Context)paramWeakReference.get(), paramString5, "EVENT_DATA", paramString2);
    if (paramBoolean)
      AppsFlyerProperties.getInstance().setLaunchCollectedReferrer();
    try
    {
      callServer(localURL, paramString2, paramString3, paramWeakReference, paramString4, paramString5, paramBoolean);
      return;
    }
    catch (IOException localIOException)
    {
      if (AppsFlyerProperties.getInstance().getBoolean("useHttpFallback", false))
      {
        debugAction("https failed: " + localIOException.getLocalizedMessage(), "", (Context)paramWeakReference.get());
        callServer(new URL(paramString1.replace("https:", "http:")), paramString2, paramString3, paramWeakReference, paramString4, paramString5, paramBoolean);
        return;
      }
      new StringBuilder().append("failed to send requeset to server. ").append(localIOException.getLocalizedMessage()).toString();
      monitor((Context)paramWeakReference.get(), paramString5, "ERROR", localIOException.getLocalizedMessage());
    }
  }

  public static void sendTracking(Context paramContext)
  {
    sendTrackingWithEvent(paramContext, null, null, null);
    if (shouldLog(paramContext))
      new StringBuilder().append("Start tracking package: ").append(paramContext.getPackageName()).toString();
  }

  @Deprecated
  public static void sendTracking(Context paramContext, String paramString)
  {
    sendTrackingWithEvent(paramContext, paramString, null, null);
  }

  public static void sendTrackingWithEvent(Context paramContext, String paramString1, String paramString2)
  {
    sendTrackingWithEvent(paramContext, null, paramString1, paramString2);
  }

  public static void sendTrackingWithEvent(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if ((paramString2 != null) && (paramString3 != null) && (paramString3.matches("-?\\d+(\\.\\d+)?")))
      new StringBuilder().append("AppsFLyer: numeric value '").append(paramString3).append("' for event '").append(paramString2).append("' will be categorized as a revenue event.").toString();
    String str = AppsFlyerProperties.getInstance().getReferrer(paramContext);
    if (str == null)
      str = "";
    runInBackground(paramContext, paramString1, paramString2, paramString3, str);
  }

  // ERROR //
  private static void sendTrackingWithEvent(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aload_2
    //   4: ifnonnull +1643 -> 1647
    //   7: iconst_1
    //   8: istore 6
    //   10: new 346	java/util/HashMap
    //   13: dup
    //   14: invokespecial 347	java/util/HashMap:<init>	()V
    //   17: astore 7
    //   19: aload 7
    //   21: ldc_w 662
    //   24: new 674	java/util/Date
    //   27: dup
    //   28: invokespecial 675	java/util/Date:<init>	()V
    //   31: invokevirtual 884	java/util/Date:getTime	()J
    //   34: invokestatic 889	java/lang/Long:toString	(J)Ljava/lang/String;
    //   37: invokeinterface 221 3 0
    //   42: pop
    //   43: aload 7
    //   45: invokestatic 158	com/appsflyer/AppsFlyerLib:getEventTag	(Ljava/util/Map;)Ljava/lang/String;
    //   48: astore 9
    //   50: aload_0
    //   51: invokestatic 187	com/appsflyer/AppsFlyerLib:shouldLog	(Landroid/content/Context;)Z
    //   54: ifeq +1567 -> 1621
    //   57: ldc 64
    //   59: ldc_w 409
    //   62: aload_0
    //   63: invokestatic 255	com/appsflyer/AppsFlyerLib:debugAction	(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    //   66: new 402	java/lang/StringBuilder
    //   69: dup
    //   70: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   73: ldc_w 891
    //   76: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: astore 105
    //   81: iload 6
    //   83: ifeq +1570 -> 1653
    //   86: ldc_w 893
    //   89: astore 106
    //   91: aload 105
    //   93: aload 106
    //   95: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: pop
    //   102: iload 6
    //   104: ifeq +1555 -> 1659
    //   107: ldc_w 893
    //   110: astore 108
    //   112: ldc_w 895
    //   115: aload 108
    //   117: aload_0
    //   118: invokestatic 255	com/appsflyer/AppsFlyerLib:debugAction	(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    //   121: goto +1500 -> 1621
    //   124: aload_0
    //   125: aload 9
    //   127: ldc_w 897
    //   130: aload 12
    //   132: invokestatic 459	com/appsflyer/AppsFlyerLib:monitor	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   135: invokestatic 464	com/appsflyer/cache/CacheManager:getInstance	()Lcom/appsflyer/cache/CacheManager;
    //   138: aload_0
    //   139: invokevirtual 900	com/appsflyer/cache/CacheManager:init	(Landroid/content/Context;)V
    //   142: aload_0
    //   143: invokevirtual 604	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   146: aload_0
    //   147: invokevirtual 533	android/content/Context:getPackageName	()Ljava/lang/String;
    //   150: sipush 4096
    //   153: invokevirtual 798	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   156: getfield 904	android/content/pm/PackageInfo:requestedPermissions	[Ljava/lang/String;
    //   159: invokestatic 118	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   162: astore 102
    //   164: aload 102
    //   166: ldc_w 906
    //   169: invokeinterface 371 2 0
    //   174: ifne +12 -> 186
    //   177: aload_0
    //   178: aconst_null
    //   179: ldc_w 908
    //   182: aconst_null
    //   183: invokestatic 459	com/appsflyer/AppsFlyerLib:monitor	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   186: aload 102
    //   188: ldc_w 910
    //   191: invokeinterface 371 2 0
    //   196: pop
    //   197: aload 102
    //   199: ldc_w 912
    //   202: invokeinterface 371 2 0
    //   207: pop
    //   208: new 402	java/lang/StringBuilder
    //   211: dup
    //   212: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   215: astore 14
    //   217: aload 14
    //   219: ldc 17
    //   221: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: aload_0
    //   225: invokevirtual 533	android/content/Context:getPackageName	()Ljava/lang/String;
    //   228: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: pop
    //   232: aload 7
    //   234: ldc_w 914
    //   237: getstatic 919	android/os/Build:BRAND	Ljava/lang/String;
    //   240: invokeinterface 221 3 0
    //   245: pop
    //   246: aload 7
    //   248: ldc_w 921
    //   251: getstatic 924	android/os/Build:DEVICE	Ljava/lang/String;
    //   254: invokeinterface 221 3 0
    //   259: pop
    //   260: aload 7
    //   262: ldc_w 926
    //   265: getstatic 929	android/os/Build:PRODUCT	Ljava/lang/String;
    //   268: invokeinterface 221 3 0
    //   273: pop
    //   274: aload 7
    //   276: ldc_w 769
    //   279: getstatic 336	android/os/Build$VERSION:SDK_INT	I
    //   282: invokestatic 455	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   285: invokeinterface 221 3 0
    //   290: pop
    //   291: aload 7
    //   293: ldc_w 931
    //   296: getstatic 934	android/os/Build:MODEL	Ljava/lang/String;
    //   299: invokeinterface 221 3 0
    //   304: pop
    //   305: aload 7
    //   307: ldc_w 936
    //   310: getstatic 939	android/os/Build:TYPE	Ljava/lang/String;
    //   313: invokeinterface 221 3 0
    //   318: pop
    //   319: invokestatic 238	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   322: ldc_w 941
    //   325: invokevirtual 246	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   328: astore 22
    //   330: aload 22
    //   332: ifnull +24 -> 356
    //   335: aload 22
    //   337: invokevirtual 629	java/lang/String:length	()I
    //   340: ifle +16 -> 356
    //   343: aload 7
    //   345: ldc_w 941
    //   348: aload 22
    //   350: invokeinterface 221 3 0
    //   355: pop
    //   356: aload_0
    //   357: invokestatic 177	com/appsflyer/AppsFlyerLib:getConfiguredChannel	(Landroid/content/Context;)Ljava/lang/String;
    //   360: astore 23
    //   362: aload_0
    //   363: aload 23
    //   365: invokestatic 182	com/appsflyer/AppsFlyerLib:getCachedChannel	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   368: astore 24
    //   370: aload 24
    //   372: ifnull +16 -> 388
    //   375: aload 7
    //   377: ldc_w 600
    //   380: aload 24
    //   382: invokeinterface 221 3 0
    //   387: pop
    //   388: aload 24
    //   390: ifnull +1244 -> 1634
    //   393: aload 24
    //   395: aload 23
    //   397: invokevirtual 536	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   400: ifeq +6 -> 406
    //   403: goto +1231 -> 1634
    //   406: aload 7
    //   408: ldc_w 943
    //   411: aload 23
    //   413: invokeinterface 221 3 0
    //   418: pop
    //   419: aload_0
    //   420: invokestatic 945	com/appsflyer/AppsFlyerLib:getCachedStore	(Landroid/content/Context;)Ljava/lang/String;
    //   423: astore 26
    //   425: aload 26
    //   427: ifnull +19 -> 446
    //   430: aload 7
    //   432: ldc_w 947
    //   435: aload 26
    //   437: invokevirtual 950	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   440: invokeinterface 221 3 0
    //   445: pop
    //   446: aload_0
    //   447: invokestatic 952	com/appsflyer/AppsFlyerLib:getPreInstallName	(Landroid/content/Context;)Ljava/lang/String;
    //   450: astore 28
    //   452: aload 28
    //   454: ifnull +19 -> 473
    //   457: aload 7
    //   459: ldc_w 954
    //   462: aload 28
    //   464: invokevirtual 950	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   467: invokeinterface 221 3 0
    //   472: pop
    //   473: aload_0
    //   474: invokestatic 598	com/appsflyer/AppsFlyerLib:getCurrentStore	(Landroid/content/Context;)Ljava/lang/String;
    //   477: astore 30
    //   479: aload 30
    //   481: ifnull +19 -> 500
    //   484: aload 7
    //   486: ldc_w 956
    //   489: aload 30
    //   491: invokevirtual 950	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   494: invokeinterface 221 3 0
    //   499: pop
    //   500: aload_1
    //   501: ifnull +10 -> 511
    //   504: aload_1
    //   505: invokevirtual 629	java/lang/String:length	()I
    //   508: ifne +10 -> 518
    //   511: ldc_w 958
    //   514: invokestatic 559	com/appsflyer/AppsFlyerLib:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   517: astore_1
    //   518: aload_1
    //   519: ifnull +150 -> 669
    //   522: aload_1
    //   523: invokevirtual 629	java/lang/String:length	()I
    //   526: ifle +143 -> 669
    //   529: aload 7
    //   531: ldc_w 960
    //   534: aload_1
    //   535: invokeinterface 221 3 0
    //   540: pop
    //   541: aload_1
    //   542: invokevirtual 629	java/lang/String:length	()I
    //   545: bipush 8
    //   547: if_icmple +21 -> 568
    //   550: aload 7
    //   552: ldc_w 962
    //   555: aload_1
    //   556: iconst_0
    //   557: bipush 8
    //   559: invokevirtual 965	java/lang/String:substring	(II)Ljava/lang/String;
    //   562: invokeinterface 221 3 0
    //   567: pop
    //   568: invokestatic 967	com/appsflyer/AppsFlyerLib:getAppUserId	()Ljava/lang/String;
    //   571: astore 33
    //   573: aload 33
    //   575: ifnull +16 -> 591
    //   578: aload 7
    //   580: ldc_w 969
    //   583: aload 33
    //   585: invokeinterface 221 3 0
    //   590: pop
    //   591: invokestatic 238	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   594: ldc_w 971
    //   597: invokevirtual 974	com/appsflyer/AppsFlyerProperties:getStringArray	(Ljava/lang/String;)[Ljava/lang/String;
    //   600: astore 35
    //   602: aload 35
    //   604: ifnull +847 -> 1451
    //   607: new 402	java/lang/StringBuilder
    //   610: dup
    //   611: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   614: astore 36
    //   616: aload 35
    //   618: arraylength
    //   619: istore 37
    //   621: iload 5
    //   623: iload 37
    //   625: if_icmpge +55 -> 680
    //   628: aload 35
    //   630: iload 5
    //   632: aaload
    //   633: astore 38
    //   635: aload 36
    //   637: invokevirtual 722	java/lang/StringBuilder:length	()I
    //   640: iconst_1
    //   641: if_icmple +11 -> 652
    //   644: aload 36
    //   646: bipush 44
    //   648: invokevirtual 725	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   651: pop
    //   652: aload 36
    //   654: aload 38
    //   656: invokestatic 979	com/appsflyer/HashUtils:toSHA1	(Ljava/lang/String;)Ljava/lang/String;
    //   659: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   662: pop
    //   663: iinc 5 1
    //   666: goto -45 -> 621
    //   669: aload_0
    //   670: aload 9
    //   672: ldc_w 981
    //   675: aconst_null
    //   676: invokestatic 459	com/appsflyer/AppsFlyerLib:monitor	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   679: return
    //   680: aload 7
    //   682: ldc_w 983
    //   685: aload 36
    //   687: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   690: invokeinterface 221 3 0
    //   695: pop
    //   696: aload_2
    //   697: ifnull +31 -> 728
    //   700: aload 7
    //   702: ldc_w 985
    //   705: aload_2
    //   706: invokeinterface 221 3 0
    //   711: pop
    //   712: aload_3
    //   713: ifnull +15 -> 728
    //   716: aload 7
    //   718: ldc_w 987
    //   721: aload_3
    //   722: invokeinterface 221 3 0
    //   727: pop
    //   728: ldc_w 556
    //   731: invokestatic 559	com/appsflyer/AppsFlyerLib:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   734: ifnull +20 -> 754
    //   737: aload 7
    //   739: ldc_w 556
    //   742: ldc_w 556
    //   745: invokestatic 559	com/appsflyer/AppsFlyerLib:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   748: invokeinterface 221 3 0
    //   753: pop
    //   754: ldc_w 989
    //   757: invokestatic 559	com/appsflyer/AppsFlyerLib:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   760: astore 44
    //   762: aload 44
    //   764: ifnull +53 -> 817
    //   767: aload 44
    //   769: invokevirtual 629	java/lang/String:length	()I
    //   772: iconst_3
    //   773: if_icmpeq +31 -> 804
    //   776: new 402	java/lang/StringBuilder
    //   779: dup
    //   780: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   783: ldc_w 991
    //   786: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   789: aload 44
    //   791: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   794: ldc_w 993
    //   797: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   800: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   803: pop
    //   804: aload 7
    //   806: ldc_w 995
    //   809: aload 44
    //   811: invokeinterface 221 3 0
    //   816: pop
    //   817: ldc_w 997
    //   820: invokestatic 559	com/appsflyer/AppsFlyerLib:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   823: astore 46
    //   825: aload 46
    //   827: ifnull +16 -> 843
    //   830: aload 7
    //   832: ldc_w 999
    //   835: aload 46
    //   837: invokeinterface 221 3 0
    //   842: pop
    //   843: aload 7
    //   845: ldc_w 1001
    //   848: aload_0
    //   849: invokestatic 1003	com/appsflyer/AppsFlyerLib:isPreInstalledApp	(Landroid/content/Context;)Z
    //   852: invokestatic 230	java/lang/Boolean:toString	(Z)Ljava/lang/String;
    //   855: invokeinterface 221 3 0
    //   860: pop
    //   861: aload_0
    //   862: invokevirtual 313	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   865: invokestatic 1005	com/appsflyer/AppsFlyerLib:getAttributionId	(Landroid/content/ContentResolver;)Ljava/lang/String;
    //   868: astore 49
    //   870: aload 49
    //   872: ifnull +16 -> 888
    //   875: aload 7
    //   877: ldc_w 1007
    //   880: aload 49
    //   882: invokeinterface 221 3 0
    //   887: pop
    //   888: aload_0
    //   889: aload 7
    //   891: invokestatic 1009	com/appsflyer/AppsFlyerLib:addDeviceTracking	(Landroid/content/Context;Ljava/util/Map;)V
    //   894: aload_0
    //   895: invokestatic 568	com/appsflyer/Installation:id	(Landroid/content/Context;)Ljava/lang/String;
    //   898: astore 93
    //   900: aload 93
    //   902: ifnull +16 -> 918
    //   905: aload 7
    //   907: ldc_w 1011
    //   910: aload 93
    //   912: invokeinterface 221 3 0
    //   917: pop
    //   918: aload 7
    //   920: ldc_w 1013
    //   923: invokestatic 1019	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   926: invokevirtual 1022	java/util/Locale:getDisplayLanguage	()Ljava/lang/String;
    //   929: invokeinterface 221 3 0
    //   934: pop
    //   935: aload_0
    //   936: ldc_w 281
    //   939: invokevirtual 285	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   942: checkcast 287	android/telephony/TelephonyManager
    //   945: astore 89
    //   947: aload 7
    //   949: ldc_w 1024
    //   952: aload 89
    //   954: invokevirtual 1027	android/telephony/TelephonyManager:getSimOperatorName	()Ljava/lang/String;
    //   957: invokeinterface 221 3 0
    //   962: pop
    //   963: aload 7
    //   965: ldc_w 1029
    //   968: aload 89
    //   970: invokevirtual 1032	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   973: invokeinterface 221 3 0
    //   978: pop
    //   979: aload 7
    //   981: ldc_w 1034
    //   984: aload_0
    //   985: invokestatic 1036	com/appsflyer/AppsFlyerLib:getNetwork	(Landroid/content/Context;)Ljava/lang/String;
    //   988: invokeinterface 221 3 0
    //   993: pop
    //   994: aload_0
    //   995: aload 7
    //   997: invokestatic 1038	com/appsflyer/AppsFlyerLib:addAdvertiserIDData	(Landroid/content/Context;Ljava/util/Map;)V
    //   1000: new 677	java/text/SimpleDateFormat
    //   1003: dup
    //   1004: ldc 55
    //   1006: invokespecial 806	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   1009: astore 57
    //   1011: getstatic 336	android/os/Build$VERSION:SDK_INT	I
    //   1014: istore 58
    //   1016: iload 58
    //   1018: bipush 9
    //   1020: if_icmplt +41 -> 1061
    //   1023: aload 7
    //   1025: ldc_w 1040
    //   1028: aload 57
    //   1030: new 674	java/util/Date
    //   1033: dup
    //   1034: aload_0
    //   1035: invokevirtual 604	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1038: aload_0
    //   1039: invokevirtual 533	android/content/Context:getPackageName	()Ljava/lang/String;
    //   1042: iconst_0
    //   1043: invokevirtual 798	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   1046: getfield 803	android/content/pm/PackageInfo:firstInstallTime	J
    //   1049: invokespecial 809	java/util/Date:<init>	(J)V
    //   1052: invokevirtual 681	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   1055: invokeinterface 221 3 0
    //   1060: pop
    //   1061: aload_0
    //   1062: invokevirtual 604	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   1065: aload_0
    //   1066: invokevirtual 533	android/content/Context:getPackageName	()Ljava/lang/String;
    //   1069: iconst_0
    //   1070: invokevirtual 798	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   1073: astore 76
    //   1075: aload 7
    //   1077: ldc_w 1042
    //   1080: aload 76
    //   1082: getfield 1045	android/content/pm/PackageInfo:versionCode	I
    //   1085: invokestatic 455	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1088: invokeinterface 221 3 0
    //   1093: pop
    //   1094: aload 7
    //   1096: ldc_w 1047
    //   1099: aload 76
    //   1101: getfield 1050	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   1104: invokeinterface 221 3 0
    //   1109: pop
    //   1110: aload 76
    //   1112: getfield 803	android/content/pm/PackageInfo:firstInstallTime	J
    //   1115: lstore 79
    //   1117: aload 76
    //   1119: getfield 1053	android/content/pm/PackageInfo:lastUpdateTime	J
    //   1122: lstore 81
    //   1124: aload 7
    //   1126: ldc_w 1055
    //   1129: aload 57
    //   1131: new 674	java/util/Date
    //   1134: dup
    //   1135: lload 79
    //   1137: invokespecial 809	java/util/Date:<init>	(J)V
    //   1140: invokevirtual 681	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   1143: invokeinterface 221 3 0
    //   1148: pop
    //   1149: aload 7
    //   1151: ldc_w 1057
    //   1154: aload 57
    //   1156: new 674	java/util/Date
    //   1159: dup
    //   1160: lload 81
    //   1162: invokespecial 809	java/util/Date:<init>	(J)V
    //   1165: invokevirtual 681	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   1168: invokeinterface 221 3 0
    //   1173: pop
    //   1174: aload 7
    //   1176: ldc_w 1059
    //   1179: aload 57
    //   1181: aload_0
    //   1182: invokestatic 1061	com/appsflyer/AppsFlyerLib:getFirstInstallDate	(Ljava/text/SimpleDateFormat;Landroid/content/Context;)Ljava/lang/String;
    //   1185: invokeinterface 221 3 0
    //   1190: pop
    //   1191: aload 4
    //   1193: invokevirtual 629	java/lang/String:length	()I
    //   1196: ifle +15 -> 1211
    //   1199: aload 7
    //   1201: ldc 70
    //   1203: aload 4
    //   1205: invokeinterface 221 3 0
    //   1210: pop
    //   1211: aload_0
    //   1212: ldc 11
    //   1214: iconst_0
    //   1215: invokevirtual 272	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1218: astore 60
    //   1220: aload 60
    //   1222: ldc 25
    //   1224: aconst_null
    //   1225: invokeinterface 279 3 0
    //   1230: astore 61
    //   1232: aload 61
    //   1234: ifnull +24 -> 1258
    //   1237: aload 61
    //   1239: invokevirtual 629	java/lang/String:length	()I
    //   1242: ifle +16 -> 1258
    //   1245: aload 7
    //   1247: ldc_w 1063
    //   1250: aload 61
    //   1252: invokeinterface 221 3 0
    //   1257: pop
    //   1258: iload 6
    //   1260: ifeq +293 -> 1553
    //   1263: aload_0
    //   1264: instanceof 1065
    //   1267: ifeq +286 -> 1553
    //   1270: aload_0
    //   1271: checkcast 1065	android/app/Activity
    //   1274: invokevirtual 1069	android/app/Activity:getIntent	()Landroid/content/Intent;
    //   1277: astore 64
    //   1279: aload 64
    //   1281: invokevirtual 1072	android/content/Intent:getAction	()Ljava/lang/String;
    //   1284: ldc_w 1074
    //   1287: if_acmpne +130 -> 1417
    //   1290: aload 64
    //   1292: invokevirtual 1078	android/content/Intent:getData	()Landroid/net/Uri;
    //   1295: astore 65
    //   1297: aload 65
    //   1299: ldc_w 1080
    //   1302: invokevirtual 1083	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   1305: ifnull +103 -> 1408
    //   1308: aload 7
    //   1310: ldc_w 1085
    //   1313: ldc_w 266
    //   1316: invokeinterface 221 3 0
    //   1321: pop
    //   1322: aload 65
    //   1324: invokevirtual 1088	android/net/Uri:getQuery	()Ljava/lang/String;
    //   1327: invokevirtual 1089	java/lang/String:toString	()Ljava/lang/String;
    //   1330: aload_0
    //   1331: invokestatic 638	com/appsflyer/AppsFlyerLib:referrerStringToMap	(Ljava/lang/String;Landroid/content/Context;)Ljava/util/Map;
    //   1334: astore 67
    //   1336: new 349	org/json/JSONObject
    //   1339: dup
    //   1340: aload 67
    //   1342: invokespecial 1091	org/json/JSONObject:<init>	(Ljava/util/Map;)V
    //   1345: invokevirtual 1092	org/json/JSONObject:toString	()Ljava/lang/String;
    //   1348: astore 68
    //   1350: aload 7
    //   1352: ldc_w 1094
    //   1355: aload 68
    //   1357: invokeinterface 221 3 0
    //   1362: pop
    //   1363: aload 60
    //   1365: invokeinterface 324 1 0
    //   1370: astore 70
    //   1372: aload 70
    //   1374: ldc 37
    //   1376: aload 68
    //   1378: invokeinterface 330 3 0
    //   1383: pop
    //   1384: aload 70
    //   1386: invokeinterface 342 1 0
    //   1391: pop
    //   1392: getstatic 122	com/appsflyer/AppsFlyerLib:conversionDataListener	Lcom/appsflyer/AppsFlyerConversionListener;
    //   1395: ifnull +13 -> 1408
    //   1398: getstatic 122	com/appsflyer/AppsFlyerLib:conversionDataListener	Lcom/appsflyer/AppsFlyerConversionListener;
    //   1401: aload 67
    //   1403: invokeinterface 1097 2 0
    //   1408: getstatic 1101	java/lang/System:out	Ljava/io/PrintStream;
    //   1411: ldc_w 1103
    //   1414: invokevirtual 1108	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   1417: new 1110	com/appsflyer/AppsFlyerLib$SendToServerRunnable
    //   1420: dup
    //   1421: aload 14
    //   1423: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1426: aload 7
    //   1428: aload_0
    //   1429: invokevirtual 483	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   1432: iload 6
    //   1434: aconst_null
    //   1435: invokespecial 1113	com/appsflyer/AppsFlyerLib$SendToServerRunnable:<init>	(Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;ZLcom/appsflyer/AppsFlyerLib$1;)V
    //   1438: invokevirtual 1116	com/appsflyer/AppsFlyerLib$SendToServerRunnable:run	()V
    //   1441: return
    //   1442: astore 10
    //   1444: aload 10
    //   1446: invokevirtual 1117	java/lang/Throwable:getLocalizedMessage	()Ljava/lang/String;
    //   1449: pop
    //   1450: return
    //   1451: ldc_w 1119
    //   1454: invokestatic 559	com/appsflyer/AppsFlyerLib:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   1457: astore 97
    //   1459: aload 97
    //   1461: ifnull -765 -> 696
    //   1464: aload 7
    //   1466: ldc_w 1121
    //   1469: aload 97
    //   1471: invokestatic 979	com/appsflyer/HashUtils:toSHA1	(Ljava/lang/String;)Ljava/lang/String;
    //   1474: invokeinterface 221 3 0
    //   1479: pop
    //   1480: goto -784 -> 696
    //   1483: astore 51
    //   1485: new 402	java/lang/StringBuilder
    //   1488: dup
    //   1489: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   1492: ldc 40
    //   1494: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1497: ldc 40
    //   1499: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1502: ldc_w 1123
    //   1505: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1508: aload 51
    //   1510: invokevirtual 1126	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1513: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1516: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1519: pop
    //   1520: goto -602 -> 918
    //   1523: astore 55
    //   1525: new 402	java/lang/StringBuilder
    //   1528: dup
    //   1529: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   1532: ldc_w 1128
    //   1535: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1538: aload 55
    //   1540: invokevirtual 1126	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1543: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1546: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1549: pop
    //   1550: goto -556 -> 994
    //   1553: iload 6
    //   1555: ifne -138 -> 1417
    //   1558: aload 60
    //   1560: ldc 37
    //   1562: aconst_null
    //   1563: invokeinterface 279 3 0
    //   1568: astore 62
    //   1570: aload 62
    //   1572: ifnull -155 -> 1417
    //   1575: aload 7
    //   1577: ldc_w 1094
    //   1580: aload 62
    //   1582: invokeinterface 221 3 0
    //   1587: pop
    //   1588: goto -171 -> 1417
    //   1591: astore 75
    //   1593: goto -402 -> 1191
    //   1596: astore 59
    //   1598: goto -407 -> 1191
    //   1601: astore 86
    //   1603: goto -542 -> 1061
    //   1606: astore 54
    //   1608: goto -629 -> 979
    //   1611: astore 53
    //   1613: goto -678 -> 935
    //   1616: astore 13
    //   1618: goto -1410 -> 208
    //   1621: iload 6
    //   1623: ifeq +42 -> 1665
    //   1626: ldc_w 893
    //   1629: astore 12
    //   1631: goto -1507 -> 124
    //   1634: aload 24
    //   1636: ifnonnull -1217 -> 419
    //   1639: aload 23
    //   1641: ifnull -1222 -> 419
    //   1644: goto -1238 -> 406
    //   1647: iconst_0
    //   1648: istore 6
    //   1650: goto -1640 -> 10
    //   1653: aload_2
    //   1654: astore 106
    //   1656: goto -1565 -> 91
    //   1659: aload_2
    //   1660: astore 108
    //   1662: goto -1550 -> 112
    //   1665: aload_2
    //   1666: astore 12
    //   1668: goto -1544 -> 124
    //
    // Exception table:
    //   from	to	target	type
    //   50	81	1442	java/lang/Throwable
    //   91	102	1442	java/lang/Throwable
    //   112	121	1442	java/lang/Throwable
    //   124	142	1442	java/lang/Throwable
    //   142	186	1442	java/lang/Throwable
    //   186	208	1442	java/lang/Throwable
    //   208	330	1442	java/lang/Throwable
    //   335	356	1442	java/lang/Throwable
    //   356	370	1442	java/lang/Throwable
    //   375	388	1442	java/lang/Throwable
    //   393	403	1442	java/lang/Throwable
    //   406	419	1442	java/lang/Throwable
    //   419	425	1442	java/lang/Throwable
    //   430	446	1442	java/lang/Throwable
    //   446	452	1442	java/lang/Throwable
    //   457	473	1442	java/lang/Throwable
    //   473	479	1442	java/lang/Throwable
    //   484	500	1442	java/lang/Throwable
    //   504	511	1442	java/lang/Throwable
    //   511	518	1442	java/lang/Throwable
    //   522	568	1442	java/lang/Throwable
    //   568	573	1442	java/lang/Throwable
    //   578	591	1442	java/lang/Throwable
    //   591	602	1442	java/lang/Throwable
    //   607	621	1442	java/lang/Throwable
    //   628	652	1442	java/lang/Throwable
    //   652	663	1442	java/lang/Throwable
    //   669	679	1442	java/lang/Throwable
    //   680	696	1442	java/lang/Throwable
    //   700	712	1442	java/lang/Throwable
    //   716	728	1442	java/lang/Throwable
    //   728	754	1442	java/lang/Throwable
    //   754	762	1442	java/lang/Throwable
    //   767	804	1442	java/lang/Throwable
    //   804	817	1442	java/lang/Throwable
    //   817	825	1442	java/lang/Throwable
    //   830	843	1442	java/lang/Throwable
    //   843	870	1442	java/lang/Throwable
    //   875	888	1442	java/lang/Throwable
    //   888	894	1442	java/lang/Throwable
    //   894	900	1442	java/lang/Throwable
    //   905	918	1442	java/lang/Throwable
    //   918	935	1442	java/lang/Throwable
    //   935	979	1442	java/lang/Throwable
    //   979	994	1442	java/lang/Throwable
    //   994	1016	1442	java/lang/Throwable
    //   1023	1061	1442	java/lang/Throwable
    //   1061	1191	1442	java/lang/Throwable
    //   1191	1211	1442	java/lang/Throwable
    //   1211	1232	1442	java/lang/Throwable
    //   1237	1258	1442	java/lang/Throwable
    //   1263	1408	1442	java/lang/Throwable
    //   1408	1417	1442	java/lang/Throwable
    //   1417	1441	1442	java/lang/Throwable
    //   1451	1459	1442	java/lang/Throwable
    //   1464	1480	1442	java/lang/Throwable
    //   1485	1520	1442	java/lang/Throwable
    //   1525	1550	1442	java/lang/Throwable
    //   1558	1570	1442	java/lang/Throwable
    //   1575	1588	1442	java/lang/Throwable
    //   894	900	1483	java/lang/Exception
    //   905	918	1483	java/lang/Exception
    //   979	994	1523	java/lang/Exception
    //   1061	1191	1591	java/lang/NoSuchFieldError
    //   1061	1191	1596	android/content/pm/PackageManager$NameNotFoundException
    //   1023	1061	1601	java/lang/Exception
    //   935	979	1606	java/lang/Exception
    //   918	935	1611	java/lang/Exception
    //   142	186	1616	java/lang/Exception
    //   186	208	1616	java/lang/Exception
  }

  // ERROR //
  private void sendUninstall(String paramString, Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 402	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   9: ldc 85
    //   11: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   17: astore 7
    //   19: aload_2
    //   20: invokestatic 187	com/appsflyer/AppsFlyerLib:shouldLog	(Landroid/content/Context;)Z
    //   23: istore 8
    //   25: aconst_null
    //   26: astore_3
    //   27: iload 8
    //   29: ifeq +25 -> 54
    //   32: new 402	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   39: ldc_w 1131
    //   42: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: aload 7
    //   47: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: pop
    //   54: new 346	java/util/HashMap
    //   57: dup
    //   58: invokespecial 347	java/util/HashMap:<init>	()V
    //   61: astore 10
    //   63: aload 10
    //   65: ldc_w 755
    //   68: aload_1
    //   69: invokeinterface 221 3 0
    //   74: pop
    //   75: aload_2
    //   76: aload 10
    //   78: invokestatic 1038	com/appsflyer/AppsFlyerLib:addAdvertiserIDData	(Landroid/content/Context;Ljava/util/Map;)V
    //   81: aload_2
    //   82: aload 10
    //   84: invokestatic 1009	com/appsflyer/AppsFlyerLib:addDeviceTracking	(Landroid/content/Context;Ljava/util/Map;)V
    //   87: aload 10
    //   89: invokestatic 167	com/appsflyer/AppsFlyerLib:mapToString	(Ljava/util/Map;)Ljava/lang/String;
    //   92: astore 12
    //   94: new 383	java/net/URL
    //   97: dup
    //   98: aload 7
    //   100: invokespecial 824	java/net/URL:<init>	(Ljava/lang/String;)V
    //   103: invokevirtual 387	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   106: checkcast 389	java/net/HttpURLConnection
    //   109: astore 13
    //   111: aload 13
    //   113: ldc_w 391
    //   116: invokevirtual 394	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   119: aload 12
    //   121: invokevirtual 398	java/lang/String:getBytes	()[B
    //   124: arraylength
    //   125: istore 16
    //   127: aload 13
    //   129: ldc_w 400
    //   132: new 402	java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   139: iload 16
    //   141: invokevirtual 407	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   144: ldc_w 409
    //   147: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokevirtual 416	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   156: aload 13
    //   158: ldc_w 418
    //   161: ldc_w 420
    //   164: invokevirtual 416	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   167: aload 13
    //   169: sipush 10000
    //   172: invokevirtual 424	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   175: aload 13
    //   177: iconst_1
    //   178: invokevirtual 428	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   181: new 430	java/io/OutputStreamWriter
    //   184: dup
    //   185: aload 13
    //   187: invokevirtual 434	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   190: invokespecial 437	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   193: astore 17
    //   195: aload 17
    //   197: aload 12
    //   199: invokevirtual 440	java/io/OutputStreamWriter:write	(Ljava/lang/String;)V
    //   202: aload 17
    //   204: invokevirtual 442	java/io/OutputStreamWriter:close	()V
    //   207: aload 13
    //   209: invokevirtual 446	java/net/HttpURLConnection:getResponseCode	()I
    //   212: sipush 200
    //   215: if_icmpne +120 -> 335
    //   218: aload_2
    //   219: invokestatic 187	com/appsflyer/AppsFlyerLib:shouldLog	(Landroid/content/Context;)Z
    //   222: ifeq +24 -> 246
    //   225: new 402	java/lang/StringBuilder
    //   228: dup
    //   229: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   232: ldc_w 1133
    //   235: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: aload_1
    //   239: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   245: pop
    //   246: aload 13
    //   248: ifnull +8 -> 256
    //   251: aload 13
    //   253: invokevirtual 503	java/net/HttpURLConnection:disconnect	()V
    //   256: return
    //   257: astore 18
    //   259: aconst_null
    //   260: astore 17
    //   262: aload 17
    //   264: ifnull +8 -> 272
    //   267: aload 17
    //   269: invokevirtual 442	java/io/OutputStreamWriter:close	()V
    //   272: aload 18
    //   274: athrow
    //   275: astore 15
    //   277: aload 13
    //   279: astore_3
    //   280: aload 15
    //   282: astore 4
    //   284: aload_2
    //   285: invokestatic 187	com/appsflyer/AppsFlyerLib:shouldLog	(Landroid/content/Context;)Z
    //   288: ifeq +38 -> 326
    //   291: new 402	java/lang/StringBuilder
    //   294: dup
    //   295: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   298: ldc_w 1135
    //   301: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: aload_1
    //   305: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: ldc_w 1137
    //   311: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: aload 4
    //   316: invokevirtual 1117	java/lang/Throwable:getLocalizedMessage	()Ljava/lang/String;
    //   319: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: pop
    //   326: aload_3
    //   327: ifnull -71 -> 256
    //   330: aload_3
    //   331: invokevirtual 503	java/net/HttpURLConnection:disconnect	()V
    //   334: return
    //   335: aload_2
    //   336: invokestatic 187	com/appsflyer/AppsFlyerLib:shouldLog	(Landroid/content/Context;)Z
    //   339: ifeq -93 -> 246
    //   342: new 402	java/lang/StringBuilder
    //   345: dup
    //   346: invokespecial 403	java/lang/StringBuilder:<init>	()V
    //   349: ldc_w 1135
    //   352: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: aload_1
    //   356: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: invokevirtual 413	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   362: pop
    //   363: goto -117 -> 246
    //   366: astore 14
    //   368: aload 13
    //   370: astore_3
    //   371: aload 14
    //   373: astore 5
    //   375: aload_3
    //   376: ifnull +7 -> 383
    //   379: aload_3
    //   380: invokevirtual 503	java/net/HttpURLConnection:disconnect	()V
    //   383: aload 5
    //   385: athrow
    //   386: astore 5
    //   388: goto -13 -> 375
    //   391: astore 4
    //   393: aconst_null
    //   394: astore_3
    //   395: goto -111 -> 284
    //   398: astore 18
    //   400: goto -138 -> 262
    //
    // Exception table:
    //   from	to	target	type
    //   181	195	257	finally
    //   111	181	275	java/lang/Throwable
    //   202	246	275	java/lang/Throwable
    //   267	272	275	java/lang/Throwable
    //   272	275	275	java/lang/Throwable
    //   335	363	275	java/lang/Throwable
    //   111	181	366	finally
    //   202	246	366	finally
    //   267	272	366	finally
    //   272	275	366	finally
    //   335	363	366	finally
    //   2	25	386	finally
    //   32	54	386	finally
    //   54	111	386	finally
    //   284	326	386	finally
    //   2	25	391	java/lang/Throwable
    //   32	54	391	java/lang/Throwable
    //   54	111	391	java/lang/Throwable
    //   195	202	398	finally
  }

  public static void setAppId(String paramString)
  {
    setProperty("appid", paramString);
  }

  public static void setAppUserId(String paramString)
  {
    setProperty("AppUserId", paramString);
  }

  public static void setAppsFlyerKey(String paramString)
  {
    setProperty("AppsFlyerKey", paramString);
  }

  public static void setCollectAndroidID(boolean paramBoolean)
  {
    setProperty("collectAndroidId", Boolean.toString(paramBoolean));
  }

  public static void setCollectIMEI(boolean paramBoolean)
  {
    setProperty("collectIMEI", Boolean.toString(paramBoolean));
  }

  public static void setCollectMACAddress(boolean paramBoolean)
  {
    setProperty("collectMAC", Boolean.toString(paramBoolean));
  }

  public static void setCurrencyCode(String paramString)
  {
    AppsFlyerProperties.getInstance().set("currencyCode", paramString);
  }

  public static void setDeviceTrackingDisabled(boolean paramBoolean)
  {
    AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", paramBoolean);
  }

  public static void setExtension(String paramString)
  {
    AppsFlyerProperties.getInstance().set("sdkExtension", paramString);
  }

  public static void setIsUpdate(boolean paramBoolean)
  {
    AppsFlyerProperties.getInstance().set("IS_UPDATE", paramBoolean);
  }

  protected static void setProperty(String paramString1, String paramString2)
  {
    AppsFlyerProperties.getInstance().set(paramString1, paramString2);
  }

  public static void setUseHTTPFalback(boolean paramBoolean)
  {
    setProperty("useHttpFallback", Boolean.toString(paramBoolean));
  }

  public static void setUserEmail(String paramString)
  {
    setProperty("userEmail", paramString);
  }

  public static void setUserEmails(String[] paramArrayOfString)
  {
    AppsFlyerProperties.getInstance().set("userEmails", paramArrayOfString);
  }

  private static boolean shouldLog(Context paramContext)
  {
    return !AppsFlyerProperties.getInstance().isDisableLog();
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.intent.action.PACKAGE_REMOVED".equals(paramIntent.getAction()))
      sendUninstall(paramIntent.getDataString(), paramContext);
    String str2;
    do
    {
      do
      {
        return;
        String str1 = paramIntent.getStringExtra("shouldMonitor");
        if (str1 != null)
        {
          AppsFlyerProperties.getInstance().set("shouldMonitor", str1.equals("true"));
          monitor(paramContext, null, "START_TRACKING", paramContext.getPackageName());
          return;
        }
        debugAction("******* onReceive: ", "", paramContext);
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        str2 = paramIntent.getStringExtra("referrer");
        if (shouldLog(paramContext))
          new StringBuilder().append("Play store referrer: ").append(str2).toString();
      }
      while (str2 == null);
      debugAction("BroadcastReceiver got referrer: ", str2, paramContext);
      debugAction("onRecieve called. refferer=", str2, paramContext);
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("appsflyer-data", 0).edit();
      localEditor.putString("referrer", str2);
      localEditor.commit();
      AppsFlyerProperties.getInstance().setReferrer(str2);
    }
    while (!AppsFlyerProperties.getInstance().isLaunchCollectedReferrerd());
    runInBackground(paramContext, null, null, null, str2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.AppsFlyerLib
 * JD-Core Version:    0.6.2
 */