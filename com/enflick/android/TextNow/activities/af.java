package com.enflick.android.TextNow.activities;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ListView;
import textnow.am.o;
import textnow.am.q;

public final class af
  implements View.OnTouchListener
{
  private int a;
  private int b;
  private int c;
  private long d;
  private ListView e;
  private SwipeRefreshLayout f;
  private int g = 1;
  private float h;
  private float i;
  private boolean j;
  private VelocityTracker k;
  private int l;
  private int m = -1;
  private View n;
  private View o;
  private View p;
  private int q;
  private int r;
  private boolean s;
  private Interpolator t = new OvershootInterpolator(2.0F);

  public af(ListView paramListView, SwipeRefreshLayout paramSwipeRefreshLayout, int paramInt1, int paramInt2)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramListView.getContext());
    this.a = (3 * localViewConfiguration.getScaledTouchSlop());
    this.b = (16 * localViewConfiguration.getScaledMinimumFlingVelocity());
    this.c = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.d = paramListView.getContext().getResources().getInteger(17694721);
    this.e = paramListView;
    this.f = paramSwipeRefreshLayout;
    this.r = 2131165364;
    this.q = 2131165373;
  }

  private View a(int paramInt)
  {
    int i1 = paramInt - (this.e.getFirstVisiblePosition() - this.e.getHeaderViewsCount());
    if ((i1 >= 0) && (i1 < this.e.getChildCount()))
      return this.e.getChildAt(i1);
    return null;
  }

  private o a(final View paramView, boolean paramBoolean, int paramInt1, int paramInt2, long paramLong, Interpolator paramInterpolator)
  {
    final ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    o localo = o.a(new int[] { paramInt1, paramInt2 }).a(paramLong);
    localo.a(new q()
    {
      public final void a(o paramAnonymouso)
      {
        if (this.a)
          localMarginLayoutParams.leftMargin = ((Integer)paramAnonymouso.d()).intValue();
        while (true)
        {
          paramView.setLayoutParams(localMarginLayoutParams);
          return;
          localMarginLayoutParams.rightMargin = ((Integer)paramAnonymouso.d()).intValue();
        }
      }
    });
    if (paramInterpolator != null)
      localo.a(paramInterpolator);
    return localo;
  }

  private void a(final View paramView1, final View paramView2)
  {
    if ((paramView1 != null) && (paramView2 != null) && (textnow.ao.a.a(paramView1) < 0.0F))
    {
      long l1 = ()(Math.min(0.99F, Math.abs(textnow.ao.a.a(paramView1)) / paramView2.getWidth()) * (float)this.d);
      final o localo = a(paramView2, false, ((ViewGroup.MarginLayoutParams)paramView2.getLayoutParams()).rightMargin, -paramView2.getWidth(), l1, this.t);
      textnow.ao.b.a(paramView1).a(this.t).a(0.0F).a(l1).a(new textnow.am.b()
      {
        public final void a(textnow.am.a paramAnonymousa)
        {
        }

        public final void b(textnow.am.a paramAnonymousa)
        {
          af.a(af.this, false);
          textnow.ao.b.a(paramView1).a(null);
        }

        public final void c(textnow.am.a paramAnonymousa)
        {
          textnow.ao.a.b(paramView1, 0.0F);
          b(paramAnonymousa);
          localo.b();
          ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView2.getLayoutParams();
          localMarginLayoutParams.rightMargin = (-paramView2.getWidth());
          paramView2.setLayoutParams(localMarginLayoutParams);
        }

        public final void d(textnow.am.a paramAnonymousa)
        {
        }
      });
      localo.a();
    }
  }

  private void a(final View paramView1, final View paramView2, boolean paramBoolean)
  {
    if ((paramView1 != null) && (paramView2 != null) && (textnow.ao.a.a(paramView1) > -paramView2.getWidth()))
    {
      float f1 = Math.min(0.99F, Math.abs(textnow.ao.a.a(paramView1)) / paramView2.getWidth());
      long l1 = ()((float)this.d * (1.0F - f1));
      final o localo = a(paramView2, false, ((ViewGroup.MarginLayoutParams)paramView2.getLayoutParams()).rightMargin, 0, l1, this.t);
      textnow.ao.b.a(paramView1).a(this.t).a(-paramView2.getWidth()).a(l1).a(new textnow.am.b()
      {
        public final void a(textnow.am.a paramAnonymousa)
        {
        }

        public final void b(textnow.am.a paramAnonymousa)
        {
          af.a(af.this, false);
          textnow.ao.b.a(paramView1).a(null);
        }

        public final void c(textnow.am.a paramAnonymousa)
        {
          View localView = paramView1;
          if (this.b);
          for (float f = -paramView2.getWidth(); ; f = paramView2.getWidth())
          {
            textnow.ao.a.b(localView, f);
            b(paramAnonymousa);
            localo.b();
            ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView2.getLayoutParams();
            localMarginLayoutParams.rightMargin = 0;
            paramView2.setLayoutParams(localMarginLayoutParams);
            return;
          }
        }

        public final void d(textnow.am.a paramAnonymousa)
        {
        }
      });
      localo.a();
    }
  }

  public final void a()
  {
    if (this.m != -1)
    {
      View localView = a(this.m);
      if (localView != null)
        a(localView.findViewById(this.r), localView.findViewById(this.q));
      this.m = -1;
    }
  }

  public final void a(final ag paramag)
  {
    final View localView = a(this.m);
    if (localView != null)
    {
      final ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = localView.getHeight();
      arrayOfInt[1] = 1;
      o localo = o.a(arrayOfInt).a(200L);
      localo.a(new q()
      {
        public final void a(o paramAnonymouso)
        {
          localLayoutParams.height = ((Integer)paramAnonymouso.d()).intValue();
          localView.setLayoutParams(localLayoutParams);
        }
      });
      localo.a(new textnow.am.b()
      {
        public final void a(textnow.am.a paramAnonymousa)
        {
        }

        public final void b(textnow.am.a paramAnonymousa)
        {
          paramag.a();
        }

        public final void c(textnow.am.a paramAnonymousa)
        {
        }

        public final void d(textnow.am.a paramAnonymousa)
        {
        }
      });
      localo.a();
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      this.s = bool;
      return;
    }
  }

  public final void b()
  {
    this.m = -1;
  }

  public final int c()
  {
    return this.m;
  }

  public final void d()
  {
    View localView = a(0);
    if (localView != null)
    {
      a(localView.findViewById(this.r), localView.findViewById(this.q), true);
      this.m = 0;
    }
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i1 = 0;
    if (this.g < 2)
      this.g = this.e.getWidth();
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 0:
    case 3:
    case 2:
    case 1:
    }
    do
    {
      float f6;
      do
      {
        do
          while (true)
          {
            return false;
            if (this.m != -1)
            {
              new StringBuilder().append("collapsing expanded position ").append(this.m).toString();
              a();
              MotionEvent localMotionEvent3 = MotionEvent.obtain(paramMotionEvent);
              localMotionEvent3.setAction(0x3 | paramMotionEvent.getActionIndex() << 8);
              this.e.onTouchEvent(localMotionEvent3);
              this.f.onTouchEvent(localMotionEvent3);
              localMotionEvent3.recycle();
              return true;
            }
            if (this.s)
              return false;
            Rect localRect = new Rect();
            int i9 = this.e.getChildCount();
            int[] arrayOfInt = new int[2];
            this.e.getLocationOnScreen(arrayOfInt);
            int i10 = (int)paramMotionEvent.getRawX() - arrayOfInt[0];
            int i11 = (int)paramMotionEvent.getRawY() - arrayOfInt[1];
            while (true)
            {
              if (i1 < i9)
              {
                View localView = this.e.getChildAt(i1);
                localView.getHitRect(localRect);
                if (localRect.contains(i10, i11))
                  this.n = localView;
              }
              else
              {
                if (this.n != null)
                {
                  this.h = paramMotionEvent.getRawX();
                  this.i = paramMotionEvent.getRawY();
                  this.l = this.e.getPositionForView(this.n);
                  this.o = this.n.findViewById(this.r);
                  this.p = this.n.findViewById(this.q);
                  this.k = VelocityTracker.obtain();
                  this.k.addMovement(paramMotionEvent);
                }
                paramView.onTouchEvent(paramMotionEvent);
                return true;
              }
              i1++;
            }
            if (this.k != null)
            {
              if (this.n != null)
                a(this.o, this.p);
              this.k.recycle();
              this.k = null;
              this.h = 0.0F;
              this.i = 0.0F;
              this.n = null;
              this.l = -1;
              this.j = false;
            }
          }
        while ((this.k == null) || (this.s));
        this.k.addMovement(paramMotionEvent);
        f6 = paramMotionEvent.getRawX() - this.h;
        float f7 = paramMotionEvent.getRawY() - this.i;
        if ((Math.abs(f6) > this.a) && (Math.abs(f7) < this.n.getHeight()))
        {
          this.j = true;
          this.e.requestDisallowInterceptTouchEvent(true);
          this.f.requestDisallowInterceptTouchEvent(true);
          MotionEvent localMotionEvent2 = MotionEvent.obtain(paramMotionEvent);
          localMotionEvent2.setAction(0x3 | paramMotionEvent.getActionIndex() << 8);
          this.e.onTouchEvent(localMotionEvent2);
          this.f.onTouchEvent(localMotionEvent2);
          localMotionEvent2.recycle();
        }
      }
      while (!this.j);
      float f8 = Math.min(0.0F, f6);
      textnow.ao.a.b(this.o, Math.max(f8, -this.p.getWidth()));
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.p.getLayoutParams();
      localMarginLayoutParams.rightMargin = ((int)-Math.max(0.0F, this.p.getWidth() - Math.abs(f8)));
      this.p.setLayoutParams(localMarginLayoutParams);
      return true;
      if (this.m != -1)
      {
        new StringBuilder().append("collapsing expanded position ").append(this.m).toString();
        a();
        MotionEvent localMotionEvent1 = MotionEvent.obtain(paramMotionEvent);
        localMotionEvent1.setAction(0x3 | paramMotionEvent.getActionIndex() << 8);
        this.e.onTouchEvent(localMotionEvent1);
        this.f.onTouchEvent(localMotionEvent1);
        localMotionEvent1.recycle();
        return true;
      }
    }
    while (this.k == null);
    float f1 = paramMotionEvent.getRawX() - this.h;
    float f2 = paramMotionEvent.getRawY() - this.i;
    this.k.addMovement(paramMotionEvent);
    this.k.computeCurrentVelocity(1000);
    float f3 = this.k.getXVelocity();
    float f4 = Math.abs(f3);
    float f5 = Math.abs(this.k.getYVelocity());
    int i2;
    label837: int i3;
    if ((Math.abs(f1) > this.p.getWidth() / 3) && (Math.abs(f2) < this.n.getHeight()))
      if (f1 < 0.0F)
      {
        i2 = 1;
        i3 = 1;
      }
    while (true)
    {
      if ((i3 != 0) && (i2 != 0))
      {
        a(this.o, this.p, true);
        this.m = this.l;
      }
      while (true)
      {
        this.k.recycle();
        this.k = null;
        this.h = 0.0F;
        this.i = 0.0F;
        this.n = null;
        this.l = -1;
        this.j = false;
        break;
        i2 = 0;
        break label837;
        if ((this.b > f4) || (f4 > this.c) || (f5 >= f4))
          break label1046;
        int i4;
        label957: int i5;
        label967: int i6;
        if (f3 < 0.0F)
        {
          i4 = 1;
          if (f1 >= 0.0F)
            break label1013;
          i5 = 1;
          if (i4 != i5)
            break label1019;
          i6 = 1;
          label977: if (this.k.getXVelocity() >= 0.0F)
            break label1025;
        }
        label1025: for (int i7 = 1; ; i7 = 0)
        {
          int i8 = i7;
          i3 = i6;
          i2 = i8;
          break;
          i4 = 0;
          break label957;
          label1013: i5 = 0;
          break label967;
          label1019: i6 = 0;
          break label977;
        }
        a(this.o, this.p);
      }
      label1046: i2 = 0;
      i3 = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.af
 * JD-Core Version:    0.6.2
 */