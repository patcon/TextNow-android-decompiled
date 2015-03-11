package com.flurry.sdk;

import java.io.Closeable;
import java.io.InputStream;

public final class fh$c
  implements Closeable
{
  private final String b;
  private final long c;
  private final InputStream[] d;
  private final long[] e;

  private fh$c(fh paramfh, String paramString, long paramLong, InputStream[] paramArrayOfInputStream, long[] paramArrayOfLong)
  {
    this.b = paramString;
    this.c = paramLong;
    this.d = paramArrayOfInputStream;
    this.e = paramArrayOfLong;
  }

  public final InputStream a(int paramInt)
  {
    return this.d[paramInt];
  }

  public final void close()
  {
    InputStream[] arrayOfInputStream = this.d;
    int i = arrayOfInputStream.length;
    for (int j = 0; j < i; j++)
      fj.a(arrayOfInputStream[j]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fh.c
 * JD-Core Version:    0.6.2
 */