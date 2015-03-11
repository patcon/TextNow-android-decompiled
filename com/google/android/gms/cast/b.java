package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import java.util.ArrayList;

public class b
  implements Parcelable.Creator<CastDevice>
{
  static void a(CastDevice paramCastDevice, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.D(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramCastDevice.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramCastDevice.getDeviceId(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramCastDevice.ES, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 4, paramCastDevice.getFriendlyName(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 5, paramCastDevice.getModelName(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 6, paramCastDevice.getDeviceVersion(), false);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 7, paramCastDevice.getServicePort());
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 8, paramCastDevice.getIcons(), false);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 9, paramCastDevice.getCapabilities());
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 10, paramCastDevice.getStatus());
    com.google.android.gms.common.internal.safeparcel.b.H(paramParcel, i);
  }

  public CastDevice[] Y(int paramInt)
  {
    return new CastDevice[paramInt];
  }

  public CastDevice u(Parcel paramParcel)
  {
    int i = 0;
    ArrayList localArrayList = null;
    int j = a.C(paramParcel);
    int k = 0;
    int m = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    int n = 0;
    while (paramParcel.dataPosition() < j)
    {
      int i1 = a.B(paramParcel);
      switch (a.aD(i1))
      {
      default:
        a.b(paramParcel, i1);
        break;
      case 1:
        n = a.g(paramParcel, i1);
        break;
      case 2:
        str5 = a.o(paramParcel, i1);
        break;
      case 3:
        str4 = a.o(paramParcel, i1);
        break;
      case 4:
        str3 = a.o(paramParcel, i1);
        break;
      case 5:
        str2 = a.o(paramParcel, i1);
        break;
      case 6:
        str1 = a.o(paramParcel, i1);
        break;
      case 7:
        m = a.g(paramParcel, i1);
        break;
      case 8:
        localArrayList = a.c(paramParcel, i1, WebImage.CREATOR);
        break;
      case 9:
        k = a.g(paramParcel, i1);
        break;
      case 10:
        i = a.g(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new CastDevice(n, str5, str4, str3, str2, str1, m, localArrayList, k, i);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.b
 * JD-Core Version:    0.6.2
 */