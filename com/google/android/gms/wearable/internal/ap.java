package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ap
  implements Parcelable.Creator<ao>
{
  static void a(ao paramao, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramao.versionCode);
    b.c(paramParcel, 2, paramao.statusCode);
    b.a(paramParcel, 3, paramao.avA, paramInt, false);
    b.H(paramParcel, i);
  }

  public ao ef(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    m localm = null;
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
        localm = (m)a.a(paramParcel, m, m.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new ao(k, i, localm);
  }

  public ao[] gi(int paramInt)
  {
    return new ao[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ap
 * JD-Core Version:    0.6.2
 */