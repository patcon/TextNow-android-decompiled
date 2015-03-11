package com.admarvel.android.util.a;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class c$a
{
  private final Object a;
  private final String b;
  private Class<?> c;
  private List<Class<?>> d;
  private List<Object> e;
  private boolean f;
  private boolean g;

  public c$a(Object paramObject, String paramString)
  {
    this.a = paramObject;
    this.b = paramString;
    this.d = new ArrayList();
    this.e = new ArrayList();
    if (paramObject != null);
    for (Class localClass = paramObject.getClass(); ; localClass = null)
    {
      this.c = localClass;
      return;
    }
  }

  public a a(Class<?> paramClass)
  {
    this.g = true;
    this.c = paramClass;
    return this;
  }

  public <T> a a(Class<T> paramClass, T paramT)
  {
    this.d.add(paramClass);
    this.e.add(paramT);
    return this;
  }

  public Object a()
  {
    Class[] arrayOfClass1 = new Class[this.d.size()];
    Class[] arrayOfClass2 = (Class[])this.d.toArray(arrayOfClass1);
    Method localMethod = c.a(this.c, this.b, arrayOfClass2);
    if (this.f)
      localMethod.setAccessible(true);
    Object[] arrayOfObject = this.e.toArray();
    if (this.g)
      return localMethod.invoke(null, arrayOfObject);
    return localMethod.invoke(this.a, arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.a.c.a
 * JD-Core Version:    0.6.2
 */