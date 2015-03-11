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
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.om;
import com.google.android.gms.internal.ox;
import com.google.android.gms.internal.oy;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pb;
import com.google.android.gms.wallet.wobs.r;

public final class Wallet
{
  public static final Api<Wallet.WalletOptions> API = new Api(CV, CU, new Scope[0]);
  private static final Api.c<oy> CU = new Api.c();
  private static final Api.b<oy, Wallet.WalletOptions> CV = new Api.b()
  {
    public final oy a(Context paramAnonymousContext, Looper paramAnonymousLooper, ClientSettings paramAnonymousClientSettings, Wallet.WalletOptions paramAnonymousWalletOptions, GoogleApiClient.ConnectionCallbacks paramAnonymousConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramAnonymousOnConnectionFailedListener)
    {
      o.b(paramAnonymousContext instanceof Activity, "An Activity must be used for Wallet APIs");
      Activity localActivity = (Activity)paramAnonymousContext;
      if (paramAnonymousWalletOptions != null);
      while (true)
      {
        return new oy(localActivity, paramAnonymousLooper, paramAnonymousConnectionCallbacks, paramAnonymousOnConnectionFailedListener, paramAnonymousWalletOptions.environment, paramAnonymousClientSettings.getAccountName(), paramAnonymousWalletOptions.theme);
        paramAnonymousWalletOptions = new Wallet.WalletOptions(null);
      }
    }

    public final int getPriority()
    {
      return 2147483647;
    }
  };
  public static final Payments Payments = new ox();
  public static final r atJ = new pb();
  public static final om atK = new pa();

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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Wallet
 * JD-Core Version:    0.6.2
 */