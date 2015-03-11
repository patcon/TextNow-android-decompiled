package com.flurry.sdk;

import java.util.HashMap;

public final class ox
{
  private HashMap<ox.a, jk<Object>> a = new HashMap(64);
  private ow b = null;

  public final jk<Object> a(sh paramsh)
  {
    try
    {
      jk localjk = (jk)this.a.get(new ox.a(paramsh, false));
      return localjk;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final jk<Object> a(Class<?> paramClass)
  {
    try
    {
      jk localjk = (jk)this.a.get(new ox.a(paramClass, false));
      return localjk;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final ow a()
  {
    try
    {
      ow localow = this.b;
      if (localow == null)
      {
        localow = ow.a(this.a);
        this.b = localow;
      }
      return localow.a();
    }
    finally
    {
    }
  }

  public final void a(sh paramsh, jk<Object> paramjk)
  {
    try
    {
      if (this.a.put(new ox.a(paramsh, true), paramjk) == null)
        this.b = null;
      return;
    }
    finally
    {
    }
  }

  public final void a(sh paramsh, jk<Object> paramjk, jw paramjw)
  {
    try
    {
      if (this.a.put(new ox.a(paramsh, false), paramjk) == null)
        this.b = null;
      if ((paramjk instanceof jt))
        ((jt)paramjk).a(paramjw);
      return;
    }
    finally
    {
    }
  }

  public final void a(Class<?> paramClass, jk<Object> paramjk)
  {
    try
    {
      if (this.a.put(new ox.a(paramClass, true), paramjk) == null)
        this.b = null;
      return;
    }
    finally
    {
    }
  }

  public final void a(Class<?> paramClass, jk<Object> paramjk, jw paramjw)
  {
    try
    {
      if (this.a.put(new ox.a(paramClass, false), paramjk) == null)
        this.b = null;
      if ((paramjk instanceof jt))
        ((jt)paramjk).a(paramjw);
      return;
    }
    finally
    {
    }
  }

  public final jk<Object> b(sh paramsh)
  {
    try
    {
      jk localjk = (jk)this.a.get(new ox.a(paramsh, true));
      return localjk;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final jk<Object> b(Class<?> paramClass)
  {
    try
    {
      jk localjk = (jk)this.a.get(new ox.a(paramClass, true));
      return localjk;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ox
 * JD-Core Version:    0.6.2
 */