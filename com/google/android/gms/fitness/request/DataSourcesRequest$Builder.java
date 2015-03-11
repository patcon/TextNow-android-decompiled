package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataType;

public class DataSourcesRequest$Builder
{
  private boolean Ux = false;
  private DataType[] Uy = new DataType[0];
  private int[] Uz = { 0, 1 };

  public DataSourcesRequest build()
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.Uy.length > 0)
    {
      bool2 = bool1;
      o.a(bool2, "Must add at least one data type");
      if (this.Uz.length <= 0)
        break label47;
    }
    while (true)
    {
      o.a(bool1, "Must add at least one data source type");
      return new DataSourcesRequest(this, null);
      bool2 = false;
      break;
      label47: bool1 = false;
    }
  }

  public Builder setDataSourceTypes(int[] paramArrayOfInt)
  {
    this.Uz = paramArrayOfInt;
    return this;
  }

  public Builder setDataTypes(DataType[] paramArrayOfDataType)
  {
    this.Uy = paramArrayOfDataType;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataSourcesRequest.Builder
 * JD-Core Version:    0.6.2
 */