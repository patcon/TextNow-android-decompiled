package com.flurry.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class qw$a<T>
  implements Iterable<T>, Iterator<T>
{
  private final T[] a;
  private int b;

  public qw$a(T[] paramArrayOfT)
  {
    this.a = paramArrayOfT;
    this.b = 0;
  }

  public final boolean hasNext()
  {
    return this.b < this.a.length;
  }

  public final Iterator<T> iterator()
  {
    return this;
  }

  public final T next()
  {
    if (this.b >= this.a.length)
      throw new NoSuchElementException();
    Object[] arrayOfObject = this.a;
    int i = this.b;
    this.b = (i + 1);
    return arrayOfObject[i];
  }

  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qw.a
 * JD-Core Version:    0.6.2
 */