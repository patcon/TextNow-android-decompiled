package android.support.v7.internal.view.menu;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import textnow.c.c;

final class ah extends af
  implements c
{
  ah(SubMenu paramSubMenu)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ah
 * JD-Core Version:    0.6.2
 */