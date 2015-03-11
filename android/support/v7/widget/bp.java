package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.menu.ab;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.v;
import android.view.View;
import android.widget.ImageButton;
import textnow.l.c;

final class bp
  implements v
{
  i a;
  m b;

  private bp(Toolbar paramToolbar)
  {
  }

  public final void a(Context paramContext, i parami)
  {
    if ((this.a != null) && (this.b != null))
      this.a.b(this.b);
    this.a = parami;
  }

  public final void a(i parami, boolean paramBoolean)
  {
  }

  public final boolean a(ab paramab)
  {
    return false;
  }

  public final void b(boolean paramBoolean)
  {
    int i;
    int j;
    if (this.b != null)
    {
      i locali = this.a;
      i = 0;
      if (locali != null)
        j = this.a.size();
    }
    for (int k = 0; ; k++)
    {
      i = 0;
      if (k < j)
      {
        if (this.a.getItem(k) == this.b)
          i = 1;
      }
      else
      {
        if (i == 0)
          c(this.b);
        return;
      }
    }
  }

  public final boolean b()
  {
    return false;
  }

  public final boolean b(m paramm)
  {
    Toolbar.b(this.c);
    if (Toolbar.c(this.c).getParent() != this.c)
      this.c.addView(Toolbar.c(this.c));
    this.c.a = paramm.getActionView();
    this.b = paramm;
    if (this.c.a.getParent() != this.c)
    {
      Toolbar.LayoutParams localLayoutParams = Toolbar.n();
      localLayoutParams.a = (0x800003 | 0x70 & Toolbar.d(this.c));
      localLayoutParams.b = 2;
      this.c.a.setLayoutParams(localLayoutParams);
      this.c.addView(this.c.a);
    }
    Toolbar.a(this.c, true);
    this.c.requestLayout();
    paramm.e(true);
    if ((this.c.a instanceof c))
      ((c)this.c.a).a();
    return true;
  }

  public final boolean c(m paramm)
  {
    if ((this.c.a instanceof c))
      ((c)this.c.a).b();
    this.c.removeView(this.c.a);
    this.c.removeView(Toolbar.c(this.c));
    this.c.a = null;
    Toolbar.a(this.c, false);
    this.b = null;
    this.c.requestLayout();
    paramm.e(false);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bp
 * JD-Core Version:    0.6.2
 */