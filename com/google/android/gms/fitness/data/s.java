package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class s
  implements Parcelable.Creator<Subscription>
{
  static void a(Subscription paramSubscription, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramSubscription.getDataSource(), paramInt, false);
    b.c(paramParcel, 1000, paramSubscription.getVersionCode());
    b.a(paramParcel, 2, paramSubscription.getDataType(), paramInt, false);
    b.a(paramParcel, 3, paramSubscription.iX());
    b.c(paramParcel, 4, paramSubscription.getAccuracyMode());
    b.H(paramParcel, i);
  }

  public Subscription bw(Parcel paramParcel)
  {
    DataType localDataType = null;
    int i = 0;
    int j = a.C(paramParcel);
    long l = 0L;
    DataSource localDataSource = null;
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
        localDataSource = (DataSource)a.a(paramParcel, m, DataSource.CREATOR);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        localDataType = (DataType)a.a(paramParcel, m, DataType.CREATOR);
        break;
      case 3:
        l = a.i(paramParcel, m);
        break;
      case 4:
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new Subscription(k, localDataSource, localDataType, l, i);
  }

  public Subscription[] cN(int paramInt)
  {
    return new Subscription[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.s
 * JD-Core Version:    0.6.2
 */