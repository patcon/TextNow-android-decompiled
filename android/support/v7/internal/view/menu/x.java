package android.support.v7.internal.view.menu;

import android.support.v4.view.j;
import android.support.v4.view.l;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class x extends t
  implements l
{
  ActionProvider.VisibilityListener c;

  public x(w paramw, j paramj)
  {
    super(paramw, paramj);
  }

  public final boolean isVisible()
  {
    return true;
  }

  public final View onCreateActionView(MenuItem paramMenuItem)
  {
    return this.a.c();
  }

  public final boolean overridesItemVisibility()
  {
    return false;
  }

  public final void refreshVisibility()
  {
    this.a.d();
  }

  public final void setVisibilityListener(ActionProvider.VisibilityListener paramVisibilityListener)
  {
    this.c = paramVisibilityListener;
    j localj = this.a;
    if (paramVisibilityListener != null);
    while (true)
    {
      localj.a(this);
      return;
      this = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.x
 * JD-Core Version:    0.6.2
 */