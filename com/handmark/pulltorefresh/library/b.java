package com.handmark.pulltorefresh.library;

import java.util.HashSet;
import java.util.Iterator;
import textnow.af.d;

public final class b
  implements a
{
  private final HashSet<d> a = new HashSet();

  public final void a(CharSequence paramCharSequence)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((d)localIterator.next()).a(paramCharSequence);
  }

  public final void a(d paramd)
  {
    if (paramd != null)
      this.a.add(paramd);
  }

  public final void b(CharSequence paramCharSequence)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((d)localIterator.next()).b(paramCharSequence);
  }

  public final void c(CharSequence paramCharSequence)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((d)localIterator.next()).c(paramCharSequence);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.handmark.pulltorefresh.library.b
 * JD-Core Version:    0.6.2
 */