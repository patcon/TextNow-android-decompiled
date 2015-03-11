package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.gx;

public class TestAds$Builder extends gx<TestAds>
{
  private int a;

  private TestAds$Builder()
  {
    super(TestAds.SCHEMA$);
  }

  public Builder a(int paramInt)
  {
    a(b()[0], Integer.valueOf(paramInt));
    this.a = paramInt;
    c()[0] = 1;
    return this;
  }

  public TestAds a()
  {
    try
    {
      TestAds localTestAds = new TestAds();
      if (c()[0] != 0);
      int i;
      for (int j = this.a; ; j = i)
      {
        localTestAds.a = j;
        return localTestAds;
        i = ((Integer)a(b()[0])).intValue();
      }
    }
    catch (Exception localException)
    {
      throw new fk(localException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.TestAds.Builder
 * JD-Core Version:    0.6.2
 */