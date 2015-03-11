package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.fn;
import com.flurry.sdk.fn.q;
import com.flurry.sdk.gv;
import com.flurry.sdk.gw;
import java.util.List;

public class Callback extends gw
  implements gv
{
  public static final fn SCHEMA$ = new fn.q().a("{\"type\":\"record\",\"name\":\"Callback\",\"namespace\":\"com.flurry.android.impl.ads.avro.protocol.v10\",\"fields\":[{\"name\":\"event\",\"type\":\"string\"},{\"name\":\"actions\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}");

  @Deprecated
  public CharSequence a;

  @Deprecated
  public List<CharSequence> b;

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
      return this.a;
    case 1:
    }
    return this.b;
  }

  public void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default:
      throw new fk("Bad index");
    case 0:
      this.a = ((CharSequence)paramObject);
      return;
    case 1:
    }
    this.b = ((List)paramObject);
  }

  public CharSequence b()
  {
    return this.a;
  }

  public List<CharSequence> c()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.Callback
 * JD-Core Version:    0.6.2
 */