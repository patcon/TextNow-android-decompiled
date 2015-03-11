package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

public abstract interface lp extends IInterface
{
  public abstract void a(int paramInt, FullWallet paramFullWallet, Bundle paramBundle);

  public abstract void a(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle);

  public abstract void a(int paramInt, boolean paramBoolean, Bundle paramBundle);

  public abstract void a(Status paramStatus, li paramli, Bundle paramBundle);

  public abstract void i(int paramInt, Bundle paramBundle);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lp
 * JD-Core Version:    0.6.2
 */