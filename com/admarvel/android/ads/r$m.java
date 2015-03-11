package com.admarvel.android.ads;

import android.content.Context;
import android.content.pm.PackageManager;

class r$m
{
  public static boolean a(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (paramString.equals("camera"))
      return localPackageManager.hasSystemFeature("android.hardware.camera");
    if (Version.getAndroidSDKVersion() >= 8)
    {
      if (paramString.equals("location"))
        return localPackageManager.hasSystemFeature("android.hardware.location");
      if (paramString.equals("accelerometer"))
        return localPackageManager.hasSystemFeature("android.hardware.sensor.accelerometer");
      if (paramString.equals("compass"))
        return localPackageManager.hasSystemFeature("android.hardware.sensor.compass");
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.r.m
 * JD-Core Version:    0.6.2
 */