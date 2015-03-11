package com.google.android.gms.internal;

import java.util.ArrayList;

public class nj
{
  private final ArrayList<nj.a> akK = new ArrayList();
  private int akL;

  public nj()
  {
    this(100);
  }

  public nj(int paramInt)
  {
    this.akL = paramInt;
  }

  private void mX()
  {
    while (getSize() > getCapacity())
      this.akK.remove(0);
  }

  public void a(nm paramnm, ni paramni)
  {
    this.akK.add(new nj.a(paramnm, paramni, null));
    mX();
  }

  public void clear()
  {
    this.akK.clear();
  }

  public int getCapacity()
  {
    return this.akL;
  }

  public int getSize()
  {
    return this.akK.size();
  }

  public boolean isEmpty()
  {
    return this.akK.isEmpty();
  }

  public ArrayList<nj.a> mW()
  {
    return this.akK;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nj
 * JD-Core Version:    0.6.2
 */