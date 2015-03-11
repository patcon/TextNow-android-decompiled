package textnow.i;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.u;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import textnow.l.a;

public final class c extends a
  implements j
{
  private textnow.l.b b;
  private i c;
  private WeakReference<View> d;

  public c(b paramb, textnow.l.b paramb1)
  {
    this.b = paramb1;
    this.c = new i(paramb.c()).a(1);
    this.c.a(this);
  }

  public final Menu a()
  {
    return this.c;
  }

  public final void a(int paramInt)
  {
    b(b.k(this.a).getResources().getString(paramInt));
  }

  public final void a(i parami)
  {
    if (this.b == null)
      return;
    c();
    b.i(this.a).a();
  }

  public final void a(View paramView)
  {
    b.i(this.a).d(paramView);
    this.d = new WeakReference(paramView);
  }

  public final void a(CharSequence paramCharSequence)
  {
    b.i(this.a).b(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    b.i(this.a).a(paramBoolean);
  }

  public final boolean a(i parami, MenuItem paramMenuItem)
  {
    if (this.b != null)
      return this.b.a(this, paramMenuItem);
    return false;
  }

  public final void b()
  {
    if (this.a.a != this)
      return;
    if (!b.a(b.g(this.a), b.h(this.a), false))
    {
      this.a.b = this;
      this.a.c = this.b;
    }
    while (true)
    {
      this.b = null;
      this.a.h(false);
      b.i(this.a).d();
      b.j(this.a).a().sendAccessibilityEvent(32);
      b.f(this.a).b(this.a.d);
      this.a.a = null;
      return;
      this.b.a(this);
    }
  }

  public final void b(int paramInt)
  {
    a(b.k(this.a).getResources().getString(paramInt));
  }

  public final void b(CharSequence paramCharSequence)
  {
    b.i(this.a).a(paramCharSequence);
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

  public final CharSequence e()
  {
    return b.i(this.a).b();
  }

  public final CharSequence f()
  {
    return b.i(this.a).c();
  }

  public final boolean g()
  {
    return b.i(this.a).f();
  }

  public final View h()
  {
    if (this.d != null)
      return (View)this.d.get();
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.i.c
 * JD-Core Version:    0.6.2
 */