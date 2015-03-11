package com.flurry.sdk;

import java.io.Writer;

public final class il extends Writer
{
  protected final sp a;

  public il(si paramsi)
  {
    this.a = new sp(paramsi);
  }

  public final String a()
  {
    String str = this.a.f();
    this.a.a();
    return str;
  }

  public final Writer append(char paramChar)
  {
    write(paramChar);
    return this;
  }

  public final Writer append(CharSequence paramCharSequence)
  {
    String str = paramCharSequence.toString();
    this.a.a(str, 0, str.length());
    return this;
  }

  public final Writer append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    String str = paramCharSequence.subSequence(paramInt1, paramInt2).toString();
    this.a.a(str, 0, str.length());
    return this;
  }

  public final void close()
  {
  }

  public final void flush()
  {
  }

  public final void write(int paramInt)
  {
    this.a.a((char)paramInt);
  }

  public final void write(String paramString)
  {
    this.a.a(paramString, 0, paramString.length());
  }

  public final void write(String paramString, int paramInt1, int paramInt2)
  {
    this.a.a(paramString, 0, paramString.length());
  }

  public final void write(char[] paramArrayOfChar)
  {
    this.a.c(paramArrayOfChar, 0, paramArrayOfChar.length);
  }

  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.a.c(paramArrayOfChar, paramInt1, paramInt2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.il
 * JD-Core Version:    0.6.2
 */