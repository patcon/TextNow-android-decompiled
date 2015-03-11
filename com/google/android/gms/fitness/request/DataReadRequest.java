package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataReadRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<DataReadRequest> CREATOR = new g();
  public static final int NO_LIMIT;
  private final int BR;
  private final long KS;
  private final List<DataType> SB;
  private final int SE;
  private final long Sr;
  private final List<DataSource> Uk;
  private final List<DataType> Uo;
  private final List<DataSource> Up;
  private final long Uq;
  private final DataSource Ur;
  private final int Us;
  private final boolean Ut;
  private final boolean Uu;
  private final boolean Uv;

  DataReadRequest(int paramInt1, List<DataType> paramList1, List<DataSource> paramList2, long paramLong1, long paramLong2, List<DataType> paramList3, List<DataSource> paramList4, int paramInt2, long paramLong3, DataSource paramDataSource, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.BR = paramInt1;
    this.SB = Collections.unmodifiableList(paramList1);
    this.Uk = Collections.unmodifiableList(paramList2);
    this.KS = paramLong1;
    this.Sr = paramLong2;
    this.Uo = Collections.unmodifiableList(paramList3);
    this.Up = Collections.unmodifiableList(paramList4);
    this.SE = paramInt2;
    this.Uq = paramLong3;
    this.Ur = paramDataSource;
    this.Us = paramInt3;
    this.Ut = paramBoolean1;
    this.Uu = paramBoolean2;
    this.Uv = paramBoolean3;
  }

  private DataReadRequest(DataReadRequest.Builder paramBuilder)
  {
    this.BR = 2;
    this.SB = Collections.unmodifiableList(DataReadRequest.Builder.a(paramBuilder));
    this.Uk = Collections.unmodifiableList(DataReadRequest.Builder.b(paramBuilder));
    this.KS = DataReadRequest.Builder.c(paramBuilder);
    this.Sr = DataReadRequest.Builder.d(paramBuilder);
    this.Uo = Collections.unmodifiableList(DataReadRequest.Builder.e(paramBuilder));
    this.Up = Collections.unmodifiableList(DataReadRequest.Builder.f(paramBuilder));
    this.SE = DataReadRequest.Builder.g(paramBuilder);
    this.Uq = DataReadRequest.Builder.h(paramBuilder);
    this.Ur = DataReadRequest.Builder.i(paramBuilder);
    this.Us = DataReadRequest.Builder.j(paramBuilder);
    this.Ut = DataReadRequest.Builder.k(paramBuilder);
    this.Uu = DataReadRequest.Builder.l(paramBuilder);
    this.Uv = DataReadRequest.Builder.m(paramBuilder);
  }

  private boolean a(DataReadRequest paramDataReadRequest)
  {
    return (this.SB.equals(paramDataReadRequest.SB)) && (this.Uk.equals(paramDataReadRequest.Uk)) && (this.KS == paramDataReadRequest.KS) && (this.Sr == paramDataReadRequest.Sr) && (this.SE == paramDataReadRequest.SE) && (this.Up.equals(paramDataReadRequest.Up)) && (this.Uo.equals(paramDataReadRequest.Uo)) && (n.equal(this.Ur, paramDataReadRequest.Ur)) && (this.Uq == paramDataReadRequest.Uq) && (this.Uv == paramDataReadRequest.Uv);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataReadRequest)) && (a((DataReadRequest)paramObject)));
  }

  public DataSource getActivityDataSource()
  {
    return this.Ur;
  }

  public List<DataSource> getAggregatedDataSources()
  {
    return this.Up;
  }

  public List<DataType> getAggregatedDataTypes()
  {
    return this.Uo;
  }

  public long getBucketDuration(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.Uq, TimeUnit.MILLISECONDS);
  }

  public int getBucketType()
  {
    return this.SE;
  }

  public List<DataSource> getDataSources()
  {
    return this.Uk;
  }

  public List<DataType> getDataTypes()
  {
    return this.SB;
  }

  public long getEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.Sr, TimeUnit.MILLISECONDS);
  }

  public int getLimit()
  {
    return this.Us;
  }

  public long getStartTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.KS, TimeUnit.MILLISECONDS);
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.SE);
    arrayOfObject[1] = Long.valueOf(this.KS);
    arrayOfObject[2] = Long.valueOf(this.Sr);
    return n.hashCode(arrayOfObject);
  }

  public long iD()
  {
    return this.KS;
  }

  public long iE()
  {
    return this.Sr;
  }

  public boolean jk()
  {
    return this.Ut;
  }

  public boolean jl()
  {
    return this.Uv;
  }

  public boolean jm()
  {
    return this.Uu;
  }

  public long jn()
  {
    return this.Uq;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataReadRequest{");
    if (!this.SB.isEmpty())
    {
      Iterator localIterator4 = this.SB.iterator();
      while (localIterator4.hasNext())
        localStringBuilder.append(((DataType)localIterator4.next()).iQ()).append(" ");
    }
    if (!this.Uk.isEmpty())
    {
      Iterator localIterator3 = this.Uk.iterator();
      while (localIterator3.hasNext())
        localStringBuilder.append(((DataSource)localIterator3.next()).toDebugString()).append(" ");
    }
    if (this.SE != 0)
    {
      localStringBuilder.append("bucket by ").append(Bucket.cy(this.SE));
      if (this.Uq > 0L)
        localStringBuilder.append(" >").append(this.Uq).append("ms");
      localStringBuilder.append(": ");
    }
    if (!this.Uo.isEmpty())
    {
      Iterator localIterator2 = this.Uo.iterator();
      while (localIterator2.hasNext())
        localStringBuilder.append(((DataType)localIterator2.next()).iQ()).append(" ");
    }
    if (!this.Up.isEmpty())
    {
      Iterator localIterator1 = this.Up.iterator();
      while (localIterator1.hasNext())
        localStringBuilder.append(((DataSource)localIterator1.next()).toDebugString()).append(" ");
    }
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Long.valueOf(this.KS);
    arrayOfObject[1] = Long.valueOf(this.KS);
    arrayOfObject[2] = Long.valueOf(this.Sr);
    arrayOfObject[3] = Long.valueOf(this.Sr);
    localStringBuilder.append(String.format("(%tF %tT - %tF %tT)", arrayOfObject));
    if (this.Ur != null)
      localStringBuilder.append("activities: ").append(this.Ur.toDebugString());
    if (this.Uv)
      localStringBuilder.append(" +server");
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataReadRequest
 * JD-Core Version:    0.6.2
 */