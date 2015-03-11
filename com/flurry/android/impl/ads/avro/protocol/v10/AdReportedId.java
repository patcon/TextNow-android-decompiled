package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.fn;
import com.flurry.sdk.fn.q;
import com.flurry.sdk.gv;
import com.flurry.sdk.gw;
import java.nio.ByteBuffer;

public class AdReportedId extends gw
  implements gv
{
  public static final fn SCHEMA$ = new fn.q().a("{\"type\":\"record\",\"name\":\"AdReportedId\",\"namespace\":\"com.flurry.android.impl.ads.avro.protocol.v10\",\"fields\":[{\"name\":\"type\",\"type\":\"int\"},{\"name\":\"id\",\"type\":\"bytes\"}]}");

  @Deprecated
  public int a;

  @Deprecated
  public ByteBuffer b;

  public static AdReportedId.Builder b()
  {
    return new AdReportedId.Builder(null);
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
      this.a = ((Integer)paramObject).intValue();
      return;
    case 1:
    }
    this.b = ((ByteBuffer)paramObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.AdReportedId
 * JD-Core Version:    0.6.2
 */