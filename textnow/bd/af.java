package textnow.bd;

final class af<T>
{
  T a;
  private af<T> b = null;
  private af<T> c = null;

  af(T paramT)
  {
    this.a = paramT;
  }

  public final af<T> a()
  {
    return this.b;
  }

  public final void a(af<T> paramaf)
  {
    this.b = paramaf;
  }

  public final af<T> b()
  {
    return this.c;
  }

  public final void b(af<T> paramaf)
  {
    this.c = paramaf;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.af
 * JD-Core Version:    0.6.2
 */