package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.t;
import android.view.View;
import textnow.g.b;

final class e extends t
{
  public e(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, i parami, View paramView, boolean paramBoolean)
  {
    super(paramContext, parami, paramView, true, b.l);
    a(8388613);
    a(paramActionMenuPresenter.g);
  }

  public final void onDismiss()
  {
    super.onDismiss();
    ActionMenuPresenter.c(this.c).close();
    ActionMenuPresenter.a(this.c, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.e
 * JD-Core Version:    0.6.2
 */