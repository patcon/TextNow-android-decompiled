package android.support.v7.internal.view.menu;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import textnow.b.c;

final class ac extends aa
  implements c
{
  ac(SubMenu paramSubMenu)
  {
    super(paramSubMenu);
  }

  public final void clearHeader()
  {
    ((SubMenu)this.a).clearHeader();
  }

  public final MenuItem getItem()
  {
    return a(((SubMenu)this.a).getItem());
  }

  public final SubMenu setHeaderIcon(int paramInt)
  {
    ((SubMenu)this.a).setHeaderIcon(paramInt);
    return this;
  }

  public final SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    ((SubMenu)this.a).setHeaderIcon(paramDrawable);
    return this;
  }

  public final SubMenu setHeaderTitle(int paramInt)
  {
    ((SubMenu)this.a).setHeaderTitle(paramInt);
    return this;
  }

  public final SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    ((SubMenu)this.a).setHeaderTitle(paramCharSequence);
    return this;
  }

  public final SubMenu setHeaderView(View paramView)
  {
    ((SubMenu)this.a).setHeaderView(paramView);
    return this;
  }

  public final SubMenu setIcon(int paramInt)
  {
    ((SubMenu)this.a).setIcon(paramInt);
    return this;
  }

  public final SubMenu setIcon(Drawable paramDrawable)
  {
    ((SubMenu)this.a).setIcon(paramDrawable);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ac
 * JD-Core Version:    0.6.2
 */