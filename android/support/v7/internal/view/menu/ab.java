package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class ab extends i
  implements SubMenu
{
  private i d;
  private m e;

  public ab(Context paramContext, i parami, m paramm)
  {
    super(paramContext);
    this.d = parami;
    this.e = paramm;
  }

  public final String a()
  {
    if (this.e != null);
    for (int i = this.e.getItemId(); i == 0; i = 0)
      return null;
    return super.a() + ":" + i;
  }

  public final void a(j paramj)
  {
    this.d.a(paramj);
  }

  final boolean a(i parami, MenuItem paramMenuItem)
  {
    return (super.a(parami, paramMenuItem)) || (this.d.a(parami, paramMenuItem));
  }

  public final boolean a(m paramm)
  {
    return this.d.a(paramm);
  }

  public final boolean b()
  {
    return this.d.b();
  }

  public final boolean b(m paramm)
  {
    return this.d.b(paramm);
  }

  public final boolean c()
  {
    return this.d.c();
  }

  public final MenuItem getItem()
  {
    return this.e;
  }

  public final i q()
  {
    return this.d;
  }

  public final SubMenu setHeaderIcon(int paramInt)
  {
    super.a(c.a(d(), paramInt));
    return this;
  }

  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.a(paramDrawable);
    return this;
  }

  public final SubMenu setHeaderTitle(int paramInt)
  {
    super.a(d().getResources().getString(paramInt));
    return this;
  }

  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.a(paramCharSequence);
    return this;
  }

  public final SubMenu setHeaderView(View paramView)
  {
    super.a(paramView);
    return this;
  }

  public final SubMenu setIcon(int paramInt)
  {
    this.e.setIcon(paramInt);
    return this;
  }

  public final SubMenu setIcon(Drawable paramDrawable)
  {
    this.e.setIcon(paramDrawable);
    return this;
  }

  public final void setQwertyMode(boolean paramBoolean)
  {
    this.d.setQwertyMode(paramBoolean);
  }

  public final Menu t()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ab
 * JD-Core Version:    0.6.2
 */