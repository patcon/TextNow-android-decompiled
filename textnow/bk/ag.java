package textnow.bk;

final class ag<T>
{
  T a;
  private ag<T> b = null;
  private ag<T> c = null;

  ag(T paramT)
  {
    this.a = paramT;
  }

  public final ag<T> a()
  {
    return this.b;
  }

  public final void a(ag<T> paramag)
  {
    this.b = paramag;
  }

  public final ag<T> b()
  {
    return this.c;
  }

  public final void b(ag<T> paramag)
  {
    this.c = paramag;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.ag
 * JD-Core Version:    0.6.2
 */