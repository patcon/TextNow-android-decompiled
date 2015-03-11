package textnow.ah;

final class s
  implements CharSequence
{
  char[] a;

  public final char charAt(int paramInt)
  {
    return this.a[paramInt];
  }

  public final int length()
  {
    return this.a.length;
  }

  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return new String(this.a, paramInt1, paramInt2 - paramInt1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ah.s
 * JD-Core Version:    0.6.2
 */