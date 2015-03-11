package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class ag extends n
  implements SubMenu
{
  private n d;
  private r e;

  public ag(Context paramContext, n paramn, r paramr)
  {
    super(paramContext);
    this.d = paramn;
    this.e = paramr;
  }

  public final void a(o paramo)
  {
    this.d.a(paramo);
  }

  public final boolean a()
  {
    return this.d.a();
  }

  public final boolean a(n paramn, MenuItem paramMenuItem)
  {
    return (super.a(paramn, paramMenuItem)) || (this.d.a(paramn, paramMenuItem));
  }

  public final boolean a(r paramr)
  {
    return this.d.a(paramr);
  }

  public final boolean b()
  {
    return this.d.b();
  }

  public final boolean b(r paramr)
  {
    return this.d.b(paramr);
  }

  public final void clearHeader()
  {
  }

  public final MenuItem getItem()
  {
    return this.e;
  }

  public final n q()
  {
    return this.d;
  }

  public final SubMenu setHeaderIcon(int paramInt)
  {
    super.a(d().getResources().getDrawable(paramInt));
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ag
 * JD-Core Version:    0.6.2
 */