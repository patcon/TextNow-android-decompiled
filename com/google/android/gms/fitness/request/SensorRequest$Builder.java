package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.concurrent.TimeUnit;

public class SensorRequest$Builder
{
  private DataType Sp;
  private DataSource Sq;
  private long Tt = -1L;
  private int Tu = 2;
  private long UD = 0L;
  private long UE = 0L;
  private long UJ = 9223372036854775807L;
  private boolean UK = false;

  public SensorRequest build()
  {
    if ((this.Sq != null) || (this.Sp != null));
    for (boolean bool1 = true; ; bool1 = false)
    {
      o.a(bool1, "Must call setDataSource() or setDataType()");
      boolean bool2;
      if ((this.Sp != null) && (this.Sq != null))
      {
        boolean bool3 = this.Sp.equals(this.Sq.getDataType());
        bool2 = false;
        if (!bool3);
      }
      else
      {
        bool2 = true;
      }
      o.a(bool2, "Specified data type is incompatible with specified data source");
      return new SensorRequest(this, null);
    }
  }

  public Builder setAccuracyMode(int paramInt)
  {
    this.Tu = SensorRequest.da(paramInt);
    return this;
  }

  public Builder setDataSource(DataSource paramDataSource)
  {
    this.Sq = paramDataSource;
    return this;
  }

  public Builder setDataType(DataType paramDataType)
  {
    this.Sp = paramDataType;
    return this;
  }

  public Builder setFastestRate(int paramInt, TimeUnit paramTimeUnit)
  {
    if (paramInt >= 0);
    for (boolean bool = true; ; bool = false)
    {
      o.b(bool, "Cannot use a negative interval");
      this.UK = true;
      this.UE = paramTimeUnit.toMicros(paramInt);
      return this;
    }
  }

  public Builder setMaxDeliveryLatency(int paramInt, TimeUnit paramTimeUnit)
  {
    if (paramInt >= 0);
    for (boolean bool = true; ; bool = false)
    {
      o.b(bool, "Cannot use a negative delivery interval");
      this.UD = paramTimeUnit.toMicros(paramInt);
      return this;
    }
  }

  public Builder setSamplingRate(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong >= 0L);
    for (boolean bool = true; ; bool = false)
    {
      o.b(bool, "Cannot use a negative sampling interval");
      this.Tt = paramTimeUnit.toMicros(paramLong);
      if (!this.UK)
        this.UE = (this.Tt / 2L);
      return this;
    }
  }

  public Builder setTimeout(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramLong > 0L)
    {
      bool2 = bool1;
      Object[] arrayOfObject = new Object[bool1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      o.b(bool2, "Invalid time out value specified: %d", arrayOfObject);
      if (paramTimeUnit == null)
        break label65;
    }
    while (true)
    {
      o.b(bool1, "Invalid time unit specified");
      this.UJ = paramTimeUnit.toMicros(paramLong);
      return this;
      bool2 = false;
      break;
      label65: bool1 = false;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.SensorRequest.Builder
 * JD-Core Version:    0.6.2
 */