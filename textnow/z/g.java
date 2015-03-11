package textnow.z;

import textnow.ae.a;
import textnow.ae.c;

final class g<T> extends y<T>
{
  private y<T> a;

  public final T a(a parama)
  {
    if (this.a == null)
      throw new IllegalStateException();
    return this.a.a(parama);
  }

  public final void a(c paramc, T paramT)
  {
    if (this.a == null)
      throw new IllegalStateException();
    this.a.a(paramc, paramT);
  }

  public final void a(y<T> paramy)
  {
    if (this.a != null)
      throw new AssertionError();
    this.a = paramy;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.z.g
 * JD-Core Version:    0.6.2
 */