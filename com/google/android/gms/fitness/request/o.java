package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.k;
import com.google.android.gms.fitness.data.k.a;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class o
  implements SafeParcelable
{
  public static final Parcelable.Creator<o> CREATOR = new p();
  private final int BR;
  private final DataType Sp;
  private final DataSource Sq;
  private final long Tt;
  private final int Tu;
  private k UA;
  int UB;
  int UC;
  private final long UD;
  private final long UE;
  private final List<LocationRequest> UF;
  private final long UG;
  private final List UH;
  private final PendingIntent mPendingIntent;

  o(int paramInt1, DataSource paramDataSource, DataType paramDataType, IBinder paramIBinder, int paramInt2, int paramInt3, long paramLong1, long paramLong2, PendingIntent paramPendingIntent, long paramLong3, int paramInt4, List<LocationRequest> paramList, long paramLong4)
  {
    this.BR = paramInt1;
    this.Sq = paramDataSource;
    this.Sp = paramDataType;
    if (paramIBinder == null);
    for (k localk = null; ; localk = k.a.an(paramIBinder))
    {
      this.UA = localk;
      if (paramLong1 == 0L)
        paramLong1 = paramInt2;
      this.Tt = paramLong1;
      this.UE = paramLong3;
      if (paramLong2 == 0L)
        paramLong2 = paramInt3;
      this.UD = paramLong2;
      this.UF = paramList;
      this.mPendingIntent = paramPendingIntent;
      this.Tu = paramInt4;
      this.UH = Collections.emptyList();
      this.UG = paramLong4;
      return;
    }
  }

  private o(DataSource paramDataSource, DataType paramDataType, k paramk, PendingIntent paramPendingIntent, long paramLong1, long paramLong2, long paramLong3, int paramInt, List paramList1, List paramList2, long paramLong4)
  {
    this.BR = 4;
    this.Sq = paramDataSource;
    this.Sp = paramDataType;
    this.UA = paramk;
    this.mPendingIntent = paramPendingIntent;
    this.Tt = paramLong1;
    this.UE = paramLong2;
    this.UD = paramLong3;
    this.Tu = paramInt;
    this.UF = paramList1;
    this.UH = paramList2;
    this.UG = paramLong4;
  }

  public o(SensorRequest paramSensorRequest, k paramk, PendingIntent paramPendingIntent)
  {
    this(paramSensorRequest.getDataSource(), paramSensorRequest.getDataType(), paramk, paramPendingIntent, paramSensorRequest.getSamplingRate(TimeUnit.MICROSECONDS), paramSensorRequest.getFastestRate(TimeUnit.MICROSECONDS), paramSensorRequest.getMaxDeliveryLatency(TimeUnit.MICROSECONDS), paramSensorRequest.getAccuracyMode(), null, Collections.emptyList(), paramSensorRequest.jx());
  }

  private boolean a(o paramo)
  {
    return (n.equal(this.Sq, paramo.Sq)) && (n.equal(this.Sp, paramo.Sp)) && (this.Tt == paramo.Tt) && (this.UE == paramo.UE) && (this.UD == paramo.UD) && (this.Tu == paramo.Tu) && (n.equal(this.UF, paramo.UF));
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof o)) && (a((o)paramObject)));
  }

  public int getAccuracyMode()
  {
    return this.Tu;
  }

  public DataSource getDataSource()
  {
    return this.Sq;
  }

  public DataType getDataType()
  {
    return this.Sp;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = this.Sq;
    arrayOfObject[1] = this.Sp;
    arrayOfObject[2] = this.UA;
    arrayOfObject[3] = Long.valueOf(this.Tt);
    arrayOfObject[4] = Long.valueOf(this.UE);
    arrayOfObject[5] = Long.valueOf(this.UD);
    arrayOfObject[6] = Integer.valueOf(this.Tu);
    arrayOfObject[7] = this.UF;
    return n.hashCode(arrayOfObject);
  }

  public long iX()
  {
    return this.Tt;
  }

  public PendingIntent jr()
  {
    return this.mPendingIntent;
  }

  public long js()
  {
    return this.UE;
  }

  public long jt()
  {
    return this.UD;
  }

  public List<LocationRequest> ju()
  {
    return this.UF;
  }

  public long jv()
  {
    return this.UG;
  }

  IBinder jw()
  {
    if (this.UA == null)
      return null;
    return this.UA.asBinder();
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.Sp;
    arrayOfObject[1] = this.Sq;
    arrayOfObject[2] = Long.valueOf(this.Tt);
    arrayOfObject[3] = Long.valueOf(this.UE);
    arrayOfObject[4] = Long.valueOf(this.UD);
    return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    p.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.o
 * JD-Core Version:    0.6.2
 */