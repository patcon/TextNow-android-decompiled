package com.flurry.sdk;

import android.text.TextUtils;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  static final List<String> a = Arrays.asList(new String[] { "requested", "filled", "unfilled", "rendered", "clicked", "prepared", "adunitMerged", "sendUrlStatusResult", "videoStart", "videoFirstQuartile", "videoMidpoint", "videoThirdQuartile", "videoCompleted", "videoProgressed", "sentToUrl", "adClosed", "adWillClose", "renderFailed", "requestAdComponents", "urlVerified", "capExhausted", "capNotExhausted" });
  private static final String b = c.class.getSimpleName();
  private final String c;
  private final boolean d;
  private final long e;
  private final Map<String, String> f;

  public c(DataInput paramDataInput)
  {
    this.c = paramDataInput.readUTF();
    this.d = paramDataInput.readBoolean();
    this.e = paramDataInput.readLong();
    this.f = new HashMap();
    int i = paramDataInput.readShort();
    for (int j = 0; j < i; j = (short)(j + 1))
      this.f.put(paramDataInput.readUTF(), paramDataInput.readUTF());
  }

  public c(String paramString, boolean paramBoolean, long paramLong, Map<String, String> paramMap)
  {
    if (!a.contains(paramString))
      eo.a(b, "AdEvent initialized with unrecognized type: " + paramString);
    this.c = paramString;
    this.d = paramBoolean;
    this.e = paramLong;
    if (paramMap == null)
    {
      this.f = new HashMap();
      return;
    }
    this.f = paramMap;
  }

  public final String a()
  {
    return this.c;
  }

  public final void a(DataOutput paramDataOutput)
  {
    paramDataOutput.writeUTF(this.c);
    paramDataOutput.writeBoolean(this.d);
    paramDataOutput.writeLong(this.e);
    paramDataOutput.writeShort(this.f.size());
    Iterator localIterator = this.f.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramDataOutput.writeUTF((String)localEntry.getKey());
      paramDataOutput.writeUTF((String)localEntry.getValue());
    }
  }

  public final boolean b()
  {
    return this.d;
  }

  public final long c()
  {
    return this.e;
  }

  public final Map<String, String> d()
  {
    return this.f;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    c localc;
    do
    {
      return true;
      if (!(paramObject instanceof c))
        return false;
      localc = (c)paramObject;
    }
    while ((TextUtils.equals(this.c, localc.c)) && (this.d == localc.d) && (this.e == localc.e) && ((this.f == localc.f) || ((this.f != null) && (this.f.equals(localc.f)))));
    return false;
  }

  public final int hashCode()
  {
    int i = 17;
    if (this.c != null)
      i = 0x11 | this.c.hashCode();
    if (this.d)
      i |= 1;
    int j = (int)(i | this.e);
    if (this.f != null)
      j |= this.f.hashCode();
    return j;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.c
 * JD-Core Version:    0.6.2
 */