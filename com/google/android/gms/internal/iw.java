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
import com.google.android.gms.identity.intents.UserAddressRequest;

public class iw extends hb<iy>
{
  private iw.a UG;
  private final int mTheme;
  private Activity og;
  private final String yQ;

  public iw(Activity paramActivity, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, int paramInt)
  {
    super(paramActivity, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
    this.yQ = paramString;
    this.og = paramActivity;
    this.mTheme = paramInt;
  }

  public void a(UserAddressRequest paramUserAddressRequest, int paramInt)
  {
    iU();
    this.UG = new iw.a(paramInt, this.og);
    try
    {
      Bundle localBundle1 = new Bundle();
      localBundle1.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
      if (!TextUtils.isEmpty(this.yQ))
        localBundle1.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.yQ, "com.google"));
      localBundle1.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.mTheme);
      iT().a(this.UG, paramUserAddressRequest, localBundle1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Bundle localBundle2 = new Bundle();
      localBundle2.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
      this.UG.g(1, localBundle2);
    }
  }

  protected void a(hi paramhi, hb.e parame)
  {
    paramhi.d(parame, 5089000, getContext().getPackageName());
  }

  protected iy an(IBinder paramIBinder)
  {
    return iy.a.ap(paramIBinder);
  }

  protected String bu()
  {
    return "com.google.android.gms.identity.service.BIND";
  }

  protected String bv()
  {
    return "com.google.android.gms.identity.intents.internal.IAddressService";
  }

  public void disconnect()
  {
    super.disconnect();
    if (this.UG != null)
    {
      iw.a.a(this.UG, null);
      this.UG = null;
    }
  }

  protected iy iT()
  {
    return (iy)super.ft();
  }

  protected void iU()
  {
    super.cn();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iw
 * JD-Core Version:    0.6.2
 */