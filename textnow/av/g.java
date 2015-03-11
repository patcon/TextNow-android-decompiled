package textnow.av;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

final class g extends b
{
  private final WeakReference<ViewPropertyAnimator> a;

  g(View paramView)
  {
    this.a = new WeakReference(paramView.animate());
  }

  public final b a(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.a.get();
    if (localViewPropertyAnimator != null)
      localViewPropertyAnimator.translationX(paramFloat);
    return this;
  }

  public final b a(long paramLong)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.a.get();
    if (localViewPropertyAnimator != null)
      localViewPropertyAnimator.setDuration(paramLong);
    return this;
  }

  public final b a(Interpolator paramInterpolator)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.a.get();
    if (localViewPropertyAnimator != null)
      localViewPropertyAnimator.setInterpolator(paramInterpolator);
    return this;
  }

  public final b a(final textnow.at.b paramb)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.a.get();
    if (localViewPropertyAnimator != null)
    {
      if (paramb == null)
        localViewPropertyAnimator.setListener(null);
    }
    else
      return this;
    localViewPropertyAnimator.setListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        paramb.c(null);
      }

      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        paramb.b(null);
      }

      public final void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
        paramb.d(null);
      }

      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        paramb.a(null);
      }
    });
    return this;
  }

  public final b b(float paramFloat)
  {
    ViewPropertyAnimator localViewPropertyAnimator = (ViewPropertyAnimator)this.a.get();
    if (localViewPropertyAnimator != null)
      localViewPropertyAnimator.translationY(paramFloat);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.av.g
 * JD-Core Version:    0.6.2
 */