package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

public class lr extends hb<lm>
{
  private final int akb;
  private final int mTheme;
  private final Activity og;
  private final String yQ;

  public lr(Activity paramActivity, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, int paramInt1, String paramString, int paramInt2)
  {
    super(paramActivity, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
    this.og = paramActivity;
    this.akb = paramInt1;
    this.yQ = paramString;
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

  private Bundle ni()
  {
    return a(this.akb, this.og.getPackageName(), this.yQ, this.mTheme);
  }

  protected void a(hi paramhi, hb.e parame)
  {
    paramhi.a(parame, 5089000);
  }

  public void a(FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    lr.b localb = new lr.b(this, paramInt);
    Bundle localBundle = ni();
    try
    {
      ((lm)ft()).a(paramFullWalletRequest, localBundle, localb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localb.a(8, null, Bundle.EMPTY);
    }
  }

  public void a(MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    Bundle localBundle = ni();
    lr.b localb = new lr.b(this, paramInt);
    try
    {
      ((lm)ft()).a(paramMaskedWalletRequest, localBundle, localb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localb.a(8, null, Bundle.EMPTY);
    }
  }

  public void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    Bundle localBundle = ni();
    try
    {
      ((lm)ft()).a(paramNotifyTransactionStatusRequest, localBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  protected lm bu(IBinder paramIBinder)
  {
    return lm.a.bq(paramIBinder);
  }

  protected String bu()
  {
    return "com.google.android.gms.wallet.service.BIND";
  }

  protected String bv()
  {
    return "com.google.android.gms.wallet.internal.IOwService";
  }

  public void d(String paramString1, String paramString2, int paramInt)
  {
    Bundle localBundle = ni();
    lr.b localb = new lr.b(this, paramInt);
    try
    {
      ((lm)ft()).a(paramString1, paramString2, localBundle, localb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localb.a(8, null, Bundle.EMPTY);
    }
  }

  public void dQ(int paramInt)
  {
    Bundle localBundle = ni();
    lr.b localb = new lr.b(this, paramInt);
    try
    {
      ((lm)ft()).a(localBundle, localb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localb.a(8, false, Bundle.EMPTY);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lr
 * JD-Core Version:    0.6.2
 */