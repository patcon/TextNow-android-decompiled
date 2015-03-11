package textnow.bd;

abstract class u extends bo
{
  protected final p a;
  private final bu<?> b;

  public u(p paramp, bu<?> parambu)
  {
    this.a = paramp;
    this.b = parambu;
  }

  public final int a()
  {
    ax localax = this.a.d();
    switch (bq.1.a[localax.ordinal()])
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

  public final bu<?> b()
  {
    return this.b;
  }

  public final p c()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.u
 * JD-Core Version:    0.6.2
 */