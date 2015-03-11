package android.support.v7.internal.view.menu;

import android.view.View;

final class d
  implements Runnable
{
  private f b;

  public d(ActionMenuPresenter paramActionMenuPresenter, f paramf)
  {
    this.b = paramf;
  }

  public final void run()
  {
    this.a.e.e();
    View localView = (View)this.a.h;
    if ((localView != null) && (localView.getWindowToken() != null) && (this.b.a()))
      ActionMenuPresenter.a(this.a, this.b);
    ActionMenuPresenter.a(this.a, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.d
 * JD-Core Version:    0.6.2
 */