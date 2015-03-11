package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest
{
  public static final int ACCURACY_MODE_DEFAULT = 2;
  public static final int ACCURACY_MODE_HIGH = 3;
  public static final int ACCURACY_MODE_LOW = 1;
  private final DataType Sp;
  private final DataSource Sq;
  private final long Tt;
  private final int Tu;
  private final long UD;
  private final long UE;
  private final LocationRequest UI;
  private final long UJ;

  private SensorRequest(DataSource paramDataSource, LocationRequest paramLocationRequest)
  {
    this.UI = paramLocationRequest;
    this.Tt = TimeUnit.MILLISECONDS.toMicros(paramLocationRequest.getInterval());
    this.UE = TimeUnit.MILLISECONDS.toMicros(paramLocationRequest.getFastestInterval());
    this.UD = this.Tt;
    this.Sp = paramDataSource.getDataType();
    this.Tu = a(paramLocationRequest);
    this.Sq = paramDataSource;
    long l = paramLocationRequest.getExpirationTime();
    if (l == 9223372036854775807L)
    {
      this.UJ = 9223372036854775807L;
      return;
    }
    this.UJ = TimeUnit.MILLISECONDS.toMicros(l - SystemClock.elapsedRealtime());
  }

  private SensorRequest(SensorRequest.Builder paramBuilder)
  {
    this.Sq = SensorRequest.Builder.a(paramBuilder);
    this.Sp = SensorRequest.Builder.b(paramBuilder);
    this.Tt = SensorRequest.Builder.c(paramBuilder);
    this.UE = SensorRequest.Builder.d(paramBuilder);
    this.UD = SensorRequest.Builder.e(paramBuilder);
    this.Tu = SensorRequest.Builder.f(paramBuilder);
    this.UI = null;
    this.UJ = SensorRequest.Builder.g(paramBuilder);
  }

  private static int a(LocationRequest paramLocationRequest)
  {
    switch (paramLocationRequest.getPriority())
    {
    default:
      return 2;
    case 100:
      return 3;
    case 104:
    }
    return 1;
  }

  private boolean a(SensorRequest paramSensorRequest)
  {
    return (n.equal(this.Sq, paramSensorRequest.Sq)) && (n.equal(this.Sp, paramSensorRequest.Sp)) && (this.Tt == paramSensorRequest.Tt) && (this.UE == paramSensorRequest.UE) && (this.UD == paramSensorRequest.UD) && (this.Tu == paramSensorRequest.Tu) && (n.equal(this.UI, paramSensorRequest.UI)) && (this.UJ == paramSensorRequest.UJ);
  }

  public static int da(int paramInt)
  {
    switch (paramInt)
    {
    case 2:
    default:
      paramInt = 2;
    case 1:
    case 3:
    }
    return paramInt;
  }

  public static SensorRequest fromLocationRequest(DataSource paramDataSource, LocationRequest paramLocationRequest)
  {
    return new SensorRequest(paramDataSource, paramLocationRequest);
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SensorRequest)) && (a((SensorRequest)paramObject)));
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

  public long getFastestRate(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.UE, TimeUnit.MICROSECONDS);
  }

  public long getMaxDeliveryLatency(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.UD, TimeUnit.MICROSECONDS);
  }

  public long getSamplingRate(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.Tt, TimeUnit.MICROSECONDS);
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = this.Sq;
    arrayOfObject[1] = this.Sp;
    arrayOfObject[2] = Long.valueOf(this.Tt);
    arrayOfObject[3] = Long.valueOf(this.UE);
    arrayOfObject[4] = Long.valueOf(this.UD);
    arrayOfObject[5] = Integer.valueOf(this.Tu);
    arrayOfObject[6] = this.UI;
    arrayOfObject[7] = Long.valueOf(this.UJ);
    return n.hashCode(arrayOfObject);
  }

  public long jx()
  {
    return this.UJ;
  }

  public String toString()
  {
    return n.h(this).a("dataSource", this.Sq).a("dataType", this.Sp).a("samplingRateMicros", Long.valueOf(this.Tt)).a("deliveryLatencyMicros", Long.valueOf(this.UD)).a("timeOutMicros", Long.valueOf(this.UJ)).toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.SensorRequest
 * JD-Core Version:    0.6.2
 */