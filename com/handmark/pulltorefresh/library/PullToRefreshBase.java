package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import textnow.af.f;

public abstract class PullToRefreshBase<T extends View> extends LinearLayout
{
  T a;
  private int b;
  private float c;
  private float d;
  private float e;
  private float f;
  private boolean g = false;
  private m h = m.a;
  private e i = e.a();
  private e j;
  private FrameLayout k;
  private boolean l = true;
  private boolean m = false;
  private boolean n = true;
  private boolean o = true;
  private boolean p = true;
  private Interpolator q;
  private d r = d.a();
  private textnow.af.d s;
  private textnow.af.d t;
  private h<T> u;
  private i<T> v;
  private g<T> w;
  private PullToRefreshBase<T>.l x;

  public PullToRefreshBase(Context paramContext)
  {
    super(paramContext);
    b(paramContext, null);
  }

  public PullToRefreshBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b(paramContext, paramAttributeSet);
  }

  public PullToRefreshBase(Context paramContext, e parame)
  {
    super(paramContext);
    this.i = parame;
    b(paramContext, null);
  }

  public PullToRefreshBase(Context paramContext, e parame, d paramd)
  {
    super(paramContext);
    this.i = parame;
    this.r = paramd;
    b(paramContext, null);
  }

  private final void a(int paramInt, long paramLong1, long paramLong2, j paramj)
  {
    if (this.x != null)
      this.x.a();
    switch (3.a[p().ordinal()])
    {
    default:
    case 1:
    }
    for (int i1 = getScrollY(); ; i1 = getScrollX())
    {
      if (i1 != paramInt)
      {
        if (this.q == null)
          this.q = new DecelerateInterpolator();
        this.x = new l(this, i1, paramInt, paramLong1, paramj);
        if (0L <= 0L)
          break;
        postDelayed(this.x, 0L);
      }
      return;
    }
    post(this.x);
  }

  private void a(int paramInt, j paramj)
  {
    a(paramInt, 200L, 0L, paramj);
  }

  private void b(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray;
    switch (3.a[p().ordinal()])
    {
    default:
      setOrientation(1);
      setGravity(17);
      this.b = ViewConfiguration.get(paramContext).getScaledTouchSlop();
      localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, com.enflick.android.TextNow.b.p);
      if (localTypedArray.hasValue(4))
        this.i = e.a(localTypedArray.getInteger(4, 0));
      if (localTypedArray.hasValue(12))
        this.r = d.a(localTypedArray.getInteger(12, 0));
      this.a = a(paramContext, paramAttributeSet);
      View localView = this.a;
      this.k = new FrameLayout(paramContext);
      this.k.addView(localView, -1, -1);
      super.addView(this.k, -1, new LinearLayout.LayoutParams(-1, -1));
      this.s = a(paramContext, e.b, localTypedArray);
      this.t = a(paramContext, e.c, localTypedArray);
      if (localTypedArray.hasValue(0))
      {
        Drawable localDrawable2 = localTypedArray.getDrawable(0);
        if (localDrawable2 != null)
          this.a.setBackgroundDrawable(localDrawable2);
      }
      break;
    case 1:
    }
    while (true)
    {
      if (localTypedArray.hasValue(9))
        this.o = localTypedArray.getBoolean(9, true);
      if (localTypedArray.hasValue(13))
        this.m = localTypedArray.getBoolean(13, false);
      a(localTypedArray);
      localTypedArray.recycle();
      f();
      return;
      setOrientation(0);
      break;
      if (localTypedArray.hasValue(16))
      {
        f.a("ptrAdapterViewBackground", "ptrRefreshableViewBackground");
        Drawable localDrawable1 = localTypedArray.getDrawable(16);
        if (localDrawable1 != null)
          this.a.setBackgroundDrawable(localDrawable1);
      }
    }
  }

  private void w()
  {
    int i1 = (int)(1.2F * z());
    int i2 = getPaddingLeft();
    int i3 = getPaddingTop();
    int i4 = getPaddingRight();
    int i5 = getPaddingBottom();
    int i10;
    int i7;
    int i9;
    int i8;
    switch (3.a[p().ordinal()])
    {
    default:
      i10 = i5;
      i7 = i4;
      i9 = i3;
      i8 = i2;
    case 1:
    case 2:
    }
    while (true)
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(i8);
      arrayOfObject[1] = Integer.valueOf(i9);
      arrayOfObject[2] = Integer.valueOf(i7);
      arrayOfObject[3] = Integer.valueOf(i10);
      String.format("Setting Padding. L: %d, T: %d, R: %d, B: %d", arrayOfObject);
      setPadding(i8, i9, i7, i10);
      return;
      if (this.i.c())
        this.s.b(i1);
      for (int i12 = -i1; ; i12 = 0)
      {
        if (!this.i.d())
          break label206;
        this.t.b(i1);
        i7 = -i1;
        i9 = i3;
        i8 = i12;
        i10 = i5;
        break;
      }
      label206: i9 = i3;
      i8 = i12;
      i10 = i5;
      i7 = 0;
      continue;
      if (this.i.c())
        this.s.a(i1);
      for (int i6 = -i1; ; i6 = 0)
      {
        if (!this.i.d())
          break label291;
        this.t.a(i1);
        int i11 = -i1;
        i8 = i2;
        i9 = i6;
        i10 = i11;
        i7 = i4;
        break;
      }
      label291: i7 = i4;
      i8 = i2;
      i9 = i6;
      i10 = 0;
    }
  }

  private void x()
  {
    if (this.u != null)
      this.u.a(this);
    do
    {
      do
        return;
      while (this.v == null);
      if (this.j == e.b)
        return;
    }
    while (this.j != e.c);
  }

  private boolean y()
  {
    switch (3.c[this.i.ordinal()])
    {
    case 3:
    default:
    case 2:
    case 1:
    case 4:
    }
    do
    {
      return false;
      return d();
      return e();
    }
    while ((!e()) && (!d()));
    return true;
  }

  private int z()
  {
    switch (3.a[p().ordinal()])
    {
    default:
      return Math.round(getHeight() / 2.0F);
    case 1:
    }
    return Math.round(getWidth() / 2.0F);
  }

  protected abstract T a(Context paramContext, AttributeSet paramAttributeSet);

  public final a a(boolean paramBoolean1, boolean paramBoolean2)
  {
    return b(true, false);
  }

  protected final textnow.af.d a(Context paramContext, e parame, TypedArray paramTypedArray)
  {
    textnow.af.d locald = this.r.a(paramContext, parame, p(), paramTypedArray);
    locald.setVisibility(4);
    return locald;
  }

  protected void a()
  {
    switch (3.c[this.j.ordinal()])
    {
    default:
      return;
    case 1:
      this.t.g();
      return;
    case 2:
    }
    this.s.g();
  }

  protected final void a(int paramInt)
  {
    new StringBuilder().append("setHeaderScroll: ").append(paramInt).toString();
    int i1 = z();
    int i2 = Math.min(i1, Math.max(-i1, paramInt));
    if (this.p)
    {
      if (i2 >= 0)
        break label93;
      this.s.setVisibility(0);
    }
    while (true)
      switch (3.a[p().ordinal()])
      {
      default:
        return;
        label93: if (i2 > 0)
        {
          this.t.setVisibility(0);
        }
        else
        {
          this.s.setVisibility(4);
          this.t.setVisibility(4);
        }
        break;
      case 2:
      case 1:
      }
    scrollTo(0, i2);
    return;
    scrollTo(i2, 0);
  }

  protected void a(TypedArray paramTypedArray)
  {
  }

  public final void a(e parame)
  {
    if (parame != this.i)
    {
      new StringBuilder().append("Setting mode to: ").append(parame).toString();
      this.i = parame;
      f();
    }
  }

  public final void a(h<T> paramh)
  {
    this.u = paramh;
    this.v = null;
  }

  final void a(m paramm, boolean[] paramArrayOfBoolean)
  {
    this.h = paramm;
    new StringBuilder().append("State: ").append(this.h.name()).toString();
    switch (3.b[this.h.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      if (this.w != null);
      return;
      c();
      continue;
      a();
      continue;
      b();
      continue;
      b(paramArrayOfBoolean[0]);
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    new StringBuilder().append("addView: ").append(paramView.getClass().getSimpleName()).toString();
    View localView = this.a;
    if ((localView instanceof ViewGroup))
    {
      ((ViewGroup)localView).addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
  }

  protected b b(boolean paramBoolean1, boolean paramBoolean2)
  {
    b localb = new b();
    if ((paramBoolean1) && (this.i.c()))
      localb.a(this.s);
    if ((paramBoolean2) && (this.i.d()))
      localb.a(this.t);
    return localb;
  }

  protected void b()
  {
    switch (3.c[this.j.ordinal()])
    {
    default:
      return;
    case 1:
      this.t.i();
      return;
    case 2:
    }
    this.s.i();
  }

  protected final void b(int paramInt)
  {
    a(paramInt, 200L, 0L, null);
  }

  protected void b(boolean paramBoolean)
  {
    if (this.i.c())
      this.s.h();
    if (this.i.d())
      this.t.h();
    if (paramBoolean)
    {
      if (this.l)
      {
        j local1 = new j()
        {
          public final void a()
          {
            PullToRefreshBase.a(PullToRefreshBase.this);
          }
        };
        switch (3.c[this.j.ordinal()])
        {
        case 2:
        default:
          a(-this.s.f(), local1);
          return;
        case 1:
        case 3:
        }
        a(this.t.f(), local1);
        return;
      }
      b(0);
      return;
    }
    x();
  }

  protected void c()
  {
    this.g = false;
    this.p = true;
    this.s.j();
    this.t.j();
    b(0);
  }

  public final void c(boolean paramBoolean)
  {
    this.m = true;
  }

  protected abstract boolean d();

  protected abstract boolean e();

  protected void f()
  {
    LinearLayout.LayoutParams localLayoutParams;
    switch (3.a[p().ordinal()])
    {
    default:
      localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
      if (this == this.s.getParent())
        removeView(this.s);
      if (this.i.c())
        super.addView(this.s, 0, localLayoutParams);
      if (this == this.t.getParent())
        removeView(this.t);
      if (this.i.d())
        super.addView(this.t, -1, localLayoutParams);
      w();
      if (this.i == e.d)
        break;
    case 1:
    }
    for (e locale = this.i; ; locale = e.b)
    {
      this.j = locale;
      return;
      localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
      break;
    }
  }

  public final e g()
  {
    return this.j;
  }

  public final e h()
  {
    return this.i;
  }

  public final T i()
  {
    return this.a;
  }

  public final boolean j()
  {
    return this.l;
  }

  public final m k()
  {
    return this.h;
  }

  public final boolean l()
  {
    return this.i.b();
  }

  public final boolean m()
  {
    if ((Build.VERSION.SDK_INT >= 9) && (this.o));
    return false;
  }

  public final boolean n()
  {
    return (this.h == m.d) || (this.h == m.e);
  }

  public final void o()
  {
    if (n())
      a(m.a, new boolean[0]);
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.i.b())
      return false;
    int i1 = paramMotionEvent.getAction();
    if ((i1 == 3) || (i1 == 1))
    {
      this.g = false;
      return false;
    }
    if ((i1 != 0) && (this.g))
      return true;
    switch (i1)
    {
    case 1:
    default:
    case 2:
    case 0:
    }
    while (true)
    {
      return this.g;
      if ((!this.m) && (n()))
        return true;
      if (y())
      {
        float f3 = paramMotionEvent.getY();
        float f4 = paramMotionEvent.getX();
        float f5;
        switch (3.a[p().ordinal()])
        {
        default:
          f5 = f3 - this.d;
        case 1:
        }
        for (float f6 = f4 - this.c; ; f6 = f3 - this.d)
        {
          float f7 = Math.abs(f5);
          if ((f7 <= this.b) || ((this.n) && (f7 <= Math.abs(f6))))
            break;
          if ((!this.i.c()) || (f5 < 1.0F) || (!d()))
            break label280;
          this.d = f3;
          this.c = f4;
          this.g = true;
          if (this.i != e.d)
            break;
          this.j = e.b;
          break;
          f5 = f4 - this.c;
        }
        label280: if ((this.i.d()) && (f5 <= -1.0F) && (e()))
        {
          this.d = f3;
          this.c = f4;
          this.g = true;
          if (this.i == e.d)
          {
            this.j = e.c;
            continue;
            if (y())
            {
              float f1 = paramMotionEvent.getY();
              this.f = f1;
              this.d = f1;
              float f2 = paramMotionEvent.getX();
              this.e = f2;
              this.c = f2;
              this.g = false;
            }
          }
        }
      }
    }
  }

  protected final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof Bundle))
    {
      Bundle localBundle = (Bundle)paramParcelable;
      a(e.a(localBundle.getInt("ptr_mode", 0)));
      this.j = e.a(localBundle.getInt("ptr_current_mode", 0));
      this.m = localBundle.getBoolean("ptr_disable_scrolling", false);
      this.l = localBundle.getBoolean("ptr_show_refreshing_view", true);
      super.onRestoreInstanceState(localBundle.getParcelable("ptr_super"));
      m localm = m.a(localBundle.getInt("ptr_state", 0));
      if ((localm == m.d) || (localm == m.e))
        a(localm, new boolean[] { true });
      return;
    }
    super.onRestoreInstanceState(paramParcelable);
  }

  protected final Parcelable onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("ptr_state", this.h.a());
    localBundle.putInt("ptr_mode", this.i.e());
    localBundle.putInt("ptr_current_mode", this.j.e());
    localBundle.putBoolean("ptr_disable_scrolling", this.m);
    localBundle.putBoolean("ptr_show_refreshing_view", this.l);
    localBundle.putParcelable("ptr_super", super.onSaveInstanceState());
    return localBundle;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    String.format("onSizeChanged. W: %d, H: %d", arrayOfObject);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    w();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.k.getLayoutParams();
    switch (3.a[p().ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      post(new Runnable()
      {
        public final void run()
        {
          PullToRefreshBase.this.requestLayout();
        }
      });
      return;
      if (localLayoutParams.width != paramInt1)
      {
        localLayoutParams.width = paramInt1;
        this.k.requestLayout();
        continue;
        if (localLayoutParams.height != paramInt2)
        {
          localLayoutParams.height = paramInt2;
          this.k.requestLayout();
        }
      }
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.i.b())
      return false;
    if ((!this.m) && (n()))
      return true;
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      return false;
    switch (paramMotionEvent.getAction())
    {
    default:
    case 2:
    case 0:
    case 1:
    case 3:
    }
    label201: 
    do
    {
      do
      {
        do
          return false;
        while (!this.g);
        this.d = paramMotionEvent.getY();
        this.c = paramMotionEvent.getX();
        float f3;
        float f4;
        int i1;
        int i2;
        float f5;
        switch (3.a[p().ordinal()])
        {
        default:
          f3 = this.f;
          f4 = this.d;
          switch (3.c[this.j.ordinal()])
          {
          default:
            i1 = Math.round(Math.min(f3 - f4, 0.0F) / 2.0F);
            i2 = this.s.f();
            a(i1);
            if ((i1 != 0) && (!n()))
            {
              f5 = Math.abs(i1) / i2;
              switch (3.c[this.j.ordinal()])
              {
              default:
                this.s.b(f5);
                if ((this.h != m.b) && (i2 >= Math.abs(i1)))
                  a(m.b, new boolean[0]);
                break;
              case 1:
              }
            }
            break;
          case 1:
          }
          break;
        case 1:
        }
        while (true)
        {
          return true;
          f3 = this.e;
          f4 = this.c;
          break;
          i1 = Math.round(Math.max(f3 - f4, 0.0F) / 2.0F);
          i2 = this.t.f();
          break label201;
          this.t.b(f5);
          break label269;
          if ((this.h == m.b) && (i2 < Math.abs(i1)))
            a(m.c, new boolean[0]);
        }
      }
      while (!y());
      float f1 = paramMotionEvent.getY();
      this.f = f1;
      this.d = f1;
      float f2 = paramMotionEvent.getX();
      this.e = f2;
      this.c = f2;
      return true;
    }
    while (!this.g);
    label269: this.g = false;
    if ((this.h == m.c) && ((this.u != null) || (this.v != null)))
    {
      a(m.d, new boolean[] { true });
      return true;
    }
    if (n())
    {
      b(0);
      return true;
    }
    a(m.a, new boolean[0]);
    return true;
  }

  public abstract k p();

  protected final void q()
  {
    this.p = false;
  }

  protected final textnow.af.d r()
  {
    return this.t;
  }

  protected final int s()
  {
    return this.t.f();
  }

  public void setLongClickable(boolean paramBoolean)
  {
    this.a.setLongClickable(paramBoolean);
  }

  protected final textnow.af.d t()
  {
    return this.s;
  }

  protected final int u()
  {
    return this.s.f();
  }

  protected final FrameLayout v()
  {
    return this.k;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.handmark.pulltorefresh.library.PullToRefreshBase
 * JD-Core Version:    0.6.2
 */