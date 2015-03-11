package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator<CountrySpecification>
{
  static void a(CountrySpecification paramCountrySpecification, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramCountrySpecification.getVersionCode());
    b.a(paramParcel, 2, paramCountrySpecification.rf, false);
    b.G(paramParcel, i);
  }

  public CountrySpecification bS(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    int j = 0;
    String str = null;
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
        str = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new CountrySpecification(j, str);
  }

  public CountrySpecification[] dy(int paramInt)
  {
    return new CountrySpecification[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.c
 * JD-Core Version:    0.6.2
 */