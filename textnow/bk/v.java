package textnow.bk;

abstract class v extends bq
{
  protected final q a;
  private final bw<?> b;

  public v(q paramq, bw<?> parambw)
  {
    this.a = paramq;
    this.b = parambw;
  }

  public final int a()
  {
    ay localay = this.a.d();
    switch (bs.1.a[localay.ordinal()])
    {
    default:
      throw new IllegalArgumentException("Unrecognized ImageRequestType!");
    case 1:
      return 0;
    case 2:
      return 1;
    case 3:
      return 2;
    case 4:
      return 3;
    case 5:
    case 6:
    case 7:
      return 4;
    case 8:
      return 5;
    case 9:
    }
    return 6;
  }

  public final bw<?> b()
  {
    return this.b;
  }

  public final q c()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.v
 * JD-Core Version:    0.6.2
 */