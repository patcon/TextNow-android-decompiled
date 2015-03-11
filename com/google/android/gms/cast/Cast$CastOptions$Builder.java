package com.google.android.gms.cast;

import com.google.android.gms.common.internal.o;

public final class Cast$CastOptions$Builder
{
  CastDevice EN;
  Cast.Listener EO;
  private int EP;

  private Cast$CastOptions$Builder(CastDevice paramCastDevice, Cast.Listener paramListener)
  {
    o.b(paramCastDevice, "CastDevice parameter cannot be null");
    o.b(paramListener, "CastListener parameter cannot be null");
    this.EN = paramCastDevice;
    this.EO = paramListener;
    this.EP = 0;
  }

  public final Cast.CastOptions build()
  {
    return new Cast.CastOptions(this, null);
  }

  public final Builder setVerboseLoggingEnabled(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.EP = (0x1 | this.EP);
      return this;
    }
    this.EP = (0xFFFFFFFE & this.EP);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast.CastOptions.Builder
 * JD-Core Version:    0.6.2
 */