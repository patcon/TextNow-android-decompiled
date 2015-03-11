package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class hl
  implements Parcelable.Creator<gy.a>
{
  static void a(gy.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.a(paramParcel, 1, parama.getAccountName(), false);
    b.c(paramParcel, 1000, parama.getVersionCode());
    b.a(paramParcel, 2, parama.fl(), false);
    b.c(paramParcel, 3, parama.fk());
    b.a(paramParcel, 4, parama.fn(), false);
    b.G(paramParcel, i);
  }

  public gy.a[] aq(int paramInt)
  {
    return new gy.a[paramInt];
  }

  public gy.a z(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = a.B(paramParcel);
    ArrayList localArrayList = null;
    String str2 = null;
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
        str2 = a.o(paramParcel, m);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        localArrayList = a.B(paramParcel, m);
        break;
      case 3:
        i = a.g(paramParcel, m);
        break;
      case 4:
        str1 = a.o(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new gy.a(k, str2, localArrayList, i, str1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hl
 * JD-Core Version:    0.6.2
 */