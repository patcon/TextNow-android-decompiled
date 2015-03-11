package textnow.bi;

public abstract class h
{
  protected String a = "";
  protected g b;
  protected String c;
  protected byte[] d;

  public h(String paramString, k paramk)
  {
    if (paramString != null)
      this.a = paramString;
    if (paramk != null)
    {
      String str = paramk.a();
      this.a = (this.a + "?" + str);
    }
  }

  public final String a()
  {
    return this.a;
  }

  public final g b()
  {
    return this.b;
  }

  public final String c()
  {
    return this.c;
  }

  public final byte[] d()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bi.h
 * JD-Core Version:    0.6.2
 */