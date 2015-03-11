package com.flurry.sdk;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class qr
{
  public static final sh a = new qp(Object.class);
  private static final sh[] g = new sh[0];
  protected final qs b;
  protected final sh c;
  protected final Class<?> d;
  protected Map<String, sh> e;
  protected HashSet<String> f;
  private final qr h;

  private qr(qs paramqs, qr paramqr, Class<?> paramClass, sh paramsh)
  {
    this.b = paramqs;
    this.h = paramqr;
    this.d = paramClass;
    this.c = paramsh;
  }

  public qr(qs paramqs, sh paramsh)
  {
    this(paramqs, null, paramsh.p(), paramsh);
  }

  public qr(qs paramqs, Class<?> paramClass)
  {
    this(paramqs, null, paramClass, null);
  }

  public qr a()
  {
    return new qr(this.b, this, this.d, this.c);
  }

  public sh a(String paramString)
  {
    if (this.e == null)
      c();
    sh localsh = (sh)this.e.get(paramString);
    if (localsh != null)
      return localsh;
    if ((this.f != null) && (this.f.contains(paramString)))
      return a;
    if (this.h != null)
      return this.h.a(paramString);
    if ((this.d != null) && (this.d.getEnclosingClass() != null) && (!Modifier.isStatic(this.d.getModifiers())))
      return a;
    String str;
    if (this.d != null)
      str = this.d.getName();
    while (true)
    {
      throw new IllegalArgumentException("Type variable '" + paramString + "' can not be resolved (with context of class " + str + ")");
      if (this.c != null)
        str = this.c.toString();
      else
        str = "UNKNOWN";
    }
  }

  public sh a(Type paramType)
  {
    return this.b.b(paramType, this);
  }

  public void a(String paramString, sh paramsh)
  {
    if ((this.e == null) || (this.e.size() == 0))
      this.e = new LinkedHashMap();
    this.e.put(paramString, paramsh);
  }

  public void b(String paramString)
  {
    if (this.f == null)
      this.f = new HashSet();
    this.f.add(paramString);
  }

  protected void b(Type paramType)
  {
    int i = 0;
    if (paramType == null)
      return;
    ParameterizedType localParameterizedType;
    if ((paramType instanceof ParameterizedType))
    {
      localParameterizedType = (ParameterizedType)paramType;
      Type[] arrayOfType2 = localParameterizedType.getActualTypeArguments();
      if ((arrayOfType2 != null) && (arrayOfType2.length > 0))
      {
        Class localClass2 = (Class)localParameterizedType.getRawType();
        TypeVariable[] arrayOfTypeVariable2 = localClass2.getTypeParameters();
        if (arrayOfTypeVariable2.length != arrayOfType2.length)
          throw new IllegalArgumentException("Strange parametrized type (in class " + localClass2.getName() + "): number of type arguments != number of type parameters (" + arrayOfType2.length + " vs " + arrayOfTypeVariable2.length + ")");
        int m = arrayOfType2.length;
        int n = 0;
        if (n < m)
        {
          String str2 = arrayOfTypeVariable2[n].getName();
          if (this.e == null)
            this.e = new LinkedHashMap();
          while (true)
          {
            b(str2);
            this.e.put(str2, this.b.b(arrayOfType2[n], this));
            do
            {
              n++;
              break;
            }
            while (this.e.containsKey(str2));
          }
        }
      }
    }
    Class localClass1;
    for (Object localObject = (Class)localParameterizedType.getRawType(); ; localObject = localClass1)
    {
      b(((Class)localObject).getGenericSuperclass());
      Type[] arrayOfType1 = ((Class)localObject).getGenericInterfaces();
      int j = arrayOfType1.length;
      while (i < j)
      {
        b(arrayOfType1[i]);
        i++;
      }
      break;
      if (!(paramType instanceof Class))
        break;
      localClass1 = (Class)paramType;
      b(localClass1.getDeclaringClass());
      TypeVariable[] arrayOfTypeVariable1 = localClass1.getTypeParameters();
      if ((arrayOfTypeVariable1 != null) && (arrayOfTypeVariable1.length > 0))
      {
        sh localsh = this.c;
        sh[] arrayOfsh = null;
        if (localsh != null)
        {
          boolean bool = localClass1.isAssignableFrom(this.c.p());
          arrayOfsh = null;
          if (bool)
            arrayOfsh = this.b.b(this.c, localClass1);
        }
        int k = 0;
        if (k < arrayOfTypeVariable1.length)
        {
          TypeVariable localTypeVariable = arrayOfTypeVariable1[k];
          String str1 = localTypeVariable.getName();
          Type localType = localTypeVariable.getBounds()[0];
          if (localType != null)
          {
            if (this.e != null)
              break label459;
            this.e = new LinkedHashMap();
            label425: b(str1);
            if (arrayOfsh == null)
              break label476;
            this.e.put(str1, arrayOfsh[k]);
          }
          while (true)
          {
            k++;
            break;
            label459: if (!this.e.containsKey(str1))
            {
              break label425;
              label476: this.e.put(str1, this.b.b(localType, this));
            }
          }
        }
      }
    }
  }

  public sh[] b()
  {
    if (this.e == null)
      c();
    if (this.e.size() == 0)
      return g;
    return (sh[])this.e.values().toArray(new sh[this.e.size()]);
  }

  protected void c()
  {
    b(this.d);
    if (this.c != null)
    {
      int i = this.c.h();
      if (i > 0)
      {
        if (this.e == null)
          this.e = new LinkedHashMap();
        for (int j = 0; j < i; j++)
        {
          String str = this.c.a(j);
          sh localsh = this.c.b(j);
          this.e.put(str, localsh);
        }
      }
    }
    if (this.e == null)
      this.e = Collections.emptyMap();
  }

  public String toString()
  {
    if (this.e == null)
      c();
    StringBuilder localStringBuilder = new StringBuilder("[TypeBindings for ");
    if (this.c != null)
      localStringBuilder.append(this.c.toString());
    while (true)
    {
      localStringBuilder.append(": ").append(this.e).append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(this.d.getName());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qr
 * JD-Core Version:    0.6.2
 */