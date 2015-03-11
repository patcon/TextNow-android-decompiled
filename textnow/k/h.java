package textnow.k;

import android.support.v4.view.cd;
import android.support.v4.view.cp;
import android.support.v4.view.cq;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class h
{
  private final ArrayList<cd> a = new ArrayList();
  private long b = -1L;
  private Interpolator c;
  private cp d;
  private boolean e;
  private final cq f = new cq()
  {
    private boolean b = false;
    private int c = 0;

    public final void a(View paramAnonymousView)
    {
      if (this.b);
      do
      {
        return;
        this.b = true;
      }
      while (h.a(h.this) == null);
      h.a(h.this).a(null);
    }

    public final void b(View paramAnonymousView)
    {
      int i = 1 + this.c;
      this.c = i;
      if (i == h.c(h.this).size())
      {
        if (h.a(h.this) != null)
          h.a(h.this).b(null);
        this.c = 0;
        this.b = false;
        h.b(h.this);
      }
    }
  };

  public final h a(long paramLong)
  {
    if (!this.e)
      this.b = 250L;
    return this;
  }

  public final h a(cd paramcd)
  {
    if (!this.e)
      this.a.add(paramcd);
    return this;
  }

  public final h a(cp paramcp)
  {
    if (!this.e)
      this.d = paramcp;
    return this;
  }

  public final h a(Interpolator paramInterpolator)
  {
    if (!this.e)
      this.c = paramInterpolator;
    return this;
  }

  public final void a()
  {
    if (this.e)
      return;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      cd localcd = (cd)localIterator.next();
      if (this.b >= 0L)
        localcd.a(this.b);
      if (this.c != null)
        localcd.a(this.c);
      if (this.d != null)
        localcd.a(this.f);
      localcd.b();
    }
    this.e = true;
  }

  public final void b()
  {
    if (!this.e)
      return;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((cd)localIterator.next()).a();
    this.e = false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.k.h
 * JD-Core Version:    0.6.2
 */