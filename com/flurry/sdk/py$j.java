package com.flurry.sdk;

@kb
public final class py$j extends py.a<String[]>
  implements jt
{
  protected jk<Object> a;

  public py$j(is paramis)
  {
    super([Ljava.lang.String.class, null, paramis);
  }

  private void a(String[] paramArrayOfString, hf paramhf, jw paramjw, jk<Object> paramjk)
  {
    int i = 0;
    int j = paramArrayOfString.length;
    if (i < j)
    {
      if (paramArrayOfString[i] == null)
        paramjw.a(paramhf);
      while (true)
      {
        i++;
        break;
        paramjk.a(paramArrayOfString[i], paramhf, paramjw);
      }
    }
  }

  public final pf<?> a(jz paramjz)
  {
    return this;
  }

  public final void a(jw paramjw)
  {
    jk localjk = paramjw.a(String.class, this.f);
    if ((localjk != null) && (localjk.getClass().getAnnotation(kb.class) == null))
      this.a = localjk;
  }

  public final void a(String[] paramArrayOfString, hf paramhf, jw paramjw)
  {
    int i = paramArrayOfString.length;
    if (i == 0)
      return;
    if (this.a != null)
    {
      a(paramArrayOfString, paramhf, paramjw, this.a);
      return;
    }
    int j = 0;
    label32: if (j < i)
    {
      if (paramArrayOfString[j] != null)
        break label56;
      paramhf.f();
    }
    while (true)
    {
      j++;
      break label32;
      break;
      label56: paramhf.b(paramArrayOfString[j]);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.py.j
 * JD-Core Version:    0.6.2
 */