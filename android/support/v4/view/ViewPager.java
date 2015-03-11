package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.widget.r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup
{
  private static final int[] a = { 16842931 };
  private static final bv ad = new bv();
  private static final Comparator<bq> c = new Comparator()
  {
  };
  private static final Interpolator d = new Interpolator()
  {
    public final float getInterpolation(float paramAnonymousFloat)
    {
      float f = paramAnonymousFloat - 1.0F;
      return 1.0F + f * (f * (f * (f * f)));
    }
  };
  private boolean A;
  private int B;
  private int C;
  private int D;
  private float E;
  private float F;
  private float G;
  private float H;
  private int I = -1;
  private VelocityTracker J;
  private int K;
  private int L;
  private int M;
  private int N;
  private boolean O;
  private r P;
  private r Q;
  private boolean R = true;
  private boolean S = false;
  private boolean T;
  private int U;
  private bt V;
  private bt W;
  private bs Z;
  private bu aa;
  private int ab;
  private ArrayList<View> ac;
  private final Runnable ae = new Runnable()
  {
    public final void run()
    {
      ViewPager.a(ViewPager.this, 0);
      ViewPager.this.c();
    }
  };
  private int af = 0;
  private int b;
  private final ArrayList<bq> e = new ArrayList();
  private final bq f = new bq();
  private final Rect g = new Rect();
  private af h;
  private int i;
  private int j = -1;
  private Parcelable k = null;
  private ClassLoader l = null;
  private Scroller m;
  private int n;
  private Drawable o;
  private int p;
  private int q;
  private float r = -3.402824E+38F;
  private float s = 3.4028235E+38F;
  private int t;
  private int u;
  private boolean v;
  private boolean w;
  private boolean x;
  private int y = 1;
  private boolean z;

  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.m = new Scroller(localContext, d);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f1 = localContext.getResources().getDisplayMetrics().density;
    this.D = bc.a(localViewConfiguration);
    this.K = ((int)(400.0F * f1));
    this.L = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.P = new r(localContext);
    this.Q = new r(localContext);
    this.M = ((int)(25.0F * f1));
    this.N = ((int)(2.0F * f1));
    this.B = ((int)(16.0F * f1));
    aq.a(this, new br(this));
    if (aq.c(this) == 0)
      aq.c(this, 1);
  }

  private Rect a(Rect paramRect, View paramView)
  {
    if (paramRect == null);
    for (Rect localRect = new Rect(); ; localRect = paramRect)
    {
      if (paramView == null)
      {
        localRect.set(0, 0, 0, 0);
        return localRect;
      }
      localRect.left = paramView.getLeft();
      localRect.right = paramView.getRight();
      localRect.top = paramView.getTop();
      localRect.bottom = paramView.getBottom();
      ViewGroup localViewGroup;
      for (ViewParent localViewParent = paramView.getParent(); ((localViewParent instanceof ViewGroup)) && (localViewParent != this); localViewParent = localViewGroup.getParent())
      {
        localViewGroup = (ViewGroup)localViewParent;
        localRect.left += localViewGroup.getLeft();
        localRect.right += localViewGroup.getRight();
        localRect.top += localViewGroup.getTop();
        localRect.bottom += localViewGroup.getBottom();
      }
      return localRect;
    }
  }

  private bq a(int paramInt1, int paramInt2)
  {
    new bq().b = paramInt1;
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }

  private bq a(View paramView)
  {
    for (int i1 = 0; i1 < this.e.size(); i1++)
    {
      bq localbq = (bq)this.e.get(i1);
      af localaf = this.h;
      if (localaf.b())
        return localbq;
    }
    return null;
  }

  private void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i4;
    int i5;
    int i6;
    int i8;
    View localView2;
    int i13;
    int i10;
    int i11;
    if (this.U > 0)
    {
      int i3 = getScrollX();
      i4 = getPaddingLeft();
      i5 = getPaddingRight();
      i6 = getWidth();
      int i7 = getChildCount();
      i8 = 0;
      if (i8 < i7)
      {
        localView2 = getChildAt(i8);
        ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView2.getLayoutParams();
        if (!localLayoutParams.a)
          break label384;
        switch (0x7 & localLayoutParams.b)
        {
        case 2:
        case 4:
        default:
          i13 = i4;
          int i19 = i5;
          i10 = i4;
          i11 = i19;
          label132: int i15 = i13 + i3 - localView2.getLeft();
          if (i15 != 0)
            localView2.offsetLeftAndRight(i15);
          break;
        case 3:
        case 1:
        case 5:
        }
      }
    }
    while (true)
    {
      i8++;
      int i12 = i11;
      i4 = i10;
      i5 = i12;
      break;
      int i17 = i4 + localView2.getWidth();
      int i18 = i4;
      i11 = i5;
      i10 = i17;
      i13 = i18;
      break label132;
      i13 = Math.max((i6 - localView2.getMeasuredWidth()) / 2, i4);
      int i16 = i5;
      i10 = i4;
      i11 = i16;
      break label132;
      i13 = i6 - i5 - localView2.getMeasuredWidth();
      int i14 = i5 + localView2.getMeasuredWidth();
      i10 = i4;
      i11 = i14;
      break label132;
      if (this.V != null)
        this.V.a(paramInt1, paramFloat);
      if (this.W != null)
        this.W.a(paramInt1, paramFloat);
      if (this.aa != null)
      {
        getScrollX();
        int i1 = getChildCount();
        for (int i2 = 0; i2 < i1; i2++)
        {
          View localView1 = getChildAt(i2);
          if (!((ViewPager.LayoutParams)localView1.getLayoutParams()).a)
          {
            localView1.getLeft();
            e();
          }
        }
      }
      this.T = true;
      return;
      label384: int i9 = i5;
      i10 = i4;
      i11 = i9;
    }
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    this.x = false;
    a(paramInt, true, false);
  }

  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    bq localbq = d(paramInt1);
    int i1 = 0;
    if (localbq != null)
      i1 = (int)(e() * Math.max(this.r, Math.min(localbq.e, this.s)));
    if (paramBoolean1)
    {
      if (getChildCount() == 0)
        c(false);
      int i2;
      int i3;
      int i4;
      int i5;
      while (true)
      {
        if ((paramBoolean2) && (this.V != null))
          this.V.a();
        if ((paramBoolean2) && (this.W != null))
          this.W.a();
        return;
        i2 = getScrollX();
        i3 = getScrollY();
        i4 = i1 - i2;
        i5 = 0 - i3;
        if ((i4 != 0) || (i5 != 0))
          break;
        a(false);
        c();
        b(0);
      }
      c(true);
      b(2);
      int i6 = e();
      int i7 = i6 / 2;
      float f1 = Math.min(1.0F, 1.0F * Math.abs(i4) / i6);
      float f2 = i7 + i7 * (float)Math.sin((float)(0.47123891676382D * (f1 - 0.5F)));
      int i8 = Math.abs(paramInt2);
      if (i8 > 0);
      float f4;
      for (int i9 = 4 * Math.round(1000.0F * Math.abs(f2 / i8)); ; i9 = (int)(100.0F * (1.0F + Math.abs(i4) / (f4 + this.n))))
      {
        int i10 = Math.min(i9, 600);
        this.m.startScroll(i2, i3, i4, i5, i10);
        aq.b(this);
        break;
        float f3 = i6;
        f4 = f3 * 1.0F;
      }
    }
    if ((paramBoolean2) && (this.V != null))
      this.V.a();
    if ((paramBoolean2) && (this.W != null))
      this.W.a();
    a(false);
    scrollTo(i1, 0);
    e(i1);
  }

  private void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }

  private void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    if ((this.h == null) || (this.h.a() <= 0))
    {
      c(false);
      return;
    }
    if ((!paramBoolean2) && (this.i == paramInt1) && (this.e.size() != 0))
    {
      c(false);
      return;
    }
    if (paramInt1 < 0)
      paramInt1 = 0;
    while (true)
    {
      int i1 = this.y;
      if ((paramInt1 <= i1 + this.i) && (paramInt1 >= this.i - i1))
        break;
      for (int i2 = 0; i2 < this.e.size(); i2++)
        ((bq)this.e.get(i2)).c = true;
      if (paramInt1 >= this.h.a())
        paramInt1 = -1 + this.h.a();
    }
    int i3 = this.i;
    boolean bool = false;
    if (i3 != paramInt1)
      bool = true;
    if (this.R)
    {
      this.i = paramInt1;
      if ((bool) && (this.V != null))
        this.V.a();
      if ((bool) && (this.W != null))
        this.W.a();
      requestLayout();
      return;
    }
    c(paramInt1);
    a(paramInt1, paramBoolean1, paramInt2, bool);
  }

  private void a(bq parambq1, int paramInt, bq parambq2)
  {
    int i1 = this.h.a();
    int i2 = e();
    float f1;
    int i10;
    float f7;
    int i13;
    int i14;
    if (i2 > 0)
    {
      f1 = this.n / i2;
      if (parambq2 == null)
        break label365;
      i10 = parambq2.b;
      if (i10 < parambq1.b)
      {
        f7 = f1 + (parambq2.e + parambq2.d);
        i13 = i10 + 1;
        i14 = 0;
      }
    }
    else
    {
      while (true)
      {
        if ((i13 > parambq1.b) || (i14 >= this.e.size()))
          break label365;
        bq localbq4 = (bq)this.e.get(i14);
        while (true)
          if ((i13 > localbq4.b) && (i14 < -1 + this.e.size()))
          {
            i14++;
            localbq4 = (bq)this.e.get(i14);
            continue;
            f1 = 0.0F;
            break;
          }
        while (i13 < localbq4.b)
        {
          f7 += 1.0F + f1;
          i13++;
        }
        localbq4.e = f7;
        f7 += f1 + localbq4.d;
        i13++;
      }
    }
    if (i10 > parambq1.b)
    {
      int i11 = -1 + this.e.size();
      float f6 = parambq2.e;
      for (int i12 = i10 - 1; (i12 >= parambq1.b) && (i11 >= 0); i12--)
      {
        for (bq localbq3 = (bq)this.e.get(i11); (i12 < localbq3.b) && (i11 > 0); localbq3 = (bq)this.e.get(i11))
          i11--;
        while (i12 > localbq3.b)
        {
          f6 -= 1.0F + f1;
          i12--;
        }
        f6 -= f1 + localbq3.d;
        localbq3.e = f6;
      }
    }
    label365: int i3 = this.e.size();
    float f2 = parambq1.e;
    int i4 = -1 + parambq1.b;
    float f3;
    float f4;
    if (parambq1.b == 0)
    {
      f3 = parambq1.e;
      this.r = f3;
      if (parambq1.b != i1 - 1)
        break label498;
      f4 = parambq1.e + parambq1.d - 1.0F;
      label431: this.s = f4;
    }
    label498: int i9;
    for (int i5 = paramInt - 1; ; i5 = i9)
    {
      if (i5 < 0)
        break label555;
      bq localbq2 = (bq)this.e.get(i5);
      while (true)
        if (i4 > localbq2.b)
        {
          i4--;
          f2 -= 1.0F + f1;
          continue;
          f3 = -3.402824E+38F;
          break;
          f4 = 3.4028235E+38F;
          break label431;
        }
      f2 -= f1 + localbq2.d;
      localbq2.e = f2;
      if (localbq2.b == 0)
        this.r = f2;
      i9 = i5 - 1;
      i4--;
    }
    label555: float f5 = f1 + (parambq1.e + parambq1.d);
    int i6 = 1 + parambq1.b;
    int i8;
    for (int i7 = paramInt + 1; i7 < i3; i7 = i8)
    {
      bq localbq1 = (bq)this.e.get(i7);
      while (i6 < localbq1.b)
      {
        i6++;
        f5 += 1.0F + f1;
      }
      if (localbq1.b == i1 - 1)
        this.s = (f5 + localbq1.d - 1.0F);
      localbq1.e = f5;
      f5 += f1 + localbq1.d;
      i8 = i7 + 1;
      i6++;
    }
    this.S = false;
  }

  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = ab.b(paramMotionEvent);
    if (ab.b(paramMotionEvent, i1) == this.I)
      if (i1 != 0)
        break label56;
    label56: for (int i2 = 1; ; i2 = 0)
    {
      this.E = ab.c(paramMotionEvent, i2);
      this.I = ab.b(paramMotionEvent, i2);
      if (this.J != null)
        this.J.clear();
      return;
    }
  }

  private void a(boolean paramBoolean)
  {
    if (this.af == 2);
    int i3;
    for (int i1 = 1; ; i1 = 0)
    {
      if (i1 != 0)
      {
        c(false);
        this.m.abortAnimation();
        int i4 = getScrollX();
        int i5 = getScrollY();
        int i6 = this.m.getCurrX();
        int i7 = this.m.getCurrY();
        if ((i4 != i6) || (i5 != i7))
          scrollTo(i6, i7);
      }
      this.x = false;
      int i2 = 0;
      i3 = i1;
      while (i2 < this.e.size())
      {
        bq localbq = (bq)this.e.get(i2);
        if (localbq.c)
        {
          localbq.c = false;
          i3 = 1;
        }
        i2++;
      }
    }
    if (i3 != 0)
    {
      if (paramBoolean)
        aq.a(this, this.ae);
    }
    else
      return;
    this.ae.run();
  }

  private boolean a(float paramFloat)
  {
    int i1 = 1;
    float f1 = this.E - paramFloat;
    this.E = paramFloat;
    float f2 = f1 + getScrollX();
    int i2 = e();
    float f3 = i2 * this.r;
    float f4 = i2 * this.s;
    bq localbq1 = (bq)this.e.get(0);
    bq localbq2 = (bq)this.e.get(-1 + this.e.size());
    if (localbq1.b != 0)
      f3 = localbq1.e * i2;
    for (int i3 = 0; ; i3 = i1)
    {
      float f5;
      if (localbq2.b != -1 + this.h.a())
      {
        f5 = localbq2.e * i2;
        i1 = 0;
      }
      while (true)
      {
        boolean bool;
        if (f2 < f3)
        {
          bool = false;
          if (i3 != 0)
          {
            float f6 = f3 - f2;
            bool = this.P.a(Math.abs(f6) / i2);
          }
        }
        while (true)
        {
          this.E += f3 - (int)f3;
          scrollTo((int)f3, getScrollY());
          e((int)f3);
          return bool;
          if (f2 > f5)
          {
            bool = false;
            if (i1 != 0)
            {
              float f7 = f2 - f5;
              bool = this.Q.a(Math.abs(f7) / i2);
            }
            f3 = f5;
          }
          else
          {
            f3 = f2;
            bool = false;
          }
        }
        f5 = f4;
      }
    }
  }

  private boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i3;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i1 = paramView.getScrollX();
      int i2 = paramView.getScrollY();
      i3 = -1 + localViewGroup.getChildCount();
      if (i3 >= 0)
      {
        localView = localViewGroup.getChildAt(i3);
        if ((paramInt2 + i1 < localView.getLeft()) || (paramInt2 + i1 >= localView.getRight()) || (paramInt3 + i2 < localView.getTop()) || (paramInt3 + i2 >= localView.getBottom()) || (!a(localView, true, paramInt1, paramInt2 + i1 - localView.getLeft(), paramInt3 + i2 - localView.getTop())));
      }
    }
    while ((paramBoolean) && (aq.a(paramView, -paramInt1)))
    {
      View localView;
      return true;
      i3--;
      break;
    }
    return false;
  }

  private bq b(View paramView)
  {
    while (true)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this)
        break;
      if ((localViewParent == null) || (!(localViewParent instanceof View)))
        return null;
      paramView = (View)localViewParent;
    }
    return a(paramView);
  }

  private void b(int paramInt)
  {
    if (this.af == paramInt);
    label35: label71: 
    do
    {
      return;
      this.af = paramInt;
      if (this.aa != null)
      {
        int i1;
        int i3;
        if (paramInt != 0)
        {
          i1 = 1;
          int i2 = getChildCount();
          i3 = 0;
          if (i3 >= i2)
            continue;
          if (i1 == 0)
            break label71;
        }
        for (int i4 = 2; ; i4 = 0)
        {
          aq.a(getChildAt(i3), i4, null);
          i3++;
          break label35;
          i1 = 0;
          break;
        }
      }
    }
    while (this.V == null);
    this.V.a(paramInt);
  }

  private void b(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(true);
  }

  private void c(int paramInt)
  {
    int i20;
    bq localbq1;
    int i1;
    if (this.i != paramInt)
      if (this.i < paramInt)
      {
        i20 = 66;
        bq localbq14 = d(this.i);
        this.i = paramInt;
        localbq1 = localbq14;
        i1 = i20;
      }
    while (true)
    {
      if (this.h == null)
        f();
      do
      {
        return;
        i20 = 17;
        break;
        if (this.x)
        {
          f();
          return;
        }
      }
      while (getWindowToken() == null);
      int i2 = this.y;
      int i3 = Math.max(0, this.i - i2);
      int i4 = this.h.a();
      int i5 = Math.min(i4 - 1, i2 + this.i);
      if (i4 != this.b)
        try
        {
          String str2 = getResources().getResourceName(getId());
          str1 = str2;
          throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + i4 + " Pager id: " + str1 + " Pager class: " + getClass() + " Problematic adapter: " + this.h.getClass());
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          while (true)
            String str1 = Integer.toHexString(getId());
        }
      int i6 = 0;
      bq localbq2;
      if (i6 < this.e.size())
      {
        localbq2 = (bq)this.e.get(i6);
        if (localbq2.b >= this.i)
          if (localbq2.b != this.i)
            break label1273;
      }
      while (true)
      {
        if ((localbq2 == null) && (i4 > 0));
        for (bq localbq3 = a(this.i, i6); ; localbq3 = localbq2)
        {
          label355: int i11;
          label369: int i14;
          label392: label503: label636: float f3;
          label525: label531: bq localbq8;
          label682: float f4;
          label690: int i18;
          int i19;
          Object localObject1;
          label714: bq localbq13;
          label810: Object localObject2;
          float f6;
          if (localbq3 != null)
          {
            int i10 = i6 - 1;
            bq localbq7;
            float f1;
            float f2;
            int i13;
            int i15;
            if (i10 >= 0)
            {
              localbq7 = (bq)this.e.get(i10);
              i11 = e();
              if (i11 > 0)
                break label503;
              f1 = 0.0F;
              int i12 = -1 + this.i;
              f2 = 0.0F;
              i13 = i12;
              i14 = i6;
              i15 = i10;
              if (i13 < 0)
                break label636;
              if ((f2 < f1) || (i13 >= i3))
                break label531;
              if (localbq7 == null)
                break label636;
              if ((i13 == localbq7.b) && (!localbq7.c))
              {
                this.e.remove(i15);
                this.h.a(this, i13, localbq7.a);
                i15--;
                i14--;
                if (i15 < 0)
                  break label525;
                localbq7 = (bq)this.e.get(i15);
              }
            }
            while (true)
            {
              i13--;
              break label392;
              i6++;
              break;
              localbq7 = null;
              break label355;
              f1 = 2.0F - localbq3.d + getPaddingLeft() / i11;
              break label369;
              localbq7 = null;
              continue;
              if ((localbq7 != null) && (i13 == localbq7.b))
              {
                f2 += localbq7.d;
                i15--;
                if (i15 >= 0)
                  localbq7 = (bq)this.e.get(i15);
                else
                  localbq7 = null;
              }
              else
              {
                f2 += a(i13, i15 + 1).d;
                i14++;
                if (i15 >= 0)
                  localbq7 = (bq)this.e.get(i15);
                else
                  localbq7 = null;
              }
            }
            f3 = localbq3.d;
            int i16 = i14 + 1;
            if (f3 < 2.0F)
              if (i16 < this.e.size())
              {
                localbq8 = (bq)this.e.get(i16);
                if (i11 > 0)
                  break label846;
                f4 = 0.0F;
                int i17 = 1 + this.i;
                bq localbq9 = localbq8;
                i18 = i16;
                i19 = i17;
                localObject1 = localbq9;
                if (i19 >= i4)
                  break label1005;
                if ((f3 < f4) || (i19 <= i5))
                  break label868;
                if (localObject1 == null)
                  break label1005;
                if ((i19 != ((bq)localObject1).b) || (((bq)localObject1).c))
                  break label1251;
                this.e.remove(i18);
                this.h.a(this, i19, ((bq)localObject1).a);
                if (i18 >= this.e.size())
                  break label862;
                localbq13 = (bq)this.e.get(i18);
                float f10 = f3;
                localObject2 = localbq13;
                f6 = f10;
              }
          }
          while (true)
          {
            i19++;
            float f7 = f6;
            localObject1 = localObject2;
            f3 = f7;
            break label714;
            localbq8 = null;
            break label682;
            label846: f4 = 2.0F + getPaddingRight() / i11;
            break label690;
            label862: localbq13 = null;
            break label810;
            label868: if ((localObject1 != null) && (i19 == ((bq)localObject1).b))
            {
              float f8 = f3 + ((bq)localObject1).d;
              i18++;
              if (i18 < this.e.size());
              for (bq localbq12 = (bq)this.e.get(i18); ; localbq12 = null)
              {
                localObject2 = localbq12;
                f6 = f8;
                break;
              }
            }
            bq localbq10 = a(i19, i18);
            i18++;
            float f5 = f3 + localbq10.d;
            if (i18 < this.e.size());
            for (bq localbq11 = (bq)this.e.get(i18); ; localbq11 = null)
            {
              localObject2 = localbq11;
              f6 = f5;
              break;
            }
            label1005: a(localbq3, i14, localbq1);
            if (localbq3 != null);
            int i7 = getChildCount();
            for (int i8 = 0; i8 < i7; i8++)
            {
              View localView3 = getChildAt(i8);
              ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView3.getLayoutParams();
              localLayoutParams.f = i8;
              if ((!localLayoutParams.a) && (localLayoutParams.c == 0.0F))
              {
                bq localbq6 = a(localView3);
                if (localbq6 != null)
                {
                  localLayoutParams.c = localbq6.d;
                  localLayoutParams.e = localbq6.b;
                }
              }
            }
            f();
            if (!hasFocus())
              break;
            View localView1 = findFocus();
            if (localView1 != null);
            for (bq localbq4 = b(localView1); ; localbq4 = null)
            {
              if ((localbq4 != null) && (localbq4.b == this.i))
                break label1249;
              for (int i9 = 0; ; i9++)
              {
                if (i9 >= getChildCount())
                  break label1243;
                View localView2 = getChildAt(i9);
                bq localbq5 = a(localView2);
                if ((localbq5 != null) && (localbq5.b == this.i) && (localView2.requestFocus(i1)))
                  break;
              }
              label1243: break;
            }
            label1249: break;
            label1251: float f9 = f3;
            localObject2 = localObject1;
            f6 = f9;
          }
        }
        label1273: localbq2 = null;
      }
      i1 = 2;
      localbq1 = null;
    }
  }

  private void c(boolean paramBoolean)
  {
    if (this.w != paramBoolean)
      this.w = paramBoolean;
  }

  private bq d(int paramInt)
  {
    for (int i1 = 0; i1 < this.e.size(); i1++)
    {
      bq localbq = (bq)this.e.get(i1);
      if (localbq.b == paramInt)
        return localbq;
    }
    return null;
  }

  private int e()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }

  private boolean e(int paramInt)
  {
    boolean bool1;
    if (this.e.size() == 0)
    {
      this.T = false;
      a(0, 0.0F, 0);
      boolean bool2 = this.T;
      bool1 = false;
      if (!bool2)
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    else
    {
      bq localbq = g();
      int i1 = e();
      int i2 = i1 + this.n;
      float f1 = this.n / i1;
      int i3 = localbq.b;
      float f2 = (paramInt / i1 - localbq.e) / (f1 + localbq.d);
      int i4 = (int)(f2 * i2);
      this.T = false;
      a(i3, f2, i4);
      if (!this.T)
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      bool1 = true;
    }
    return bool1;
  }

  private void f()
  {
    if (this.ab != 0)
    {
      if (this.ac == null)
        this.ac = new ArrayList();
      while (true)
      {
        int i1 = getChildCount();
        for (int i2 = 0; i2 < i1; i2++)
        {
          View localView = getChildAt(i2);
          this.ac.add(localView);
        }
        this.ac.clear();
      }
      Collections.sort(this.ac, ad);
    }
  }

  private boolean f(int paramInt)
  {
    View localView1 = findFocus();
    View localView2;
    View localView3;
    boolean bool;
    label86: ViewParent localViewParent1;
    if (localView1 == this)
    {
      localView2 = null;
      localView3 = FocusFinder.getInstance().findNextFocus(this, localView2, paramInt);
      if ((localView3 == null) || (localView3 == localView2))
        break label319;
      if (paramInt != 17)
        break label254;
      int i3 = a(this.g, localView3).left;
      int i4 = a(this.g, localView2).left;
      if ((localView2 != null) && (i3 >= i4))
      {
        bool = i();
        if (bool)
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        return bool;
      }
    }
    else
    {
      if (localView1 == null)
        break label365;
      localViewParent1 = localView1.getParent();
      if (!(localViewParent1 instanceof ViewGroup))
        break label370;
      if (localViewParent1 != this);
    }
    label319: label365: label370: for (int i5 = 1; ; i5 = 0)
    {
      if (i5 == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView1.getClass().getSimpleName());
        ViewParent localViewParent2 = localView1.getParent();
        while (true)
          if ((localViewParent2 instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localViewParent2.getClass().getSimpleName());
            localViewParent2 = localViewParent2.getParent();
            continue;
            localViewParent1 = localViewParent1.getParent();
            break;
          }
        new StringBuilder().append("arrowScroll tried to find focus based on non-child current focused view ").append(localStringBuilder.toString()).toString();
        localView2 = null;
        break;
        bool = localView3.requestFocus();
        break label86;
        label254: if (paramInt == 66)
        {
          int i1 = a(this.g, localView3).left;
          int i2 = a(this.g, localView2).left;
          if ((localView2 != null) && (i1 <= i2))
          {
            bool = j();
            break label86;
          }
          bool = localView3.requestFocus();
          break label86;
          if ((paramInt == 17) || (paramInt == 1))
          {
            bool = i();
            break label86;
          }
          if ((paramInt == 66) || (paramInt == 2))
          {
            bool = j();
            break label86;
          }
        }
        bool = false;
        break label86;
      }
      localView2 = localView1;
      break;
    }
  }

  private bq g()
  {
    int i1 = e();
    float f1;
    float f2;
    label31: float f3;
    float f4;
    int i2;
    int i3;
    int i4;
    Object localObject;
    label49: bq localbq1;
    bq localbq3;
    int i5;
    if (i1 > 0)
    {
      f1 = getScrollX() / i1;
      if (i1 <= 0)
        break label210;
      f2 = this.n / i1;
      f3 = 0.0F;
      f4 = 0.0F;
      i2 = -1;
      i3 = 0;
      i4 = 1;
      localObject = null;
      if (i3 < this.e.size())
      {
        localbq1 = (bq)this.e.get(i3);
        if ((i4 != 0) || (localbq1.b == i2 + 1))
          break label261;
        localbq3 = this.f;
        localbq3.e = (f2 + (f3 + f4));
        localbq3.b = (i2 + 1);
        localbq3.d = 1.0F;
        i5 = i3 - 1;
      }
    }
    for (bq localbq2 = localbq3; ; localbq2 = localbq1)
    {
      float f5 = localbq2.e;
      float f6 = f2 + (f5 + localbq2.d);
      if ((i4 != 0) || (f1 >= f5))
      {
        if ((f1 < f6) || (i5 == -1 + this.e.size()))
          localObject = localbq2;
      }
      else
      {
        return localObject;
        f1 = 0.0F;
        break;
        label210: f2 = 0.0F;
        break label31;
      }
      int i6 = localbq2.b;
      float f7 = localbq2.d;
      int i7 = i5 + 1;
      f4 = f5;
      i2 = i6;
      f3 = f7;
      localObject = localbq2;
      i3 = i7;
      i4 = 0;
      break label49;
      label261: i5 = i3;
    }
  }

  private void h()
  {
    this.z = false;
    this.A = false;
    if (this.J != null)
    {
      this.J.recycle();
      this.J = null;
    }
  }

  private boolean i()
  {
    if (this.i > 0)
    {
      a(-1 + this.i, true);
      return true;
    }
    return false;
  }

  private boolean j()
  {
    if ((this.h != null) && (this.i < -1 + this.h.a()))
    {
      a(1 + this.i, true);
      return true;
    }
    return false;
  }

  public final af a()
  {
    return this.h;
  }

  final bt a(bt parambt)
  {
    bt localbt = this.W;
    this.W = parambt;
    return localbt;
  }

  public final void a(int paramInt)
  {
    this.x = false;
    if (!this.R);
    for (boolean bool = true; ; bool = false)
    {
      a(paramInt, bool, false);
      return;
    }
  }

  final void a(bs parambs)
  {
    this.Z = parambs;
  }

  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayList.size();
    int i2 = getDescendantFocusability();
    if (i2 != 393216)
      for (int i3 = 0; i3 < getChildCount(); i3++)
      {
        View localView = getChildAt(i3);
        if (localView.getVisibility() == 0)
        {
          bq localbq = a(localView);
          if ((localbq != null) && (localbq.b == this.i))
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
    if (((i2 == 262144) && (i1 != paramArrayList.size())) || (!isFocusable()));
    while ((((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) || (paramArrayList == null))
      return;
    paramArrayList.add(this);
  }

  public void addTouchables(ArrayList<View> paramArrayList)
  {
    for (int i1 = 0; i1 < getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 0)
      {
        bq localbq = a(localView);
        if ((localbq != null) && (localbq.b == this.i))
          localView.addTouchables(paramArrayList);
      }
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams));
    for (ViewGroup.LayoutParams localLayoutParams = generateLayoutParams(paramLayoutParams); ; localLayoutParams = paramLayoutParams)
    {
      ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localLayoutParams;
      localLayoutParams1.a |= paramView instanceof bp;
      if (this.v)
      {
        if ((localLayoutParams1 != null) && (localLayoutParams1.a))
          throw new IllegalStateException("Cannot add pager decor view during layout");
        localLayoutParams1.d = true;
        addViewInLayout(paramView, paramInt, localLayoutParams);
        return;
      }
      super.addView(paramView, paramInt, localLayoutParams);
      return;
    }
  }

  public final int b()
  {
    return this.i;
  }

  final void c()
  {
    c(this.i);
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    if (this.h == null);
    int i1;
    int i2;
    do
    {
      do
      {
        return false;
        i1 = e();
        i2 = getScrollX();
        if (paramInt >= 0)
          break;
      }
      while (i2 <= (int)(i1 * this.r));
      return true;
    }
    while ((paramInt <= 0) || (i2 >= (int)(i1 * this.s)));
    return true;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof ViewPager.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    if ((!this.m.isFinished()) && (this.m.computeScrollOffset()))
    {
      int i1 = getScrollX();
      int i2 = getScrollY();
      int i3 = this.m.getCurrX();
      int i4 = this.m.getCurrY();
      if ((i1 != i3) || (i2 != i4))
      {
        scrollTo(i3, i4);
        if (!e(i3))
        {
          this.m.abortAnimation();
          scrollTo(0, i4);
        }
      }
      aq.b(this);
      return;
    }
    a(true);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool2;
    if (!super.dispatchKeyEvent(paramKeyEvent))
    {
      if (paramKeyEvent.getAction() == 0);
      switch (paramKeyEvent.getKeyCode())
      {
      default:
        bool2 = false;
      case 21:
      case 22:
      case 61:
      }
    }
    while (true)
    {
      boolean bool1 = false;
      if (bool2)
        bool1 = true;
      return bool1;
      bool2 = f(17);
      continue;
      bool2 = f(66);
      continue;
      if (Build.VERSION.SDK_INT < 11)
        break;
      if (q.a(paramKeyEvent))
      {
        bool2 = f(2);
      }
      else
      {
        if (!q.a(paramKeyEvent, 1))
          break;
        bool2 = f(1);
      }
    }
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool;
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      return bool;
    }
    int i1 = getChildCount();
    for (int i2 = 0; ; i2++)
    {
      bool = false;
      if (i2 >= i1)
        break;
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 0)
      {
        bq localbq = a(localView);
        if ((localbq != null) && (localbq.b == this.i) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent)))
          return true;
      }
    }
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i1 = aq.a(this);
    boolean bool2;
    if ((i1 == 0) || ((i1 == 1) && (this.h != null) && (this.h.a() > 1)))
    {
      boolean bool1 = this.P.a();
      bool2 = false;
      if (!bool1)
      {
        int i5 = paramCanvas.save();
        int i6 = getHeight() - getPaddingTop() - getPaddingBottom();
        int i7 = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i6 + getPaddingTop(), this.r * i7);
        this.P.a(i6, i7);
        bool2 = false | this.P.a(paramCanvas);
        paramCanvas.restoreToCount(i5);
      }
      if (!this.Q.a())
      {
        int i2 = paramCanvas.save();
        int i3 = getWidth();
        int i4 = getHeight() - getPaddingTop() - getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(1.0F + this.s) * i3);
        this.Q.a(i4, i3);
        bool2 |= this.Q.a(paramCanvas);
        paramCanvas.restoreToCount(i2);
      }
    }
    while (true)
    {
      if (bool2)
        aq.b(this);
      return;
      this.P.b();
      this.Q.b();
      bool2 = false;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.o;
    if ((localDrawable != null) && (localDrawable.isStateful()))
      localDrawable.setState(getDrawableState());
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewPager.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewPager.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.ab == 2)
      paramInt2 = paramInt1 - 1 - paramInt2;
    return ((ViewPager.LayoutParams)((View)this.ac.get(paramInt2)).getLayoutParams()).f;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.R = true;
  }

  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.ae);
    super.onDetachedFromWindow();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.n > 0) && (this.o != null) && (this.e.size() > 0) && (this.h != null))
    {
      int i1 = getScrollX();
      int i2 = getWidth();
      float f1 = this.n / i2;
      bq localbq = (bq)this.e.get(0);
      float f2 = localbq.e;
      int i3 = this.e.size();
      int i4 = localbq.b;
      int i5 = ((bq)this.e.get(i3 - 1)).b;
      int i6 = 0;
      int i7 = i4;
      if (i7 < i5)
      {
        while ((i7 > localbq.b) && (i6 < i3))
        {
          ArrayList localArrayList = this.e;
          i6++;
          localbq = (bq)localArrayList.get(i6);
        }
        float f3;
        if (i7 == localbq.b)
          f3 = (localbq.e + localbq.d) * i2;
        for (f2 = f1 + (localbq.e + localbq.d); ; f2 += 1.0F + f1)
        {
          if (f3 + this.n > i1)
          {
            this.o.setBounds((int)f3, this.p, (int)(0.5F + (f3 + this.n)), this.q);
            this.o.draw(paramCanvas);
          }
          if (f3 > i1 + i2)
            return;
          i7++;
          break;
          f3 = (1.0F + f2) * i2;
        }
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 0xFF & paramMotionEvent.getAction();
    if ((i1 == 3) || (i1 == 1))
    {
      this.z = false;
      this.A = false;
      this.I = -1;
      if (this.J != null)
      {
        this.J.recycle();
        this.J = null;
      }
    }
    do
    {
      return false;
      if (i1 == 0)
        break;
      if (this.z)
        return true;
    }
    while (this.A);
    switch (i1)
    {
    default:
    case 2:
    case 0:
    case 6:
    }
    while (true)
    {
      if (this.J == null)
        this.J = VelocityTracker.obtain();
      this.J.addMovement(paramMotionEvent);
      return this.z;
      int i2 = this.I;
      if (i2 != -1)
      {
        int i3 = ab.a(paramMotionEvent, i2);
        float f3 = ab.c(paramMotionEvent, i3);
        float f4 = f3 - this.E;
        float f5 = Math.abs(f4);
        float f6 = ab.d(paramMotionEvent, i3);
        float f7 = Math.abs(f6 - this.H);
        if (f4 != 0.0F)
        {
          float f9 = this.E;
          if (((f9 < this.C) && (f4 > 0.0F)) || ((f9 > getWidth() - this.C) && (f4 < 0.0F)));
          for (int i4 = 1; (i4 == 0) && (a(this, false, (int)f4, (int)f3, (int)f6)); i4 = 0)
          {
            this.E = f3;
            this.F = f6;
            this.A = true;
            return false;
          }
        }
        float f8;
        if ((f5 > this.D) && (0.5F * f5 > f7))
        {
          this.z = true;
          b(true);
          b(1);
          if (f4 > 0.0F)
          {
            f8 = this.G + this.D;
            label365: this.E = f8;
            this.F = f6;
            c(true);
          }
        }
        while ((this.z) && (a(f3)))
        {
          aq.b(this);
          break;
          f8 = this.G - this.D;
          break label365;
          if (f7 > this.D)
            this.A = true;
        }
        float f1 = paramMotionEvent.getX();
        this.G = f1;
        this.E = f1;
        float f2 = paramMotionEvent.getY();
        this.H = f2;
        this.F = f2;
        this.I = ab.b(paramMotionEvent, 0);
        this.A = false;
        this.m.computeScrollOffset();
        if ((this.af == 2) && (Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.N))
        {
          this.m.abortAnimation();
          this.x = false;
          c();
          this.z = true;
          b(true);
          b(1);
        }
        else
        {
          a(false);
          this.z = false;
          continue;
          a(paramMotionEvent);
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = paramInt3 - paramInt1;
    int i3 = paramInt4 - paramInt2;
    int i4 = getPaddingLeft();
    int i5 = getPaddingTop();
    int i6 = getPaddingRight();
    int i7 = getPaddingBottom();
    int i8 = getScrollX();
    int i9 = 0;
    int i10 = 0;
    View localView2;
    int i21;
    label156: int i22;
    int i24;
    int i25;
    label208: int i14;
    int i15;
    int i16;
    if (i10 < i1)
    {
      localView2 = getChildAt(i10);
      if (localView2.getVisibility() == 8)
        break label659;
      ViewPager.LayoutParams localLayoutParams2 = (ViewPager.LayoutParams)localView2.getLayoutParams();
      if (!localLayoutParams2.a)
        break label659;
      int i18 = 0x7 & localLayoutParams2.b;
      int i19 = 0x70 & localLayoutParams2.b;
      switch (i18)
      {
      case 2:
      case 4:
      default:
        i21 = i4;
        switch (i19)
        {
        default:
          i22 = i5;
          int i30 = i7;
          i24 = i5;
          i25 = i30;
          int i26 = i21 + i8;
          localView2.layout(i26, i22, i26 + localView2.getMeasuredWidth(), i22 + localView2.getMeasuredHeight());
          i14 = i9 + 1;
          i15 = i24;
          i7 = i25;
          i16 = i6;
        case 48:
        case 16:
        case 80:
        }
        break;
      case 3:
      case 1:
      case 5:
      }
    }
    for (int i17 = i4; ; i17 = i4)
    {
      i10++;
      i4 = i17;
      i6 = i16;
      i5 = i15;
      i9 = i14;
      break;
      int i31 = i4 + localView2.getMeasuredWidth();
      i21 = i4;
      i4 = i31;
      break label156;
      i21 = Math.max((i2 - localView2.getMeasuredWidth()) / 2, i4);
      break label156;
      int i20 = i2 - i6 - localView2.getMeasuredWidth();
      i6 += localView2.getMeasuredWidth();
      i21 = i20;
      break label156;
      int i28 = i5 + localView2.getMeasuredHeight();
      int i29 = i5;
      i25 = i7;
      i24 = i28;
      i22 = i29;
      break label208;
      i22 = Math.max((i3 - localView2.getMeasuredHeight()) / 2, i5);
      int i27 = i7;
      i24 = i5;
      i25 = i27;
      break label208;
      i22 = i3 - i7 - localView2.getMeasuredHeight();
      int i23 = i7 + localView2.getMeasuredHeight();
      i24 = i5;
      i25 = i23;
      break label208;
      int i11 = i2 - i4 - i6;
      for (int i12 = 0; i12 < i1; i12++)
      {
        View localView1 = getChildAt(i12);
        if (localView1.getVisibility() != 8)
        {
          ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
          if (!localLayoutParams1.a)
          {
            bq localbq = a(localView1);
            if (localbq != null)
            {
              int i13 = i4 + (int)(i11 * localbq.e);
              if (localLayoutParams1.d)
              {
                localLayoutParams1.d = false;
                localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i11 * localLayoutParams1.c), 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - i5 - i7, 1073741824));
              }
              localView1.layout(i13, i5, i13 + localView1.getMeasuredWidth(), i5 + localView1.getMeasuredHeight());
            }
          }
        }
      }
      this.p = i5;
      this.q = (i3 - i7);
      this.U = i9;
      if (this.R)
        a(this.i, false, 0, false);
      this.R = false;
      return;
      label659: i14 = i9;
      i15 = i5;
      i16 = i6;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    int i1 = getMeasuredWidth();
    this.C = Math.min(i1 / 10, this.B);
    int i2 = i1 - getPaddingLeft() - getPaddingRight();
    int i3 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i4 = getChildCount();
    int i5 = 0;
    View localView2;
    ViewPager.LayoutParams localLayoutParams2;
    int i10;
    int i11;
    int i12;
    label167: int i13;
    label182: label192: int i14;
    int i15;
    if (i5 < i4)
    {
      localView2 = getChildAt(i5);
      if (localView2.getVisibility() != 8)
      {
        localLayoutParams2 = (ViewPager.LayoutParams)localView2.getLayoutParams();
        if ((localLayoutParams2 != null) && (localLayoutParams2.a))
        {
          int i8 = 0x7 & localLayoutParams2.b;
          int i9 = 0x70 & localLayoutParams2.b;
          i10 = -2147483648;
          i11 = -2147483648;
          if ((i9 != 48) && (i9 != 80))
            break label294;
          i12 = 1;
          if ((i8 != 3) && (i8 != 5))
            break label300;
          i13 = 1;
          if (i12 == 0)
            break label306;
          i10 = 1073741824;
          if (localLayoutParams2.width == -2)
            break label478;
          i14 = 1073741824;
          if (localLayoutParams2.width == -1)
            break label471;
          i15 = localLayoutParams2.width;
        }
      }
    }
    while (true)
    {
      if (localLayoutParams2.height != -2)
      {
        i11 = 1073741824;
        if (localLayoutParams2.height == -1);
      }
      for (int i16 = localLayoutParams2.height; ; i16 = i3)
      {
        localView2.measure(View.MeasureSpec.makeMeasureSpec(i15, i14), View.MeasureSpec.makeMeasureSpec(i16, i11));
        if (i12 != 0)
          i3 -= localView2.getMeasuredHeight();
        while (true)
        {
          i5++;
          break;
          label294: i12 = 0;
          break label167;
          label300: i13 = 0;
          break label182;
          label306: if (i13 == 0)
            break label192;
          i11 = 1073741824;
          break label192;
          if (i13 != 0)
            i2 -= localView2.getMeasuredWidth();
        }
        this.t = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        this.u = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.v = true;
        c();
        this.v = false;
        int i6 = getChildCount();
        for (int i7 = 0; i7 < i6; i7++)
        {
          View localView1 = getChildAt(i7);
          if (localView1.getVisibility() != 8)
          {
            ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
            if ((localLayoutParams1 == null) || (!localLayoutParams1.a))
              localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i2 * localLayoutParams1.c), 1073741824), this.u);
          }
        }
        return;
      }
      label471: i15 = i2;
      continue;
      label478: i14 = i10;
      i15 = i2;
    }
  }

  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i1 = -1;
    int i2 = getChildCount();
    int i3;
    if ((paramInt & 0x2) != 0)
    {
      i1 = 1;
      i3 = 0;
    }
    while (i3 != i2)
    {
      View localView = getChildAt(i3);
      if (localView.getVisibility() == 0)
      {
        bq localbq = a(localView);
        if ((localbq != null) && (localbq.b == this.i) && (localView.requestFocus(paramInt, paramRect)))
        {
          return true;
          i3 = i2 - 1;
          i2 = i1;
        }
      }
      else
      {
        i3 += i1;
      }
    }
    return false;
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof ViewPager.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    ViewPager.SavedState localSavedState = (ViewPager.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.h != null)
    {
      a(localSavedState.a, false, true);
      return;
    }
    this.j = localSavedState.a;
    this.k = localSavedState.b;
    this.l = localSavedState.c;
  }

  public Parcelable onSaveInstanceState()
  {
    ViewPager.SavedState localSavedState = new ViewPager.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.i;
    if (this.h != null)
      localSavedState.b = null;
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      int i1 = this.n;
      int i2 = this.n;
      if ((paramInt3 <= 0) || (this.e.isEmpty()))
        break label158;
      int i4 = i1 + (paramInt1 - getPaddingLeft() - getPaddingRight());
      int i5 = i2 + (paramInt3 - getPaddingLeft() - getPaddingRight());
      int i6 = (int)(getScrollX() / i5 * i4);
      scrollTo(i6, getScrollY());
      if (!this.m.isFinished())
      {
        int i7 = this.m.getDuration() - this.m.timePassed();
        bq localbq2 = d(this.i);
        this.m.startScroll(i6, 0, (int)(localbq2.e * paramInt1), 0, i7);
      }
    }
    return;
    label158: bq localbq1 = d(this.i);
    if (localbq1 != null);
    for (float f1 = Math.min(localbq1.e, this.s); ; f1 = 0.0F)
    {
      int i3 = (int)(f1 * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (i3 == getScrollX())
        break;
      a(false);
      scrollTo(i3, getScrollY());
      return;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.O)
      return true;
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      return false;
    if ((this.h == null) || (this.h.a() == 0))
      return false;
    if (this.J == null)
      this.J = VelocityTracker.obtain();
    this.J.addMovement(paramMotionEvent);
    int i1 = 0xFF & paramMotionEvent.getAction();
    boolean bool1 = false;
    switch (i1)
    {
    case 4:
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    case 5:
    case 6:
    }
    while (true)
    {
      if (bool1)
        aq.b(this);
      return true;
      this.m.abortAnimation();
      this.x = false;
      c();
      float f8 = paramMotionEvent.getX();
      this.G = f8;
      this.E = f8;
      float f9 = paramMotionEvent.getY();
      this.H = f9;
      this.F = f9;
      this.I = ab.b(paramMotionEvent, 0);
      bool1 = false;
      continue;
      float f5;
      if (!this.z)
      {
        int i8 = ab.a(paramMotionEvent, this.I);
        float f3 = ab.c(paramMotionEvent, i8);
        float f4 = Math.abs(f3 - this.E);
        f5 = ab.d(paramMotionEvent, i8);
        float f6 = Math.abs(f5 - this.F);
        if ((f4 > this.D) && (f4 > f6))
        {
          this.z = true;
          b(true);
          if (f3 - this.G <= 0.0F)
            break label382;
        }
      }
      label382: for (float f7 = this.G + this.D; ; f7 = this.G - this.D)
      {
        this.E = f7;
        this.F = f5;
        b(1);
        c(true);
        ViewParent localViewParent = getParent();
        if (localViewParent != null)
          localViewParent.requestDisallowInterceptTouchEvent(true);
        boolean bool4 = this.z;
        bool1 = false;
        if (!bool4)
          break;
        bool1 = false | a(ab.c(paramMotionEvent, ab.a(paramMotionEvent, this.I)));
        break;
      }
      boolean bool3 = this.z;
      bool1 = false;
      if (bool3)
      {
        VelocityTracker localVelocityTracker = this.J;
        localVelocityTracker.computeCurrentVelocity(1000, this.L);
        int i3 = (int)am.a(localVelocityTracker, this.I);
        this.x = true;
        int i4 = e();
        int i5 = getScrollX();
        bq localbq1 = g();
        int i6 = localbq1.b;
        float f1 = (i5 / i4 - localbq1.e) / localbq1.d;
        int i7;
        if ((Math.abs((int)(ab.c(paramMotionEvent, ab.a(paramMotionEvent, this.I)) - this.G)) > this.M) && (Math.abs(i3) > this.K))
        {
          if (i3 > 0);
          while (true)
          {
            i7 = i6;
            if (this.e.size() > 0)
            {
              bq localbq2 = (bq)this.e.get(0);
              bq localbq3 = (bq)this.e.get(-1 + this.e.size());
              i7 = Math.max(localbq2.b, Math.min(i7, localbq3.b));
            }
            a(i7, true, true, i3);
            this.I = -1;
            h();
            bool1 = this.P.c() | this.Q.c();
            break;
            i6++;
          }
        }
        if (i6 >= this.i);
        for (float f2 = 0.4F; ; f2 = 0.6F)
        {
          i7 = (int)(f2 + (f1 + i6));
          break;
        }
        boolean bool2 = this.z;
        bool1 = false;
        if (bool2)
        {
          a(this.i, true, 0, false);
          this.I = -1;
          h();
          bool1 = this.P.c() | this.Q.c();
          continue;
          int i2 = ab.b(paramMotionEvent);
          this.E = ab.c(paramMotionEvent, i2);
          this.I = ab.b(paramMotionEvent, i2);
          bool1 = false;
          continue;
          a(paramMotionEvent);
          this.E = ab.c(paramMotionEvent, ab.a(paramMotionEvent, this.I));
          bool1 = false;
        }
      }
    }
  }

  public void removeView(View paramView)
  {
    if (this.v)
    {
      removeViewInLayout(paramView);
      return;
    }
    super.removeView(paramView);
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.o);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager
 * JD-Core Version:    0.6.2
 */