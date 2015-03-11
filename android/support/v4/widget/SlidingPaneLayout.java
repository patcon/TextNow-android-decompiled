package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.ab;
import android.support.v4.view.aq;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup
{
  static final aj a = new ak();
  private int b = -858993460;
  private int c;
  private Drawable d;
  private Drawable e;
  private final int f;
  private boolean g;
  private View h;
  private float i;
  private float j;
  private int k;
  private boolean l;
  private int m;
  private float n;
  private float o;
  private ai p;
  private final ao q;
  private boolean r;
  private boolean s = true;
  private final Rect t = new Rect();
  private final ArrayList<ag> u = new ArrayList();

  static
  {
    int i1 = Build.VERSION.SDK_INT;
    if (i1 >= 17)
    {
      a = new am();
      return;
    }
    if (i1 >= 16)
    {
      a = new al();
      return;
    }
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.f = ((int)(0.5F + 32.0F * f1));
    ViewConfiguration.get(paramContext);
    setWillNotDraw(false);
    aq.a(this, new af(this));
    aq.c(this, 1);
    this.q = ao.a(this, 0.5F, new ah(this, (byte)0));
    this.q.a(f1 * 400.0F);
  }

  private void a(View paramView, float paramFloat, int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      i1 = (int)(paramFloat * ((0xFF000000 & paramInt) >>> 24)) << 24 | 0xFFFFFF & paramInt;
      if (localLayoutParams.d == null)
        localLayoutParams.d = new Paint();
      localLayoutParams.d.setColorFilter(new PorterDuffColorFilter(i1, PorterDuff.Mode.SRC_OVER));
      if (aq.d(paramView) != 2)
        aq.a(paramView, 2, localLayoutParams.d);
      e(paramView);
    }
    while (aq.d(paramView) == 0)
    {
      int i1;
      return;
    }
    if (localLayoutParams.d != null)
      localLayoutParams.d.setColorFilter(null);
    ag localag = new ag(this, paramView);
    this.u.add(localag);
    aq.a(this, localag);
  }

  private boolean a(float paramFloat)
  {
    if (!this.g)
      return false;
    boolean bool = b();
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.h.getLayoutParams();
    int i2;
    int i3;
    if (bool)
    {
      i2 = getPaddingRight() + localLayoutParams.rightMargin;
      i3 = this.h.getWidth();
    }
    for (int i1 = (int)(getWidth() - (i2 + paramFloat * this.k + i3)); this.q.a(this.h, i1, this.h.getTop()); i1 = (int)(getPaddingLeft() + localLayoutParams.leftMargin + paramFloat * this.k))
    {
      a();
      aq.b(this);
      return true;
    }
    return false;
  }

  private boolean a(int paramInt)
  {
    boolean bool1;
    if (!this.s)
    {
      boolean bool2 = a(0.0F);
      bool1 = false;
      if (!bool2);
    }
    else
    {
      this.r = false;
      bool1 = true;
    }
    return bool1;
  }

  private void b(float paramFloat)
  {
    boolean bool = b();
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.h.getLayoutParams();
    int i6;
    int i1;
    label41: int i3;
    label50: View localView;
    if (localLayoutParams.c)
      if (bool)
      {
        i6 = localLayoutParams.rightMargin;
        if (i6 > 0)
          break label169;
        i1 = 1;
        int i2 = getChildCount();
        i3 = 0;
        if (i3 >= i2)
          return;
        localView = getChildAt(i3);
        if (localView != this.h)
        {
          int i4 = (int)((1.0F - this.j) * this.m);
          this.j = paramFloat;
          int i5 = i4 - (int)((1.0F - paramFloat) * this.m);
          if (bool)
            i5 = -i5;
          localView.offsetLeftAndRight(i5);
          if (i1 != 0)
            if (!bool)
              break label175;
        }
      }
    label169: label175: for (float f1 = this.j - 1.0F; ; f1 = 1.0F - this.j)
    {
      a(localView, f1, this.c);
      i3++;
      break label50;
      i6 = localLayoutParams.leftMargin;
      break;
      i1 = 0;
      break label41;
    }
  }

  private boolean b()
  {
    return aq.e(this) == 1;
  }

  private void e(View paramView)
  {
    a.a(this, paramView);
  }

  final void a()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 4)
        localView.setVisibility(0);
    }
  }

  final void a(View paramView)
  {
    if (this.p != null);
    sendAccessibilityEvent(32);
  }

  final void b(View paramView)
  {
    if (this.p != null);
    sendAccessibilityEvent(32);
  }

  final void c(View paramView)
  {
    boolean bool = b();
    int i1;
    int i2;
    label29: int i18;
    label60: int i8;
    int i7;
    int i6;
    int i5;
    label89: int i10;
    label98: View localView;
    int i11;
    label127: int i14;
    if (bool)
    {
      i1 = getWidth() - getPaddingRight();
      if (!bool)
        break label234;
      i2 = getPaddingLeft();
      int i3 = getPaddingTop();
      int i4 = getHeight() - getPaddingBottom();
      if (paramView == null)
        break label294;
      if (!aq.g(paramView))
        break label248;
      i18 = 1;
      if (i18 == 0)
        break label294;
      i8 = paramView.getLeft();
      i7 = paramView.getRight();
      i6 = paramView.getTop();
      i5 = paramView.getBottom();
      int i9 = getChildCount();
      i10 = 0;
      if (i10 >= i9)
        return;
      localView = getChildAt(i10);
      if (localView == paramView)
        return;
      if (!bool)
        break label309;
      i11 = i2;
      int i12 = Math.max(i11, localView.getLeft());
      int i13 = Math.max(i3, localView.getTop());
      if (!bool)
        break label315;
      i14 = i1;
      label158: int i15 = Math.min(i14, localView.getRight());
      int i16 = Math.min(i4, localView.getBottom());
      if ((i12 < i8) || (i13 < i6) || (i15 > i7) || (i16 > i5))
        break label322;
    }
    label294: label309: label315: label322: for (int i17 = 4; ; i17 = 0)
    {
      localView.setVisibility(i17);
      i10++;
      break label98;
      i1 = getPaddingLeft();
      break;
      label234: i2 = getWidth() - getPaddingRight();
      break label29;
      label248: if (Build.VERSION.SDK_INT < 18)
      {
        Drawable localDrawable = paramView.getBackground();
        if (localDrawable != null)
        {
          if (localDrawable.getOpacity() == -1)
          {
            i18 = 1;
            break label60;
          }
          i18 = 0;
          break label60;
        }
      }
      i18 = 0;
      break label60;
      i5 = 0;
      i6 = 0;
      i7 = 0;
      i8 = 0;
      break label89;
      i11 = i1;
      break label127;
      i14 = i2;
      break label158;
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof SlidingPaneLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    if (this.q.a(true))
    {
      if (!this.g)
        this.q.f();
    }
    else
      return;
    aq.b(this);
  }

  final boolean d(View paramView)
  {
    if (paramView == null)
      return false;
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    return (this.g) && (localLayoutParams.c) && (this.i > 0.0F);
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Drawable localDrawable;
    if (b())
    {
      localDrawable = this.e;
      if (getChildCount() <= 1)
        break label48;
    }
    label48: for (View localView = getChildAt(1); ; localView = null)
    {
      if ((localView != null) && (localDrawable != null))
        break label53;
      return;
      localDrawable = this.d;
      break;
    }
    label53: int i1 = localView.getTop();
    int i2 = localView.getBottom();
    int i3 = localDrawable.getIntrinsicWidth();
    int i5;
    int i4;
    if (b())
    {
      i5 = localView.getRight();
      i4 = i5 + i3;
    }
    while (true)
    {
      localDrawable.setBounds(i5, i1, i4, i2);
      localDrawable.draw(paramCanvas);
      return;
      i4 = localView.getLeft();
      i5 = i4 - i3;
    }
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i1 = paramCanvas.save(2);
    boolean bool;
    if ((this.g) && (!localLayoutParams.b) && (this.h != null))
    {
      paramCanvas.getClipBounds(this.t);
      if (b())
      {
        this.t.left = Math.max(this.t.left, this.h.getRight());
        paramCanvas.clipRect(this.t);
      }
    }
    else
    {
      if (Build.VERSION.SDK_INT >= 11)
        break label246;
      if ((!localLayoutParams.c) || (this.i <= 0.0F))
        break label234;
      if (!paramView.isDrawingCacheEnabled())
        paramView.setDrawingCacheEnabled(true);
      Bitmap localBitmap = paramView.getDrawingCache();
      if (localBitmap == null)
        break label195;
      paramCanvas.drawBitmap(localBitmap, paramView.getLeft(), paramView.getTop(), localLayoutParams.d);
      bool = false;
    }
    while (true)
    {
      paramCanvas.restoreToCount(i1);
      return bool;
      this.t.right = Math.min(this.t.right, this.h.getLeft());
      break;
      label195: new StringBuilder().append("drawChild: child view ").append(paramView).append(" returned null drawing cache").toString();
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      continue;
      label234: if (paramView.isDrawingCacheEnabled())
        paramView.setDrawingCacheEnabled(false);
      label246: bool = super.drawChild(paramCanvas, paramView, paramLong);
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new SlidingPaneLayout.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new SlidingPaneLayout.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new SlidingPaneLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new SlidingPaneLayout.LayoutParams(paramLayoutParams);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.s = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.s = true;
    int i1 = this.u.size();
    for (int i2 = 0; i2 < i1; i2++)
      ((ag)this.u.get(i2)).run();
    this.u.clear();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ab.a(paramMotionEvent);
    if ((!this.g) && (i1 == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null)
        if (ao.b(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          break label101;
    }
    boolean bool1;
    label101: for (boolean bool2 = true; ; bool2 = false)
    {
      this.r = bool2;
      if ((this.g) && ((!this.l) || (i1 == 0)))
        break;
      this.q.e();
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool1;
    }
    if ((i1 == 3) || (i1 == 1))
    {
      this.q.e();
      return false;
    }
    switch (i1)
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    label152: float f3;
    float f4;
    do
    {
      for (int i2 = 0; ; i2 = 1)
      {
        if (!this.q.a(paramMotionEvent))
        {
          bool1 = false;
          if (i2 == 0)
            break;
        }
        return true;
        this.l = false;
        float f5 = paramMotionEvent.getX();
        float f6 = paramMotionEvent.getY();
        this.n = f5;
        this.o = f6;
        if ((!ao.b(this.h, (int)f5, (int)f6)) || (!d(this.h)))
          break label152;
      }
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      f3 = Math.abs(f1 - this.n);
      f4 = Math.abs(f2 - this.o);
    }
    while ((f3 <= this.q.d()) || (f4 <= f3));
    this.q.e();
    this.l = true;
    return false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = b();
    int i2;
    label36: int i3;
    label47: int i5;
    float f1;
    label83: int i6;
    int i7;
    label96: SlidingPaneLayout.LayoutParams localLayoutParams;
    int i11;
    int i12;
    int i19;
    label203: boolean bool2;
    label227: int i14;
    int i16;
    int i15;
    label290: int i9;
    if (bool1)
    {
      this.q.a(2);
      int i1 = paramInt3 - paramInt1;
      if (!bool1)
        break label348;
      i2 = getPaddingRight();
      if (!bool1)
        break label357;
      i3 = getPaddingLeft();
      int i4 = getPaddingTop();
      i5 = getChildCount();
      if (this.s)
      {
        if ((!this.g) || (!this.r))
          break label366;
        f1 = 1.0F;
        this.i = f1;
      }
      i6 = 0;
      i7 = i2;
      if (i6 >= i5)
        break label445;
      View localView = getChildAt(i6);
      if (localView.getVisibility() == 8)
        break label557;
      localLayoutParams = (SlidingPaneLayout.LayoutParams)localView.getLayoutParams();
      i11 = localView.getMeasuredWidth();
      i12 = 0;
      if (!localLayoutParams.b)
        break label388;
      int i17 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
      int i18 = Math.min(i2, i1 - i3 - this.f) - i7 - i17;
      this.k = i18;
      if (!bool1)
        break label372;
      i19 = localLayoutParams.rightMargin;
      if (i18 + (i7 + i19) + i11 / 2 <= i1 - i3)
        break label382;
      bool2 = true;
      localLayoutParams.c = bool2;
      int i20 = (int)(i18 * this.i);
      i14 = i7 + (i19 + i20);
      this.i = (i20 / this.k);
      if (!bool1)
        break label428;
      i16 = i12 + (i1 - i14);
      i15 = i16 - i11;
      localView.layout(i15, i4, i16, i4 + localView.getMeasuredHeight());
      i9 = i2 + localView.getWidth();
    }
    for (int i10 = i14; ; i10 = i7)
    {
      i6++;
      i2 = i9;
      i7 = i10;
      break label96;
      this.q.a(1);
      break;
      label348: i2 = getPaddingLeft();
      break label36;
      label357: i3 = getPaddingRight();
      break label47;
      label366: f1 = 0.0F;
      break label83;
      label372: i19 = localLayoutParams.leftMargin;
      break label203;
      label382: bool2 = false;
      break label227;
      label388: if ((this.g) && (this.m != 0));
      for (int i13 = (int)((1.0F - this.i) * this.m); ; i13 = 0)
      {
        i12 = i13;
        i14 = i2;
        break;
        label428: i15 = i14 - i12;
        i16 = i15 + i11;
        break label290;
        label445: if (this.s)
        {
          if (!this.g)
            break label520;
          if (this.m != 0)
            b(this.i);
          if (((SlidingPaneLayout.LayoutParams)this.h.getLayoutParams()).c)
            a(this.h, this.i, this.b);
        }
        while (true)
        {
          c(this.h);
          this.s = false;
          return;
          label520: for (int i8 = 0; i8 < i5; i8++)
            a(getChildAt(i8), 0.0F, this.b);
        }
      }
      label557: i9 = i2;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i5;
    int i6;
    int i7;
    if (i1 != 1073741824)
      if (isInEditMode())
      {
        if ((i1 == -2147483648) || (i1 != 0))
          break label1091;
        i5 = i3;
        i6 = 300;
        i7 = i4;
      }
    while (true)
    {
      int i9;
      int i8;
      label94: boolean bool1;
      int i10;
      int i11;
      int i12;
      int i13;
      int i14;
      float f1;
      label136: View localView2;
      SlidingPaneLayout.LayoutParams localLayoutParams2;
      int i30;
      int i31;
      float f2;
      boolean bool4;
      switch (i5)
      {
      default:
        i9 = 0;
        i8 = -1;
        bool1 = false;
        i10 = i6 - getPaddingLeft() - getPaddingRight();
        i11 = getChildCount();
        this.h = null;
        i12 = 0;
        i13 = i10;
        i14 = i9;
        f1 = 0.0F;
        if (i12 < i11)
        {
          localView2 = getChildAt(i12);
          localLayoutParams2 = (SlidingPaneLayout.LayoutParams)localView2.getLayoutParams();
          if (localView2.getVisibility() == 8)
          {
            localLayoutParams2.c = false;
            i30 = i13;
            i31 = i14;
            f2 = f1;
            bool4 = bool1;
          }
        }
        break;
      case 1073741824:
      case -2147483648:
      }
      while (true)
      {
        i12++;
        bool1 = bool4;
        i14 = i31;
        i13 = i30;
        f1 = f2;
        break label136;
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (i3 != 0)
          break label1091;
        if (isInEditMode())
        {
          if (i3 != 0)
            break label1091;
          i5 = -2147483648;
          i6 = i2;
          i7 = 300;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        i9 = i7 - getPaddingTop() - getPaddingBottom();
        i8 = i9;
        break label94;
        i8 = i7 - getPaddingTop() - getPaddingBottom();
        i9 = 0;
        break label94;
        if (localLayoutParams2.a > 0.0F)
        {
          f1 += localLayoutParams2.a;
          if (localLayoutParams2.width == 0);
        }
        else
        {
          int i24 = localLayoutParams2.leftMargin + localLayoutParams2.rightMargin;
          int i25;
          label376: int i26;
          label396: int i29;
          if (localLayoutParams2.width == -2)
          {
            i25 = View.MeasureSpec.makeMeasureSpec(i10 - i24, -2147483648);
            if (localLayoutParams2.height != -2)
              break label546;
            i26 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
            localView2.measure(i25, i26);
            int i27 = localView2.getMeasuredWidth();
            int i28 = localView2.getMeasuredHeight();
            if ((i5 == -2147483648) && (i28 > i14))
              i14 = Math.min(i28, i8);
            i29 = i13 - i27;
            if (i29 >= 0)
              break label584;
          }
          label546: label584: for (boolean bool2 = true; ; bool2 = false)
          {
            localLayoutParams2.b = bool2;
            boolean bool3 = bool2 | bool1;
            if (localLayoutParams2.b)
              this.h = localView2;
            i30 = i29;
            f2 = f1;
            bool4 = bool3;
            i31 = i14;
            break;
            if (localLayoutParams2.width == -1)
            {
              i25 = View.MeasureSpec.makeMeasureSpec(i10 - i24, 1073741824);
              break label376;
            }
            i25 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824);
            break label376;
            if (localLayoutParams2.height == -1)
            {
              i26 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
              break label396;
            }
            i26 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.height, 1073741824);
            break label396;
          }
          if ((bool1) || (f1 > 0.0F))
          {
            int i15 = i10 - this.f;
            int i16 = 0;
            if (i16 < i11)
            {
              View localView1 = getChildAt(i16);
              SlidingPaneLayout.LayoutParams localLayoutParams1;
              int i17;
              label680: int i18;
              label688: int i23;
              if (localView1.getVisibility() != 8)
              {
                localLayoutParams1 = (SlidingPaneLayout.LayoutParams)localView1.getLayoutParams();
                if (localView1.getVisibility() != 8)
                {
                  if ((localLayoutParams1.width != 0) || (localLayoutParams1.a <= 0.0F))
                    break label773;
                  i17 = 1;
                  if (i17 == 0)
                    break label779;
                  i18 = 0;
                  if ((!bool1) || (localView1 == this.h))
                    break label843;
                  if ((localLayoutParams1.width < 0) && ((i18 > i15) || (localLayoutParams1.a > 0.0F)))
                  {
                    if (i17 == 0)
                      break label827;
                    if (localLayoutParams1.height != -2)
                      break label789;
                    i23 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
                    label752: localView1.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), i23);
                  }
                }
              }
              while (true)
              {
                i16++;
                break;
                label773: i17 = 0;
                break label680;
                label779: i18 = localView1.getMeasuredWidth();
                break label688;
                label789: if (localLayoutParams1.height == -1)
                {
                  i23 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                  break label752;
                }
                i23 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                break label752;
                label827: i23 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                break label752;
                label843: if (localLayoutParams1.a > 0.0F)
                {
                  int i19;
                  if (localLayoutParams1.width == 0)
                    if (localLayoutParams1.height == -2)
                      i19 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
                  while (true)
                  {
                    if (!bool1)
                      break label985;
                    int i21 = i10 - (localLayoutParams1.leftMargin + localLayoutParams1.rightMargin);
                    int i22 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                    if (i18 == i21)
                      break;
                    localView1.measure(i22, i19);
                    break;
                    if (localLayoutParams1.height == -1)
                    {
                      i19 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    }
                    else
                    {
                      i19 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                      continue;
                      i19 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                    }
                  }
                  label985: int i20 = Math.max(0, i13);
                  localView1.measure(View.MeasureSpec.makeMeasureSpec(i18 + (int)(localLayoutParams1.a * i20 / f1), 1073741824), i19);
                }
              }
            }
          }
          setMeasuredDimension(i6, i14 + getPaddingTop() + getPaddingBottom());
          this.g = bool1;
          if ((this.q.a() != 0) && (!bool1))
            this.q.f();
          return;
        }
        i30 = i13;
        i31 = i14;
        f2 = f1;
        bool4 = bool1;
      }
      label1091: i5 = i3;
      i6 = i2;
      i7 = i4;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    SlidingPaneLayout.SavedState localSavedState = (SlidingPaneLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a)
      if ((this.s) || (a(1.0F)))
        this.r = true;
    while (true)
    {
      this.r = localSavedState.a;
      return;
      a(0);
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SlidingPaneLayout.SavedState localSavedState = new SlidingPaneLayout.SavedState(super.onSaveInstanceState());
    boolean bool;
    if (this.g)
      if ((!this.g) || (this.i == 1.0F))
        bool = true;
    while (true)
    {
      localSavedState.a = bool;
      return localSavedState;
      bool = false;
      continue;
      bool = this.r;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      this.s = true;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.g)
      return super.onTouchEvent(paramMotionEvent);
    this.q.b(paramMotionEvent);
    switch (0xFF & paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return true;
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.n = f5;
      this.o = f6;
      continue;
      if (d(this.h))
      {
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        float f3 = f1 - this.n;
        float f4 = f2 - this.o;
        int i1 = this.q.d();
        if ((f3 * f3 + f4 * f4 < i1 * i1) && (ao.b(this.h, (int)f1, (int)f2)))
          a(0);
      }
    }
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.g))
      if (paramView1 != this.h)
        break label36;
    label36: for (boolean bool = true; ; bool = false)
    {
      this.r = bool;
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout
 * JD-Core Version:    0.6.2
 */