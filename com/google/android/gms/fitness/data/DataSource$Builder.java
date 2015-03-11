package com.google.android.gms.fitness.data;

import android.content.Context;
import com.google.android.gms.common.internal.o;

public final class DataSource$Builder
{
  private int FD = -1;
  private Device SO;
  private a SP;
  private String SQ = "";
  private boolean SR = false;
  private DataType Sp;
  private String mName;

  public final DataSource build()
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.Sp != null)
    {
      bool2 = bool1;
      o.a(bool2, "Must set data type");
      if (this.FD < 0)
        break label45;
    }
    while (true)
    {
      o.a(bool1, "Must set data source type");
      return new DataSource(this, null);
      bool2 = false;
      break;
      label45: bool1 = false;
    }
  }

  public final Builder setAppPackageName(Context paramContext)
  {
    return setAppPackageName(paramContext.getPackageName());
  }

  public final Builder setAppPackageName(String paramString)
  {
    this.SP = new a(paramString, null, null);
    return this;
  }

  public final Builder setDataType(DataType paramDataType)
  {
    this.Sp = paramDataType;
    return this;
  }

  public final Builder setDevice(Device paramDevice)
  {
    this.SO = paramDevice;
    return this;
  }

  public final Builder setName(String paramString)
  {
    this.mName = paramString;
    return this;
  }

  public final Builder setObfuscated(boolean paramBoolean)
  {
    this.SR = paramBoolean;
    return this;
  }

  public final Builder setStreamName(String paramString)
  {
    if (paramString != null);
    for (boolean bool = true; ; bool = false)
    {
      o.b(bool, "Must specify a valid stream name");
      this.SQ = paramString;
      return this;
    }
  }

  public final Builder setType(int paramInt)
  {
    this.FD = paramInt;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.DataSource.Builder
 * JD-Core Version:    0.6.2
 */