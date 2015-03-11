package com.flurry.sdk;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class mn extends mm
{
  private static final mv[] l = new mv[0];
  protected final Class<?> a;
  protected final List<Class<?>> b;
  protected final iq c;
  protected final iu.a d;
  protected final Class<?> e;
  protected mv f;
  protected mo g;
  protected List<mo> h;
  protected List<mr> i;
  protected ms j;
  protected List<mp> k;

  private mn(Class<?> paramClass, List<Class<?>> paramList, iq paramiq, iu.a parama, mv parammv)
  {
    this.a = paramClass;
    this.b = paramList;
    this.c = paramiq;
    this.d = parama;
    if (this.d == null);
    for (Class localClass = null; ; localClass = this.d.a(this.a))
    {
      this.e = localClass;
      this.f = parammv;
      return;
    }
  }

  public static mn a(Class<?> paramClass, iq paramiq, iu.a parama)
  {
    mn localmn = new mn(paramClass, qy.a(paramClass, null), paramiq, parama, null);
    localmn.m();
    return localmn;
  }

  private mv[] a(int paramInt)
  {
    mv[] arrayOfmv;
    if (paramInt == 0)
      arrayOfmv = l;
    while (true)
    {
      return arrayOfmv;
      arrayOfmv = new mv[paramInt];
      for (int m = 0; m < paramInt; m++)
        arrayOfmv[m] = o();
    }
  }

  public static mn b(Class<?> paramClass, iq paramiq, iu.a parama)
  {
    mn localmn = new mn(paramClass, Collections.emptyList(), paramiq, parama, null);
    localmn.m();
    return localmn;
  }

  private boolean b(Field paramField)
  {
    if (paramField.isSynthetic());
    int m;
    do
    {
      return false;
      m = paramField.getModifiers();
    }
    while ((Modifier.isStatic(m)) || (Modifier.isTransient(m)));
    return true;
  }

  private mv o()
  {
    return new mv();
  }

  protected final mo a(Constructor<?> paramConstructor, boolean paramBoolean)
  {
    if (this.c == null)
      return new mo(paramConstructor, o(), a(paramConstructor.getParameterTypes().length));
    if (paramBoolean)
      return new mo(paramConstructor, a(paramConstructor.getDeclaredAnnotations()), null);
    Annotation[][] arrayOfAnnotation = paramConstructor.getParameterAnnotations();
    int m = paramConstructor.getParameterTypes().length;
    Class localClass;
    Object localObject;
    mv[] arrayOfmv;
    if (m != arrayOfAnnotation.length)
    {
      localClass = paramConstructor.getDeclaringClass();
      if ((localClass.isEnum()) && (m == 2 + arrayOfAnnotation.length))
      {
        localObject = new Annotation[2 + arrayOfAnnotation.length][];
        System.arraycopy(arrayOfAnnotation, 0, localObject, 2, arrayOfAnnotation.length);
        arrayOfmv = a((Annotation[][])localObject);
      }
    }
    while (true)
      if (arrayOfmv == null)
      {
        throw new IllegalStateException("Internal error: constructor for " + paramConstructor.getDeclaringClass().getName() + " has mismatch: " + m + " parameters; " + localObject.length + " sets of annotations");
        if ((localClass.isMemberClass()) && (m == 1 + arrayOfAnnotation.length))
        {
          localObject = new Annotation[1 + arrayOfAnnotation.length][];
          System.arraycopy(arrayOfAnnotation, 0, localObject, 1, arrayOfAnnotation.length);
          arrayOfmv = a((Annotation[][])localObject);
          continue;
          arrayOfmv = a(arrayOfAnnotation);
        }
      }
      else
      {
        return new mo(paramConstructor, a(paramConstructor.getDeclaredAnnotations()), arrayOfmv);
        localObject = arrayOfAnnotation;
        arrayOfmv = null;
      }
  }

  protected final mp a(Field paramField)
  {
    if (this.c == null)
      return new mp(paramField, o());
    return new mp(paramField, a(paramField.getDeclaredAnnotations()));
  }

  public final mr a(String paramString, Class<?>[] paramArrayOfClass)
  {
    return this.j.a(paramString, paramArrayOfClass);
  }

  protected final mr a(Method paramMethod)
  {
    if (this.c == null)
      return new mr(paramMethod, o(), null);
    return new mr(paramMethod, a(paramMethod.getDeclaredAnnotations()), null);
  }

  protected final mv a(Annotation[] paramArrayOfAnnotation)
  {
    mv localmv = new mv();
    if (paramArrayOfAnnotation != null)
    {
      int m = paramArrayOfAnnotation.length;
      for (int n = 0; n < m; n++)
      {
        Annotation localAnnotation = paramArrayOfAnnotation[n];
        if (this.c.a(localAnnotation))
          localmv.b(localAnnotation);
      }
    }
    return localmv;
  }

  public final <A extends Annotation> A a(Class<A> paramClass)
  {
    if (this.f == null)
      return null;
    return this.f.a(paramClass);
  }

  protected final void a(mv parammv, Class<?> paramClass)
  {
    if (this.d != null)
      a(parammv, paramClass, this.d.a(paramClass));
  }

  protected final void a(mv parammv, Class<?> paramClass1, Class<?> paramClass2)
  {
    if (paramClass2 == null)
      return;
    for (Annotation localAnnotation2 : paramClass2.getDeclaredAnnotations())
      if (this.c.a(localAnnotation2))
        parammv.a(localAnnotation2);
    Iterator localIterator = qy.a(paramClass2, paramClass1).iterator();
    while (localIterator.hasNext())
      for (Annotation localAnnotation1 : ((Class)localIterator.next()).getDeclaredAnnotations())
        if (this.c.a(localAnnotation1))
          parammv.a(localAnnotation1);
  }

  public final void a(na paramna)
  {
    this.j = new ms();
    ms localms = new ms();
    a(this.a, paramna, this.j, this.e, localms);
    Iterator localIterator1 = this.b.iterator();
    if (localIterator1.hasNext())
    {
      Class localClass2 = (Class)localIterator1.next();
      if (this.d == null);
      for (Class localClass3 = null; ; localClass3 = this.d.a(localClass2))
      {
        a(localClass2, paramna, this.j, localClass3, localms);
        break;
      }
    }
    if (this.d != null)
    {
      Class localClass1 = this.d.a(Object.class);
      if (localClass1 != null)
        a(paramna, this.j, localClass1, localms);
    }
    if ((this.c != null) && (!localms.a()))
    {
      Iterator localIterator2 = localms.iterator();
      while (localIterator2.hasNext())
      {
        mr localmr1 = (mr)localIterator2.next();
        try
        {
          Method localMethod = Object.class.getDeclaredMethod(localmr1.b(), localmr1.m());
          if (localMethod != null)
          {
            mr localmr2 = a(localMethod);
            a(localmr1.e(), localmr2, false);
            this.j.a(localmr2);
          }
        }
        catch (Exception localException)
        {
        }
      }
    }
  }

  protected final void a(na paramna, ms paramms1, Class<?> paramClass, ms paramms2)
  {
    Method[] arrayOfMethod = paramClass.getDeclaredMethods();
    int m = arrayOfMethod.length;
    int n = 0;
    if (n < m)
    {
      Method localMethod = arrayOfMethod[n];
      if (a(localMethod, paramna))
      {
        mr localmr = paramms1.b(localMethod);
        if (localmr == null)
          break label65;
        a(localMethod, localmr);
      }
      while (true)
      {
        n++;
        break;
        label65: paramms2.a(a(localMethod));
      }
    }
  }

  protected final void a(Class<?> paramClass1, na paramna, ms paramms1, Class<?> paramClass2, ms paramms2)
  {
    if (paramClass2 != null)
      a(paramna, paramms1, paramClass2, paramms2);
    if (paramClass1 == null)
      return;
    Method[] arrayOfMethod = paramClass1.getDeclaredMethods();
    int m = arrayOfMethod.length;
    int n = 0;
    label34: Method localMethod;
    mr localmr1;
    if (n < m)
    {
      localMethod = arrayOfMethod[n];
      if (a(localMethod, paramna))
      {
        localmr1 = paramms1.b(localMethod);
        if (localmr1 != null)
          break label117;
        mr localmr2 = a(localMethod);
        paramms1.a(localmr2);
        mr localmr3 = paramms2.a(localMethod);
        if (localmr3 != null)
          a(localmr3.e(), localmr2, false);
      }
    }
    while (true)
    {
      n++;
      break label34;
      break;
      label117: a(localMethod, localmr1);
      if ((localmr1.h().isInterface()) && (!localMethod.getDeclaringClass().isInterface()))
        paramms1.a(localmr1.a(localMethod));
    }
  }

  protected final void a(Class<?> paramClass, Map<String, mp> paramMap)
  {
    for (Field localField : paramClass.getDeclaredFields())
      if (b(localField))
      {
        mp localmp = (mp)paramMap.get(localField.getName());
        if (localmp != null)
          for (Annotation localAnnotation : localField.getDeclaredAnnotations())
            if (this.c.a(localAnnotation))
              localmp.a(localAnnotation);
      }
  }

  protected final void a(Constructor<?> paramConstructor, mo parammo, boolean paramBoolean)
  {
    for (Annotation localAnnotation : paramConstructor.getDeclaredAnnotations())
      if (this.c.a(localAnnotation))
        parammo.a(localAnnotation);
    if (paramBoolean)
      for (Annotation[] arrayOfAnnotation2 : paramConstructor.getParameterAnnotations())
      {
        int i3 = arrayOfAnnotation2.length;
        for (int i4 = 0; i4 < i3; i4++)
          parammo.a(???, arrayOfAnnotation2[i4]);
      }
  }

  protected final void a(Method paramMethod, mr parammr)
  {
    for (Annotation localAnnotation : paramMethod.getDeclaredAnnotations())
      if (this.c.a(localAnnotation))
        parammr.b(localAnnotation);
  }

  protected final void a(Method paramMethod, mr parammr, boolean paramBoolean)
  {
    for (Annotation localAnnotation : paramMethod.getDeclaredAnnotations())
      if (this.c.a(localAnnotation))
        parammr.a(localAnnotation);
    if (paramBoolean)
      for (Annotation[] arrayOfAnnotation2 : paramMethod.getParameterAnnotations())
      {
        int i3 = arrayOfAnnotation2.length;
        for (int i4 = 0; i4 < i3; i4++)
          parammr.a(???, arrayOfAnnotation2[i4]);
      }
  }

  protected final void a(Map<String, mp> paramMap, Class<?> paramClass)
  {
    Class localClass1 = paramClass.getSuperclass();
    if (localClass1 != null)
    {
      a(paramMap, localClass1);
      for (Field localField : paramClass.getDeclaredFields())
        if (b(localField))
          paramMap.put(localField.getName(), a(localField));
      if (this.d != null)
      {
        Class localClass2 = this.d.a(paramClass);
        if (localClass2 != null)
          a(localClass2, paramMap);
      }
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.h = null;
    Constructor[] arrayOfConstructor = this.a.getDeclaredConstructors();
    int m = arrayOfConstructor.length;
    int n = 0;
    if (n < m)
    {
      Constructor localConstructor = arrayOfConstructor[n];
      if (localConstructor.getParameterTypes().length == 0)
        this.g = a(localConstructor, true);
      while (true)
      {
        n++;
        break;
        if (paramBoolean)
        {
          if (this.h == null)
            this.h = new ArrayList(Math.max(10, arrayOfConstructor.length));
          this.h.add(a(localConstructor, false));
        }
      }
    }
    if ((this.e != null) && ((this.g != null) || (this.h != null)))
      c(this.e);
    int i5;
    if (this.c != null)
    {
      if ((this.g != null) && (this.c.a(this.g)))
        this.g = null;
      if (this.h != null)
        i5 = this.h.size();
    }
    while (true)
    {
      int i6 = i5 - 1;
      if (i6 >= 0)
      {
        if (this.c.a((mo)this.h.get(i6)))
        {
          this.h.remove(i6);
          i5 = i6;
        }
      }
      else
      {
        this.i = null;
        int i3;
        if (paramBoolean)
        {
          Method[] arrayOfMethod = this.a.getDeclaredMethods();
          int i1 = arrayOfMethod.length;
          int i2 = 0;
          if (i2 < i1)
          {
            Method localMethod = arrayOfMethod[i2];
            if ((!Modifier.isStatic(localMethod.getModifiers())) || (localMethod.getParameterTypes().length <= 0));
            while (true)
            {
              i2++;
              break;
              if (this.i == null)
                this.i = new ArrayList(8);
              this.i.add(b(localMethod));
            }
          }
          if ((this.e != null) && (this.i != null))
            d(this.e);
          if ((this.c != null) && (this.i != null))
            i3 = this.i.size();
        }
        while (true)
        {
          int i4 = i3 - 1;
          if (i4 >= 0)
          {
            if (this.c.a((mr)this.i.get(i4)))
            {
              this.i.remove(i4);
              i3 = i4;
            }
          }
          else
          {
            return;
            i3 = i4;
          }
        }
        i5 = i6;
      }
    }
  }

  protected final boolean a(Method paramMethod, na paramna)
  {
    if ((paramna != null) && (!paramna.a(paramMethod)));
    while ((paramMethod.isSynthetic()) || (paramMethod.isBridge()))
      return false;
    return true;
  }

  protected final mv[] a(Annotation[][] paramArrayOfAnnotation)
  {
    int m = paramArrayOfAnnotation.length;
    mv[] arrayOfmv = new mv[m];
    for (int n = 0; n < m; n++)
      arrayOfmv[n] = a(paramArrayOfAnnotation[n]);
    return arrayOfmv;
  }

  protected final mr b(Method paramMethod)
  {
    if (this.c == null)
      return new mr(paramMethod, o(), a(paramMethod.getParameterTypes().length));
    return new mr(paramMethod, a(paramMethod.getDeclaredAnnotations()), a(paramMethod.getParameterAnnotations()));
  }

  public final String b()
  {
    return this.a.getName();
  }

  public final Type c()
  {
    return this.a;
  }

  protected final void c(Class<?> paramClass)
  {
    int m;
    int i1;
    Object localObject1;
    label24: Constructor localConstructor;
    if (this.h == null)
    {
      m = 0;
      Constructor[] arrayOfConstructor = paramClass.getDeclaredConstructors();
      int n = arrayOfConstructor.length;
      i1 = 0;
      localObject1 = null;
      if (i1 >= n)
        break label209;
      localConstructor = arrayOfConstructor[i1];
      if (localConstructor.getParameterTypes().length != 0)
        break label83;
      if (this.g != null)
        a(localConstructor, this.g, false);
    }
    while (true)
    {
      i1++;
      break label24;
      m = this.h.size();
      break;
      label83: if (localObject1 == null)
      {
        localObject2 = new mz[m];
        for (int i3 = 0; i3 < m; i3++)
          localObject2[i3] = new mz(((mo)this.h.get(i3)).e());
      }
      Object localObject2 = localObject1;
      mz localmz = new mz(localConstructor);
      int i2 = 0;
      while (true)
        if (i2 < m)
        {
          if (localmz.equals(localObject2[i2]))
          {
            a(localConstructor, (mo)this.h.get(i2), true);
            localObject1 = localObject2;
            break;
          }
          i2++;
          continue;
          label209: return;
        }
      localObject1 = localObject2;
    }
  }

  public final Class<?> d()
  {
    return this.a;
  }

  protected final void d(Class<?> paramClass)
  {
    Object localObject1 = null;
    int m = this.i.size();
    Method[] arrayOfMethod = paramClass.getDeclaredMethods();
    int n = arrayOfMethod.length;
    int i1 = 0;
    Object localObject2;
    int i2;
    if (i1 < n)
    {
      Method localMethod = arrayOfMethod[i1];
      if ((!Modifier.isStatic(localMethod.getModifiers())) || (localMethod.getParameterTypes().length == 0))
        break label187;
      if (localObject1 == null)
      {
        localObject2 = new mz[m];
        for (int i3 = 0; i3 < m; i3++)
          localObject2[i3] = new mz(((mr)this.i.get(i3)).e());
      }
      localObject2 = localObject1;
      mz localmz = new mz(localMethod);
      i2 = 0;
      label131: if (i2 < m)
      {
        if (!localmz.equals(localObject2[i2]))
          break label180;
        a(localMethod, (mr)this.i.get(i2), true);
      }
    }
    while (true)
    {
      i1++;
      localObject1 = localObject2;
      break;
      label180: i2++;
      break label131;
      return;
      label187: localObject2 = localObject1;
    }
  }

  public final Class<?> e()
  {
    return this.a;
  }

  public final qv f()
  {
    return this.f;
  }

  public final boolean g()
  {
    return this.f.a() > 0;
  }

  public final mo h()
  {
    return this.g;
  }

  public final List<mo> i()
  {
    if (this.h == null)
      return Collections.emptyList();
    return this.h;
  }

  public final List<mr> j()
  {
    if (this.i == null)
      return Collections.emptyList();
    return this.i;
  }

  public final Iterable<mr> k()
  {
    return this.j;
  }

  public final Iterable<mp> l()
  {
    if (this.k == null)
      return Collections.emptyList();
    return this.k;
  }

  public final void m()
  {
    this.f = new mv();
    if (this.c == null)
      return;
    if (this.e != null)
      a(this.f, this.a, this.e);
    for (Annotation localAnnotation2 : this.a.getDeclaredAnnotations())
      if (this.c.a(localAnnotation2))
        this.f.a(localAnnotation2);
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      Class localClass = (Class)localIterator.next();
      a(this.f, localClass);
      for (Annotation localAnnotation1 : localClass.getDeclaredAnnotations())
        if (this.c.a(localAnnotation1))
          this.f.a(localAnnotation1);
    }
    a(this.f, Object.class);
  }

  public final void n()
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    a(localLinkedHashMap, this.a);
    if (localLinkedHashMap.isEmpty())
    {
      this.k = Collections.emptyList();
      return;
    }
    this.k = new ArrayList(localLinkedHashMap.size());
    this.k.addAll(localLinkedHashMap.values());
  }

  public final String toString()
  {
    return "[AnnotedClass " + this.a.getName() + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mn
 * JD-Core Version:    0.6.2
 */