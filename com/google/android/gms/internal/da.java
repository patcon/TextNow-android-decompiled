package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@ez
public final class da<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters>
  implements MediationBannerListener, MediationInterstitialListener
{
  private final cv qF;

  public da(cv paramcv)
  {
    this.qF = paramcv;
  }

  public final void onClick(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    gs.S("Adapter called onClick.");
    if (!gr.ds())
    {
      gs.W("onClick must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdClicked();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdClicked.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdClicked();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdClicked.", localRemoteException);
    }
  }

  public final void onDismissScreen(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    gs.S("Adapter called onDismissScreen.");
    if (!gr.ds())
    {
      gs.W("onDismissScreen must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdClosed();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdClosed.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdClosed.", localRemoteException);
    }
  }

  public final void onDismissScreen(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    gs.S("Adapter called onDismissScreen.");
    if (!gr.ds())
    {
      gs.W("onDismissScreen must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdClosed();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdClosed.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdClosed.", localRemoteException);
    }
  }

  public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> paramMediationBannerAdapter, final AdRequest.ErrorCode paramErrorCode)
  {
    gs.S("Adapter called onFailedToReceiveAd with error. " + paramErrorCode);
    if (!gr.ds())
    {
      gs.W("onFailedToReceiveAd must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdFailedToLoad(db.a(paramErrorCode));
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdFailedToLoad.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdFailedToLoad(db.a(paramErrorCode));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter, final AdRequest.ErrorCode paramErrorCode)
  {
    gs.S("Adapter called onFailedToReceiveAd with error " + paramErrorCode + ".");
    if (!gr.ds())
    {
      gs.W("onFailedToReceiveAd must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdFailedToLoad(db.a(paramErrorCode));
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdFailedToLoad.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdFailedToLoad(db.a(paramErrorCode));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public final void onLeaveApplication(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    gs.S("Adapter called onLeaveApplication.");
    if (!gr.ds())
    {
      gs.W("onLeaveApplication must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdLeftApplication();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdLeftApplication.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    gs.S("Adapter called onLeaveApplication.");
    if (!gr.ds())
    {
      gs.W("onLeaveApplication must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdLeftApplication();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdLeftApplication.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public final void onPresentScreen(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    gs.S("Adapter called onPresentScreen.");
    if (!gr.ds())
    {
      gs.W("onPresentScreen must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdOpened();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdOpened.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdOpened.", localRemoteException);
    }
  }

  public final void onPresentScreen(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    gs.S("Adapter called onPresentScreen.");
    if (!gr.ds())
    {
      gs.W("onPresentScreen must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdOpened();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdOpened.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdOpened.", localRemoteException);
    }
  }

  public final void onReceivedAd(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    gs.S("Adapter called onReceivedAd.");
    if (!gr.ds())
    {
      gs.W("onReceivedAd must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdLoaded();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdLoaded.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public final void onReceivedAd(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    gs.S("Adapter called onReceivedAd.");
    if (!gr.ds())
    {
      gs.W("onReceivedAd must be called on the main UI thread.");
      gr.wC.post(new Runnable()
      {
        public void run()
        {
          try
          {
            da.a(da.this).onAdLoaded();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            gs.d("Could not call onAdLoaded.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.qF.onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not call onAdLoaded.", localRemoteException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.da
 * JD-Core Version:    0.6.2
 */