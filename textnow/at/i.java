package textnow.at;

final class i extends g
{
  int d;

  i(float paramFloat)
  {
    this.a = paramFloat;
    this.b = Integer.TYPE;
  }

  i(float paramFloat, int paramInt)
  {
    this.a = paramFloat;
    this.d = paramInt;
    this.b = Integer.TYPE;
    this.c = true;
  }

  private i f()
  {
    i locali = new i(this.a, this.d);
    locali.a(c());
    return locali;
  }

  public final Object a()
  {
    return Integer.valueOf(this.d);
  }

  public final int e()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.at.i
 * JD-Core Version:    0.6.2
 */