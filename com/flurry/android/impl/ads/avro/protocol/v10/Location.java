package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.fn;
import com.flurry.sdk.fn.q;
import com.flurry.sdk.gv;
import com.flurry.sdk.gw;

public class Location extends gw
  implements gv
{
  public static final fn SCHEMA$ = new fn.q().a("{\"type\":\"record\",\"name\":\"Location\",\"namespace\":\"com.flurry.android.impl.ads.avro.protocol.v10\",\"fields\":[{\"name\":\"lat\",\"type\":\"float\",\"default\":0.0},{\"name\":\"lon\",\"type\":\"float\",\"default\":0.0}]}");

  @Deprecated
  public float a;

  @Deprecated
  public float b;

  public static Location.Builder b()
  {
    return new Location.Builder(null);
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
      return Float.valueOf(this.a);
    case 1:
    }
    return Float.valueOf(this.b);
  }

  public void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default:
      throw new fk("Bad index");
    case 0:
      this.a = ((Float)paramObject).floatValue();
      return;
    case 1:
    }
    this.b = ((Float)paramObject).floatValue();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.Location
 * JD-Core Version:    0.6.2
 */