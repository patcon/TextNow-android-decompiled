package com.flurry.sdk;

import java.util.HashMap;

public class ob
  implements jm
{
  protected HashMap<qj, jl> a = null;

  public jl a(sh paramsh, iy paramiy, ir paramir, is paramis)
  {
    if (this.a == null)
      return null;
    return (jl)this.a.get(new qj(paramsh.p()));
  }

  public ob a(Class<?> paramClass, jl paramjl)
  {
    if (this.a == null)
      this.a = new HashMap();
    this.a.put(new qj(paramClass), paramjl);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ob
 * JD-Core Version:    0.6.2
 */