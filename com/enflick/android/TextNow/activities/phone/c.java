package com.enflick.android.TextNow.activities.phone;

import java.util.Collection;
import java.util.TreeSet;

public final class c
{
  private final String a;
  private TreeSet<s> b;

  public c(String paramString)
  {
    this.a = paramString;
    this.b = new TreeSet();
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(s params)
  {
    this.b.add(params);
  }

  public final void a(Collection<s> paramCollection)
  {
    this.b.addAll(paramCollection);
  }

  public final s b()
  {
    if (!this.b.isEmpty())
      return (s)this.b.first();
    return null;
  }

  public final void b(s params)
  {
    this.b.remove(params);
  }

  public final boolean c()
  {
    return this.b.isEmpty();
  }

  public final boolean c(s params)
  {
    return this.b.contains(params);
  }

  public final TreeSet<s> d()
  {
    return this.b;
  }

  public final int e()
  {
    return this.b.size();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.c
 * JD-Core Version:    0.6.2
 */