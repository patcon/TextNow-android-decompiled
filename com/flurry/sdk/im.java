package com.flurry.sdk;

public class im
  implements hp
{
  protected final String a;
  protected byte[] b;
  protected byte[] c;
  protected char[] d;

  public im(String paramString)
  {
    this.a = paramString;
  }

  public final String a()
  {
    return this.a;
  }

  public final char[] b()
  {
    char[] arrayOfChar = this.d;
    if (arrayOfChar == null)
    {
      arrayOfChar = ig.a().a(this.a);
      this.d = arrayOfChar;
    }
    return arrayOfChar;
  }

  public final byte[] c()
  {
    byte[] arrayOfByte = this.c;
    if (arrayOfByte == null)
    {
      arrayOfByte = ig.a().c(this.a);
      this.c = arrayOfByte;
    }
    return arrayOfByte;
  }

  public final byte[] d()
  {
    byte[] arrayOfByte = this.b;
    if (arrayOfByte == null)
    {
      arrayOfByte = ig.a().b(this.a);
      this.b = arrayOfByte;
    }
    return arrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject == null) || (paramObject.getClass() != getClass()))
      return false;
    im localim = (im)paramObject;
    return this.a.equals(localim.a);
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final String toString()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.im
 * JD-Core Version:    0.6.2
 */