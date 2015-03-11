package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DataReadRequest$Builder
{
  private long KS;
  private List<DataType> SB = new ArrayList();
  private int SE = 0;
  private long Sr;
  private List<DataSource> Uk = new ArrayList();
  private List<DataType> Uo = new ArrayList();
  private List<DataSource> Up = new ArrayList();
  private long Uq = 0L;
  private DataSource Ur;
  private int Us = 0;
  private boolean Ut = false;
  private boolean Uu = false;
  private boolean Uv = false;

  public Builder aggregate(DataSource paramDataSource, DataType paramDataType)
  {
    o.b(paramDataSource, "Attempting to add a null data source");
    if (!this.Uk.contains(paramDataSource));
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "Cannot add the same data source for aggregated and detailed");
      DataType localDataType = paramDataSource.getDataType();
      o.b(DataType.AGGREGATE_INPUT_TYPES.contains(localDataType), "Unsupported input data type specified for aggregation: %s", new Object[] { localDataType });
      o.b(DataType.getAggregatesForInput(localDataType).contains(paramDataType), "Invalid output aggregate data type specified: %s -> %s", new Object[] { localDataType, paramDataType });
      if (!this.Up.contains(paramDataSource))
        this.Up.add(paramDataSource);
      return this;
    }
  }

  public Builder aggregate(DataType paramDataType1, DataType paramDataType2)
  {
    o.b(paramDataType1, "Attempting to use a null data type");
    if (!this.SB.contains(paramDataType1));
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "Cannot add the same data type as aggregated and detailed");
      o.b(DataType.AGGREGATE_INPUT_TYPES.contains(paramDataType1), "Unsupported input data type specified for aggregation: %s", new Object[] { paramDataType1 });
      o.b(DataType.getAggregatesForInput(paramDataType1).contains(paramDataType2), "Invalid output aggregate data type specified: %s -> %s", new Object[] { paramDataType1, paramDataType2 });
      if (!this.Uo.contains(paramDataType1))
        this.Uo.add(paramDataType1);
      return this;
    }
  }

  public Builder bucketByActivitySegment(int paramInt, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (this.SE == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.SE);
      o.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label86;
    }
    label86: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      o.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      this.SE = 4;
      this.Uq = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
    }
  }

  public Builder bucketByActivitySegment(int paramInt, TimeUnit paramTimeUnit, DataSource paramDataSource)
  {
    boolean bool1;
    boolean bool2;
    if (this.SE == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.SE);
      o.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label131;
      bool2 = true;
      label43: Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      o.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      if (paramDataSource == null)
        break label137;
    }
    label131: label137: for (boolean bool3 = true; ; bool3 = false)
    {
      o.b(bool3, "Invalid activity data source specified");
      o.b(paramDataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] { paramDataSource });
      this.Ur = paramDataSource;
      this.SE = 4;
      this.Uq = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
      bool2 = false;
      break label43;
    }
  }

  public Builder bucketByActivityType(int paramInt, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (this.SE == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.SE);
      o.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label86;
    }
    label86: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      o.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      this.SE = 3;
      this.Uq = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
    }
  }

  public Builder bucketByActivityType(int paramInt, TimeUnit paramTimeUnit, DataSource paramDataSource)
  {
    boolean bool1;
    boolean bool2;
    if (this.SE == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.SE);
      o.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label131;
      bool2 = true;
      label43: Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      o.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      if (paramDataSource == null)
        break label137;
    }
    label131: label137: for (boolean bool3 = true; ; bool3 = false)
    {
      o.b(bool3, "Invalid activity data source specified");
      o.b(paramDataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] { paramDataSource });
      this.Ur = paramDataSource;
      this.SE = 3;
      this.Uq = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
      bool2 = false;
      break label43;
    }
  }

  public Builder bucketBySession(int paramInt, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (this.SE == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.SE);
      o.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label86;
    }
    label86: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      o.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      this.SE = 2;
      this.Uq = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
    }
  }

  public Builder bucketByTime(int paramInt, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (this.SE == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.SE);
      o.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label86;
    }
    label86: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      o.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      this.SE = 1;
      this.Uq = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
    }
  }

  public DataReadRequest build()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label69: boolean bool4;
    label118: boolean bool5;
    if ((!this.Uk.isEmpty()) || (!this.SB.isEmpty()) || (!this.Up.isEmpty()) || (!this.Uo.isEmpty()))
    {
      bool2 = bool1;
      o.a(bool2, "Must add at least one data source (aggregated or detailed)");
      if (this.KS <= 0L)
        break label216;
      bool3 = bool1;
      Object[] arrayOfObject1 = new Object[bool1];
      arrayOfObject1[0] = Long.valueOf(this.KS);
      o.a(bool3, "Invalid start time: %s", arrayOfObject1);
      if ((this.Sr <= 0L) || (this.Sr <= this.KS))
        break label221;
      bool4 = bool1;
      Object[] arrayOfObject2 = new Object[bool1];
      arrayOfObject2[0] = Long.valueOf(this.Sr);
      o.a(bool4, "Invalid end time: %s", arrayOfObject2);
      if ((!this.Up.isEmpty()) || (!this.Uo.isEmpty()))
        break label227;
      bool5 = bool1;
      label171: if (((!bool5) || (this.SE != 0)) && ((bool5) || (this.SE == 0)))
        break label233;
    }
    while (true)
    {
      o.a(bool1, "Must specify a valid bucketing strategy while requesting aggregation");
      return new DataReadRequest(this, null);
      bool2 = false;
      break;
      label216: bool3 = false;
      break label69;
      label221: bool4 = false;
      break label118;
      label227: bool5 = false;
      break label171;
      label233: bool1 = false;
    }
  }

  public Builder enableServerQueries()
  {
    this.Uv = true;
    return this;
  }

  public Builder read(DataSource paramDataSource)
  {
    o.b(paramDataSource, "Attempting to add a null data source");
    if (!this.Up.contains(paramDataSource));
    for (boolean bool = true; ; bool = false)
    {
      o.b(bool, "Cannot add the same data source as aggregated and detailed");
      if (!this.Uk.contains(paramDataSource))
        this.Uk.add(paramDataSource);
      return this;
    }
  }

  public Builder read(DataType paramDataType)
  {
    o.b(paramDataType, "Attempting to use a null data type");
    if (!this.Uo.contains(paramDataType));
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "Cannot add the same data type as aggregated and detailed");
      if (!this.SB.contains(paramDataType))
        this.SB.add(paramDataType);
      return this;
    }
  }

  public Builder setLimit(int paramInt)
  {
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      o.b(bool, "Invalid limit %d is specified", arrayOfObject);
      this.Us = paramInt;
      return this;
    }
  }

  public Builder setTimeRange(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    this.KS = paramTimeUnit.toMillis(paramLong1);
    this.Sr = paramTimeUnit.toMillis(paramLong2);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataReadRequest.Builder
 * JD-Core Version:    0.6.2
 */