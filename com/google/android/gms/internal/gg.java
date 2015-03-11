package com.google.android.gms.internal;

import android.text.TextUtils;

public abstract class gg
{
  protected final gn BD;
  private final String BE;
  private gp BF;

  protected gg(String paramString1, String paramString2, String paramString3)
  {
    gi.ak(paramString1);
    this.BE = paramString1;
    this.BD = new gn(paramString2);
    if (!TextUtils.isEmpty(paramString3))
      this.BD.ap(paramString3);
  }

  public void a(long paramLong, int paramInt)
  {
  }

  public final void a(gp paramgp)
  {
    this.BF = paramgp;
    if (this.BF == null)
      ee();
  }

  protected final void a(String paramString1, long paramLong, String paramString2)
  {
    this.BD.a("Sending text message: %s to: %s", new Object[] { paramString1, paramString2 });
    this.BF.a(this.BE, paramString1, paramLong, paramString2);
  }

  public void ai(String paramString)
  {
  }

  protected final long ed()
  {
    return this.BF.eb();
  }

  public void ee()
  {
  }

  public final String getNamespace()
  {
    return this.BE;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gg
 * JD-Core Version:    0.6.2
 */