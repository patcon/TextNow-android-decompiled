package com.flurry.sdk;

public class si
{
  protected final byte[][] a = new byte[si.a.values().length][];
  protected final char[][] b = new char[si.b.values().length][];

  private final byte[] a(int paramInt)
  {
    return new byte[paramInt];
  }

  private final char[] b(int paramInt)
  {
    return new char[paramInt];
  }

  public final void a(si.a parama, byte[] paramArrayOfByte)
  {
    this.a[parama.ordinal()] = paramArrayOfByte;
  }

  public final void a(si.b paramb, char[] paramArrayOfChar)
  {
    this.b[paramb.ordinal()] = paramArrayOfChar;
  }

  public final byte[] a(si.a parama)
  {
    int i = parama.ordinal();
    byte[] arrayOfByte = this.a[i];
    if (arrayOfByte == null)
      return a(si.a.a(parama));
    this.a[i] = null;
    return arrayOfByte;
  }

  public final char[] a(si.b paramb)
  {
    return a(paramb, 0);
  }

  public final char[] a(si.b paramb, int paramInt)
  {
    if (si.b.a(paramb) > paramInt)
      paramInt = si.b.a(paramb);
    int i = paramb.ordinal();
    char[] arrayOfChar = this.b[i];
    if ((arrayOfChar == null) || (arrayOfChar.length < paramInt))
      return b(paramInt);
    this.b[i] = null;
    return arrayOfChar;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.si
 * JD-Core Version:    0.6.2
 */