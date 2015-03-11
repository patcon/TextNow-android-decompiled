package android.support.v7.internal.view.menu;

import android.support.v4.view.j;
import android.support.v4.view.l;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class o extends ActionProvider
{
  final j a;

  public o(final n paramn, j paramj)
  {
    super(paramj.a());
    this.a = paramj;
    if (n.a(paramn))
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
    if (n.a(this.b))
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.o
 * JD-Core Version:    0.6.2
 */