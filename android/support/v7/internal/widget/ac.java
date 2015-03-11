package android.support.v7.internal.widget;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.HorizontalScrollView;
import textnow.g.b;

public final class ac extends HorizontalScrollView
  implements q
{
  private static final Interpolator j = new DecelerateInterpolator();
  Runnable a;
  int b;
  int c;
  private ae d;
  private LinearLayoutCompat e;
  private SpinnerCompat f;
  private boolean g;
  private int h;
  private int i;

  private void a(int paramInt)
  {
    this.i = paramInt;
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
              int i = localView2.getLeft() - (ac.this.getWidth() - localView2.getWidth()) / 2;
              ac.this.smoothScrollTo(i, 0);
              ac.this.a = null;
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
    a(this.f.u);
    return false;
  }

  public final void a(View paramView)
  {
    ((af)paramView).a().d();
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
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    textnow.k.a locala = textnow.k.a.a(getContext());
    this.h = locala.e();
    requestLayout();
    this.c = locala.g();
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
      i1 = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
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
          SpinnerCompat localSpinnerCompat = new SpinnerCompat(getContext(), null, b.h);
          localSpinnerCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
          localSpinnerCompat.b(this);
          this.f = localSpinnerCompat;
        }
        removeView(this.e);
        addView(this.f, new ViewGroup.LayoutParams(-2, -1));
        if (this.f.a == null)
          this.f.a(new ad(this, (byte)0));
        if (this.a != null)
        {
          removeCallbacks(this.a);
          this.a = null;
        }
        this.f.a(this.i);
      }
    }
    while (true)
    {
      int i2 = getMeasuredWidth();
      super.onMeasure(paramInt1, i1);
      int i3 = getMeasuredWidth();
      if ((bool) && (i2 != i3))
        a(this.i);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ac
 * JD-Core Version:    0.6.2
 */