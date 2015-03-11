package com.google.android.gms.wallet.fragment;

public final class WalletFragmentOptions$Builder
{
  private WalletFragmentOptions$Builder(WalletFragmentOptions paramWalletFragmentOptions)
  {
  }

  public final WalletFragmentOptions build()
  {
    return this.aun;
  }

  public final Builder setEnvironment(int paramInt)
  {
    WalletFragmentOptions.a(this.aun, paramInt);
    return this;
  }

  public final Builder setFragmentStyle(int paramInt)
  {
    WalletFragmentOptions.a(this.aun, new WalletFragmentStyle().setStyleResourceId(paramInt));
    return this;
  }

  public final Builder setFragmentStyle(WalletFragmentStyle paramWalletFragmentStyle)
  {
    WalletFragmentOptions.a(this.aun, paramWalletFragmentStyle);
    return this;
  }

  public final Builder setMode(int paramInt)
  {
    WalletFragmentOptions.c(this.aun, paramInt);
    return this;
  }

  public final Builder setTheme(int paramInt)
  {
    WalletFragmentOptions.b(this.aun, paramInt);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentOptions.Builder
 * JD-Core Version:    0.6.2
 */