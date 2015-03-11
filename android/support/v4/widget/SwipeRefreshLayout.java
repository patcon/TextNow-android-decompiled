package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.af;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;

public class SwipeRefreshLayout extends ViewGroup
{
  private static final String c = SwipeRefreshLayout.class.getSimpleName();
  private static final int[] r = { 16842766 };
  private float A;
  private boolean B;
  private int C;
  private int D;
  private boolean E;
  private Animation.AnimationListener F = new Animation.AnimationListener()
  {
    public final void onAnimationEnd(Animation paramAnonymousAnimation)
    {
      if (SwipeRefreshLayout.a(SwipeRefreshLayout.this))
      {
        SwipeRefreshLayout.b(SwipeRefreshLayout.this).setAlpha(255);
        SwipeRefreshLayout.b(SwipeRefreshLayout.this).start();
        if ((SwipeRefreshLayout.c(SwipeRefreshLayout.this)) && (SwipeRefreshLayout.d(SwipeRefreshLayout.this) != null))
          SwipeRefreshLayout.d(SwipeRefreshLayout.this).a();
      }
      while (true)
      {
        SwipeRefreshLayout.b(SwipeRefreshLayout.this, SwipeRefreshLayout.e(SwipeRefreshLayout.this).getTop());
        return;
        SwipeRefreshLayout.b(SwipeRefreshLayout.this).stop();
        SwipeRefreshLayout.e(SwipeRefreshLayout.this).setVisibility(8);
        SwipeRefreshLayout.a(SwipeRefreshLayout.this, 255);
        if (SwipeRefreshLayout.f(SwipeRefreshLayout.this))
          SwipeRefreshLayout.a(SwipeRefreshLayout.this, 0.0F);
        else
          SwipeRefreshLayout.a(SwipeRefreshLayout.this, SwipeRefreshLayout.this.b - SwipeRefreshLayout.g(SwipeRefreshLayout.this), true);
      }
    }

    public final void onAnimationRepeat(Animation paramAnonymousAnimation)
    {
    }

    public final void onAnimationStart(Animation paramAnonymousAnimation)
    {
    }
  };
  private final Animation G = new Animation()
  {
    public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
    {
      if (!SwipeRefreshLayout.h(SwipeRefreshLayout.this));
      for (int i = (int)(SwipeRefreshLayout.i(SwipeRefreshLayout.this) - Math.abs(SwipeRefreshLayout.this.b)); ; i = (int)SwipeRefreshLayout.i(SwipeRefreshLayout.this))
      {
        int j = SwipeRefreshLayout.this.a + (int)(paramAnonymousFloat * (i - SwipeRefreshLayout.this.a)) - SwipeRefreshLayout.e(SwipeRefreshLayout.this).getTop();
        SwipeRefreshLayout.a(SwipeRefreshLayout.this, j, false);
        return;
      }
    }
  };
  private final Animation H = new Animation()
  {
    public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
    {
      SwipeRefreshLayout.b(SwipeRefreshLayout.this, paramAnonymousFloat);
    }
  };
  protected int a;
  protected int b;
  private View d;
  private av e;
  private boolean f = false;
  private int g;
  private float h = -1.0F;
  private int i;
  private int j;
  private boolean k = false;
  private float l;
  private boolean m;
  private int n = -1;
  private boolean o;
  private boolean p;
  private final DecelerateInterpolator q;
  private d s;
  private int t = -1;
  private float u;
  private z v;
  private Animation w;
  private Animation x;
  private Animation y;
  private Animation z;

