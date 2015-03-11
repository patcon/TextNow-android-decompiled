package com.flurry.sdk;

import java.lang.reflect.Array;
import java.util.List;

public final class re
{
  private re.a a;
  private re.a b;
  private int c;
  private Object[] d;

  protected final void a(Object paramObject, int paramInt1, Object[] paramArrayOfObject, int paramInt2)
  {
    re.a locala = this.a;
    int i = 0;
    while (locala != null)
    {
      Object[] arrayOfObject = locala.a();
      int k = arrayOfObject.length;
      System.arraycopy(arrayOfObject, 0, paramObject, i, k);
      i += k;
      locala = locala.b();
    }
    System.arraycopy(paramArrayOfObject, 0, paramObject, i, paramInt2);
    int j = i + paramInt2;
    if (j != paramInt1)
      throw new IllegalStateException("Should have gotten " + paramInt1 + " entries, got " + j);
  }

  public final void a(Object[] paramArrayOfObject, int paramInt, List<Object> paramList)
  {
    int i;
    for (re.a locala = this.a; ; locala = locala.b())
    {
      i = 0;
      if (locala == null)
        break;
      Object[] arrayOfObject = locala.a();
      int j = arrayOfObject.length;
      for (int k = 0; k < j; k++)
        paramList.add(arrayOfObject[k]);
    }
    while (i < paramInt)
    {
      paramList.add(paramArrayOfObject[i]);
      i++;
    }
  }

  public final Object[] a()
  {
    c();
    if (this.d == null)
      return new Object[12];
    return this.d;
  }

  public final Object[] a(Object[] paramArrayOfObject)
  {
    re.a locala = new re.a(paramArrayOfObject);
    int i;
    if (this.a == null)
    {
      this.b = locala;
      this.a = locala;
      i = paramArrayOfObject.length;
      this.c = (i + this.c);
      if (i >= 16384)
        break label73;
    }
    label73: for (int j = i + i; ; j = i + (i >> 2))
    {
      return new Object[j];
      this.b.a(locala);
      this.b = locala;
      break;
    }
  }

  public final Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    int i = paramInt + this.c;
    Object[] arrayOfObject = new Object[i];
    a(arrayOfObject, i, paramArrayOfObject, paramInt);
    return arrayOfObject;
  }

  public final <T> T[] a(Object[] paramArrayOfObject, int paramInt, Class<T> paramClass)
  {
    int i = paramInt + this.c;
    Object[] arrayOfObject = (Object[])Array.newInstance(paramClass, i);
    a(arrayOfObject, i, paramArrayOfObject, paramInt);
    c();
    return arrayOfObject;
  }

  public final int b()
  {
    if (this.d == null)
      return 0;
    return this.d.length;
  }

  protected final void c()
  {
    if (this.b != null)
      this.d = this.b.a();
    this.b = null;
    this.a = null;
    this.c = 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.re
 * JD-Core Version:    0.6.2
 */