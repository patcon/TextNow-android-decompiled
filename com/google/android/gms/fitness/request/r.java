package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r
  implements Parcelable.Creator<q>
{
  static void a(q paramq, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramq.jw(), false);
    b.c(paramParcel, 1000, paramq.getVersionCode());
    b.a(paramParcel, 2, paramq.jr(), paramInt, false);
    b.H(paramParcel, i);
  }

  public q bJ(Parcel paramParcel)
  {
    PendingIntent localPendingIntent = null;
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
        break;
      case 2:
        localPendingIntent = (PendingIntent)a.a(paramParcel, k, PendingIntent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new q(j, localIBinder, localPendingIntent);
  }

  public q[] db(int paramInt)
  {
    return new q[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.r
 * JD-Core Version:    0.6.2
 */