package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class bz<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends bu.a
{
  private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> nU;
  private final NETWORK_EXTRAS nV;

  public bz(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> paramMediationAdapter, NETWORK_EXTRAS paramNETWORK_EXTRAS)
  {
    this.nU = paramMediationAdapter;
    this.nV = paramNETWORK_EXTRAS;
  }

  private SERVER_PARAMETERS b(String paramString1, int paramInt, String paramString2)
  {
    HashMap localHashMap;
    if (paramString1 != null)
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString1);
        localHashMap = new HashMap(localJSONObject.length());
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localHashMap.put(str, localJSONObject.getString(str));
        }
      }
      catch (Throwable localThrowable)
      {
        eu.c("Could not get MediationServerParameters.", localThrowable);
        throw new RemoteException();
      }
    else
      localHashMap = new HashMap(0);
    Class localClass = this.nU.getServerParametersType();
    MediationServerParameters localMediationServerParameters = null;
    if (localClass != null)
    {
      localMediationServerParameters = (MediationServerParameters)localClass.newInstance();
      localMediationServerParameters.load(localHashMap);
    }
    return localMediationServerParameters;
  }

  public final void a(d paramd, ai paramai, String paramString, bv parambv)
  {
    a(paramd, paramai, paramString, null, parambv);
  }

  public final void a(d paramd, ai paramai, String paramString1, String paramString2, bv parambv)
  {
    if (!(this.nU instanceof MediationInterstitialAdapter))
    {
      eu.D("MediationAdapter is not a MediationInterstitialAdapter: " + this.nU.getClass().getCanonicalName());
      throw new RemoteException();
    }
    eu.z("Requesting interstitial ad from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.nU).requestInterstitialAd(new ca(parambv), (Activity)e.e(paramd), b(paramString1, paramai.lW, paramString2), cb.e(paramai), this.nV);
      return;
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
    if (!(this.nU instanceof MediationBannerAdapter))
    {
      eu.D("MediationAdapter is not a MediationBannerAdapter: " + this.nU.getClass().getCanonicalName());
      throw new RemoteException();
    }
    eu.z("Requesting banner ad from adapter.");
    try
    {
      ((MediationBannerAdapter)this.nU).requestBannerAd(new ca(parambv), (Activity)e.e(paramd), b(paramString1, paramai.lW, paramString2), cb.b(paramal), cb.e(paramai), this.nV);
      return;
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
      this.nU.destroy();
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
    if (!(this.nU instanceof MediationBannerAdapter))
    {
      eu.D("MediationAdapter is not a MediationBannerAdapter: " + this.nU.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      d locald = e.h(((MediationBannerAdapter)this.nU).getBannerView());
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
    throw new RemoteException();
  }

  public final void resume()
  {
    throw new RemoteException();
  }

  public final void showInterstitial()
  {
    if (!(this.nU instanceof MediationInterstitialAdapter))
    {
      eu.D("MediationAdapter is not a MediationInterstitialAdapter: " + this.nU.getClass().getCanonicalName());
      throw new RemoteException();
    }
    eu.z("Showing interstitial from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.nU).showInterstitial();
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
 * Qualified Name:     com.google.android.gms.internal.bz
 * JD-Core Version:    0.6.2
 */