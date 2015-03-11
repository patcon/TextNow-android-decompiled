package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wearable.c;

public class u
  implements Parcelable.Creator<t>
{
  static void a(t paramt, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramt.versionCode);
    b.c(paramParcel, 2, paramt.statusCode);
    b.a(paramParcel, 3, paramt.avy, paramInt, false);
    b.H(paramParcel, i);
  }

  public t dX(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    c[] arrayOfc = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.B(paramParcel);
      switch (a.aD(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        k = a.g(paramParcel, m);
        break;
      case 2:
        i = a.g(paramParcel, m);
        break;
      case 3:
        arrayOfc = (c[])a.b(paramParcel, m, c.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new t(k, i, arrayOfc);
  }

  public t[] ga(int paramInt)
  {
    return new t[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.u
 * JD-Core Version:    0.6.2
 */