package com.enflick.android.TextNow.ads;

import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  private static LinkedList<d> a = new LinkedList();

  public static void a()
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      new StringBuilder().append("really invalidating ").append(locald.getClass().getSimpleName()).toString();
      locald.invalidate();
    }
    a.clear();
  }

  public static void a(d paramd)
  {
    a.add(paramd);
    new StringBuilder().append("mark ").append(paramd.getClass().getSimpleName()).append(" pending invalidate").toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.ads.c
 * JD-Core Version:    0.6.2
 */