package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JsonTypeInfo.As;

public class nl extends nj
{
  protected final String a;

  public nl(sh paramsh, nh paramnh, is paramis, Class<?> paramClass, String paramString)
  {
    super(paramsh, paramnh, paramis, paramClass);
    this.a = paramString;
  }

  public JsonTypeInfo.As a()
  {
    return JsonTypeInfo.As.EXTERNAL_PROPERTY;
  }

  public String b()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.nl
 * JD-Core Version:    0.6.2
 */