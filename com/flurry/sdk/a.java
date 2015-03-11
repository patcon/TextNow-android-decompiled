package com.flurry.sdk;

import java.util.Map;

public class a
{
  public final String a;
  public final Map<String, String> b;
  public final q c;

  public a(String paramString, Map<String, String> paramMap, q paramq)
  {
    this.a = paramString;
    this.b = paramMap;
    this.c = paramq;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("action=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(",params=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(",");
    localStringBuilder.append(this.c);
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.a
 * JD-Core Version:    0.6.2
 */