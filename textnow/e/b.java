package textnow.e;

final class b
{
  static final int[] a = new int[0];
  static final long[] b = new long[0];
  static final Object[] c = new Object[0];

  public static int a(int paramInt)
  {
    int i = paramInt * 4;
    for (int j = 4; ; j++)
      if (j < 32)
      {
        if (i <= -12 + (1 << j))
          i = -12 + (1 << j);
      }
      else
        return i / 4;
  }

  static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramInt1 - 1;
    int j = 0;
    while (j <= i)
    {
      k = j + i >>> 1;
      int m = paramArrayOfInt[k];
      if (m < paramInt2)
      {
        j = k + 1;
      }
      else
      {
        if (m <= paramInt2)
          break label62;
        i = k - 1;
      }
    }
    int k = j ^ 0xFFFFFFFF;
    label62: return k;
  }

  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.e.b
 * JD-Core Version:    0.6.2
 */