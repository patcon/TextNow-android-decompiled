package com.google.android.gms.cast;

import com.google.android.gms.internal.hm;

public final class Cast$CastOptions$Builder
{
  CastDevice Ad;
  Cast.Listener Ae;
  private int Af;

  private Cast$CastOptions$Builder(CastDevice paramCastDevice, Cast.Listener paramListener)
  {
    hm.b(paramCastDevice, "CastDevice parameter cannot be null");
    hm.b(paramListener, "CastListener parameter cannot be null");
    this.Ad = paramCastDevice;
    this.Ae = paramListener;
    this.Af = 0;
  }

  public final Cast.CastOptions build()
  {
    return new Cast.CastOptions(this, null);
  }

  public final Builder setVerboseLoggingEnabled(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.Af = (0x1 | this.Af);
      return this;
    }
    this.Af = (0xFFFFFFFE & this.Af);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast.CastOptions.Builder
 * JD-Core Version:    0.6.2
 */