package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<d>
{
  static void a(d paramd, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramd.getVersionCode());
    b.a(paramParcel, 2, paramd.aiO, paramInt, false);
    b.a(paramParcel, 3, paramd.aiP, paramInt, false);
    b.G(paramParcel, i);
  }

  public d bT(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    LoyaltyWalletObject localLoyaltyWalletObject = null;
    int j = 0;
    OfferWalletObject localOfferWalletObject = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.A(paramParcel);
      switch (a.ar(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localLoyaltyWalletObject = (LoyaltyWalletObject)a.a(paramParcel, k, LoyaltyWalletObject.CREATOR);
        break;
      case 3:
        localOfferWalletObject = (OfferWalletObject)a.a(paramParcel, k, OfferWalletObject.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new d(j, localLoyaltyWalletObject, localOfferWalletObject);
  }

  public d[] dz(int paramInt)
  {
    return new d[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.e
 * JD-Core Version:    0.6.2
 */