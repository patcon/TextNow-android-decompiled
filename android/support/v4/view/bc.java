package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class bc extends bb
{
  public void a(View paramView)
  {
    paramView.requestFitSystemWindows();
  }

  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }

  public final void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }

  public void c(View paramView, int paramInt)
  {
    if (paramInt == 4)
      paramInt = 2;
    paramView.setImportantForAccessibility(paramInt);
  }

  public final boolean d(View paramView)
  {
    return paramView.hasTransientState();
  }

  public final void e(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }

  public final int f(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }

  public final ViewParent j(View paramView)
  {
    return paramView.getParentForAccessibility();
  }

  public final int q(View paramView)
  {
    return paramView.getMinimumWidth();
  }

  public final int r(View paramView)
  {
    return paramView.getMinimumHeight();
  }

  public final boolean u(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bc
 * JD-Core Version:    0.6.2
 */