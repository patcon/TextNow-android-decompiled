package com.flurry.sdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

public class op
{
  protected final ju a;
  protected final mw b;
  protected final kg.a c;
  protected final iq d;
  protected Object e;

  public op(ju paramju, mw parammw)
  {
    this.a = paramju;
    this.b = parammw;
    this.c = parammw.a(paramju.g());
    this.d = this.a.a();
  }

  protected oi a(String paramString, sh paramsh, jk<Object> paramjk, jz paramjz1, jz paramjz2, mq parammq, boolean paramBoolean)
  {
    Method localMethod;
    if ((parammq instanceof mp))
      localMethod = null;
    sh localsh1;
    for (Field localField = ((mp)parammq).e(); ; localField = null)
    {
      localsh1 = a(parammq, paramBoolean, paramsh);
      if (paramjz2 == null)
        break label386;
      if (localsh1 == null)
        localsh1 = paramsh;
      if (localsh1.g() != null)
        break;
      throw new IllegalStateException("Problem trying to create BeanPropertyWriter for property '" + paramString + "' (of type " + this.b.a() + "); serialization type " + localsh1 + " has no content");
      localMethod = ((mr)parammq).e();
    }
    sh localsh2 = localsh1.e(paramjz2);
    localsh2.g();
    while (true)
    {
      kg.a locala = this.d.a(parammq, this.c);
      boolean bool1 = false;
      Object localObject = null;
      int i;
      if (locala != null)
      {
        i = 1.a[locala.ordinal()];
        localObject = null;
        bool1 = false;
      }
      boolean bool2;
      switch (i)
      {
      default:
        bool2 = bool1;
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        oi localoi = new oi(parammq, this.b.i(), paramString, paramsh, paramjk, paramjz1, localsh2, localMethod, localField, bool2, localObject);
        Boolean localBoolean = this.d.b(parammq);
        if ((localBoolean != null) && (localBoolean.booleanValue()))
          localoi = localoi.c();
        return localoi;
        localObject = a(paramString, localMethod, localField);
        if (localObject == null)
        {
          bool2 = true;
        }
        else
        {
          boolean bool4 = localObject.getClass().isArray();
          bool1 = false;
          if (!bool4)
            break;
          localObject = qz.a(localObject);
          bool2 = false;
          continue;
          localObject = b(paramString, paramsh);
          bool2 = true;
          continue;
          bool1 = true;
          boolean bool3 = paramsh.f();
          localObject = null;
          if (!bool3)
            break;
          localObject = a(paramString, paramsh);
          bool2 = bool1;
        }
      }
      label386: localsh2 = localsh1;
    }
  }

  public qv a()
  {
    return this.b.i();
  }

  protected sh a(mm parammm, boolean paramBoolean, sh paramsh)
  {
    boolean bool1 = true;
    Class localClass1 = this.d.e(parammm);
    Class localClass2;
    Object localObject;
    if (localClass1 != null)
    {
      localClass2 = paramsh.p();
      if (localClass1.isAssignableFrom(localClass2))
      {
        localObject = paramsh.h(localClass1);
        paramBoolean = bool1;
      }
    }
    while (true)
    {
      sh localsh = ol.b(this.a, parammm, (sh)localObject);
      if (localsh != localObject)
        localObject = localsh;
      for (boolean bool2 = bool1; ; bool2 = paramBoolean)
      {
        if (!bool2)
        {
          kg.b localb = this.d.f(parammm);
          if (localb != null)
            if (localb != kg.b.b);
        }
        while (true)
        {
          if (bool1)
          {
            return localObject;
            if (!localClass2.isAssignableFrom(localClass1))
              throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + parammm.b() + "': class " + localClass1.getName() + " not a super-type of (declared) class " + localClass2.getName());
            localObject = this.a.a(paramsh, localClass1);
            break;
            bool1 = false;
            continue;
          }
          return null;
          bool1 = bool2;
        }
      }
      localObject = paramsh;
    }
  }

  protected Object a(Exception paramException, String paramString, Object paramObject)
  {
    for (Object localObject = paramException; ((Throwable)localObject).getCause() != null; localObject = ((Throwable)localObject).getCause());
    if ((localObject instanceof Error))
      throw ((Error)localObject);
    if ((localObject instanceof RuntimeException))
      throw ((RuntimeException)localObject);
    throw new IllegalArgumentException("Failed to get property '" + paramString + "' of default " + paramObject.getClass().getName() + " instance");
  }

  protected Object a(String paramString, sh paramsh)
  {
    if (!this.a.a(ju.a.w))
    {
      if (paramsh.b())
        return new op.a();
      if (Collection.class.isAssignableFrom(paramsh.p()))
        return new op.b();
    }
    return null;
  }

  protected Object a(String paramString, Method paramMethod, Field paramField)
  {
    Object localObject1 = b();
    if (paramMethod != null);
    try
    {
      return paramMethod.invoke(localObject1, new Object[0]);
      Object localObject2 = paramField.get(localObject1);
      return localObject2;
    }
    catch (Exception localException)
    {
      return a(localException, paramString, localObject1);
    }
  }

  protected Object b()
  {
    if (this.e == null)
    {
      this.e = this.b.a(this.a.a(ju.a.e));
      if (this.e == null)
      {
        Class localClass = this.b.c().e();
        throw new IllegalArgumentException("Class " + localClass.getName() + " has no default constructor; can not instantiate default bean value to support 'properties=JsonSerialize.Inclusion.NON_DEFAULT' annotation");
      }
    }
    return this.e;
  }

  protected Object b(String paramString, sh paramsh)
  {
    Class localClass = paramsh.p();
    if (localClass == String.class)
      return new op.d();
    if (paramsh.b())
      return new op.a();
    if (Collection.class.isAssignableFrom(localClass))
      return new op.b();
    if (Map.class.isAssignableFrom(localClass))
      return new op.c();
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.op
 * JD-Core Version:    0.6.2
 */