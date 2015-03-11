package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class av extends au
{
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
    paramView.setScaleX(paramFloat);
  }

  public final void c(View paramView, float paramFloat)
  {
    paramView.setScaleY(paramFloat);
  }

  public final int d(View paramView)
  {
    return paramView.getLayerType();
  }

  public final float h(View paramView)
  {
    return paramView.getScaleX();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.av
 * JD-Core Version:    0.6.2
 */