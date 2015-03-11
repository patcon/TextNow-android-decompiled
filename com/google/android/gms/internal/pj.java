package com.google.android.gms.internal;

class pj
{
  private static final pk awM = new pk();
  private boolean awN = false;
  private int[] awO;
  private pk[] awP;
  private int mSize;

  public pj()
  {
    this(10);
  }

  public pj(int paramInt)
  {
    int i = idealIntArraySize(paramInt);
    this.awO = new int[i];
    this.awP = new pk[i];
    this.mSize = 0;
  }

  private boolean a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      if (paramArrayOfInt1[i] != paramArrayOfInt2[i])
        return false;
    return true;
  }

  private boolean a(pk[] paramArrayOfpk1, pk[] paramArrayOfpk2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      if (!paramArrayOfpk1[i].equals(paramArrayOfpk2[i]))
        return false;
    return true;
  }

  private int gG(int paramInt)
  {
    int i = -1 + this.mSize;
    int j = 0;
    int k = i;
    while (j <= k)
    {
      m = j + k >>> 1;
      int n = this.awO[m];
      if (n < paramInt)
      {
        j = m + 1;
      }
      else
      {
        if (n <= paramInt)
          break label69;
        k = m - 1;
      }
    }
    int m = j ^ 0xFFFFFFFF;
    label69: return m;
  }

  private void gc()
  {
    int i = this.mSize;
    int[] arrayOfInt = this.awO;
    pk[] arrayOfpk = this.awP;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      pk localpk = arrayOfpk[j];
      if (localpk != awM)
      {
        if (j != k)
        {
          arrayOfInt[k] = arrayOfInt[j];
          arrayOfpk[k] = localpk;
          arrayOfpk[j] = null;
        }
        k++;
      }
      j++;
    }
    this.awN = false;
    this.mSize = k;
  }

  private int idealByteArraySize(int paramInt)
  {
    for (int i = 4; ; i++)
      if (i < 32)
      {
        if (paramInt <= -12 + (1 << i))
          paramInt = -12 + (1 << i);
      }
      else
        return paramInt;
  }

  private int idealIntArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }

  public void a(int paramInt, pk parampk)
  {
    int i = gG(paramInt);
    if (i >= 0)
    {
      this.awP[i] = parampk;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.mSize) && (this.awP[j] == awM))
    {
      this.awO[j] = paramInt;
      this.awP[j] = parampk;
      return;
    }
    if ((this.awN) && (this.mSize >= this.awO.length))
    {
      gc();
      j = 0xFFFFFFFF ^ gG(paramInt);
    }
    if (this.mSize >= this.awO.length)
    {
      int k = idealIntArraySize(1 + this.mSize);
      int[] arrayOfInt = new int[k];
      pk[] arrayOfpk = new pk[k];
      System.arraycopy(this.awO, 0, arrayOfInt, 0, this.awO.length);
      System.arraycopy(this.awP, 0, arrayOfpk, 0, this.awP.length);
      this.awO = arrayOfInt;
      this.awP = arrayOfpk;
    }
    if (this.mSize - j != 0)
    {
      System.arraycopy(this.awO, j, this.awO, j + 1, this.mSize - j);
      System.arraycopy(this.awP, j, this.awP, j + 1, this.mSize - j);
    }
    this.awO[j] = paramInt;
    this.awP[j] = parampk;
    this.mSize = (1 + this.mSize);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    pj localpj;
    do
    {
      return true;
      if (!(paramObject instanceof pj))
        return false;
      localpj = (pj)paramObject;
      if (size() != localpj.size())
        return false;
    }
    while ((a(this.awO, localpj.awO, this.mSize)) && (a(this.awP, localpj.awP, this.mSize)));
    return false;
  }

  public pk gE(int paramInt)
  {
    int i = gG(paramInt);
    if ((i < 0) || (this.awP[i] == awM))
      return null;
    return this.awP[i];
  }

  public pk gF(int paramInt)
  {
    if (this.awN)
      gc();
    return this.awP[paramInt];
  }

  public int hashCode()
  {
    if (this.awN)
      gc();
    int i = 17;
    for (int j = 0; j < this.mSize; j++)
      i = 31 * (i * 31 + this.awO[j]) + this.awP[j].hashCode();
    return i;
  }

  public boolean isEmpty()
  {
    return size() == 0;
  }

  public int size()
  {
    if (this.awN)
      gc();
    return this.mSize;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pj
 * JD-Core Version:    0.6.2
 */