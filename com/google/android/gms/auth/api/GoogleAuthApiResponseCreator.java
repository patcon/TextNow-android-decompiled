package com.google.android.gms.auth.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class GoogleAuthApiResponseCreator
  implements Parcelable.Creator<GoogleAuthApiResponse>
{
  public static final int CONTENT_DESCRIPTION;

  static void a(GoogleAuthApiResponse paramGoogleAuthApiResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramGoogleAuthApiResponse.responseCode);
    b.c(paramParcel, 1000, paramGoogleAuthApiResponse.versionCode);
    b.a(paramParcel, 2, paramGoogleAuthApiResponse.Dz, false);
    b.a(paramParcel, 3, paramGoogleAuthApiResponse.DA, false);
    b.H(paramParcel, i);
  }

  public GoogleAuthApiResponse createFromParcel(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    int i = a.C(paramParcel);
    int j = 0;
    int k = 0;
    Bundle localBundle = null;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.B(paramParcel);
      switch (a.aD(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        j = a.g(paramParcel, m);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        localBundle = a.q(paramParcel, m);
        break;
      case 3:
        arrayOfByte = a.r(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new GoogleAuthApiResponse(k, j, localBundle, arrayOfByte);
  }

  public GoogleAuthApiResponse[] newArray(int paramInt)
  {
    return new GoogleAuthApiResponse[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.GoogleAuthApiResponseCreator
 * JD-Core Version:    0.6.2
 */