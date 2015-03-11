package com.google.android.gms.internal;

@ez
final class fb$a extends Exception
{
  private final int tc;

  public fb$a(String paramString, int paramInt)
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
 * Qualified Name:     com.google.android.gms.internal.fb.a
 * JD-Core Version:    0.6.2
 */