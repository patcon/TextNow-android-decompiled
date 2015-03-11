package android.support.v7.app;

import android.support.v7.internal.view.menu.o;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarView;
import android.view.Menu;
import android.view.MenuItem;
import textnow.i.a;
import textnow.i.b;

final class n extends a
  implements o
{
  private b b;
  private android.support.v7.internal.view.menu.n c;

  public n(m paramm, b paramb)
  {
    this.b = paramb;
    this.c = new android.support.v7.internal.view.menu.n(paramm.c()).a(1);
    this.c.a(this);
  }

  public final Menu a()
  {
    return this.c;
  }

  public final void a(android.support.v7.internal.view.menu.n paramn)
  {
    if (this.b == null)
      return;
    c();
    m.c(this.a).b();
  }

  public final void a(CharSequence paramCharSequence)
  {
    m.c(this.a).a(paramCharSequence);
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    if (this.b != null)
      return this.b.a(this, paramMenuItem);
    return false;
  }

  public final void b()
  {
    if (this.a.a != this)
      return;
    if (!m.a(m.a(this.a), m.b(this.a), false))
    {
      this.a.b = this;
      this.a.c = this.b;
    }
    while (true)
    {
      this.b = null;
      this.a.d(false);
      m.c(this.a).g();
      m.d(this.a).sendAccessibilityEvent(32);
      this.a.a = null;
      return;
      this.b.a(this);
    }
  }

  public final void c()
  {
    this.c.f();
    try
    {
      this.b.b(this, this.c);
      return;
    }
    finally
    {
      this.c.g();
    }
  }

  public final boolean d()
  {
    this.c.f();
    try
    {
      boolean bool = this.b.a(this, this.c);
      return bool;
    }
    finally
    {
      this.c.g();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.n
 * JD-Core Version:    0.6.2
 */