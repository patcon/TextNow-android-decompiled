package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class y
{
  private static final String a = y.class.getSimpleName();
  private static y b;
  private HashMap<String, x> c = new HashMap();

  public static y a()
  {
    if (b == null)
      b = new y();
    return b;
  }

  public final x a(String paramString)
  {
    try
    {
      try
      {
        if (this.c.containsKey(paramString))
        {
          x localx = (x)this.c.get(paramString);
          return localx;
        }
        return null;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }

  public final void a(x paramx)
  {
    while (true)
    {
      try
      {
        if (paramx.b().length() == 0)
          return;
        try
        {
          if (this.c.containsKey(paramx.b()))
          {
            this.c.remove(paramx.b());
            if (paramx.e() != -1)
              this.c.put(paramx.b(), paramx);
            return;
          }
        }
        finally
        {
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
      this.c.put(paramx.b(), paramx);
    }
  }

  public final boolean a(long paramLong)
  {
    return paramLong <= System.currentTimeMillis();
  }

  public final HashMap<String, x> b()
  {
    return this.c;
  }

  public final void b(String paramString)
  {
    try
    {
      try
      {
        if (this.c.containsKey(paramString))
          this.c.remove(paramString);
        return;
      }
      finally
      {
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public final List<x> c()
  {
    ArrayList localArrayList;
    try
    {
      try
      {
        localArrayList = new ArrayList();
        Iterator localIterator = b().values().iterator();
        while (localIterator.hasNext())
          localArrayList.add(((x)localIterator.next()).a());
      }
      finally
      {
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return null;
    }
    return localArrayList;
  }

  public final void d()
  {
    try
    {
      try
      {
        Iterator localIterator = c().iterator();
        while (localIterator.hasNext())
        {
          x localx = (x)localIterator.next();
          if (a(localx.h()))
          {
            eo.a(3, a, "expiring adunit freq cap for idHash: " + localx.b() + " adunit exp: " + localx.h() + " device epoch" + System.currentTimeMillis());
            b(localx.b());
          }
        }
      }
      finally
      {
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.y
 * JD-Core Version:    0.6.2
 */