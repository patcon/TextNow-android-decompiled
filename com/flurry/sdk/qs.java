package com.flurry.sdk;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class qs
{

  @Deprecated
  public static final qs a = new qs();
  private static final sh[] f = new sh[0];
  protected final qt[] b = null;
  protected final qu c = new qu(this);
  protected qm d;
  protected qm e;

  public static qs a()
  {
    return a;
  }

  public static sh a(String paramString)
  {
    return a.b(paramString);
  }

  public static sh b()
  {
    return a().c();
  }

  private sh b(Class<?> paramClass)
  {
    sh[] arrayOfsh = a(paramClass, Map.class);
    if (arrayOfsh == null)
      return qo.a(paramClass, c(), c());
    if (arrayOfsh.length != 2)
      throw new IllegalArgumentException("Strange Map type " + paramClass.getName() + ": can not determine type parameters");
    return qo.a(paramClass, arrayOfsh[0], arrayOfsh[1]);
  }

  private sh c(Class<?> paramClass)
  {
    sh[] arrayOfsh = a(paramClass, Collection.class);
    if (arrayOfsh == null)
      return ql.a(paramClass, c());
    if (arrayOfsh.length != 1)
      throw new IllegalArgumentException("Strange Collection type " + paramClass.getName() + ": can not determine type parameters");
    return ql.a(paramClass, arrayOfsh[0]);
  }

  protected final qm a(qm paramqm)
  {
    try
    {
      if (this.d == null)
      {
        qm localqm2 = paramqm.a();
        a(localqm2, Map.class);
        this.d = localqm2.b();
      }
      qm localqm1 = this.d.a();
      paramqm.a(localqm1);
      localqm1.b(paramqm);
      return paramqm;
    }
    finally
    {
    }
  }

  protected final qm a(qm paramqm, Class<?> paramClass)
  {
    Class localClass = paramqm.e();
    Type[] arrayOfType = localClass.getGenericInterfaces();
    if (arrayOfType != null)
    {
      int i = arrayOfType.length;
      for (int j = 0; j < i; j++)
      {
        qm localqm2 = b(arrayOfType[j], paramClass);
        if (localqm2 != null)
        {
          localqm2.b(paramqm);
          paramqm.a(localqm2);
          return paramqm;
        }
      }
    }
    Type localType = localClass.getGenericSuperclass();
    if (localType != null)
    {
      qm localqm1 = b(localType, paramClass);
      if (localqm1 != null)
      {
        localqm1.b(paramqm);
        paramqm.a(localqm1);
        return paramqm;
      }
    }
    return null;
  }

  protected final qm a(Type paramType, Class<?> paramClass)
  {
    qm localqm1 = new qm(paramType);
    Class localClass = localqm1.e();
    if (localClass == paramClass)
      return localqm1;
    Type localType = localClass.getGenericSuperclass();
    if (localType != null)
    {
      qm localqm2 = a(localType, paramClass);
      if (localqm2 != null)
      {
        localqm2.b(localqm1);
        localqm1.a(localqm2);
        return localqm1;
      }
    }
    return null;
  }

  public final qo a(Class<? extends Map> paramClass, Class<?> paramClass1, Class<?> paramClass2)
  {
    return qo.a(paramClass, a(paramClass1), a(paramClass2));
  }

  public final sh a(sh paramsh, Class<?> paramClass)
  {
    if (((paramsh instanceof qp)) && ((paramClass.isArray()) || (Map.class.isAssignableFrom(paramClass)) || (Collection.class.isAssignableFrom(paramClass))))
    {
      if (!paramsh.p().isAssignableFrom(paramClass))
        throw new IllegalArgumentException("Class " + paramClass.getClass().getName() + " not subtype of " + paramsh);
      sh localsh = a(paramClass, new qr(this, paramsh.p()));
      Object localObject1 = paramsh.n();
      if (localObject1 != null)
        localsh = localsh.d(localObject1);
      Object localObject2 = paramsh.o();
      if (localObject2 != null)
        localsh = localsh.f(localObject2);
      return localsh;
    }
    return paramsh.f(paramClass);
  }

  public final sh a(Class<?> paramClass)
  {
    return new qp(paramClass);
  }

  protected final sh a(Class<?> paramClass, qr paramqr)
  {
    if (paramClass.isArray())
      return qi.a(b(paramClass.getComponentType(), null), null, null);
    if (paramClass.isEnum())
      return new qp(paramClass);
    if (Map.class.isAssignableFrom(paramClass))
      return b(paramClass);
    if (Collection.class.isAssignableFrom(paramClass))
      return c(paramClass);
    return new qp(paramClass);
  }

  protected final sh a(Class<?> paramClass, List<sh> paramList)
  {
    if (paramClass.isArray())
      return qi.a(b(paramClass.getComponentType(), null), null, null);
    if (paramClass.isEnum())
      return new qp(paramClass);
    if (Map.class.isAssignableFrom(paramClass))
    {
      if (paramList.size() > 0)
      {
        sh localsh1 = (sh)paramList.get(0);
        if (paramList.size() >= 2);
        for (sh localsh2 = (sh)paramList.get(1); ; localsh2 = c())
          return qo.a(paramClass, localsh1, localsh2);
      }
      return b(paramClass);
    }
    if (Collection.class.isAssignableFrom(paramClass))
    {
      if (paramList.size() > 0)
        return ql.a(paramClass, (sh)paramList.get(0));
      return c(paramClass);
    }
    if (paramList.size() == 0)
      return new qp(paramClass);
    return a(paramClass, (sh[])paramList.toArray(new sh[paramList.size()]));
  }

  public final sh a(Class<?> paramClass, sh[] paramArrayOfsh)
  {
    TypeVariable[] arrayOfTypeVariable = paramClass.getTypeParameters();
    if (arrayOfTypeVariable.length != paramArrayOfsh.length)
      throw new IllegalArgumentException("Parameter type mismatch for " + paramClass.getName() + ": expected " + arrayOfTypeVariable.length + " parameters, was given " + paramArrayOfsh.length);
    String[] arrayOfString = new String[arrayOfTypeVariable.length];
    int i = 0;
    int j = arrayOfTypeVariable.length;
    while (i < j)
    {
      arrayOfString[i] = arrayOfTypeVariable[i].getName();
      i++;
    }
    return new qp(paramClass, arrayOfString, paramArrayOfsh, null, null);
  }

  protected final sh a(GenericArrayType paramGenericArrayType, qr paramqr)
  {
    return qi.a(b(paramGenericArrayType.getGenericComponentType(), paramqr), null, null);
  }

  protected final sh a(ParameterizedType paramParameterizedType, qr paramqr)
  {
    Class localClass = (Class)paramParameterizedType.getRawType();
    Type[] arrayOfType = paramParameterizedType.getActualTypeArguments();
    int i;
    sh[] arrayOfsh1;
    if (arrayOfType == null)
    {
      i = 0;
      if (i != 0)
        break label124;
      arrayOfsh1 = f;
    }
    while (true)
      if (Map.class.isAssignableFrom(localClass))
      {
        sh[] arrayOfsh3 = b(a(localClass, arrayOfsh1), Map.class);
        if (arrayOfsh3.length != 2)
        {
          throw new IllegalArgumentException("Could not find 2 type parameters for Map class " + localClass.getName() + " (found " + arrayOfsh3.length + ")");
          i = arrayOfType.length;
          break;
          label124: arrayOfsh1 = new sh[i];
          for (int j = 0; j < i; j++)
            arrayOfsh1[j] = b(arrayOfType[j], paramqr);
          continue;
        }
        return qo.a(localClass, arrayOfsh3[0], arrayOfsh3[1]);
      }
    if (Collection.class.isAssignableFrom(localClass))
    {
      sh[] arrayOfsh2 = b(a(localClass, arrayOfsh1), Collection.class);
      if (arrayOfsh2.length != 1)
        throw new IllegalArgumentException("Could not find 1 type parameter for Collection class " + localClass.getName() + " (found " + arrayOfsh2.length + ")");
      return ql.a(localClass, arrayOfsh2[0]);
    }
    if (i == 0)
      return new qp(localClass);
    return a(localClass, arrayOfsh1);
  }

  public final sh a(Type paramType)
  {
    return b(paramType, null);
  }

  public final sh a(Type paramType, qr paramqr)
  {
    return b(paramType, paramqr);
  }

  protected final sh a(TypeVariable<?> paramTypeVariable, qr paramqr)
  {
    sh localsh;
    if (paramqr == null)
      localsh = c();
    String str;
    do
    {
      return localsh;
      str = paramTypeVariable.getName();
      localsh = paramqr.a(str);
    }
    while (localsh != null);
    Type[] arrayOfType = paramTypeVariable.getBounds();
    paramqr.b(str);
    return b(arrayOfType[0], paramqr);
  }

  protected final sh a(WildcardType paramWildcardType, qr paramqr)
  {
    return b(paramWildcardType.getUpperBounds()[0], paramqr);
  }

  public final sh[] a(Class<?> paramClass1, Class<?> paramClass2)
  {
    return a(paramClass1, paramClass2, new qr(this, paramClass1));
  }

  public final sh[] a(Class<?> paramClass1, Class<?> paramClass2, qr paramqr)
  {
    Object localObject = c(paramClass1, paramClass2);
    if (localObject == null)
      throw new IllegalArgumentException("Class " + paramClass1.getName() + " is not a subtype of " + paramClass2.getName());
    while (true)
    {
      paramqr = localqr;
      localObject = localqm;
      if (((qm)localObject).b() == null)
        break;
      qm localqm = ((qm)localObject).b();
      Class localClass = localqm.e();
      qr localqr = new qr(this, localClass);
      if (localqm.c())
      {
        Type[] arrayOfType = localqm.d().getActualTypeArguments();
        TypeVariable[] arrayOfTypeVariable = localClass.getTypeParameters();
        int i = arrayOfType.length;
        for (int j = 0; j < i; j++)
          localqr.a(arrayOfTypeVariable[j].getName(), a.b(arrayOfType[j], paramqr));
      }
    }
    if (!((qm)localObject).c())
      return null;
    return paramqr.b();
  }

  public final ql b(Class<? extends Collection> paramClass, Class<?> paramClass1)
  {
    return ql.a(paramClass, a(paramClass1));
  }

  protected final qm b(qm paramqm)
  {
    try
    {
      if (this.e == null)
      {
        qm localqm2 = paramqm.a();
        a(localqm2, List.class);
        this.e = localqm2.b();
      }
      qm localqm1 = this.e.a();
      paramqm.a(localqm1);
      localqm1.b(paramqm);
      return paramqm;
    }
    finally
    {
    }
  }

  protected final qm b(Type paramType, Class<?> paramClass)
  {
    qm localqm = new qm(paramType);
    Class localClass = localqm.e();
    if (localClass == paramClass)
      return new qm(paramType);
    if ((localClass == HashMap.class) && (paramClass == Map.class))
      return a(localqm);
    if ((localClass == ArrayList.class) && (paramClass == List.class))
      return b(localqm);
    return a(localqm, paramClass);
  }

  public final sh b(String paramString)
  {
    return this.c.a(paramString);
  }

  public final sh b(Type paramType, qr paramqr)
  {
    Object localObject;
    if ((paramType instanceof Class))
    {
      Class localClass = (Class)paramType;
      if (paramqr == null)
        paramqr = new qr(this, localClass);
      localObject = a(localClass, paramqr);
    }
    while ((this.b != null) && (!((sh)localObject).f()))
    {
      qt[] arrayOfqt = this.b;
      int i = arrayOfqt.length;
      int j = 0;
      while (true)
        if (j < i)
        {
          sh localsh = arrayOfqt[j].a((sh)localObject, paramType, paramqr, this);
          j++;
          localObject = localsh;
          continue;
          if ((paramType instanceof ParameterizedType))
          {
            localObject = a((ParameterizedType)paramType, paramqr);
            break;
          }
          if ((paramType instanceof GenericArrayType))
          {
            localObject = a((GenericArrayType)paramType, paramqr);
            break;
          }
          if ((paramType instanceof TypeVariable))
          {
            localObject = a((TypeVariable)paramType, paramqr);
            break;
          }
          if ((paramType instanceof WildcardType))
          {
            localObject = a((WildcardType)paramType, paramqr);
            break;
          }
          throw new IllegalArgumentException("Unrecognized Type: " + paramType.toString());
        }
    }
    return localObject;
  }

  public final sh[] b(sh paramsh, Class<?> paramClass)
  {
    Class localClass = paramsh.p();
    if (localClass == paramClass)
    {
      int i = paramsh.h();
      sh[] arrayOfsh;
      if (i == 0)
        arrayOfsh = null;
      while (true)
      {
        return arrayOfsh;
        arrayOfsh = new sh[i];
        for (int j = 0; j < i; j++)
          arrayOfsh[j] = paramsh.b(j);
      }
    }
    return a(localClass, paramClass, new qr(this, paramsh));
  }

  protected final qm c(Class<?> paramClass1, Class<?> paramClass2)
  {
    if (paramClass2.isInterface())
      return b(paramClass1, paramClass2);
    return a(paramClass1, paramClass2);
  }

  protected final sh c()
  {
    return new qp(Object.class);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qs
 * JD-Core Version:    0.6.2
 */