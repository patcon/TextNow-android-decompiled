package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class RawBucket
  implements SafeParcelable
{
  public static final Parcelable.Creator<RawBucket> CREATOR = new m();
  final int BR;
  final long KS;
  final List<RawDataSet> SD;
  final int SE;
  final boolean SF;
  final long Sr;
  final Session St;
  final int Tl;

  RawBucket(int paramInt1, long paramLong1, long paramLong2, Session paramSession, int paramInt2, List<RawDataSet> paramList, int paramInt3, boolean paramBoolean)
  {
    this.BR = paramInt1;
    this.KS = paramLong1;
    this.Sr = paramLong2;
    this.St = paramSession;
    this.Tl = paramInt2;
    this.SD = paramList;
    this.SE = paramInt3;
    this.SF = paramBoolean;
  }

  public RawBucket(Bucket paramBucket, List<DataSource> paramList, List<DataType> paramList1)
  {
    this.BR = 2;
    this.KS = paramBucket.getStartTime(TimeUnit.MILLISECONDS);
    this.Sr = paramBucket.getEndTime(TimeUnit.MILLISECONDS);
    this.St = paramBucket.getSession();
    this.Tl = paramBucket.iB();
    this.SE = paramBucket.getBucketType();
    this.SF = paramBucket.iC();
    List localList = paramBucket.getDataSets();
    this.SD = new ArrayList(localList.size());
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      DataSet localDataSet = (DataSet)localIterator.next();
      this.SD.add(new RawDataSet(localDataSet, paramList, paramList1));
    }
  }

  private boolean a(RawBucket paramRawBucket)
  {
    return (this.KS == paramRawBucket.KS) && (this.Sr == paramRawBucket.Sr) && (this.Tl == paramRawBucket.Tl) && (n.equal(this.SD, paramRawBucket.SD)) && (this.SE == paramRawBucket.SE) && (this.SF == paramRawBucket.SF);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof RawBucket)) && (a((RawBucket)paramObject)));
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(this.KS);
    arrayOfObject[1] = Long.valueOf(this.Sr);
    arrayOfObject[2] = Integer.valueOf(this.SE);
    return n.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    return n.h(this).a("startTime", Long.valueOf(this.KS)).a("endTime", Long.valueOf(this.Sr)).a("activity", Integer.valueOf(this.Tl)).a("dataSets", this.SD).a("bucketType", Integer.valueOf(this.SE)).a("serverHasMoreData", Boolean.valueOf(this.SF)).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    m.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.RawBucket
 * JD-Core Version:    0.6.2
 */