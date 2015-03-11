package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

class ax
  implements bf
{
  WeakHashMap<View, cd> a = null;

  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSize(paramInt1, paramInt2);
  }

  long a()
  {
    return 10L;
  }

  public void a(View paramView)
  {
  }

  public void a(View paramView, float paramFloat)
  {
  }

  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.invalidate(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void a(View paramView, int paramInt, Paint paramPaint)
  {
  }

  public void a(View paramView, Paint paramPaint)
  {
  }

  public void a(View paramView, a parama)
  {
  }

  public void a(View paramView, aj paramaj)
  {
  }

  public void a(View paramView, Runnable paramRunnable)
  {
    paramView.postDelayed(paramRunnable, a());
  }

  public void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postDelayed(paramRunnable, paramLong + a());
  }

  public void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
  }

  public boolean a(View paramView, int paramInt)
  {
    return false;
  }

  public int b(View paramView)
  {
    return 2;
  }

  public void b(View paramView, float paramFloat)
  {
  }

  public boolean b(View paramView, int paramInt)
  {
    return false;
  }

  public void c(View paramView, float paramFloat)
  {
  }

  public void c(View paramView, int paramInt)
  {
  }

  public boolean c(View paramView)
  {
    return false;
  }

  public void d(View paramView, float paramFloat)
  {
  }

  public boolean d(View paramView)
  {
    return false;
  }

  public void e(View paramView)
  {
    paramView.invalidate();
  }

  public void e(View paramView, float paramFloat)
  {
  }

  public int f(View paramView)
  {
    return 0;
  }

  public void f(View paramView, float paramFloat)
  {
  }

  public float g(View paramView)
  {
    return 1.0F;
  }

  public int h(View paramView)
  {
    return 0;
  }

  public int i(View paramView)
  {
    return 0;
  }

  public ViewParent j(View paramView)
  {
    return paramView.getParent();
  }

  public boolean k(View paramView)
  {
    Drawable localDrawable = paramView.getBackground();
    boolean bool = false;
    if (localDrawable != null)
    {
      int i = localDrawable.getOpacity();
      bool = false;
      if (i == -1)
        bool = true;
    }
    return bool;
  }

  public int l(View paramView)
  {
    return paramView.getMeasuredWidth();
  }

  public int m(View paramView)
  {
    return 0;
  }

  public float n(View paramView)
  {
    return 0.0F;
  }

  public float o(View paramView)
  {
    return 0.0F;
  }

  public float p(View paramView)
  {
    return 0.0F;
  }

  public int q(View paramView)
  {
    return 0;
  }

  public int r(View paramView)
  {
    return 0;
  }

  public cd s(View paramView)
  {
    return new cd(paramView);
  }

  public int t(View paramView)
  {
    return 0;
  }

  public boolean u(View paramView)
  {
    return false;
  }

  public void v(View paramView)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ax
 * JD-Core Version:    0.6.2
 */