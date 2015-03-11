package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

public final class by
  implements MediationBannerListener, MediationInterstitialListener
{
  private final bv nT;

  public by(bv parambv)
  {
    this.nT = parambv;
  }

  public final void onAdClicked(MediationBannerAdapter paramMediationBannerAdapter)
  {
    hm.ay("onAdClicked must be called on the main UI thread.");
    eu.z("Adapter called onAdClicked.");
    try
    {
      this.nT.onAdClicked();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdClicked.", localRemoteException);
    }
  }

  public final void onAdClicked(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    hm.ay("onAdClicked must be called on the main UI thread.");
    eu.z("Adapter called onAdClicked.");
    try
    {
      this.nT.onAdClicked();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdClicked.", localRemoteException);
    }
  }

  public final void onAdClosed(MediationBannerAdapter paramMediationBannerAdapter)
  {
    hm.ay("onAdClosed must be called on the main UI thread.");
    eu.z("Adapter called onAdClosed.");
    try
    {
      this.nT.onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdClosed.", localRemoteException);
    }
  }

  public final void onAdClosed(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    hm.ay("onAdClosed must be called on the main UI thread.");
    eu.z("Adapter called onAdClosed.");
    try
    {
      this.nT.onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdClosed.", localRemoteException);
    }
  }

  public final void onAdFailedToLoad(MediationBannerAdapter paramMediationBannerAdapter, int paramInt)
  {
    hm.ay("onAdFailedToLoad must be called on the main UI thread.");
    eu.z("Adapter called onAdFailedToLoad with error. " + paramInt);
    try
    {
      this.nT.onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public final void onAdFailedToLoad(MediationInterstitialAdapter paramMediationInterstitialAdapter, int paramInt)
  {
    hm.ay("onAdFailedToLoad must be called on the main UI thread.");
    eu.z("Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      this.nT.onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public final void onAdLeftApplication(MediationBannerAdapter paramMediationBannerAdapter)
  {
    hm.ay("onAdLeftApplication must be called on the main UI thread.");
    eu.z("Adapter called onAdLeftApplication.");
    try
    {
      this.nT.onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public final void onAdLeftApplication(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    hm.ay("onAdLeftApplication must be called on the main UI thread.");
    eu.z("Adapter called onAdLeftApplication.");
    try
    {
      this.nT.onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public final void onAdLoaded(MediationBannerAdapter paramMediationBannerAdapter)
  {
    hm.ay("onAdLoaded must be called on the main UI thread.");
    eu.z("Adapter called onAdLoaded.");
    try
    {
      this.nT.onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public final void onAdLoaded(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    hm.ay("onAdLoaded must be called on the main UI thread.");
    eu.z("Adapter called onAdLoaded.");
    try
    {
      this.nT.onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public final void onAdOpened(MediationBannerAdapter paramMediationBannerAdapter)
  {
    hm.ay("onAdOpened must be called on the main UI thread.");
    eu.z("Adapter called onAdOpened.");
    try
    {
      this.nT.onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdOpened.", localRemoteException);
    }
  }

  public final void onAdOpened(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    hm.ay("onAdOpened must be called on the main UI thread.");
    eu.z("Adapter called onAdOpened.");
    try
    {
      this.nT.onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call onAdOpened.", localRemoteException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.by
 * JD-Core Version:    0.6.2
 */