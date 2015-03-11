package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.gx;
import java.nio.ByteBuffer;

public class AdReportedId$Builder extends gx<AdReportedId>
{
  private int a;
  private ByteBuffer b;

  private AdReportedId$Builder()
  {
    super(AdReportedId.SCHEMA$);
  }

  public Builder a(int paramInt)
  {
    a(b()[0], Integer.valueOf(paramInt));
    this.a = paramInt;
    c()[0] = 1;
    return this;
  }

  public Builder a(ByteBuffer paramByteBuffer)
  {
    a(b()[1], paramByteBuffer);
    this.b = paramByteBuffer;
    c()[1] = 1;
    return this;
  }

  public AdReportedId a()
  {
    try
    {
      AdReportedId localAdReportedId = new AdReportedId();
      int i;
      if (c()[0] != 0)
      {
        i = this.a;
        localAdReportedId.a = i;
        if (c()[1] == 0)
          break label70;
      }
      label70: for (ByteBuffer localByteBuffer = this.b; ; localByteBuffer = (ByteBuffer)a(b()[1]))
      {
        localAdReportedId.b = localByteBuffer;
        return localAdReportedId;
        i = ((Integer)a(b()[0])).intValue();
        break;
      }
    }
    catch (Exception localException)
    {
      throw new fk(localException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.AdReportedId.Builder
 * JD-Core Version:    0.6.2
 */