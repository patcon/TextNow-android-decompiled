package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.fn;
import com.flurry.sdk.fn.q;
import com.flurry.sdk.gv;
import com.flurry.sdk.gw;

public class AdSpaceLayout extends gw
  implements gv
{
  public static final fn SCHEMA$ = new fn.q().a("{\"type\":\"record\",\"name\":\"AdSpaceLayout\",\"namespace\":\"com.flurry.android.impl.ads.avro.protocol.v10\",\"fields\":[{\"name\":\"adWidth\",\"type\":\"int\"},{\"name\":\"adHeight\",\"type\":\"int\"},{\"name\":\"fix\",\"type\":\"string\"},{\"name\":\"format\",\"type\":\"string\"},{\"name\":\"alignment\",\"type\":\"string\"}]}");

  @Deprecated
  public int a;

  @Deprecated
  public int b;

  @Deprecated
  public CharSequence c;

  @Deprecated
  public CharSequence d;

  @Deprecated
  public CharSequence e;

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
      return this.c;
    case 3:
      return this.d;
    case 4:
    }
    return this.e;
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
      this.c = ((CharSequence)paramObject);
      return;
    case 3:
      this.d = ((CharSequence)paramObject);
      return;
    case 4:
    }
    this.e = ((CharSequence)paramObject);
  }

  public Integer b()
  {
    return Integer.valueOf(this.a);
  }

  public Integer c()
  {
    return Integer.valueOf(this.b);
  }

  public CharSequence d()
  {
    return this.c;
  }

  public CharSequence e()
  {
    return this.d;
  }

  public CharSequence f()
  {
    return this.e;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout
 * JD-Core Version:    0.6.2
 */