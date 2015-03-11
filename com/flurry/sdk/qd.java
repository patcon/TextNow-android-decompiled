package com.flurry.sdk;

import java.util.Collection;
import java.util.Iterator;

@kb
public class qd extends px<Collection<String>>
  implements jt
{
  protected jk<String> a;

  public qd(is paramis)
  {
    super(Collection.class, paramis);
  }

  private final void b(Collection<String> paramCollection, hf paramhf, jw paramjw)
  {
    if (this.a != null)
      c(paramCollection, paramhf, paramjw);
    while (true)
    {
      return;
      Iterator localIterator = paramCollection.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str == null);
        try
        {
          paramjw.a(paramhf);
          break label85;
          paramhf.b(str);
        }
        catch (Exception localException)
        {
          a(paramjw, localException, paramCollection, i);
        }
        continue;
        label85: i++;
      }
    }
  }

  private void c(Collection<String> paramCollection, hf paramhf, jw paramjw)
  {
    jk localjk = this.a;
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str == null)
        try
        {
          paramjw.a(paramhf);
        }
        catch (Exception localException)
        {
          a(paramjw, localException, paramCollection, 0);
        }
      else
        localjk.a(str, paramhf, paramjw);
    }
  }

  public void a(jw paramjw)
  {
    jk localjk = paramjw.a(String.class, this.b);
    if (!a(localjk))
      this.a = localjk;
  }

  public void a(Collection<String> paramCollection, hf paramhf, jw paramjw)
  {
    paramhf.b();
    if (this.a == null)
      b(paramCollection, paramhf, paramjw);
    while (true)
    {
      paramhf.c();
      return;
      c(paramCollection, paramhf, paramjw);
    }
  }

  public void a(Collection<String> paramCollection, hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.c(paramCollection, paramhf);
    if (this.a == null)
      b(paramCollection, paramhf, paramjw);
    while (true)
    {
      paramjz.f(paramCollection, paramhf);
      return;
      c(paramCollection, paramhf, paramjw);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qd
 * JD-Core Version:    0.6.2
 */