package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class w
  implements Parcelable.Creator<v>
{
  static void a(v paramv, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramv.versionCode);
    b.c(paramParcel, 2, paramv.statusCode);
    b.c(paramParcel, 3, paramv.avz, false);
    b.H(paramParcel, i);
  }

  public v dY(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
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
        localArrayList = a.c(paramParcel, m, ak.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new v(k, i, localArrayList);
  }

  public v[] gb(int paramInt)
  {
    return new v[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.w
 * JD-Core Version:    0.6.2
 */