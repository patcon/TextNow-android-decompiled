package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.fitness.data.BleDevice;

public class c
  implements Parcelable.Creator<b>
{
  static void a(b paramb, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.D(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, paramb.getDeviceAddress(), false);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1000, paramb.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramb.jf(), paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.H(paramParcel, i);
  }

  public b bA(Parcel paramParcel)
  {
    BleDevice localBleDevice = null;
    int i = a.C(paramParcel);
    int j = 0;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        str = a.o(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localBleDevice = (BleDevice)a.a(paramParcel, k, BleDevice.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new b(j, str, localBleDevice);
  }

  public b[] cR(int paramInt)
  {
    return new b[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.c
 * JD-Core Version:    0.6.2
 */