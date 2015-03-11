package textnow.e;

import java.io.PrintWriter;

public final class n
{
  private static final Object a = new Object();
  private static char[] b = new char[24];

  private static int a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if ((paramInt1 > 99) || ((paramBoolean) && (paramInt3 >= 3)))
      return paramInt2 + 3;
    if ((paramInt1 > 9) || ((paramBoolean) && (paramInt3 >= 2)))
      return paramInt2 + 2;
    if ((paramBoolean) || (paramInt1 > 0))
      return paramInt2 + 1;
    return 0;
  }

  private static int a(char[] paramArrayOfChar, int paramInt1, char paramChar, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int n;
    int i;
    if ((paramBoolean) || (paramInt1 > 0))
    {
      if (((!paramBoolean) || (paramInt3 < 3)) && (paramInt1 <= 99))
        break label137;
      n = paramInt1 / 100;
      paramArrayOfChar[paramInt2] = ((char)(n + 48));
      i = paramInt2 + 1;
    }
    for (int j = paramInt1 - n * 100; ; j = paramInt1)
    {
      if (((paramBoolean) && (paramInt3 >= 2)) || (j > 9) || (paramInt2 != i))
      {
        int k = j / 10;
        paramArrayOfChar[i] = ((char)(k + 48));
        i++;
        j -= k * 10;
      }
      paramArrayOfChar[i] = ((char)(j + 48));
      int m = i + 1;
      paramArrayOfChar[m] = paramChar;
      paramInt2 = m + 1;
      return paramInt2;
      label137: i = paramInt2;
    }
  }

  public static void a(long paramLong1, long paramLong2, PrintWriter paramPrintWriter)
  {
    if (paramLong1 == 0L)
    {
      paramPrintWriter.print("--");
      return;
    }
    a(paramLong1 - paramLong2, paramPrintWriter, 0);
  }

  public static void a(long paramLong, PrintWriter paramPrintWriter)
  {
    a(paramLong, paramPrintWriter, 0);
  }

  private static void a(long paramLong, PrintWriter paramPrintWriter, int paramInt)
  {
    while (true)
    {
      int m;
      int j;
      synchronized (a)
      {
        if (b.length < 0)
          b = new char[0];
        char[] arrayOfChar = b;
        if (paramLong != 0L)
          break label354;
        arrayOfChar[0] = '0';
        int i = 1;
        paramPrintWriter.print(new String(b, 0, i));
        return;
        int k = (int)(paramLong % 1000L);
        m = (int)Math.floor(paramLong / 1000L);
        int n = 0;
        if (m > 86400)
        {
          n = m / 86400;
          m -= 86400 * n;
        }
        if (m <= 3600)
          break label344;
        int i1 = m / 3600;
        int i2 = m - i1 * 3600;
        i3 = i1;
        i4 = i2;
        if (i4 > 60)
        {
          int i5 = i4 / 60;
          int i6 = i4 - i5 * 60;
          i7 = i5;
          i8 = i6;
          arrayOfChar[0] = j;
          int i9 = a(arrayOfChar, n, 'd', 1, false, 0);
          if (i9 != 1)
          {
            bool1 = true;
            int i10 = a(arrayOfChar, i3, 'h', i9, bool1, 0);
            if (i10 == 1)
              continue;
            bool2 = true;
            int i11 = a(arrayOfChar, i7, 'm', i10, bool2, 0);
            if (i11 == 1)
              continue;
            bool3 = true;
            int i12 = a(arrayOfChar, k, 'm', a(arrayOfChar, i8, 's', i11, bool3, 0), true, 0);
            arrayOfChar[i12] = 's';
            i = i12 + 1;
            continue;
            paramLong = -paramLong;
            j = 45;
            continue;
          }
          boolean bool1 = false;
          continue;
          boolean bool2 = false;
          continue;
          boolean bool3 = false;
        }
      }
      int i8 = i4;
      int i7 = 0;
      continue;
      label344: int i4 = m;
      int i3 = 0;
      continue;
      label354: if (paramLong > 0L)
        j = 43;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.e.n
 * JD-Core Version:    0.6.2
 */