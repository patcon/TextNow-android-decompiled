package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.f;
import android.support.v7.internal.view.menu.ae;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import textnow.h.c;
import textnow.i.a;

class j extends e
{
  Menu d;

  j(d paramd)
  {
    super(paramd);
  }

  public ActionBar a()
  {
    return new q(this.a, this.a);
  }

  public final a a(textnow.i.b paramb)
  {
    if (paramb == null)
      throw new IllegalArgumentException("ActionMode callback can not be null.");
    Context localContext = k();
    c localc = new c(localContext, paramb);
    ActionMode localActionMode = this.a.startActionMode(localc);
    textnow.h.b localb = null;
    if (localActionMode != null)
    {
      localb = new textnow.h.b(localContext, localActionMode);
      localc.a(localb);
    }
    return localb;
  }

  public final void a(int paramInt)
  {
    this.a.a(paramInt);
  }

  public final void a(Configuration paramConfiguration)
  {
  }

  public final void a(Bundle paramBundle)
  {
    if ("splitActionBarWhenNarrow".equals(j()))
      this.a.getWindow().setUiOptions(1, 1);
    super.a(paramBundle);
    if (this.b)
      this.a.requestWindowFeature(8);
    if (this.c)
      this.a.requestWindowFeature(9);
    Window localWindow = this.a.getWindow();
    localWindow.setCallback(new k(this, localWindow.getCallback()));
  }

  public final void a(ActionMode paramActionMode)
  {
    new textnow.h.b(k(), paramActionMode);
    d.d();
  }

  public final void a(View paramView)
  {
    this.a.a(paramView);
  }

  public final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.a.a(paramView, paramLayoutParams);
  }

  public final void a(CharSequence paramCharSequence)
  {
  }

  public final boolean a(int paramInt, Menu paramMenu)
  {
    if ((paramInt == 0) || (paramInt == 8))
    {
      if (this.d == null)
        this.d = ae.a(paramMenu);
      return this.a.a(paramInt, this.d);
    }
    return this.a.a(paramInt, paramMenu);
  }

  public final boolean a(int paramInt, MenuItem paramMenuItem)
  {
    if (paramInt == 0)
      paramMenuItem = ae.a(paramMenuItem);
    return this.a.a(paramInt, paramMenuItem);
  }

  public final boolean a(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) || (paramInt == 8))
      return this.a.a(paramInt, paramView, this.d);
    return this.a.a(paramInt, paramView, paramMenu);
  }

  public final View b(int paramInt)
  {
    return null;
  }

  public final void b(ActionMode paramActionMode)
  {
    new textnow.h.b(k(), paramActionMode);
    d.e();
  }

  public final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.a.b(paramView, paramLayoutParams);
  }

  public final void d()
  {
  }

  public final void e()
  {
  }

  public final void f()
  {
    this.d = null;
  }

  public final boolean g()
  {
    return false;
  }

  public final f h()
  {
    return null;
  }

  public final void i()
  {
    d.f();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.j
 * JD-Core Version:    0.6.2
 */