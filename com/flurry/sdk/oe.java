package com.flurry.sdk;

import java.util.HashMap;

public class oe extends ky.a
{
  protected HashMap<qj, kx> a;

  public kx a(iy paramiy, ir paramir, kx paramkx)
  {
    kx localkx = (kx)this.a.get(new qj(paramir.b()));
    if (localkx == null)
      return paramkx;
    return localkx;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.oe
 * JD-Core Version:    0.6.2
 */