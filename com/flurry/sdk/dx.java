package com.flurry.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public final class dx
{
  private static final String a = dx.class.getSimpleName();

  public static PackageInfo a(Context paramContext)
  {
    Object localObject = null;
    if (paramContext != null);
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 20815);
      localObject = localPackageInfo;
      return localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      eo.a(a, "Cannot find package info for package: " + paramContext.getPackageName());
    }
    return null;
  }

  public static ApplicationInfo b(Context paramContext)
  {
    Object localObject = null;
    if (paramContext != null);
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      localObject = localApplicationInfo;
      return localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      eo.a(a, "Cannot find application info for package: " + paramContext.getPackageName());
    }
    return null;
  }

  public static String c(Context paramContext)
  {
    PackageInfo localPackageInfo = a(paramContext);
    if ((localPackageInfo != null) && (localPackageInfo.packageName != null))
      return localPackageInfo.packageName;
    return "";
  }

  public static Bundle d(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = b(paramContext);
    if ((localApplicationInfo != null) && (localApplicationInfo.metaData != null))
      return localApplicationInfo.metaData;
    return Bundle.EMPTY;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dx
 * JD-Core Version:    0.6.2
 */