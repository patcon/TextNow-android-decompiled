package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class dl
{
  private static final String a = dl.class.getSimpleName();
  private static dl b;
  private final Map<String, dj> c = new HashMap();
  private final Map<Context, dj> d = new WeakHashMap();
  private final Object e = new Object();
  private dj f;

  public static dl a()
  {
    try
    {
      if (b == null)
        b = new dl();
      dl localdl = b;
      return localdl;
    }
    finally
    {
    }
  }

  public void a(Context paramContext)
  {
    try
    {
      dj localdj = (dj)this.d.remove(paramContext);
      if (localdj == null)
        eo.d(a, "Session cannot be ended, session not found for context: " + paramContext);
      while (true)
      {
        return;
        localdj.c(paramContext);
      }
    }
    finally
    {
    }
  }

  public void a(Context paramContext, String paramString)
  {
    while (true)
    {
      try
      {
        do.a(paramContext);
        ev.a().b();
        dz.a().b();
        dj localdj1 = (dj)this.d.get(paramContext);
        if (localdj1 != null)
        {
          eo.d(a, "Session already started with context: " + paramContext + " count:" + localdj1.g());
          return;
        }
        if (this.c.containsKey(paramString))
        {
          localdj2 = (dj)this.c.get(paramString);
          this.d.put(paramContext, localdj2);
          a(localdj2);
          localdj2.b(paramContext);
          continue;
        }
      }
      finally
      {
      }
      dj localdj2 = new dj(paramString);
      this.c.put(paramString, localdj2);
      localdj2.a(paramContext);
    }
  }

  public void a(dj paramdj)
  {
    synchronized (this.e)
    {
      this.f = paramdj;
      return;
    }
  }

  public void a(String paramString)
  {
    try
    {
      if (!this.c.containsKey(paramString))
        eo.a(6, a, "Ended session is not in the session map! Maybe it was already destroyed.");
      while (true)
      {
        return;
        dj localdj = c();
        if ((localdj != null) && (TextUtils.equals(localdj.j(), paramString)))
          a(null);
        this.c.remove(paramString);
      }
    }
    finally
    {
    }
  }

  public int b()
  {
    try
    {
      int i = this.d.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public dj c()
  {
    synchronized (this.e)
    {
      dj localdj = this.f;
      return localdj;
    }
  }

  public void d()
  {
    try
    {
      Iterator localIterator1 = this.d.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        ((dj)localEntry.getValue()).c((Context)localEntry.getKey());
      }
    }
    finally
    {
    }
    this.d.clear();
    Iterator localIterator2 = new ArrayList(this.c.values()).iterator();
    while (localIterator2.hasNext())
      ((dj)localIterator2.next()).c();
    this.c.clear();
    a(null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dl
 * JD-Core Version:    0.6.2
 */