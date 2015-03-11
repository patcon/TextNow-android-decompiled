package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

final class ck extends ci
{
  public final void a(View paramView, cr paramcr)
  {
    paramView.animate().setUpdateListener(new co.1(paramcr, paramView));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ck
 * JD-Core Version:    0.6.2
 */