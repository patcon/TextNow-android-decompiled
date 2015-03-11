package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Handler;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ActionBarView;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import textnow.g.c;
import textnow.g.f;

class m extends ActionBar
{
  private a A;
  n a;
  textnow.i.a b;
  textnow.i.b c;
  final Handler d = new Handler();
  private Context e;
  private Context f;
  private d g;
  private ActionBarOverlayLayout h;
  private ActionBarContainer i;
  private ViewGroup j;
  private ActionBarView k;
  private ActionBarContextView l;
  private ActionBarContainer m;
  private ScrollingTabContainerView n;
  private ArrayList<ActionBarImplBase.TabImpl> o = new ArrayList();
  private int p = -1;
  private boolean q;
  private ArrayList<ActionBar.OnMenuVisibilityListener> r = new ArrayList();
  private int s;
  private boolean t;
  private int u = 0;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y = true;
  private boolean z;

  public m(d paramd, a parama)
  {
    this.g = paramd;
    this.e = paramd;
    this.A = parama;
    d locald = this.g;
    this.h = ((ActionBarOverlayLayout)locald.findViewById(f.d));
    if (this.h != null)
      this.h.a(this);
    this.k = ((ActionBarView)locald.findViewById(f.a));
    this.l = ((ActionBarContextView)locald.findViewById(f.h));
    this.i = ((ActionBarContainer)locald.findViewById(f.c));
    this.j = ((ViewGroup)locald.findViewById(f.G));
    if (this.j == null)
      this.j = this.i;
    this.m = ((ActionBarContainer)locald.findViewById(f.D));
    if ((this.k == null) || (this.l == null) || (this.i == null))
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
    this.k.a(this.l);
    int i1;
    if (this.k.i())
    {
      i1 = 1;
      this.s = i1;
      if ((0x4 & this.k.n()) == 0)
        break label361;
    }
    label361: for (int i2 = 1; ; i2 = 0)
    {
      if (i2 != 0)
        this.q = true;
      textnow.h.a locala = textnow.h.a.a(this.e);
      boolean bool;
      if (!locala.e())
      {
        bool = false;
        if (i2 == 0);
      }
      else
      {
        bool = true;
      }
      c(bool);
      f(locala.c());
      a(this.g.getTitle());
      return;
      i1 = 0;
      break;
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    int i1 = this.k.n();
    if ((paramInt2 & 0x4) != 0)
      this.q = true;
    this.k.c(paramInt1 & paramInt2 | i1 & (paramInt2 ^ 0xFFFFFFFF));
  }

  private static boolean b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3);
    while ((!paramBoolean1) && (!paramBoolean2))
      return true;
    return false;
  }

  private void f(boolean paramBoolean)
  {
    boolean bool1 = true;
    this.t = paramBoolean;
    boolean bool2;
    label46: label65: ActionBarView localActionBarView;
    if (!this.t)
    {
      this.k.a(null);
      this.i.a(this.n);
      if (this.k.m() != 2)
        break label111;
      bool2 = bool1;
      if (this.n != null)
      {
        if (!bool2)
          break label116;
        this.n.setVisibility(0);
      }
      localActionBarView = this.k;
      if ((this.t) || (!bool2))
        break label128;
    }
    while (true)
    {
      localActionBarView.d(bool1);
      return;
      this.i.a(null);
      this.k.a(this.n);
      break;
      label111: bool2 = false;
      break label46;
      label116: this.n.setVisibility(8);
      break label65;
      label128: bool1 = false;
    }
  }

  private void g(boolean paramBoolean)
  {
    boolean bool1 = true;
    if (b(this.v, this.w, this.x))
      if (!this.y)
      {
        this.y = bool1;
        this.j.clearAnimation();
        if (this.j.getVisibility() != 0)
        {
          if (!g())
            bool1 = false;
          if (bool1)
          {
            Animation localAnimation4 = AnimationUtils.loadAnimation(this.e, textnow.g.b.d);
            this.j.startAnimation(localAnimation4);
          }
          this.j.setVisibility(0);
          if ((this.m != null) && (this.m.getVisibility() != 0))
          {
            if (bool1)
            {
              Animation localAnimation3 = AnimationUtils.loadAnimation(this.e, textnow.g.b.c);
              this.m.startAnimation(localAnimation3);
            }
            this.m.setVisibility(0);
          }
        }
      }
    do
    {
      do
        return;
      while (!this.y);
      this.y = false;
      this.j.clearAnimation();
    }
    while (this.j.getVisibility() == 8);
    boolean bool2 = g();
    int i1 = 0;
    if (!bool2);
    while (true)
    {
      if (i1 != 0)
      {
        Animation localAnimation2 = AnimationUtils.loadAnimation(this.e, textnow.g.b.f);
        this.j.startAnimation(localAnimation2);
      }
      this.j.setVisibility(8);
      if ((this.m == null) || (this.m.getVisibility() == 8))
        break;
      if (i1 != 0)
      {
        Animation localAnimation1 = AnimationUtils.loadAnimation(this.e, textnow.g.b.e);
        this.m.startAnimation(localAnimation1);
      }
      this.m.setVisibility(8);
      return;
      i1 = bool1;
    }
  }

  public final int a()
  {
    return this.k.n();
  }

  public final textnow.i.a a(textnow.i.b paramb)
  {
    if (this.a != null)
      this.a.b();
    this.l.h();
    n localn = new n(this, paramb);
    if (localn.d())
    {
      localn.c();
      this.l.a(localn);
      d(true);
      if ((this.m != null) && (this.s == 1) && (this.m.getVisibility() != 0))
        this.m.setVisibility(0);
      this.l.sendAccessibilityEvent(32);
      this.a = localn;
      return localn;
    }
    return null;
  }

  public final void a(int paramInt)
  {
    a(this.e.getString(paramInt));
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.k.a(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i1 = 2; ; i1 = 0)
    {
      a(i1, 2);
      return;
    }
  }

  public final int b()
  {
    return this.i.getHeight();
  }

  public final void b(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i1 = 4; ; i1 = 0)
    {
      a(i1, 4);
      return;
    }
  }

  public final Context c()
  {
    int i1;
    if (this.f == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.e.getTheme().resolveAttribute(c.d, localTypedValue, true);
      i1 = localTypedValue.resourceId;
      if (i1 == 0)
        break label61;
    }
    label61: for (this.f = new ContextThemeWrapper(this.e, i1); ; this.f = this.e)
      return this.f;
  }

  public final void c(boolean paramBoolean)
  {
    this.k.c(paramBoolean);
  }

  public final void d()
  {
    f(textnow.h.a.a(this.e).c());
  }

  final void d(boolean paramBoolean)
  {
    int i1 = 8;
    int i2;
    label23: int i3;
    label42: ScrollingTabContainerView localScrollingTabContainerView;
    if (paramBoolean)
    {
      e();
      ActionBarView localActionBarView = this.k;
      if (!paramBoolean)
        break label100;
      i2 = 4;
      localActionBarView.b(i2);
      ActionBarContextView localActionBarContextView = this.l;
      if (!paramBoolean)
        break label106;
      i3 = 0;
      localActionBarContextView.b(i3);
      if ((this.n != null) && (!this.k.j()) && (this.k.o()))
      {
        localScrollingTabContainerView = this.n;
        if (!paramBoolean)
          break label112;
      }
    }
    while (true)
    {
      localScrollingTabContainerView.setVisibility(i1);
      return;
      f();
      break;
      label100: i2 = 0;
      break label23;
      label106: i3 = i1;
      break label42;
      label112: i1 = 0;
    }
  }

  final void e()
  {
    if (!this.x)
    {
      this.x = true;
      g(false);
    }
  }

  public final void e(boolean paramBoolean)
  {
    this.z = paramBoolean;
    if (!paramBoolean)
    {
      this.j.clearAnimation();
      if (this.m != null)
        this.m.clearAnimation();
    }
  }

  final void f()
  {
    if (this.x)
    {
      this.x = false;
      g(false);
    }
  }

  boolean g()
  {
    return this.z;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.m
 * JD-Core Version:    0.6.2
 */