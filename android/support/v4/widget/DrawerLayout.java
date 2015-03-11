package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.ab;
import android.support.v4.view.aq;
import android.support.v4.view.bi;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class DrawerLayout extends ViewGroup
  implements q
{
  static final j a = new l();
  private static final int[] b = { 16842931 };
  private Object A;
  private boolean B;
  private final i c = new i(this);
  private int d;
  private int e = -1728053248;
  private float f;
  private Paint g = new Paint();
  private final ao h;
  private final ao i;
  private final n j;
  private final n k;
  private int l;
  private boolean m;
  private boolean n = true;
  private int o;
  private int p;
  private boolean q;
  private boolean r;
  private m s;
  private float t;
  private float u;
  private Drawable v;
  private Drawable w;
  private Drawable x;
  private CharSequence y;
  private CharSequence z;

  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new k();
      return;
    }
  }

  public DrawerLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResources().getDisplayMetrics().density;
    this.d = ((int)(0.5F + 64.0F * f1));
    float f2 = f1 * 400.0F;
    this.j = new n(this, 3);
    this.k = new n(this, 5);
    this.h = ao.a(this, 1.0F, this.j);
    this.h.a(1);
    this.h.a(f2);
    this.j.a(this.h);
    this.i = ao.a(this, 1.0F, this.k);
    this.i.a(2);
    this.i.a(f2);
    this.k.a(this.i);
    setFocusableInTouchMode(true);
    aq.c(this, 1);
    aq.a(this, new h(this));
    bi.a(this, false);
    if (aq.i(this))
      a.a(this);
  }

  private void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool = false;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
      if ((d(localView)) && ((!paramBoolean) || (localLayoutParams.c)))
      {
        int i3 = localView.getWidth();
        if (!a(localView, 3))
          break label103;
        bool |= this.h.a(localView, -i3, localView.getTop());
      }
      while (true)
      {
        localLayoutParams.c = false;
        i2++;
        break;
        label103: bool |= this.i.a(localView, getWidth(), localView.getTop());
      }
    }
    this.j.a();
    this.k.a();
    if (bool)
      invalidate();
  }

  static float b(View paramView)
  {
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).b;
  }

  private void b(int paramInt1, int paramInt2)
  {
    int i1 = android.support.v4.view.m.a(paramInt2, aq.e(this));
    ao localao;
    if (i1 == 3)
    {
      this.o = paramInt1;
      if (paramInt1 != 0)
      {
        if (i1 != 3)
          break label78;
        localao = this.h;
        label34: localao.e();
      }
      switch (paramInt1)
      {
      default:
      case 2:
      case 1:
      }
    }
    label78: View localView1;
    do
    {
      View localView2;
      do
      {
        return;
        if (i1 != 5)
          break;
        this.p = paramInt1;
        break;
        localao = this.i;
        break label34;
        localView2 = b(i1);
      }
      while (localView2 == null);
      i(localView2);
      return;
      localView1 = b(i1);
    }
    while (localView1 == null);
    e(localView1);
  }

  private View c()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if ((d(localView)) && (j(localView)))
        return localView;
    }
    return null;
  }

  static boolean d(View paramView)
  {
    return (0x7 & android.support.v4.view.m.a(((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a, aq.e(paramView))) != 0;
  }

  private static String g(int paramInt)
  {
    if ((paramInt & 0x3) == 3)
      return "LEFT";
    if ((paramInt & 0x5) == 5)
      return "RIGHT";
    return Integer.toHexString(paramInt);
  }

  private static boolean h(View paramView)
  {
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a == 0;
  }

  private void i(View paramView)
  {
    if (!d(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    if (this.n)
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.b = 1.0F;
      localLayoutParams.d = true;
      View localView = getChildAt(0);
      if (localView != null)
        aq.c(localView, 4);
      aq.c(paramView, 1);
    }
    while (true)
    {
      invalidate();
      return;
      if (a(paramView, 3))
        this.h.a(paramView, 0, paramView.getTop());
      else
        this.i.a(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
    }
  }

  private boolean j(View paramView)
  {
    if (!d(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).b > 0.0F;
  }

  public final int a(View paramView)
  {
    int i1 = c(paramView);
    if (i1 == 3)
      return this.o;
    if (i1 == 5)
      return this.p;
    return 0;
  }

  public final CharSequence a(int paramInt)
  {
    int i1 = android.support.v4.view.m.a(paramInt, aq.e(this));
    if (i1 == 3)
      return this.y;
    if (i1 == 5)
      return this.z;
    return null;
  }

  final void a()
  {
    int i1 = 0;
    if (!this.r)
    {
      long l1 = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
      int i2 = getChildCount();
      while (i1 < i2)
      {
        getChildAt(i1).dispatchTouchEvent(localMotionEvent);
        i1++;
      }
      localMotionEvent.recycle();
      this.r = true;
    }
  }

  public final void a(int paramInt1, int paramInt2)
  {
    Drawable localDrawable = getResources().getDrawable(2130837857);
    int i1 = android.support.v4.view.m.a(8388611, aq.e(this));
    if ((i1 & 0x3) == 3)
    {
      this.v = localDrawable;
      invalidate();
    }
    if ((i1 & 0x5) == 5)
    {
      this.w = localDrawable;
      invalidate();
    }
  }

  final void a(int paramInt, View paramView)
  {
    int i1 = this.h.a();
    int i2 = this.i.a();
    int i3;
    DrawerLayout.LayoutParams localLayoutParams1;
    if ((i1 == 1) || (i2 == 1))
    {
      i3 = 1;
      if ((paramView != null) && (paramInt == 0))
      {
        localLayoutParams1 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
        if (localLayoutParams1.b != 0.0F)
          break label197;
        DrawerLayout.LayoutParams localLayoutParams3 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
        if (localLayoutParams3.d)
        {
          localLayoutParams3.d = false;
          if (this.s != null)
            this.s.b(paramView);
          View localView2 = getChildAt(0);
          if (localView2 != null)
            aq.c(localView2, 1);
          aq.c(paramView, 4);
          if (hasWindowFocus())
          {
            View localView3 = getRootView();
            if (localView3 != null)
              localView3.sendAccessibilityEvent(32);
          }
        }
      }
    }
    while (true)
    {
      if (i3 != this.l)
      {
        this.l = i3;
        if (this.s == null);
      }
      return;
      if ((i1 == 2) || (i2 == 2))
      {
        i3 = 2;
        break;
      }
      i3 = 0;
      break;
      label197: if (localLayoutParams1.b == 1.0F)
      {
        DrawerLayout.LayoutParams localLayoutParams2 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
        if (!localLayoutParams2.d)
        {
          localLayoutParams2.d = true;
          if (this.s != null)
            this.s.a(paramView);
          View localView1 = getChildAt(0);
          if (localView1 != null)
            aq.c(localView1, 4);
          aq.c(paramView, 1);
          sendAccessibilityEvent(32);
          paramView.requestFocus();
        }
      }
    }
  }

  public final void a(m paramm)
  {
    this.s = paramm;
  }

  final void a(View paramView, float paramFloat)
  {
    DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    if (paramFloat == localLayoutParams.b);
    do
    {
      return;
      localLayoutParams.b = paramFloat;
    }
    while (this.s == null);
    this.s.a(paramFloat);
  }

  final boolean a(View paramView, int paramInt)
  {
    return (paramInt & c(paramView)) == paramInt;
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramInt > 0) || ((paramInt < 0) && (getChildCount() > 0)))
    {
      aq.c(paramView, 4);
      aq.a(paramView, this.c);
    }
    while (true)
    {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
      aq.c(paramView, 1);
    }
  }

  final View b(int paramInt)
  {
    int i1 = 0x7 & android.support.v4.view.m.a(paramInt, aq.e(this));
    int i2 = getChildCount();
    for (int i3 = 0; i3 < i2; i3++)
    {
      View localView = getChildAt(i3);
      if ((0x7 & c(localView)) == i1)
        return localView;
    }
    return null;
  }

  final int c(View paramView)
  {
    return android.support.v4.view.m.a(((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a, aq.e(this));
  }

  public final void c(int paramInt)
  {
    View localView = b(8388611);
    if (localView == null)
      throw new IllegalArgumentException("No drawer view found with gravity " + g(8388611));
    i(localView);
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof DrawerLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    int i1 = getChildCount();
    float f1 = 0.0F;
    for (int i2 = 0; i2 < i1; i2++)
      f1 = Math.max(f1, ((DrawerLayout.LayoutParams)getChildAt(i2).getLayoutParams()).b);
    this.f = f1;
    if ((this.h.a(true) | this.i.a(true)))
      aq.b(this);
  }

  public final void d(int paramInt)
  {
    View localView = b(8388611);
    if (localView == null)
      throw new IllegalArgumentException("No drawer view found with gravity " + g(8388611));
    e(localView);
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i1 = getHeight();
    boolean bool1 = h(paramView);
    int i2 = getWidth();
    int i3 = paramCanvas.save();
    int i4 = 0;
    int i15;
    View localView;
    int i17;
    label94: int i18;
    if (bool1)
    {
      int i14 = getChildCount();
      i15 = 0;
      if (i15 < i14)
      {
        localView = getChildAt(i15);
        if ((localView != paramView) && (localView.getVisibility() == 0))
        {
          Drawable localDrawable = localView.getBackground();
          if (localDrawable != null)
            if (localDrawable.getOpacity() == -1)
            {
              i17 = 1;
              if ((i17 == 0) || (!d(localView)) || (localView.getHeight() < i1))
                break label185;
              if (!a(localView, 3))
                break label171;
              i18 = localView.getRight();
              if (i18 <= i4)
                break label520;
            }
        }
      }
    }
    while (true)
    {
      i4 = i18;
      int i16 = i2;
      while (true)
      {
        i15++;
        i2 = i16;
        break;
        i17 = 0;
        break label94;
        i17 = 0;
        break label94;
        label171: i16 = localView.getLeft();
        if (i16 >= i2)
          label185: i16 = i2;
      }
      paramCanvas.clipRect(i4, 0, i2, getHeight());
      int i5 = i2;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i3);
      if ((this.f > 0.0F) && (bool1))
      {
        int i13 = (int)(((0xFF000000 & this.e) >>> 24) * this.f) << 24 | 0xFFFFFF & this.e;
        this.g.setColor(i13);
        paramCanvas.drawRect(i4, 0.0F, i5, getHeight(), this.g);
      }
      do
      {
        return bool2;
        if ((this.v != null) && (a(paramView, 3)))
        {
          int i10 = this.v.getIntrinsicWidth();
          int i11 = paramView.getRight();
          int i12 = this.h.b();
          float f2 = Math.max(0.0F, Math.min(i11 / i12, 1.0F));
          this.v.setBounds(i11, paramView.getTop(), i10 + i11, paramView.getBottom());
          this.v.setAlpha((int)(255.0F * f2));
          this.v.draw(paramCanvas);
          return bool2;
        }
      }
      while ((this.w == null) || (!a(paramView, 5)));
      int i6 = this.w.getIntrinsicWidth();
      int i7 = paramView.getLeft();
      int i8 = getWidth() - i7;
      int i9 = this.i.b();
      float f1 = Math.max(0.0F, Math.min(i8 / i9, 1.0F));
      this.w.setBounds(i7 - i6, paramView.getTop(), i7, paramView.getBottom());
      this.w.setAlpha((int)(255.0F * f1));
      this.w.draw(paramCanvas);
      return bool2;
      label520: i18 = i4;
    }
  }

  public final void e(View paramView)
  {
    if (!d(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    if (this.n)
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.b = 0.0F;
      localLayoutParams.d = false;
    }
    while (true)
    {
      invalidate();
      return;
      if (a(paramView, 3))
        this.h.a(paramView, -paramView.getWidth(), paramView.getTop());
      else
        this.i.a(paramView, getWidth(), paramView.getTop());
    }
  }

  public final boolean e(int paramInt)
  {
    View localView = b(8388611);
    if (localView != null)
      return f(localView);
    return false;
  }

  public final boolean f(int paramInt)
  {
    View localView = b(8388611);
    if (localView != null)
      return j(localView);
    return false;
  }

  public final boolean f(View paramView)
  {
    if (!d(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).d;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new DrawerLayout.LayoutParams(-1, -1);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new DrawerLayout.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof DrawerLayout.LayoutParams))
      return new DrawerLayout.LayoutParams((DrawerLayout.LayoutParams)paramLayoutParams);
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new DrawerLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new DrawerLayout.LayoutParams(paramLayoutParams);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.n = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.n = true;
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.B) && (this.x != null))
    {
      int i1 = a.a(this.A);
      if (i1 > 0)
      {
        this.x.setBounds(0, 0, getWidth(), i1);
        this.x.draw(paramCanvas);
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ab.a(paramMotionEvent);
    boolean bool1 = this.h.a(paramMotionEvent) | this.i.a(paramMotionEvent);
    label59: int i4;
    label77: int i5;
    switch (i1)
    {
    default:
      i2 = 0;
      if ((!bool1) && (i2 == 0))
      {
        int i3 = getChildCount();
        i4 = 0;
        if (i4 >= i3)
          break label253;
        if (!((DrawerLayout.LayoutParams)getChildAt(i4).getLayoutParams()).c)
          break;
        i5 = 1;
        if (i5 == 0)
        {
          boolean bool3 = this.r;
          bool2 = false;
          if (!bool3)
            break label127;
        }
      }
      boolean bool2 = true;
      return bool2;
    case 0:
      label105: label127: float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.t = f1;
      this.u = f2;
      if ((this.f <= 0.0F) || (!h(this.h.b((int)f1, (int)f2))));
      break;
    case 2:
    case 1:
    case 3:
    }
    for (int i2 = 1; ; i2 = 0)
    {
      this.q = false;
      this.r = false;
      break label59;
      if (!this.h.c(3))
        break;
      this.j.a();
      this.k.a();
      i2 = 0;
      break label59;
      a(true);
      this.q = false;
      this.r = false;
      break;
      i4++;
      break label77;
      label253: i5 = 0;
      break label105;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (c() != null);
      for (int i1 = 1; i1 != 0; i1 = 0)
      {
        android.support.v4.view.q.b(paramKeyEvent);
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      View localView = c();
      if ((localView != null) && (a(localView) == 0))
        a(false);
      boolean bool = false;
      if (localView != null)
        bool = true;
      return bool;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.m = true;
    int i1 = paramInt3 - paramInt1;
    int i2 = getChildCount();
    int i3 = 0;
    while (i3 < i2)
    {
      View localView = getChildAt(i3);
      DrawerLayout.LayoutParams localLayoutParams;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        if (h(localView))
          localView.layout(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.leftMargin + localView.getMeasuredWidth(), localLayoutParams.topMargin + localView.getMeasuredHeight());
      }
      else
      {
        i3++;
        continue;
      }
      int i4 = localView.getMeasuredWidth();
      int i5 = localView.getMeasuredHeight();
      int i6;
      float f1;
      label158: int i7;
      if (a(localView, 3))
      {
        i6 = -i4 + (int)(i4 * localLayoutParams.b);
        f1 = (i4 + i6) / i4;
        if (f1 == localLayoutParams.b)
          break label309;
        i7 = 1;
        label172: switch (0x70 & localLayoutParams.a)
        {
        default:
          localView.layout(i6, localLayoutParams.topMargin, i4 + i6, i5 + localLayoutParams.topMargin);
          label233: if (i7 != 0)
            a(localView, f1);
          if (localLayoutParams.b <= 0.0F)
            break;
        case 80:
        case 16:
        }
      }
      for (int i10 = 0; localView.getVisibility() != i10; i10 = 4)
      {
        localView.setVisibility(i10);
        break;
        i6 = i1 - (int)(i4 * localLayoutParams.b);
        f1 = (i1 - i6) / i4;
        break label158;
        label309: i7 = 0;
        break label172;
        int i11 = paramInt4 - paramInt2;
        localView.layout(i6, i11 - localLayoutParams.bottomMargin - localView.getMeasuredHeight(), i4 + i6, i11 - localLayoutParams.bottomMargin);
        break label233;
        int i8 = paramInt4 - paramInt2;
        int i9 = (i8 - i5) / 2;
        if (i9 < localLayoutParams.topMargin)
          i9 = localLayoutParams.topMargin;
        while (true)
        {
          localView.layout(i6, i9, i4 + i6, i5 + i9);
          break;
          if (i9 + i5 > i8 - localLayoutParams.bottomMargin)
            i9 = i8 - localLayoutParams.bottomMargin - i5;
        }
      }
    }
    this.m = false;
    this.n = false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 300;
    int i2 = 0;
    int i3 = View.MeasureSpec.getMode(paramInt1);
    int i4 = View.MeasureSpec.getMode(paramInt2);
    int i5 = View.MeasureSpec.getSize(paramInt1);
    int i6 = View.MeasureSpec.getSize(paramInt2);
    if ((i3 != 1073741824) || (i4 != 1073741824))
      if (isInEditMode())
      {
        if ((i3 != -2147483648) && (i3 == 0))
          i5 = i1;
        if ((i4 == -2147483648) || (i4 != 0))
          break label477;
      }
    while (true)
    {
      setMeasuredDimension(i5, i1);
      int i7;
      label119: View localView;
      DrawerLayout.LayoutParams localLayoutParams;
      int i11;
      if ((this.A != null) && (aq.i(this)))
      {
        i7 = 1;
        int i8 = aq.e(this);
        int i9 = getChildCount();
        if (i2 >= i9)
          break label476;
        localView = getChildAt(i2);
        if (localView.getVisibility() != 8)
        {
          localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
          if (i7 != 0)
          {
            i11 = android.support.v4.view.m.a(localLayoutParams.a, i8);
            if (!aq.i(localView))
              break label270;
            a.a(localView, this.A, i11);
          }
          label195: if (!h(localView))
            break label289;
          localView.measure(View.MeasureSpec.makeMeasureSpec(i5 - localLayoutParams.leftMargin - localLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i1 - localLayoutParams.topMargin - localLayoutParams.bottomMargin, 1073741824));
        }
      }
      while (true)
      {
        i2++;
        break label119;
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        i7 = 0;
        break;
        label270: a.a(localLayoutParams, this.A, i11);
        break label195;
        label289: if (!d(localView))
          break label424;
        int i10 = 0x7 & c(localView);
        if ((i10 & 0x0) != 0)
          throw new IllegalStateException("Child drawer has absolute gravity " + g(i10) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
        localView.measure(getChildMeasureSpec(paramInt1, this.d + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width), getChildMeasureSpec(paramInt2, localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height));
      }
      label424: throw new IllegalStateException("Child " + localView + " at index " + i2 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
      label476: return;
      label477: i1 = i6;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    DrawerLayout.SavedState localSavedState = (DrawerLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a != 0)
    {
      View localView = b(localSavedState.a);
      if (localView != null)
        i(localView);
    }
    b(localSavedState.b, 3);
    b(localSavedState.c, 5);
  }

  protected Parcelable onSaveInstanceState()
  {
    DrawerLayout.SavedState localSavedState = new DrawerLayout.SavedState(super.onSaveInstanceState());
    int i1 = getChildCount();
    for (int i2 = 0; ; i2++)
      if (i2 < i1)
      {
        View localView = getChildAt(i2);
        if (d(localView))
        {
          DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
          if (localLayoutParams.d)
            localSavedState.a = localLayoutParams.a;
        }
      }
      else
      {
        localSavedState.b = this.o;
        localSavedState.c = this.p;
        return localSavedState;
      }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.h.b(paramMotionEvent);
    this.i.b(paramMotionEvent);
    int i3;
    View localView2;
    label218: boolean bool;
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 2:
    default:
      return true;
    case 0:
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.t = f5;
      this.u = f6;
      this.q = false;
      this.r = false;
      return true;
    case 1:
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      View localView1 = this.h.b((int)f1, (int)f2);
      if ((localView1 != null) && (h(localView1)))
      {
        float f3 = f1 - this.t;
        float f4 = f2 - this.u;
        int i1 = this.h.d();
        if (f3 * f3 + f4 * f4 < i1 * i1)
        {
          int i2 = getChildCount();
          i3 = 0;
          if (i3 < i2)
          {
            View localView3 = getChildAt(i3);
            if (((DrawerLayout.LayoutParams)localView3.getLayoutParams()).d)
            {
              localView2 = localView3;
              if (localView2 == null)
                break label284;
              if (a(localView2) != 2)
                break label261;
              bool = true;
            }
          }
        }
      }
      break;
    case 3:
    }
    while (true)
    {
      a(bool);
      this.q = false;
      return true;
      i3++;
      break;
      localView2 = null;
      break label218;
      label261: bool = false;
      continue;
      a(true);
      this.q = false;
      this.r = false;
      return true;
      label284: bool = true;
    }
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.q = paramBoolean;
    if (paramBoolean)
      a(true);
  }

  public void requestLayout()
  {
    if (!this.m)
      super.requestLayout();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.DrawerLayout
 * JD-Core Version:    0.6.2
 */