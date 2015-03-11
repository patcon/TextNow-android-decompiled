package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataSource.Builder;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DataReadResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator<DataReadResult> CREATOR = new b();
  private final int BR;
  private final Status CM;
  private final List<DataSet> SD;
  private final List<DataSource> SN;
  private final List<Bucket> UV;
  private int UW;
  private final List<DataType> UX;

  DataReadResult(int paramInt1, List<RawDataSet> paramList, Status paramStatus, List<RawBucket> paramList1, int paramInt2, List<DataSource> paramList2, List<DataType> paramList3)
  {
    this.BR = paramInt1;
    this.CM = paramStatus;
    this.UW = paramInt2;
    this.SN = paramList2;
    this.UX = paramList3;
    this.SD = new ArrayList(paramList.size());
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      RawDataSet localRawDataSet = (RawDataSet)localIterator1.next();
      this.SD.add(new DataSet(localRawDataSet, paramList2, paramList3));
    }
    this.UV = new ArrayList(paramList1.size());
    Iterator localIterator2 = paramList1.iterator();
    while (localIterator2.hasNext())
    {
      RawBucket localRawBucket = (RawBucket)localIterator2.next();
      this.UV.add(new Bucket(localRawBucket, paramList2, paramList3));
    }
  }

  public DataReadResult(List<DataSet> paramList, List<Bucket> paramList1, Status paramStatus)
  {
    this.BR = 5;
    this.SD = paramList;
    this.CM = paramStatus;
    this.UV = paramList1;
    this.UW = 1;
    this.SN = new ArrayList();
    this.UX = new ArrayList();
  }

  public static DataReadResult a(Status paramStatus, DataReadRequest paramDataReadRequest)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramDataReadRequest.getDataSources().iterator();
    while (localIterator1.hasNext())
      localArrayList.add(DataSet.create((DataSource)localIterator1.next()));
    Iterator localIterator2 = paramDataReadRequest.getDataTypes().iterator();
    while (localIterator2.hasNext())
    {
      DataType localDataType = (DataType)localIterator2.next();
      localArrayList.add(DataSet.create(new DataSource.Builder().setDataType(localDataType).setType(1).setName("Default").build()));
    }
    return new DataReadResult(localArrayList, Collections.emptyList(), paramStatus);
  }

  private void a(Bucket paramBucket, List<Bucket> paramList)
  {
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      Bucket localBucket = (Bucket)localIterator1.next();
      if (localBucket.b(paramBucket))
      {
        Iterator localIterator2 = paramBucket.getDataSets().iterator();
        while (localIterator2.hasNext())
          a((DataSet)localIterator2.next(), localBucket.getDataSets());
      }
    }
    this.UV.add(paramBucket);
  }

  private void a(DataSet paramDataSet, List<DataSet> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      DataSet localDataSet = (DataSet)localIterator.next();
      if (localDataSet.getDataSource().equals(paramDataSet.getDataSource()))
      {
        localDataSet.a(paramDataSet.getDataPoints());
        return;
      }
    }
    paramList.add(paramDataSet);
  }

  private boolean c(DataReadResult paramDataReadResult)
  {
    return (this.CM.equals(paramDataReadResult.CM)) && (n.equal(this.SD, paramDataReadResult.SD)) && (n.equal(this.UV, paramDataReadResult.UV));
  }

  public void b(DataReadResult paramDataReadResult)
  {
    Iterator localIterator1 = paramDataReadResult.getDataSets().iterator();
    while (localIterator1.hasNext())
      a((DataSet)localIterator1.next(), this.SD);
    Iterator localIterator2 = paramDataReadResult.getBuckets().iterator();
    while (localIterator2.hasNext())
      a((Bucket)localIterator2.next(), this.UV);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataReadResult)) && (c((DataReadResult)paramObject)));
  }

  public List<Bucket> getBuckets()
  {
    return this.UV;
  }

  public DataSet getDataSet(DataSource paramDataSource)
  {
    Iterator localIterator = this.SD.iterator();
    while (localIterator.hasNext())
    {
      DataSet localDataSet = (DataSet)localIterator.next();
      if (paramDataSource.equals(localDataSet.getDataSource()))
        return localDataSet;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramDataSource.getStreamIdentifier();
    throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", arrayOfObject));
  }

  public DataSet getDataSet(DataType paramDataType)
  {
    Iterator localIterator = this.SD.iterator();
    while (localIterator.hasNext())
    {
      DataSet localDataSet = (DataSet)localIterator.next();
      if (paramDataType.equals(localDataSet.getDataType()))
        return localDataSet;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramDataType.getName();
    throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", arrayOfObject));
  }

  public List<DataSet> getDataSets()
  {
    return this.SD;
  }

  public Status getStatus()
  {
    return this.CM;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.CM;
    arrayOfObject[1] = this.SD;
    arrayOfObject[2] = this.UV;
    return n.hashCode(arrayOfObject);
  }

  List<DataSource> iL()
  {
    return this.SN;
  }

  public int jH()
  {
    return this.UW;
  }

  List<RawBucket> jI()
  {
    ArrayList localArrayList = new ArrayList(this.UV.size());
    Iterator localIterator = this.UV.iterator();
    while (localIterator.hasNext())
      localArrayList.add(new RawBucket((Bucket)localIterator.next(), this.SN, this.UX));
    return localArrayList;
  }

  List<RawDataSet> jJ()
  {
    ArrayList localArrayList = new ArrayList(this.SD.size());
    Iterator localIterator = this.SD.iterator();
    while (localIterator.hasNext())
      localArrayList.add(new RawDataSet((DataSet)localIterator.next(), this.SN, this.UX));
    return localArrayList;
  }

  List<DataType> jK()
  {
    return this.UX;
  }

  public String toString()
  {
    n.a locala1 = n.h(this).a("status", this.CM);
    Object localObject1;
    n.a locala2;
    if (this.SD.size() > 5)
    {
      localObject1 = this.SD.size() + " data sets";
      locala2 = locala1.a("dataSets", localObject1);
      if (this.UV.size() <= 5)
        break label128;
    }
    label128: for (Object localObject2 = this.UV.size() + " buckets"; ; localObject2 = this.UV)
    {
      return locala2.a("buckets", localObject2).toString();
      localObject1 = this.SD;
      break;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.result.DataReadResult
 * JD-Core Version:    0.6.2
 */