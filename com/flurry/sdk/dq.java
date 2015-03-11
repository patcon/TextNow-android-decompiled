package com.flurry.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class dq
{
  private Map<String, Object> a = new HashMap();
  private Map<String, List<dq.a>> b = new HashMap();

  private boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }

  private void b(String paramString, Object paramObject)
  {
    if (this.b.get(paramString) != null)
    {
      Iterator localIterator = ((List)this.b.get(paramString)).iterator();
      while (localIterator.hasNext())
        ((dq.a)localIterator.next()).a(paramString, paramObject);
    }
  }

  public Object a(String paramString)
  {
    try
    {
      Object localObject2 = this.a.get(paramString);
      return localObject2;
    }
    finally
    {
      localObject1 = finally;
      throw localObject1;
    }
  }

  public void a(String paramString, dq.a parama)
  {
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool);
      while (true)
      {
        return;
        if (parama != null)
        {
          Object localObject2 = (List)this.b.get(paramString);
          if (localObject2 == null)
            localObject2 = new LinkedList();
          ((List)localObject2).add(parama);
          this.b.put(paramString, localObject2);
        }
      }
    }
    finally
    {
    }
  }

  public void a(String paramString, Object paramObject)
  {
    while (true)
    {
      try
      {
        boolean bool = TextUtils.isEmpty(paramString);
        if (bool)
          return;
        if (a(paramObject, this.a.get(paramString)))
          continue;
        if (paramObject == null)
        {
          this.a.remove(paramString);
          b(paramString, paramObject);
          continue;
        }
      }
      finally
      {
      }
      this.a.put(paramString, paramObject);
    }
  }

  public boolean b(String paramString, dq.a parama)
  {
    try
    {
      boolean bool1 = TextUtils.isEmpty(paramString);
      boolean bool2;
      if (bool1)
        bool2 = false;
      while (true)
      {
        return bool2;
        if (parama == null)
        {
          bool2 = false;
        }
        else
        {
          List localList = (List)this.b.get(paramString);
          if (localList == null)
          {
            bool2 = false;
          }
          else
          {
            boolean bool3 = localList.remove(parama);
            bool2 = bool3;
          }
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dq
 * JD-Core Version:    0.6.2
 */