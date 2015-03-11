package com.admarvel.android.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.b;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class e
{
  static String a(String paramString)
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

  static String b(String paramString)
  {
    try
    {
      String str = new String(b.a(URLDecoder.decode(paramString, "UTF-8"), 8), "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Logging.log(Log.getStackTraceString(localUnsupportedEncodingException));
    }
    return "";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.a.e
 * JD-Core Version:    0.6.2
 */