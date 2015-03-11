package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.menu.ab;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.t;
import android.view.MenuItem;
import android.view.View;
import textnow.g.b;

final class a extends t
{
  private ab d;

  public a(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, ab paramab)
  {
    super(paramContext, paramab, null, false, b.l);
    this.d = paramab;
    View localView;
    int i;
    if (!((m)paramab.getItem()).h())
    {
      if (ActionMenuPresenter.d(paramActionMenuPresenter) == null)
      {
        localView = (View)ActionMenuPresenter.e(paramActionMenuPresenter);
        a(localView);
      }
    }
    else
    {
      a(paramActionMenuPresenter.g);
      i = paramab.size();
    }
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        MenuItem localMenuItem = paramab.getItem(j);
        if ((localMenuItem.isVisible()) && (localMenuItem.getIcon() != null))
          bool = true;
      }
      else
      {
        a(bool);
        return;
        localView = ActionMenuPresenter.d(paramActionMenuPresenter);
        break;
      }
    }
  }

  public final void onDismiss()
  {
    super.onDismiss();
    ActionMenuPresenter.a(this.c, null);
    this.c.h = 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a
 * JD-Core Version:    0.6.2
 */