package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.fn;
import com.flurry.sdk.fn.q;
import com.flurry.sdk.gv;
import com.flurry.sdk.gw;

public class AdViewContainer extends gw
  implements gv
{
  public static final fn SCHEMA$ = new fn.q().a("{\"type\":\"record\",\"name\":\"AdViewContainer\",\"namespace\":\"com.flurry.android.impl.ads.avro.protocol.v10\",\"fields\":[{\"name\":\"viewWidth\",\"type\":\"int\",\"default\":0},{\"name\":\"viewHeight\",\"type\":\"int\",\"default\":0},{\"name\":\"screenWidth\",\"type\":\"int\",\"default\":0},{\"name\":\"screenHeight\",\"type\":\"int\",\"default\":0},{\"name\":\"density\",\"type\":\"float\",\"default\":1.0},{\"name\":\"screenOrientation\",\"type\":{\"type\":\"enum\",\"name\":\"ScreenOrientationType\",\"symbols\":[\"PORTRAIT\",\"LANDSCAPE\",\"UNKNOWN\"]},\"default\":\"UNKNOWN\"}]}");

  @Deprecated
  public int a;

  @Deprecated
  public int b;

  @Deprecated
  public int c;

  @Deprecated
  public int d;

  @Deprecated
  public float e;

  @Deprecated
  public ScreenOrientationType f;

  public static AdViewContainer.Builder b()
  {
    return new AdViewContainer.Builder(null);
  }

  public fn a()
  {
    return SCHEMA$;
  }

  public Object a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new fk("Bad index");
    case 0:
      return Integer.valueOf(this.a);
    case 1:
      return Integer.valueOf(this.b);
    case 2:
      return Integer.valueOf(this.c);
    case 3:
      return Integer.valueOf(this.d);
    case 4:
      return Float.valueOf(this.e);
    case 5:
    }
    return this.f;
  }

  public void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default:
      throw new fk("Bad index");
    case 0:
      this.a = ((Integer)paramObject).intValue();
      return;
    case 1:
      this.b = ((Integer)paramObject).intValue();
      return;
    case 2:
      this.c = ((Integer)paramObject).intValue();
      return;
    case 3:
      this.d = ((Integer)paramObject).intValue();
      return;
    case 4:
      this.e = ((Float)paramObject).floatValue();
      return;
    case 5:
    }
    this.f = ((ScreenOrientationType)paramObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.AdViewContainer
 * JD-Core Version:    0.6.2
 */