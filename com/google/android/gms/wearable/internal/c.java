package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;

public class c
  implements Parcelable.Creator<b>
{
  static void a(b paramb, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.D(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramb.BR);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramb.pV(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramb.avl, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.H(paramParcel, i);
  }

  public b dS(Parcel paramParcel)
  {
    IntentFilter[] arrayOfIntentFilter = null;
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
        break;
      case 3:
        arrayOfIntentFilter = (IntentFilter[])a.b(paramParcel, k, IntentFilter.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new b(j, localIBinder, arrayOfIntentFilter);
  }

  public b[] fV(int paramInt)
  {
    return new b[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.c
 * JD-Core Version:    0.6.2
 */