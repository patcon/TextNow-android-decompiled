package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class fh
  implements Parcelable.Creator<fg>
{
  static void a(fg paramfg, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.a(paramParcel, 1, paramfg.xN, paramInt, false);
    b.c(paramParcel, 1000, paramfg.xM);
    b.a(paramParcel, 2, paramfg.xO, false);
    b.a(paramParcel, 3, paramfg.xP);
    b.G(paramParcel, i);
  }

  public fg[] D(int paramInt)
  {
    return new fg[paramInt];
  }

  public fg l(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    String str = null;
    fk[] arrayOffk = null;
    int j = 0;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.A(paramParcel);
      switch (a.ar(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        arrayOffk = (fk[])a.b(paramParcel, k, fk.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        str = a.o(paramParcel, k);
        break;
      case 3:
        bool = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new fg(j, arrayOffk, str, bool);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fh
 * JD-Core Version:    0.6.2
 */