package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;

public final class au
{
  private AdListener lQ;
  private ViewGroup mA;
  private InAppPurchaseListener mB;
  private PlayStorePurchaseListener mC;
  private AppEventListener mh;
  private AdSize[] mi;
  private String mj;
  private final bs mw = new bs();
  private final ak mx;
  private aq my;
  private String mz;

  public au(ViewGroup paramViewGroup)
  {
    this(paramViewGroup, null, false, ak.aF());
  }

  public au(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean, ak.aF());
  }

  au(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean, ak paramak)
  {
    this.mA = paramViewGroup;
    this.mx = paramak;
    Context localContext;
    if (paramAttributeSet != null)
      localContext = paramViewGroup.getContext();
    try
    {
      ao localao = new ao(localContext, paramAttributeSet);
      this.mi = localao.f(paramBoolean);
      this.mj = localao.getAdUnitId();
      if (paramViewGroup.isInEditMode())
        et.a(paramViewGroup, new al(localContext, this.mi[0]), "Ads by Google");
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      et.a(paramViewGroup, new al(localContext, AdSize.BANNER), localIllegalArgumentException.getMessage(), localIllegalArgumentException.getMessage());
    }
  }

  private void aL()
  {
    try
    {
      d locald = this.my.U();
      if (locald == null)
        return;
      this.mA.addView((View)e.e(locald));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to get an ad frame.", localRemoteException);
    }
  }

  private void aM()
  {
    if (((this.mi == null) || (this.mj == null)) && (this.my == null))
      throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
    Context localContext = this.mA.getContext();
    this.my = ah.a(localContext, new al(localContext, this.mi), this.mj, this.mw);
    if (this.lQ != null)
      this.my.a(new ag(this.lQ));
    if (this.mh != null)
      this.my.a(new an(this.mh));
    if (this.mB != null)
      this.my.a(new dh(this.mB));
    if (this.mC != null)
      this.my.a(new dl(this.mC), this.mz);
    aL();
  }

  public final void a(at paramat)
  {
    try
    {
      if (this.my == null)
        aM();
      if (this.my.a(this.mx.a(this.mA.getContext(), paramat)))
        this.mw.c(paramat.aI());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to load ad.", localRemoteException);
    }
  }

  public final void a(AdSize[] paramArrayOfAdSize)
  {
    this.mi = paramArrayOfAdSize;
    try
    {
      if (this.my != null)
        this.my.a(new al(this.mA.getContext(), this.mi));
      this.mA.requestLayout();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        eu.c("Failed to set the ad size.", localRemoteException);
    }
  }

  public final void destroy()
  {
    try
    {
      if (this.my != null)
        this.my.destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to destroy AdView.", localRemoteException);
    }
  }

  public final AdListener getAdListener()
  {
    return this.lQ;
  }

  public final AdSize getAdSize()
  {
    try
    {
      if (this.my != null)
      {
        AdSize localAdSize = this.my.V().aG();
        return localAdSize;
      }
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to get the current AdSize.", localRemoteException);
      if (this.mi != null)
        return this.mi[0];
    }
    return null;
  }

  public final AdSize[] getAdSizes()
  {
    return this.mi;
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

  public final void pause()
  {
    try
    {
      if (this.my != null)
        this.my.pause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to call pause.", localRemoteException);
    }
  }

  public final void recordManualImpression()
  {
    try
    {
      this.my.ag();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to record impression.", localRemoteException);
    }
  }

  public final void resume()
  {
    try
    {
      if (this.my != null)
        this.my.resume();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Failed to call resume.", localRemoteException);
    }
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

  public final void setAdSizes(AdSize[] paramArrayOfAdSize)
  {
    if (this.mi != null)
      throw new IllegalStateException("The ad size can only be set once on AdView.");
    a(paramArrayOfAdSize);
  }

  public final void setAdUnitId(String paramString)
  {
    if (this.mj != null)
      throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
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
          break label58;
      }
      label58: for (dh localdh = new dh(paramInAppPurchaseListener); ; localdh = null)
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
    if (this.mB != null)
      throw new IllegalStateException("InAppPurchaseListener has already been set.");
    try
    {
      this.mC = paramPlayStorePurchaseListener;
      this.mz = paramString;
      aq localaq;
      if (this.my != null)
      {
        localaq = this.my;
        if (paramPlayStorePurchaseListener == null)
          break label66;
      }
      label66: for (dl localdl = new dl(paramPlayStorePurchaseListener); ; localdl = null)
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.au
 * JD-Core Version:    0.6.2
 */