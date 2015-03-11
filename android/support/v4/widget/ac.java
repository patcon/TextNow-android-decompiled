package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

final class ac
  implements ab
{
  public final int a(Object paramObject)
  {
    return ((Scroller)paramObject).getCurrX();
  }

  public final Object a(Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInterpolator != null)
      return new Scroller(paramContext, paramInterpolator);
    return new Scroller(paramContext);
  }

  public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ((Scroller)paramObject).startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public final int b(Object paramObject)
  {
    return ((Scroller)paramObject).getCurrY();
  }

  public final boolean c(Object paramObject)
  {
    return ((Scroller)paramObject).computeScrollOffset();
  }

  public final void d(Object paramObject)
  {
    ((Scroller)paramObject).abortAnimation();
  }

  public final int e(Object paramObject)
  {
    return ((Scroller)paramObject).getFinalX();
  }

  public final int f(Object paramObject)
  {
    return ((Scroller)paramObject).getFinalY();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ac
 * JD-Core Version:    0.6.2
 */