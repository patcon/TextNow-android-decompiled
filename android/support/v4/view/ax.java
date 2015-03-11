package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class ax extends aw
{
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }

  public final void b(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }

  public final int c(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }

  public void c(View paramView, int paramInt)
  {
    if (paramInt == 4)
      paramInt = 2;
    paramView.setImportantForAccessibility(paramInt);
  }

  public final ViewParent f(View paramView)
  {
    return paramView.getParentForAccessibility();
  }

  public final boolean i(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ax
 * JD-Core Version:    0.6.2
 */