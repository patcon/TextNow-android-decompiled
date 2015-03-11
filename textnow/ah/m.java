package textnow.ah;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class m<T>
  implements Iterator<T>
{
  n<K, V> b = this.e.e.d;
  n<K, V> c = null;
  int d = this.e.d;

  private m(j paramj)
  {
  }

  final n<K, V> a()
  {
    n localn = this.b;
    if (localn == this.e.e)
      throw new NoSuchElementException();
    if (this.e.d != this.d)
      throw new ConcurrentModificationException();
    this.b = localn.d;
    this.c = localn;
    return localn;
  }

  public final boolean hasNext()
  {
    return this.b != this.e.e;
  }

  public final void remove()
  {
    if (this.c == null)
      throw new IllegalStateException();
    this.e.a(this.c, true);
    this.c = null;
    this.d = this.e.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ah.m
 * JD-Core Version:    0.6.2
 */