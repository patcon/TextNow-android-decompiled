package com.flurry.sdk;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class mv
  implements qv
{
  protected HashMap<Class<? extends Annotation>, Annotation> a;

  public mv()
  {
  }

  private mv(HashMap<Class<? extends Annotation>, Annotation> paramHashMap)
  {
    this.a = paramHashMap;
  }

  public static mv a(mv parammv1, mv parammv2)
  {
    if ((parammv1 == null) || (parammv1.a == null) || (parammv1.a.isEmpty()))
      parammv1 = parammv2;
    while ((parammv2 == null) || (parammv2.a == null) || (parammv2.a.isEmpty()))
      return parammv1;
    HashMap localHashMap = new HashMap();
    Iterator localIterator1 = parammv2.a.values().iterator();
    while (localIterator1.hasNext())
    {
      Annotation localAnnotation2 = (Annotation)localIterator1.next();
      localHashMap.put(localAnnotation2.annotationType(), localAnnotation2);
    }
    Iterator localIterator2 = parammv1.a.values().iterator();
    while (localIterator2.hasNext())
    {
      Annotation localAnnotation1 = (Annotation)localIterator2.next();
      localHashMap.put(localAnnotation1.annotationType(), localAnnotation1);
    }
    return new mv(localHashMap);
  }

  public final int a()
  {
    if (this.a == null)
      return 0;
    return this.a.size();
  }

  public final <A extends Annotation> A a(Class<A> paramClass)
  {
    if (this.a == null)
      return null;
    return (Annotation)this.a.get(paramClass);
  }

  public final void a(Annotation paramAnnotation)
  {
    if ((this.a == null) || (!this.a.containsKey(paramAnnotation.annotationType())))
      c(paramAnnotation);
  }

  public final void b(Annotation paramAnnotation)
  {
    c(paramAnnotation);
  }

  protected final void c(Annotation paramAnnotation)
  {
    if (this.a == null)
      this.a = new HashMap();
    this.a.put(paramAnnotation.annotationType(), paramAnnotation);
  }

  public final String toString()
  {
    if (this.a == null)
      return "[null]";
    return this.a.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mv
 * JD-Core Version:    0.6.2
 */