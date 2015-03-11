package android.support.v7.widget;

import android.util.SparseIntArray;

public abstract class u
{
  final SparseIntArray a;
  private boolean b;

  private int c(int paramInt1, int paramInt2)
  {
    int i = a();
    if (i == paramInt2)
      return 0;
    int i5;
    int k;
    int j;
    if ((this.b) && (this.a.size() > 0))
    {
      int i2 = -1 + this.a.size();
      int i3 = 0;
      while (i3 <= i2)
      {
        int i6 = i3 + i2 >>> 1;
        if (this.a.keyAt(i6) < paramInt1)
          i3 = i6 + 1;
        else
          i2 = i6 - 1;
      }
      int i4 = i3 - 1;
      if ((i4 >= 0) && (i4 < this.a.size()))
      {
        i5 = this.a.keyAt(i4);
        if (i5 < 0)
          break label223;
        k = this.a.get(i5) + a();
        j = i5 + 1;
      }
    }
    while (true)
    {
      int m = j;
      label155: if (m < paramInt1)
      {
        int n = a();
        int i1 = k + n;
        if (i1 == paramInt2)
          n = 0;
        while (true)
        {
          m++;
          k = n;
          break label155;
          i5 = -1;
          break;
          if (i1 <= paramInt2)
            n = i1;
        }
      }
      if (k + i > paramInt2)
        break;
      return k;
      label223: j = 0;
      k = 0;
    }
  }

  public abstract int a();

  final int a(int paramInt1, int paramInt2)
  {
    int i;
    if (!this.b)
      i = c(paramInt1, paramInt2);
    do
    {
      return i;
      i = this.a.get(paramInt1, -1);
    }
    while (i != -1);
    int j = c(paramInt1, paramInt2);
    this.a.put(paramInt1, j);
    return j;
  }

  public final int b(int paramInt1, int paramInt2)
  {
    int i = a();
    int j = 0;
    int k = 0;
    int m = 0;
    int n;
    int i1;
    if (j < paramInt1)
    {
      n = a();
      i1 = m + n;
      if (i1 == paramInt2)
      {
        k++;
        n = 0;
      }
    }
    while (true)
    {
      j++;
      m = n;
      break;
      if (i1 > paramInt2)
      {
        k++;
        continue;
        if (m + i > paramInt2)
          k++;
        return k;
      }
      else
      {
        n = i1;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.u
 * JD-Core Version:    0.6.2
 */