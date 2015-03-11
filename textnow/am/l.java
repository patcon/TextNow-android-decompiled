package textnow.am;

final class l extends k
{
  d h;
  float i;

  public l(String paramString, float[] paramArrayOfFloat)
  {
    super(paramString, (byte)0);
    a(paramArrayOfFloat);
  }

  private l e()
  {
    l locall = (l)super.a();
    locall.h = ((d)locall.e);
    return locall;
  }

  final void a(float paramFloat)
  {
    this.i = this.h.b(paramFloat);
  }

  public final void a(float[] paramArrayOfFloat)
  {
    super.a(paramArrayOfFloat);
    this.h = ((d)this.e);
  }

  final Object d()
  {
    return Float.valueOf(this.i);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.am.l
 * JD-Core Version:    0.6.2
 */