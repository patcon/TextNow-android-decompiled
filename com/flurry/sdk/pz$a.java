package com.flurry.sdk;

import java.util.List;

@kb
public class pz$a extends pb<List<?>>
{
  public pz$a(sh paramsh, boolean paramBoolean, jz paramjz, is paramis, jk<Object> paramjk)
  {
    super(List.class, paramsh, paramBoolean, paramjz, paramis, paramjk);
  }

  public pf<?> a(jz paramjz)
  {
    return new a(this.b, this.a, paramjz, this.e, this.d);
  }

  public void a(List<?> paramList, hf paramhf, jw paramjw)
  {
    if (this.d != null)
      a(paramList, paramhf, paramjw, this.d);
    int i;
    do
    {
      return;
      if (this.c != null)
      {
        b(paramList, paramhf, paramjw);
        return;
      }
      i = paramList.size();
    }
    while (i == 0);
    for (int j = 0; ; j++)
      while (true)
      {
        Object localObject1;
        Class localClass;
        try
        {
          localObject1 = this.f;
          if (j >= i)
            break;
          Object localObject2 = paramList.get(j);
          if (localObject2 == null)
          {
            paramjw.a(paramhf);
          }
          else
          {
            localClass = localObject2.getClass();
            Object localObject3 = ((ov)localObject1).a(localClass);
            if (localObject3 == null)
            {
              if (this.b.e())
              {
                localObject4 = a((ov)localObject1, paramjw.a(this.b, localClass), paramjw);
                ov localov = this.f;
                Object localObject5 = localObject4;
                localObject1 = localov;
                localObject3 = localObject5;
              }
            }
            else
              ((jk)localObject3).a(localObject2, paramhf, paramjw);
          }
        }
        catch (Exception localException)
        {
          a(paramjw, localException, paramList, j);
          return;
        }
        jk localjk = a((ov)localObject1, localClass, paramjw);
        Object localObject4 = localjk;
      }
  }

  public void a(List<?> paramList, hf paramhf, jw paramjw, jk<Object> paramjk)
  {
    int i = paramList.size();
    if (i == 0);
    while (true)
    {
      return;
      jz localjz = this.c;
      for (int j = 0; j < i; j++)
      {
        Object localObject = paramList.get(j);
        if (localObject == null);
        try
        {
          paramjw.a(paramhf);
          continue;
          if (localjz == null)
            paramjk.a(localObject, paramhf, paramjw);
        }
        catch (Exception localException)
        {
          a(paramjw, localException, paramList, j);
        }
        paramjk.a(localObject, paramhf, paramjw, localjz);
      }
    }
  }

  public void b(List<?> paramList, hf paramhf, jw paramjw)
  {
    int i = paramList.size();
    if (i == 0)
      return;
    for (int j = 0; ; j++)
      while (true)
      {
        Object localObject1;
        Class localClass;
        try
        {
          jz localjz = this.c;
          localObject1 = this.f;
          if (j >= i)
            break;
          Object localObject2 = paramList.get(j);
          if (localObject2 == null)
          {
            paramjw.a(paramhf);
          }
          else
          {
            localClass = localObject2.getClass();
            Object localObject3 = ((ov)localObject1).a(localClass);
            if (localObject3 == null)
            {
              if (this.b.e())
              {
                localObject4 = a((ov)localObject1, paramjw.a(this.b, localClass), paramjw);
                ov localov = this.f;
                Object localObject5 = localObject4;
                localObject1 = localov;
                localObject3 = localObject5;
              }
            }
            else
              ((jk)localObject3).a(localObject2, paramhf, paramjw, localjz);
          }
        }
        catch (Exception localException)
        {
          a(paramjw, localException, paramList, j);
          return;
        }
        jk localjk = a((ov)localObject1, localClass, paramjw);
        Object localObject4 = localjk;
      }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pz.a
 * JD-Core Version:    0.6.2
 */