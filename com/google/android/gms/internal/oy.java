package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

public class oy extends e<ot>
{
  private final String Dd;
  private final int atL;
  private final int mTheme;
  private final Activity nr;

  public oy(Activity paramActivity, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, int paramInt1, String paramString, int paramInt2)
  {
    super(paramActivity, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
    this.nr = paramActivity;
    this.atL = paramInt1;
    this.Dd = paramString;
    this.mTheme = paramInt2;
  }

  public static Bundle a(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", paramInt1);
    localBundle.putString("androidPackageName", paramString1);
    if (!TextUtils.isEmpty(paramString2))
      localBundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(paramString2, "com.google"));
    localBundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", paramInt2);
    return localBundle;
  }

  private Bundle pO()
  {
    return a(this.atL, this.nr.getPackageName(), this.Dd, this.mTheme);
  }

  protected void a(l paraml, e.e parame)
  {
    paraml.k(parame, 6171000, getContext().getPackageName());
  }

  public void a(FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    oy.b localb = new oy.b(this, paramInt);
    Bundle localBundle = pO();
    try
    {
      ((ot)gS()).a(paramFullWalletRequest, localBundle, localb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localb.a(8, null, Bundle.EMPTY);
    }
  }

  public void a(MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    Bundle localBundle = pO();
    oy.b localb = new oy.b(this, paramInt);
    try
    {
      ((ot)gS()).a(paramMaskedWalletRequest, localBundle, localb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localb.a(8, null, Bundle.EMPTY);
    }
  }

  public void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    Bundle localBundle = pO();
    try
    {
      ((ot)gS()).a(paramNotifyTransactionStatusRequest, localBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  protected ot bP(IBinder paramIBinder)
  {
    return ot.a.bL(paramIBinder);
  }

  public void d(String paramString1, String paramString2, int paramInt)
  {
    Bundle localBundle = pO();
    oy.b localb = new oy.b(this, paramInt);
    try
    {
      ((ot)gS()).a(paramString1, paramString2, localBundle, localb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localb.a(8, null, Bundle.EMPTY);
    }
  }

  public void fI(int paramInt)
  {
    Bundle localBundle = pO();
    oy.b localb = new oy.b(this, paramInt);
    try
    {
      ((ot)gS()).a(localBundle, localb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localb.a(8, false, Bundle.EMPTY);
    }
  }

  protected String getServiceDescriptor()
  {
    return "com.google.android.gms.wallet.internal.IOwService";
  }

  protected String getStartServiceAction()
  {
    return "com.google.android.gms.wallet.service.BIND";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oy
 * JD-Core Version:    0.6.2
 */