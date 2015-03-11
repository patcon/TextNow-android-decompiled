package android.support.v4.widget;

import android.view.animation.AccelerateDecelerateInterpolator;

final class aa extends AccelerateDecelerateInterpolator
{
  public final float getInterpolation(float paramFloat)
  {
    return super.getInterpolation(Math.max(0.0F, 2.0F * (paramFloat - 0.5F)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.aa
 * JD-Core Version:    0.6.2
 */