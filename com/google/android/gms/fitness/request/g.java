package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

public class g
  implements Parcelable.Creator<DataReadRequest>
{
  static void a(DataReadRequest paramDataReadRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramDataReadRequest.getDataTypes(), false);
    b.c(paramParcel, 1000, paramDataReadRequest.getVersionCode());
    b.c(paramParcel, 2, paramDataReadRequest.getDataSources(), false);
    b.a(paramParcel, 3, paramDataReadRequest.iD());
    b.a(paramParcel, 4, paramDataReadRequest.iE());
    b.c(paramParcel, 5, paramDataReadRequest.getAggregatedDataTypes(), false);
    b.c(paramParcel, 6, paramDataReadRequest.getAggregatedDataSources(), false);
    b.c(paramParcel, 7, paramDataReadRequest.getBucketType());
    b.a(paramParcel, 8, paramDataReadRequest.jn());
    b.a(paramParcel, 9, paramDataReadRequest.getActivityDataSource(), paramInt, false);
    b.c(paramParcel, 10, paramDataReadRequest.getLimit());
    b.a(paramParcel, 11, paramDataReadRequest.jk());
    b.a(paramParcel, 12, paramDataReadRequest.jm());
    b.a(paramParcel, 13, paramDataReadRequest.jl());
    b.H(paramParcel, i);
  }

  public DataReadRequest bD(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    long l1 = 0L;
    long l2 = 0L;
    ArrayList localArrayList3 = null;
    ArrayList localArrayList4 = null;
    int k = 0;
    long l3 = 0L;
    DataSource localDataSource = null;
    int m = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.B(paramParcel);
      switch (a.aD(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        localArrayList1 = a.c(paramParcel, n, DataType.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, n);
        break;
      case 2:
        localArrayList2 = a.c(paramParcel, n, DataSource.CREATOR);
        break;
      case 3:
        l1 = a.i(paramParcel, n);
        break;
      case 4:
        l2 = a.i(paramParcel, n);
        break;
      case 5:
        localArrayList3 = a.c(paramParcel, n, DataType.CREATOR);
        break;
      case 6:
        localArrayList4 = a.c(paramParcel, n, DataSource.CREATOR);
        break;
      case 7:
        k = a.g(paramParcel, n);
        break;
      case 8:
        l3 = a.i(paramParcel, n);
        break;
      case 9:
        localDataSource = (DataSource)a.a(paramParcel, n, DataSource.CREATOR);
        break;
      case 10:
        m = a.g(paramParcel, n);
        break;
      case 11:
        bool1 = a.c(paramParcel, n);
        break;
      case 12:
        bool2 = a.c(paramParcel, n);
        break;
      case 13:
        bool3 = a.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new DataReadRequest(j, localArrayList1, localArrayList2, l1, l2, localArrayList3, localArrayList4, k, l3, localDataSource, m, bool1, bool2, bool3);
  }

  public DataReadRequest[] cU(int paramInt)
  {
    return new DataReadRequest[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.g
 * JD-Core Version:    0.6.2
 */