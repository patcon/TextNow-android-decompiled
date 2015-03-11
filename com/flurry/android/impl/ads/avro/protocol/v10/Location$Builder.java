package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.gx;

public class Location$Builder extends gx<Location>
{
  private float a;
  private float b;

  private Location$Builder()
  {
    super(Location.SCHEMA$);
  }

  public Builder a(float paramFloat)
  {
    a(b()[0], Float.valueOf(paramFloat));
    this.a = paramFloat;
    c()[0] = 1;
    return this;
  }

  public Location a()
  {
    try
    {
      Location localLocation = new Location();
      float f1;
      if (c()[0] != 0)
      {
        f1 = this.a;
        localLocation.a = f1;
        if (c()[1] == 0)
          break label70;
      }
      label70: float f2;
      for (float f3 = this.b; ; f3 = f2)
      {
        localLocation.b = f3;
        return localLocation;
        f1 = ((Float)a(b()[0])).floatValue();
        break;
        f2 = ((Float)a(b()[1])).floatValue();
      }
    }
    catch (Exception localException)
    {
      throw new fk(localException);
    }
  }

  public Builder b(float paramFloat)
  {
    a(b()[1], Float.valueOf(paramFloat));
    this.b = paramFloat;
    c()[1] = 1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.Location.Builder
 * JD-Core Version:    0.6.2
 */