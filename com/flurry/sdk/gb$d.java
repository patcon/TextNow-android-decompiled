package com.flurry.sdk;

import java.io.EOFException;
import java.io.InputStream;

class gb$d extends gb.c
{
  protected boolean b = false;
  private InputStream c;

  private gb$d(InputStream paramInputStream)
  {
    this.c = paramInputStream;
  }

  protected void a(long paramLong)
  {
    int i = 0;
    while (paramLong > 0L)
    {
      long l = this.c.skip(paramLong);
      if (l > 0L)
      {
        paramLong -= l;
      }
      else if (l == 0L)
      {
        if (i != 0)
        {
          this.b = true;
          throw new EOFException();
        }
        i = 1;
      }
      else
      {
        this.b = true;
        throw new EOFException();
      }
    }
  }

  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while (paramInt2 > 0)
    {
      int i = this.c.read(paramArrayOfByte, paramInt1, paramInt2);
      if (i < 0)
      {
        this.b = true;
        throw new EOFException();
      }
      paramInt2 -= i;
      paramInt1 += i;
    }
  }

  protected int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    while (true)
    {
      if (i > 0);
      try
      {
        int j = this.c.read(paramArrayOfByte, paramInt1, i);
        if (j < 0)
        {
          this.b = true;
          return paramInt2 - i;
        }
        i -= j;
        paramInt1 += j;
      }
      catch (EOFException localEOFException)
      {
        while (true)
          this.b = true;
      }
    }
  }

  protected long b(long paramLong)
  {
    int i = 0;
    long l1 = paramLong;
    while (true)
      if (l1 > 0L)
      {
        try
        {
          long l2 = this.c.skip(paramLong);
          if (l2 > 0L)
          {
            l1 -= l2;
            continue;
          }
          if (l2 == 0L)
          {
            if (i == 0)
              break label78;
            this.b = true;
          }
          else
          {
            this.b = true;
          }
        }
        catch (EOFException localEOFException)
        {
          this.b = true;
        }
      }
      else
      {
        return paramLong - l1;
        label78: i = 1;
      }
  }

  public void close()
  {
    this.c.close();
  }

  public int read()
  {
    if (this.a.c() - this.a.b() == 0)
      return this.c.read();
    int i = this.a.b();
    int j = 0xFF & this.a.d()[i];
    this.a.a(i + 1);
    return j;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gb.d
 * JD-Core Version:    0.6.2
 */