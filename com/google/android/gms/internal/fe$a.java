package com.google.android.gms.internal;

final class fe$a extends Exception
{
  private final int tc;

  public fe$a(String paramString, int paramInt)
  {
    super(paramString);
    this.tc = paramInt;
  }

  public final int getErrorCode()
  {
    return this.tc;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fe.a
 * JD-Core Version:    0.6.2
 */