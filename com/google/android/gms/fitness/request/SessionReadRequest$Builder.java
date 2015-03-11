package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest$Builder
{
  private long KS = 0L;
  private List<DataType> SB = new ArrayList();
  private long Sr = 0L;
  private String UN;
  private boolean UO = false;
  private List<String> UP = new ArrayList();
  private List<DataSource> Uk = new ArrayList();
  private boolean Uv = false;
  private String vL;

  public SessionReadRequest build()
  {
    boolean bool1;
    if (this.KS > 0L)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(this.KS);
      o.b(bool1, "Invalid start time: %s", arrayOfObject1);
      if ((this.Sr <= 0L) || (this.Sr <= this.KS))
        break label96;
    }
    label96: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(this.Sr);
      o.b(bool2, "Invalid end time: %s", arrayOfObject2);
      return new SessionReadRequest(this, null);
      bool1 = false;
      break;
    }
  }

  public Builder enableServerQueries()
  {
    this.Uv = true;
    return this;
  }

  public Builder excludePackage(String paramString)
  {
    o.b(paramString, "Attempting to use a null package name");
    if (!this.UP.contains(paramString))
      this.UP.add(paramString);
    return this;
  }

  public Builder read(DataSource paramDataSource)
  {
    o.b(paramDataSource, "Attempting to add a null data source");
    if (!this.Uk.contains(paramDataSource))
      this.Uk.add(paramDataSource);
    return this;
  }

  public Builder read(DataType paramDataType)
  {
    o.b(paramDataType, "Attempting to use a null data type");
    if (!this.SB.contains(paramDataType))
      this.SB.add(paramDataType);
    return this;
  }

  public Builder readSessionsFromAllApps()
  {
    this.UO = true;
    return this;
  }

  public Builder setSessionId(String paramString)
  {
    this.vL = paramString;
    return this;
  }

  public Builder setSessionName(String paramString)
  {
    this.UN = paramString;
    return this;
  }

  public Builder setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    this.KS = paramTimeUnit.toMillis(paramLong1);
    this.Sr = paramTimeUnit.toMillis(paramLong2);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.SessionReadRequest.Builder
 * JD-Core Version:    0.6.2
 */