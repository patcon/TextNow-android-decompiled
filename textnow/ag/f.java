package textnow.ag;

import textnow.al.a;
import textnow.al.c;

final class f<T> extends s<T>
{
  private s<T> a;

  public final T a(a parama)
  {
    if (this.a == null)
      throw new IllegalStateException();
    return this.a.a(parama);
  }

  public final void a(s<T> params)
  {
    if (this.a != null)
      throw new AssertionError();
    this.a = params;
  }

  public final void a(c paramc, T paramT)
  {
    if (this.a == null)
      throw new IllegalStateException();
    this.a.a(paramc, paramT);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ag.f
 * JD-Core Version:    0.6.2
 */