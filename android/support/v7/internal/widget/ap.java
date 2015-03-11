package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.av;
import android.support.v4.view.cd;
import android.support.v4.view.cq;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.w;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.LayoutParams;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import textnow.g.b;
import textnow.g.f;
import textnow.g.g;
import textnow.g.j;
import textnow.g.l;

public final class ap
  implements u
{
  private Toolbar a;
  private int b;
  private View c;
  private View d;
  private Drawable e;
  private Drawable f;
  private Drawable g;
  private boolean h;
  private CharSequence i;
  private CharSequence j;
  private CharSequence k;
  private textnow.i.a l;
  private boolean m;
  private ActionMenuPresenter n;
  private int o = 0;
  private final al p;
  private int q = 0;
  private Drawable r;

  public ap(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, true, j.a, f.g);
  }

  private ap(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.a = paramToolbar;
    this.i = paramToolbar.i();
    this.j = paramToolbar.j();
    boolean bool;
    ao localao;
    if (this.i != null)
    {
      bool = true;
      this.h = bool;
      if (!paramBoolean)
        break label605;
      localao = ao.a(paramToolbar.getContext(), null, l.a, b.c, 0);
      CharSequence localCharSequence1 = localao.b(l.t);
      if (!TextUtils.isEmpty(localCharSequence1))
        b(localCharSequence1);
      CharSequence localCharSequence2 = localao.b(l.r);
      if (!TextUtils.isEmpty(localCharSequence2))
        c(localCharSequence2);
      Drawable localDrawable2 = localao.a(l.p);
      if (localDrawable2 != null)
      {
        this.f = localDrawable2;
        n();
      }
      Drawable localDrawable3 = localao.a(l.o);
      if (localDrawable3 != null)
      {
        this.e = localDrawable3;
        n();
      }
      Drawable localDrawable4 = localao.a(l.n);
      if (localDrawable4 != null)
        a(localDrawable4);
      a(localao.a(l.j, 0));
      int i2 = localao.f(l.i, 0);
      if (i2 != 0)
      {
        View localView = LayoutInflater.from(this.a.getContext()).inflate(i2, this.a, false);
        if ((this.d != null) && ((0x10 & this.b) != 0))
          this.a.removeView(this.d);
        this.d = localView;
        if ((localView != null) && ((0x10 & this.b) != 0))
          this.a.addView(this.d);
        a(0x10 | this.b);
      }
      int i3 = localao.e(l.l, 0);
      if (i3 > 0)
      {
        ViewGroup.LayoutParams localLayoutParams = this.a.getLayoutParams();
        localLayoutParams.height = i3;
        this.a.setLayoutParams(localLayoutParams);
      }
      int i4 = localao.c(l.h, -1);
      int i5 = localao.c(l.g, -1);
      if ((i4 >= 0) || (i5 >= 0))
        this.a.a(Math.max(i4, 0), Math.max(i5, 0));
      int i6 = localao.f(l.u, 0);
      if (i6 != 0)
        this.a.a(this.a.getContext(), i6);
      int i7 = localao.f(l.s, 0);
      if (i7 != 0)
        this.a.b(this.a.getContext(), i7);
      int i8 = localao.f(l.q, 0);
      if (i8 != 0)
        this.a.a(i8);
      localao.b();
    }
    for (this.p = localao.c(); ; this.p = new al(paramToolbar.getContext()))
    {
      if (paramInt1 != this.q)
      {
        this.q = paramInt1;
        if (TextUtils.isEmpty(this.a.k()))
          c(this.q);
      }
      this.k = this.a.k();
      Drawable localDrawable1 = this.p.a(paramInt2);
      if (this.r != localDrawable1)
      {
        this.r = localDrawable1;
        p();
      }
      this.a.a(new View.OnClickListener()
      {
        final android.support.v7.internal.view.menu.a a = new android.support.v7.internal.view.menu.a(ap.a(ap.this).getContext(), 0, 16908332, 0, 0, ap.b(ap.this));

        public final void onClick(View paramAnonymousView)
        {
          if ((ap.c(ap.this) != null) && (ap.d(ap.this)))
            ap.c(ap.this).a(0, this.a);
        }
      });
      return;
      bool = false;
      break;
      label605: int i1 = 11;
      if (this.a.l() != null)
        i1 = 15;
      this.b = i1;
    }
  }

  private void d(CharSequence paramCharSequence)
  {
    this.i = paramCharSequence;
    if ((0x8 & this.b) != 0)
      this.a.a(paramCharSequence);
  }

  private void n()
  {
    int i1 = 0x2 & this.b;
    Drawable localDrawable = null;
    if (i1 != 0)
    {
      if ((0x1 & this.b) == 0)
        break label51;
      if (this.f == null)
        break label43;
      localDrawable = this.f;
    }
    while (true)
    {
      this.a.a(localDrawable);
      return;
      label43: localDrawable = this.e;
      continue;
      label51: localDrawable = this.e;
    }
  }

  private void o()
  {
    if ((0x4 & this.b) != 0)
    {
      if (TextUtils.isEmpty(this.k))
        this.a.d(this.q);
    }
    else
      return;
    this.a.c(this.k);
  }

  private void p()
  {
    Toolbar localToolbar;
    if ((0x4 & this.b) != 0)
    {
      localToolbar = this.a;
      if (this.g == null)
        break label32;
    }
    label32: for (Drawable localDrawable = this.g; ; localDrawable = this.r)
    {
      localToolbar.b(localDrawable);
      return;
    }
  }

  public final ViewGroup a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    int i1 = paramInt ^ this.b;
    this.b = paramInt;
    if (i1 != 0)
    {
      if ((i1 & 0x4) != 0)
      {
        if ((paramInt & 0x4) == 0)
          break label115;
        p();
        o();
      }
      if ((i1 & 0x3) != 0)
        n();
      if ((i1 & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0)
          break label126;
        this.a.a(this.i);
        this.a.b(this.j);
      }
    }
    while (true)
    {
      if (((i1 & 0x10) != 0) && (this.d != null))
      {
        if ((paramInt & 0x10) == 0)
          break label145;
        this.a.addView(this.d);
      }
      return;
      label115: this.a.b(null);
      break;
      label126: this.a.a(null);
      this.a.b(null);
    }
    label145: this.a.removeView(this.d);
  }

  public final void a(Drawable paramDrawable)
  {
    this.g = paramDrawable;
    p();
  }

  public final void a(ac paramac)
  {
    if ((this.c != null) && (this.c.getParent() == this.a))
      this.a.removeView(this.c);
    this.c = paramac;
    if ((paramac != null) && (this.o == 2))
    {
      this.a.addView(this.c, 0);
      Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)this.c.getLayoutParams();
      localLayoutParams.width = -2;
      localLayoutParams.height = -2;
      localLayoutParams.a = 8388691;
      paramac.a(true);
    }
  }

  public final void a(Menu paramMenu, w paramw)
  {
    if (this.n == null)
    {
      this.n = new ActionMenuPresenter(this.a.getContext());
      this.n.a(g.g);
    }
    this.n.a(paramw);
    this.a.a((i)paramMenu, this.n);
  }

  public final void a(CharSequence paramCharSequence)
  {
    if (!this.h)
      d(paramCharSequence);
  }

  public final void a(textnow.i.a parama)
  {
    this.l = parama;
  }

  public final void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }

  public final Context b()
  {
    return this.a.getContext();
  }

  public final void b(int paramInt)
  {
    if (paramInt == 8)
      av.q(this.a).a(0.0F).a(new cq()
      {
        private boolean b = false;

        public final void b(View paramAnonymousView)
        {
          if (!this.b)
            ap.a(ap.this).setVisibility(8);
        }

        public final void c(View paramAnonymousView)
        {
          this.b = true;
        }
      });
    while (paramInt != 0)
      return;
    av.q(this.a).a(1.0F).a(new cq()
    {
      public final void a(View paramAnonymousView)
      {
        ap.a(ap.this).setVisibility(0);
      }
    });
  }

  public final void b(CharSequence paramCharSequence)
  {
    this.h = true;
    d(paramCharSequence);
  }

  public final void c(int paramInt)
  {
    if (paramInt == 0);
    for (String str = null; ; str = this.a.getContext().getString(paramInt))
    {
      this.k = str;
      o();
      return;
    }
  }

  public final void c(CharSequence paramCharSequence)
  {
    this.j = paramCharSequence;
    if ((0x8 & this.b) != 0)
      this.a.b(paramCharSequence);
  }

  public final boolean c()
  {
    return this.a.g();
  }

  public final void d()
  {
    this.a.h();
  }

  public final boolean e()
  {
    return this.a.a();
  }

  public final boolean f()
  {
    return this.a.b();
  }

  public final boolean g()
  {
    return this.a.c();
  }

  public final boolean h()
  {
    return this.a.d();
  }

  public final boolean i()
  {
    return this.a.e();
  }

  public final void j()
  {
    this.m = true;
  }

  public final void k()
  {
    this.a.f();
  }

  public final int l()
  {
    return this.b;
  }

  public final int m()
  {
    return this.o;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ap
 * JD-Core Version:    0.6.2
 */