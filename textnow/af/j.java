package textnow.af;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class j extends m
  implements Iterable<m>
{
  private final List<m> a = new ArrayList();

  public final int a()
  {
    return this.a.size();
  }

  public final void a(m paramm)
  {
    if (paramm == null)
      paramm = o.a;
    this.a.add(paramm);
  }

  public final Number b()
  {
    if (this.a.size() == 1)
      return ((m)this.a.get(0)).b();
    throw new IllegalStateException();
  }

  public final String c()
  {
    if (this.a.size() == 1)
      return ((m)this.a.get(0)).c();
    throw new IllegalStateException();
  }

  public final double d()
  {
    if (this.a.size() == 1)
      return ((m)this.a.get(0)).d();
    throw new IllegalStateException();
  }

  public final long e()
  {
    if (this.a.size() == 1)
      return ((m)this.a.get(0)).e();
    throw new IllegalStateException();
  }

  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof j)) && (((j)paramObject).a.equals(this.a)));
  }

  public final int f()
  {
    if (this.a.size() == 1)
      return ((m)this.a.get(0)).f();
    throw new IllegalStateException();
  }

  public final boolean g()
  {
    if (this.a.size() == 1)
      return ((m)this.a.get(0)).g();
    throw new IllegalStateException();
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final Iterator<m> iterator()
  {
    return this.a.iterator();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.af.j
 * JD-Core Version:    0.6.2
 */