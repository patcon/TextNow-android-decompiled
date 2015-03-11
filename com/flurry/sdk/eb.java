package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

public class eb
{
  private static final String a = eb.class.getSimpleName();
  private static String b;
  private static String c;

  public static String a()
  {
    try
    {
      String str;
      if (!TextUtils.isEmpty(b))
        str = b;
      while (true)
      {
        return str;
        if (!TextUtils.isEmpty(c))
        {
          str = c;
        }
        else
        {
          str = b();
          c = str;
        }
      }
    }
    finally
    {
    }
  }

  public static void a(String paramString)
  {
    b = paramString;
  }

  private static String b()
  {
    try
    {
      Context localContext = do.a().b();
      PackageInfo localPackageInfo = localContext.getPackageManager().getPackageInfo(localContext.getPackageName(), 0);
      if (localPackageInfo.versionName != null)
        return localPackageInfo.versionName;
      if (localPackageInfo.versionCode != 0)
      {
        String str = Integer.toString(localPackageInfo.versionCode);
        return str;
      }
    }
    catch (Throwable localThrowable)
    {
      eo.a(6, a, "", localThrowable);
    }
    return "Unknown";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.eb
 * JD-Core Version:    0.6.2
 */