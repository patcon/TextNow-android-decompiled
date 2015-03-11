package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<PutDataRequest>
{
  static void a(PutDataRequest paramPutDataRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramPutDataRequest.BR);
    b.a(paramParcel, 2, paramPutDataRequest.getUri(), paramInt, false);
    b.a(paramParcel, 4, paramPutDataRequest.pT(), false);
    b.a(paramParcel, 5, paramPutDataRequest.getData(), false);
    b.H(paramParcel, i);
  }

  public PutDataRequest dR(Parcel paramParcel)
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
    return new PutDataRequest(j, localUri, localBundle, arrayOfByte);
  }

  public PutDataRequest[] fU(int paramInt)
  {
    return new PutDataRequest[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.e
 * JD-Core Version:    0.6.2
 */