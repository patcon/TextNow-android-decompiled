package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.d;

public abstract interface lm extends IInterface
{
  public abstract void a(Bundle paramBundle, lp paramlp);

  public abstract void a(lg paramlg, Bundle paramBundle, lp paramlp);

  public abstract void a(FullWalletRequest paramFullWalletRequest, Bundle paramBundle, lp paramlp);

  public abstract void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, lo paramlo);

  public abstract void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, lp paramlp);

  public abstract void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Bundle paramBundle);

  public abstract void a(d paramd, Bundle paramBundle, lp paramlp);

  public abstract void a(String paramString1, String paramString2, Bundle paramBundle, lp paramlp);

  public abstract void o(Bundle paramBundle);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lm
 * JD-Core Version:    0.6.2
 */