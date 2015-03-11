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
import textnow.at.o;
import textnow.at.q;

public final class al
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

  public al(ListView paramListView, SwipeRefreshLayout paramSwipeRefreshLayout, int paramInt1, int paramInt2)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramListView.getContext());
    this.a = (3 * localViewConfiguration.getScaledTouchSlop());
    this.b = (16 * localViewConfiguration.getScaledMinimumFlingVelocity());
    this.c = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.d = paramListView.getContext().getResources().getInteger(17694721);
    this.e = paramListView;
    this.f = paramSwipeRefreshLayout;
    this.r = 2131558630;
    this.q = 2131558639;
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
          localMarginLayoutParams.leftMargin = ((Integer)paramAnonymouso.e()).intValue();
        while (true)
        {
          paramView.setLayoutParams(localMarginLayoutParams);
          return;
          localMarginLayoutParams.rightMargin = ((Integer)paramAnonymouso.e()).intValue();
        }
      }
    });
    if (paramInterpolator != null)
      localo.a(paramInterpolator);
    return localo;
  }

  private void a(final View paramView1, final View paramView2)
  {
    if ((paramView1 != null) && (paramView2 != null) && (textnow.av.a.a(paramView1) < 0.0F))
    {
      long l1 = ()(Math.min(0.99F, Math.abs(textnow.av.a.a(paramView1)) / paramView2.getWidth()) * (float)this.d);
      final o localo = a(paramView2, false, ((ViewGroup.MarginLayoutParams)paramView2.getLayoutParams()).rightMargin, -paramView2.getWidth(), l1, this.t);
      textnow.av.b.a(paramView1).a(this.t).a(0.0F).a(l1).a(new textnow.at.b()
      {
        public final void a(textnow.at.a paramAnonymousa)
        {
        }

        public final void b(textnow.at.a paramAnonymousa)
        {
          al.a(al.this, false);
          textnow.av.b.a(paramView1).a(null);
        }

        public final void c(textnow.at.a paramAnonymousa)
        {
          textnow.av.a.b(paramView1, 0.0F);
          b(paramAnonymousa);
          localo.b();
          ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView2.getLayoutParams();
          localMarginLayoutParams.rightMargin = (-paramView2.getWidth());
          paramView2.setLayoutParams(localMarginLayoutParams);
        }

        public final void d(textnow.at.a paramAnonymousa)
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

  public final void a(final am paramam)
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
          localLayoutParams.height = ((Integer)paramAnonymouso.e()).intValue();
          localView.setLayoutParams(localLayoutParams);
        }
      });
      localo.a(new textnow.at.b()
      {
        public final void a(textnow.at.a paramAnonymousa)
        {
        }

        public final void b(textnow.at.a paramAnonymousa)
        {
          paramam.a();
        }

        public final void c(textnow.at.a paramAnonymousa)
        {
        }

        public final void d(textnow.at.a paramAnonymousa)
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

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
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
      float f7;
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
            int i8 = this.e.getChildCount();
            int[] arrayOfInt = new int[2];
            this.e.getLocationOnScreen(arrayOfInt);
            int i9 = (int)paramMotionEvent.getRawX() - arrayOfInt[0];
            int i10 = (int)paramMotionEvent.getRawY() - arrayOfInt[1];
            for (int i11 = 0; ; i11++)
              if (i11 < i8)
              {
                View localView3 = this.e.getChildAt(i11);
                localView3.getHitRect(localRect);
                if (localRect.contains(i9, i10))
                  this.n = localView3;
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
        f7 = paramMotionEvent.getRawX() - this.h;
        float f8 = paramMotionEvent.getRawY() - this.i;
        if ((Math.abs(f7) > this.a) && (Math.abs(f8) < this.n.getHeight()))
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
      float f9 = Math.min(0.0F, f7);
      textnow.av.a.b(this.o, Math.max(f9, -this.p.getWidth()));
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.p.getLayoutParams();
      localMarginLayoutParams.rightMargin = ((int)-Math.max(0.0F, this.p.getWidth() - Math.abs(f9)));
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
    int i1;
    if ((Math.abs(f1) > this.p.getWidth() / 3) && (Math.abs(f2) < this.n.getHeight()))
    {
      i2 = 1;
      if (f1 < 0.0F)
      {
        i1 = 1;
        label838: if ((i2 == 0) || (i1 == 0))
          break label1196;
        final View localView1 = this.o;
        final View localView2 = this.p;
        if ((localView1 != null) && (localView2 != null) && (textnow.av.a.a(localView1) > -localView2.getWidth()))
        {
          float f6 = Math.min(0.99F, Math.abs(textnow.av.a.a(localView1)) / localView2.getWidth());
          long l1 = ()((float)this.d * (1.0F - f6));
          final o localo = a(localView2, false, ((ViewGroup.MarginLayoutParams)localView2.getLayoutParams()).rightMargin, 0, l1, this.t);
          textnow.av.b.a(localView1).a(this.t).a(-localView2.getWidth()).a(l1).a(new textnow.at.b()
          {
            public final void a(textnow.at.a paramAnonymousa)
            {
            }

            public final void b(textnow.at.a paramAnonymousa)
            {
              al.a(al.this, false);
              textnow.av.b.a(localView1).a(null);
            }

            public final void c(textnow.at.a paramAnonymousa)
            {
              View localView = localView1;
              if (this.b);
              for (float f = -localView2.getWidth(); ; f = localView2.getWidth())
              {
                textnow.av.a.b(localView, f);
                b(paramAnonymousa);
                localo.b();
                ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)localView2.getLayoutParams();
                localMarginLayoutParams.rightMargin = 0;
                localView2.setLayoutParams(localMarginLayoutParams);
                return;
              }
            }

            public final void d(textnow.at.a paramAnonymousa)
            {
            }
          });
          localo.a();
        }
        this.m = this.l;
      }
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
      i1 = 0;
      break label838;
      boolean bool1 = this.b < f4;
      i1 = 0;
      i2 = 0;
      if (bool1)
        break label838;
      boolean bool2 = f4 < this.c;
      i1 = 0;
      i2 = 0;
      if (bool2)
        break label838;
      boolean bool3 = f5 < f4;
      i1 = 0;
      i2 = 0;
      if (!bool3)
        break label838;
      int i3;
      label1123: int i4;
      label1132: int i5;
      if (f3 < 0.0F)
      {
        i3 = 1;
        if (f1 >= 0.0F)
          break label1178;
        i4 = 1;
        if (i3 != i4)
          break label1184;
        i5 = 1;
        label1142: if (this.k.getXVelocity() >= 0.0F)
          break label1190;
      }
      label1178: label1184: label1190: for (int i6 = 1; ; i6 = 0)
      {
        int i7 = i6;
        i2 = i5;
        i1 = i7;
        break;
        i3 = 0;
        break label1123;
        i4 = 0;
        break label1132;
        i5 = 0;
        break label1142;
      }
      label1196: a(this.o, this.p);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.al
 * JD-Core Version:    0.6.2
 */