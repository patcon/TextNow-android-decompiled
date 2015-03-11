package android.support.v7.internal.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class q extends f<MenuItem.OnMenuItemClickListener>
  implements MenuItem.OnMenuItemClickListener
{
  q(n paramn, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    super(paramOnMenuItemClickListener);
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnMenuItemClickListener)this.a).onMenuItemClick(this.b.a(paramMenuItem));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.q
 * JD-Core Version:    0.6.2
 */