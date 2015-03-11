package android.support.v4.widget;

import android.view.animation.AccelerateDecelerateInterpolator;

final class y extends AccelerateDecelerateInterpolator
{
  public final float getInterpolation(float paramFloat)
  {
    return super.getInterpolation(Math.min(1.0F, 2.0F * paramFloat));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.y
 * JD-Core Version:    0.6.2
 */