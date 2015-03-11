package com.flurry.sdk;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class pw<T> extends jk<T>
{
  protected final Class<T> k;

  protected pw(sh paramsh)
  {
    this.k = paramsh.p();
  }

  protected pw(Class<T> paramClass)
  {
    this.k = paramClass;
  }

  protected pw(Class<?> paramClass, boolean paramBoolean)
  {
    this.k = paramClass;
  }

  public void a(jw paramjw, Throwable paramThrowable, Object paramObject, int paramInt)
  {
    for (Throwable localThrowable = paramThrowable; ((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null); localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof Error))
      throw ((Error)localThrowable);
    if ((paramjw == null) || (paramjw.a(ju.a.n)));
    for (int i = 1; (localThrowable instanceof IOException); i = 0)
    {
      if ((i != 0) && ((localThrowable instanceof jh)))
        break label112;
      throw ((IOException)localThrowable);
    }
    if ((i == 0) && ((localThrowable instanceof RuntimeException)))
      throw ((RuntimeException)localThrowable);
    label112: throw jh.a(localThrowable, paramObject, paramInt);
  }

  public void a(jw paramjw, Throwable paramThrowable, Object paramObject, String paramString)
  {
    for (Throwable localThrowable = paramThrowable; ((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null); localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof Error))
      throw ((Error)localThrowable);
    if ((paramjw == null) || (paramjw.a(ju.a.n)));
    for (int i = 1; (localThrowable instanceof IOException); i = 0)
    {
      if ((i != 0) && ((localThrowable instanceof jh)))
        break label112;
      throw ((IOException)localThrowable);
    }
    if ((i == 0) && ((localThrowable instanceof RuntimeException)))
      throw ((RuntimeException)localThrowable);
    label112: throw jh.a(localThrowable, paramObject, paramString);
  }

  public abstract void a(T paramT, hf paramhf, jw paramjw);

  protected boolean a(jk<?> paramjk)
  {
    return (paramjk != null) && (paramjk.getClass().getAnnotation(kb.class) != null);
  }

  public final Class<T> c()
  {
    return this.k;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pw
 * JD-Core Version:    0.6.2
 */