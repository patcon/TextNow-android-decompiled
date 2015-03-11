package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h
  implements Parcelable.Creator<MetadataBundle>
{
  static void a(MetadataBundle paramMetadataBundle, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramMetadataBundle.BR);
    b.a(paramParcel, 2, paramMetadataBundle.PL, false);
    b.H(paramParcel, i);
  }

  public MetadataBundle aH(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    Bundle localBundle = null;
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
        localBundle = a.q(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new MetadataBundle(j, localBundle);
  }

  public MetadataBundle[] bT(int paramInt)
  {
    return new MetadataBundle[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.h
 * JD-Core Version:    0.6.2
 */