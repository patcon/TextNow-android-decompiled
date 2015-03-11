package com.flurry.sdk;

import java.io.IOException;
import java.io.StringReader;

public class fn$q
{
  private fn.o a = new fn.o();
  private boolean b = true;

  private fn a(hj paramhj)
  {
    boolean bool = ((Boolean)fn.q().get()).booleanValue();
    try
    {
      fn.q().set(Boolean.valueOf(this.b));
      fn localfn = fn.a(fn.b.a(paramhj), this.a);
      return localfn;
    }
    catch (hi localhi)
    {
      throw new fo(localhi);
    }
    finally
    {
      fn.q().set(Boolean.valueOf(bool));
    }
  }

  public fn a(String paramString)
  {
    try
    {
      fn localfn = a(fn.a.a(new StringReader(paramString)));
      return localfn;
    }
    catch (IOException localIOException)
    {
      throw new fo(localIOException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.q
 * JD-Core Version:    0.6.2
 */