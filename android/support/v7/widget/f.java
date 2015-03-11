package android.support.v7.widget;

import android.support.v7.internal.view.menu.ab;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.w;
import android.view.MenuItem;

final class f
  implements w
{
  private f(ActionMenuPresenter paramActionMenuPresenter)
  {
  }

  public final void a(i parami, boolean paramBoolean)
  {
    if ((parami instanceof ab))
      ((ab)parami).q().a(false);
    w localw = this.a.a();
    if (localw != null)
      localw.a(parami, paramBoolean);
  }

  public final boolean a(i parami)
  {
    if (parami == null)
      return false;
    this.a.h = ((ab)parami).getItem().getItemId();
    w localw = this.a.a();
    if (localw != null)
      return localw.a(parami);
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.f
 * JD-Core Version:    0.6.2
 */