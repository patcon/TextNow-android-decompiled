package com.enflick.android.TextNow.activities.phone;

import java.util.Collection;
import java.util.TreeSet;

public final class d
{
  private final String a;
  private TreeSet<w> b;

  public d(String paramString)
  {
    this.a = paramString;
    this.b = new TreeSet();
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(w paramw)
  {
    this.b.add(paramw);
  }

  public final void a(Collection<w> paramCollection)
  {
    this.b.addAll(paramCollection);
  }

  public final w b()
  {
    if (!this.b.isEmpty())
      return (w)this.b.first();
    return null;
  }

  public final void b(w paramw)
  {
    this.b.remove(paramw);
  }

  public final boolean c()
  {
    return this.b.isEmpty();
  }

  public final boolean c(w paramw)
  {
    return this.b.contains(paramw);
  }

  public final TreeSet<w> d()
  {
    return this.b;
  }

  public final int e()
  {
    return this.b.size();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.d
 * JD-Core Version:    0.6.2
 */