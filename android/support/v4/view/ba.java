package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ba extends az
{
  public final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
  }

  final long a()
  {
    return ValueAnimator.getFrameDelay();
  }

  public final void a(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }

  public void a(View paramView, Paint paramPaint)
  {
    a(paramView, paramView.getLayerType(), paramPaint);
    paramView.invalidate();
  }

  public final void b(View paramView, float paramFloat)
  {
    paramView.setTranslationX(paramFloat);
  }

  public final void c(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }

  public final void d(View paramView, float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }

  public final void e(View paramView, float paramFloat)
  {
    paramView.setScaleX(paramFloat);
  }

  public final void f(View paramView, float paramFloat)
  {
    paramView.setScaleY(paramFloat);
  }

  public final float g(View paramView)
  {
    return paramView.getAlpha();
  }

  public final int h(View paramView)
  {
    return paramView.getLayerType();
  }

  public final int l(View paramView)
  {
    return paramView.getMeasuredWidthAndState();
  }

  public final int m(View paramView)
  {
    return paramView.getMeasuredState();
  }

  public final float n(View paramView)
  {
    return paramView.getTranslationX();
  }

  public final float o(View paramView)
  {
    return paramView.getTranslationY();
  }

  public final float p(View paramView)
  {
    return paramView.getScaleX();
  }

  public final void v(View paramView)
  {
    paramView.jumpDrawablesToCurrentState();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ba
 * JD-Core Version:    0.6.2
 */