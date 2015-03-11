package com.flurry.sdk;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class fh$b
{
  private final String b;
  private final long[] c;
  private boolean d;
  private fh.a e;
  private long f;

  private fh$b(fh paramfh, String paramString)
  {
    this.b = paramString;
    this.c = new long[fh.e(paramfh)];
  }

  private void a(String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != fh.e(this.a))
      throw b(paramArrayOfString);
    int i = 0;
    try
    {
      while (i < paramArrayOfString.length)
      {
        this.c[i] = Long.parseLong(paramArrayOfString[i]);
        i++;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw b(paramArrayOfString);
    }
  }

  private IOException b(String[] paramArrayOfString)
  {
    throw new IOException("unexpected journal line: " + Arrays.toString(paramArrayOfString));
  }

  public final File a(int paramInt)
  {
    return new File(fh.f(this.a), this.b + "." + paramInt);
  }

  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (long l : this.c)
      localStringBuilder.append(' ').append(l);
    return localStringBuilder.toString();
  }

  public final File b(int paramInt)
  {
    return new File(fh.f(this.a), this.b + "." + paramInt + ".tmp");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fh.b
 * JD-Core Version:    0.6.2
 */