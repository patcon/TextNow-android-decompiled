package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class jt
  implements Parcelable.Creator<js>
{
  static void a(js paramjs, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.a(paramParcel, 1, paramjs.qX, false);
    b.c(paramParcel, 1000, paramjs.xM);
    b.G(paramParcel, i);
  }

  public js by(Parcel paramParcel)
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
        str = a.o(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new js(j, str);
  }

  public js[] cT(int paramInt)
  {
    return new js[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jt
 * JD-Core Version:    0.6.2
 */