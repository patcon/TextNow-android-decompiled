package com.flurry.sdk;

import java.util.AbstractList;
import java.util.Iterator;

public class ft$a<T> extends AbstractList<T>
  implements fr<T>, Comparable<fr<T>>
{
  private static final Object[] a = new Object[0];
  private final fn b;
  private int c;
  private Object[] d = a;

  public ft$a(int paramInt, fn paramfn)
  {
    if ((paramfn == null) || (!fn.v.c.equals(paramfn.a())))
      throw new fk("Not an array schema: " + paramfn);
    this.b = paramfn;
    if (paramInt != 0)
      this.d = new Object[paramInt];
  }

  public int a(fr<T> paramfr)
  {
    return ft.a().a(this, paramfr, a());
  }

  public fn a()
  {
    return this.b;
  }

  public void add(int paramInt, T paramT)
  {
    if ((paramInt > this.c) || (paramInt < 0))
      throw new IndexOutOfBoundsException("Index " + paramInt + " out of bounds.");
    if (this.c == this.d.length)
    {
      Object[] arrayOfObject = new Object[1 + 3 * this.c / 2];
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.c);
      this.d = arrayOfObject;
    }
    System.arraycopy(this.d, paramInt, this.d, paramInt + 1, this.c - paramInt);
    this.d[paramInt] = paramT;
    this.c = (1 + this.c);
  }

  public boolean add(T paramT)
  {
    if (this.c == this.d.length)
    {
      Object[] arrayOfObject2 = new Object[1 + 3 * this.c / 2];
      System.arraycopy(this.d, 0, arrayOfObject2, 0, this.c);
      this.d = arrayOfObject2;
    }
    Object[] arrayOfObject1 = this.d;
    int i = this.c;
    this.c = (i + 1);
    arrayOfObject1[i] = paramT;
    return true;
  }

  public T b()
  {
    if (this.c < this.d.length)
      return this.d[this.c];
    return null;
  }

  public void clear()
  {
    this.c = 0;
  }

  public T get(int paramInt)
  {
    if (paramInt >= this.c)
      throw new IndexOutOfBoundsException("Index " + paramInt + " out of bounds.");
    return this.d[paramInt];
  }

  public Iterator<T> iterator()
  {
    return new Iterator()
    {
      private int b = 0;

      public boolean hasNext()
      {
        return this.b < ft.a.a(ft.a.this);
      }

      public T next()
      {
        Object[] arrayOfObject = ft.a.b(ft.a.this);
        int i = this.b;
        this.b = (i + 1);
        return arrayOfObject[i];
      }

      public void remove()
      {
        throw new UnsupportedOperationException();
      }
    };
  }

  public T remove(int paramInt)
  {
    if (paramInt >= this.c)
      throw new IndexOutOfBoundsException("Index " + paramInt + " out of bounds.");
    Object localObject = this.d[paramInt];
    this.c = (-1 + this.c);
    System.arraycopy(this.d, paramInt + 1, this.d, paramInt, this.c - paramInt);
    this.d[this.c] = null;
    return localObject;
  }

  public T set(int paramInt, T paramT)
  {
    if (paramInt >= this.c)
      throw new IndexOutOfBoundsException("Index " + paramInt + " out of bounds.");
    Object localObject = this.d[paramInt];
    this.d[paramInt] = paramT;
    return localObject;
  }

  public int size()
  {
    return this.c;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("[");
    int i = 0;
    Iterator localIterator = iterator();
    if (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (localObject == null);
      for (String str = "null"; ; str = localObject.toString())
      {
        localStringBuffer.append(str);
        i++;
        if (i >= size())
          break;
        localStringBuffer.append(", ");
        break;
      }
    }
    localStringBuffer.append("]");
    return localStringBuffer.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ft.a
 * JD-Core Version:    0.6.2
 */