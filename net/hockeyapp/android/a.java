package net.hockeyapp.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.io.File;

public final class a
{
  public static String a = null;
  public static String b = null;
  public static String c = null;
  public static String d = null;
  public static String e = null;
  public static String f = null;
  public static String g = null;

  private static int a(Context paramContext, PackageManager paramPackageManager)
  {
    try
    {
      Bundle localBundle = paramPackageManager.getApplicationInfo(paramContext.getPackageName(), 128).metaData;
      int i = 0;
      if (localBundle != null)
      {
        int j = localBundle.getInt("buildNumber", 0);
        i = j;
      }
      return i;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0;
  }

  public static void a(Context paramContext)
  {
    e = Build.VERSION.RELEASE;
    f = Build.MODEL;
    g = Build.MANUFACTURER;
    if (paramContext != null);
    try
    {
      File localFile = paramContext.getFilesDir();
      if (localFile != null)
        a = localFile.getAbsolutePath();
      if (paramContext == null);
    }
    catch (Exception localException2)
    {
      try
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        PackageInfo localPackageInfo = localPackageManager.getPackageInfo(paramContext.getPackageName(), 0);
        d = localPackageInfo.packageName;
        b = "" + localPackageInfo.versionCode;
        c = localPackageInfo.versionName;
        int i = a(paramContext, localPackageManager);
        if ((i != 0) && (i > localPackageInfo.versionCode))
          b = "" + i;
        return;
        localException2 = localException2;
        localException2.printStackTrace();
      }
      catch (Exception localException1)
      {
        localException1.printStackTrace();
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     net.hockeyapp.android.a
 * JD-Core Version:    0.6.2
 */