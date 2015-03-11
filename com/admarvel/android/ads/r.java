package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.Camera;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.e;
import com.admarvel.android.util.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import java.util.zip.GZIPInputStream;

public class r
{
  public static String a = "";
  public static boolean b;
  private WeakReference<Context> c;
  private String d;

  public r(Context paramContext)
  {
    this.c = new WeakReference(paramContext);
  }

  public static float a(Context paramContext, int paramInt1, int paramInt2)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getApplicationContext().getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return Math.min(localDisplayMetrics.density, paramInt1 / paramInt2);
  }

  public static int a(float paramFloat, Context paramContext)
  {
    return (int)TypedValue.applyDimension(1, paramFloat, paramContext.getResources().getDisplayMetrics());
  }

  public static int a(AdMarvelUtils.ErrorReason paramErrorReason)
  {
    switch (5.a[paramErrorReason.ordinal()])
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

  public static r.q a(String paramString1, String paramString2)
  {
    if (paramString1.startsWith(paramString2 + "://"))
      return r.q.a;
    if (paramString1.startsWith(paramString2))
      return r.q.b;
    return r.q.c;
  }

  public static String a(Activity paramActivity)
  {
    int i = paramActivity.getRequestedOrientation();
    if (Version.getAndroidSDKVersion() < 9)
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

  public static String a(Context paramContext)
  {
    if (paramContext == null)
      throw new NullPointerException();
    boolean bool = c(paramContext, "android.permission.ACCESS_NETWORK_STATE");
    String str = null;
    int i;
    if (bool)
    {
      i = p(paramContext);
      if (i == 1)
        str = "wifi";
    }
    else
    {
      return str;
    }
    if (i == 0)
      return "mobile";
    return "none";
  }

  public static String a(FileInputStream paramFileInputStream, String paramString)
  {
    File localFile1 = new File(Environment.getExternalStorageDirectory() + "/" + ".admfiles");
    if (!localFile1.exists())
      localFile1.mkdirs();
    File localFile2 = new File(localFile1.getAbsolutePath() + "/" + paramString);
    byte[] arrayOfByte;
    if (!localFile2.exists())
      arrayOfByte = new byte[16384];
    try
    {
      localFile2.createNewFile();
      localFileOutputStream = new FileOutputStream(localFile2);
      while (true)
      {
        int i = paramFileInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        localFileOutputStream.write(arrayOfByte, 0, i);
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      FileOutputStream localFileOutputStream;
      localFileNotFoundException.printStackTrace();
      while (true)
      {
        return localFile2.getAbsolutePath();
        localFileOutputStream.close();
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
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
          localHttpURLConnection.setRequestProperty("User-Agent", new r(paramContext).a());
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

  public static String a(String paramString1, String paramString2, String paramString3, r.q paramq, Context paramContext)
  {
    if ((paramString1 != null) && (paramString1.length() > 0))
      paramString1 = paramString1.replace("content://" + paramContext.getPackageName() + ".AdMarvelLocalFileContentProvider", "");
    String str;
    if (paramq == r.q.a)
      str = paramString1.replaceFirst(paramString2 + "://", paramString3);
    r.q localq;
    do
    {
      return str;
      localq = r.q.b;
      str = null;
    }
    while (paramq != localq);
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
      if (c(paramContext, "android.permission.VIBRATE"))
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

  public static boolean a(Context paramContext, String paramString, boolean paramBoolean)
  {
    String str3;
    while (true)
    {
      Uri localUri2;
      Intent localIntent14;
      try
      {
        if (((!AdMarvelView.a) && (!AdMarvelInterstitialAds.enableOfflineSDK)) || (paramString == null) || (!paramString.contains("/")) || (URLUtil.isNetworkUrl(paramString)))
          break label784;
        str3 = paramString.substring(1 + paramString.lastIndexOf("/"));
        if (!l(str3))
          break;
        localUri2 = Uri.parse(str3);
        if (Version.getAndroidSDKVersion() > 18)
        {
          boolean bool3 = paramString.contains("?body=");
          String str7 = null;
          if (bool3)
            str7 = URLDecoder.decode(paramString.split("\\?body=")[1]);
          Intent localIntent15 = new Intent("android.intent.action.SENDTO", Uri.parse(paramString));
          if ((str7 != null) && (str7.trim().length() > 0))
            localIntent15.putExtra("sms_body", str7);
          if (!a(paramContext, localIntent15))
            break label369;
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
          if (paramBoolean)
            localIntent14.addFlags(8388608);
          if (!a(paramContext, localIntent14))
            break label369;
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
    }
    if (k(str3))
    {
      Intent localIntent9 = new Intent("android.intent.action.DIAL", Uri.parse(str3));
      localIntent9.addFlags(268435456);
      if (paramBoolean)
        localIntent9.addFlags(8388608);
      if (a(paramContext, localIntent9))
      {
        paramContext.startActivity(localIntent9);
        return true;
      }
    }
    try
    {
      label369: localFileInputStream = e(paramString);
      if ((localFileInputStream != null) && (str3 != null))
        if (r(paramString))
        {
          String str6 = a(localFileInputStream, str3);
          if (str6 == null)
            break label784;
          Intent localIntent13 = new Intent("android.intent.action.VIEW");
          localIntent13.addFlags(268435456);
          if (paramBoolean)
            localIntent13.addFlags(8388608);
          localIntent13.setDataAndType(Uri.fromFile(new File(str6)), "video/*");
          if (!a(paramContext, localIntent13))
            break label1552;
          paramContext.startActivity(localIntent13);
          return true;
        }
    }
    catch (Exception localException2)
    {
      FileInputStream localFileInputStream;
      if ((r(paramString)) || (t(paramString)) || (s(paramString)))
      {
        Logging.log(" ");
        return true;
        if (s(paramString))
        {
          String str5 = a(localFileInputStream, str3);
          if (str5 != null)
          {
            Intent localIntent12 = new Intent("android.intent.action.VIEW");
            localIntent12.addFlags(268435456);
            if (paramBoolean)
              localIntent12.addFlags(8388608);
            localIntent12.setDataAndType(Uri.fromFile(new File(str5)), "audio/*");
            if (!a(paramContext, localIntent12))
              break label1552;
            paramContext.startActivity(localIntent12);
            return true;
          }
        }
        else if (t(paramString))
        {
          String str4 = a(localFileInputStream, str3);
          if (str4 == null)
            break label1552;
          Intent localIntent10 = new Intent("android.intent.action.VIEW", Uri.parse(str4));
          localIntent10.setDataAndType(Uri.fromFile(new File(str4)), "application/pdf");
          localIntent10.setFlags(268435456);
          if (paramBoolean)
            localIntent10.addFlags(8388608);
          if (a(paramContext, localIntent10))
          {
            paramContext.startActivity(localIntent10);
            return true;
          }
          Intent localIntent11 = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
          localIntent11.addFlags(268435456);
          if (paramBoolean)
            localIntent11.addFlags(8388608);
          if (!a(paramContext, localIntent11))
            break label1552;
          paramContext.startActivity(localIntent11);
          return true;
          if ((r(paramString)) || (t(paramString)) || (s(paramString)))
          {
            Logging.log(" ");
            return true;
          }
        }
      }
    }
    label784: if ((paramString != null) && (paramString.length() > 0))
    {
      String str2 = paramString.replace("content://" + paramContext.getPackageName() + ".AdMarvelLocalFileContentProvider", "");
      paramString = str2;
    }
    try
    {
      if ((f(paramContext)) && (h(paramString)))
      {
        Intent localIntent8 = new Intent("android.intent.action.VIEW");
        localIntent8.addFlags(268435456);
        if (paramBoolean)
          localIntent8.addFlags(8388608);
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
      b = g(paramString);
      if ((AdMarvelView.a) || (AdMarvelInterstitialAds.enableOfflineSDK))
      {
        boolean bool1 = b;
        if (!bool1)
          break label1552;
      }
    }
    label1402: Intent localIntent2;
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
              if ((!f(paramContext)) || (!i(paramString)))
                break;
              localIntent7 = new Intent("android.intent.action.VIEW");
              localIntent7.addFlags(268435456);
              if (paramBoolean)
                localIntent7.addFlags(8388608);
              localIntent7.setDataAndType(Uri.parse(paramString), "audio/*");
            }
            while (!a(paramContext, localIntent7));
            paramContext.startActivity(localIntent7);
            return true;
            if ((f(paramContext)) && (o(paramString)))
            {
              Intent localIntent5 = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
              localIntent5.setDataAndType(Uri.parse(paramString), "application/pdf");
              localIntent5.setFlags(268435456);
              if (paramBoolean)
                localIntent5.addFlags(8388608);
              if (a(paramContext, localIntent5))
              {
                paramContext.startActivity(localIntent5);
                return true;
              }
              Intent localIntent6 = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
              localIntent6.addFlags(268435456);
              if (!a(paramContext, localIntent6))
                break label1552;
              paramContext.startActivity(localIntent6);
              return true;
            }
            if (!l(paramString))
              break label1402;
            if (Version.getAndroidSDKVersion() < 19)
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
            if (paramBoolean)
              localIntent3.addFlags(8388608);
            if (!a(paramContext, localIntent3))
              break;
            paramContext.startActivity(localIntent3);
            return true;
            localIntent3.putExtra("address", localUri1.toString().substring(4));
          }
          if (!k(paramString))
            break;
          localIntent1 = new Intent("android.intent.action.DIAL", Uri.parse(paramString));
          localIntent1.addFlags(268435456);
          if (paramBoolean)
            localIntent1.addFlags(8388608);
        }
        while (!a(paramContext, localIntent1));
        paramContext.startActivity(localIntent1);
        return true;
      }
      while ((!n(paramString)) && (!j(paramString)) && (!p(paramString)) && (!q(paramString)) && (!m(paramString)));
      localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      localIntent2.addFlags(268435456);
      if (paramBoolean)
        localIntent2.addFlags(8388608);
    }
    while (!a(paramContext, localIntent2));
    paramContext.startActivity(localIntent2);
    label1552: return true;
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
      if ((Version.getAndroidSDKVersion() >= 13) && (Version.getAndroidSDKVersion() <= 21))
        str = r.g.a(localTelephonyManager);
      else if ((Version.getAndroidSDKVersion() >= 11) && (Version.getAndroidSDKVersion() <= 12))
        str = r.f.a(localTelephonyManager);
      else if ((Version.getAndroidSDKVersion() >= 9) && (Version.getAndroidSDKVersion() <= 10))
        str = r.l.a(localTelephonyManager);
      else if (Version.getAndroidSDKVersion() == 8)
        str = r.k.a(localTelephonyManager);
      else if (Version.getAndroidSDKVersion() == 7)
        str = r.j.a(localTelephonyManager);
      else if ((Version.getAndroidSDKVersion() >= 5) && (Version.getAndroidSDKVersion() <= 6))
        str = r.i.a(localTelephonyManager);
      else
        str = r.h.a(localTelephonyManager);
    }
  }

  public static boolean b(Context paramContext, String paramString)
  {
    Object localObject1 = Boolean.valueOf(false);
    if ((Version.getAndroidSDKVersion() >= 7) && (paramString.equals("camera")))
      return Boolean.valueOf(r.m.a(paramContext, paramString)).booleanValue();
    if (Version.getAndroidSDKVersion() >= 8)
      return Boolean.valueOf(r.m.a(paramContext, paramString)).booleanValue();
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
            if (e.a().a(paramContext))
              localObject1 = Boolean.valueOf(true);
          }
          else if ((paramString.equals("compass")) && (e.a().b(paramContext)))
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

  public static boolean c()
  {
    return Version.getAndroidSDKVersion() == 16;
  }

  public static boolean c(Context paramContext, String paramString)
  {
    return paramContext.checkCallingOrSelfPermission(paramString) == 0;
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

  static String d(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(g.a(paramString.getBytes(), 8), "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Logging.log(Log.getStackTraceString(localUnsupportedEncodingException));
    }
    return "";
  }

  public static FileInputStream e(String paramString)
  {
    paramString.substring(0, paramString.lastIndexOf("/"));
    paramString.substring(1 + paramString.lastIndexOf("/"));
    File localFile = new File(paramString);
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(localFile);
      return localFileInputStream;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Logging.log("read file" + localFileNotFoundException.getMessage());
      return null;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
        Logging.log("read file" + localNullPointerException.getMessage());
    }
    catch (Exception localException)
    {
      while (true)
        Logging.log("read file" + localException.getMessage());
    }
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

  public static final boolean f(Context paramContext)
  {
    if (c(paramContext, "android.permission.ACCESS_NETWORK_STATE"))
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if ((localConnectivityManager.getActiveNetworkInfo() != null) && (localConnectivityManager.getActiveNetworkInfo().isAvailable()) && (localConnectivityManager.getActiveNetworkInfo().isConnected()))
        return true;
    }
    return false;
  }

  static boolean f(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.equals("admarvelsdk://noclick")) || (paramString.equals("admarvelsdk://nothing")));
  }

  @SuppressLint({"NewApi"})
  public static int g(Context paramContext)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getApplicationContext().getSystemService("window");
    if (Version.getAndroidSDKVersion() >= 13)
    {
      Point localPoint = new Point();
      localWindowManager.getDefaultDisplay().getSize(localPoint);
      return localPoint.x;
    }
    return localWindowManager.getDefaultDisplay().getWidth();
  }

  public static boolean g(String paramString)
  {
    return (a(paramString, "admarvelsdk") != r.q.c) || (a(paramString, "admarvelinternal") != r.q.c) || (a(paramString, "admarvelvideo") != r.q.c) || (a(paramString, "admarvelexternal") != r.q.c) || (a(paramString, "admarvelcustomvideo") != r.q.c);
  }

  @SuppressLint({"NewApi"})
  public static int h(Context paramContext)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getApplicationContext().getSystemService("window");
    if (Version.getAndroidSDKVersion() >= 13)
    {
      Point localPoint = new Point();
      localWindowManager.getDefaultDisplay().getSize(localPoint);
      return localPoint.y;
    }
    return localWindowManager.getDefaultDisplay().getHeight();
  }

  private static boolean h(String paramString)
  {
    boolean bool1 = false;
    if (paramString != null)
    {
      int i = paramString.length();
      bool1 = false;
      if (i > 0)
        if ((!paramString.toLowerCase().endsWith(".mp4")) && (!paramString.toLowerCase().endsWith(".3gp")) && (!paramString.toLowerCase().endsWith(".webm")))
        {
          boolean bool3 = paramString.toLowerCase().endsWith(".mkv");
          bool1 = false;
          if (!bool3)
            break label175;
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
          if ((!str.toLowerCase().endsWith(".mp4")) && (!str.toLowerCase().endsWith(".3gp")) && (!str.toLowerCase().endsWith(".webm")))
          {
            boolean bool2 = str.toLowerCase().endsWith(".mkv");
            bool1 = false;
            if (!bool2);
          }
          else
          {
            bool1 = true;
          }
      }
      label175: return bool1;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return false;
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

  public static boolean j(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getPhoneType() != 0;
  }

  private static boolean j(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && (paramString.toLowerCase().startsWith("google.streetview:"));
  }

  public static boolean k(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    return (localConnectivityManager.getActiveNetworkInfo() != null) && (localConnectivityManager.getActiveNetworkInfo().isAvailable()) && (localConnectivityManager.getActiveNetworkInfo().isConnected());
  }

  private static boolean k(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.toLowerCase().startsWith("tel:")) || (paramString.toLowerCase().startsWith("voicemail:")));
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
    return (paramString != null) && (paramString.length() > 0) && (paramString.toLowerCase().startsWith("sms:"));
  }

  public static void m(Context paramContext)
  {
    try
    {
      File localFile = new File(paramContext.getDir("Admarvel", 0), "admarvel_adHistory");
      if (localFile.isDirectory())
        new Thread(new Runnable()
        {
          public final void run()
          {
            try
            {
              File[] arrayOfFile = r.this.listFiles();
              int i = arrayOfFile.length;
              for (int j = 0; j < i; j++)
                arrayOfFile[j].delete();
              r.this.delete();
              return;
            }
            catch (Exception localException)
            {
              localException.printStackTrace();
            }
          }
        }).start();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  private static boolean m(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && (paramString.toLowerCase().startsWith("mailto:"));
  }

  public static void n(Context paramContext)
  {
    long l1 = Calendar.getInstance().getTimeInMillis();
    long l2 = AdMarvelUtils.getPreferenceValueLong(paramContext, "adm_viewport", "adm_video_cleanup_timestamp");
    if (l2 == -2147483648L)
      l2 = 0L;
    if (l1 - l2 >= 900000L)
      new Thread(new Runnable()
      {
        public final void run()
        {
          int i = 0;
          File localFile1 = r.this.getDir("adm_cache_files", 0);
          if (localFile1.isDirectory())
            try
            {
              File[] arrayOfFile = localFile1.listFiles();
              int j = arrayOfFile.length;
              while (i < j)
              {
                File localFile2 = arrayOfFile[i];
                if (System.currentTimeMillis() - localFile2.lastModified() > 840000L)
                  localFile2.delete();
                i++;
              }
            }
            catch (Exception localException)
            {
              AdMarvelUtils.setPreferenceValueLong(r.this, "adm_viewport", "adm_video_cleanup_timestamp", Calendar.getInstance().getTimeInMillis());
            }
        }
      }).start();
  }

  private static boolean n(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.toLowerCase().startsWith("geo:")) || (paramString.toLowerCase().startsWith("http://maps.google")) || (paramString.toLowerCase().startsWith("https://maps.google")));
  }

  public static void o(Context paramContext)
  {
    long l1 = Calendar.getInstance().getTimeInMillis();
    long l2 = AdMarvelUtils.getPreferenceValueLong(paramContext, "adm_viewport", "adm_mraid_download_timestamp");
    if (l2 == -2147483648L)
      l2 = 0L;
    String str;
    File localFile2;
    Object localObject;
    FileOutputStream localFileOutputStream;
    if (l1 - l2 >= 86400000L)
    {
      File localFile1 = paramContext.getDir("adm_mraid_file", 0);
      str = localFile1.getAbsolutePath() + "/mraid.js";
      try
      {
        localFile2 = new File(str + ".PROCESSING");
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL("http://admarvel.s3.amazonaws.com/js/admarvel_mraid_v2_complete.js").openConnection();
        localHttpURLConnection.setRequestMethod("GET");
        localHttpURLConnection.setDoOutput(false);
        localHttpURLConnection.setDoInput(true);
        localHttpURLConnection.setUseCaches(false);
        localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        localHttpURLConnection.setRequestProperty("Content-Length", "0");
        localHttpURLConnection.setConnectTimeout(2000);
        localHttpURLConnection.setReadTimeout(10000);
        int i = localHttpURLConnection.getResponseCode();
        int j = localHttpURLConnection.getContentLength();
        Logging.log("Mraid Connection Status Code: " + i);
        Logging.log("Mraid Content Length: " + j);
        if (i == 200)
        {
          localObject = (InputStream)localHttpURLConnection.getContent();
          if (("gzip".equals(localHttpURLConnection.getContentEncoding())) && (Version.getAndroidSDKVersion() < 9))
            localObject = new GZIPInputStream((InputStream)localObject);
          if (localObject != null)
          {
            localFileOutputStream = new FileOutputStream(localFile2);
            byte[] arrayOfByte = new byte[4096];
            while (true)
            {
              int k = ((InputStream)localObject).read(arrayOfByte);
              if (k == -1)
                break;
              localFileOutputStream.write(arrayOfByte, 0, k);
            }
          }
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
      }
    }
    else
    {
      return;
    }
    File localFile3 = new File(str);
    if (localFile3.exists())
      localFile3.delete();
    localFile2.renameTo(localFile3);
    if (localFile2.exists())
      localFile2.delete();
    ((InputStream)localObject).close();
    localFileOutputStream.flush();
    Logging.log("Mraid File updated ");
    AdMarvelUtils.setPreferenceValueLong(paramContext, "adm_viewport", "adm_mraid_download_timestamp", Calendar.getInstance().getTimeInMillis());
  }

  private static boolean o(String paramString)
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

  private static int p(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo != null)
    {
      if (localNetworkInfo.getType() == 1)
        return 1;
      if (localNetworkInfo.getType() == 0)
        return 0;
    }
    return -1;
  }

  private static boolean p(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.toLowerCase().startsWith("market://")) || (paramString.toLowerCase().startsWith("https://play.google.com")) || (paramString.toLowerCase().startsWith("https://play.google.com")));
  }

  private static boolean q(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && (paramString.toLowerCase().startsWith("vzw://"));
  }

  private static boolean r(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.toLowerCase().endsWith(".mp4")) || (paramString.toLowerCase().endsWith(".3gp")));
  }

  private static boolean s(String paramString)
  {
    return (paramString != null) && (paramString.length() > 0) && ((paramString.toLowerCase().endsWith(".flac")) || (paramString.toLowerCase().endsWith(".mp3")) || (paramString.toLowerCase().endsWith(".mid")) || (paramString.toLowerCase().endsWith(".xmf")) || (paramString.toLowerCase().endsWith(".mxmf")) || (paramString.toLowerCase().endsWith(".rtttl")) || (paramString.toLowerCase().endsWith(".rtx")) || (paramString.toLowerCase().endsWith(".ota")) || (paramString.toLowerCase().endsWith(".imy")));
  }

  private static boolean t(String paramString)
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
    label145: this.d = localStringBuilder.toString();
    new Handler(Looper.getMainLooper()).post(new Runnable()
    {
      public void run()
      {
        if (r.a(r.this) != null)
        {
          Context localContext = (Context)r.a(r.this).get();
          if (localContext != null)
            new WebView(localContext).loadDataWithBaseURL(null, r.b(r.this), "text/html", "utf-8", null);
        }
      }
    });
  }

  public void a(String paramString)
  {
    try
    {
      if (Version.getAndroidSDKVersion() >= 11)
      {
        new Thread(new r.o(this, paramString)).start();
        return;
      }
      new r.n(this, paramString).execute(new Void[0]);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void a(String paramString, Handler paramHandler)
  {
    try
    {
      if ((Version.getAndroidSDKVersion() >= 11) && (paramHandler != null))
      {
        paramHandler.post(new r.o(this, paramString));
        return;
      }
      new r.n(this, paramString).execute(new Void[0]);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void b(String paramString)
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
    this.d = localStringBuilder.toString();
    new Handler(Looper.getMainLooper()).post(new Runnable()
    {
      public void run()
      {
        if (r.a(r.this) != null)
        {
          Context localContext = (Context)r.a(r.this).get();
          if (localContext != null)
            new WebView(localContext).loadDataWithBaseURL(null, r.b(r.this), "text/html", "utf-8", null);
        }
      }
    });
  }

  // ERROR //
  void c(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: invokestatic 186	com/admarvel/android/ads/Version:getAndroidSDKVersion	()I
    //   8: bipush 11
    //   10: if_icmplt +208 -> 218
    //   13: invokestatic 1153	com/admarvel/android/util/f:a	()Lcom/admarvel/android/util/f;
    //   16: invokevirtual 1156	com/admarvel/android/util/f:b	()Ljava/util/concurrent/ExecutorService;
    //   19: new 1158	com/admarvel/android/ads/r$b
    //   22: dup
    //   23: aconst_null
    //   24: invokespecial 1161	com/admarvel/android/ads/r$b:<init>	(Lcom/admarvel/android/ads/r$1;)V
    //   27: invokeinterface 1165 2 0
    //   32: new 1167	com/admarvel/android/ads/AdMarvelXMLReader
    //   35: dup
    //   36: invokespecial 1168	com/admarvel/android/ads/AdMarvelXMLReader:<init>	()V
    //   39: astore 11
    //   41: aload 11
    //   43: aload_1
    //   44: invokevirtual 1171	com/admarvel/android/ads/AdMarvelXMLReader:parseXMLString	(Ljava/lang/String;)V
    //   47: aload 11
    //   49: invokevirtual 1175	com/admarvel/android/ads/AdMarvelXMLReader:getParsedXMLData	()Lcom/admarvel/android/ads/AdMarvelXMLElement;
    //   52: astore 12
    //   54: aload 12
    //   56: invokevirtual 1181	com/admarvel/android/ads/AdMarvelXMLElement:getChildren	()Ljava/util/LinkedHashMap;
    //   59: ldc_w 1183
    //   62: invokevirtual 1188	java/util/LinkedHashMap:containsKey	(Ljava/lang/Object;)Z
    //   65: ifeq +400 -> 465
    //   68: aload 12
    //   70: invokevirtual 1181	com/admarvel/android/ads/AdMarvelXMLElement:getChildren	()Ljava/util/LinkedHashMap;
    //   73: ldc_w 1183
    //   76: invokevirtual 1189	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   79: checkcast 1191	java/util/ArrayList
    //   82: iconst_0
    //   83: invokevirtual 1194	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   86: checkcast 1177	com/admarvel/android/ads/AdMarvelXMLElement
    //   89: astore 13
    //   91: aload 13
    //   93: invokevirtual 1197	com/admarvel/android/ads/AdMarvelXMLElement:getAttributes	()Ljava/util/LinkedHashMap;
    //   96: ldc_w 1199
    //   99: invokevirtual 1189	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   102: checkcast 162	java/lang/String
    //   105: astore 4
    //   107: aload 13
    //   109: invokevirtual 1181	com/admarvel/android/ads/AdMarvelXMLElement:getChildren	()Ljava/util/LinkedHashMap;
    //   112: ldc_w 1201
    //   115: invokevirtual 1188	java/util/LinkedHashMap:containsKey	(Ljava/lang/Object;)Z
    //   118: ifeq +342 -> 460
    //   121: aload 13
    //   123: invokevirtual 1181	com/admarvel/android/ads/AdMarvelXMLElement:getChildren	()Ljava/util/LinkedHashMap;
    //   126: ldc_w 1201
    //   129: invokevirtual 1189	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   132: checkcast 1191	java/util/ArrayList
    //   135: invokevirtual 1202	java/util/ArrayList:size	()I
    //   138: istore 14
    //   140: iconst_0
    //   141: istore 15
    //   143: aconst_null
    //   144: astore_3
    //   145: iload 15
    //   147: iload 14
    //   149: if_icmpge +107 -> 256
    //   152: aload 13
    //   154: invokevirtual 1181	com/admarvel/android/ads/AdMarvelXMLElement:getChildren	()Ljava/util/LinkedHashMap;
    //   157: ldc_w 1201
    //   160: invokevirtual 1189	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   163: checkcast 1191	java/util/ArrayList
    //   166: iload 15
    //   168: invokevirtual 1194	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   171: checkcast 1177	com/admarvel/android/ads/AdMarvelXMLElement
    //   174: astore 16
    //   176: aload 16
    //   178: ifnull +276 -> 454
    //   181: aload 16
    //   183: invokevirtual 1205	com/admarvel/android/ads/AdMarvelXMLElement:getData	()Ljava/lang/String;
    //   186: astore 17
    //   188: aload_3
    //   189: ifnonnull +259 -> 448
    //   192: new 1191	java/util/ArrayList
    //   195: dup
    //   196: invokespecial 1206	java/util/ArrayList:<init>	()V
    //   199: astore 18
    //   201: aload 18
    //   203: aload 17
    //   205: invokevirtual 1209	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   208: pop
    //   209: iinc 15 1
    //   212: aload 18
    //   214: astore_3
    //   215: goto -70 -> 145
    //   218: new 1112	android/os/Handler
    //   221: dup
    //   222: invokestatic 1118	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   225: invokespecial 1121	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   228: new 1211	com/admarvel/android/ads/r$a
    //   231: dup
    //   232: aconst_null
    //   233: invokespecial 1212	com/admarvel/android/ads/r$a:<init>	(Lcom/admarvel/android/ads/r$1;)V
    //   236: invokevirtual 1130	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   239: pop
    //   240: goto -208 -> 32
    //   243: astore_2
    //   244: aconst_null
    //   245: astore_3
    //   246: aconst_null
    //   247: astore 4
    //   249: aload_2
    //   250: invokestatic 780	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   253: invokestatic 537	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   256: aload 4
    //   258: ifnull -254 -> 4
    //   261: aload 4
    //   263: invokevirtual 289	java/lang/String:length	()I
    //   266: ifle -262 -> 4
    //   269: aload_0
    //   270: getfield 29	com/admarvel/android/ads/r:c	Ljava/lang/ref/WeakReference;
    //   273: ifnull +169 -> 442
    //   276: aload_0
    //   277: getfield 29	com/admarvel/android/ads/r:c	Ljava/lang/ref/WeakReference;
    //   280: invokevirtual 1049	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   283: checkcast 32	android/content/Context
    //   286: astore 5
    //   288: aload 5
    //   290: ifnull -286 -> 4
    //   293: aload 5
    //   295: aload 4
    //   297: invokestatic 1213	com/admarvel/android/ads/r:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   300: ifne -296 -> 4
    //   303: aload_3
    //   304: ifnull -300 -> 4
    //   307: aload_3
    //   308: invokevirtual 1216	java/util/ArrayList:isEmpty	()Z
    //   311: ifne -307 -> 4
    //   314: ldc_w 1218
    //   317: invokestatic 1221	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   320: invokevirtual 718	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   323: ifeq -319 -> 4
    //   326: new 232	java/io/File
    //   329: dup
    //   330: invokestatic 238	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   333: new 149	java/lang/StringBuilder
    //   336: dup
    //   337: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   340: ldc 243
    //   342: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: ldc_w 1223
    //   348: invokestatic 1225	com/admarvel/android/ads/r:d	(Ljava/lang/String;)Ljava/lang/String;
    //   351: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: ldc 243
    //   356: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: aload 4
    //   361: invokestatic 1225	com/admarvel/android/ads/r:d	(Ljava/lang/String;)Ljava/lang/String;
    //   364: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   370: invokespecial 960	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   373: astore 7
    //   375: aload 7
    //   377: invokevirtual 1228	java/io/File:getParentFile	()Ljava/io/File;
    //   380: invokevirtual 255	java/io/File:mkdirs	()Z
    //   383: pop
    //   384: new 1230	java/io/ObjectOutputStream
    //   387: dup
    //   388: new 263	java/io/FileOutputStream
    //   391: dup
    //   392: aload 7
    //   394: invokespecial 266	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   397: invokespecial 1233	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   400: astore 9
    //   402: aload 9
    //   404: aload_3
    //   405: invokevirtual 1236	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   408: aload 9
    //   410: invokevirtual 1237	java/io/ObjectOutputStream:close	()V
    //   413: return
    //   414: astore 6
    //   416: aload 6
    //   418: invokestatic 780	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   421: invokestatic 537	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   424: return
    //   425: astore_2
    //   426: aconst_null
    //   427: astore_3
    //   428: goto -179 -> 249
    //   431: astore_2
    //   432: aload 18
    //   434: astore_3
    //   435: goto -186 -> 249
    //   438: astore_2
    //   439: goto -190 -> 249
    //   442: aconst_null
    //   443: astore 5
    //   445: goto -157 -> 288
    //   448: aload_3
    //   449: astore 18
    //   451: goto -250 -> 201
    //   454: aload_3
    //   455: astore 18
    //   457: goto -248 -> 209
    //   460: aconst_null
    //   461: astore_3
    //   462: goto -206 -> 256
    //   465: aconst_null
    //   466: astore 4
    //   468: aconst_null
    //   469: astore_3
    //   470: goto -214 -> 256
    //
    // Exception table:
    //   from	to	target	type
    //   5	32	243	java/lang/Exception
    //   32	107	243	java/lang/Exception
    //   218	240	243	java/lang/Exception
    //   307	413	414	java/lang/Exception
    //   107	140	425	java/lang/Exception
    //   201	209	431	java/lang/Exception
    //   152	176	438	java/lang/Exception
    //   181	188	438	java/lang/Exception
    //   192	201	438	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.r
 * JD-Core Version:    0.6.2
 */