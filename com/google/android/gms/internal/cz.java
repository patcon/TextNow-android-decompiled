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

@ez
public final class cz<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends cu.a
{
  private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> qG;
  private final NETWORK_EXTRAS qH;

  public cz(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> paramMediationAdapter, NETWORK_EXTRAS paramNETWORK_EXTRAS)
  {
    this.qG = paramMediationAdapter;
    this.qH = paramNETWORK_EXTRAS;
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
        gs.d("Could not get MediationServerParameters.", localThrowable);
        throw new RemoteException();
      }
    else
      localHashMap = new HashMap(0);
    Class localClass = this.qG.getServerParametersType();
    MediationServerParameters localMediationServerParameters = null;
    if (localClass != null)
    {
      localMediationServerParameters = (MediationServerParameters)localClass.newInstance();
      localMediationServerParameters.load(localHashMap);
    }
    return localMediationServerParameters;
  }

  public final void a(d paramd, av paramav, String paramString, cv paramcv)
  {
    a(paramd, paramav, paramString, null, paramcv);
  }

  public final void a(d paramd, av paramav, String paramString1, String paramString2, cv paramcv)
  {
    if (!(this.qG instanceof MediationInterstitialAdapter))
    {
      gs.W("MediationAdapter is not a MediationInterstitialAdapter: " + this.qG.getClass().getCanonicalName());
      throw new RemoteException();
    }
    gs.S("Requesting interstitial ad from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.qG).requestInterstitialAd(new da(paramcv), (Activity)e.f(paramd), b(paramString1, paramav.nX, paramString2), db.d(paramav), this.qH);
      return;
    }
    catch (Throwable localThrowable)
    {
      gs.d("Could not request interstitial ad from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void a(d paramd, ay paramay, av paramav, String paramString, cv paramcv)
  {
    a(paramd, paramay, paramav, paramString, null, paramcv);
  }

  public final void a(d paramd, ay paramay, av paramav, String paramString1, String paramString2, cv paramcv)
  {
    if (!(this.qG instanceof MediationBannerAdapter))
    {
      gs.W("MediationAdapter is not a MediationBannerAdapter: " + this.qG.getClass().getCanonicalName());
      throw new RemoteException();
    }
    gs.S("Requesting banner ad from adapter.");
    try
    {
      ((MediationBannerAdapter)this.qG).requestBannerAd(new da(paramcv), (Activity)e.f(paramd), b(paramString1, paramav.nX, paramString2), db.b(paramay), db.d(paramav), this.qH);
      return;
    }
    catch (Throwable localThrowable)
    {
      gs.d("Could not request banner ad from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void destroy()
  {
    try
    {
      this.qG.destroy();
      return;
    }
    catch (Throwable localThrowable)
    {
      gs.d("Could not destroy adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final d getView()
  {
    if (!(this.qG instanceof MediationBannerAdapter))
    {
      gs.W("MediationAdapter is not a MediationBannerAdapter: " + this.qG.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      d locald = e.k(((MediationBannerAdapter)this.qG).getBannerView());
      return locald;
    }
    catch (Throwable localThrowable)
    {
      gs.d("Could not get banner view from adapter.", localThrowable);
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
    if (!(this.qG instanceof MediationInterstitialAdapter))
    {
      gs.W("MediationAdapter is not a MediationInterstitialAdapter: " + this.qG.getClass().getCanonicalName());
      throw new RemoteException();
    }
    gs.S("Showing interstitial from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.qG).showInterstitial();
      return;
    }
    catch (Throwable localThrowable)
    {
      gs.d("Could not show interstitial from adapter.", localThrowable);
    }
    throw new RemoteException();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cz
 * JD-Core Version:    0.6.2
 */