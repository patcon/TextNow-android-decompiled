package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public class n
  implements Parcelable.Creator<OfferWalletObject>
{
  static void a(OfferWalletObject paramOfferWalletObject, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramOfferWalletObject.getVersionCode());
    b.a(paramParcel, 2, paramOfferWalletObject.eC, false);
    b.a(paramParcel, 3, paramOfferWalletObject.ajT, false);
    b.a(paramParcel, 4, paramOfferWalletObject.ajU, paramInt, false);
    b.G(paramParcel, i);
  }

  public OfferWalletObject cc(Parcel paramParcel)
  {
    CommonWalletObject localCommonWalletObject = null;
    int i = a.B(paramParcel);
    String str1 = null;
    int j = 0;
    String str2 = null;
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
        str1 = a.o(paramParcel, k);
        break;
      case 3:
        str2 = a.o(paramParcel, k);
        break;
      case 4:
        localCommonWalletObject = (CommonWalletObject)a.a(paramParcel, k, CommonWalletObject.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new OfferWalletObject(j, str1, str2, localCommonWalletObject);
  }

  public OfferWalletObject[] dI(int paramInt)
  {
    return new OfferWalletObject[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.n
 * JD-Core Version:    0.6.2
 */