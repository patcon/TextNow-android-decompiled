package com.google.android.gms.wallet.fragment;

public final class WalletFragmentOptions$Builder
{
  private WalletFragmentOptions$Builder(WalletFragmentOptions paramWalletFragmentOptions)
  {
  }

  public final WalletFragmentOptions build()
  {
    return this.akD;
  }

  public final Builder setEnvironment(int paramInt)
  {
    WalletFragmentOptions.a(this.akD, paramInt);
    return this;
  }

  public final Builder setFragmentStyle(int paramInt)
  {
    WalletFragmentOptions.a(this.akD, new WalletFragmentStyle().setStyleResourceId(paramInt));
    return this;
  }

  public final Builder setFragmentStyle(WalletFragmentStyle paramWalletFragmentStyle)
  {
    WalletFragmentOptions.a(this.akD, paramWalletFragmentStyle);
    return this;
  }

  public final Builder setMode(int paramInt)
  {
    WalletFragmentOptions.c(this.akD, paramInt);
    return this;
  }

  public final Builder setTheme(int paramInt)
  {
    WalletFragmentOptions.b(this.akD, paramInt);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentOptions.Builder
 * JD-Core Version:    0.6.2
 */