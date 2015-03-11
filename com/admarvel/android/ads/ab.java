package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.hardware.Camera;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.admarvel.android.b.a;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class ab
{
  public static String a = "";
  public static boolean b;
  private WeakReference<Context> c;
  private final Handler d;
  private String e;

  public ab(Context paramContext)
  {
    this.c = new WeakReference(paramContext);
    this.d = null;
  }

  public ab(Context paramContext, Handler paramHandler)
  {
    this.c = new WeakReference(paramContext);
    this.d = paramHandler;
  }

  public static float a(Context paramContext, int paramInt1, int paramInt2)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getApplicationContext().getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return Math.min(localDisplayMetrics.density, paramInt1 / paramInt2);
  }

  public static int a(AdMarvelUtils.ErrorReason paramErrorReason)
  {
    switch (4.a[paramErrorReason.ordinal()])
    {
    default:
      return -1;
    case 1:
      return 201;
    case 2:
      return 202;
    case 3:
      return 203;
    case 4:
      return 204;
    case 5:
      return 205;
    case 6:
      return 206;
    case 7:
      return 207;
    case 8:
      return 208;
    case 9:
      return 301;
    case 10:
      return 302;
    case 11:
      return 303;
    case 12:
      return 304;
    case 13:
      return 305;
    case 14:
      return 306;
    case 15:
      return 307;
    case 16:
    }
    return 308;
  }

  public static AdMarvelUtils.ErrorReason a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 201:
      return AdMarvelUtils.ErrorReason.SITE_ID_OR_PARTNER_ID_NOT_PRESENT;
    case 202:
      return AdMarvelUtils.ErrorReason.SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH;
    case 203:
      return AdMarvelUtils.ErrorReason.BOT_USER_AGENT_FOUND;
    case 204:
      return AdMarvelUtils.ErrorReason.NO_BANNER_FOUND;
    case 205:
      return AdMarvelUtils.ErrorReason.NO_AD_FOUND;
    case 206:
      return AdMarvelUtils.ErrorReason.NO_USER_AGENT_FOUND;
    case 207:
      return AdMarvelUtils.ErrorReason.SITE_ID_NOT_PRESENT;
    case 208:
      return AdMarvelUtils.ErrorReason.PARTNER_ID_NOT_PRESENT;
    case 301:
      return AdMarvelUtils.ErrorReason.NO_NETWORK_CONNECTIVITY;
    case 302:
      return AdMarvelUtils.ErrorReason.NETWORK_CONNECTIVITY_DISRUPTED;
    case 303:
      return AdMarvelUtils.ErrorReason.AD_REQUEST_XML_PARSING_EXCEPTION;
    case 304:
      return AdMarvelUtils.ErrorReason.AD_REQUEST_IN_PROCESS_EXCEPTION;
    case 305:
      return AdMarvelUtils.ErrorReason.AD_UNIT_NOT_ABLE_TO_RENDER;
    case 306:
      return AdMarvelUtils.ErrorReason.AD_REQUEST_MISSING_XML_ELEMENTS;
    case 307:
      return AdMarvelUtils.ErrorReason.AD_REQUEST_SDK_TYPE_UNSUPPORTED;
    case 308:
    }
    return AdMarvelUtils.ErrorReason.AD_UNIT_NOT_ABLE_TO_LOAD;
  }

  public static ab.f a(String paramString1, String paramString2)
  {
    if (paramString1.startsWith(paramString2 + "://"))
      return ab.f.a;
    if (paramString1.startsWith(paramString2))
      return ab.f.b;
    return ab.f.c;
  }

  public static String a(Activity paramActivity)
  {
    int i = paramActivity.getRequestedOrientation();
    if (ac.a() < 9)
    {
      switch (i)
      {
      default:
        return "0";
      case -1:
        return "0,90";
      case 2:
        return "0,90";
      case 3:
        return "0,90";
      case 0:
        return "90";
      case 1:
        return "0";
      case 4:
        return "0,90";
      case 5:
      }
      return "0";
    }
    switch (i)
    {
    default:
      return "";
    case -1:
      return "0,-90,90";
    case 2:
      return "0,90,-90";
    case 3:
      return "0,90,-90";
    case 0:
      return "90";
    case 1:
      return "0";
    case 8:
      return "-90";
    case 9:
      return "180";
    case 6:
      return "90,-90";
    case 7:
      return "180,-180";
    case 4:
      return "0,-90,90";
    case 10:
      return "0,-90,90,180";
    case 5:
    }
    return "0";
  }

  static String a(Context paramContext)
  {
    if (paramContext == null)
      throw new NullPointerException();
    if (d(paramContext, "android.permission.ACCESS_NETWORK_STATE"))
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      NetworkInfo localNetworkInfo1 = localConnectivityManager.getNetworkInfo(1);
      NetworkInfo localNetworkInfo2 = localConnectivityManager.getNetworkInfo(0);
      if ((localNetworkInfo1 != null) && (localNetworkInfo1.isAvailable()))
        return "wifi";
      if ((localNetworkInfo2 != null) && (localNetworkInfo2.isAvailable()))
        return "mobile";
      return "none";
    }
    return "unknown";
  }

  static String a(String paramString, Context paramContext)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      Object localObject = paramString;
      try
      {
        while (true)
        {
          HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL((String)localObject).openConnection();
          localHttpURLConnection.setRequestMethod("GET");
          localHttpURLConnection.setDoInput(true);
          localHttpURLConnection.setUseCaches(false);
          localHttpURLConnection.setRequestProperty("User-Agent", new ab(paramContext).a());
          localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
          localHttpURLConnection.setRequestProperty("Content-Length", "0");
          localHttpURLConnection.setConnectTimeout(4000);
          localHttpURLConnection.setReadTimeout(5000);
          localHttpURLConnection.setInstanceFollowRedirects(false);
          localHttpURLConnection.connect();
          int i = localHttpURLConnection.getResponseCode();
          if ((i != 301) && (i != 302))
            break;
          String str = localHttpURLConnection.getHeaderField("Location");
          localObject = str;
        }
      }
      catch (Exception localException)
      {
        if ((localObject != null) && (((String)localObject).length() > 0))
          paramString = (String)localObject;
      }
    }
    return paramString;
  }

  public static String a(String paramString1, String paramString2, String paramString3, ab.f paramf, Context paramContext)
  {
    if ((paramString1 != null) && (paramString1.length() > 0))
      paramString1 = paramString1.replace("content://" + paramContext.getPackageName() + ".AdMarvelLocalFileContentProvider", "");
    String str;
    if (paramf == ab.f.a)
      str = paramString1.replaceFirst(paramString2 + "://", paramString3);
    ab.f localf;
    do
    {
      return str;
      localf = ab.f.b;
      str = null;
    }
    while (paramf != localf);
    return paramString1.replaceFirst(paramString2, paramString3);
  }

  public static String a(Map<String, Object> paramMap, String paramString)
  {
    if (paramMap == null)
      return null;
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.keySet().iterator();
    label136: 
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if ((paramMap.get(str1) instanceof String));
      for (String str2 = (String)paramMap.get(str1); ; str2 = null)
      {
        if ((str2 == null) || (str2.length() <= 0))
          break label136;
        if (localStringBuilder.length() > 0)
          localStringBuilder.append(paramString);
        localStringBuilder.append(URLEncoder.encode(str1, "UTF-8")).append("=>").append(URLEncoder.encode(str2, "UTF-8"));
        break;
      }
    }
    return localStringBuilder.toString();
  }

  public static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if ((paramStringBuilder != null) && (paramString2 != null) && (paramString1 != null))
      paramStringBuilder.append("&").append(paramString1).append("=").append(URLEncoder.encode(paramString2, "UTF-8"));
  }

  public static boolean a(Context paramContext, int paramInt)
  {
    if (paramContext != null);
    try
    {
      if (d(paramContext, "android.permission.VIBRATE"))
        ((Vibrator)paramContext.getSystemService("vibrator")).vibrate(paramInt);
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean a(Context paramContext, Intent paramIntent)
  {
    return paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536).size() > 0;
  }

  static boolean a(Context paramContext, String paramString)
  {
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 0);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  public static String b()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    String str1 = Build.VERSION.RELEASE;
    if (str1.length() > 0)
    {
      localStringBuffer.append(str1);
      localStringBuffer.append("; ");
      Locale localLocale = Locale.getDefault();
      String str2 = localLocale.getLanguage();
      if (str2 == null)
        break label172;
      localStringBuffer.append(str2.toLowerCase());
      String str5 = localLocale.getCountry();
      if (str5 != null)
      {
        localStringBuffer.append("-");
        localStringBuffer.append(str5.toLowerCase());
      }
    }
    while (true)
    {
      String str3 = Build.MODEL;
      if (str3.length() > 0)
      {
        localStringBuffer.append("; ");
        localStringBuffer.append(str3);
      }
      String str4 = Build.ID;
      if (str4.length() > 0)
      {
        localStringBuffer.append(" Build/");
        localStringBuffer.append(str4);
      }
      return String.format("Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/525.10+ (KHTML, like Gecko) Version/3.0.4 Mobile Safari/523.12.2", new Object[] { localStringBuffer });
      localStringBuffer.append("1.0");
      break;
      label172: localStringBuffer.append("en");
    }
  }

  static String b(Context paramContext)
  {
    if (paramContext == null);
    TelephonyManager localTelephonyManager;
    NetworkInfo localNetworkInfo;
    do
    {
      return "";
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
    }
    while (localNetworkInfo == null);
    String str;
    switch (localNetworkInfo.getType())
    {
    default:
      str = "";
    case 1:
    case 0:
    }
    while (true)
    {
      return str;
      str = "wifi";
      continue;
      switch (localTelephonyManager.getNetworkType())
      {
      default:
        break;
      case 1:
        str = "GPRS";
        break;
      case 13:
        str = "lte";
        break;
      case 15:
        str = "HSPAP";
        break;
      case 2:
        str = "EDGE";
        break;
      case 7:
        str = "1xRTT";
        break;
      case 4:
        str = "CDMA";
        break;
      case 14:
        str = "EHRPD";
        break;
      case 5:
        str = "EVDO_0";
        break;
      case 6:
        str = "EVDO_A";
        break;
      case 12:
        str = "EVDO_B";
        break;
      case 8:
        str = "HSDPA";
        break;
      case 10:
        str = "HSPA";
        break;
      case 9:
        str = "HSUPA";
        break;
      case 11:
        str = "IDEN";
        break;
      case 3:
        str = "UMTS";
      }
    }
  }

  static boolean b(Context paramContext, String paramString)
  {
    while (true)
    {
      String str3;
      Uri localUri2;
      Intent localIntent14;
      try
      {
        if (((!AdMarvelView.b) && (!AdMarvelInterstitialAds.enableOfflineSDK)) || (paramString == null) || (!paramString.contains("/")) || (URLUtil.isNetworkUrl(paramString)))
          break label701;
        str3 = paramString.substring(1 + paramString.lastIndexOf("/"));
        if (!j(str3))
          break label287;
        localUri2 = Uri.parse(str3);
        if (ac.a() > 18)
        {
          if (!paramString.contains("?body="))
            break label1392;
          str7 = URLDecoder.decode(paramString.split("\\?body=")[1]);
          Intent localIntent15 = new Intent("android.intent.action.SENDTO", Uri.parse(paramString));
          if ((str7 != null) && (str7.trim().length() > 0))
            localIntent15.putExtra("sms_body", str7);
          if (!a(paramContext, localIntent15))
            break label338;
          paramContext.startActivity(localIntent15);
          return true;
        }
        localIntent14 = new Intent("android.intent.action.VIEW");
        if (paramString.contains("?body="))
        {
          String[] arrayOfString2 = paramString.split("\\?body=");
          localIntent14.putExtra("address", URLDecoder.decode(arrayOfString2[0]).substring(4));
          localIntent14.putExtra("sms_body", URLDecoder.decode(arrayOfString2[1]));
          localIntent14.setType("vnd.android-dir/mms-sms");
          localIntent14.addFlags(268435456);
          if (!a(paramContext, localIntent14))
            break label338;
          paramContext.startActivity(localIntent14);
          return true;
        }
      }
      catch (Exception localException1)
      {
        Logging.log(" Exception in handling special intents");
        return false;
      }
      localIntent14.putExtra("address", localUri2.toString().substring(4));
      continue;
      label287: if (i(str3))
      {
        Intent localIntent9 = new Intent("android.intent.action.DIAL", Uri.parse(str3));
        localIntent9.addFlags(268435456);
        if (a(paramContext, localIntent9))
        {
          paramContext.startActivity(localIntent9);
          return true;
        }
      }
      try
      {
        label338: localFileInputStream = a.a(paramString);
        if ((localFileInputStream != null) && (str3 != null))
          if (p(paramString))
          {
            String str6 = a.a(localFileInputStream, str3);
            if (str6 == null)
              break label701;
            Intent localIntent13 = new Intent("android.intent.action.VIEW");
            localIntent13.addFlags(268435456);
            localIntent13.setDataAndType(Uri.fromFile(new File(str6)), "video/*");
            if (!a(paramContext, localIntent13))
              break;
            paramContext.startActivity(localIntent13);
            return true;
          }
      }
      catch (Exception localException2)
      {
        FileInputStream localFileInputStream;
        if ((p(paramString)) || (r(paramString)) || (q(paramString)))
        {
          Logging.log(" ");
          return true;
          if (q(paramString))
          {
            String str5 = a.a(localFileInputStream, str3);
            if (str5 != null)
            {
              Intent localIntent12 = new Intent("android.intent.action.VIEW");
              localIntent12.addFlags(268435456);
              localIntent12.setDataAndType(Uri.fromFile(new File(str5)), "audio/*");
              if (!a(paramContext, localIntent12))
                break;
              paramContext.startActivity(localIntent12);
              return true;
            }
          }
          else if (r(paramString))
          {
            String str4 = a.a(localFileInputStream, str3);
            if (str4 == null)
              break;
            Intent localIntent10 = new Intent("android.intent.action.VIEW", Uri.parse(str4));
            localIntent10.setDataAndType(Uri.fromFile(new File(str4)), "application/pdf");
            localIntent10.setFlags(268435456);
            if (a(paramContext, localIntent10))
            {
              paramContext.startActivity(localIntent10);
              return true;
            }
            Intent localIntent11 = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
            localIntent11.addFlags(268435456);
            if (!a(paramContext, localIntent11))
              break;
            paramContext.startActivity(localIntent11);
            return true;
            if ((p(paramString)) || (r(paramString)) || (q(paramString)))
            {
              Logging.log(" ");
              return true;
            }
          }
        }
      }
      label701: if ((paramString != null) && (paramString.length() > 0))
      {
        String str2 = paramString.replace("content://" + paramContext.getPackageName() + ".AdMarvelLocalFileContentProvider", "");
        paramString = str2;
      }
      try
      {
        if ((f(paramContext)) && (f(paramString)))
        {
          Intent localIntent8 = new Intent("android.intent.action.VIEW");
          localIntent8.addFlags(268435456);
          localIntent8.setDataAndType(Uri.parse(paramString), "video/*");
          if (a(paramContext, localIntent8))
          {
            paramContext.startActivity(localIntent8);
            return true;
          }
        }
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        Logging.log(" ActivityNotFoundException");
        b = e(paramString);
        if ((AdMarvelView.b) || (AdMarvelInterstitialAds.enableOfflineSDK))
        {
          boolean bool1 = b;
          if (!bool1)
            break;
        }
      }
      label1266: Intent localIntent2;
      do
      {
        do
        {
          Intent localIntent1;
          do
          {
            Intent localIntent4;
            do
            {
              Intent localIntent7;
              do
              {
                return false;
                if ((!f(paramContext)) || (!g(paramString)))
                  break;
                localIntent7 = new Intent("android.intent.action.VIEW");
                localIntent7.addFlags(268435456);
                localIntent7.setDataAndType(Uri.parse(paramString), "audio/*");
              }
              while (!a(paramContext, localIntent7));
              paramContext.startActivity(localIntent7);
              return true;
              if ((f(paramContext)) && (m(paramString)))
              {
                Intent localIntent5 = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
                localIntent5.setDataAndType(Uri.parse(paramString), "application/pdf");
                localIntent5.setFlags(268435456);
                if (a(paramContext, localIntent5))
                {
                  paramContext.startActivity(localIntent5);
                  return true;
                }
                Intent localIntent6 = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
                localIntent6.addFlags(268435456);
                if (!a(paramContext, localIntent6))
                  break label1398;
                paramContext.startActivity(localIntent6);
                return true;
              }
              if (!j(paramString))
                break label1266;
              if (ac.a() < 19)
                break;
              boolean bool2 = paramString.contains("?body=");
              String str1 = null;
              if (bool2)
                str1 = URLDecoder.decode(paramString.split("\\?body=")[1]);
              localIntent4 = new Intent("android.intent.action.SENDTO", Uri.parse(paramString));
              if ((str1 != null) && (str1.trim().length() > 0))
                localIntent4.putExtra("sms_body", str1);
            }
            while (!a(paramContext, localIntent4));
            paramContext.startActivity(localIntent4);
            return true;
            Uri localUri1 = Uri.parse(paramString);
            Intent localIntent3 = new Intent("android.intent.action.VIEW");
            if (paramString.contains("?body="))
            {
              String[] arrayOfString1 = paramString.split("\\?body=");
              localIntent3.putExtra("address", URLDecoder.decode(arrayOfString1[0]).substring(4));
              localIntent3.putExtra("sms_body", URLDecoder.decode(arrayOfString1[1]));
            }
            while (true)
            {
              localIntent3.setType("vnd.android-dir/mms-sms");
              localIntent3.addFlags(268435456);
              if (!a(paramContext, localIntent3))
                break;
              paramContext.startActivity(localIntent3);
              return true;
              localIntent3.putExtra("address", localUri1.toString().substring(4));
            }
            if (!i(paramString))
              break;
            localIntent1 = new Intent("android.intent.action.DIAL", Uri.parse(paramString));
            localIntent1.addFlags(268435456);
          }
          while (!a(paramContext, localIntent1));
          paramContext.startActivity(localIntent1);
          return true;
        }
        while ((!l(paramString)) && (!h(paramString)) && (!n(paramString)) && (!o(paramString)) && (!k(paramString)));
        localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
        localIntent2.addFlags(268435456);
      }
      while (!a(paramContext, localIntent2));
      paramContext.startActivity(localIntent2);
      return true;
      label1392: String str7 = null;
    }
    label1398: return true;
  }

  static String c(Context paramContext)
  {
    if (paramContext == null)
      try
      {
        throw new NullPointerException();
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    String str;
    int i;
    do
    {
      return "unknown-network";
      str = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
      i = str.length();
    }
    while (i <= 0);
    return str;
  }

  static String c(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(b.b(paramString.getBytes(), 8), "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Logging.log(Log.getStackTraceString(localUnsupportedEncodingException));
    }
    return "";
  }

  public static boolean c()
  {
    return ac.a() == 16;
  }

  public static boolean c(Context paramContext, String paramString)
  {
    Object localObject1 = Boolean.valueOf(false);
    if ((ac.a() >= 7) && (paramString.equals("camera")))
      return Boolean.valueOf(ab.c.a(paramContext, paramString)).booleanValue();
    if (ac.a() >= 8)
      return Boolean.valueOf(ab.c.a(paramContext, paramString)).booleanValue();
    if (paramString.equals("camera"));
    try
    {
      Camera localCamera2 = Camera.open();
      localCamera1 = localCamera2;
      if (localCamera1 != null)
      {
        localObject2 = Boolean.valueOf(true);
        localObject1 = localObject2;
        while (true)
        {
          return ((Boolean)localObject1).booleanValue();
          if (paramString.equals("location"))
          {
            if ((LocationManager)paramContext.getSystemService("location") != null)
              localObject1 = Boolean.valueOf(true);
          }
          else if (paramString.equals("accelerometer"))
          {
            if (n.a().a(paramContext))
              localObject1 = Boolean.valueOf(true);
          }
          else if ((paramString.equals("compass")) && (n.a().b(paramContext)))
            localObject1 = Boolean.valueOf(true);
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        Camera localCamera1 = null;
        continue;
        Object localObject2 = localObject1;
      }
    }
  }

  static int d(Context paramContext)
  {
    if (paramContext == null)
      throw new NullPointerException();
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    if (localDisplay.getWidth() > localDisplay.getHeight())
      return 2;
    return 1;
  }

  public static boolean d(Context paramContext, String paramString)
  {
    return paramContext.checkCallingOrSelfPermission(paramString) == 0;
  }

  static boolean d(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.equals("admarvelsdk://noclick")) || (paramString.equals("admarvelsdk://nothing")));
  }

  public static Integer e(Context paramContext)
  {
    if (paramContext != null)
    {
      if (d(paramContext) == 1)
        return Integer.valueOf(1);
      return Integer.valueOf(0);
    }
    return null;
  }

  public static boolean e(String paramString)
  {
    return (a(paramString, "admarvelsdk") != ab.f.c) || (a(paramString, "admarvelinternal") != ab.f.c) || (a(paramString, "admarvelvideo") != ab.f.c) || (a(paramString, "admarvelexternal") != ab.f.c) || (a(paramString, "admarvelcustomvideo") != ab.f.c);
  }

  public static final boolean f(Context paramContext)
  {
    if (d(paramContext, "android.permission.ACCESS_NETWORK_STATE"))
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if ((localConnectivityManager.getActiveNetworkInfo() != null) && (localConnectivityManager.getActiveNetworkInfo().isAvailable()) && (localConnectivityManager.getActiveNetworkInfo().isConnected()))
        return true;
    }
    return false;
  }

  private static boolean f(String paramString)
  {
    boolean bool1 = false;
    if (paramString != null)
    {
      int i = paramString.length();
      bool1 = false;
      if (i > 0)
        if (!paramString.toLowerCase().endsWith(".mp4"))
        {
          boolean bool3 = paramString.toLowerCase().endsWith(".3gp");
          bool1 = false;
          if (!bool3)
            break label121;
        }
    }
    try
    {
      URL localURL = new URL(paramString);
      String str = localURL.getPath();
      bool1 = false;
      if (str != null)
      {
        int j = str.length();
        bool1 = false;
        if (j > 0)
          if (!str.toLowerCase().endsWith(".mp4"))
          {
            boolean bool2 = str.toLowerCase().endsWith(".3gp");
            bool1 = false;
            if (!bool2);
          }
          else
          {
            bool1 = true;
          }
      }
      label121: return bool1;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return false;
  }

  @SuppressLint({"NewApi"})
  public static int g(Context paramContext)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getApplicationContext().getSystemService("window");
    if (ac.a() >= 13)
    {
      Point localPoint = new Point();
      localWindowManager.getDefaultDisplay().getSize(localPoint);
      return localPoint.x;
    }
    return localWindowManager.getDefaultDisplay().getWidth();
  }

  private static boolean g(String paramString)
  {
    boolean bool1 = false;
    if (paramString != null)
    {
      int i = paramString.length();
      bool1 = false;
      if (i > 0)
        if ((!paramString.toLowerCase().endsWith(".flac")) && (!paramString.toLowerCase().endsWith(".mp3")) && (!paramString.toLowerCase().endsWith(".mid")) && (!paramString.toLowerCase().endsWith(".xmf")) && (!paramString.toLowerCase().endsWith(".mxmf")) && (!paramString.toLowerCase().endsWith(".rtttl")) && (!paramString.toLowerCase().endsWith(".rtx")) && (!paramString.toLowerCase().endsWith(".ota")))
        {
          boolean bool3 = paramString.toLowerCase().endsWith(".imy");
          bool1 = false;
          if (!bool3)
            break label310;
        }
    }
    try
    {
      URL localURL = new URL(paramString);
      String str = localURL.getPath();
      bool1 = false;
      if (str != null)
      {
        int j = str.length();
        bool1 = false;
        if (j > 0)
          if ((!str.toLowerCase().endsWith(".flac")) && (!str.toLowerCase().endsWith(".mp3")) && (!str.toLowerCase().endsWith(".mid")) && (!str.toLowerCase().endsWith(".xmf")) && (!str.toLowerCase().endsWith(".mxmf")) && (!str.toLowerCase().endsWith(".rtttl")) && (!str.toLowerCase().endsWith(".rtx")) && (!str.toLowerCase().endsWith(".ota")))
          {
            boolean bool2 = str.toLowerCase().endsWith(".imy");
            bool1 = false;
            if (!bool2);
          }
          else
          {
            bool1 = true;
          }
      }
      label310: return bool1;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return false;
  }

  @SuppressLint({"NewApi"})
  public static int h(Context paramContext)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getApplicationContext().getSystemService("window");
    if (ac.a() >= 13)
    {
      Point localPoint = new Point();
      localWindowManager.getDefaultDisplay().getSize(localPoint);
      return localPoint.y;
    }
    return localWindowManager.getDefaultDisplay().getHeight();
  }

  private static boolean h(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && (paramString.toLowerCase().startsWith("google.streetview:"));
  }

  public static float i(Context paramContext)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getApplicationContext().getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.density;
  }

  private static boolean i(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.toLowerCase().startsWith("tel:")) || (paramString.toLowerCase().startsWith("voicemail:")));
  }

  public static boolean j(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getPhoneType() != 0;
  }

  private static boolean j(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && (paramString.toLowerCase().startsWith("sms:"));
  }

  public static boolean k(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    return (localConnectivityManager.getActiveNetworkInfo() != null) && (localConnectivityManager.getActiveNetworkInfo().isAvailable()) && (localConnectivityManager.getActiveNetworkInfo().isConnected());
  }

  private static boolean k(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && (paramString.toLowerCase().startsWith("mailto:"));
  }

  public static void l(Context paramContext)
  {
    long l1 = Calendar.getInstance().getTimeInMillis();
    long l2 = AdMarvelUtils.getPreferenceValueLong(paramContext, "adm_viewport", "adm_viewport_timestamp");
    if (l2 == -2147483648L)
      l2 = 0L;
    StringBuilder localStringBuilder;
    if (l1 - l2 >= 86400000L)
      localStringBuilder = new StringBuilder();
    try
    {
      localBufferedReader = new BufferedReader(new InputStreamReader(new URL("http://admarvel.s3.amazonaws.com/sdk/admarvel_android_sdk_dynamic_viewport.js").openConnection().getInputStream()));
      while (true)
      {
        String str2 = localBufferedReader.readLine();
        if (str2 == null)
          break;
        localStringBuilder.append(str2);
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      BufferedReader localBufferedReader;
      localMalformedURLException.printStackTrace();
      while (true)
      {
        AdMarvelUtils.setPreferenceValueString(paramContext, "adm_viewport", "adm_viewport_data", localStringBuilder.toString());
        AdMarvelUtils.setPreferenceValueLong(paramContext, "adm_viewport", "adm_viewport_timestamp", Calendar.getInstance().getTimeInMillis());
        String str1 = AdMarvelUtils.getPreferenceValueString(paramContext, "adm_viewport", "adm_viewport_data");
        a = str1;
        if (str1.equals("VALUE_NOT_DEFINED"))
        {
          Logging.log("Viewport data fetch failed - Setting blank string");
          a = "";
        }
        return;
        localBufferedReader.close();
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }

  private static boolean l(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && (paramString.toLowerCase().startsWith("geo:"));
  }

  public static void m(Context paramContext)
  {
    long l1 = Calendar.getInstance().getTimeInMillis();
    long l2 = AdMarvelUtils.getPreferenceValueLong(paramContext, "adm_viewport", "adm_video_cleanup_timestamp");
    if (l2 == -2147483648L)
      l2 = 0L;
    if (l1 - l2 >= 360000L)
      new Thread(new Runnable()
      {
        public final void run()
        {
          File localFile1 = ab.this.getDir("adm_cache_files", 0);
          if (localFile1.isDirectory());
          while (true)
          {
            int i;
            try
            {
              String[] arrayOfString = localFile1.list();
              i = 0;
              if (arrayOfString == null)
                return;
              if (i < arrayOfString.length)
              {
                File localFile2 = new File(localFile1, arrayOfString[i]);
                String str = localFile2.getName().substring(1 + localFile2.getName().lastIndexOf("_"));
                if (!str.contains("PROCESSING"))
                {
                  Long localLong2 = Long.valueOf(Long.parseLong(str));
                  if ((System.nanoTime() - localLong2.longValue()) / 1000000000.0D >= 300.0D)
                    localFile2.delete();
                }
                else
                {
                  Long localLong1 = Long.valueOf(Long.parseLong(str.split(".PROCESSING")[0]));
                  if ((System.nanoTime() - localLong1.longValue()) / 1000000000.0D >= 300.0D)
                    localFile2.delete();
                }
              }
            }
            catch (Exception localException)
            {
              AdMarvelUtils.setPreferenceValueLong(ab.this, "adm_viewport", "adm_video_cleanup_timestamp", Calendar.getInstance().getTimeInMillis());
            }
            return;
            i++;
          }
        }
      }).start();
  }

  private static boolean m(String paramString)
  {
    boolean bool1 = false;
    if (paramString != null)
    {
      int i = paramString.length();
      bool1 = false;
      if (i > 0)
        if (!paramString.toLowerCase().endsWith(".pdf"))
        {
          boolean bool3 = paramString.toLowerCase().endsWith(".pdf");
          bool1 = false;
          if (!bool3)
            break label121;
        }
    }
    try
    {
      URL localURL = new URL(paramString);
      String str = localURL.getPath();
      bool1 = false;
      if (str != null)
      {
        int j = str.length();
        bool1 = false;
        if (j > 0)
          if (!str.toLowerCase().endsWith(".pdf"))
          {
            boolean bool2 = str.toLowerCase().endsWith(".pdf");
            bool1 = false;
            if (!bool2);
          }
          else
          {
            bool1 = true;
          }
      }
      label121: return bool1;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return false;
  }

  private static boolean n(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && (paramString.toLowerCase().startsWith("market://"));
  }

  private static boolean o(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && (paramString.toLowerCase().startsWith("vzw://"));
  }

  private static boolean p(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.toLowerCase().endsWith(".mp4")) || (paramString.toLowerCase().endsWith(".3gp")));
  }

  private static boolean q(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.toLowerCase().endsWith(".flac")) || (paramString.toLowerCase().endsWith(".mp3")) || (paramString.toLowerCase().endsWith(".mid")) || (paramString.toLowerCase().endsWith(".xmf")) || (paramString.toLowerCase().endsWith(".mxmf")) || (paramString.toLowerCase().endsWith(".rtttl")) || (paramString.toLowerCase().endsWith(".rtx")) || (paramString.toLowerCase().endsWith(".ota")) || (paramString.toLowerCase().endsWith(".imy")));
  }

  private static boolean r(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.toLowerCase().endsWith(".pdf")) || (paramString.toLowerCase().endsWith(".pdf")));
  }

  public String a()
  {
    try
    {
      if (this.c != null)
      {
        Context localContext2 = (Context)this.c.get();
        if (localContext2 != null)
        {
          Constructor localConstructor = WebSettings.class.getDeclaredConstructor(new Class[] { Context.class, WebView.class });
          localConstructor.setAccessible(true);
          try
          {
            Object[] arrayOfObject = new Object[2];
            arrayOfObject[0] = localContext2.getApplicationContext();
            arrayOfObject[1] = null;
            String str2 = ((WebSettings)localConstructor.newInstance(arrayOfObject)).getUserAgentString();
            return str2;
          }
          finally
          {
            localConstructor.setAccessible(false);
          }
        }
      }
    }
    catch (Exception localException)
    {
      if ((Thread.currentThread().getName().equalsIgnoreCase("main")) && (this.c != null))
      {
        Context localContext1 = (Context)this.c.get();
        if (localContext1 != null)
        {
          return new WebView(localContext1).getSettings().getUserAgentString();
          String str1 = b();
          return str1;
        }
      }
    }
    return b();
  }

  public void a(AdMarvelAd paramAdMarvelAd)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramAdMarvelAd != null) && (paramAdMarvelAd.getPixels() != null))
    {
      Iterator localIterator = paramAdMarvelAd.getPixels().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("<img src=\"").append(str).append("\" />");
      }
    }
    if (localStringBuilder.length() > 0)
    {
      if (!Thread.currentThread().getName().equalsIgnoreCase("main"))
        break label145;
      if (this.c != null)
      {
        Context localContext = (Context)this.c.get();
        if (localContext != null)
          new WebView(localContext).loadDataWithBaseURL(null, localStringBuilder.toString(), "text/html", "utf-8", null);
      }
    }
    return;
    label145: this.e = localStringBuilder.toString();
    this.d.post(new Runnable()
    {
      public void run()
      {
        if (ab.a(ab.this) != null)
        {
          Context localContext = (Context)ab.a(ab.this).get();
          if (localContext != null)
            new WebView(localContext).loadDataWithBaseURL(null, ab.b(ab.this), "text/html", "utf-8", null);
        }
      }
    });
  }

  public void a(String paramString)
  {
    if (paramString == null);
    label4: StringBuilder localStringBuilder;
    Context localContext;
    do
    {
      do
      {
        do
        {
          break label4;
          do
            return;
          while (paramString.length() <= 0);
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("<img src=\"").append(paramString).append("\" />");
        }
        while (localStringBuilder.length() <= 0);
        if (!Thread.currentThread().getName().equalsIgnoreCase("main"))
          break;
      }
      while (this.c == null);
      localContext = (Context)this.c.get();
    }
    while (localContext == null);
    new WebView(localContext).loadDataWithBaseURL(null, localStringBuilder.toString(), "text/html", "utf-8", null);
    return;
    this.e = localStringBuilder.toString();
    this.d.post(new Runnable()
    {
      public void run()
      {
        if (ab.a(ab.this) != null)
        {
          Context localContext = (Context)ab.a(ab.this).get();
          if (localContext != null)
            new WebView(localContext).loadDataWithBaseURL(null, ab.b(ab.this), "text/html", "utf-8", null);
        }
      }
    });
  }

  public void a(String paramString, Handler paramHandler)
  {
    try
    {
      if ((ac.a() >= 11) && (paramHandler != null))
      {
        paramHandler.post(new ab.e(this, paramString));
        return;
      }
      new ab.d(this, paramString).execute(new Void[0]);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  // ERROR //
  void b(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: invokestatic 173	com/admarvel/android/ads/ac:a	()I
    //   8: bipush 11
    //   10: if_icmplt +205 -> 215
    //   13: aload_0
    //   14: getfield 33	com/admarvel/android/ads/ab:d	Landroid/os/Handler;
    //   17: new 1008	com/admarvel/android/ads/ab$b
    //   20: dup
    //   21: aconst_null
    //   22: invokespecial 1011	com/admarvel/android/ads/ab$b:<init>	(Lcom/admarvel/android/ads/ab$1;)V
    //   25: invokevirtual 988	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   28: pop
    //   29: new 1013	com/admarvel/android/ads/AdMarvelXMLReader
    //   32: dup
    //   33: invokespecial 1014	com/admarvel/android/ads/AdMarvelXMLReader:<init>	()V
    //   36: astore 11
    //   38: aload 11
    //   40: aload_1
    //   41: invokevirtual 1017	com/admarvel/android/ads/AdMarvelXMLReader:parseXMLString	(Ljava/lang/String;)V
    //   44: aload 11
    //   46: invokevirtual 1021	com/admarvel/android/ads/AdMarvelXMLReader:getParsedXMLData	()Lcom/admarvel/android/ads/AdMarvelXMLElement;
    //   49: astore 12
    //   51: aload 12
    //   53: invokevirtual 1026	com/admarvel/android/ads/AdMarvelXMLElement:c	()Ljava/util/LinkedHashMap;
    //   56: ldc_w 1028
    //   59: invokevirtual 1033	java/util/LinkedHashMap:containsKey	(Ljava/lang/Object;)Z
    //   62: ifeq +396 -> 458
    //   65: aload 12
    //   67: invokevirtual 1026	com/admarvel/android/ads/AdMarvelXMLElement:c	()Ljava/util/LinkedHashMap;
    //   70: ldc_w 1028
    //   73: invokevirtual 1034	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   76: checkcast 1036	java/util/ArrayList
    //   79: iconst_0
    //   80: invokevirtual 1039	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   83: checkcast 1023	com/admarvel/android/ads/AdMarvelXMLElement
    //   86: astore 13
    //   88: aload 13
    //   90: invokevirtual 1042	com/admarvel/android/ads/AdMarvelXMLElement:getAttributes	()Ljava/util/LinkedHashMap;
    //   93: ldc_w 1044
    //   96: invokevirtual 1034	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   99: checkcast 150	java/lang/String
    //   102: astore 4
    //   104: aload 13
    //   106: invokevirtual 1026	com/admarvel/android/ads/AdMarvelXMLElement:c	()Ljava/util/LinkedHashMap;
    //   109: ldc_w 1046
    //   112: invokevirtual 1033	java/util/LinkedHashMap:containsKey	(Ljava/lang/Object;)Z
    //   115: ifeq +338 -> 453
    //   118: aload 13
    //   120: invokevirtual 1026	com/admarvel/android/ads/AdMarvelXMLElement:c	()Ljava/util/LinkedHashMap;
    //   123: ldc_w 1046
    //   126: invokevirtual 1034	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   129: checkcast 1036	java/util/ArrayList
    //   132: invokevirtual 1047	java/util/ArrayList:size	()I
    //   135: istore 14
    //   137: iconst_0
    //   138: istore 15
    //   140: aconst_null
    //   141: astore_3
    //   142: iload 15
    //   144: iload 14
    //   146: if_icmpge +101 -> 247
    //   149: aload 13
    //   151: invokevirtual 1026	com/admarvel/android/ads/AdMarvelXMLElement:c	()Ljava/util/LinkedHashMap;
    //   154: ldc_w 1046
    //   157: invokevirtual 1034	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   160: checkcast 1036	java/util/ArrayList
    //   163: iload 15
    //   165: invokevirtual 1039	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   168: checkcast 1023	com/admarvel/android/ads/AdMarvelXMLElement
    //   171: astore 16
    //   173: aload 16
    //   175: ifnull +272 -> 447
    //   178: aload 16
    //   180: invokevirtual 1048	com/admarvel/android/ads/AdMarvelXMLElement:b	()Ljava/lang/String;
    //   183: astore 17
    //   185: aload_3
    //   186: ifnonnull +255 -> 441
    //   189: new 1036	java/util/ArrayList
    //   192: dup
    //   193: invokespecial 1049	java/util/ArrayList:<init>	()V
    //   196: astore 18
    //   198: aload 18
    //   200: aload 17
    //   202: invokevirtual 1052	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   205: pop
    //   206: iinc 15 1
    //   209: aload 18
    //   211: astore_3
    //   212: goto -70 -> 142
    //   215: aload_0
    //   216: getfield 33	com/admarvel/android/ads/ab:d	Landroid/os/Handler;
    //   219: new 1054	com/admarvel/android/ads/ab$a
    //   222: dup
    //   223: aconst_null
    //   224: invokespecial 1055	com/admarvel/android/ads/ab$a:<init>	(Lcom/admarvel/android/ads/ab$1;)V
    //   227: invokevirtual 988	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   230: pop
    //   231: goto -202 -> 29
    //   234: astore_2
    //   235: aconst_null
    //   236: astore_3
    //   237: aconst_null
    //   238: astore 4
    //   240: aload_2
    //   241: invokestatic 679	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   244: invokestatic 577	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   247: aload 4
    //   249: ifnull -245 -> 4
    //   252: aload 4
    //   254: invokevirtual 230	java/lang/String:length	()I
    //   257: ifle -253 -> 4
    //   260: aload_0
    //   261: getfield 31	com/admarvel/android/ads/ab:c	Ljava/lang/ref/WeakReference;
    //   264: ifnull +171 -> 435
    //   267: aload_0
    //   268: getfield 31	com/admarvel/android/ads/ab:c	Ljava/lang/ref/WeakReference;
    //   271: invokevirtual 916	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   274: checkcast 37	android/content/Context
    //   277: astore 5
    //   279: aload 5
    //   281: ifnull -277 -> 4
    //   284: aload 5
    //   286: aload 4
    //   288: invokestatic 1056	com/admarvel/android/ads/ab:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   291: ifne -287 -> 4
    //   294: aload_3
    //   295: ifnull -291 -> 4
    //   298: aload_3
    //   299: invokevirtual 1059	java/util/ArrayList:isEmpty	()Z
    //   302: ifne -298 -> 4
    //   305: ldc_w 1061
    //   308: invokestatic 1066	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   311: invokevirtual 693	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   314: ifeq -310 -> 4
    //   317: new 596	java/io/File
    //   320: dup
    //   321: invokestatic 1070	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   324: new 137	java/lang/StringBuilder
    //   327: dup
    //   328: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   331: ldc_w 493
    //   334: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: ldc_w 1072
    //   340: invokestatic 1074	com/admarvel/android/ads/ab:c	(Ljava/lang/String;)Ljava/lang/String;
    //   343: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: ldc_w 493
    //   349: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: aload 4
    //   354: invokestatic 1074	com/admarvel/android/ads/ab:c	(Ljava/lang/String;)Ljava/lang/String;
    //   357: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   363: invokespecial 1077	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   366: astore 7
    //   368: aload 7
    //   370: invokevirtual 1080	java/io/File:getParentFile	()Ljava/io/File;
    //   373: invokevirtual 1083	java/io/File:mkdirs	()Z
    //   376: pop
    //   377: new 1085	java/io/ObjectOutputStream
    //   380: dup
    //   381: new 1087	java/io/FileOutputStream
    //   384: dup
    //   385: aload 7
    //   387: invokespecial 1090	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   390: invokespecial 1093	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   393: astore 9
    //   395: aload 9
    //   397: aload_3
    //   398: invokevirtual 1096	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   401: aload 9
    //   403: invokevirtual 1097	java/io/ObjectOutputStream:close	()V
    //   406: return
    //   407: astore 6
    //   409: aload 6
    //   411: invokestatic 679	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   414: invokestatic 577	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   417: return
    //   418: astore_2
    //   419: aconst_null
    //   420: astore_3
    //   421: goto -181 -> 240
    //   424: astore_2
    //   425: aload 18
    //   427: astore_3
    //   428: goto -188 -> 240
    //   431: astore_2
    //   432: goto -192 -> 240
    //   435: aconst_null
    //   436: astore 5
    //   438: goto -159 -> 279
    //   441: aload_3
    //   442: astore 18
    //   444: goto -246 -> 198
    //   447: aload_3
    //   448: astore 18
    //   450: goto -244 -> 206
    //   453: aconst_null
    //   454: astore_3
    //   455: goto -208 -> 247
    //   458: aconst_null
    //   459: astore 4
    //   461: aconst_null
    //   462: astore_3
    //   463: goto -216 -> 247
    //
    // Exception table:
    //   from	to	target	type
    //   5	29	234	java/lang/Exception
    //   29	104	234	java/lang/Exception
    //   215	231	234	java/lang/Exception
    //   298	406	407	java/lang/Exception
    //   104	137	418	java/lang/Exception
    //   198	206	424	java/lang/Exception
    //   149	173	431	java/lang/Exception
    //   178	185	431	java/lang/Exception
    //   189	198	431	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.ab
 * JD-Core Version:    0.6.2
 */