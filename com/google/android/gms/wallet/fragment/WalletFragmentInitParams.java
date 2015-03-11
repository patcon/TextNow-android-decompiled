package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams
  implements SafeParcelable
{
  public static final Parcelable.Creator<WalletFragmentInitParams> CREATOR = new a();
  final int BR;
  private String Dd;
  private MaskedWalletRequest atW;
  private MaskedWallet atX;
  private int auk;

  private WalletFragmentInitParams()
  {
    this.BR = 1;
    this.auk = -1;
  }

  WalletFragmentInitParams(int paramInt1, String paramString, MaskedWalletRequest paramMaskedWalletRequest, int paramInt2, MaskedWallet paramMaskedWallet)
  {
    this.BR = paramInt1;
    this.Dd = paramString;
    this.atW = paramMaskedWalletRequest;
    this.auk = paramInt2;
    this.atX = paramMaskedWallet;
  }

  public static WalletFragmentInitParams.Builder newBuilder()
  {
    WalletFragmentInitParams localWalletFragmentInitParams = new WalletFragmentInitParams();
    localWalletFragmentInitParams.getClass();
    return new WalletFragmentInitParams.Builder(localWalletFragmentInitParams, null);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getAccountName()
  {
    return this.Dd;
  }

  public final MaskedWallet getMaskedWallet()
  {
    return this.atX;
  }

  public final MaskedWalletRequest getMaskedWalletRequest()
  {
    return this.atW;
  }

  public final int getMaskedWalletRequestCode()
  {
    return this.auk;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentInitParams
 * JD-Core Version:    0.6.2
 */