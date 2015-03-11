package com.mopub.common.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StatFs;
import android.provider.Settings.Secure;
import com.mopub.common.logging.MoPubLog;
import java.io.File;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DeviceUtils
{
  private static final int MAX_DISK_CACHE_SIZE = 104857600;
  private static final int MAX_MEMORY_CACHE_SIZE = 31457280;
  private static final int MIN_DISK_CACHE_SIZE = 31457280;

  public static long diskCacheSizeBytes(File paramFile)
  {
    try
    {
      StatFs localStatFs = new StatFs(paramFile.getAbsolutePath());
      l = localStatFs.getBlockCount() * localStatFs.getBlockSize() / 50L;
      return Math.max(Math.min(l, 104857600L), 31457280L);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
      {
        MoPubLog.d("Unable to calculate 2% of available disk space, defaulting to minimum");
        long l = 31457280L;
      }
    }
  }

  public static String getHashedUdid(Context paramContext)
  {
    if (paramContext == null)
      return null;
    return Utils.sha1(Settings.Secure.getString(paramContext.getContentResolver(), "android_id"));
  }

  public static String getIpAddress(DeviceUtils.IP paramIP)
  {
    String str;
    do
    {
      InetAddress localInetAddress;
      do
      {
        Iterator localIterator1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        Iterator localIterator2;
        while (!localIterator2.hasNext())
        {
          if (!localIterator1.hasNext())
            break;
          localIterator2 = Collections.list(((NetworkInterface)localIterator1.next()).getInetAddresses()).iterator();
        }
        localInetAddress = (InetAddress)localIterator2.next();
      }
      while (localInetAddress.isLoopbackAddress());
      str = localInetAddress.getHostAddress().toUpperCase();
    }
    while (!DeviceUtils.IP.access$000(paramIP, str));
    return DeviceUtils.IP.access$100(paramIP, str);
    return null;
  }

  public static String getUserAgent()
  {
    return System.getProperty("http.agent");
  }

  public static boolean isNetworkAvailable(Context paramContext)
  {
    if (paramContext == null)
      return false;
    if (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
      return false;
    if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == -1)
      return true;
    try
    {
      boolean bool = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo().isConnected();
      return bool;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public static int memoryCacheSizeBytes(Context paramContext)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    long l1 = localActivityManager.getMemoryClass();
    if (VersionCode.currentApiLevel().isAtLeast(VersionCode.HONEYCOMB));
    try
    {
      int i = ApplicationInfo.class.getDeclaredField("FLAG_LARGE_HEAP").getInt(null);
      if (Utils.bitMaskContainsFlag(paramContext.getApplicationInfo().flags, i))
      {
        int j = ((Integer)new Reflection.MethodBuilder(localActivityManager, "getLargeMemoryClass").execute()).intValue();
        l2 = j;
        l1 = l2;
        return (int)Math.min(31457280L, 1024L * (1024L * (l1 / 8L)));
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        MoPubLog.d("Unable to reflectively determine large heap size on Honeycomb and above.");
        continue;
        long l2 = l1;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.DeviceUtils
 * JD-Core Version:    0.6.2
 */