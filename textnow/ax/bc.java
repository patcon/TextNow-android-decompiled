package textnow.ax;

import java.util.List;

public final class bc extends bk
{
  be a = be.a;
  long b = 0L;
  int q = 0;
  int r = 0;
  int s = 0;
  ao t = null;

  public bc(ao paramao)
  {
    super(paramao);
  }

  protected final long a(bl parambl, long paramLong)
  {
    if (this.a == be.b)
      return this.b;
    if (this.a == be.c)
      return this.b;
    if (this.a == be.d)
      return this.b;
    return paramLong % this.i.e().b(parambl.e).b();
  }

  public final ao a(bl parambl)
  {
    bd localbd = (bd)parambl;
    int i = parambl.e;
    int j;
    if (this.a == be.b)
      j = localbd.a;
    while (true)
    {
      return this.i.e().b(j);
      if (this.a == be.c)
        j = localbd.b;
      else if (this.a == be.d)
        j = localbd.c;
      else
        j = i;
    }
  }

  public final void a(aj paramaj, long paramLong)
  {
    if (this.a == be.b)
    {
      this.b = Math.min(this.t.b() - 1L, paramLong + this.b);
      if (this.b == this.t.b() - 1L)
        paramaj.b(super.a(ae.j));
    }
    do
    {
      do
      {
        return;
        if (this.a != be.c)
          break;
        this.b = Math.min(this.t.b() - 1L, paramLong + this.b);
      }
      while (this.b != this.t.b() - 1L);
      this.a = be.a;
      paramaj.b(super.a(ae.l));
      return;
      if (this.a != be.d)
        break;
      this.b = Math.min(this.t.b() - 1L, paramLong + this.b);
    }
    while (this.b != this.t.b() - 1L);
    this.a = be.a;
    paramaj.b(super.a(ae.k));
    return;
    super.a(paramaj, paramLong);
  }

  public final ac b(boolean paramBoolean)
  {
    if (((this.a == be.a) || (this.a == be.c)) && (paramBoolean))
    {
      this.a = be.b;
      this.t = this.i.e().b(this.q);
    }
    for (this.b = 0L; ; this.b = 0L)
    {
      do
        return null;
      while ((this.a != be.b) || (paramBoolean));
      this.a = be.c;
      this.t = this.i.e().b(this.r);
    }
  }

  public final void b()
  {
    this.c = 0.0F;
    this.d = 0.0F;
    this.a = be.a;
    this.b = 0L;
    bd localbd = (bd)this.h.get(0);
    this.q = localbd.a;
    this.r = localbd.b;
    this.s = localbd.c;
  }

  public final ac c(boolean paramBoolean)
  {
    if (this.a == be.b)
    {
      if (!paramBoolean)
        break label46;
      this.a = be.d;
      this.t = this.i.e().b(this.s);
    }
    for (this.b = 0L; ; this.b = 0L)
    {
      return null;
      label46: this.a = be.c;
      this.t = this.i.e().b(this.r);
    }
  }

  protected final bl c()
  {
    return new bd(this, (byte)0);
  }

  public final boolean i()
  {
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.bc
 * JD-Core Version:    0.6.2
 */