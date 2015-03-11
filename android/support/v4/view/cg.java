package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class cg extends ce
{
  WeakHashMap<View, Integer> b = null;

  public final void a(cd paramcd, View paramView)
  {
    paramView.animate().cancel();
  }

  public final void a(cd paramcd, View paramView, float paramFloat)
  {
    paramView.animate().alpha(paramFloat);
  }

  public void a(cd paramcd, View paramView, cp paramcp)
  {
    paramView.setTag(2113929216, paramcp);
    ch localch = new ch(paramcd);
    if (localch != null)
    {
      paramView.animate().setListener(new cm.1(localch, paramView));
      return;
    }
    paramView.animate().setListener(null);
  }

  public final void a(View paramView, long paramLong)
  {
    paramView.animate().setDuration(paramLong);
  }

  public final void a(View paramView, Interpolator paramInterpolator)
  {
    paramView.animate().setInterpolator(paramInterpolator);
  }

  public final void b(cd paramcd, View paramView)
  {
    paramView.animate().start();
  }

  public final void b(cd paramcd, View paramView, float paramFloat)
  {
    paramView.animate().translationX(paramFloat);
  }

  public final void c(cd paramcd, View paramView, float paramFloat)
  {
    paramView.animate().translationY(paramFloat);
  }

  public final void d(cd paramcd, View paramView, float paramFloat)
  {
    paramView.animate().scaleY(paramFloat);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.cg
 * JD-Core Version:    0.6.2
 */