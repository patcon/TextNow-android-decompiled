package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class ad
  implements ab
{
  public final int a(Object paramObject)
  {
    return ((OverScroller)paramObject).getCurrX();
  }

  public final Object a(Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInterpolator != null)
      return new OverScroller(paramContext, paramInterpolator);
    return new OverScroller(paramContext);
  }

  public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ((OverScroller)paramObject).startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public final int b(Object paramObject)
  {
    return ((OverScroller)paramObject).getCurrY();
  }

  public final boolean c(Object paramObject)
  {
    return ((OverScroller)paramObject).computeScrollOffset();
  }

  public final void d(Object paramObject)
  {
    ((OverScroller)paramObject).abortAnimation();
  }

  public final int e(Object paramObject)
  {
    return ((OverScroller)paramObject).getFinalX();
  }

  public final int f(Object paramObject)
  {
    return ((OverScroller)paramObject).getFinalY();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ad
 * JD-Core Version:    0.6.2
 */