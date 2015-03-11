package android.support.v7.internal.view.menu;

import android.view.MenuItem;

final class g
  implements ab
{
  private g(ActionMenuPresenter paramActionMenuPresenter)
  {
  }

  public final void a(n paramn, boolean paramBoolean)
  {
    if ((paramn instanceof ag))
      ((ag)paramn).q().a(false);
  }

  public final boolean b(n paramn)
  {
    if (paramn == null)
      return false;
    this.a.b = ((ag)paramn).getItem().getItemId();
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.g
 * JD-Core Version:    0.6.2
 */