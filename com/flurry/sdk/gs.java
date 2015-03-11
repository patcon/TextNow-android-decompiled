package com.flurry.sdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class gs extends ft
{
  private static final gs a = new gs();
  private static final Class<?>[] c = new Class[0];
  private static final Class<?>[] d = { fn.class };
  private static final Map<Class, Constructor> e = new ConcurrentHashMap();
  private static final Class g = new Object()
  {
  }
  .getClass();
  private static final fn h = fn.a(fn.v.n);
  private final ClassLoader b;
  private Map<String, Class> f = new ConcurrentHashMap();
  private final WeakHashMap<Type, fn> i = new WeakHashMap();

  protected gs()
  {
    this(gs.class.getClassLoader());
  }

  public gs(ClassLoader paramClassLoader)
  {
    this.b = paramClassLoader;
  }

  public static Object a(Class paramClass, fn paramfn)
  {
    boolean bool = gs.a.class.isAssignableFrom(paramClass);
    try
    {
      Constructor localConstructor1 = (Constructor)e.get(paramClass);
      Class[] arrayOfClass;
      Constructor localConstructor2;
      if (localConstructor1 == null)
      {
        if (bool)
        {
          arrayOfClass = d;
          localConstructor1 = paramClass.getDeclaredConstructor(arrayOfClass);
          localConstructor1.setAccessible(true);
          e.put(paramClass, localConstructor1);
        }
      }
      else
      {
        localConstructor2 = localConstructor1;
        if (!bool)
          break label95;
      }
      label95: for (Object[] arrayOfObject = { paramfn }; ; arrayOfObject = null)
      {
        return localConstructor2.newInstance(arrayOfObject);
        arrayOfClass = c;
        break;
      }
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }

  public static gs b()
  {
    return a;
  }

  public static String c(fn paramfn)
  {
    String str1 = paramfn.f();
    String str2 = paramfn.d();
    if ((str1 == null) || ("".equals(str1)))
      return str2;
    if (str1.endsWith("$"));
    for (String str3 = ""; ; str3 = ".")
      return str1 + str3 + str2;
  }

  protected int a(Object paramObject1, Object paramObject2, fn paramfn, boolean paramBoolean)
  {
    switch (2.a[paramfn.a().ordinal()])
    {
    default:
    case 3:
    }
    do
      return super.a(paramObject1, paramObject2, paramfn, paramBoolean);
    while (!(paramObject1 instanceof Enum));
    return ((Enum)paramObject1).ordinal() - ((Enum)paramObject2).ordinal();
  }

  public fn a(Type paramType)
  {
    fn localfn = (fn)this.i.get(paramType);
    if (localfn == null)
    {
      localfn = a(paramType, new LinkedHashMap());
      this.i.put(paramType, localfn);
    }
    return localfn;
  }

  protected fn a(Type paramType, Map<String, fn> paramMap)
  {
    if (((paramType instanceof Class)) && (CharSequence.class.isAssignableFrom((Class)paramType)))
      return fn.a(fn.v.g);
    if (paramType == ByteBuffer.class)
      return fn.a(fn.v.h);
    if ((paramType == Integer.class) || (paramType == Integer.TYPE))
      return fn.a(fn.v.i);
    if ((paramType == Long.class) || (paramType == Long.TYPE))
      return fn.a(fn.v.j);
    if ((paramType == Float.class) || (paramType == Float.TYPE))
      return fn.a(fn.v.k);
    if ((paramType == Double.class) || (paramType == Double.TYPE))
      return fn.a(fn.v.l);
    if ((paramType == Boolean.class) || (paramType == Boolean.TYPE))
      return fn.a(fn.v.m);
    if ((paramType == Void.class) || (paramType == Void.TYPE))
      return fn.a(fn.v.n);
    if ((paramType instanceof ParameterizedType))
    {
      ParameterizedType localParameterizedType = (ParameterizedType)paramType;
      Class localClass2 = (Class)localParameterizedType.getRawType();
      Type[] arrayOfType = localParameterizedType.getActualTypeArguments();
      if (Collection.class.isAssignableFrom(localClass2))
      {
        if (arrayOfType.length != 1)
          throw new fl("No array type specified.");
        return fn.a(a(arrayOfType[0], paramMap));
      }
      if (Map.class.isAssignableFrom(localClass2))
      {
        Type localType1 = arrayOfType[0];
        Type localType2 = arrayOfType[1];
        if ((!(paramType instanceof Class)) || (!CharSequence.class.isAssignableFrom((Class)paramType)))
          throw new fl("Map key class not CharSequence: " + localType1);
        return fn.b(a(localType2, paramMap));
      }
      return a(localClass2, paramMap);
    }
    if ((paramType instanceof Class))
    {
      Class localClass1 = (Class)paramType;
      String str = localClass1.getName();
      Object localObject = (fn)paramMap.get(str);
      if (localObject == null);
      try
      {
        localObject = (fn)localClass1.getDeclaredField("SCHEMA$").get(null);
        if (!str.equals(c((fn)localObject)))
        {
          fn localfn = fn.f(((fn)localObject).toString().replace(((fn)localObject).f(), localClass1.getPackage().getName()));
          localObject = localfn;
        }
        paramMap.put(str, localObject);
        return localObject;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        throw new fk("Not a Specific class: " + localClass1);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new fk(localIllegalAccessException);
      }
    }
    throw new fl("Unknown type: " + paramType);
  }

  public ge a(fn paramfn)
  {
    return new gt(paramfn, paramfn, this);
  }

  public Class b(fn paramfn)
  {
    switch (2.a[paramfn.a().ordinal()])
    {
    default:
      throw new fk("Unknown type: " + paramfn);
    case 1:
    case 2:
    case 3:
      String str = paramfn.g();
      Object localObject;
      if (str == null)
        localObject = null;
      while (true)
      {
        return localObject;
        localObject = (Class)this.f.get(str);
        if (localObject == null);
        try
        {
          Class localClass = this.b.loadClass(c(paramfn));
          localObject = localClass;
          this.f.put(str, localObject);
          if (localObject == g)
            return null;
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          while (true)
            localObject = g;
        }
      }
    case 4:
      return List.class;
    case 5:
      return Map.class;
    case 6:
      List localList = paramfn.k();
      if ((localList.size() == 2) && (localList.contains(h)))
      {
        if (((fn)localList.get(0)).equals(h));
        for (int j = 1; ; j = 0)
          return b((fn)localList.get(j));
      }
      return Object.class;
    case 7:
      if ("String".equals(paramfn.a("avro.java.string")))
        return String.class;
      return CharSequence.class;
    case 8:
      return ByteBuffer.class;
    case 9:
      return Integer.TYPE;
    case 10:
      return Long.TYPE;
    case 11:
      return Float.TYPE;
    case 12:
      return Double.TYPE;
    case 13:
      return Boolean.TYPE;
    case 14:
    }
    return Void.TYPE;
  }

  public Object c(Object paramObject, fn paramfn)
  {
    Class localClass = b().b(paramfn);
    if (localClass == null)
      paramObject = super.c(paramObject, paramfn);
    while (localClass.isInstance(paramObject))
      return paramObject;
    return a(localClass, paramfn);
  }

  public Object d(Object paramObject, fn paramfn)
  {
    Class localClass = b().b(paramfn);
    if (localClass == null)
      paramObject = super.d(paramObject, paramfn);
    while (localClass.isInstance(paramObject))
      return paramObject;
    return a(localClass, paramfn);
  }

  protected boolean f(Object paramObject)
  {
    return ((paramObject instanceof Enum)) || (super.f(paramObject));
  }

  protected fn g(Object paramObject)
  {
    if ((paramObject instanceof Enum))
      return a(paramObject.getClass());
    return super.g(paramObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gs
 * JD-Core Version:    0.6.2
 */