package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n
  implements Parcelable.Creator<RawDataPoint>
{
  static void a(RawDataPoint paramRawDataPoint, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramRawDataPoint.SG);
    b.c(paramParcel, 1000, paramRawDataPoint.BR);
    b.a(paramParcel, 2, paramRawDataPoint.SH);
    b.a(paramParcel, 3, paramRawDataPoint.SI, paramInt, false);
    b.c(paramParcel, 4, paramRawDataPoint.Tm);
    b.c(paramParcel, 5, paramRawDataPoint.Tn);
    b.a(paramParcel, 6, paramRawDataPoint.SK);
    b.a(paramParcel, 7, paramRawDataPoint.SL);
    b.H(paramParcel, i);
  }

  public RawDataPoint bs(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    long l1 = 0L;
    long l2 = 0L;
    Value[] arrayOfValue = null;
    int k = 0;
    int m = 0;
    long l3 = 0L;
    long l4 = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.B(paramParcel);
      switch (a.aD(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        l1 = a.i(paramParcel, n);
        break;
      case 1000:
        j = a.g(paramParcel, n);
        break;
      case 2:
        l2 = a.i(paramParcel, n);
        break;
      case 3:
        arrayOfValue = (Value[])a.b(paramParcel, n, Value.CREATOR);
        break;
      case 4:
        k = a.g(paramParcel, n);
        break;
      case 5:
        m = a.g(paramParcel, n);
        break;
      case 6:
        l3 = a.i(paramParcel, n);
        break;
      case 7:
        l4 = a.i(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new RawDataPoint(j, l1, l2, arrayOfValue, k, m, l3, l4);
  }

  public RawDataPoint[] cI(int paramInt)
  {
    return new RawDataPoint[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.n
 * JD-Core Version:    0.6.2
 */