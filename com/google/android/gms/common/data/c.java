package com.google.android.gms.common.data;

import com.google.android.gms.internal.hm;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class c<T>
  implements Iterator<T>
{
  protected final DataBuffer<T> EA;
  protected int EB;

  public c(DataBuffer<T> paramDataBuffer)
  {
    this.EA = ((DataBuffer)hm.f(paramDataBuffer));
    this.EB = -1;
  }

  public boolean hasNext()
  {
    return this.EB < -1 + this.EA.getCount();
  }

  public T next()
  {
    if (!hasNext())
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.EB);
    DataBuffer localDataBuffer = this.EA;
    int i = 1 + this.EB;
    this.EB = i;
    return localDataBuffer.get(i);
  }

  public void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.c
 * JD-Core Version:    0.6.2
 */