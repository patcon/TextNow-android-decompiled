package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

public class b
  implements Parcelable.Creator<DataReadResult>
{
  static void a(DataReadResult paramDataReadResult, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.D(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.d(paramParcel, 1, paramDataReadResult.jJ(), false);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1000, paramDataReadResult.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramDataReadResult.getStatus(), paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.d(paramParcel, 3, paramDataReadResult.jI(), false);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 5, paramDataReadResult.jH());
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 6, paramDataReadResult.iL(), false);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 7, paramDataReadResult.jK(), false);
    com.google.android.gms.common.internal.safeparcel.b.H(paramParcel, i);
  }

  public DataReadResult bW(Parcel paramParcel)
  {
    int i = 0;
    ArrayList localArrayList1 = null;
    int j = a.C(paramParcel);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = null;
    Status localStatus = null;
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
        a.a(paramParcel, m, localArrayList2, getClass().getClassLoader());
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        localStatus = (Status)a.a(paramParcel, m, Status.CREATOR);
        break;
      case 3:
        a.a(paramParcel, m, localArrayList3, getClass().getClassLoader());
        break;
      case 5:
        i = a.g(paramParcel, m);
        break;
      case 6:
        localArrayList4 = a.c(paramParcel, m, DataSource.CREATOR);
        break;
      case 7:
        localArrayList1 = a.c(paramParcel, m, DataType.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new DataReadResult(k, localArrayList2, localStatus, localArrayList3, i, localArrayList4, localArrayList1);
  }

  public DataReadResult[] jdMethod_do(int paramInt)
  {
    return new DataReadResult[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.result.b
 * JD-Core Version:    0.6.2
 */