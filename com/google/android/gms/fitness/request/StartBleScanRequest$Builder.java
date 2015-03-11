package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataType;

public class StartBleScanRequest$Builder
{
  private l UQ;
  private int UR = 10;
  private DataType[] Uy = new DataType[0];

  public Builder a(l paraml)
  {
    this.UQ = paraml;
    return this;
  }

  public StartBleScanRequest build()
  {
    if (this.UQ != null);
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "Must set BleScanCallback");
      return new StartBleScanRequest(this, null);
    }
  }

  public Builder setBleScanCallback(BleScanCallback paramBleScanCallback)
  {
    a(a.a.je().a(paramBleScanCallback));
    return this;
  }

  public Builder setDataTypes(DataType[] paramArrayOfDataType)
  {
    this.Uy = paramArrayOfDataType;
    return this;
  }

  public Builder setTimeoutSecs(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt > 0)
    {
      bool2 = bool1;
      o.b(bool2, "Stop time must be greater than zero");
      if (paramInt > 60)
        break label38;
    }
    while (true)
    {
      o.b(bool1, "Stop time must be less than 1 minute");
      this.UR = paramInt;
      return this;
      bool2 = false;
      break;
      label38: bool1 = false;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.StartBleScanRequest.Builder
 * JD-Core Version:    0.6.2
 */