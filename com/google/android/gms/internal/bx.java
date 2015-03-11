package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class bx extends bu.a
{
  private final MediationAdapter nS;

  public bx(MediationAdapter paramMediationAdapter)
  {
    this.nS = paramMediationAdapter;
  }

  private Bundle a(String paramString1, int paramInt, String paramString2)
  {
    eu.D("Server parameters: " + paramString1);
    Bundle localBundle;
    try
    {
      localObject = new Bundle();
      if (paramString1 == null)
        break label121;
      JSONObject localJSONObject = new JSONObject(paramString1);
      localBundle = new Bundle();
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localBundle.putString(str, localJSONObject.getString(str));
      }
    }
    catch (Throwable localThrowable)
    {
      eu.c("Could not get Server Parameters Bundle.", localThrowable);
      throw new RemoteException();
    }
    Object localObject = localBundle;
    label121: if ((this.nS instanceof AdMobAdapter))
    {
      ((Bundle)localObject).putString("adJson", paramString2);
      ((Bundle)localObject).putInt("tagForChildDirectedTreatment", paramInt);
    }
    return localObject;
  }

  public final void a(d paramd, ai paramai, String paramString, bv parambv)
  {
    a(paramd, paramai, paramString, null, parambv);
  }

  public final void a(d paramd, ai paramai, String paramString1, String paramString2, bv parambv)
  {
    if (!(this.nS instanceof MediationInterstitialAdapter))
    {
      eu.D("MediationAdapter is not a MediationInterstitialAdapter: " + this.nS.getClass().getCanonicalName());
      throw new RemoteException();
    }
    eu.z("Requesting interstitial ad from adapter.");
    try
    {
      MediationInterstitialAdapter localMediationInterstitialAdapter = (MediationInterstitialAdapter)this.nS;
      if (paramai.lU != null);
      for (HashSet localHashSet = new HashSet(paramai.lU); ; localHashSet = null)
      {
        bw localbw = new bw(new Date(paramai.lS), paramai.lT, localHashSet, paramai.lV, paramai.lW);
        Bundle localBundle1 = paramai.mc;
        Bundle localBundle2 = null;
        if (localBundle1 != null)
          localBundle2 = paramai.mc.getBundle(localMediationInterstitialAdapter.getClass().getName());
        localMediationInterstitialAdapter.requestInterstitialAd((Context)e.e(paramd), new by(parambv), a(paramString1, paramai.lW, paramString2), localbw, localBundle2);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      eu.c("Could not request interstitial ad from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void a(d paramd, al paramal, ai paramai, String paramString, bv parambv)
  {
    a(paramd, paramal, paramai, paramString, null, parambv);
  }

  public final void a(d paramd, al paramal, ai paramai, String paramString1, String paramString2, bv parambv)
  {
    if (!(this.nS instanceof MediationBannerAdapter))
    {
      eu.D("MediationAdapter is not a MediationBannerAdapter: " + this.nS.getClass().getCanonicalName());
      throw new RemoteException();
    }
    eu.z("Requesting banner ad from adapter.");
    try
    {
      MediationBannerAdapter localMediationBannerAdapter = (MediationBannerAdapter)this.nS;
      if (paramai.lU != null);
      for (HashSet localHashSet = new HashSet(paramai.lU); ; localHashSet = null)
      {
        bw localbw = new bw(new Date(paramai.lS), paramai.lT, localHashSet, paramai.lV, paramai.lW);
        Bundle localBundle1 = paramai.mc;
        Bundle localBundle2 = null;
        if (localBundle1 != null)
          localBundle2 = paramai.mc.getBundle(localMediationBannerAdapter.getClass().getName());
        localMediationBannerAdapter.requestBannerAd((Context)e.e(paramd), new by(parambv), a(paramString1, paramai.lW, paramString2), a.a(paramal.width, paramal.height, paramal.me), localbw, localBundle2);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      eu.c("Could not request banner ad from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void destroy()
  {
    try
    {
      this.nS.onDestroy();
      return;
    }
    catch (Throwable localThrowable)
    {
      eu.c("Could not destroy adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final d getView()
  {
    if (!(this.nS instanceof MediationBannerAdapter))
    {
      eu.D("MediationAdapter is not a MediationBannerAdapter: " + this.nS.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      d locald = e.h(((MediationBannerAdapter)this.nS).getBannerView());
      return locald;
    }
    catch (Throwable localThrowable)
    {
      eu.c("Could not get banner view from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void pause()
  {
    try
    {
      this.nS.onPause();
      return;
    }
    catch (Throwable localThrowable)
    {
      eu.c("Could not pause adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void resume()
  {
    try
    {
      this.nS.onResume();
      return;
    }
    catch (Throwable localThrowable)
    {
      eu.c("Could not resume adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void showInterstitial()
  {
    if (!(this.nS instanceof MediationInterstitialAdapter))
    {
      eu.D("MediationAdapter is not a MediationInterstitialAdapter: " + this.nS.getClass().getCanonicalName());
      throw new RemoteException();
    }
    eu.z("Showing interstitial from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.nS).showInterstitial();
      return;
    }
    catch (Throwable localThrowable)
    {
      eu.c("Could not show interstitial from adapter.", localThrowable);
    }
    throw new RemoteException();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bx
 * JD-Core Version:    0.6.2
 */