package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;

public class b
  implements Parcelable.Creator<a>
{
  static void a(a parama, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.D(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, parama.BR);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, parama.JR, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 3, parama.FD);
    com.google.android.gms.common.internal.safeparcel.b.H(paramParcel, i);
  }

  public a[] ao(int paramInt)
  {
    return new a[paramInt];
  }

  public a y(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.a.C(paramParcel);
    ParcelFileDescriptor localParcelFileDescriptor = null;
    int j = 0;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.B(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.aD(m))
      {
      default:
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        break;
      case 1:
        j = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 2:
        localParcelFileDescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(paramParcel, m, ParcelFileDescriptor.CREATOR);
        break;
      case 3:
        k = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new a(j, localParcelFileDescriptor, k);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.b
 * JD-Core Version:    0.6.2
 */