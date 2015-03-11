package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ar
  implements Parcelable.Creator<aq>
{
  static void a(aq paramaq, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramaq.BR);
    b.a(paramParcel, 2, paramaq.pV(), false);
    b.H(paramParcel, i);
  }

  public aq eg(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    IBinder localIBinder = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localIBinder = a.p(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new aq(j, localIBinder);
  }

  public aq[] gj(int paramInt)
  {
    return new aq[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ar
 * JD-Core Version:    0.6.2
 */