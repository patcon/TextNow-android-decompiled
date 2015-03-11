package com.flurry.sdk;

import java.util.List;

@kb
public final class pk extends px<List<String>>
  implements jt
{
  protected jk<String> a;

  public pk(is paramis)
  {
    super(List.class, paramis);
  }

  private final void b(List<String> paramList, hf paramhf, jw paramjw)
  {
    for (int i = 0; ; i++)
    {
      try
      {
        int j = paramList.size();
        if (i < j)
        {
          String str = (String)paramList.get(i);
          if (str == null)
            paramjw.a(paramhf);
          else
            paramhf.b(str);
        }
      }
      catch (Exception localException)
      {
        a(paramjw, localException, paramList, i);
      }
      return;
    }
  }

  private final void c(List<String> paramList, hf paramhf, jw paramjw)
  {
    for (int i = 0; ; i++)
    {
      try
      {
        int j = paramList.size();
        jk localjk = this.a;
        if (i < j)
        {
          String str = (String)paramList.get(i);
          if (str == null)
            paramjw.a(paramhf);
          else
            localjk.a(str, paramhf, paramjw);
        }
      }
      catch (Exception localException)
      {
        a(paramjw, localException, paramList, i);
      }
      return;
    }
  }

  public final void a(jw paramjw)
  {
    jk localjk = paramjw.a(String.class, this.b);
    if (!a(localjk))
      this.a = localjk;
  }

  public final void a(List<String> paramList, hf paramhf, jw paramjw)
  {
    paramhf.b();
    if (this.a == null)
      b(paramList, paramhf, paramjw);
    while (true)
    {
      paramhf.c();
      return;
      c(paramList, paramhf, paramjw);
    }
  }

  public final void a(List<String> paramList, hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.c(paramList, paramhf);
    if (this.a == null)
      b(paramList, paramhf, paramjw);
    while (true)
    {
      paramjz.f(paramList, paramhf);
      return;
      c(paramList, paramhf, paramjw);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pk
 * JD-Core Version:    0.6.2
 */