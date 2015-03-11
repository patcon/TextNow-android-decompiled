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
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramd.getVersionCode());
    b.a(paramParcel, 2, paramd.asz, paramInt, false);
    b.a(paramParcel, 3, paramd.asA, paramInt, false);
    b.H(paramParcel, i);
  }

  public d dq(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    LoyaltyWalletObject localLoyaltyWalletObject = null;
    int j = 0;
    OfferWalletObject localOfferWalletObject = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
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

  public d[] fr(int paramInt)
  {
    return new d[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.e
 * JD-Core Version:    0.6.2
 */