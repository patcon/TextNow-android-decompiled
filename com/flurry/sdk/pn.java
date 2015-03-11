package com.flurry.sdk;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@kb
public class pn extends pw<Object>
  implements jt
{
  protected final Method a;
  protected jk<Object> b;
  protected final is c;
  protected boolean d;

  public pn(Method paramMethod, jk<Object> paramjk, is paramis)
  {
    super(Object.class);
    this.a = paramMethod;
    this.b = paramjk;
    this.c = paramis;
  }

  public void a(jw paramjw)
  {
    if ((this.b == null) && ((paramjw.a(ju.a.h)) || (Modifier.isFinal(this.a.getReturnType().getModifiers()))))
    {
      sh localsh = paramjw.a(this.a.getGenericReturnType());
      this.b = paramjw.a(localsh, false, this.c);
      this.d = a(localsh, this.b);
    }
  }

  public void a(Object paramObject, hf paramhf, jw paramjw)
  {
    try
    {
      Object localObject = this.a.invoke(paramObject, new Object[0]);
      if (localObject == null)
      {
        paramjw.a(paramhf);
        return;
      }
      jk localjk = this.b;
      if (localjk == null)
        localjk = paramjw.a(localObject.getClass(), true, this.c);
      localjk.a(localObject, paramhf, paramjw);
      return;
    }
    catch (IOException localIOException)
    {
      throw localIOException;
      Throwable localThrowable;
      while (((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null))
        localThrowable = localThrowable.getCause();
      if ((localThrowable instanceof Error))
        throw ((Error)localThrowable);
      throw jh.a(localThrowable, paramObject, this.a.getName() + "()");
    }
    catch (Exception localException)
    {
      label67: break label67;
    }
  }

  public void a(Object paramObject, hf paramhf, jw paramjw, jz paramjz)
  {
    try
    {
      localObject = this.a.invoke(paramObject, new Object[0]);
      if (localObject == null)
      {
        paramjw.a(paramhf);
        return;
      }
      jk localjk = this.b;
      if (localjk != null)
      {
        if (this.d)
          paramjz.a(paramObject, paramhf);
        localjk.a(localObject, paramhf, paramjw, paramjz);
        if (!this.d)
          return;
        paramjz.d(paramObject, paramhf);
      }
    }
    catch (IOException localIOException)
    {
      Object localObject;
      throw localIOException;
      paramjw.a(localObject.getClass(), true, this.c).a(localObject, paramhf, paramjw);
      return;
    }
    catch (Exception localException)
    {
      Throwable localThrowable;
      while (((localException instanceof InvocationTargetException)) && (localException.getCause() != null))
        localThrowable = localException.getCause();
      if ((localThrowable instanceof Error))
        throw ((Error)localThrowable);
      throw jh.a(localThrowable, paramObject, this.a.getName() + "()");
    }
  }

  protected boolean a(sh paramsh, jk<?> paramjk)
  {
    Class localClass = paramsh.p();
    if (paramsh.t())
      if ((localClass == Integer.TYPE) || (localClass == Boolean.TYPE) || (localClass == Double.TYPE))
        break label59;
    label59: 
    while (paramjk.getClass().getAnnotation(kb.class) == null)
      do
        return false;
      while ((localClass != String.class) && (localClass != Integer.class) && (localClass != Boolean.class) && (localClass != Double.class));
    return true;
  }

  public String toString()
  {
    return "(@JsonValue serializer for method " + this.a.getDeclaringClass() + "#" + this.a.getName() + ")";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pn
 * JD-Core Version:    0.6.2
 */