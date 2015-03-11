package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class v
  implements Parcelable.Creator<u>
{
  static void a(u paramu, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramu.jr(), paramInt, false);
    b.c(paramParcel, 1000, paramu.getVersionCode());
    b.H(paramParcel, i);
  }

  public u bM(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    PendingIntent localPendingIntent = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localPendingIntent = (PendingIntent)a.a(paramParcel, k, PendingIntent.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new u(j, localPendingIntent);
  }

  public u[] de(int paramInt)
  {
    return new u[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.v
 * JD-Core Version:    0.6.2
 */