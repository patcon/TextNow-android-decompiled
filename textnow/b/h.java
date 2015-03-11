package textnow.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  public static long a(Context paramContext, String paramString, long paramLong)
  {
    SharedPreferences localSharedPreferences;
    if (paramContext != null)
      localSharedPreferences = paramContext.getSharedPreferences("zubhium-sdk", 0);
    try
    {
      long l = localSharedPreferences.getLong(paramString, paramLong);
      paramLong = l;
      return paramLong;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return paramLong;
  }

  public static String a(Context paramContext)
  {
    String str = "unknown";
    if (paramContext != null);
    try
    {
      str = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return str;
  }

  public static String a(Context paramContext, String paramString)
  {
    Object localObject = null;
    SharedPreferences localSharedPreferences;
    if (paramContext != null)
      localSharedPreferences = paramContext.getSharedPreferences("zubhium-sdk", 0);
    try
    {
      String str = localSharedPreferences.getString(paramString, "");
      localObject = str;
      return localObject;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return null;
  }

  static String a(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      byte[] arrayOfByte1 = paramString.getBytes("UTF-8");
      if (arrayOfByte1 != null)
        localMessageDigest.update(arrayOfByte1, 0, arrayOfByte1.length);
      byte[] arrayOfByte2 = localMessageDigest.digest();
      StringBuffer localStringBuffer = new StringBuffer();
      int i = 0;
      if (i < arrayOfByte2.length)
      {
        j = 0xF & arrayOfByte2[i] >>> 4;
        k = 0;
        if ((j >= 0) && (j <= 9))
          localStringBuffer.append((char)(j + 48));
        while (true)
        {
          m = 0xF & arrayOfByte2[i];
          n = k + 1;
          if (k <= 0)
            break label153;
          i++;
          break;
          localStringBuffer.append((char)(97 + (j - 10)));
        }
      }
      String str = localStringBuffer.toString();
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        int m;
        int n;
        break;
        label153: int k = n;
        int j = m;
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    return null;
  }

  public static JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("brand", Build.BRAND);
      localJSONObject.put("product", Build.PRODUCT);
      localJSONObject.put("sdk", Build.VERSION.RELEASE);
      localJSONObject.put("api-level", Build.VERSION.SDK_INT);
      localJSONObject.put("build", Build.ID);
      localJSONObject.put("locale", Locale.getDefault());
      return localJSONObject;
    }
    catch (Exception localException)
    {
    }
    return localJSONObject;
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramContext != null) && (!TextUtils.isEmpty(paramString1)) && (paramString2 != null))
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("zubhium-sdk", 0).edit();
      localEditor.putString(paramString1, paramString2);
      localEditor.commit();
    }
  }

  public static void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    if ((paramContext != null) && (!TextUtils.isEmpty(paramString)))
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("zubhium-sdk", 0).edit();
      localEditor.putBoolean(paramString, paramBoolean);
      localEditor.commit();
    }
  }

  public static String b(Context paramContext)
  {
    Object localObject = "unknown";
    if (paramContext != null);
    try
    {
      String str = Integer.toString(paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode);
      localObject = str;
      return localObject;
    }
    catch (Exception localException)
    {
    }
    return localObject;
  }

  public static String b(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramString.length() > 100)
        paramString = paramString.substring(0, 97) + "...";
      return paramString;
    }
    return null;
  }

  public static void b(Context paramContext, String paramString, long paramLong)
  {
    if ((paramContext != null) && (!TextUtils.isEmpty(paramString)))
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("zubhium-sdk", 0).edit();
      localEditor.putLong(paramString, paramLong);
      localEditor.commit();
    }
  }

  public static boolean b(Context paramContext, String paramString)
  {
    boolean bool = false;
    if (paramContext != null)
    {
      int i = paramContext.getPackageManager().checkPermission(paramString, paramContext.getPackageName());
      bool = false;
      if (i == 0)
        bool = true;
    }
    return bool;
  }

  public static boolean b(Context paramContext, String paramString, boolean paramBoolean)
  {
    SharedPreferences localSharedPreferences;
    if (paramContext != null)
      localSharedPreferences = paramContext.getSharedPreferences("zubhium-sdk", 0);
    try
    {
      boolean bool = localSharedPreferences.getBoolean(paramString, paramBoolean);
      paramBoolean = bool;
      return paramBoolean;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return paramBoolean;
  }

  public static String c(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    if (localTelephonyManager != null)
      return localTelephonyManager.getNetworkOperatorName();
    return null;
  }

  public static JSONObject d(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    while (true)
    {
      try
      {
        switch (((TelephonyManager)paramContext.getSystemService("phone")).getPhoneType())
        {
        default:
          localJSONObject.put("service_provider", c(paramContext));
          localJSONObject.put("phone_type", localObject);
          NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
          if (localNetworkInfo != null)
          {
            if (!localNetworkInfo.isAvailable())
              break label250;
            bool1 = true;
            localJSONObject.put("availability", bool1);
            localJSONObject.put("availability", false);
            if (!localNetworkInfo.isRoaming())
              break label256;
            bool2 = true;
            localJSONObject.put("on_roaming", bool2);
            if (!localNetworkInfo.isConnected())
              break label262;
            bool3 = true;
            localJSONObject.put("is_connected", bool3);
            if (!localNetworkInfo.isConnected())
              break label268;
            str = localNetworkInfo.getTypeName();
            localJSONObject.put("connection_type", str);
            return localJSONObject;
          }
          localJSONObject.put("availability", false);
          localJSONObject.put("is_connected", false);
          localJSONObject.put("on_roaming", false);
          return localJSONObject;
        case 0:
        case 1:
        case 2:
        }
      }
      catch (JSONException localJSONException)
      {
        return localJSONObject;
      }
      catch (Exception localException)
      {
        return localJSONObject;
      }
      Object localObject = "UNKNOWN";
      continue;
      localObject = "NONE";
      continue;
      localObject = "GSM";
      continue;
      localObject = "CDMA";
      continue;
      label250: boolean bool1 = false;
      continue;
      label256: boolean bool2 = false;
      continue;
      label262: boolean bool3 = false;
      continue;
      label268: String str = "";
    }
  }

  public static JSONObject e(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      Location localLocation = g(paramContext);
      if (localLocation == null)
        return null;
      localJSONObject.put("latitude", localLocation.getLatitude());
      localJSONObject.put("longitude", localLocation.getLongitude());
      return localJSONObject;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static boolean f(Context paramContext)
  {
    if (paramContext != null)
    {
      ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
      int i = 0x2 & localApplicationInfo.flags;
      localApplicationInfo.flags = i;
      if (i != 0)
        return true;
    }
    return false;
  }

  private static Location g(Context paramContext)
  {
    if ((b(paramContext, "android.permission.ACCESS_FINE_LOCATION")) || (b(paramContext, "android.permission.ACCESS_COARSE_LOCATION")))
      try
      {
        Location localLocation = ((LocationManager)paramContext.getSystemService("location")).getLastKnownLocation("network");
        return localLocation;
      }
      catch (Exception localException)
      {
      }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.b.h
 * JD-Core Version:    0.6.2
 */