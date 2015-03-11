package com.flurry.sdk;

import java.io.OutputStream;

public class gj
{
  private static final gj c = new gj.a(null);
  protected int a = 2048;
  protected int b = 65536;

  public static gj a()
  {
    return c;
  }

  public gc a(OutputStream paramOutputStream, gc paramgc)
  {
    if ((paramgc == null) || (!paramgc.getClass().equals(gd.class)))
      return new gd(paramOutputStream, this.a);
    return ((gd)paramgc).a(paramOutputStream, this.a);
  }

  public gj a(int paramInt)
  {
    int i = 16777216;
    int j = 32;
    if (paramInt < j);
    while (true)
    {
      if (j > i);
      while (true)
      {
        this.a = i;
        return this;
        i = j;
      }
      j = paramInt;
    }
  }

  public gc b(OutputStream paramOutputStream, gc paramgc)
  {
    if ((paramgc == null) || (!paramgc.getClass().equals(gh.class)))
      return new gh(paramOutputStream);
    return ((gh)paramgc).a(paramOutputStream);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gj
 * JD-Core Version:    0.6.2
 */