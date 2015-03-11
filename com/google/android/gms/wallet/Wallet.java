package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.lf;
import com.google.android.gms.internal.lq;
import com.google.android.gms.internal.lr;
import com.google.android.gms.internal.lt;
import com.google.android.gms.internal.lu;
import com.google.android.gms.wallet.wobs.r;

public final class Wallet
{
  public static final Api<Wallet.WalletOptions> API = new Api(yI, yH, new Scope[0]);
  public static final Payments Payments = new lq();
  public static final r ajZ = new lu();
  public static final lf aka = new lt();
  private static final Api.c<lr> yH = new Api.c();
  private static final Api.b<lr, Wallet.WalletOptions> yI = new Api.b()
  {
    public final lr a(Context paramAnonymousContext, Looper paramAnonymousLooper, gy paramAnonymousgy, Wallet.WalletOptions paramAnonymousWalletOptions, GoogleApiClient.ConnectionCallbacks paramAnonymousConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramAnonymousOnConnectionFailedListener)
    {
      hm.b(paramAnonymousContext instanceof Activity, "An Activity must be used for Wallet APIs");
      Activity localActivity = (Activity)paramAnonymousContext;
      if (paramAnonymousWalletOptions != null);
      while (true)
      {
        return new lr(localActivity, paramAnonymousLooper, paramAnonymousConnectionCallbacks, paramAnonymousOnConnectionFailedListener, paramAnonymousWalletOptions.environment, paramAnonymousgy.getAccountName(), paramAnonymousWalletOptions.theme);
        paramAnonymousWalletOptions = new Wallet.WalletOptions(null);
      }
    }

    public final int getPriority()
    {
      return 2147483647;
    }
  };

  @Deprecated
  public static void changeMaskedWallet(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, int paramInt)
  {
    Payments.changeMaskedWallet(paramGoogleApiClient, paramString1, paramString2, paramInt);
  }

  @Deprecated
  public static void checkForPreAuthorization(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    Payments.checkForPreAuthorization(paramGoogleApiClient, paramInt);
  }

  @Deprecated
  public static void loadFullWallet(GoogleApiClient paramGoogleApiClient, FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    Payments.loadFullWallet(paramGoogleApiClient, paramFullWalletRequest, paramInt);
  }

  @Deprecated
  public static void loadMaskedWallet(GoogleApiClient paramGoogleApiClient, MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    Payments.loadMaskedWallet(paramGoogleApiClient, paramMaskedWalletRequest, paramInt);
  }

  @Deprecated
  public static void notifyTransactionStatus(GoogleApiClient paramGoogleApiClient, NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    Payments.notifyTransactionStatus(paramGoogleApiClient, paramNotifyTransactionStatusRequest);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Wallet
 * JD-Core Version:    0.6.2
 */