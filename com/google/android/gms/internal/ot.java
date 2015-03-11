package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.d;

public abstract interface ot extends IInterface
{
  public abstract void a(Bundle paramBundle, ow paramow);

  public abstract void a(on paramon, Bundle paramBundle, ow paramow);

  public abstract void a(FullWalletRequest paramFullWalletRequest, Bundle paramBundle, ow paramow);

  public abstract void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, ov paramov);

  public abstract void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, ow paramow);

  public abstract void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Bundle paramBundle);

  public abstract void a(d paramd, Bundle paramBundle, ow paramow);

  public abstract void a(String paramString1, String paramString2, Bundle paramBundle, ow paramow);

  public abstract void p(Bundle paramBundle);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ot
 * JD-Core Version:    0.6.2
 */