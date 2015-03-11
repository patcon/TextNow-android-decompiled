package android.support.v7.internal.view.menu;

import android.support.v4.view.j;
import android.support.v4.view.l;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class t extends ActionProvider
{
  final j a;

  public t(final s params, j paramj)
  {
    super(paramj.a());
    this.a = paramj;
    if (s.a(params))
      this.a.a(new l()
      {
      });
  }

  public boolean hasSubMenu()
  {
    return false;
  }

  public View onCreateActionView()
  {
    if (s.a(this.b))
      this.b.b();
    return this.a.b();
  }

  public boolean onPerformDefaultAction()
  {
    return false;
  }

  public void onPrepareSubMenu(SubMenu paramSubMenu)
  {
    this.b.a(paramSubMenu);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.t
 * JD-Core Version:    0.6.2
 */