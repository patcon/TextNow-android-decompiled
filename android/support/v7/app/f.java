package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.internal.view.menu.ab;
import android.support.v7.internal.view.menu.ac;
import android.support.v7.internal.view.menu.ae;
import android.support.v7.internal.view.menu.l;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.view.menu.o;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import textnow.g.c;
import textnow.g.j;
import textnow.g.k;
import textnow.i.a;
import textnow.i.b;

class f extends e
  implements ab, o
{
  private static final int[] d = arrayOfInt;
  private ActionBarView e;
  private l f;
  private n g;
  private a h;
  private boolean i;
  private CharSequence j;
  private boolean k;
  private boolean l;
  private boolean m;
  private final Runnable n = new Runnable()
  {
    public final void run()
    {
      n localn = f.a(f.this);
      if ((f.this.a.a(0, localn)) && (f.this.a.a(0, null, localn)))
        f.a(f.this, localn);
      while (true)
      {
        f.a(f.this, false);
        return;
        f.a(f.this, null);
      }
    }
  };

  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = c.i;
  }

  f(d paramd)
  {
    super(paramd);
  }

  private void c(n paramn)
  {
    if (paramn == this.g);
    do
    {
      return;
      if (this.g != null)
        this.g.b(this.f);
      this.g = paramn;
      if ((paramn != null) && (this.f != null))
        paramn.a(this.f);
    }
    while (this.e == null);
    this.e.a(paramn, this);
  }

  private n n()
  {
    n localn = new n(k());
    localn.a(this);
    return localn;
  }

  public ActionBar a()
  {
    l();
    return new m(this.a, this.a);
  }

  public final a a(b paramb)
  {
    if (paramb == null)
      throw new IllegalArgumentException("ActionMode callback can not be null.");
    if (this.h != null)
      this.h.b();
    h localh = new h(this, paramb);
    m localm = (m)b();
    if (localm != null)
      this.h = localm.a(localh);
    if (this.h != null)
      d.d();
    return this.h;
  }

  public final void a(int paramInt)
  {
    l();
    if (this.b)
    {
      ViewGroup localViewGroup = (ViewGroup)this.a.findViewById(16908290);
      localViewGroup.removeAllViews();
      this.a.getLayoutInflater().inflate(paramInt, localViewGroup);
    }
    while (true)
    {
      d.f();
      return;
      this.a.a(paramInt);
    }
  }

  public final void a(Configuration paramConfiguration)
  {
    if ((this.b) && (this.i))
      ((m)b()).d();
  }

  public final void a(n paramn)
  {
    if ((this.e != null) && (this.e.f()))
    {
      if (!this.e.e())
      {
        if (this.e.getVisibility() == 0)
          this.e.b();
        return;
      }
      this.e.d();
      return;
    }
    paramn.close();
  }

  public final void a(n paramn, boolean paramBoolean)
  {
    this.a.closeOptionsMenu();
  }

  public final void a(View paramView)
  {
    l();
    if (this.b)
    {
      ViewGroup localViewGroup = (ViewGroup)this.a.findViewById(16908290);
      localViewGroup.removeAllViews();
      localViewGroup.addView(paramView);
    }
    while (true)
    {
      d.f();
      return;
      this.a.a(paramView);
    }
  }

  public final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    l();
    if (this.b)
    {
      ViewGroup localViewGroup = (ViewGroup)this.a.findViewById(16908290);
      localViewGroup.removeAllViews();
      localViewGroup.addView(paramView, paramLayoutParams);
    }
    while (true)
    {
      d.f();
      return;
      this.a.a(paramView, paramLayoutParams);
    }
  }

  public final void a(CharSequence paramCharSequence)
  {
    if (this.e != null)
    {
      this.e.b(paramCharSequence);
      return;
    }
    this.j = paramCharSequence;
  }

  public final boolean a(int paramInt, Menu paramMenu)
  {
    if (paramInt != 0)
      return this.a.a(paramInt, paramMenu);
    return false;
  }

  public final boolean a(int paramInt, MenuItem paramMenuItem)
  {
    if (paramInt == 0)
      paramMenuItem = ae.a(paramMenuItem);
    return this.a.a(paramInt, paramMenuItem);
  }

  public final boolean a(int paramInt, View paramView, Menu paramMenu)
  {
    if (paramInt != 0)
      return this.a.a(paramInt, paramView, paramMenu);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    return this.a.onMenuItemSelected(0, paramMenuItem);
  }

  public final View b(int paramInt)
  {
    View localView = null;
    d locald;
    ac localac;
    if (paramInt == 0)
    {
      boolean bool = true;
      n localn1 = this.g;
      if (this.h == null)
      {
        if (localn1 == null)
        {
          localn1 = n();
          c(localn1);
          localn1.f();
          bool = this.a.a(0, localn1);
        }
        if (bool)
        {
          localn1.f();
          bool = this.a.a(0, null, localn1);
        }
      }
      if (!bool)
        break label212;
      locald = this.a;
      n localn2 = this.g;
      localac = null;
      if (localn2 == null)
      {
        localView = (View)localac;
        localn1.g();
      }
    }
    else
    {
      return localView;
    }
    if (this.f == null)
    {
      TypedArray localTypedArray = locald.obtainStyledAttributes(k.o);
      int i1 = localTypedArray.getResourceId(4, j.a);
      localTypedArray.recycle();
      this.f = new l(textnow.g.h.n, i1);
      this.f.a(this);
      this.g.a(this.f);
    }
    while (true)
    {
      localac = this.f.a(new FrameLayout(locald));
      break;
      this.f.d(false);
    }
    label212: c(null);
    return null;
  }

  public final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    l();
    if (this.b)
      ((ViewGroup)this.a.findViewById(16908290)).addView(paramView, paramLayoutParams);
    while (true)
    {
      d.f();
      return;
      this.a.a(paramView, paramLayoutParams);
    }
  }

  public final boolean b(n paramn)
  {
    return false;
  }

  public final void d()
  {
    m localm = (m)b();
    if (localm != null)
      localm.e(false);
  }

  public final void e()
  {
    m localm = (m)b();
    if (localm != null)
      localm.e(true);
  }

  public final void f()
  {
    if (!this.m)
    {
      this.m = true;
      this.a.getWindow().getDecorView().post(this.n);
    }
  }

  public final boolean g()
  {
    if (this.h != null)
    {
      this.h.b();
      return true;
    }
    if ((this.e != null) && (this.e.k()))
    {
      this.e.l();
      return true;
    }
    return false;
  }

  final android.support.v4.app.f h()
  {
    return new g(this, (byte)0);
  }

  public final void i()
  {
  }

  final void l()
  {
    boolean bool1;
    if ((this.b) && (!this.i))
    {
      if (!this.c)
        break label259;
      this.a.a(textnow.g.h.b);
      this.e = ((ActionBarView)this.a.findViewById(textnow.g.f.a));
      this.e.a(this.a);
      if (this.k)
        this.e.g();
      if (this.l)
        this.e.h();
      bool1 = "splitActionBarWhenNarrow".equals(j());
      if (!bool1)
        break label272;
    }
    label259: label272: boolean bool2;
    for (boolean bool3 = this.a.getResources().getBoolean(textnow.g.d.e); ; bool3 = bool2)
    {
      ActionBarContainer localActionBarContainer = (ActionBarContainer)this.a.findViewById(textnow.g.f.D);
      if (localActionBarContainer != null)
      {
        this.e.a(localActionBarContainer);
        this.e.a(bool3);
        this.e.b(bool1);
        ActionBarContextView localActionBarContextView = (ActionBarContextView)this.a.findViewById(textnow.g.f.h);
        localActionBarContextView.a(localActionBarContainer);
        localActionBarContextView.a(bool3);
        localActionBarContextView.b(bool1);
      }
      this.a.findViewById(16908290).setId(-1);
      this.a.findViewById(textnow.g.f.b).setId(16908290);
      if (this.j != null)
      {
        this.e.b(this.j);
        this.j = null;
      }
      this.i = true;
      f();
      return;
      this.a.a(textnow.g.h.a);
      break;
      TypedArray localTypedArray = this.a.obtainStyledAttributes(k.c);
      bool2 = localTypedArray.getBoolean(2, false);
      localTypedArray.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.f
 * JD-Core Version:    0.6.2
 */