package com.google.android.gms.wallet;

import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;

public final class Wallet$WalletOptions
  implements Api.ApiOptions.HasOptions
{
  public final int environment;
  public final int theme;

  private Wallet$WalletOptions()
  {
    this(new Wallet.WalletOptions.Builder());
  }

  private Wallet$WalletOptions(Wallet.WalletOptions.Builder paramBuilder)
  {
    this.environment = Wallet.WalletOptions.Builder.a(paramBuilder);
    this.theme = Wallet.WalletOptions.Builder.b(paramBuilder);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Wallet.WalletOptions
 * JD-Core Version:    0.6.2
 */