package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class ho
  implements Parcelable.Creator<hm.b>
{
  static void a(hm.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1000, paramb.BR);
    b.a(paramParcel, 1, paramb.Ck, paramInt, false);
    b.c(paramParcel, 2, paramb.Cl, false);
    b.H(paramParcel, i);
  }

  public hm.b[] N(int paramInt)
  {
    return new hm.b[paramInt];
  }

  public hm.b q(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    Status localStatus = null;
    int j = 0;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 1:
        localStatus = (Status)a.a(paramParcel, k, Status.CREATOR);
        break;
      case 2:
        localArrayList = a.c(paramParcel, k, hs.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new hm.b(j, localStatus, localArrayList);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ho
 * JD-Core Version:    0.6.2
 */