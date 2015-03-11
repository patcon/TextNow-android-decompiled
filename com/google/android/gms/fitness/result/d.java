package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataType;

public class d
  implements Parcelable.Creator<DataTypeResult>
{
  static void a(DataTypeResult paramDataTypeResult, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramDataTypeResult.getStatus(), paramInt, false);
    b.c(paramParcel, 1000, paramDataTypeResult.getVersionCode());
    b.a(paramParcel, 3, paramDataTypeResult.getDataType(), paramInt, false);
    b.H(paramParcel, i);
  }

  public DataTypeResult bY(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    Status localStatus = null;
    int j = 0;
    DataType localDataType = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localStatus = (Status)a.a(paramParcel, k, Status.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 3:
        localDataType = (DataType)a.a(paramParcel, k, DataType.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new DataTypeResult(j, localStatus, localDataType);
  }

  public DataTypeResult[] dq(int paramInt)
  {
    return new DataTypeResult[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.result.d
 * JD-Core Version:    0.6.2
 */