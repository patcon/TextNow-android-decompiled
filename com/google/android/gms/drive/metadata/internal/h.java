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
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramMetadataBundle.xM);
    b.a(paramParcel, 2, paramMetadataBundle.JS, false);
    b.G(paramParcel, i);
  }

  public MetadataBundle aC(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    int j = 0;
    Bundle localBundle = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.A(paramParcel);
      switch (a.ar(k))
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

  public MetadataBundle[] by(int paramInt)
  {
    return new MetadataBundle[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.h
 * JD-Core Version:    0.6.2
 */