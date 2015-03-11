package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class fl
  implements Parcelable.Creator<fk>
{
  static void a(fk paramfk, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.a(paramParcel, 1, paramfk.xU, false);
    b.c(paramParcel, 1000, paramfk.xM);
    b.a(paramParcel, 3, paramfk.xV, paramInt, false);
    b.c(paramParcel, 4, paramfk.xW);
    b.a(paramParcel, 5, paramfk.xX, false);
    b.G(paramParcel, i);
  }

  public fk[] F(int paramInt)
  {
    return new fk[paramInt];
  }

  public fk n(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    int i = a.B(paramParcel);
    int j = 0;
    int k = -1;
    fp localfp = null;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.A(paramParcel);
      switch (a.ar(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        str = a.o(paramParcel, m);
        break;
      case 1000:
        j = a.g(paramParcel, m);
        break;
      case 3:
        localfp = (fp)a.a(paramParcel, m, fp.CREATOR);
        break;
      case 4:
        k = a.g(paramParcel, m);
        break;
      case 5:
        arrayOfByte = a.r(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new fk(j, str, localfp, k, arrayOfByte);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fl
 * JD-Core Version:    0.6.2
 */