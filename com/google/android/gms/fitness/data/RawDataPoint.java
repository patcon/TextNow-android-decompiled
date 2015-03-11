package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class RawDataPoint
  implements SafeParcelable
{
  public static final Parcelable.Creator<RawDataPoint> CREATOR = new n();
  final int BR;
  final long SG;
  final long SH;
  final Value[] SI;
  final long SK;
  final long SL;
  final int Tm;
  final int Tn;

  RawDataPoint(int paramInt1, long paramLong1, long paramLong2, Value[] paramArrayOfValue, int paramInt2, int paramInt3, long paramLong3, long paramLong4)
  {
    this.BR = paramInt1;
    this.SG = paramLong1;
    this.SH = paramLong2;
    this.Tm = paramInt2;
    this.Tn = paramInt3;
    this.SK = paramLong3;
    this.SL = paramLong4;
    this.SI = paramArrayOfValue;
  }

  RawDataPoint(DataPoint paramDataPoint, List<DataSource> paramList)
  {
    this.BR = 4;
    this.SG = paramDataPoint.getTimestamp(TimeUnit.NANOSECONDS);
    this.SH = paramDataPoint.getStartTime(TimeUnit.NANOSECONDS);
    this.SI = paramDataPoint.iG();
    this.Tm = t.a(paramDataPoint.getDataSource(), paramList);
    this.Tn = t.a(paramDataPoint.getOriginalDataSource(), paramList);
    this.SK = paramDataPoint.iH();
    this.SL = paramDataPoint.iI();
  }

  private boolean a(RawDataPoint paramRawDataPoint)
  {
    return (this.SG == paramRawDataPoint.SG) && (this.SH == paramRawDataPoint.SH) && (Arrays.equals(this.SI, paramRawDataPoint.SI)) && (this.Tm == paramRawDataPoint.Tm) && (this.Tn == paramRawDataPoint.Tn) && (this.SK == paramRawDataPoint.SK);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof RawDataPoint)) && (a((RawDataPoint)paramObject)));
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(this.SG);
    arrayOfObject[1] = Long.valueOf(this.SH);
    return com.google.android.gms.common.internal.n.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Arrays.toString(this.SI);
    arrayOfObject[1] = Long.valueOf(this.SH);
    arrayOfObject[2] = Long.valueOf(this.SG);
    arrayOfObject[3] = Integer.valueOf(this.Tm);
    arrayOfObject[4] = Integer.valueOf(this.Tn);
    return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", arrayOfObject);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    n.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.RawDataPoint
 * JD-Core Version:    0.6.2
 */