package com.google.android.gms.wallet.fragment;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams$Builder
{
  private WalletFragmentInitParams$Builder(WalletFragmentInitParams paramWalletFragmentInitParams)
  {
  }

  public final WalletFragmentInitParams build()
  {
    boolean bool1 = true;
    boolean bool2;
    if (((WalletFragmentInitParams.a(this.aul) != null) && (WalletFragmentInitParams.b(this.aul) == null)) || ((WalletFragmentInitParams.a(this.aul) == null) && (WalletFragmentInitParams.b(this.aul) != null)))
    {
      bool2 = bool1;
      o.a(bool2, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
      if (WalletFragmentInitParams.c(this.aul) < 0)
        break label76;
    }
    while (true)
    {
      o.a(bool1, "masked wallet request code is required and must be non-negative");
      return this.aul;
      bool2 = false;
      break;
      label76: bool1 = false;
    }
  }

  public final Builder setAccountName(String paramString)
  {
    WalletFragmentInitParams.a(this.aul, paramString);
    return this;
  }

  public final Builder setMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    WalletFragmentInitParams.a(this.aul, paramMaskedWallet);
    return this;
  }

  public final Builder setMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    WalletFragmentInitParams.a(this.aul, paramMaskedWalletRequest);
    return this;
  }

  public final Builder setMaskedWalletRequestCode(int paramInt)
  {
    WalletFragmentInitParams.a(this.aul, paramInt);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentInitParams.Builder
 * JD-Core Version:    0.6.2
 */