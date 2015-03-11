package textnow.p;

public final class c extends Exception
{
  j a;

  public c(int paramInt, String paramString)
  {
    this(new j(paramInt, paramString));
  }

  public c(int paramInt, String paramString, Exception paramException)
  {
    this(new j(paramInt, paramString), paramException);
  }

  private c(j paramj)
  {
    this(paramj, null);
  }

  private c(j paramj, Exception paramException)
  {
    super(paramj.b, paramException);
    this.a = paramj;
  }

  public final j a()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.p.c
 * JD-Core Version:    0.6.2
 */