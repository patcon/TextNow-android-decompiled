package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.fn;
import com.flurry.sdk.fn.q;
import com.flurry.sdk.gv;
import com.flurry.sdk.gw;
import java.util.List;

public class SdkLogResponse extends gw
  implements gv
{
  public static final fn SCHEMA$ = new fn.q().a("{\"type\":\"record\",\"name\":\"SdkLogResponse\",\"namespace\":\"com.flurry.android.impl.ads.avro.protocol.v10\",\"fields\":[{\"name\":\"result\",\"type\":\"string\"},{\"name\":\"errors\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}");

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

  public void a(CharSequence paramCharSequence)
  {
    this.a = paramCharSequence;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.SdkLogResponse
 * JD-Core Version:    0.6.2
 */