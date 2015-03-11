package com.flurry.android.impl.ads.avro.protocol.v10;

import com.flurry.sdk.fk;
import com.flurry.sdk.gx;
import java.util.List;

public class SdkLogRequest$Builder extends gx<SdkLogRequest>
{
  private CharSequence a;
  private List<AdReportedId> b;
  private List<SdkAdLog> c;
  private long d;
  private CharSequence e;
  private boolean f;

  private SdkLogRequest$Builder()
  {
    super(SdkLogRequest.SCHEMA$);
  }

  public Builder a(long paramLong)
  {
    a(b()[3], Long.valueOf(paramLong));
    this.d = paramLong;
    c()[3] = 1;
    return this;
  }

  public Builder a(CharSequence paramCharSequence)
  {
    a(b()[0], paramCharSequence);
    this.a = paramCharSequence;
    c()[0] = 1;
    return this;
  }

  public Builder a(List<AdReportedId> paramList)
  {
    a(b()[1], paramList);
    this.b = paramList;
    c()[1] = 1;
    return this;
  }

  public Builder a(boolean paramBoolean)
  {
    a(b()[5], Boolean.valueOf(paramBoolean));
    this.f = paramBoolean;
    c()[5] = 1;
    return this;
  }

  public SdkLogRequest a()
  {
    try
    {
      SdkLogRequest localSdkLogRequest = new SdkLogRequest();
      CharSequence localCharSequence1;
      List localList1;
      label42: List localList2;
      label63: long l;
      label84: CharSequence localCharSequence2;
      if (c()[0] != 0)
      {
        localCharSequence1 = this.a;
        localSdkLogRequest.a = localCharSequence1;
        if (c()[1] == 0)
          break label151;
        localList1 = this.b;
        localSdkLogRequest.b = localList1;
        if (c()[2] == 0)
          break label169;
        localList2 = this.c;
        localSdkLogRequest.c = localList2;
        if (c()[3] == 0)
          break label187;
        l = this.d;
        localSdkLogRequest.d = l;
        if (c()[4] == 0)
          break label208;
        localCharSequence2 = this.e;
        label105: localSdkLogRequest.e = localCharSequence2;
        if (c()[5] == 0)
          break label226;
      }
      label151: label169: label187: label208: label226: boolean bool1;
      for (boolean bool2 = this.f; ; bool2 = bool1)
      {
        localSdkLogRequest.f = bool2;
        return localSdkLogRequest;
        localCharSequence1 = (CharSequence)a(b()[0]);
        break;
        localList1 = (List)a(b()[1]);
        break label42;
        localList2 = (List)a(b()[2]);
        break label63;
        l = ((Long)a(b()[3])).longValue();
        break label84;
        localCharSequence2 = (CharSequence)a(b()[4]);
        break label105;
        bool1 = ((Boolean)a(b()[5])).booleanValue();
      }
    }
    catch (Exception localException)
    {
      throw new fk(localException);
    }
  }

  public Builder b(CharSequence paramCharSequence)
  {
    a(b()[4], paramCharSequence);
    this.e = paramCharSequence;
    c()[4] = 1;
    return this;
  }

  public Builder b(List<SdkAdLog> paramList)
  {
    a(b()[2], paramList);
    this.c = paramList;
    c()[2] = 1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.avro.protocol.v10.SdkLogRequest.Builder
 * JD-Core Version:    0.6.2
 */