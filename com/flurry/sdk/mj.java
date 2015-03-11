package com.flurry.sdk;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@kb
public class mj extends lz<Object>
{
  private static final Object[] a = new Object[0];

  public mj()
  {
    super(Object.class);
  }

  public Object a(hj paramhj, iz paramiz)
  {
    switch (1.a[paramhj.e().ordinal()])
    {
    case 2:
    case 4:
    default:
      throw paramiz.b(Object.class);
    case 1:
      return c(paramhj, paramiz);
    case 3:
      return b(paramhj, paramiz);
    case 5:
      return c(paramhj, paramiz);
    case 6:
      return paramhj.z();
    case 7:
      return paramhj.k();
    case 8:
      if (paramiz.a(iy.a.h))
        return paramhj.v();
      return paramhj.p();
    case 9:
      if (paramiz.a(iy.a.g))
        return paramhj.y();
      return Double.valueOf(paramhj.x());
    case 10:
      return Boolean.TRUE;
    case 11:
      return Boolean.FALSE;
    case 12:
    }
    return null;
  }

  public Object a(hj paramhj, iz paramiz, jy paramjy)
  {
    hm localhm = paramhj.e();
    switch (1.a[localhm.ordinal()])
    {
    case 2:
    case 4:
    default:
      throw paramiz.b(Object.class);
    case 1:
    case 3:
    case 5:
      return paramjy.d(paramhj, paramiz);
    case 7:
      return paramhj.k();
    case 8:
      if (paramiz.a(iy.a.h))
        return paramhj.v();
      return Integer.valueOf(paramhj.t());
    case 9:
      if (paramiz.a(iy.a.g))
        return paramhj.y();
      return Double.valueOf(paramhj.x());
    case 10:
      return Boolean.TRUE;
    case 11:
      return Boolean.FALSE;
    case 6:
      return paramhj.z();
    case 12:
    }
    return null;
  }

  protected Object b(hj paramhj, iz paramiz)
  {
    if (paramiz.a(iy.a.i))
      return d(paramhj, paramiz);
    if (paramhj.b() == hm.e)
      return new ArrayList(4);
    re localre = paramiz.g();
    Object[] arrayOfObject1 = localre.a();
    int i = 0;
    Object[] arrayOfObject2 = arrayOfObject1;
    int j = 0;
    Object localObject = a(paramhj, paramiz);
    j++;
    if (i >= arrayOfObject2.length)
      arrayOfObject2 = localre.a(arrayOfObject2);
    for (int k = 0; ; k = i)
    {
      i = k + 1;
      arrayOfObject2[k] = localObject;
      if (paramhj.b() != hm.e)
        break;
      ArrayList localArrayList = new ArrayList(1 + (j + (j >> 3)));
      localre.a(arrayOfObject2, i, localArrayList);
      return localArrayList;
    }
  }

  protected Object c(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.b)
      localhm = paramhj.b();
    if (localhm != hm.f)
      return new LinkedHashMap(4);
    String str1 = paramhj.k();
    paramhj.b();
    Object localObject1 = a(paramhj, paramiz);
    if (paramhj.b() != hm.f)
    {
      LinkedHashMap localLinkedHashMap1 = new LinkedHashMap(4);
      localLinkedHashMap1.put(str1, localObject1);
      return localLinkedHashMap1;
    }
    String str2 = paramhj.k();
    paramhj.b();
    Object localObject2 = a(paramhj, paramiz);
    if (paramhj.b() != hm.f)
    {
      LinkedHashMap localLinkedHashMap2 = new LinkedHashMap(4);
      localLinkedHashMap2.put(str1, localObject1);
      localLinkedHashMap2.put(str2, localObject2);
      return localLinkedHashMap2;
    }
    LinkedHashMap localLinkedHashMap3 = new LinkedHashMap();
    localLinkedHashMap3.put(str1, localObject1);
    localLinkedHashMap3.put(str2, localObject2);
    do
    {
      String str3 = paramhj.k();
      paramhj.b();
      localLinkedHashMap3.put(str3, a(paramhj, paramiz));
    }
    while (paramhj.b() != hm.c);
    return localLinkedHashMap3;
  }

  protected Object[] d(hj paramhj, iz paramiz)
  {
    if (paramhj.b() == hm.e)
      return a;
    re localre = paramiz.g();
    Object[] arrayOfObject = localre.a();
    int i = 0;
    Object localObject = a(paramhj, paramiz);
    if (i >= arrayOfObject.length)
      arrayOfObject = localre.a(arrayOfObject);
    for (int j = 0; ; j = i)
    {
      i = j + 1;
      arrayOfObject[j] = localObject;
      if (paramhj.b() != hm.e)
        break;
      return localre.a(arrayOfObject, i);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mj
 * JD-Core Version:    0.6.2
 */