package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.v7.internal.view.menu.aa;
import android.support.v7.internal.view.menu.ag;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.view.menu.r;
import android.view.View;
import android.widget.LinearLayout;
import textnow.c.b;

final class c
  implements aa
{
  n a;
  r b;

  private c(ActionBarView paramActionBarView)
  {
  }

  public final void a(Context paramContext, n paramn)
  {
    if ((this.a != null) && (this.b != null))
      this.a.b(this.b);
    this.a = paramn;
  }

  public final void a(n paramn, boolean paramBoolean)
  {
  }

  public final boolean a(ag paramag)
  {
    return false;
  }

  public final boolean b(r paramr)
  {
    this.c.g = paramr.getActionView();
    ActionBarView.e(this.c).a(ActionBarView.d(this.c).getConstantState().newDrawable(this.c.getResources()));
    this.b = paramr;
    if (this.c.g.getParent() != this.c)
      this.c.addView(this.c.g);
    if (ActionBarView.e(this.c).getParent() != this.c)
      this.c.addView(ActionBarView.e(this.c));
    ActionBarView.f(this.c).setVisibility(8);
    if (ActionBarView.g(this.c) != null)
      ActionBarView.g(this.c).setVisibility(8);
    if (ActionBarView.h(this.c) != null)
      ActionBarView.h(this.c).setVisibility(8);
    if (ActionBarView.i(this.c) != null)
      ActionBarView.i(this.c).setVisibility(8);
    if (ActionBarView.j(this.c) != null)
      ActionBarView.j(this.c).setVisibility(8);
    this.c.requestLayout();
    paramr.e(true);
    if ((this.c.g instanceof textnow.i.c))
      ((textnow.i.c)this.c.g).a();
    return true;
  }

  public final boolean c(r paramr)
  {
    if ((this.c.g instanceof textnow.i.c))
      ((textnow.i.c)this.c.g).b();
    this.c.removeView(this.c.g);
    this.c.removeView(ActionBarView.e(this.c));
    this.c.g = null;
    if ((0x2 & ActionBarView.k(this.c)) != 0)
      ActionBarView.f(this.c).setVisibility(0);
    if ((0x8 & ActionBarView.k(this.c)) != 0)
    {
      if (ActionBarView.g(this.c) != null)
        break label245;
      ActionBarView.l(this.c);
    }
    while (true)
    {
      if ((ActionBarView.h(this.c) != null) && (ActionBarView.m(this.c) == 2))
        ActionBarView.h(this.c).setVisibility(0);
      if ((ActionBarView.i(this.c) != null) && (ActionBarView.m(this.c) == 1))
        ActionBarView.i(this.c).setVisibility(0);
      if ((ActionBarView.j(this.c) != null) && ((0x10 & ActionBarView.k(this.c)) != 0))
        ActionBarView.j(this.c).setVisibility(0);
      ActionBarView.e(this.c).a(null);
      this.b = null;
      this.c.requestLayout();
      paramr.e(false);
      return true;
      label245: ActionBarView.g(this.c).setVisibility(0);
    }
  }

  public final void d(boolean paramBoolean)
  {
    int k;
    if (this.b != null)
    {
      if (this.a == null)
        break label79;
      int j = this.a.size();
      k = 0;
      if (k >= j)
        break label79;
      if ((b)this.a.getItem(k) != this.b)
        break label73;
    }
    label73: label79: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        c(this.b);
      return;
      k++;
      break;
    }
  }

  public final boolean h()
  {
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.c
 * JD-Core Version:    0.6.2
 */