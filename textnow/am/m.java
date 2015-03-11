package textnow.am;

final class m extends k
{
  f h;
  int i;

  public m(String paramString, int[] paramArrayOfInt)
  {
    super(paramString, (byte)0);
    a(paramArrayOfInt);
  }

  private m e()
  {
    m localm = (m)super.a();
    localm.h = ((f)localm.e);
    return localm;
  }

  final void a(float paramFloat)
  {
    this.i = this.h.b(paramFloat);
  }

  public final void a(int[] paramArrayOfInt)
  {
    super.a(paramArrayOfInt);
    this.h = ((f)this.e);
  }

  final Object d()
  {
    return Integer.valueOf(this.i);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.am.m
 * JD-Core Version:    0.6.2
 */