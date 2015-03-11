package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class fi
  implements Closeable
{
  private final InputStream a;
  private final Charset b;
  private byte[] c;
  private int d;
  private int e;

  public fi(InputStream paramInputStream, int paramInt, Charset paramCharset)
  {
    if ((paramInputStream == null) || (paramCharset == null))
      throw new NullPointerException();
    if (paramInt < 0)
      throw new IllegalArgumentException("capacity <= 0");
    if (!paramCharset.equals(fj.a))
      throw new IllegalArgumentException("Unsupported encoding");
    this.a = paramInputStream;
    this.b = paramCharset;
    this.c = new byte[paramInt];
  }

  public fi(InputStream paramInputStream, Charset paramCharset)
  {
    this(paramInputStream, 8192, paramCharset);
  }

  private void b()
  {
    int i = this.a.read(this.c, 0, this.c.length);
    if (i == -1)
      throw new EOFException();
    this.d = 0;
    this.e = i;
  }

  public String a()
  {
    synchronized (this.a)
    {
      if (this.c == null)
        throw new IOException("LineReader is closed");
    }
    if (this.d >= this.e)
      b();
    for (int i = this.d; ; i++)
    {
      if (i != this.e)
      {
        if (this.c[i] != 10)
          continue;
        if ((i == this.d) || (this.c[(i - 1)] != 13))
          break label272;
      }
      label272: for (int k = i - 1; ; k = i)
      {
        String str2 = new String(this.c, this.d, k - this.d, this.b.name());
        this.d = (i + 1);
        return str2;
        ByteArrayOutputStream local1 = new ByteArrayOutputStream(80 + (this.e - this.d))
        {
          public String toString()
          {
            int i;
            if ((this.count > 0) && (this.buf[(-1 + this.count)] == 13))
              i = -1 + this.count;
            try
            {
              while (true)
              {
                String str = new String(this.buf, 0, i, fi.a(fi.this).name());
                return str;
                i = this.count;
              }
            }
            catch (UnsupportedEncodingException localUnsupportedEncodingException)
            {
              throw new AssertionError(localUnsupportedEncodingException);
            }
          }
        };
        while (true)
        {
          local1.write(this.c, this.d, this.e - this.d);
          this.e = -1;
          b();
          for (int j = this.d; j != this.e; j++)
            if (this.c[j] == 10)
            {
              if (j != this.d)
                local1.write(this.c, this.d, j - this.d);
              this.d = (j + 1);
              String str1 = local1.toString();
              return str1;
            }
        }
      }
    }
  }

  public void close()
  {
    synchronized (this.a)
    {
      if (this.c != null)
      {
        this.c = null;
        this.a.close();
      }
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fi
 * JD-Core Version:    0.6.2
 */