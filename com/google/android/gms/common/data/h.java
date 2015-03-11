package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

public class h<T> extends c<T>
{
  private T EW;

  public h(DataBuffer<T> paramDataBuffer)
  {
    super(paramDataBuffer);
  }

  public T next()
  {
    if (!hasNext())
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.EB);
    this.EB = (1 + this.EB);
    if (this.EB == 0)
    {
      this.EW = this.EA.get(0);
      if (!(this.EW instanceof d))
        throw new IllegalStateException("DataBuffer reference of type " + this.EW.getClass() + " is not movable");
    }
    else
    {
      ((d)this.EW).ac(this.EB);
    }
    return this.EW;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.h
 * JD-Core Version:    0.6.2
 */