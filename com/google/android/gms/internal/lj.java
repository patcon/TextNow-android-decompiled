package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class lj
  implements Parcelable.Creator<li>
{
  static void a(li paramli, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramli.getVersionCode());
    b.a(paramParcel, 2, paramli.ake, false);
    b.a(paramParcel, 3, paramli.akf, false);
    b.G(paramParcel, i);
  }

  public li cf(Parcel paramParcel)
  {
    byte[][] arrayOfByte = null;
    int i = a.B(paramParcel);
    int j = 0;
    String[] arrayOfString = null;
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
        arrayOfString = a.A(paramParcel, k);
        break;
      case 3:
        arrayOfByte = a.s(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new li(j, arrayOfString, arrayOfByte);
  }

  public li[] dL(int paramInt)
  {
    return new li[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lj
 * JD-Core Version:    0.6.2
 */