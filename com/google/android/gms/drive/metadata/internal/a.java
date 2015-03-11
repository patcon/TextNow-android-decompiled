package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class a
  implements Parcelable.Creator<AppVisibleCustomProperties>
{
  static void a(AppVisibleCustomProperties paramAppVisibleCustomProperties, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramAppVisibleCustomProperties.xM);
    b.b(paramParcel, 2, paramAppVisibleCustomProperties.JO, false);
    b.G(paramParcel, i);
  }

  public AppVisibleCustomProperties aA(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.a.B(paramParcel);
    int j = 0;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = com.google.android.gms.common.internal.safeparcel.a.A(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
      {
      default:
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, k);
        break;
      case 1:
        j = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, k);
        break;
      case 2:
        localArrayList = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, k, CustomProperty.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new AppVisibleCustomProperties(j, localArrayList);
  }

  public AppVisibleCustomProperties[] bw(int paramInt)
  {
    return new AppVisibleCustomProperties[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.a
 * JD-Core Version:    0.6.2
 */