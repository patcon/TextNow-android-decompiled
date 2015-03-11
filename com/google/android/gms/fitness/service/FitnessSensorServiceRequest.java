package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.k;
import com.google.android.gms.fitness.data.k.a;
import java.util.concurrent.TimeUnit;

public class FitnessSensorServiceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<FitnessSensorServiceRequest> CREATOR = new a();
  public static final int UNSPECIFIED = -1;
  private final int BR;
  private final DataSource Sq;
  private final k UA;
  private final long Vc;
  private final long Vd;

  FitnessSensorServiceRequest(int paramInt, DataSource paramDataSource, IBinder paramIBinder, long paramLong1, long paramLong2)
  {
    this.BR = paramInt;
    this.Sq = paramDataSource;
    this.UA = k.a.an(paramIBinder);
    this.Vc = paramLong1;
    this.Vd = paramLong2;
  }

  private boolean a(FitnessSensorServiceRequest paramFitnessSensorServiceRequest)
  {
    return (n.equal(this.Sq, paramFitnessSensorServiceRequest.Sq)) && (this.Vc == paramFitnessSensorServiceRequest.Vc) && (this.Vd == paramFitnessSensorServiceRequest.Vd);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof FitnessSensorServiceRequest)) && (a((FitnessSensorServiceRequest)paramObject)));
  }

  public long getBatchInterval(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.Vd, TimeUnit.MICROSECONDS);
  }

  public DataSource getDataSource()
  {
    return this.Sq;
  }

  public SensorEventDispatcher getDispatcher()
  {
    return new b(this.UA);
  }

  public long getSamplingRate(TimeUnit paramTimeUnit)
  {
    if (this.Vc == -1L)
      return -1L;
    return paramTimeUnit.convert(this.Vc, TimeUnit.MICROSECONDS);
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.Sq;
    arrayOfObject[1] = Long.valueOf(this.Vc);
    arrayOfObject[2] = Long.valueOf(this.Vd);
    return n.hashCode(arrayOfObject);
  }

  public long iX()
  {
    return this.Vc;
  }

  public long jN()
  {
    return this.Vd;
  }

  IBinder jw()
  {
    return this.UA.asBinder();
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.Sq;
    return String.format("FitnessSensorServiceRequest{%s}", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.service.FitnessSensorServiceRequest
 * JD-Core Version:    0.6.2
 */