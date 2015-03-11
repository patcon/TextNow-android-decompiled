package android.support.v7.widget;

import android.support.v7.internal.view.menu.i;
import android.view.View;

final class c
  implements Runnable
{
  private e b;

  public c(ActionMenuPresenter paramActionMenuPresenter, e parame)
  {
    this.b = parame;
  }

  public final void run()
  {
    ActionMenuPresenter.f(this.a).e();
    View localView = (View)ActionMenuPresenter.g(this.a);
    if ((localView != null) && (localView.getWindowToken() != null) && (this.b.d()))
      ActionMenuPresenter.a(this.a, this.b);
    ActionMenuPresenter.a(this.a, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.c
 * JD-Core Version:    0.6.2
 */