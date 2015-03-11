package com.flurry.sdk;

import java.lang.reflect.Array;

@kb
public class lx extends lo<Object[]>
{
  protected final sh a;
  protected final boolean b;
  protected final Class<?> c;
  protected final jg<Object> d;
  protected final jy e;

  public lx(qi paramqi, jg<Object> paramjg, jy paramjy)
  {
    super([Ljava.lang.Object.class);
    this.a = paramqi;
    this.c = paramqi.g().p();
    if (this.c == Object.class);
    for (boolean bool = true; ; bool = false)
    {
      this.b = bool;
      this.d = paramjg;
      this.e = paramjy;
      return;
    }
  }

  private final Object[] d(hj paramhj, iz paramiz)
  {
    if ((paramhj.e() == hm.h) && (paramiz.a(iy.a.q)) && (paramhj.k().length() == 0))
      return null;
    if (!paramiz.a(iy.a.o))
    {
      if ((paramhj.e() == hm.h) && (this.c == Byte.class))
        return c(paramhj, paramiz);
      throw paramiz.b(this.a.p());
    }
    Object localObject;
    if (paramhj.e() == hm.m)
    {
      localObject = null;
      if (!this.b)
        break label150;
    }
    label150: for (Object[] arrayOfObject = new Object[1]; ; arrayOfObject = (Object[])Array.newInstance(this.c, 1))
    {
      arrayOfObject[0] = localObject;
      return arrayOfObject;
      if (this.e == null)
      {
        localObject = this.d.a(paramhj, paramiz);
        break;
      }
      localObject = this.d.a(paramhj, paramiz, this.e);
      break;
    }
  }

  public Object[] b(hj paramhj, iz paramiz)
  {
    if (!paramhj.j())
      return d(paramhj, paramiz);
    re localre = paramiz.g();
    Object[] arrayOfObject1 = localre.a();
    jy localjy = this.e;
    Object[] arrayOfObject2 = arrayOfObject1;
    int i = 0;
    hm localhm = paramhj.b();
    Object localObject;
    if (localhm != hm.e)
      if (localhm == hm.m)
      {
        localObject = null;
        label63: if (i < arrayOfObject2.length)
          break label175;
        arrayOfObject2 = localre.a(arrayOfObject2);
      }
    label175: for (int j = 0; ; j = i)
    {
      i = j + 1;
      arrayOfObject2[j] = localObject;
      break;
      if (localjy == null)
      {
        localObject = this.d.a(paramhj, paramiz);
        break label63;
      }
      localObject = this.d.a(paramhj, paramiz, localjy);
      break label63;
      if (this.b);
      for (Object[] arrayOfObject3 = localre.a(arrayOfObject2, i); ; arrayOfObject3 = localre.a(arrayOfObject2, i, this.c))
      {
        paramiz.a(localre);
        return arrayOfObject3;
      }
    }
  }

  public Object[] b(hj paramhj, iz paramiz, jy paramjy)
  {
    return (Object[])paramjy.b(paramhj, paramiz);
  }

  protected Byte[] c(hj paramhj, iz paramiz)
  {
    byte[] arrayOfByte = paramhj.a(paramiz.c());
    Byte[] arrayOfByte1 = new Byte[arrayOfByte.length];
    int i = 0;
    int j = arrayOfByte.length;
    while (i < j)
    {
      arrayOfByte1[i] = Byte.valueOf(arrayOfByte[i]);
      i++;
    }
    return arrayOfByte1;
  }

  public jg<Object> d()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lx
 * JD-Core Version:    0.6.2
 */