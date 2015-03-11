package com.mologiq.analytics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

@SuppressLint({"NewApi"})
final class t extends AsyncTask<Object, Object, Object>
{
  private final WeakReference<Context> a;

  t(Context paramContext)
  {
    this.a = new WeakReference(paramContext);
  }

  protected final Object doInBackground(Object[] paramArrayOfObject)
  {
    label385: label904: label1348: label1490: 
    try
    {
      WeakReference localWeakReference = this.a;
      localContext = null;
      if (localWeakReference != null)
      {
        localContext = (Context)this.a.get();
        break label1490;
        localag1 = ag.d(localContext);
        if (localag1.b())
          return null;
        localah = ah.b();
        localah.a(localContext);
        while (true)
        {
          o localo;
          try
          {
            localag2 = ag.d(localContext);
            localo = o.a(localContext);
            if (localag2.h())
            {
              List localList2 = localo.f();
              if ((localList2 == null) || (localList2.size() <= 0) || (System.currentTimeMillis() - localag2.p() > localag2.n()))
                break label344;
              localah.a(localList2);
            }
            localah.a(1 + localo.d());
            Map localMap = localag2.r();
            if (localMap == null)
              break label385;
            Iterator localIterator1 = localMap.values().iterator();
            localArrayList1 = null;
            if (!localIterator1.hasNext())
              break;
            m localm = (m)localIterator1.next();
            if (localArrayList1 == null)
              localArrayList1 = new ArrayList();
            if (!ak.b(localContext, localm.b))
              continue;
            localArrayList1.add(Integer.valueOf(localm.a));
            continue;
          }
          catch (Throwable localThrowable)
          {
            ak.a(ak.a(localThrowable));
          }
          if ((localah.b(localContext)) || (System.currentTimeMillis() - localag1.o() > localag1.m()))
          {
            new ak(localContext);
            if (localag1.t() != 0)
              break label1348;
            String str4 = ak.a(localag1.c(), "", localContext, 500, 1000, false);
            if ((str4 != null) && (str4.length() > 0))
            {
              localag1.a(Integer.parseInt(str4));
              localag1.b(localContext);
            }
          }
          return null;
          label344: localag2.b(System.currentTimeMillis());
          localo.a(localContext, localag2.u());
        }
      }
    }
    catch (Exception localException1)
    {
      Context localContext;
      label486: label885: 
      do
      {
        ag localag1;
        ah localah;
        ag localag2;
        LocationManager localLocationManager;
        while (true)
        {
          ArrayList localArrayList1;
          ak.a(ak.a(localException1));
          continue;
          localah.b(localArrayList1);
          try
          {
            ApplicationInfo localApplicationInfo = localContext.getPackageManager().getApplicationInfo(localContext.getPackageName(), 0);
            PackageManager localPackageManager = localContext.getApplicationContext().getPackageManager();
            if ((localApplicationInfo != null) && (localPackageManager != null))
              localah.b(localPackageManager.getApplicationLabel(localApplicationInfo).toString());
          }
          catch (Exception localException2)
          {
            try
            {
              g localg = g.a(localContext);
              String str9 = localg.a();
              boolean bool2 = localg.b();
              if ((str9 != null) && (str9.length() > 0))
              {
                localah.i(str9);
                localah.a(bool2);
              }
              while (true)
              {
                localah.c(Build.VERSION.RELEASE);
                localah.d(Build.MODEL);
                localah.e(Build.DEVICE);
                localah.k(Build.MANUFACTURER);
                localah.g(Build.BRAND);
                TimeZone localTimeZone = TimeZone.getDefault();
                String str5 = localTimeZone.getDisplayName(Locale.getDefault());
                if (str5 != null)
                  localah.l(str5);
                String str6 = localTimeZone.getID();
                if (str6 != null)
                  localah.m(str6);
                localah.n(Locale.getDefault().getCountry());
                if ((localContext instanceof Activity))
                {
                  DisplayMetrics localDisplayMetrics = localContext.getApplicationContext().getResources().getDisplayMetrics();
                  if (localDisplayMetrics != null)
                    localah.o(localDisplayMetrics.widthPixels + "*" + localDisplayMetrics.heightPixels);
                }
                localah.h(Locale.getDefault().getDisplayLanguage());
                if ((!ak.a(localContext, "android.permission.ACCESS_WIFI_STATE")) || (!localag2.i()))
                  break label904;
                localah.getClass();
                localaj = new aj(localah);
                localWifiManager = (WifiManager)localContext.getSystemService("wifi");
                List localList1 = localWifiManager.getScanResults();
                localArrayList2 = new ArrayList();
                if (localList1 == null)
                  break label885;
                Iterator localIterator2 = localList1.iterator();
                while (localIterator2.hasNext())
                {
                  ScanResult localScanResult = (ScanResult)localIterator2.next();
                  if ((localScanResult != null) && (localScanResult.SSID != null))
                  {
                    am localam2 = new am();
                    localam2.a(localScanResult.SSID);
                    localArrayList2.add(localam2);
                  }
                }
                localException2 = localException2;
                ak.a("Application name not found");
                break;
                localah.j(Settings.Secure.getString(localContext.getContentResolver(), "android_id"));
              }
            }
            catch (Exception localException3)
            {
              aj localaj;
              WifiManager localWifiManager;
              ArrayList localArrayList2;
              break label486;
              localaj.a(localArrayList2);
              WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
              am localam1 = new am();
              localam1.a(localWifiInfo.getSSID());
              localaj.a(localam1);
              localah.a(localaj);
              localah.p(((TelephonyManager)localContext.getSystemService("phone")).getNetworkOperatorName());
              localah.f(String.valueOf(b.a()));
            }
          }
          if (localag2.g())
          {
            localLocationManager = (LocationManager)localContext.getSystemService("location");
            boolean bool1 = ak.a(localContext, "android.permission.ACCESS_FINE_LOCATION");
            Location localLocation1 = null;
            if (bool1)
              localLocation1 = localLocationManager.getLastKnownLocation("gps");
            if (localLocation1 == null)
              break;
            double d1 = localLocation1.getLatitude();
            double d2 = localLocation1.getLongitude();
            String str7 = "" + (int)(d1 * localag2.q()) + (int)(d2 * localag2.q());
            if (!("" + (int)(localah.k() * localag2.q()) + (int)(localah.l() * localag2.q())).equals(str7))
            {
              localah.a(d1);
              localah.b(d2);
            }
            localah.d(localLocation1.getAccuracy());
            localah.c(localLocation1.getAltitude());
            localah.e(localLocation1.getSpeed());
            localah.a(localLocation1.getTime());
          }
        }
        if ((ak.a(localContext, "android.permission.ACCESS_FINE_LOCATION")) || (ak.a(localContext, "android.permission.ACCESS_COARSE_LOCATION")));
        for (Location localLocation2 = localLocationManager.getLastKnownLocation("network"); localLocation2 != null; localLocation2 = null)
        {
          double d3 = localLocation2.getLatitude();
          double d4 = localLocation2.getLongitude();
          String str8 = "" + (int)(d3 * localag2.q()) + (int)(d4 * localag2.q());
          if (!("" + (int)(localah.k() * localag2.q()) + (int)(localah.l() * localag2.q())).equals(str8))
          {
            localah.a(d3);
            localah.b(d4);
          }
          localah.d(localLocation2.getAccuracy());
          localah.c(localLocation2.getAltitude());
          localah.e(localLocation2.getSpeed());
          localah.a(localLocation2.getTime());
          break;
          String str1 = localag1.e();
          p localp = new p();
          localp.a("1.3.6");
          localp.b("2014-11-17");
          if (localContext.getPackageName() == null);
          String str3;
          for (Object localObject = ""; ; localObject = str3)
          {
            localp.c((String)localObject);
            localp.a(localah);
            String str2 = ak.a(str1, localp.a(localContext), localContext, 500, 1000, true);
            if ((str2 == null) || (str2.length() <= 0))
              break;
            localag1.a(str2, localContext);
            localag1.a(System.currentTimeMillis());
            localag1.b(localContext);
            break;
            str3 = localContext.getPackageName();
          }
        }
      }
      while (localContext != null);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.t
 * JD-Core Version:    0.6.2
 */