package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n
  implements Parcelable.Creator<m>
{
  static void a(m paramm, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramm.BR);
    b.a(paramParcel, 2, paramm.getUri(), paramInt, false);
    b.a(paramParcel, 4, paramm.pT(), false);
    b.a(paramParcel, 5, paramm.getData(), false);
    b.H(paramParcel, i);
  }

  public m dU(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    Bundle localBundle = null;
    Uri localUri = null;
    int j = 0;
    byte[] arrayOfByte = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      case 3:
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localUri = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 4:
        localBundle = a.q(paramParcel, k);
        break;
      case 5:
        arrayOfByte = a.r(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new m(j, localUri, localBundle, arrayOfByte);
  }

  public m[] fX(int paramInt)
  {
    return new m[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.n
 * JD-Core Version:    0.6.2
 */