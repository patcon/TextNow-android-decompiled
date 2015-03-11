package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class cp
  implements Parcelable.Creator<cq>
{
  static void a(cq paramcq, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramcq.versionCode);
    b.a(paramParcel, 2, paramcq.bd(), false);
    b.a(paramParcel, 3, paramcq.be(), false);
    b.a(paramParcel, 4, paramcq.bf(), false);
    b.a(paramParcel, 5, paramcq.bg(), false);
    b.G(paramParcel, i);
  }

  public cq g(Parcel paramParcel)
  {
    IBinder localIBinder1 = null;
    int i = a.B(paramParcel);
    int j = 0;
    IBinder localIBinder2 = null;
    IBinder localIBinder3 = null;
    IBinder localIBinder4 = null;
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
        localIBinder4 = a.p(paramParcel, k);
        break;
      case 3:
        localIBinder3 = a.p(paramParcel, k);
        break;
      case 4:
        localIBinder2 = a.p(paramParcel, k);
        break;
      case 5:
        localIBinder1 = a.p(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new cq(j, localIBinder4, localIBinder3, localIBinder2, localIBinder1);
  }

  public cq[] k(int paramInt)
  {
    return new cq[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cp
 * JD-Core Version:    0.6.2
 */