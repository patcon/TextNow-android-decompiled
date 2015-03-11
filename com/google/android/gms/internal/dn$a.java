package com.google.android.gms.internal;

final class dn$a extends Exception
{
  private final int pJ;

  public dn$a(String paramString, int paramInt)
  {
    super(paramString);
    this.pJ = paramInt;
  }

  public final int getErrorCode()
  {
    return this.pJ;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dn.a
 * JD-Core Version:    0.6.2
 */