package com.google.android.gms.internal;

import java.util.Map;

public class be
  implements bc
{
  private final bf nc;

  public be(bf parambf)
  {
    this.nc = parambf;
  }

  public void b(ex paramex, Map<String, String> paramMap)
  {
    boolean bool = "1".equals(paramMap.get("transparentBackground"));
    this.nc.b(bool);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.be
 * JD-Core Version:    0.6.2
 */