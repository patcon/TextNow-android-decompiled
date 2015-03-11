package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

public class ak
  implements Parcelable.Creator<aj>
{
  static void a(aj paramaj, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramaj.getDataType(), paramInt, false);
    b.c(paramParcel, 1000, paramaj.getVersionCode());
    b.a(paramParcel, 2, paramaj.getDataSource(), paramInt, false);
    b.H(paramParcel, i);
  }

  public aj bU(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    DataType localDataType = null;
    int j = 0;
    DataSource localDataSource = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localDataType = (DataType)a.a(paramParcel, k, DataType.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localDataSource = (DataSource)a.a(paramParcel, k, DataSource.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new aj(j, localDataType, localDataSource);
  }

  public aj[] dm(int paramInt)
  {
    return new aj[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.ak
 * JD-Core Version:    0.6.2
 */