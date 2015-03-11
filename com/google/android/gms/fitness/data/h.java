package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class h
  implements Parcelable.Creator<DataType>
{
  static void a(DataType paramDataType, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramDataType.getName(), false);
    b.c(paramParcel, 1000, paramDataType.getVersionCode());
    b.c(paramParcel, 2, paramDataType.getFields(), false);
    b.H(paramParcel, i);
  }

  public DataType bo(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    int i = a.C(paramParcel);
    int j = 0;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        str = a.o(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localArrayList = a.c(paramParcel, k, Field.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new DataType(j, str, localArrayList);
  }

  public DataType[] cE(int paramInt)
  {
    return new DataType[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.h
 * JD-Core Version:    0.6.2
 */