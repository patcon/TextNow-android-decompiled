package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

class as
  implements ba
{
  WeakHashMap<View, ViewPropertyAnimatorCompat> a = null;

  public int a(View paramView)
  {
    return 2;
  }

  long a()
  {
    return 10L;
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

  public void a(View paramView, Runnable paramRunnable)
  {
    paramView.postDelayed(paramRunnable, a());
  }

  public void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
  }

  public boolean a(View paramView, int paramInt)
  {
    return false;
  }

  public void b(View paramView)
  {
    paramView.invalidate();
  }

  public void b(View paramView, float paramFloat)
  {
  }

  public boolean b(View paramView, int paramInt)
  {
    return false;
  }

  public int c(View paramView)
  {
    return 0;
  }

  public void c(View paramView, float paramFloat)
  {
  }

  public void c(View paramView, int paramInt)
  {
  }

  public int d(View paramView)
  {
    return 0;
  }

  public int e(View paramView)
  {
    return 0;
  }

  public ViewParent f(View paramView)
  {
    return paramView.getParent();
  }

  public boolean g(View paramView)
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

  public float h(View paramView)
  {
    return 0.0F;
  }

  public boolean i(View paramView)
  {
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.as
 * JD-Core Version:    0.6.2
 */