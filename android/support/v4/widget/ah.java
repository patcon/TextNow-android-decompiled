package android.support.v4.widget;

import android.view.View;

final class ah extends ap
{
  private ah(SlidingPaneLayout paramSlidingPaneLayout)
  {
  }

  public final void a(int paramInt)
  {
    if (SlidingPaneLayout.b(this.a).a() == 0)
    {
      if (SlidingPaneLayout.c(this.a) == 0.0F)
      {
        this.a.c(SlidingPaneLayout.d(this.a));
        this.a.b(SlidingPaneLayout.d(this.a));
        SlidingPaneLayout.a(this.a, false);
      }
    }
    else
      return;
    this.a.a(SlidingPaneLayout.d(this.a));
    SlidingPaneLayout.a(this.a, true);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    SlidingPaneLayout.b(this.a).a(SlidingPaneLayout.d(this.a), paramInt2);
  }

  public final void a(View paramView, float paramFloat)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i;
    if (SlidingPaneLayout.e(this.a))
    {
      int j = this.a.getPaddingRight() + localLayoutParams.rightMargin;
      if ((paramFloat < 0.0F) || ((paramFloat == 0.0F) && (SlidingPaneLayout.c(this.a) > 0.5F)))
        j += SlidingPaneLayout.f(this.a);
      int k = SlidingPaneLayout.d(this.a).getWidth();
      i = this.a.getWidth() - j - k;
    }
    while (true)
    {
      SlidingPaneLayout.b(this.a).a(i, paramView.getTop());
      this.a.invalidate();
      return;
      i = this.a.getPaddingLeft() + localLayoutParams.leftMargin;
      if ((paramFloat > 0.0F) || ((paramFloat == 0.0F) && (SlidingPaneLayout.c(this.a) > 0.5F)))
        i += SlidingPaneLayout.f(this.a);
    }
  }

  public final void a(View paramView, int paramInt)
  {
    SlidingPaneLayout.a(this.a, paramInt);
    this.a.invalidate();
  }

  public final boolean a(View paramView)
  {
    if (SlidingPaneLayout.a(this.a))
      return false;
    return ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).b;
  }

  public final int b(View paramView, int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.d(this.a).getLayoutParams();
    if (SlidingPaneLayout.e(this.a))
    {
      int k = this.a.getWidth() - (this.a.getPaddingRight() + localLayoutParams.rightMargin + SlidingPaneLayout.d(this.a).getWidth());
      int m = k - SlidingPaneLayout.f(this.a);
      return Math.max(Math.min(paramInt, k), m);
    }
    int i = this.a.getPaddingLeft() + localLayoutParams.leftMargin;
    int j = i + SlidingPaneLayout.f(this.a);
    return Math.min(Math.max(paramInt, i), j);
  }

  public final void b(View paramView)
  {
    this.a.a();
  }

  public final int c(View paramView)
  {
    return SlidingPaneLayout.f(this.a);
  }

  public final int d(View paramView)
  {
    return paramView.getTop();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ah
 * JD-Core Version:    0.6.2
 */