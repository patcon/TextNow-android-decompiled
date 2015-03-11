package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.gx;

public class FrequencyCapInfo$Builder extends gx<FrequencyCapInfo>
{
  private CharSequence a;
  private long b;
  private long c;
  private int d;
  private int e;
  private int f;
  private int g;

  private FrequencyCapInfo$Builder()
  {
    super(FrequencyCapInfo.SCHEMA$);
  }

  public Builder a(int paramInt)
  {
    a(b()[3], Integer.valueOf(paramInt));
    this.d = paramInt;
    c()[3] = 1;
    return this;
  }

  public Builder a(long paramLong)
  {
    a(b()[1], Long.valueOf(paramLong));
    this.b = paramLong;
    c()[1] = 1;
    return this;
  }

  public Builder a(CharSequence paramCharSequence)
  {
    a(b()[0], paramCharSequence);
    this.a = paramCharSequence;
    c()[0] = 1;
    return this;
  }

  public FrequencyCapInfo a()
  {
    try
    {
      FrequencyCapInfo localFrequencyCapInfo = new FrequencyCapInfo();
      CharSequence localCharSequence;
      long l1;
      label42: long l2;
      label63: int i;
      label84: int j;
      label105: int k;
      if (c()[0] != 0)
      {
        localCharSequence = this.a;
        localFrequencyCapInfo.a = localCharSequence;
        if (c()[1] == 0)
          break label173;
        l1 = this.b;
        localFrequencyCapInfo.b = l1;
        if (c()[2] == 0)
          break label194;
        l2 = this.c;
        localFrequencyCapInfo.c = l2;
        if (c()[3] == 0)
          break label215;
        i = this.d;
        localFrequencyCapInfo.d = i;
        if (c()[4] == 0)
          break label236;
        j = this.e;
        localFrequencyCapInfo.e = j;
        if (c()[5] == 0)
          break label257;
        k = this.f;
        label126: localFrequencyCapInfo.f = k;
        if (c()[6] == 0)
          break label278;
      }
      label173: label194: label215: label236: int m;
      for (int n = this.g; ; n = m)
      {
        localFrequencyCapInfo.g = n;
        return localFrequencyCapInfo;
        localCharSequence = (CharSequence)a(b()[0]);
        break;
        l1 = ((Long)a(b()[1])).longValue();
        break label42;
        l2 = ((Long)a(b()[2])).longValue();
        break label63;
        i = ((Integer)a(b()[3])).intValue();
        break label84;
        j = ((Integer)a(b()[4])).intValue();
        break label105;
        label257: k = ((Integer)a(b()[5])).intValue();
        break label126;
        label278: m = ((Integer)a(b()[6])).intValue();
      }
    }
    catch (Exception localException)
    {
      throw new fk(localException);
    }
  }

  public Builder b(int paramInt)
  {
    a(b()[4], Integer.valueOf(paramInt));
    this.e = paramInt;
    c()[4] = 1;
    return this;
  }

  public Builder b(long paramLong)
  {
    a(b()[2], Long.valueOf(paramLong));
    this.c = paramLong;
    c()[2] = 1;
    return this;
  }

  public Builder c(int paramInt)
  {
    a(b()[5], Integer.valueOf(paramInt));
    this.f = paramInt;
    c()[5] = 1;
    return this;
  }

  public Builder d(int paramInt)
  {
    a(b()[6], Integer.valueOf(paramInt));
    this.g = paramInt;
    c()[6] = 1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.FrequencyCapInfo.Builder
 * JD-Core Version:    0.6.2
 */