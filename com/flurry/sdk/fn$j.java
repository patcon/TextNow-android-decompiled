package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class fn$j<E> extends ArrayList<E>
{
  private boolean a = false;

  public fn$j()
  {
  }

  public fn$j(int paramInt)
  {
    super(paramInt);
  }

  public fn$j(List<E> paramList)
  {
    super(paramList);
  }

  private void b()
  {
    if (this.a)
      throw new IllegalStateException();
  }

  public List<E> a()
  {
    this.a = true;
    return this;
  }

  public boolean add(E paramE)
  {
    b();
    return super.add(paramE);
  }

  public boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    b();
    return super.addAll(paramInt, paramCollection);
  }

  public boolean addAll(Collection<? extends E> paramCollection)
  {
    b();
    return super.addAll(paramCollection);
  }

  public void clear()
  {
    b();
    super.clear();
  }

  public E remove(int paramInt)
  {
    b();
    return super.remove(paramInt);
  }

  public boolean remove(Object paramObject)
  {
    b();
    return super.remove(paramObject);
  }

  public boolean removeAll(Collection<?> paramCollection)
  {
    b();
    return super.removeAll(paramCollection);
  }

  public boolean retainAll(Collection<?> paramCollection)
  {
    b();
    return super.retainAll(paramCollection);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.j
 * JD-Core Version:    0.6.2
 */