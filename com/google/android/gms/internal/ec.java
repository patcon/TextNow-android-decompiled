package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

public final class ec
{
  public final int rb;
  public final boolean rc;
  public final boolean rd;
  public final String re;
  public final String rf;
  public final boolean rg;
  public final boolean rh;
  public final boolean ri;
  public final String rj;
  public final String rk;
  public final int rl;
  public final int rm;
  public final int rn;
  public final int ro;
  public final int rp;
  public final int rq;
  public final float rr;
  public final int rs;
  public final int rt;
  public final double ru;
  public final boolean rv;
  public final boolean rw;
  public final int rx;

  public ec(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    Locale localLocale = Locale.getDefault();
    PackageManager localPackageManager = paramContext.getPackageManager();
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    Intent localIntent = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    this.rb = localAudioManager.getMode();
    boolean bool2;
    boolean bool3;
    if (a(localPackageManager, "geo:0,0?q=donuts") != null)
    {
      bool2 = bool1;
      this.rc = bool2;
      if (a(localPackageManager, "http://www.google.com") == null)
        break label373;
      bool3 = bool1;
      label114: this.rd = bool3;
      this.re = localTelephonyManager.getNetworkOperator();
      this.rf = localLocale.getCountry();
      this.rg = et.bV();
      this.rh = localAudioManager.isMusicActive();
      this.ri = localAudioManager.isSpeakerphoneOn();
      this.rj = localLocale.getLanguage();
      this.rk = a(localPackageManager);
      this.rl = localAudioManager.getStreamVolume(3);
      this.rm = a(paramContext, localConnectivityManager, localPackageManager);
      this.rn = localTelephonyManager.getNetworkType();
      this.ro = localTelephonyManager.getPhoneType();
      this.rp = localAudioManager.getRingerMode();
      this.rq = localAudioManager.getStreamVolume(2);
      this.rr = localDisplayMetrics.density;
      this.rs = localDisplayMetrics.widthPixels;
      this.rt = localDisplayMetrics.heightPixels;
      if (localIntent == null)
        break label384;
      int i = localIntent.getIntExtra("status", -1);
      int j = localIntent.getIntExtra("level", -1);
      int k = localIntent.getIntExtra("scale", -1);
      this.ru = (j / k);
      if ((i != 2) && (i != 5))
        break label379;
      label321: this.rv = bool1;
    }
    while (true)
      if (Build.VERSION.SDK_INT >= 16)
      {
        this.rw = localConnectivityManager.isActiveNetworkMetered();
        if (localConnectivityManager.getActiveNetworkInfo() != null)
        {
          this.rx = localConnectivityManager.getActiveNetworkInfo().getDetailedState().ordinal();
          return;
          bool2 = false;
          break;
          label373: bool3 = false;
          break label114;
          label379: bool1 = false;
          break label321;
          label384: this.ru = -1.0D;
          this.rv = false;
          continue;
        }
        this.rx = -1;
        return;
      }
    this.rw = false;
    this.rx = -1;
  }

  private static int a(Context paramContext, ConnectivityManager paramConnectivityManager, PackageManager paramPackageManager)
  {
    int i = -2;
    if (eo.a(paramPackageManager, paramContext.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
    {
      NetworkInfo localNetworkInfo = paramConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo != null)
        i = localNetworkInfo.getType();
    }
    else
    {
      return i;
    }
    return -1;
  }

  private static ResolveInfo a(PackageManager paramPackageManager, String paramString)
  {
    return paramPackageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)), 65536);
  }

  private static String a(PackageManager paramPackageManager)
  {
    ResolveInfo localResolveInfo = a(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (localResolveInfo == null);
    while (true)
    {
      return null;
      ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
      if (localActivityInfo != null)
        try
        {
          PackageInfo localPackageInfo = paramPackageManager.getPackageInfo(localActivityInfo.packageName, 0);
          if (localPackageInfo != null)
          {
            String str = localPackageInfo.versionCode + "." + localActivityInfo.packageName;
            return str;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
        }
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ec
 * JD-Core Version:    0.6.2
 */