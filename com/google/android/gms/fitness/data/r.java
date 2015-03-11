package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r
  implements Parcelable.Creator<q>
{
  static void a(q paramq, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramq.getSession(), paramInt, false);
    b.c(paramParcel, 1000, paramq.BR);
    b.a(paramParcel, 2, paramq.iW(), paramInt, false);
    b.H(paramParcel, i);
  }

  public q bv(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    Session localSession = null;
    int j = 0;
    DataSet localDataSet = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localSession = (Session)a.a(paramParcel, k, Session.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localDataSet = (DataSet)a.a(paramParcel, k, DataSet.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new q(j, localSession, localDataSet);
  }

  public q[] cM(int paramInt)
  {
    return new q[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.r
 * JD-Core Version:    0.6.2
 */