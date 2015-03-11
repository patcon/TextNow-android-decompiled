package android.support.v7.internal.view.menu;

import android.content.DialogInterface;

final class c extends q
{
  public c(ActionMenuPresenter paramActionMenuPresenter, ag paramag)
  {
    super(paramag);
    paramActionMenuPresenter.a(paramActionMenuPresenter.a);
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    ActionMenuPresenter.a(this.a, null);
    this.a.b = 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.c
 * JD-Core Version:    0.6.2
 */