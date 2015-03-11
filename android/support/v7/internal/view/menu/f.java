package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.View;

final class f extends y
{
  public f(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, n paramn, View paramView, boolean paramBoolean)
  {
    super(paramContext, paramn, paramView, true);
    a(paramActionMenuPresenter.a);
  }

  public final void onDismiss()
  {
    super.onDismiss();
    this.a.e.close();
    ActionMenuPresenter.a(this.a, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.f
 * JD-Core Version:    0.6.2
 */