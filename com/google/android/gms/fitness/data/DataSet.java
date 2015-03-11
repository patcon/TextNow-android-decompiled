package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DataSet
  implements SafeParcelable
{
  public static final Parcelable.Creator<DataSet> CREATOR = new f();
  private final int BR;
  private boolean SF = false;
  private final List<DataPoint> SM;
  private final List<DataSource> SN;
  private final DataType Sp;
  private final DataSource Sq;

  DataSet(int paramInt, DataSource paramDataSource, DataType paramDataType, List<RawDataPoint> paramList, List<DataSource> paramList1, boolean paramBoolean)
  {
    this.BR = paramInt;
    this.Sq = paramDataSource;
    this.Sp = paramDataType;
    this.SF = paramBoolean;
    this.SM = new ArrayList(paramList.size());
    if (paramInt >= 2);
    while (true)
    {
      this.SN = paramList1;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        RawDataPoint localRawDataPoint = (RawDataPoint)localIterator.next();
        this.SM.add(new DataPoint(this.SN, localRawDataPoint));
      }
      paramList1 = Collections.singletonList(paramDataSource);
    }
  }

  private DataSet(DataSource paramDataSource, DataType paramDataType)
  {
    this.BR = 3;
    this.Sq = ((DataSource)o.i(paramDataSource));
    this.Sp = ((DataType)o.i(paramDataType));
    this.SM = new ArrayList();
    this.SN = new ArrayList();
    this.SN.add(this.Sq);
  }

  public DataSet(RawDataSet paramRawDataSet, List<DataSource> paramList, List<DataType> paramList1)
  {
    this(3, (DataSource)b(paramList, paramRawDataSet.Tm), (DataType)b(paramList1, paramRawDataSet.To), paramRawDataSet.Tp, paramList, paramRawDataSet.SF);
  }

  private boolean a(DataSet paramDataSet)
  {
    return (n.equal(this.Sp, paramDataSet.Sp)) && (n.equal(this.Sq, paramDataSet.Sq)) && (n.equal(this.SM, paramDataSet.SM)) && (this.SF == paramDataSet.SF);
  }

  private static <T> T b(List<T> paramList, int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < paramList.size()))
      return paramList.get(paramInt);
    return null;
  }

  public static DataSet create(DataSource paramDataSource)
  {
    o.b(paramDataSource, "DataSource should be specified");
    return new DataSet(paramDataSource, paramDataSource.getDataType());
  }

  public final void a(Iterable<DataPoint> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
      b((DataPoint)localIterator.next());
  }

  public final void add(DataPoint paramDataPoint)
  {
    DataSource localDataSource = paramDataPoint.getDataSource();
    boolean bool1 = localDataSource.getStreamIdentifier().equals(this.Sq.getStreamIdentifier());
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = localDataSource;
    arrayOfObject1[1] = this.Sq;
    o.b(bool1, "Conflicting data sources found %s vs %s", arrayOfObject1);
    boolean bool2 = paramDataPoint.getDataType().getName().equals(this.Sp.getName());
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = paramDataPoint.getDataType();
    arrayOfObject2[1] = this.Sp;
    o.b(bool2, "Conflicting data types found %s vs %s", arrayOfObject2);
    boolean bool3;
    if (paramDataPoint.getTimestamp(TimeUnit.NANOSECONDS) > 0L)
    {
      bool3 = true;
      o.b(bool3, "Data point does not have the timestamp set: %s", new Object[] { paramDataPoint });
      if (paramDataPoint.getStartTime(TimeUnit.NANOSECONDS) > paramDataPoint.getEndTime(TimeUnit.NANOSECONDS))
        break label175;
    }
    label175: for (boolean bool4 = true; ; bool4 = false)
    {
      o.b(bool4, "Data point with start time greater than end time found: %s", new Object[] { paramDataPoint });
      b(paramDataPoint);
      return;
      bool3 = false;
      break;
    }
  }

  public final void addAll(Iterable<DataPoint> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
      add((DataPoint)localIterator.next());
  }

  public final void b(DataPoint paramDataPoint)
  {
    this.SM.add(paramDataPoint);
    DataSource localDataSource = paramDataPoint.getOriginalDataSource();
    if ((localDataSource != null) && (!this.SN.contains(localDataSource)))
      this.SN.add(localDataSource);
  }

  public final DataPoint createDataPoint()
  {
    return DataPoint.create(this.Sq);
  }

  public final int describeContents()
  {
    return 0;
  }

  final List<RawDataPoint> e(List<DataSource> paramList)
  {
    ArrayList localArrayList = new ArrayList(this.SM.size());
    Iterator localIterator = this.SM.iterator();
    while (localIterator.hasNext())
      localArrayList.add(new RawDataPoint((DataPoint)localIterator.next(), paramList));
    return localArrayList;
  }

  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataSet)) && (a((DataSet)paramObject)));
  }

  public final List<DataPoint> getDataPoints()
  {
    return Collections.unmodifiableList(this.SM);
  }

  public final DataSource getDataSource()
  {
    return this.Sq;
  }

  public final DataType getDataType()
  {
    return this.Sp;
  }

  final int getVersionCode()
  {
    return this.BR;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.Sp;
    arrayOfObject[1] = this.Sq;
    return n.hashCode(arrayOfObject);
  }

  public final boolean iC()
  {
    return this.SF;
  }

  final List<RawDataPoint> iK()
  {
    return e(this.SN);
  }

  final List<DataSource> iL()
  {
    return this.SN;
  }

  public final String toString()
  {
    Object localObject = iK();
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = this.Sq.toDebugString();
    if (this.SM.size() < 10);
    while (true)
    {
      arrayOfObject1[1] = localObject;
      return String.format("DataSet{%s %s}", arrayOfObject1);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(this.SM.size());
      arrayOfObject2[1] = ((List)localObject).subList(0, 5);
      localObject = String.format("%d data points, first 5: %s", arrayOfObject2);
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.DataSet
 * JD-Core Version:    0.6.2
 */