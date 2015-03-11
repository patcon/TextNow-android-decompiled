package textnow.af;

import textnow.ak.a;
import textnow.ak.c;

final class g<T> extends y<T>
{
  private y<T> a;

  public final T a(a parama)
  {
    if (this.a == null)
      throw new IllegalStateException();
    return this.a.a(parama);
  }

  public final void a(y<T> paramy)
  {
    if (this.a != null)
      throw new AssertionError();
    this.a = paramy;
  }

  public final void a(c paramc, T paramT)
  {
    if (this.a == null)
      throw new IllegalStateException();
    this.a.a(paramc, paramT);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.af.g
 * JD-Core Version:    0.6.2
 */