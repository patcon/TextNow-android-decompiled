package com.flurry.sdk;

import java.util.Iterator;
import java.util.List;

public class fb
{
  private static final String a = fb.class.getSimpleName();
  private final dt<fb.a> b = new dt();
  private long c = 1000L;
  private boolean d = true;
  private boolean e = false;
  private ff f = new ff()
  {
    public void a()
    {
      try
      {
        Iterator localIterator = fb.a(fb.this).iterator();
        while (localIterator.hasNext())
          ((fb.a)localIterator.next()).a(fb.this);
      }
      catch (Throwable localThrowable)
      {
        eo.a(6, fb.e(), "", localThrowable);
        if ((fb.b(fb.this)) && (fb.c(fb.this)))
          do.a().a(fb.d(fb.this), fb.e(fb.this));
      }
    }
  };

  private List<fb.a> f()
  {
    try
    {
      List localList = this.b.a();
      return localList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a()
  {
    try
    {
      boolean bool = this.e;
      if (bool);
      while (true)
      {
        return;
        do.a().a(this.f, this.c);
        this.e = true;
      }
    }
    finally
    {
    }
  }

  public void a(long paramLong)
  {
    this.c = paramLong;
  }

  public void a(fb.a parama)
  {
    try
    {
      this.b.a(parama);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public void b()
  {
    try
    {
      boolean bool = this.e;
      if (!bool);
      while (true)
      {
        return;
        do.a().b(this.f);
        this.e = false;
      }
    }
    finally
    {
    }
  }

  public boolean b(fb.a parama)
  {
    try
    {
      boolean bool = this.b.b(parama);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean c()
  {
    try
    {
      boolean bool = this.e;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int d()
  {
    try
    {
      int i = this.b.b();
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fb
 * JD-Core Version:    0.6.2
 */