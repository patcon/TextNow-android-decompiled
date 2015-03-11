package com.flurry.sdk;

public class lz$m extends mc<java.sql.Date>
{
  public lz$m()
  {
    super(java.sql.Date.class);
  }

  public java.sql.Date b(hj paramhj, iz paramiz)
  {
    java.util.Date localDate = B(paramhj, paramiz);
    if (localDate == null)
      return null;
    return new java.sql.Date(localDate.getTime());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lz.m
 * JD-Core Version:    0.6.2
 */