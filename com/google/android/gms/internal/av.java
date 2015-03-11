package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

public final class av
{
  private AdListener lQ;
  private InAppPurchaseListener mB;
  private PlayStorePurchaseListener mC;
  private final Context mContext;
  private AppEventListener mh;
  private String mj;
  private final bs mw = new bs();
  private final ak mx;
  private aq my;
  private String mz;

  public av(Context paramContext)
  {
    this(paramContext, ak.aF());
  }

  public av(Context paramContext, ak paramak)
  {
    this.mContext = paramContext;
    this.mx = paramak;
  }

  private void k(String paramString)
  {
    if (this.mj == null)
      l(paramString);
    this.my = ah.a(this.mContext, new al(), this.mj, this.mw);
    if (this.lQ != null)
      this.my.a(new ag(this.lQ));
    if (this.mh != null)
      this.my.a(new an(this.mh));
    if (this.mB != null)
      this.my.a(new dh(this.mB));
    if (this.mC != null)
      this.my.a(new dl(this.mC), this.mz);
  }

  private void l(String paramString)
  {
    if (this.my == null)
      throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + paramString + " is called.");
  }

  public final void a(at paramat)
  {
    try
    {
      if (this.my == null)
        k("loadAd");
      if (this.my.a(this.mx.a(this.mContext, paramat)))
        this.mw.c(paramat.aI());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to load ad.", localRemoteException);
    }
  }

  public final AdListener getAdListener()
  {
    return this.lQ;
  }

  public final String getAdUnitId()
  {
    return this.mj;
  }

  public final AppEventListener getAppEventListener()
  {
    return this.mh;
  }

  public final InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.mB;
  }

  public final boolean isLoaded()
  {
    try
    {
      if (this.my == null)
        return false;
      boolean bool = this.my.isReady();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to check if ad is ready.", localRemoteException);
    }
    return false;
  }

  public final void setAdListener(AdListener paramAdListener)
  {
    try
    {
      this.lQ = paramAdListener;
      aq localaq;
      if (this.my != null)
      {
        localaq = this.my;
        if (paramAdListener == null)
          break label40;
      }
      label40: for (ag localag = new ag(paramAdListener); ; localag = null)
      {
        localaq.a(localag);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to set the AdListener.", localRemoteException);
    }
  }

  public final void setAdUnitId(String paramString)
  {
    if (this.mj != null)
      throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    this.mj = paramString;
  }

  public final void setAppEventListener(AppEventListener paramAppEventListener)
  {
    try
    {
      this.mh = paramAppEventListener;
      aq localaq;
      if (this.my != null)
      {
        localaq = this.my;
        if (paramAppEventListener == null)
          break label40;
      }
      label40: for (an localan = new an(paramAppEventListener); ; localan = null)
      {
        localaq.a(localan);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to set the AppEventListener.", localRemoteException);
    }
  }

  public final void setInAppPurchaseListener(InAppPurchaseListener paramInAppPurchaseListener)
  {
    if (this.mC != null)
      throw new IllegalStateException("Play store purchase parameter has already been set.");
    try
    {
      this.mB = paramInAppPurchaseListener;
      aq localaq;
      if (this.my != null)
      {
        localaq = this.my;
        if (paramInAppPurchaseListener == null)
          break label57;
      }
      label57: for (dh localdh = new dh(paramInAppPurchaseListener); ; localdh = null)
      {
        localaq.a(localdh);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to set the InAppPurchaseListener.", localRemoteException);
    }
  }

  public final void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    try
    {
      this.mC = paramPlayStorePurchaseListener;
      aq localaq;
      if (this.my != null)
      {
        localaq = this.my;
        if (paramPlayStorePurchaseListener == null)
          break label43;
      }
      label43: for (dl localdl = new dl(paramPlayStorePurchaseListener); ; localdl = null)
      {
        localaq.a(localdl, paramString);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to set the play store purchase parameter.", localRemoteException);
    }
  }

  public final void show()
  {
    try
    {
      l("show");
      this.my.showInterstitial();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to show interstitial.", localRemoteException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.av
 * JD-Core Version:    0.6.2
 */