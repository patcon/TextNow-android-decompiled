package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ae
  implements Parcelable.Creator<ad>
{
  static void a(ad paramad, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramad.jC(), false);
    b.c(paramParcel, 1000, paramad.getVersionCode());
    b.H(paramParcel, i);
  }

  public ad bR(Parcel paramParcel)
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
        localIBinder = a.p(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ad(j, localIBinder);
  }

  public ad[] dj(int paramInt)
  {
    return new ad[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.ae
 * JD-Core Version:    0.6.2
 */