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
import com.google.android.gms.identity.intents.UserAddressRequest;

public class lm extends e<lo>
{
  private final String Dd;
  private lm.a adM;
  private final int mTheme;
  private Activity nr;

  public lm(Activity paramActivity, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, int paramInt)
  {
    super(paramActivity, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
    this.Dd = paramString;
    this.nr = paramActivity;
    this.mTheme = paramInt;
  }

  protected void a(l paraml, e.e parame)
  {
    paraml.d(parame, 6171000, getContext().getPackageName());
  }

  public void a(UserAddressRequest paramUserAddressRequest, int paramInt)
  {
    lT();
    this.adM = new lm.a(paramInt, this.nr);
    try
    {
      Bundle localBundle1 = new Bundle();
      localBundle1.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
      if (!TextUtils.isEmpty(this.Dd))
        localBundle1.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.Dd, "com.google"));
      localBundle1.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.mTheme);
      lS().a(this.adM, paramUserAddressRequest, localBundle1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Bundle localBundle2 = new Bundle();
      localBundle2.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
      this.adM.g(1, localBundle2);
    }
  }

  protected lo aF(IBinder paramIBinder)
  {
    return lo.a.aH(paramIBinder);
  }

  public void disconnect()
  {
    super.disconnect();
    if (this.adM != null)
    {
      lm.a.a(this.adM, null);
      this.adM = null;
    }
  }

  protected String getServiceDescriptor()
  {
    return "com.google.android.gms.identity.intents.internal.IAddressService";
  }

  protected String getStartServiceAction()
  {
    return "com.google.android.gms.identity.service.BIND";
  }

  protected lo lS()
  {
    return (lo)super.gS();
  }

  protected void lT()
  {
    super.dJ();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lm
 * JD-Core Version:    0.6.2
 */