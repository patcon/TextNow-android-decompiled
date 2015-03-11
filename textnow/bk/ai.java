package textnow.bk;

final class ai<T>
{
  T a;
  private ai<T> b = null;
  private ai<T> c = null;

  ai(T paramT)
  {
    this.a = paramT;
  }

  public final ai<T> a()
  {
    return this.b;
  }

  public final void a(ai<T> paramai)
  {
    this.b = paramai;
  }

  public final ai<T> b()
  {
    return this.c;
  }

  public final void b(ai<T> paramai)
  {
    this.c = paramai;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.ai
 * JD-Core Version:    0.6.2
 */