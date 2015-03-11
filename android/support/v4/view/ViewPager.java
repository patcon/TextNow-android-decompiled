package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.widget.u;
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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup
{
  private static final int[] a = { 16842931 };
  private static final cc ag = new cc();
  private static final Comparator<bw> c = new Comparator()
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
  private boolean B;
  private int C;
  private int D;
  private int E;
  private float F;
  private float G;
  private float H;
  private float I;
  private int J = -1;
  private VelocityTracker K;
  private int L;
  private int M;
  private int N;
  private int O;
  private boolean P;
  private u Q;
  private u R;
  private boolean S = true;
  private boolean T = false;
  private boolean U;
  private int V;
  private bz W;
  private bz aa;
  private by ab;
  private ca ac;
  private Method ad;
  private int ae;
  private ArrayList<View> af;
  private final Runnable ah = new Runnable()
  {
    public final void run()
    {
      ViewPager.a(ViewPager.this, 0);
      ViewPager.this.d();
    }
  };
  private int ai = 0;
  private int b;
  private final ArrayList<bw> e = new ArrayList();
  private final bw f = new bw();
  private final Rect g = new Rect();
  private ak h;
  private int i;
  private int j = -1;
  private Parcelable k = null;
  private ClassLoader l = null;
  private Scroller m;
  private cb n;
  private int o;
  private Drawable p;
  private int q;
  private int r;
  private float s = -3.402824E+38F;
  private float t = 3.4028235E+38F;
  private int u;
  private int v;
  private boolean w;
  private boolean x;
  private boolean y;
  private int z = 1;

  public ViewPager(Context paramContext)
  {
    super(paramContext);
    f();
  }

  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    f();
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

  private bw a(int paramInt1, int paramInt2)
  {
    bw localbw = new bw();
    localbw.b = paramInt1;
    localbw.a = this.h.a(this, paramInt1);
    localbw.d = 1.0F;
    if ((paramInt2 < 0) || (paramInt2 >= this.e.size()))
    {
      this.e.add(localbw);
      return localbw;
    }
    this.e.add(paramInt2, localbw);
    return localbw;
  }

  private bw a(View paramView)
  {
    for (int i1 = 0; i1 < this.e.size(); i1++)
    {
      bw localbw = (bw)this.e.get(i1);
      if (this.h.a(paramView, localbw.a))
        return localbw;
    }
    return null;
  }

  private void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i5;
    int i6;
    int i7;
    int i9;
    View localView2;
    int i14;
    int i11;
    int i12;
    if (this.V > 0)
    {
      int i4 = getScrollX();
      i5 = getPaddingLeft();
      i6 = getPaddingRight();
      i7 = getWidth();
      int i8 = getChildCount();
      i9 = 0;
      if (i9 < i8)
      {
        localView2 = getChildAt(i9);
        ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView2.getLayoutParams();
        if (!localLayoutParams.a)
          break label401;
        switch (0x7 & localLayoutParams.b)
        {
        case 2:
        case 4:
        default:
          i14 = i5;
          int i20 = i6;
          i11 = i5;
          i12 = i20;
          label132: int i16 = i14 + i4 - localView2.getLeft();
          if (i16 != 0)
            localView2.offsetLeftAndRight(i16);
          break;
        case 3:
        case 1:
        case 5:
        }
      }
    }
    while (true)
    {
      i9++;
      int i13 = i12;
      i5 = i11;
      i6 = i13;
      break;
      int i18 = i5 + localView2.getWidth();
      int i19 = i5;
      i12 = i6;
      i11 = i18;
      i14 = i19;
      break label132;
      i14 = Math.max((i7 - localView2.getMeasuredWidth()) / 2, i5);
      int i17 = i6;
      i11 = i5;
      i12 = i17;
      break label132;
      i14 = i7 - i6 - localView2.getMeasuredWidth();
      int i15 = i6 + localView2.getMeasuredWidth();
      i11 = i5;
      i12 = i15;
      break label132;
      if (this.W != null)
        this.W.a(paramInt1, paramFloat, paramInt2);
      if (this.aa != null)
        this.aa.a(paramInt1, paramFloat, paramInt2);
      if (this.ac != null)
      {
        int i1 = getScrollX();
        int i2 = getChildCount();
        for (int i3 = 0; i3 < i2; i3++)
        {
          View localView1 = getChildAt(i3);
          if (!((ViewPager.LayoutParams)localView1.getLayoutParams()).a)
          {
            float f1 = (localView1.getLeft() - i1) / g();
            this.ac.a(localView1, f1);
          }
        }
      }
      this.U = true;
      return;
      label401: int i10 = i6;
      i11 = i5;
      i12 = i10;
    }
  }

  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    bw localbw = e(paramInt1);
    int i1 = 0;
    if (localbw != null)
      i1 = (int)(g() * Math.max(this.s, Math.min(localbw.e, this.t)));
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
        if ((paramBoolean2) && (this.W != null))
          this.W.a(paramInt1);
        if ((paramBoolean2) && (this.aa != null))
          this.aa.a(paramInt1);
        return;
        i2 = getScrollX();
        i3 = getScrollY();
        i4 = i1 - i2;
        i5 = 0 - i3;
        if ((i4 != 0) || (i5 != 0))
          break;
        a(false);
        d();
        c(0);
      }
      c(true);
      c(2);
      int i6 = g();
      int i7 = i6 / 2;
      float f1 = Math.min(1.0F, 1.0F * Math.abs(i4) / i6);
      float f2 = i7 + i7 * (float)Math.sin((float)(0.47123891676382D * (f1 - 0.5F)));
      int i8 = Math.abs(paramInt2);
      if (i8 > 0);
      float f4;
      for (int i9 = 4 * Math.round(1000.0F * Math.abs(f2 / i8)); ; i9 = (int)(100.0F * (1.0F + Math.abs(i4) / (f4 + this.o))))
      {
        int i10 = Math.min(i9, 600);
        this.m.startScroll(i2, i3, i4, i5, i10);
        av.d(this);
        break;
        float f3 = i6;
        f4 = f3 * 1.0F;
      }
    }
    if ((paramBoolean2) && (this.W != null))
      this.W.a(paramInt1);
    if ((paramBoolean2) && (this.aa != null))
      this.aa.a(paramInt1);
    a(false);
    scrollTo(i1, 0);
    f(i1);
  }

  private void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }

  private void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    if ((this.h == null) || (this.h.b() <= 0))
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
      int i1 = this.z;
      if ((paramInt1 <= i1 + this.i) && (paramInt1 >= this.i - i1))
        break;
      for (int i2 = 0; i2 < this.e.size(); i2++)
        ((bw)this.e.get(i2)).c = true;
      if (paramInt1 >= this.h.b())
        paramInt1 = -1 + this.h.b();
    }
    int i3 = this.i;
    boolean bool = false;
    if (i3 != paramInt1)
      bool = true;
    if (this.S)
    {
      this.i = paramInt1;
      if ((bool) && (this.W != null))
        this.W.a(paramInt1);
      if ((bool) && (this.aa != null))
        this.aa.a(paramInt1);
      requestLayout();
      return;
    }
    d(paramInt1);
    a(paramInt1, paramBoolean1, paramInt2, bool);
  }

  private void a(bw parambw1, int paramInt, bw parambw2)
  {
    int i1 = this.h.b();
    int i2 = g();
    float f1;
    int i10;
    float f7;
    int i13;
    int i14;
    if (i2 > 0)
    {
      f1 = this.o / i2;
      if (parambw2 == null)
        break label365;
      i10 = parambw2.b;
      if (i10 < parambw1.b)
      {
        f7 = f1 + (parambw2.e + parambw2.d);
        i13 = i10 + 1;
        i14 = 0;
      }
    }
    else
    {
      while (true)
      {
        if ((i13 > parambw1.b) || (i14 >= this.e.size()))
          break label365;
        bw localbw4 = (bw)this.e.get(i14);
        while (true)
          if ((i13 > localbw4.b) && (i14 < -1 + this.e.size()))
          {
            i14++;
            localbw4 = (bw)this.e.get(i14);
            continue;
            f1 = 0.0F;
            break;
          }
        while (i13 < localbw4.b)
        {
          f7 += 1.0F + f1;
          i13++;
        }
        localbw4.e = f7;
        f7 += f1 + localbw4.d;
        i13++;
      }
    }
    if (i10 > parambw1.b)
    {
      int i11 = -1 + this.e.size();
      float f6 = parambw2.e;
      for (int i12 = i10 - 1; (i12 >= parambw1.b) && (i11 >= 0); i12--)
      {
        for (bw localbw3 = (bw)this.e.get(i11); (i12 < localbw3.b) && (i11 > 0); localbw3 = (bw)this.e.get(i11))
          i11--;
        while (i12 > localbw3.b)
        {
          f6 -= 1.0F + f1;
          i12--;
        }
        f6 -= f1 + localbw3.d;
        localbw3.e = f6;
      }
    }
    label365: int i3 = this.e.size();
    float f2 = parambw1.e;
    int i4 = -1 + parambw1.b;
    float f3;
    float f4;
    if (parambw1.b == 0)
    {
      f3 = parambw1.e;
      this.s = f3;
      if (parambw1.b != i1 - 1)
        break label498;
      f4 = parambw1.e + parambw1.d - 1.0F;
      label431: this.t = f4;
    }
    label498: int i9;
    for (int i5 = paramInt - 1; ; i5 = i9)
    {
      if (i5 < 0)
        break label555;
      bw localbw2 = (bw)this.e.get(i5);
      while (true)
        if (i4 > localbw2.b)
        {
          i4--;
          f2 -= 1.0F + f1;
          continue;
          f3 = -3.402824E+38F;
          break;
          f4 = 3.4028235E+38F;
          break label431;
        }
      f2 -= f1 + localbw2.d;
      localbw2.e = f2;
      if (localbw2.b == 0)
        this.s = f2;
      i9 = i5 - 1;
      i4--;
    }
    label555: float f5 = f1 + (parambw1.e + parambw1.d);
    int i6 = 1 + parambw1.b;
    int i8;
    for (int i7 = paramInt + 1; i7 < i3; i7 = i8)
    {
      bw localbw1 = (bw)this.e.get(i7);
      while (i6 < localbw1.b)
      {
        i6++;
        f5 += 1.0F + f1;
      }
      if (localbw1.b == i1 - 1)
        this.t = (f5 + localbw1.d - 1.0F);
      localbw1.e = f5;
      f5 += f1 + localbw1.d;
      i8 = i7 + 1;
      i6++;
    }
    this.T = false;
  }

  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = af.b(paramMotionEvent);
    if (af.b(paramMotionEvent, i1) == this.J)
      if (i1 != 0)
        break label56;
    label56: for (int i2 = 1; ; i2 = 0)
    {
      this.F = af.c(paramMotionEvent, i2);
      this.J = af.b(paramMotionEvent, i2);
      if (this.K != null)
        this.K.clear();
      return;
    }
  }

  private void a(boolean paramBoolean)
  {
    if (this.ai == 2);
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
      this.y = false;
      int i2 = 0;
      i3 = i1;
      while (i2 < this.e.size())
      {
        bw localbw = (bw)this.e.get(i2);
        if (localbw.c)
        {
          localbw.c = false;
          i3 = 1;
        }
        i2++;
      }
    }
    if (i3 != 0)
    {
      if (paramBoolean)
        av.a(this, this.ah);
    }
    else
      return;
    this.ah.run();
  }

  private boolean a(float paramFloat)
  {
    int i1 = 1;
    float f1 = this.F - paramFloat;
    this.F = paramFloat;
    float f2 = f1 + getScrollX();
    int i2 = g();
    float f3 = i2 * this.s;
    float f4 = i2 * this.t;
    bw localbw1 = (bw)this.e.get(0);
    bw localbw2 = (bw)this.e.get(-1 + this.e.size());
    if (localbw1.b != 0)
      f3 = localbw1.e * i2;
    for (int i3 = 0; ; i3 = i1)
    {
      float f5;
      if (localbw2.b != -1 + this.h.b())
      {
        f5 = localbw2.e * i2;
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
            bool = this.Q.a(Math.abs(f6) / i2);
          }
        }
        while (true)
        {
          this.F += f3 - (int)f3;
          scrollTo((int)f3, getScrollY());
          f((int)f3);
          return bool;
          if (f2 > f5)
          {
            bool = false;
            if (i1 != 0)
            {
              float f7 = f2 - f5;
              bool = this.R.a(Math.abs(f7) / i2);
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
    while ((paramBoolean) && (av.a(paramView, -paramInt1)))
    {
      View localView;
      return true;
      i3--;
      break;
    }
    return false;
  }

  private bw b(View paramView)
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

  private void b(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(true);
  }

  private void c(int paramInt)
  {
    if (this.ai == paramInt);
    label35: label71: 
    do
    {
      return;
      this.ai = paramInt;
      if (this.ac != null)
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
          av.a(getChildAt(i3), i4, null);
          i3++;
          break label35;
          i1 = 0;
          break;
        }
      }
    }
    while (this.W == null);
    this.W.b(paramInt);
  }

  private void c(boolean paramBoolean)
  {
    if (this.x != paramBoolean)
      this.x = paramBoolean;
  }

  private void d(int paramInt)
  {
    int i21;
    bw localbw1;
    int i1;
    if (this.i != paramInt)
      if (this.i < paramInt)
      {
        i21 = 66;
        bw localbw14 = e(this.i);
        this.i = paramInt;
        localbw1 = localbw14;
        i1 = i21;
      }
    while (true)
    {
      if (this.h == null)
        h();
      do
      {
        return;
        i21 = 17;
        break;
        if (this.y)
        {
          h();
          return;
        }
      }
      while (getWindowToken() == null);
      int i2 = this.z;
      int i3 = Math.max(0, this.i - i2);
      int i4 = this.h.b();
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
      bw localbw2;
      if (i6 < this.e.size())
      {
        localbw2 = (bw)this.e.get(i6);
        if (localbw2.b >= this.i)
          if (localbw2.b != this.i)
            break label1295;
      }
      while (true)
      {
        if ((localbw2 == null) && (i4 > 0));
        for (bw localbw3 = a(this.i, i6); ; localbw3 = localbw2)
        {
          label355: int i12;
          label369: int i15;
          label392: label503: label636: float f3;
          label525: label531: bw localbw8;
          label682: float f4;
          label690: int i19;
          int i20;
          Object localObject2;
          label714: bw localbw13;
          label810: Object localObject3;
          float f6;
          if (localbw3 != null)
          {
            int i11 = i6 - 1;
            bw localbw7;
            float f1;
            float f2;
            int i14;
            int i16;
            if (i11 >= 0)
            {
              localbw7 = (bw)this.e.get(i11);
              i12 = g();
              if (i12 > 0)
                break label503;
              f1 = 0.0F;
              int i13 = -1 + this.i;
              f2 = 0.0F;
              i14 = i13;
              i15 = i6;
              i16 = i11;
              if (i14 < 0)
                break label636;
              if ((f2 < f1) || (i14 >= i3))
                break label531;
              if (localbw7 == null)
                break label636;
              if ((i14 == localbw7.b) && (!localbw7.c))
              {
                this.e.remove(i16);
                this.h.a(this, i14, localbw7.a);
                i16--;
                i15--;
                if (i16 < 0)
                  break label525;
                localbw7 = (bw)this.e.get(i16);
              }
            }
            while (true)
            {
              i14--;
              break label392;
              i6++;
              break;
              localbw7 = null;
              break label355;
              f1 = 2.0F - localbw3.d + getPaddingLeft() / i12;
              break label369;
              localbw7 = null;
              continue;
              if ((localbw7 != null) && (i14 == localbw7.b))
              {
                f2 += localbw7.d;
                i16--;
                if (i16 >= 0)
                  localbw7 = (bw)this.e.get(i16);
                else
                  localbw7 = null;
              }
              else
              {
                f2 += a(i14, i16 + 1).d;
                i15++;
                if (i16 >= 0)
                  localbw7 = (bw)this.e.get(i16);
                else
                  localbw7 = null;
              }
            }
            f3 = localbw3.d;
            int i17 = i15 + 1;
            if (f3 < 2.0F)
              if (i17 < this.e.size())
              {
                localbw8 = (bw)this.e.get(i17);
                if (i12 > 0)
                  break label846;
                f4 = 0.0F;
                int i18 = 1 + this.i;
                bw localbw9 = localbw8;
                i19 = i17;
                i20 = i18;
                localObject2 = localbw9;
                if (i20 >= i4)
                  break label1005;
                if ((f3 < f4) || (i20 <= i5))
                  break label868;
                if (localObject2 == null)
                  break label1005;
                if ((i20 != ((bw)localObject2).b) || (((bw)localObject2).c))
                  break label1273;
                this.e.remove(i19);
                this.h.a(this, i20, ((bw)localObject2).a);
                if (i19 >= this.e.size())
                  break label862;
                localbw13 = (bw)this.e.get(i19);
                float f10 = f3;
                localObject3 = localbw13;
                f6 = f10;
              }
          }
          while (true)
          {
            i20++;
            float f7 = f6;
            localObject2 = localObject3;
            f3 = f7;
            break label714;
            localbw8 = null;
            break label682;
            label846: f4 = 2.0F + getPaddingRight() / i12;
            break label690;
            label862: localbw13 = null;
            break label810;
            label868: if ((localObject2 != null) && (i20 == ((bw)localObject2).b))
            {
              float f8 = f3 + ((bw)localObject2).d;
              i19++;
              if (i19 < this.e.size());
              for (bw localbw12 = (bw)this.e.get(i19); ; localbw12 = null)
              {
                localObject3 = localbw12;
                f6 = f8;
                break;
              }
            }
            bw localbw10 = a(i20, i19);
            i19++;
            float f5 = f3 + localbw10.d;
            if (i19 < this.e.size());
            for (bw localbw11 = (bw)this.e.get(i19); ; localbw11 = null)
            {
              localObject3 = localbw11;
              f6 = f5;
              break;
            }
            label1005: a(localbw3, i15, localbw1);
            ak localak = this.h;
            int i7 = this.i;
            if (localbw3 != null);
            for (Object localObject1 = localbw3.a; ; localObject1 = null)
            {
              localak.b(this, i7, localObject1);
              this.h.a(this);
              int i8 = getChildCount();
              for (int i9 = 0; i9 < i8; i9++)
              {
                View localView3 = getChildAt(i9);
                ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView3.getLayoutParams();
                localLayoutParams.f = i9;
                if ((!localLayoutParams.a) && (localLayoutParams.c == 0.0F))
                {
                  bw localbw6 = a(localView3);
                  if (localbw6 != null)
                  {
                    localLayoutParams.c = localbw6.d;
                    localLayoutParams.e = localbw6.b;
                  }
                }
              }
            }
            h();
            if (!hasFocus())
              break;
            View localView1 = findFocus();
            if (localView1 != null);
            for (bw localbw4 = b(localView1); ; localbw4 = null)
            {
              if ((localbw4 != null) && (localbw4.b == this.i))
                break label1271;
              for (int i10 = 0; ; i10++)
              {
                if (i10 >= getChildCount())
                  break label1265;
                View localView2 = getChildAt(i10);
                bw localbw5 = a(localView2);
                if ((localbw5 != null) && (localbw5.b == this.i) && (localView2.requestFocus(i1)))
                  break;
              }
              label1265: break;
            }
            label1271: break;
            label1273: float f9 = f3;
            localObject3 = localObject2;
            f6 = f9;
          }
        }
        label1295: localbw2 = null;
      }
      i1 = 2;
      localbw1 = null;
    }
  }

  private bw e(int paramInt)
  {
    for (int i1 = 0; i1 < this.e.size(); i1++)
    {
      bw localbw = (bw)this.e.get(i1);
      if (localbw.b == paramInt)
        return localbw;
    }
    return null;
  }

  private void f()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.m = new Scroller(localContext, d);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f1 = localContext.getResources().getDisplayMetrics().density;
    this.E = bi.a(localViewConfiguration);
    this.L = ((int)(400.0F * f1));
    this.M = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.Q = new u(localContext);
    this.R = new u(localContext);
    this.N = ((int)(25.0F * f1));
    this.O = ((int)(2.0F * f1));
    this.C = ((int)(16.0F * f1));
    av.a(this, new bx(this));
    if (av.e(this) == 0)
      av.c(this, 1);
  }

  private boolean f(int paramInt)
  {
    boolean bool1;
    if (this.e.size() == 0)
    {
      this.U = false;
      a(0, 0.0F, 0);
      boolean bool2 = this.U;
      bool1 = false;
      if (!bool2)
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    else
    {
      bw localbw = i();
      int i1 = g();
      int i2 = i1 + this.o;
      float f1 = this.o / i1;
      int i3 = localbw.b;
      float f2 = (paramInt / i1 - localbw.e) / (f1 + localbw.d);
      int i4 = (int)(f2 * i2);
      this.U = false;
      a(i3, f2, i4);
      if (!this.U)
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      bool1 = true;
    }
    return bool1;
  }

  private int g()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }

  private boolean g(int paramInt)
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
        bool = k();
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
            bool = l();
            break label86;
          }
          bool = localView3.requestFocus();
          break label86;
          if ((paramInt == 17) || (paramInt == 1))
          {
            bool = k();
            break label86;
          }
          if ((paramInt == 66) || (paramInt == 2))
          {
            bool = l();
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

  private void h()
  {
    if (this.ae != 0)
    {
      if (this.af == null)
        this.af = new ArrayList();
      while (true)
      {
        int i1 = getChildCount();
        for (int i2 = 0; i2 < i1; i2++)
        {
          View localView = getChildAt(i2);
          this.af.add(localView);
        }
        this.af.clear();
      }
      Collections.sort(this.af, ag);
    }
  }

  private bw i()
  {
    int i1 = g();
    float f1;
    float f2;
    label31: float f3;
    float f4;
    int i2;
    int i3;
    int i4;
    Object localObject;
    label49: bw localbw1;
    bw localbw3;
    int i5;
    if (i1 > 0)
    {
      f1 = getScrollX() / i1;
      if (i1 <= 0)
        break label210;
      f2 = this.o / i1;
      f3 = 0.0F;
      f4 = 0.0F;
      i2 = -1;
      i3 = 0;
      i4 = 1;
      localObject = null;
      if (i3 < this.e.size())
      {
        localbw1 = (bw)this.e.get(i3);
        if ((i4 != 0) || (localbw1.b == i2 + 1))
          break label261;
        localbw3 = this.f;
        localbw3.e = (f2 + (f3 + f4));
        localbw3.b = (i2 + 1);
        localbw3.d = 1.0F;
        i5 = i3 - 1;
      }
    }
    for (bw localbw2 = localbw3; ; localbw2 = localbw1)
    {
      float f5 = localbw2.e;
      float f6 = f2 + (f5 + localbw2.d);
      if ((i4 != 0) || (f1 >= f5))
      {
        if ((f1 < f6) || (i5 == -1 + this.e.size()))
          localObject = localbw2;
      }
      else
      {
        return localObject;
        f1 = 0.0F;
        break;
        label210: f2 = 0.0F;
        break label31;
      }
      int i6 = localbw2.b;
      float f7 = localbw2.d;
      int i7 = i5 + 1;
      f4 = f5;
      i2 = i6;
      f3 = f7;
      localObject = localbw2;
      i3 = i7;
      i4 = 0;
      break label49;
      label261: i5 = i3;
    }
  }

  private void j()
  {
    this.A = false;
    this.B = false;
    if (this.K != null)
    {
      this.K.recycle();
      this.K = null;
    }
  }

  private boolean k()
  {
    if (this.i > 0)
    {
      a(-1 + this.i, true);
      return true;
    }
    return false;
  }

  private boolean l()
  {
    if ((this.h != null) && (this.i < -1 + this.h.b()))
    {
      a(1 + this.i, true);
      return true;
    }
    return false;
  }

  public final ak a()
  {
    return this.h;
  }

  public final void a(int paramInt)
  {
    this.y = false;
    if (!this.S);
    for (boolean bool = true; ; bool = false)
    {
      a(paramInt, bool, false);
      return;
    }
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    this.y = false;
    a(paramInt, true, false);
  }

  public final void a(ak paramak)
  {
    if (this.h != null)
    {
      this.h.b(this.n);
      for (int i1 = 0; i1 < this.e.size(); i1++)
      {
        bw localbw = (bw)this.e.get(i1);
        this.h.a(this, localbw.b, localbw.a);
      }
      this.h.a(this);
      this.e.clear();
      for (int i2 = 0; i2 < getChildCount(); i2++)
        if (!((ViewPager.LayoutParams)getChildAt(i2).getLayoutParams()).a)
        {
          removeViewAt(i2);
          i2--;
        }
      this.i = 0;
      scrollTo(0, 0);
    }
    ak localak = this.h;
    this.h = paramak;
    this.b = 0;
    boolean bool;
    if (this.h != null)
    {
      if (this.n == null)
        this.n = new cb(this, (byte)0);
      this.h.a(this.n);
      this.y = false;
      bool = this.S;
      this.S = true;
      this.b = this.h.b();
      if (this.j < 0)
        break label297;
      this.h.a(this.k, this.l);
      a(this.j, false, true);
      this.j = -1;
      this.k = null;
      this.l = null;
    }
    while (true)
    {
      if ((this.ab != null) && (localak != paramak))
        this.ab.a(localak, paramak);
      return;
      label297: if (!bool)
        d();
      else
        requestLayout();
    }
  }

  final void a(by paramby)
  {
    this.ab = paramby;
  }

  public final void a(bz parambz)
  {
    this.W = parambz;
  }

  public final void a(boolean paramBoolean, ca paramca)
  {
    boolean bool1;
    if (Build.VERSION.SDK_INT >= 11)
    {
      if (paramca == null)
        break label128;
      bool1 = true;
    }
    while (true)
    {
      boolean bool2;
      label24: int i1;
      if (this.ac != null)
      {
        bool2 = true;
        if (bool1 == bool2)
          break label139;
        i1 = 1;
        label33: this.ac = paramca;
        if ((Build.VERSION.SDK_INT >= 7) && (this.ad != null));
      }
      try
      {
        Class[] arrayOfClass = new Class[1];
        arrayOfClass[0] = Boolean.TYPE;
        this.ad = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", arrayOfClass);
        try
        {
          label80: Method localMethod = this.ad;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Boolean.valueOf(bool1);
          localMethod.invoke(this, arrayOfObject);
          label109: if (bool1);
          for (this.ae = 1; ; this.ae = 0)
          {
            if (i1 != 0)
              d();
            return;
            label128: bool1 = false;
            break;
            bool2 = false;
            break label24;
            label139: i1 = 0;
            break label33;
          }
        }
        catch (Exception localException)
        {
          break label109;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label80;
      }
    }
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
          bw localbw = a(localView);
          if ((localbw != null) && (localbw.b == this.i))
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
        bw localbw = a(localView);
        if ((localbw != null) && (localbw.b == this.i))
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
      localLayoutParams1.a |= paramView instanceof bv;
      if (this.w)
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

  final bz b(bz parambz)
  {
    bz localbz = this.aa;
    this.aa = parambz;
    return localbz;
  }

  public final void b(int paramInt)
  {
    if (1 != this.z)
    {
      this.z = 1;
      d();
    }
  }

  final void c()
  {
    int i1 = this.h.b();
    this.b = i1;
    if ((this.e.size() < 1 + 2 * this.z) && (this.e.size() < i1));
    int i3;
    for (int i2 = 1; ; i2 = 0)
    {
      i3 = this.i;
      bw localbw;
      for (int i4 = 0; i4 < this.e.size(); i4++)
        localbw = (bw)this.e.get(i4);
    }
    Collections.sort(this.e, c);
    if (i2 != 0)
    {
      int i5 = getChildCount();
      for (int i6 = 0; i6 < i5; i6++)
      {
        ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)getChildAt(i6).getLayoutParams();
        if (!localLayoutParams.a)
          localLayoutParams.c = 0.0F;
      }
      a(i3, false, true);
      requestLayout();
    }
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
        i1 = g();
        i2 = getScrollX();
        if (paramInt >= 0)
          break;
      }
      while (i2 <= (int)(i1 * this.s));
      return true;
    }
    while ((paramInt <= 0) || (i2 >= (int)(i1 * this.t)));
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
        if (!f(i3))
        {
          this.m.abortAnimation();
          scrollTo(0, i4);
        }
      }
      av.d(this);
      return;
    }
    a(true);
  }

  final void d()
  {
    d(this.i);
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
      bool2 = g(17);
      continue;
      bool2 = g(66);
      continue;
      if (Build.VERSION.SDK_INT < 11)
        break;
      if (q.a(paramKeyEvent))
      {
        bool2 = g(2);
      }
      else
      {
        if (!q.a(paramKeyEvent, 1))
          break;
        bool2 = g(1);
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
        bw localbw = a(localView);
        if ((localbw != null) && (localbw.b == this.i) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent)))
          return true;
      }
    }
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i1 = av.a(this);
    boolean bool2;
    if ((i1 == 0) || ((i1 == 1) && (this.h != null) && (this.h.b() > 1)))
    {
      boolean bool1 = this.Q.a();
      bool2 = false;
      if (!bool1)
      {
        int i5 = paramCanvas.save();
        int i6 = getHeight() - getPaddingTop() - getPaddingBottom();
        int i7 = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i6 + getPaddingTop(), this.s * i7);
        this.Q.a(i6, i7);
        bool2 = false | this.Q.a(paramCanvas);
        paramCanvas.restoreToCount(i5);
      }
      if (!this.R.a())
      {
        int i2 = paramCanvas.save();
        int i3 = getWidth();
        int i4 = getHeight() - getPaddingTop() - getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(1.0F + this.t) * i3);
        this.R.a(i4, i3);
        bool2 |= this.R.a(paramCanvas);
        paramCanvas.restoreToCount(i2);
      }
    }
    while (true)
    {
      if (bool2)
        av.d(this);
      return;
      this.Q.b();
      this.R.b();
      bool2 = false;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.p;
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
    if (this.ae == 2)
      paramInt2 = paramInt1 - 1 - paramInt2;
    return ((ViewPager.LayoutParams)((View)this.af.get(paramInt2)).getLayoutParams()).f;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.S = true;
  }

  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.ah);
    super.onDetachedFromWindow();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.o > 0) && (this.p != null) && (this.e.size() > 0) && (this.h != null))
    {
      int i1 = getScrollX();
      int i2 = getWidth();
      float f1 = this.o / i2;
      bw localbw = (bw)this.e.get(0);
      float f2 = localbw.e;
      int i3 = this.e.size();
      int i4 = localbw.b;
      int i5 = ((bw)this.e.get(i3 - 1)).b;
      int i6 = 0;
      int i7 = i4;
      if (i7 < i5)
      {
        while ((i7 > localbw.b) && (i6 < i3))
        {
          ArrayList localArrayList = this.e;
          i6++;
          localbw = (bw)localArrayList.get(i6);
        }
        float f3;
        if (i7 == localbw.b)
          f3 = (localbw.e + localbw.d) * i2;
        for (f2 = f1 + (localbw.e + localbw.d); ; f2 += 1.0F + f1)
        {
          if (f3 + this.o > i1)
          {
            this.p.setBounds((int)f3, this.q, (int)(0.5F + (f3 + this.o)), this.r);
            this.p.draw(paramCanvas);
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
      this.A = false;
      this.B = false;
      this.J = -1;
      if (this.K != null)
      {
        this.K.recycle();
        this.K = null;
      }
    }
    do
    {
      return false;
      if (i1 == 0)
        break;
      if (this.A)
        return true;
    }
    while (this.B);
    switch (i1)
    {
    default:
    case 2:
    case 0:
    case 6:
    }
    while (true)
    {
      if (this.K == null)
        this.K = VelocityTracker.obtain();
      this.K.addMovement(paramMotionEvent);
      return this.A;
      int i2 = this.J;
      if (i2 != -1)
      {
        int i3 = af.a(paramMotionEvent, i2);
        float f3 = af.c(paramMotionEvent, i3);
        float f4 = f3 - this.F;
        float f5 = Math.abs(f4);
        float f6 = af.d(paramMotionEvent, i3);
        float f7 = Math.abs(f6 - this.I);
        if (f4 != 0.0F)
        {
          float f9 = this.F;
          if (((f9 < this.D) && (f4 > 0.0F)) || ((f9 > getWidth() - this.D) && (f4 < 0.0F)));
          for (int i4 = 1; (i4 == 0) && (a(this, false, (int)f4, (int)f3, (int)f6)); i4 = 0)
          {
            this.F = f3;
            this.G = f6;
            this.B = true;
            return false;
          }
        }
        float f8;
        if ((f5 > this.E) && (0.5F * f5 > f7))
        {
          this.A = true;
          b(true);
          c(1);
          if (f4 > 0.0F)
          {
            f8 = this.H + this.E;
            label365: this.F = f8;
            this.G = f6;
            c(true);
          }
        }
        while ((this.A) && (a(f3)))
        {
          av.d(this);
          break;
          f8 = this.H - this.E;
          break label365;
          if (f7 > this.E)
            this.B = true;
        }
        float f1 = paramMotionEvent.getX();
        this.H = f1;
        this.F = f1;
        float f2 = paramMotionEvent.getY();
        this.I = f2;
        this.G = f2;
        this.J = af.b(paramMotionEvent, 0);
        this.B = false;
        this.m.computeScrollOffset();
        if ((this.ai == 2) && (Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O))
        {
          this.m.abortAnimation();
          this.y = false;
          d();
          this.A = true;
          b(true);
          c(1);
        }
        else
        {
          a(false);
          this.A = false;
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
            bw localbw = a(localView1);
            if (localbw != null)
            {
              int i13 = i4 + (int)(i11 * localbw.e);
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
      this.q = i5;
      this.r = (i3 - i7);
      this.V = i9;
      if (this.S)
        a(this.i, false, 0, false);
      this.S = false;
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
    this.D = Math.min(i1 / 10, this.C);
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
        this.u = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        this.v = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.w = true;
        d();
        this.w = false;
        int i6 = getChildCount();
        for (int i7 = 0; i7 < i6; i7++)
        {
          View localView1 = getChildAt(i7);
          if (localView1.getVisibility() != 8)
          {
            ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
            if ((localLayoutParams1 == null) || (!localLayoutParams1.a))
              localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i2 * localLayoutParams1.c), 1073741824), this.v);
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
        bw localbw = a(localView);
        if ((localbw != null) && (localbw.b == this.i) && (localView.requestFocus(paramInt, paramRect)))
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
      this.h.a(localSavedState.b, localSavedState.c);
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
      localSavedState.b = this.h.a();
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      int i1 = this.o;
      int i2 = this.o;
      if ((paramInt3 <= 0) || (this.e.isEmpty()))
        break label158;
      int i4 = i1 + (paramInt1 - getPaddingLeft() - getPaddingRight());
      int i5 = i2 + (paramInt3 - getPaddingLeft() - getPaddingRight());
      int i6 = (int)(getScrollX() / i5 * i4);
      scrollTo(i6, getScrollY());
      if (!this.m.isFinished())
      {
        int i7 = this.m.getDuration() - this.m.timePassed();
        bw localbw2 = e(this.i);
        this.m.startScroll(i6, 0, (int)(localbw2.e * paramInt1), 0, i7);
      }
    }
    return;
    label158: bw localbw1 = e(this.i);
    if (localbw1 != null);
    for (float f1 = Math.min(localbw1.e, this.t); ; f1 = 0.0F)
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
    if (this.P)
      return true;
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      return false;
    if ((this.h == null) || (this.h.b() == 0))
      return false;
    if (this.K == null)
      this.K = VelocityTracker.obtain();
    this.K.addMovement(paramMotionEvent);
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
        av.d(this);
      return true;
      this.m.abortAnimation();
      this.y = false;
      d();
      float f8 = paramMotionEvent.getX();
      this.H = f8;
      this.F = f8;
      float f9 = paramMotionEvent.getY();
      this.I = f9;
      this.G = f9;
      this.J = af.b(paramMotionEvent, 0);
      bool1 = false;
      continue;
      float f5;
      if (!this.A)
      {
        int i8 = af.a(paramMotionEvent, this.J);
        float f3 = af.c(paramMotionEvent, i8);
        float f4 = Math.abs(f3 - this.F);
        f5 = af.d(paramMotionEvent, i8);
        float f6 = Math.abs(f5 - this.G);
        if ((f4 > this.E) && (f4 > f6))
        {
          this.A = true;
          b(true);
          if (f3 - this.H <= 0.0F)
            break label382;
        }
      }
      label382: for (float f7 = this.H + this.E; ; f7 = this.H - this.E)
      {
        this.F = f7;
        this.G = f5;
        c(1);
        c(true);
        ViewParent localViewParent = getParent();
        if (localViewParent != null)
          localViewParent.requestDisallowInterceptTouchEvent(true);
        boolean bool4 = this.A;
        bool1 = false;
        if (!bool4)
          break;
        bool1 = false | a(af.c(paramMotionEvent, af.a(paramMotionEvent, this.J)));
        break;
      }
      boolean bool3 = this.A;
      bool1 = false;
      if (bool3)
      {
        VelocityTracker localVelocityTracker = this.K;
        localVelocityTracker.computeCurrentVelocity(1000, this.M);
        int i3 = (int)ar.a(localVelocityTracker, this.J);
        this.y = true;
        int i4 = g();
        int i5 = getScrollX();
        bw localbw1 = i();
        int i6 = localbw1.b;
        float f1 = (i5 / i4 - localbw1.e) / localbw1.d;
        int i7;
        if ((Math.abs((int)(af.c(paramMotionEvent, af.a(paramMotionEvent, this.J)) - this.H)) > this.N) && (Math.abs(i3) > this.L))
        {
          if (i3 > 0);
          while (true)
          {
            i7 = i6;
            if (this.e.size() > 0)
            {
              bw localbw2 = (bw)this.e.get(0);
              bw localbw3 = (bw)this.e.get(-1 + this.e.size());
              i7 = Math.max(localbw2.b, Math.min(i7, localbw3.b));
            }
            a(i7, true, true, i3);
            this.J = -1;
            j();
            bool1 = this.Q.c() | this.R.c();
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
        boolean bool2 = this.A;
        bool1 = false;
        if (bool2)
        {
          a(this.i, true, 0, false);
          this.J = -1;
          j();
          bool1 = this.Q.c() | this.R.c();
          continue;
          int i2 = af.b(paramMotionEvent);
          this.F = af.c(paramMotionEvent, i2);
          this.J = af.b(paramMotionEvent, i2);
          bool1 = false;
          continue;
          a(paramMotionEvent);
          this.F = af.c(paramMotionEvent, af.a(paramMotionEvent, this.J));
          bool1 = false;
        }
      }
    }
  }

  public void removeView(View paramView)
  {
    if (this.w)
    {
      removeViewInLayout(paramView);
      return;
    }
    super.removeView(paramView);
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.p);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager
 * JD-Core Version:    0.6.2
 */