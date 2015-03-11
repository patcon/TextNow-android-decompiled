package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class ce
  implements cl
{
  WeakHashMap<View, Runnable> a = null;

  private void c(cd paramcd, View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof cp));
    for (cp localcp = (cp)localObject; ; localcp = null)
    {
      Runnable localRunnable1 = cd.a(paramcd);
      Runnable localRunnable2 = cd.b(paramcd);
      if (localRunnable1 != null)
        localRunnable1.run();
      if (localcp != null)
      {
        localcp.a(paramView);
        localcp.b(paramView);
      }
      if (localRunnable2 != null)
        localRunnable2.run();
      if (this.a != null)
        this.a.remove(paramView);
      return;
    }
  }

  private void d(cd paramcd, View paramView)
  {
    WeakHashMap localWeakHashMap = this.a;
    Object localObject = null;
    if (localWeakHashMap != null)
      localObject = (Runnable)this.a.get(paramView);
    if (localObject == null)
    {
      localObject = new cf(this, paramcd, paramView, (byte)0);
      if (this.a == null)
        this.a = new WeakHashMap();
      this.a.put(paramView, localObject);
    }
    paramView.removeCallbacks((Runnable)localObject);
    paramView.post((Runnable)localObject);
  }

  public void a(cd paramcd, View paramView)
  {
    d(paramcd, paramView);
  }

  public void a(cd paramcd, View paramView, float paramFloat)
  {
    d(paramcd, paramView);
  }

  public void a(cd paramcd, View paramView, cp paramcp)
  {
    paramView.setTag(2113929216, paramcp);
  }

  public void a(View paramView, long paramLong)
  {
  }

  public void a(View paramView, cr paramcr)
  {
  }

  public void a(View paramView, Interpolator paramInterpolator)
  {
  }

  public void b(cd paramcd, View paramView)
  {
    if (this.a != null)
    {
      Runnable localRunnable = (Runnable)this.a.get(paramView);
      if (localRunnable != null)
        paramView.removeCallbacks(localRunnable);
    }
    c(paramcd, paramView);
  }

  public void b(cd paramcd, View paramView, float paramFloat)
  {
    d(paramcd, paramView);
  }

  public void c(cd paramcd, View paramView, float paramFloat)
  {
    d(paramcd, paramView);
  }

  public void d(cd paramcd, View paramView, float paramFloat)
  {
    d(paramcd, paramView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ce
 * JD-Core Version:    0.6.2
 */