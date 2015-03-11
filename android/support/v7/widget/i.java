package android.support.v7.widget;

import android.view.MenuItem;

final class i
  implements android.support.v7.internal.view.menu.j
{
  private i(ActionMenuView paramActionMenuView)
  {
  }

  public final void a(android.support.v7.internal.view.menu.i parami)
  {
    if (ActionMenuView.b(this.a) != null)
      ActionMenuView.b(this.a).a(parami);
  }

  public final boolean a(android.support.v7.internal.view.menu.i parami, MenuItem paramMenuItem)
  {
    return (ActionMenuView.a(this.a) != null) && (ActionMenuView.a(this.a).a(paramMenuItem));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.i
 * JD-Core Version:    0.6.2
 */