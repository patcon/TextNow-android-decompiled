package textnow.bd;

final class o extends n
{
  private final int a;
  private final int b;

  private o(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }

  public static o a(int paramInt1, int paramInt2)
  {
    return new o(paramInt1, paramInt2);
  }

  public final String a()
  {
    return "screenSize: { width: " + this.a + ", height: " + this.b + " }";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bd.o
 * JD-Core Version:    0.6.2
 */