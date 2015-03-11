package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class cw extends df.a
  implements ServiceConnection
{
  private Context mContext;
  private cr oY;
  private String pf;
  private cv pj;
  private boolean po = false;
  private int pp;
  private Intent pq;

  public cw(Context paramContext, String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, cv paramcv)
  {
    this.pf = paramString;
    this.pp = paramInt;
    this.pq = paramIntent;
    this.po = paramBoolean;
    this.mContext = paramContext;
    this.pj = paramcv;
  }

  public final void finishPurchase()
  {
    int i = cy.c(this.pq);
    if ((this.pp != -1) || (i != 0))
      return;
    this.oY = new cr(this.mContext);
    Context localContext = this.mContext;
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localContext.bindService(localIntent, this, 1);
  }

  public final String getProductId()
  {
    return this.pf;
  }

  public final Intent getPurchaseData()
  {
    return this.pq;
  }

  public final int getResultCode()
  {
    return this.pp;
  }

  public final boolean isVerified()
  {
    return this.po;
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    eu.B("In-app billing service connected.");
    this.oY.o(paramIBinder);
    String str = cy.q(cy.d(this.pq));
    if (str == null)
      return;
    if (this.oY.a(this.mContext.getPackageName(), str) == 0)
      cx.k(this.mContext).a(this.pj);
    this.mContext.unbindService(this);
    this.oY.destroy();
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    eu.B("In-app billing service disconnected.");
    this.oY.destroy();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cw
 * JD-Core Version:    0.6.2
 */