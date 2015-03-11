package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

public class h
  implements Parcelable.Creator<DataSourcesRequest>
{
  static void a(DataSourcesRequest paramDataSourcesRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramDataSourcesRequest.getDataTypes(), false);
    b.c(paramParcel, 1000, paramDataSourcesRequest.getVersionCode());
    b.a(paramParcel, 2, paramDataSourcesRequest.jp(), false);
    b.a(paramParcel, 3, paramDataSourcesRequest.jo());
    b.H(paramParcel, i);
  }

  public DataSourcesRequest bE(Parcel paramParcel)
  {
    ArrayList localArrayList1 = null;
    boolean bool = false;
    int i = a.C(paramParcel);
    ArrayList localArrayList2 = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localArrayList2 = a.c(paramParcel, k, DataType.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localArrayList1 = a.B(paramParcel, k);
        break;
      case 3:
        bool = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new DataSourcesRequest(j, localArrayList2, localArrayList1, bool);
  }

  public DataSourcesRequest[] cV(int paramInt)
  {
    return new DataSourcesRequest[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.h
 * JD-Core Version:    0.6.2
 */