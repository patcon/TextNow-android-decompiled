package textnow.am;

final class h extends g
{
  float d;

  h(float paramFloat)
  {
    this.a = paramFloat;
    this.b = Float.TYPE;
  }

  h(float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat1;
    this.d = paramFloat2;
    this.b = Float.TYPE;
    this.c = true;
  }

  private h f()
  {
    h localh = new h(this.a, this.d);
    localh.a(c());
    return localh;
  }

  public final Object a()
  {
    return Float.valueOf(this.d);
  }

  public final float e()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.am.h
 * JD-Core Version:    0.6.2
 */