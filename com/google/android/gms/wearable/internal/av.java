package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class av
  implements Parcelable.Creator<au>
{
  static void a(au paramau, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramau.versionCode);
    b.c(paramParcel, 2, paramau.statusCode);
    b.a(paramParcel, 3, paramau.avN);
    b.c(paramParcel, 4, paramau.avP, false);
    b.H(paramParcel, i);
  }

  public au ei(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    long l = 0L;
    ArrayList localArrayList = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.B(paramParcel);
      switch (a.aD(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        k = a.g(paramParcel, m);
        break;
      case 2:
        i = a.g(paramParcel, m);
        break;
      case 3:
        l = a.i(paramParcel, m);
        break;
      case 4:
        localArrayList = a.c(paramParcel, m, am.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new au(k, i, l, localArrayList);
  }

  public au[] gl(int paramInt)
  {
    return new au[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.av
 * JD-Core Version:    0.6.2
 */