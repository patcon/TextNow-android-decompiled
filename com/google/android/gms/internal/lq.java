package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet.b;

public class lq
  implements Payments
{
  public void changeMaskedWallet(GoogleApiClient paramGoogleApiClient, final String paramString1, final String paramString2, final int paramInt)
  {
    paramGoogleApiClient.a(new Wallet.b()
    {
      protected void a(lr paramAnonymouslr)
      {
        paramAnonymouslr.d(paramString1, paramString2, paramInt);
        b(Status.En);
      }
    });
  }

  public void checkForPreAuthorization(GoogleApiClient paramGoogleApiClient, final int paramInt)
  {
    paramGoogleApiClient.a(new Wallet.b()
    {
      protected void a(lr paramAnonymouslr)
      {
        paramAnonymouslr.dQ(paramInt);
        b(Status.En);
      }
    });
  }

  public void loadFullWallet(GoogleApiClient paramGoogleApiClient, final FullWalletRequest paramFullWalletRequest, final int paramInt)
  {
    paramGoogleApiClient.a(new Wallet.b()
    {
      protected void a(lr paramAnonymouslr)
      {
        paramAnonymouslr.a(paramFullWalletRequest, paramInt);
        b(Status.En);
      }
    });
  }

  public void loadMaskedWallet(GoogleApiClient paramGoogleApiClient, final MaskedWalletRequest paramMaskedWalletRequest, final int paramInt)
  {
    paramGoogleApiClient.a(new Wallet.b()
    {
      protected void a(lr paramAnonymouslr)
      {
        paramAnonymouslr.a(paramMaskedWalletRequest, paramInt);
        b(Status.En);
      }
    });
  }

  public void notifyTransactionStatus(GoogleApiClient paramGoogleApiClient, final NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    paramGoogleApiClient.a(new Wallet.b()
    {
      protected void a(lr paramAnonymouslr)
      {
        paramAnonymouslr.a(paramNotifyTransactionStatusRequest);
        b(Status.En);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lq
 * JD-Core Version:    0.6.2
 */