  public SwipeRefreshLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public SwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.g = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.i = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.q = new DecelerateInterpolator(2.0F);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, r);
    setEnabled(localTypedArray.getBoolean(0, true));
    localTypedArray.recycle();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.C = ((int)(40.0F * localDisplayMetrics.density));
    this.D = ((int)(40.0F * localDisplayMetrics.density));
    this.s = new d(getContext(), -328966, 20.0F);
    this.v = new z(getContext(), this);
    this.v.a(-328966);
    this.s.setImageDrawable(this.v);
    this.s.setVisibility(8);
    addView(this.s);
    android.support.v4.view.av.a(this, true);
    this.A = (64.0F * localDisplayMetrics.density);
    this.h = this.A;
  }

  private static float a(MotionEvent paramMotionEvent, int paramInt)
  {
    int i1 = af.a(paramMotionEvent, paramInt);
    if (i1 < 0)
      return -1.0F;
    return af.d(paramMotionEvent, i1);
  }

  private Animation a(final int paramInt1, final int paramInt2)
  {
    if ((this.o) && (a()))
      return null;
    Animation local3 = new Animation()
    {
      public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        SwipeRefreshLayout.b(SwipeRefreshLayout.this).setAlpha((int)(paramInt1 + paramAnonymousFloat * (paramInt2 - paramInt1)));
      }
    };
    local3.setDuration(300L);
    this.s.a(null);
    this.s.clearAnimation();
    this.s.startAnimation(local3);
    return local3;
  }

  private void a(float paramFloat)
  {
    if (a())
    {
      a((int)(255.0F * paramFloat));
      return;
    }
    android.support.v4.view.av.d(this.s, paramFloat);
    android.support.v4.view.av.e(this.s, paramFloat);
  }

  private void a(int paramInt)
  {
    this.s.getBackground().setAlpha(paramInt);
    this.v.setAlpha(paramInt);
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    this.s.bringToFront();
    this.s.offsetTopAndBottom(paramInt);
    this.j = this.s.getTop();
    if ((paramBoolean) && (Build.VERSION.SDK_INT < 11))
      invalidate();
  }

  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = af.b(paramMotionEvent);
    if (af.b(paramMotionEvent, i1) == this.n)
      if (i1 != 0)
        break label33;
    label33: for (int i2 = 1; ; i2 = 0)
    {
      this.n = af.b(paramMotionEvent, i2);
      return;
    }
  }

  private void a(Animation.AnimationListener paramAnimationListener)
  {
    this.w = new Animation()
    {
      public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        SwipeRefreshLayout.a(SwipeRefreshLayout.this, 1.0F - paramAnonymousFloat);
      }
    };
    this.w.setDuration(150L);
    this.s.a(paramAnimationListener);
    this.s.clearAnimation();
    this.s.startAnimation(this.w);
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.f != paramBoolean1)
    {
      this.B = paramBoolean2;
      b();
      this.f = paramBoolean1;
      if (this.f)
      {
        int i1 = this.j;
        Animation.AnimationListener localAnimationListener = this.F;
        this.a = i1;
        this.G.reset();
        this.G.setDuration(200L);
        this.G.setInterpolator(this.q);
        if (localAnimationListener != null)
          this.s.a(localAnimationListener);
        this.s.clearAnimation();
        this.s.startAnimation(this.G);
      }
    }
    else
    {
      return;
    }
    a(this.F);
  }

  private static boolean a()
  {
    return Build.VERSION.SDK_INT < 11;
  }

  private static boolean a(Animation paramAnimation)
  {
    return (paramAnimation != null) && (paramAnimation.hasStarted()) && (!paramAnimation.hasEnded());
  }

  private void b()
  {
    if (this.d == null);
    for (int i1 = 0; ; i1++)
      if (i1 < getChildCount())
      {
        View localView = getChildAt(i1);
        if (!localView.equals(this.s))
          this.d = localView;
      }
      else
      {
        return;
      }
  }

  private boolean c()
  {
    if (Build.VERSION.SDK_INT < 14)
    {
      if ((this.d instanceof AbsListView))
      {
        AbsListView localAbsListView = (AbsListView)this.d;
        return (localAbsListView.getChildCount() > 0) && ((localAbsListView.getFirstVisiblePosition() > 0) || (localAbsListView.getChildAt(0).getTop() < localAbsListView.getPaddingTop()));
      }
      return this.d.getScrollY() > 0;
    }
    return android.support.v4.view.av.b(this.d, -1);
  }

  public final void a(av paramav)
  {
    this.e = paramav;
  }

  public final void a(boolean paramBoolean)
  {
    a(false, false);
  }

  public final void a(int[] paramArrayOfInt)
  {
    Resources localResources = getResources();
    int[] arrayOfInt = new int[paramArrayOfInt.length];
    for (int i1 = 0; i1 < paramArrayOfInt.length; i1++)
      arrayOfInt[i1] = localResources.getColor(paramArrayOfInt[i1]);
    b();
    this.v.a(arrayOfInt);
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.t < 0);
    do
    {
      return paramInt2;
      if (paramInt2 == paramInt1 - 1)
        return this.t;
    }
    while (paramInt2 < this.t);
    return paramInt2 + 1;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    b();
    int i1 = af.a(paramMotionEvent);
    if ((this.p) && (i1 == 0))
      this.p = false;
    if ((!isEnabled()) || (this.p) || (c()) || (this.f))
      return false;
    switch (i1)
    {
    case 4:
    case 5:
    default:
    case 0:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    while (true)
    {
      return this.m;
      a(this.b - this.s.getTop(), true);
      this.n = af.b(paramMotionEvent, 0);
      this.m = false;
      float f2 = a(paramMotionEvent, this.n);
      if (f2 == -1.0F)
        break;
      this.l = f2;
      if (this.n == -1)
        return false;
      float f1 = a(paramMotionEvent, this.n);
      if (f1 == -1.0F)
        break;
      if ((f1 - this.l > this.g) && (!this.m))
      {
        this.m = true;
        this.v.setAlpha(76);
        continue;
        a(paramMotionEvent);
        continue;
        this.m = false;
        this.n = -1;
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    if (getChildCount() == 0);
    do
    {
      return;
      if (this.d == null)
        b();
    }
    while (this.d == null);
    View localView = this.d;
    int i3 = getPaddingLeft();
    int i4 = getPaddingTop();
    int i5 = i1 - getPaddingLeft() - getPaddingRight();
    int i6 = i2 - getPaddingTop() - getPaddingBottom();
    localView.layout(i3, i4, i5 + i3, i6 + i4);
    int i7 = this.s.getMeasuredWidth();
    int i8 = this.s.getMeasuredHeight();
    this.s.layout(i1 / 2 - i7 / 2, this.j, i1 / 2 + i7 / 2, i8 + this.j);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.d == null)
      b();
    if (this.d == null);
    while (true)
    {
      return;
      this.d.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
      this.s.measure(View.MeasureSpec.makeMeasureSpec(this.C, 1073741824), View.MeasureSpec.makeMeasureSpec(this.D, 1073741824));
      if ((!this.E) && (!this.k))
      {
        this.k = true;
        int i2 = -this.s.getMeasuredHeight();
        this.b = i2;
        this.j = i2;
      }
      this.t = -1;
      for (int i1 = 0; i1 < getChildCount(); i1++)
        if (getChildAt(i1) == this.s)
        {
          this.t = i1;
          return;
        }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = af.a(paramMotionEvent);
    if ((this.p) && (i1 == 0))
      this.p = false;
    if ((!isEnabled()) || (this.p) || (c()))
      return false;
    switch (i1)
    {
    case 4:
    default:
    case 0:
    case 2:
    case 5:
    case 6:
      while (true)
      {
        return true;
        this.n = af.b(paramMotionEvent, 0);
        this.m = false;
        continue;
        int i3 = af.a(paramMotionEvent, this.n);
        if (i3 < 0)
          return false;
        float f2 = 0.5F * (af.d(paramMotionEvent, i3) - this.l);
        if (this.m)
        {
          this.v.a(true);
          float f3 = f2 / this.h;
          if (f3 < 0.0F)
            return false;
          float f4 = Math.min(1.0F, Math.abs(f3));
          float f5 = 5.0F * (float)Math.max(f4 - 0.4D, 0.0D) / 3.0F;
          float f6 = Math.abs(f2) - this.h;
          float f7;
          label242: float f9;
          int i4;
          if (this.E)
          {
            f7 = this.A - this.b;
            float f8 = Math.max(0.0F, Math.min(f6, 2.0F * f7) / f7);
            f9 = 2.0F * (float)(f8 / 4.0F - Math.pow(f8 / 4.0F, 2.0D));
            float f10 = 2.0F * (f7 * f9);
            i4 = this.b + (int)(f10 + f7 * f4);
            if (this.s.getVisibility() != 0)
              this.s.setVisibility(0);
            if (!this.o)
            {
              android.support.v4.view.av.d(this.s, 1.0F);
              android.support.v4.view.av.e(this.s, 1.0F);
            }
            if (f2 >= this.h)
              break label510;
            if (this.o)
              a(f2 / this.h);
            if ((this.v.getAlpha() > 76) && (!a(this.x)))
              this.x = a(this.v.getAlpha(), 76);
            float f12 = 0.8F * f5;
            this.v.a(0.0F, Math.min(0.8F, f12));
            this.v.a(Math.min(1.0F, f5));
          }
          while (true)
          {
            float f11 = 0.5F * (-0.25F + 0.4F * f5 + 2.0F * f9);
            this.v.b(f11);
            a(i4 - this.j, true);
            break;
            f7 = this.A;
            break label242;
            label510: if ((this.v.getAlpha() < 255) && (!a(this.y)))
              this.y = a(this.v.getAlpha(), 255);
          }
          this.n = af.b(paramMotionEvent, af.b(paramMotionEvent));
          continue;
          a(paramMotionEvent);
        }
      }
    case 1:
    case 3:
    }
    if (this.n == -1)
    {
      if (i1 == 1);
      return false;
    }
    float f1 = 0.5F * (af.d(paramMotionEvent, af.a(paramMotionEvent, this.n)) - this.l);
    this.m = false;
    if (f1 > this.h)
    {
      a(true, true);
      this.n = -1;
      return false;
    }
    this.f = false;
    this.v.a(0.0F, 0.0F);
    boolean bool = this.o;
    Animation.AnimationListener local4 = null;
    if (!bool)
      local4 = new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          if (!SwipeRefreshLayout.f(SwipeRefreshLayout.this))
            SwipeRefreshLayout.a(SwipeRefreshLayout.this, null);
        }

        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
        }
      };
    int i2 = this.j;
    if (this.o)
    {
      this.a = i2;
      if (a())
      {
        this.u = this.v.getAlpha();
        label720: this.z = new Animation()
        {
          public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
          {
            float f = SwipeRefreshLayout.j(SwipeRefreshLayout.this) + paramAnonymousFloat * -SwipeRefreshLayout.j(SwipeRefreshLayout.this);
            SwipeRefreshLayout.a(SwipeRefreshLayout.this, f);
            SwipeRefreshLayout.b(SwipeRefreshLayout.this, paramAnonymousFloat);
          }
        };
        this.z.setDuration(150L);
        if (local4 != null)
          this.s.a(local4);
        this.s.clearAnimation();
        this.s.startAnimation(this.z);
      }
    }
    while (true)
    {
      this.v.a(false);
      break;
      this.u = android.support.v4.view.av.r(this.s);
      break label720;
      this.a = i2;
      this.H.reset();
      this.H.setDuration(200L);
      this.H.setInterpolator(this.q);
      if (local4 != null)
        this.s.a(local4);
      this.s.clearAnimation();
      this.s.startAnimation(this.H);
    }
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SwipeRefreshLayout
 * JD-Core Version:    0.6.2
 */