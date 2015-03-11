package android.support.v4.view;

import android.view.KeyEvent;

class r
  implements u
{
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = 1;
    int j;
    int k;
    if ((paramInt2 & paramInt3) != 0)
    {
      j = i;
      k = paramInt4 | paramInt5;
      if ((paramInt2 & k) == 0)
        break label52;
    }
    while (true)
      if (j != 0)
      {
        if (i != 0)
        {
          throw new IllegalArgumentException("bad arguments");
          j = 0;
          break;
          label52: i = 0;
          continue;
        }
        paramInt1 &= (k ^ 0xFFFFFFFF);
      }
    while (i == 0)
      return paramInt1;
    return paramInt1 & (paramInt3 ^ 0xFFFFFFFF);
  }

  public int a(int paramInt)
  {
    if ((paramInt & 0xC0) != 0);
    for (int i = paramInt | 0x1; ; i = paramInt)
    {
      if ((i & 0x30) != 0)
        i |= 2;
      return i & 0xF7;
    }
  }

  public void a(KeyEvent paramKeyEvent)
  {
  }

  public boolean a(int paramInt1, int paramInt2)
  {
    return a(a(0xF7 & a(paramInt1), paramInt2, 1, 64, 128), paramInt2, 2, 16, 32) == paramInt2;
  }

  public boolean b(int paramInt)
  {
    return (0xF7 & a(paramInt)) == 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.r
 * JD-Core Version:    0.6.2
 */