package com.flurry.sdk;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class nx extends nw
{
  protected final jn<?> a;
  protected final HashMap<String, String> b;
  protected final HashMap<String, sh> e;

  protected nx(jn<?> paramjn, sh paramsh, HashMap<String, String> paramHashMap, HashMap<String, sh> paramHashMap1)
  {
    super(paramsh, paramjn.m());
    this.a = paramjn;
    this.b = paramHashMap;
    this.e = paramHashMap1;
  }

  public static nx a(jn<?> paramjn, sh paramsh, Collection<nf> paramCollection, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1 == paramBoolean2)
      throw new IllegalArgumentException();
    if (paramBoolean1);
    for (HashMap localHashMap1 = new HashMap(); ; localHashMap1 = null)
    {
      if (paramBoolean2);
      for (HashMap localHashMap2 = new HashMap(); ; localHashMap2 = null)
      {
        if (paramCollection != null)
        {
          Iterator localIterator = paramCollection.iterator();
          if (localIterator.hasNext())
          {
            nf localnf = (nf)localIterator.next();
            Class localClass = localnf.a();
            if (localnf.c());
            for (String str = localnf.b(); ; str = a(localClass))
            {
              if (paramBoolean1)
                localHashMap1.put(localClass.getName(), str);
              if (!paramBoolean2)
                break;
              sh localsh = (sh)localHashMap2.get(str);
              if ((localsh != null) && (localClass.isAssignableFrom(localsh.p())))
                break;
              localHashMap2.put(str, paramjn.b(localClass));
              break;
            }
          }
        }
        return new nx(paramjn, paramsh, localHashMap1, localHashMap2);
      }
    }
  }

  protected static String a(Class<?> paramClass)
  {
    String str = paramClass.getName();
    int i = str.lastIndexOf('.');
    if (i < 0)
      return str;
    return str.substring(i + 1);
  }

  public sh a(String paramString)
  {
    return (sh)this.e.get(paramString);
  }

  public String a(Object paramObject)
  {
    Class localClass = paramObject.getClass();
    String str1 = localClass.getName();
    synchronized (this.b)
    {
      String str2 = (String)this.b.get(str1);
      if (str2 == null)
      {
        if (this.a.b())
        {
          mw localmw = (mw)this.a.c(localClass);
          str2 = this.a.a().g(localmw.c());
        }
        if (str2 == null)
          str2 = a(localClass);
        this.b.put(str1, str2);
      }
      return str2;
    }
  }

  public String a(Object paramObject, Class<?> paramClass)
  {
    return a(paramObject);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[').append(getClass().getName());
    localStringBuilder.append("; id-to-type=").append(this.e);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.nx
 * JD-Core Version:    0.6.2
 */