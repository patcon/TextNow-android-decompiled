package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public final class fp$a
{
  private final String mName;
  private String yi;
  private boolean yj;
  private int yk;
  private boolean yl;
  private String ym;
  private final List<fm> yn;
  private BitSet yo;
  private String yp;

  public fp$a(String paramString)
  {
    this.mName = paramString;
    this.yk = 1;
    this.yn = new ArrayList();
  }

  public final a I(int paramInt)
  {
    if (this.yo == null)
      this.yo = new BitSet();
    this.yo.set(paramInt);
    return this;
  }

  public final a Z(String paramString)
  {
    this.yi = paramString;
    return this;
  }

  public final a aa(String paramString)
  {
    this.yp = paramString;
    return this;
  }

  public final fp dQ()
  {
    int i = 0;
    BitSet localBitSet = this.yo;
    int[] arrayOfInt = null;
    if (localBitSet != null)
    {
      arrayOfInt = new int[this.yo.cardinality()];
      int j = this.yo.nextSetBit(0);
      while (j >= 0)
      {
        int k = i + 1;
        arrayOfInt[i] = j;
        j = this.yo.nextSetBit(j + 1);
        i = k;
      }
    }
    return new fp(this.mName, this.yi, this.yj, this.yk, this.yl, this.ym, (fm[])this.yn.toArray(new fm[this.yn.size()]), arrayOfInt, this.yp);
  }

  public final a w(boolean paramBoolean)
  {
    this.yj = paramBoolean;
    return this;
  }

  public final a x(boolean paramBoolean)
  {
    this.yl = paramBoolean;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fp.a
 * JD-Core Version:    0.6.2
 */