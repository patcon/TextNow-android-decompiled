package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public abstract interface or extends IInterface
{
  public abstract void a(d paramd, WalletFragmentOptions paramWalletFragmentOptions, Bundle paramBundle);

  public abstract int getState();

  public abstract void initialize(WalletFragmentInitParams paramWalletFragmentInitParams);

  public abstract void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent);

  public abstract void onCreate(Bundle paramBundle);

  public abstract d onCreateView(d paramd1, d paramd2, Bundle paramBundle);

  public abstract void onPause();

  public abstract void onResume();

  public abstract void onSaveInstanceState(Bundle paramBundle);

  public abstract void onStart();

  public abstract void onStop();

  public abstract void setEnabled(boolean paramBoolean);

  public abstract void updateMaskedWallet(MaskedWallet paramMaskedWallet);

  public abstract void updateMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.or
 * JD-Core Version:    0.6.2
 */