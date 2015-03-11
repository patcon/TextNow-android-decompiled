package textnow.ao;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class o<T>
  implements Iterator<T>
{
  p<K, V> b = this.e.c.d;
  p<K, V> c = null;
  int d = this.e.e;

  private o(j paramj)
  {
  }

  final p<K, V> a()
  {
    p localp = this.b;
    if (localp == this.e.c)
      throw new NoSuchElementException();
    if (this.e.e != this.d)
      throw new ConcurrentModificationException();
    this.b = localp.d;
    this.c = localp;
    return localp;
  }

  public final boolean hasNext()
  {
    return this.b != this.e.c;
  }

  public final void remove()
  {
    if (this.c == null)
      throw new IllegalStateException();
    this.e.a(this.c, true);
    this.c = null;
    this.d = this.e.e;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ao.o
 * JD-Core Version:    0.6.2
 */