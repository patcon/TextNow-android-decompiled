package android.support.v7.internal.widget;

import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import textnow.g.c;
import textnow.h.a;

public final class ScrollingTabContainerView extends HorizontalScrollView
  implements n
{
  Runnable a;
  int b;
  int c;
  private ab d;
  private LinearLayout e;
  private ac f;
  private boolean g;
  private final LayoutInflater h;
  private int i;
  private int j;

  private void a(int paramInt)
  {
    this.j = paramInt;
    int k = this.e.getChildCount();
    int m = 0;
    if (m < k)
    {
      View localView1 = this.e.getChildAt(m);
      if (m == paramInt);
      for (boolean bool = true; ; bool = false)
      {
        localView1.setSelected(bool);
        if (bool)
        {
          final View localView2 = this.e.getChildAt(paramInt);
          if (this.a != null)
            removeCallbacks(this.a);
          this.a = new Runnable()
          {
            public final void run()
            {
              int i = localView2.getLeft() - (ScrollingTabContainerView.this.getWidth() - localView2.getWidth()) / 2;
              ScrollingTabContainerView.this.smoothScrollTo(i, 0);
              ScrollingTabContainerView.this.a = null;
            }
          };
          post(this.a);
        }
        m++;
        break;
      }
    }
    if ((this.f != null) && (paramInt >= 0))
      this.f.a(paramInt);
  }

  private boolean a()
  {
    return (this.f != null) && (this.f.getParent() == this);
  }

  private boolean b()
  {
    if (!a())
      return false;
    removeView(this.f);
    addView(this.e, new ViewGroup.LayoutParams(-2, -1));
    a(this.f.v);
    return false;
  }

  public final void a(View paramView, int paramInt)
  {
    ((ScrollingTabContainerView.TabView)paramView).a();
  }

  public final void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.a != null)
      post(this.a);
  }

  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    a locala = a.a(getContext());
    this.i = locala.d();
    requestLayout();
    this.c = locala.f();
  }

  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null)
      removeCallbacks(this.a);
  }

  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int k = 1;
    int m = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    label72: label87: int i1;
    if (m == 1073741824)
    {
      bool = k;
      setFillViewport(bool);
      int n = this.e.getChildCount();
      if ((n <= k) || ((m != 1073741824) && (m != -2147483648)))
        break label339;
      if (n <= 2)
        break label326;
      this.b = ((int)(0.4F * View.MeasureSpec.getSize(paramInt1)));
      this.b = Math.min(this.b, this.c);
      i1 = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
      if ((bool) || (!this.g))
        break label347;
      label110: if (k == 0)
        break label360;
      this.e.measure(0, i1);
      if (this.e.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1))
        break label352;
      if (!a())
      {
        if (this.f == null)
        {
          ac localac = new ac(getContext(), null, c.e);
          localac.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
          localac.b(this);
          this.f = localac;
        }
        removeView(this.e);
        addView(this.f, new ViewGroup.LayoutParams(-2, -1));
        if (this.f.a == null)
          this.f.a(new aa(this, (byte)0));
        if (this.a != null)
        {
          removeCallbacks(this.a);
          this.a = null;
        }
        this.f.a(this.j);
      }
    }
    while (true)
    {
      int i2 = getMeasuredWidth();
      super.onMeasure(paramInt1, i1);
      int i3 = getMeasuredWidth();
      if ((bool) && (i2 != i3))
        a(this.j);
      return;
      bool = false;
      break;
      label326: this.b = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label72;
      label339: this.b = -1;
      break label87;
      label347: k = 0;
      break label110;
      label352: b();
      continue;
      label360: b();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ScrollingTabContainerView
 * JD-Core Version:    0.6.2
 */