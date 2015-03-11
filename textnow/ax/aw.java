package textnow.ax;

import java.util.List;

public final class aw extends bk
{
  ay a = ay.a;
  long b = 0L;
  int q = 0;
  int r = 0;
  ao s = null;
  boolean t = false;

  public aw(ao paramao)
  {
    super(paramao);
  }

  protected final long a(bl parambl, long paramLong)
  {
    if (this.a == ay.b)
      return this.b;
    if (this.a == ay.c)
      return this.b;
    return paramLong % this.i.e().b(parambl.e).b();
  }

  public final ac a(boolean paramBoolean)
  {
    if (this.a == ay.b)
    {
      this.a = ay.c;
      this.s = this.i.e().b(this.r);
      this.b = 0L;
    }
    this.t = paramBoolean;
    return null;
  }

  public final ao a(bl parambl)
  {
    ax localax = (ax)parambl;
    int i = parambl.e;
    int j;
    if (this.a == ay.b)
      j = localax.a;
    while (true)
    {
      return this.i.e().b(j);
      if (this.a == ay.c)
        j = localax.b;
      else
        j = i;
    }
  }

  public final void a(aj paramaj, long paramLong)
  {
    if (this.a == ay.b)
      this.b = Math.min(this.s.b() - 1L, paramLong + this.b);
    boolean bool;
    do
    {
      do
      {
        return;
        if (this.a != ay.c)
          break;
        this.b = Math.min(this.s.b() - 1L, paramLong + this.b);
      }
      while (this.b != this.s.b() - 1L);
      bool = this.t;
      this.t = false;
      this.a = ay.a;
    }
    while (!bool);
    paramaj.b(super.a(ae.d));
    paramaj.b(super.a(ae.e));
    return;
    super.a(paramaj, paramLong);
  }

  public final void b()
  {
    this.c = 0.0F;
    this.d = 0.0F;
    this.a = ay.a;
    this.b = 0L;
    this.t = false;
    ax localax = (ax)this.h.get(0);
    this.q = localax.a;
    this.r = localax.b;
  }

  protected final bl c()
  {
    return new ax(this, (byte)0);
  }

  public final boolean i()
  {
    return true;
  }

  public final ac k()
  {
    if (this.a == ay.a)
    {
      this.a = ay.b;
      this.s = this.i.e().b(this.q);
      this.b = 0L;
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.aw
 * JD-Core Version:    0.6.2
 */