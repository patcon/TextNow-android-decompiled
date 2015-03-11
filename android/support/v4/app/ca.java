package android.support.v4.app;

import android.os.Bundle;

public final class ca
{
  private final String a;
  private CharSequence b;
  private CharSequence[] c;
  private boolean d = true;
  private Bundle e = new Bundle();

  public ca(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("Result key can't be null");
    this.a = paramString;
  }

  public final bz a()
  {
    return new bz(this.a, this.b, this.c, this.d, this.e);
  }

  public final ca a(CharSequence paramCharSequence)
  {
    this.b = paramCharSequence;
    return this;
  }

  public final ca a(CharSequence[] paramArrayOfCharSequence)
  {
    this.c = paramArrayOfCharSequence;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ca
 * JD-Core Version:    0.6.2
 */