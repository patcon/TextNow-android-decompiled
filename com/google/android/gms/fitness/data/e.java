package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<DataPoint>
{
  static void a(DataPoint paramDataPoint, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramDataPoint.getDataSource(), paramInt, false);
    b.c(paramParcel, 1000, paramDataPoint.getVersionCode());
    b.a(paramParcel, 3, paramDataPoint.getTimestampNanos());
    b.a(paramParcel, 4, paramDataPoint.iJ());
    b.a(paramParcel, 5, paramDataPoint.iG(), paramInt, false);
    b.a(paramParcel, 6, paramDataPoint.getOriginalDataSource(), paramInt, false);
    b.a(paramParcel, 7, paramDataPoint.iH());
    b.a(paramParcel, 8, paramDataPoint.iI());
    b.H(paramParcel, i);
  }

  public DataPoint bl(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    DataSource localDataSource1 = null;
    long l1 = 0L;
    long l2 = 0L;
    Value[] arrayOfValue = null;
    DataSource localDataSource2 = null;
    long l3 = 0L;
    long l4 = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localDataSource1 = (DataSource)a.a(paramParcel, k, DataSource.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 3:
        l1 = a.i(paramParcel, k);
        break;
      case 4:
        l2 = a.i(paramParcel, k);
        break;
      case 5:
        arrayOfValue = (Value[])a.b(paramParcel, k, Value.CREATOR);
        break;
      case 6:
        localDataSource2 = (DataSource)a.a(paramParcel, k, DataSource.CREATOR);
        break;
      case 7:
        l3 = a.i(paramParcel, k);
        break;
      case 8:
        l4 = a.i(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new DataPoint(j, localDataSource1, l1, l2, arrayOfValue, localDataSource2, l3, l4);
  }

  public DataPoint[] cB(int paramInt)
  {
    return new DataPoint[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.e
 * JD-Core Version:    0.6.2
 */