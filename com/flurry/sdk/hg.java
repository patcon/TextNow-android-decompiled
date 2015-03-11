package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JsonCreator;
import com.flurry.org.codehaus.jackson.annotate.JsonProperty;
import java.io.Serializable;

public class hg
  implements Serializable
{
  public static final hg a = new hg("N/A", -1L, -1L, -1, -1);
  final long b;
  final long c;
  final int d;
  final int e;
  final Object f;

  public hg(Object paramObject, long paramLong, int paramInt1, int paramInt2)
  {
    this(paramObject, -1L, paramLong, paramInt1, paramInt2);
  }

  @JsonCreator
  public hg(@JsonProperty("sourceRef") Object paramObject, @JsonProperty("byteOffset") long paramLong1, @JsonProperty("charOffset") long paramLong2, @JsonProperty("lineNr") int paramInt1, @JsonProperty("columnNr") int paramInt2)
  {
    this.f = paramObject;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramInt1;
    this.e = paramInt2;
  }

  public long a()
  {
    return this.b;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    hg localhg;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (!(paramObject instanceof hg))
        return false;
      localhg = (hg)paramObject;
      if (this.f == null)
      {
        if (localhg.f != null)
          return false;
      }
      else if (!this.f.equals(localhg.f))
        return false;
    }
    while ((this.d == localhg.d) && (this.e == localhg.e) && (this.c == localhg.c) && (a() == localhg.a()));
    return false;
  }

  public int hashCode()
  {
    if (this.f == null);
    for (int i = 1; ; i = this.f.hashCode())
      return ((i ^ this.d) + this.e ^ (int)this.c) + (int)this.b;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(80);
    localStringBuilder.append("[Source: ");
    if (this.f == null)
      localStringBuilder.append("UNKNOWN");
    while (true)
    {
      localStringBuilder.append("; line: ");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", column: ");
      localStringBuilder.append(this.e);
      localStringBuilder.append(']');
      return localStringBuilder.toString();
      localStringBuilder.append(this.f.toString());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hg
 * JD-Core Version:    0.6.2
 */