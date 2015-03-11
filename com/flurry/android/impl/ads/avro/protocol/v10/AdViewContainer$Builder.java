package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.gx;

public class AdViewContainer$Builder extends gx<AdViewContainer>
{
  private int a;
  private int b;
  private int c;
  private int d;
  private float e;
  private ScreenOrientationType f;

  private AdViewContainer$Builder()
  {
    super(AdViewContainer.SCHEMA$);
  }

  public Builder a(float paramFloat)
  {
    a(b()[4], Float.valueOf(paramFloat));
    this.e = paramFloat;
    c()[4] = 1;
    return this;
  }

  public Builder a(int paramInt)
  {
    a(b()[0], Integer.valueOf(paramInt));
    this.a = paramInt;
    c()[0] = 1;
    return this;
  }

  public Builder a(ScreenOrientationType paramScreenOrientationType)
  {
    a(b()[5], paramScreenOrientationType);
    this.f = paramScreenOrientationType;
    c()[5] = 1;
    return this;
  }

  public AdViewContainer a()
  {
    try
    {
      AdViewContainer localAdViewContainer = new AdViewContainer();
      int i;
      int j;
      label42: int k;
      label63: int m;
      label84: float f1;
      if (c()[0] != 0)
      {
        i = this.a;
        localAdViewContainer.a = i;
        if (c()[1] == 0)
          break label154;
        j = this.b;
        localAdViewContainer.b = j;
        if (c()[2] == 0)
          break label175;
        k = this.c;
        localAdViewContainer.c = k;
        if (c()[3] == 0)
          break label196;
        m = this.d;
        localAdViewContainer.d = m;
        if (c()[4] == 0)
          break label217;
        f1 = this.e;
        label105: localAdViewContainer.e = f1;
        if (c()[5] == 0)
          break label238;
      }
      label154: label175: label196: label217: label238: for (ScreenOrientationType localScreenOrientationType = this.f; ; localScreenOrientationType = (ScreenOrientationType)a(b()[5]))
      {
        localAdViewContainer.f = localScreenOrientationType;
        return localAdViewContainer;
        i = ((Integer)a(b()[0])).intValue();
        break;
        j = ((Integer)a(b()[1])).intValue();
        break label42;
        k = ((Integer)a(b()[2])).intValue();
        break label63;
        m = ((Integer)a(b()[3])).intValue();
        break label84;
        f1 = ((Float)a(b()[4])).floatValue();
        break label105;
      }
    }
    catch (Exception localException)
    {
      throw new fk(localException);
    }
  }

  public Builder b(int paramInt)
  {
    a(b()[1], Integer.valueOf(paramInt));
    this.b = paramInt;
    c()[1] = 1;
    return this;
  }

  public Builder c(int paramInt)
  {
    a(b()[2], Integer.valueOf(paramInt));
    this.c = paramInt;
    c()[2] = 1;
    return this;
  }

  public Builder d(int paramInt)
  {
    a(b()[3], Integer.valueOf(paramInt));
    this.d = paramInt;
    c()[3] = 1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.AdViewContainer.Builder
 * JD-Core Version:    0.6.2
 */