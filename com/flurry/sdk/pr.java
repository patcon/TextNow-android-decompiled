package com.flurry.sdk;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@kb
public class pr extends py.a<Object[]>
  implements jt
{
  protected final boolean a;
  protected final sh b;
  protected jk<Object> c;
  protected ov d;

  public pr(sh paramsh, boolean paramBoolean, jz paramjz, is paramis, jk<Object> paramjk)
  {
    super([Ljava.lang.Object.class, paramjz, paramis);
    this.b = paramsh;
    this.a = paramBoolean;
    this.d = ov.a();
    this.c = paramjk;
  }

  protected final jk<Object> a(ov paramov, sh paramsh, jw paramjw)
  {
    ov.d locald = paramov.a(paramsh, paramjw, this.f);
    if (paramov != locald.b)
      this.d = locald.b;
    return locald.a;
  }

  protected final jk<Object> a(ov paramov, Class<?> paramClass, jw paramjw)
  {
    ov.d locald = paramov.a(paramClass, paramjw, this.f);
    if (paramov != locald.b)
      this.d = locald.b;
    return locald.a;
  }

  public pf<?> a(jz paramjz)
  {
    return new pr(this.b, this.a, paramjz, this.f, this.c);
  }

  public void a(jw paramjw)
  {
    if ((this.a) && (this.c == null))
      this.c = paramjw.a(this.b, this.f);
  }

  public void a(Object[] paramArrayOfObject, hf paramhf, jw paramjw)
  {
    int i = paramArrayOfObject.length;
    if (i == 0)
      return;
    if (this.c != null)
    {
      a(paramArrayOfObject, paramhf, paramjw, this.c);
      return;
    }
    if (this.e != null)
    {
      b(paramArrayOfObject, paramhf, paramjw);
      return;
    }
    int j = 0;
    Object localObject1 = null;
    while (true)
    {
      try
      {
        localov = this.d;
        if (j >= i)
          break;
        localObject1 = paramArrayOfObject[j];
        if (localObject1 == null)
        {
          paramjw.a(paramhf);
        }
        else
        {
          localClass = localObject1.getClass();
          localObject2 = localov.a(localClass);
          if (localObject2 == null)
          {
            if (this.b.e())
              localObject2 = a(localov, paramjw.a(this.b, localClass), paramjw);
          }
          else
            ((jk)localObject2).a(localObject1, paramhf, paramjw);
        }
      }
      catch (IOException localIOException)
      {
        ov localov;
        Class localClass;
        throw localIOException;
        jk localjk = a(localov, localClass, paramjw);
        Object localObject2 = localjk;
        continue;
        Throwable localThrowable;
        if (((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null))
        {
          localThrowable = localThrowable.getCause();
          continue;
        }
        if ((localThrowable instanceof Error))
          throw ((Error)localThrowable);
        throw jh.a(localThrowable, localObject1, j);
      }
      catch (Exception localException)
      {
        continue;
      }
      j++;
    }
  }

  public void a(Object[] paramArrayOfObject, hf paramhf, jw paramjw, jk<Object> paramjk)
  {
    int i = paramArrayOfObject.length;
    jz localjz = this.e;
    Object localObject = null;
    for (int j = 0; ; j++)
      if (j < i)
        try
        {
          localObject = paramArrayOfObject[j];
          if (localObject == null)
            paramjw.a(paramhf);
          else if (localjz == null)
            paramjk.a(localObject, paramhf, paramjw);
        }
        catch (IOException localIOException)
        {
          throw localIOException;
          paramjk.a(localObject, paramhf, paramjw, localjz);
        }
        catch (Exception localException)
        {
          Throwable localThrowable;
          while (((localException instanceof InvocationTargetException)) && (localException.getCause() != null))
            localThrowable = localException.getCause();
          if ((localThrowable instanceof Error))
            throw ((Error)localThrowable);
          throw jh.a(localThrowable, localObject, j);
        }
      else
        return;
  }

  public void b(Object[] paramArrayOfObject, hf paramhf, jw paramjw)
  {
    int i = paramArrayOfObject.length;
    jz localjz = this.e;
    int j = 0;
    Object localObject = null;
    while (true)
    {
      try
      {
        ov localov = this.d;
        if (j < i)
        {
          localObject = paramArrayOfObject[j];
          if (localObject == null)
          {
            paramjw.a(paramhf);
          }
          else
          {
            Class localClass = localObject.getClass();
            jk localjk = localov.a(localClass);
            if (localjk == null)
              localjk = a(localov, localClass, paramjw);
            localjk.a(localObject, paramhf, paramjw, localjz);
          }
        }
      }
      catch (IOException localIOException)
      {
        throw localIOException;
        Throwable localThrowable;
        if (((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null))
        {
          localThrowable = localThrowable.getCause();
          continue;
        }
        if ((localThrowable instanceof Error))
          throw ((Error)localThrowable);
        throw jh.a(localThrowable, localObject, j);
        return;
      }
      catch (Exception localException)
      {
        continue;
      }
      j++;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pr
 * JD-Core Version:    0.6.2
 */