package com.google.android.gms.wallet.fragment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator<WalletFragmentStyle>
{
  static void a(WalletFragmentStyle paramWalletFragmentStyle, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramWalletFragmentStyle.xM);
    b.a(paramParcel, 2, paramWalletFragmentStyle.akE, false);
    b.c(paramParcel, 3, paramWalletFragmentStyle.akF);
    b.G(paramParcel, i);
  }

  public WalletFragmentStyle ci(Parcel paramParcel)
  {
    int i = 0;
    int j = a.B(paramParcel);
    Bundle localBundle = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.A(paramParcel);
      switch (a.ar(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        k = a.g(paramParcel, m);
        break;
      case 2:
        localBundle = a.q(paramParcel, m);
        break;
      case 3:
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new WalletFragmentStyle(k, localBundle, i);
  }

  public WalletFragmentStyle[] dP(int paramInt)
  {
    return new WalletFragmentStyle[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.c
 * JD-Core Version:    0.6.2
 */