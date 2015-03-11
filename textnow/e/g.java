package textnow.e;

import java.util.Iterator;

final class g<T>
  implements Iterator<T>
{
  final int a;
  int b;
  int c;
  boolean d = false;

  g(f paramf, int paramInt)
  {
    this.a = paramInt;
    this.b = paramf.a();
  }

  public final boolean hasNext()
  {
    return this.c < this.b;
  }

  public final T next()
  {
    Object localObject = this.e.a(this.c, this.a);
    this.c = (1 + this.c);
    this.d = true;
    return localObject;
  }

  public final void remove()
  {
    if (!this.d)
      throw new IllegalStateException();
    this.c = (-1 + this.c);
    this.b = (-1 + this.b);
    this.d = false;
    this.e.a(this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.e.g
 * JD-Core Version:    0.6.2
 */