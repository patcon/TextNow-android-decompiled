package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.kj;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DataPoint
  implements SafeParcelable
{
  public static final Parcelable.Creator<DataPoint> CREATOR = new e();
  private final int BR;
  private long SG;
  private long SH;
  private final Value[] SI;
  private DataSource SJ;
  private long SK;
  private long SL;
  private final DataSource Sq;

  DataPoint(int paramInt, DataSource paramDataSource1, long paramLong1, long paramLong2, Value[] paramArrayOfValue, DataSource paramDataSource2, long paramLong3, long paramLong4)
  {
    this.BR = paramInt;
    this.Sq = paramDataSource1;
    this.SJ = paramDataSource2;
    this.SG = paramLong1;
    this.SH = paramLong2;
    this.SI = paramArrayOfValue;
    this.SK = paramLong3;
    this.SL = paramLong4;
  }

  private DataPoint(DataSource paramDataSource)
  {
    this.BR = 4;
    this.Sq = ((DataSource)o.b(paramDataSource, "Data source cannot be null"));
    List localList = paramDataSource.getDataType().getFields();
    this.SI = new Value[localList.size()];
    Iterator localIterator = localList.iterator();
    for (int i = 0; localIterator.hasNext(); i++)
    {
      Field localField = (Field)localIterator.next();
      this.SI[i] = new Value(localField.getFormat());
    }
  }

  DataPoint(List<DataSource> paramList, RawDataPoint paramRawDataPoint)
  {
    this(4, a(paramList, paramRawDataPoint.Tm), paramRawDataPoint.SG, paramRawDataPoint.SH, paramRawDataPoint.SI, a(paramList, paramRawDataPoint.Tn), paramRawDataPoint.SK, paramRawDataPoint.SL);
  }

  private static DataSource a(List<DataSource> paramList, int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < paramList.size()))
      return (DataSource)paramList.get(paramInt);
    return null;
  }

  private boolean a(DataPoint paramDataPoint)
  {
    return (n.equal(this.Sq, paramDataPoint.Sq)) && (this.SG == paramDataPoint.SG) && (this.SH == paramDataPoint.SH) && (Arrays.equals(this.SI, paramDataPoint.SI)) && (n.equal(this.SJ, paramDataPoint.SJ));
  }

  private void cA(int paramInt)
  {
    List localList = getDataType().getFields();
    int i = localList.size();
    if (paramInt == i);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      arrayOfObject[1] = Integer.valueOf(i);
      arrayOfObject[2] = localList;
      o.b(bool, "Attempting to insert %s values, but needed %s: %s", arrayOfObject);
      return;
    }
  }

  public static DataPoint create(DataSource paramDataSource)
  {
    return new DataPoint(paramDataSource);
  }

  public static DataPoint extract(Intent paramIntent)
  {
    if (paramIntent == null)
      return null;
    return (DataPoint)c.a(paramIntent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
  }

  private boolean iF()
  {
    return getDataType() == DataType.TYPE_LOCATION_SAMPLE;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataPoint)) && (a((DataPoint)paramObject)));
  }

  public final DataSource getDataSource()
  {
    return this.Sq;
  }

  public final DataType getDataType()
  {
    return this.Sq.getDataType();
  }

  public final long getEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.SG, TimeUnit.NANOSECONDS);
  }

  public final DataSource getOriginalDataSource()
  {
    return this.SJ;
  }

  public final long getStartTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.SH, TimeUnit.NANOSECONDS);
  }

  public final long getTimestamp(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.SG, TimeUnit.NANOSECONDS);
  }

  public final long getTimestampNanos()
  {
    return this.SG;
  }

  public final Value getValue(Field paramField)
  {
    int i = getDataType().indexOf(paramField);
    return this.SI[i];
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.Sq;
    arrayOfObject[1] = Long.valueOf(this.SG);
    arrayOfObject[2] = Long.valueOf(this.SH);
    return n.hashCode(arrayOfObject);
  }

  public final Value[] iG()
  {
    return this.SI;
  }

  public final long iH()
  {
    return this.SK;
  }

  public final long iI()
  {
    return this.SL;
  }

  public final long iJ()
  {
    return this.SH;
  }

  public final DataPoint setFloatValues(float[] paramArrayOfFloat)
  {
    cA(paramArrayOfFloat.length);
    for (int i = 0; i < paramArrayOfFloat.length; i++)
      this.SI[i].setFloat(paramArrayOfFloat[i]);
    return this;
  }

  public final DataPoint setIntValues(int[] paramArrayOfInt)
  {
    cA(paramArrayOfInt.length);
    for (int i = 0; i < paramArrayOfInt.length; i++)
      this.SI[i].setInt(paramArrayOfInt[i]);
    return this;
  }

  public final DataPoint setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    this.SH = paramTimeUnit.toNanos(paramLong1);
    this.SG = paramTimeUnit.toNanos(paramLong2);
    return this;
  }

  public final DataPoint setTimestamp(long paramLong, TimeUnit paramTimeUnit)
  {
    this.SG = paramTimeUnit.toNanos(paramLong);
    if ((iF()) && (kj.a(paramTimeUnit)))
      this.SG = kj.a(this.SG, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
    return this;
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Arrays.toString(this.SI);
    arrayOfObject[1] = Long.valueOf(this.SH);
    arrayOfObject[2] = Long.valueOf(this.SG);
    arrayOfObject[3] = Long.valueOf(this.SK);
    arrayOfObject[4] = Long.valueOf(this.SL);
    arrayOfObject[5] = this.Sq;
    arrayOfObject[6] = this.SJ;
    return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", arrayOfObject);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.DataPoint
 * JD-Core Version:    0.6.2
 */