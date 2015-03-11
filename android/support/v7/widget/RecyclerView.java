package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.af;
import android.support.v4.view.av;
import android.support.v4.widget.u;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import textnow.e.a;

public class RecyclerView extends ViewGroup
{
  private static final Interpolator aa;
  private static final boolean i;
  private final AccessibilityManager A;
  private boolean B = false;
  private boolean C = false;
  private u D;
  private u E;
  private u F;
  private u G;
  private int H = 0;
  private int I = -1;
  private VelocityTracker J;
  private int K;
  private int L;
  private int M;
  private int N;
  private final int O;
  private final int P;
  private final int Q;
  private final bd R = new bd(this);
  private au S;
  private ao T = new ap(this, (byte)0);
  private boolean U = false;
  private bf V;
  private Runnable W = new Runnable()
  {
    public final void run()
    {
      if (RecyclerView.this.e != null)
        RecyclerView.this.e.a();
      RecyclerView.a(RecyclerView.this, false);
    }
  };
  final aw a = new aw(this);
  k b;
  n c;
  final List<View> d = new ArrayList();
  an e = new q();
  final bb f = new bb();
  boolean g = false;
  boolean h = false;
  private final ay j = new ay(this, (byte)0);
  private RecyclerView.SavedState k;
  private boolean l;
  private final Runnable m = new Runnable()
  {
    public final void run()
    {
      if (!RecyclerView.this.b.c());
      while (!RecyclerView.a(RecyclerView.this))
        return;
      if (RecyclerView.b(RecyclerView.this))
      {
        RecyclerView.this.c();
        return;
      }
      RecyclerView.this.b();
      RecyclerView.this.b.a();
      if (!RecyclerView.c(RecyclerView.this))
        RecyclerView.this.d();
      RecyclerView.this.a(true);
    }
  };
  private final Rect n = new Rect();
  private al o;
  private as p;
  private ax q;
  private final ArrayList<aq> r = new ArrayList();
  private final ArrayList<at> s = new ArrayList();
  private at t;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private final boolean z;

  static
  {
    if ((Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20));
    for (boolean bool = true; ; bool = false)
    {
      i = bool;
      aa = new Interpolator()
      {
        public final float getInterpolation(float paramAnonymousFloat)
        {
          float f = paramAnonymousFloat - 1.0F;
          return 1.0F + f * (f * (f * (f * f)));
        }
      };
      return;
    }
  }

  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (Build.VERSION.SDK_INT >= 16);
    for (boolean bool1 = true; ; bool1 = false)
    {
      this.z = bool1;
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
      this.O = localViewConfiguration.getScaledTouchSlop();
      this.P = localViewConfiguration.getScaledMinimumFlingVelocity();
      this.Q = localViewConfiguration.getScaledMaximumFlingVelocity();
      int i1 = av.a(this);
      boolean bool2 = false;
      if (i1 == 2)
        bool2 = true;
      setWillNotDraw(bool2);
      this.e.a(this.T);
      this.b = new k(new l()
      {
        private void c(m paramAnonymousm)
        {
          switch (paramAnonymousm.a)
          {
          default:
            return;
          case 0:
            as localas4 = RecyclerView.d(RecyclerView.this);
            localas4.a(paramAnonymousm.b, paramAnonymousm.c);
            return;
          case 1:
            as localas3 = RecyclerView.d(RecyclerView.this);
            localas3.b(paramAnonymousm.b, paramAnonymousm.c);
            return;
          case 2:
            as localas2 = RecyclerView.d(RecyclerView.this);
            localas2.c(paramAnonymousm.b, paramAnonymousm.c);
            return;
          case 3:
          }
          as localas1 = RecyclerView.d(RecyclerView.this);
          localas1.d(paramAnonymousm.b, paramAnonymousm.c);
        }

        public final be a(int paramAnonymousInt)
        {
          return RecyclerView.this.a(paramAnonymousInt, true);
        }

        public final void a(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          RecyclerView.this.a(paramAnonymousInt1, paramAnonymousInt2, true);
          RecyclerView.this.g = true;
          bb.a(RecyclerView.this.f, paramAnonymousInt2);
        }

        public final void a(m paramAnonymousm)
        {
          c(paramAnonymousm);
        }

        public final void b(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          RecyclerView.this.a(paramAnonymousInt1, paramAnonymousInt2, false);
          RecyclerView.this.g = true;
        }

        public final void b(m paramAnonymousm)
        {
          c(paramAnonymousm);
        }

        public final void c(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          RecyclerView.this.e(paramAnonymousInt1, paramAnonymousInt2);
          RecyclerView.this.h = true;
        }

        public final void d(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          RecyclerView.this.d(paramAnonymousInt1, paramAnonymousInt2);
          RecyclerView.this.g = true;
        }

        public final void e(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          RecyclerView.this.c(paramAnonymousInt1, paramAnonymousInt2);
          RecyclerView.this.g = true;
        }
      });
      this.c = new n(new p()
      {
        public final int a()
        {
          return RecyclerView.this.getChildCount();
        }

        public final int a(View paramAnonymousView)
        {
          return RecyclerView.this.indexOfChild(paramAnonymousView);
        }

        public final void a(int paramAnonymousInt)
        {
          View localView = RecyclerView.this.getChildAt(paramAnonymousInt);
          if (localView != null)
            RecyclerView.b(RecyclerView.this, localView);
          RecyclerView.this.removeViewAt(paramAnonymousInt);
        }

        public final void a(View paramAnonymousView, int paramAnonymousInt)
        {
          RecyclerView.this.addView(paramAnonymousView, paramAnonymousInt);
          RecyclerView.a(RecyclerView.this, paramAnonymousView);
        }

        public final void a(View paramAnonymousView, int paramAnonymousInt, ViewGroup.LayoutParams paramAnonymousLayoutParams)
        {
          RecyclerView.a(RecyclerView.this, paramAnonymousView, paramAnonymousInt, paramAnonymousLayoutParams);
        }

        public final be b(View paramAnonymousView)
        {
          return RecyclerView.b(paramAnonymousView);
        }

        public final View b(int paramAnonymousInt)
        {
          return RecyclerView.this.getChildAt(paramAnonymousInt);
        }

        public final void c(int paramAnonymousInt)
        {
          RecyclerView.a(RecyclerView.this, paramAnonymousInt);
        }
      });
      if (av.e(this) == 0)
        av.c(this, 1);
      this.A = ((AccessibilityManager)getContext().getSystemService("accessibility"));
      this.V = new bf(this);
      av.a(this, this.V);
      return;
    }
  }

  private long a(be parambe)
  {
    if (this.o.c())
      return parambe.d;
    return parambe.b;
  }

  private void a(ar paramar)
  {
    View localView = paramar.a.a;
    e(localView);
    int i1 = paramar.b;
    int i2 = paramar.c;
    int i3 = localView.getLeft();
    int i4 = localView.getTop();
    if ((i1 != i3) || (i2 != i4))
    {
      paramar.a.a(false);
      localView.layout(i3, i4, i3 + localView.getWidth(), i4 + localView.getHeight());
      if (this.e.a(paramar.a, i1, i2, i3, i4))
        q();
      return;
    }
    paramar.a.a(false);
    this.e.a(paramar.a);
    q();
  }

  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = af.b(paramMotionEvent);
    if (af.b(paramMotionEvent, i1) == this.I)
      if (i1 != 0)
        break label81;
    label81: for (int i2 = 1; ; i2 = 0)
    {
      this.I = af.b(paramMotionEvent, i2);
      int i3 = (int)(0.5F + af.c(paramMotionEvent, i2));
      this.M = i3;
      this.K = i3;
      int i4 = (int)(0.5F + af.d(paramMotionEvent, i2));
      this.N = i4;
      this.L = i4;
      return;
    }
  }

  private void a(a<View, Rect> parama)
  {
    int i1 = this.d.size();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = (View)this.d.get(i2);
      be localbe = b(localView);
      ar localar = (ar)this.f.a.remove(localbe);
      if (!this.f.a())
        this.f.b.remove(localbe);
      if (parama.remove(localView) != null)
        this.p.a(localView, this.a);
      while (true)
      {
        i2++;
        break;
        if (localar != null)
          a(localar);
        else
          a(new ar(localbe, localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom()));
      }
    }
    this.d.clear();
  }

  static be b(View paramView)
  {
    if (paramView == null)
      return null;
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).a;
  }

  public static int c(View paramView)
  {
    be localbe = b(paramView);
    if (localbe != null)
      return localbe.c();
    return -1;
  }

  private void c(int paramInt)
  {
    if (paramInt == this.H)
      return;
    this.H = paramInt;
    if (paramInt != 2)
      h();
    if (this.S != null);
    this.p.e(paramInt);
  }

  private void e(View paramView)
  {
    if (paramView.getParent() == this);
    for (int i1 = 1; ; i1 = 0)
    {
      this.a.b(a(paramView));
      if (i1 != 0)
        break;
      this.c.a(paramView, true);
      return;
    }
    n localn = this.c;
    int i2 = localn.a.a(paramView);
    if (i2 < 0)
      throw new IllegalArgumentException("view is not a child, cannot hide " + paramView);
    localn.b.a(i2);
    localn.c.add(paramView);
  }

  private void f(int paramInt1, int paramInt2)
  {
    g();
    int i5;
    int i4;
    int i1;
    int i6;
    label74: label221: int i3;
    int i2;
    if (this.o != null)
    {
      b();
      this.C = true;
      if (paramInt1 != 0)
      {
        i5 = this.p.a(paramInt1, this.a, this.f);
        i4 = paramInt1 - i5;
        if (paramInt2 != 0)
        {
          i1 = this.p.b(paramInt2, this.a, this.f);
          i6 = paramInt2 - i1;
          if (p())
          {
            int i8 = this.c.a();
            int i9 = 0;
            if (i9 < i8)
            {
              View localView1 = this.c.b(i9);
              be localbe1 = a(localView1);
              be localbe2;
              if ((localbe1 != null) && (localbe1.h != null))
              {
                localbe2 = localbe1.h;
                if (localbe2 == null)
                  break label221;
              }
              for (View localView2 = localbe2.a; ; localView2 = null)
              {
                if (localView2 != null)
                {
                  int i10 = localView1.getLeft();
                  int i11 = localView1.getTop();
                  if ((i10 != localView2.getLeft()) || (i11 != localView2.getTop()))
                    localView2.layout(i10, i11, i10 + localView2.getWidth(), i11 + localView2.getHeight());
                }
                i9++;
                break;
              }
            }
          }
          this.C = false;
          a(false);
          int i7 = i5;
          i3 = i6;
          i2 = i7;
        }
      }
    }
    while (true)
    {
      if (!this.r.isEmpty())
        invalidate();
      if (av.a(this) != 2)
      {
        g(paramInt1, paramInt2);
        if (i4 >= 0)
          break label386;
        j();
        this.D.a(-i4 / getWidth());
        if (i3 >= 0)
          break label415;
        l();
        this.E.a(-i3 / getHeight());
      }
      while (true)
      {
        if ((i4 != 0) || (i3 != 0))
          av.d(this);
        if ((i2 != 0) || (i1 != 0))
        {
          onScrollChanged(0, 0, 0, 0);
          if (this.S == null);
        }
        if (!awakenScrollBars())
          invalidate();
        return;
        label386: if (i4 <= 0)
          break;
        k();
        this.F.a(i4 / getWidth());
        break;
        label415: if (i3 > 0)
        {
          m();
          this.G.a(i3 / getHeight());
        }
      }
      i1 = 0;
      i6 = 0;
      break label74;
      i5 = 0;
      i4 = 0;
      break;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      i4 = 0;
    }
  }

  private void g()
  {
    if (this.b.c())
      this.m.run();
  }

  private void g(int paramInt1, int paramInt2)
  {
    u localu = this.D;
    boolean bool1 = false;
    if (localu != null)
    {
      boolean bool2 = this.D.a();
      bool1 = false;
      if (!bool2)
      {
        bool1 = false;
        if (paramInt1 > 0)
          bool1 = this.D.c();
      }
    }
    if ((this.F != null) && (!this.F.a()) && (paramInt1 < 0))
      bool1 |= this.F.c();
    if ((this.E != null) && (!this.E.a()) && (paramInt2 > 0))
      bool1 |= this.E.c();
    if ((this.G != null) && (!this.G.a()) && (paramInt2 < 0))
      bool1 |= this.G.c();
    if (bool1)
      av.d(this);
  }

  private void h()
  {
    this.R.a();
    this.p.t();
  }

  private void i()
  {
    u localu = this.D;
    boolean bool = false;
    if (localu != null)
      bool = this.D.c();
    if (this.E != null)
      bool |= this.E.c();
    if (this.F != null)
      bool |= this.F.c();
    if (this.G != null)
      bool |= this.G.c();
    if (bool)
      av.d(this);
  }

  private void j()
  {
    if (this.D != null)
      return;
    this.D = new u(getContext());
    if (this.l)
    {
      this.D.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.D.a(getMeasuredHeight(), getMeasuredWidth());
  }

  private void k()
  {
    if (this.F != null)
      return;
    this.F = new u(getContext());
    if (this.l)
    {
      this.F.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.F.a(getMeasuredHeight(), getMeasuredWidth());
  }

  private void l()
  {
    if (this.E != null)
      return;
    this.E = new u(getContext());
    if (this.l)
    {
      this.E.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.E.a(getMeasuredWidth(), getMeasuredHeight());
  }

  private void m()
  {
    if (this.G != null)
      return;
    this.G = new u(getContext());
    if (this.l)
    {
      this.G.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.G.a(getMeasuredWidth(), getMeasuredHeight());
  }

  private void n()
  {
    this.G = null;
    this.E = null;
    this.F = null;
    this.D = null;
  }

  private void o()
  {
    if (this.J != null)
      this.J.clear();
    i();
    c(0);
  }

  private boolean p()
  {
    return (this.e != null) && (this.e.h());
  }

  private void q()
  {
    if ((!this.U) && (this.u))
    {
      av.a(this, this.W);
      this.U = true;
    }
  }

  private void r()
  {
    boolean bool1 = true;
    if (this.B)
    {
      k localk = this.b;
      localk.a(localk.a);
      localk.a(localk.b);
      int i1 = this.c.b();
      for (int i2 = 0; i2 < i1; i2++)
      {
        be localbe2 = b(this.c.c(i2));
        if ((localbe2 != null) && (!localbe2.b()))
          localbe2.a(6);
      }
      int i3 = this.c.b();
      for (int i4 = 0; i4 < i3; i4++)
        ((RecyclerView.LayoutParams)this.c.c(i4).getLayoutParams()).c = bool1;
      aw localaw1 = this.a;
      int i5 = localaw1.b.size();
      for (int i6 = 0; i6 < i5; i6++)
      {
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)((be)localaw1.b.get(i6)).a.getLayoutParams();
        if (localLayoutParams != null)
          localLayoutParams.c = bool1;
      }
      aw localaw2 = this.a;
      int i8;
      int i9;
      if ((localaw2.c.o != null) && (localaw2.c.o.c()))
      {
        i8 = localaw2.b.size();
        i9 = 0;
      }
      while (i9 < i8)
      {
        be localbe1 = (be)localaw2.b.get(i9);
        if (localbe1 != null)
          localbe1.a(6);
        i9++;
        continue;
        for (int i7 = -1 + localaw2.b.size(); i7 >= 0; i7--)
          if (!localaw2.c(i7))
            ((be)localaw2.b.get(i7)).a(6);
      }
      this.p.a();
    }
    boolean bool2;
    label408: boolean bool3;
    label468: bb localbb2;
    boolean bool4;
    if ((this.e != null) && (this.p.c()))
    {
      this.b.a();
      if (((!this.g) || (this.h)) && (!this.g) && ((!this.h) || (!p())))
        break label545;
      bool2 = bool1;
      bb localbb1 = this.f;
      if ((!this.v) || (this.e == null) || ((!this.B) && (!bool2) && (!as.a(this.p))) || ((this.B) && (!this.o.c())))
        break label550;
      bool3 = bool1;
      bb.c(localbb1, bool3);
      localbb2 = this.f;
      if ((!bb.b(this.f)) || (!bool2) || (this.B))
        break label562;
      if ((this.e == null) || (!this.p.c()))
        break label556;
      bool4 = bool1;
      label522: if (!bool4)
        break label562;
    }
    while (true)
    {
      bb.d(localbb2, bool1);
      return;
      this.b.d();
      break;
      label545: bool2 = false;
      break label408;
      label550: bool3 = false;
      break label468;
      label556: bool4 = false;
      break label522;
      label562: bool1 = false;
    }
  }

  private void s()
  {
    int i1 = this.c.b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      be localbe = b(this.c.c(i2));
      if (!localbe.b())
        localbe.a();
    }
    this.a.b();
  }

  public final as a()
  {
    return this.p;
  }

  final be a(int paramInt, boolean paramBoolean)
  {
    int i1 = this.c.b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      be localbe = b(this.c.c(i2));
      if ((localbe != null) && (!localbe.l()) && (localbe.b == paramInt))
        return localbe;
    }
    return null;
  }

  public final be a(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this))
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    return b(paramView);
  }

  public final void a(int paramInt)
  {
    int i1 = this.c.a();
    for (int i2 = 0; i2 < i1; i2++)
      this.c.b(i2).offsetTopAndBottom(paramInt);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) || (paramInt2 != 0))
      this.R.b(paramInt1, paramInt2);
  }

  final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = paramInt1 + paramInt2;
    int i2 = this.c.b();
    int i3 = 0;
    if (i3 < i2)
    {
      be localbe2 = b(this.c.c(i3));
      if ((localbe2 != null) && (!localbe2.b()))
      {
        if (localbe2.b < i1)
          break label84;
        localbe2.a(-paramInt2, paramBoolean);
        bb.a(this.f, true);
      }
      while (true)
      {
        i3++;
        break;
        label84: if (localbe2.b >= paramInt1)
        {
          int i6 = paramInt1 - 1;
          int i7 = -paramInt2;
          localbe2.a(8);
          localbe2.a(i7, paramBoolean);
          localbe2.b = i6;
          bb.a(this.f, true);
        }
      }
    }
    aw localaw = this.a;
    int i4 = paramInt1 + paramInt2;
    int i5 = -1 + localaw.b.size();
    if (i5 >= 0)
    {
      be localbe1 = (be)localaw.b.get(i5);
      if (localbe1 != null)
      {
        if (localbe1.c() < i4)
          break label208;
        localbe1.a(-paramInt2, paramBoolean);
      }
      while (true)
      {
        i5--;
        break;
        label208: if ((localbe1.c() >= paramInt1) && (!localaw.c(i5)))
          localbe1.a(4);
      }
    }
    requestLayout();
  }

  final void a(String paramString)
  {
    if (this.C)
    {
      if (paramString == null)
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
      throw new IllegalStateException(paramString);
    }
  }

  final void a(boolean paramBoolean)
  {
    if (this.w)
    {
      if ((paramBoolean) && (this.x) && (this.p != null) && (this.o != null))
        c();
      this.w = false;
      this.x = false;
    }
  }

  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    as.s();
    super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }

  final void b()
  {
    if (!this.w)
    {
      this.w = true;
      this.x = false;
    }
  }

  public final void b(int paramInt)
  {
    int i1 = this.c.a();
    for (int i2 = 0; i2 < i1; i2++)
      this.c.b(i2).offsetLeftAndRight(paramInt);
  }

  final void b(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      j();
      this.D.a(-paramInt1);
      if (paramInt2 >= 0)
        break label69;
      l();
      this.E.a(-paramInt2);
    }
    while (true)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        av.d(this);
      return;
      if (paramInt1 <= 0)
        break;
      k();
      this.F.a(paramInt1);
      break;
      label69: if (paramInt2 > 0)
      {
        m();
        this.G.a(paramInt2);
      }
    }
  }

  final void c()
  {
    boolean bool1 = true;
    if (this.o == null)
      return;
    this.d.clear();
    b();
    this.C = bool1;
    r();
    bb localbb1 = this.f;
    if ((bb.b(this.f)) && (this.h) && (p()));
    for (a locala1 = new a(); ; locala1 = null)
    {
      localbb1.c = locala1;
      this.h = false;
      this.g = false;
      bb.b(this.f, bb.a(this.f));
      this.f.d = this.o.b();
      if (!bb.b(this.f))
        break;
      this.f.a.clear();
      this.f.b.clear();
      int i24 = this.c.a();
      for (int i25 = 0; i25 < i24; i25++)
      {
        be localbe10 = b(this.c.b(i25));
        if ((!localbe10.b()) && ((!localbe10.h()) || (this.o.c())))
        {
          View localView3 = localbe10.a;
          this.f.a.put(localbe10, new ar(localbe10, localView3.getLeft(), localView3.getTop(), localView3.getRight(), localView3.getBottom()));
        }
      }
    }
    a locala4;
    int i20;
    View localView2;
    int i21;
    if (bb.a(this.f))
    {
      int i18 = this.c.b();
      for (int i19 = 0; i19 < i18; i19++)
      {
        be localbe9 = b(this.c.c(i19));
        if ((!localbe9.b()) && (localbe9.c == -1))
          localbe9.c = localbe9.b;
      }
      if (this.f.c != null)
      {
        int i22 = this.c.a();
        for (int i23 = 0; i23 < i22; i23++)
        {
          be localbe8 = b(this.c.b(i23));
          if ((localbe8.j()) && (!localbe8.l()) && (!localbe8.b()))
          {
            long l4 = a(localbe8);
            this.f.c.put(Long.valueOf(l4), localbe8);
            this.f.a.remove(localbe8);
          }
        }
      }
      boolean bool3 = bb.c(this.f);
      bb.a(this.f, false);
      this.p.c(this.a, this.f);
      bb.a(this.f, bool3);
      locala4 = new a();
      i20 = 0;
      if (i20 < this.c.a())
      {
        localView2 = this.c.b(i20);
        if (!b(localView2).b())
        {
          i21 = 0;
          label542: if (i21 >= this.f.a.size())
            break label1980;
          if (((be)this.f.a.b(i21)).a != localView2)
            break label629;
        }
      }
    }
    label774: label786: label1052: label1974: label1980: for (boolean bool4 = bool1; ; bool4 = false)
    {
      if (!bool4)
        locala4.put(localView2, new Rect(localView2.getLeft(), localView2.getTop(), localView2.getRight(), localView2.getBottom()));
      i20++;
      break;
      label629: i21++;
      break label542;
      s();
      this.b.b();
      for (a locala2 = locala4; ; locala2 = null)
      {
        this.f.d = this.o.b();
        bb.b(this.f, 0);
        bb.b(this.f, false);
        this.p.c(this.a, this.f);
        bb.a(this.f, false);
        this.k = null;
        bb localbb2 = this.f;
        boolean bool2;
        a locala3;
        int i2;
        be localbe6;
        View localView1;
        if ((bb.b(this.f)) && (this.e != null))
        {
          bool2 = bool1;
          bb.c(localbb2, bool2);
          if (!bb.b(this.f))
            break label1853;
          if (this.f.c == null)
            break label1001;
          locala3 = new a();
          int i1 = this.c.a();
          i2 = 0;
          if (i2 >= i1)
            break label1052;
          localbe6 = b(this.c.b(i2));
          if (!localbe6.b())
          {
            localView1 = localbe6.a;
            long l2 = a(localbe6);
            if ((locala3 == null) || (this.f.c.get(Long.valueOf(l2)) == null))
              break label1007;
            locala3.put(Long.valueOf(l2), localbe6);
          }
        }
        while (true)
        {
          i2++;
          break label786;
          s();
          this.b.d();
          if (this.f.c == null)
            break label1974;
          int i16 = this.c.a();
          for (int i17 = 0; i17 < i16; i17++)
          {
            be localbe7 = b(this.c.b(i17));
            if ((localbe7.j()) && (!localbe7.l()) && (!localbe7.b()))
            {
              long l3 = a(localbe7);
              this.f.c.put(Long.valueOf(l3), localbe7);
              this.f.a.remove(localbe7);
            }
          }
          bool2 = false;
          break;
          label1001: locala3 = null;
          break label774;
          label1007: this.f.b.put(localbe6, new ar(localbe6, localView1.getLeft(), localView1.getTop(), localView1.getRight(), localView1.getBottom()));
        }
        a(locala2);
        for (int i3 = -1 + this.f.a.size(); i3 >= 0; i3--)
        {
          be localbe5 = (be)this.f.a.b(i3);
          if (!this.f.b.containsKey(localbe5))
          {
            ar localar4 = (ar)this.f.a.c(i3);
            this.f.a.d(i3);
            removeDetachedView(localar4.a.a, false);
            this.a.b(localar4.a);
            a(localar4);
          }
        }
        int i4 = this.f.b.size();
        if (i4 > 0)
        {
          int i13 = i4 - 1;
          if (i13 >= 0)
          {
            be localbe4 = (be)this.f.b.b(i13);
            ar localar3 = (ar)this.f.b.c(i13);
            Rect localRect;
            if ((this.f.a.isEmpty()) || (!this.f.a.containsKey(localbe4)))
            {
              this.f.b.d(i13);
              if (locala2 == null)
                break label1386;
              localRect = (Rect)locala2.get(localbe4.a);
              int i14 = localar3.b;
              int i15 = localar3.c;
              if ((localRect == null) || ((localRect.left == i14) && (localRect.top == i15)))
                break label1392;
              localbe4.a(false);
              if (this.e.a(localbe4, localRect.left, localRect.top, i14, i15))
                q();
            }
            while (true)
            {
              i13--;
              break;
              label1386: localRect = null;
              break label1299;
              label1392: localbe4.a(false);
              this.e.b(localbe4);
              q();
            }
          }
        }
        int i5 = this.f.b.size();
        for (int i6 = 0; i6 < i5; i6++)
        {
          be localbe3 = (be)this.f.b.b(i6);
          ar localar1 = (ar)this.f.b.c(i6);
          ar localar2 = (ar)this.f.a.get(localbe3);
          if ((localar2 != null) && (localar1 != null) && ((localar2.b != localar1.b) || (localar2.c != localar1.c)))
          {
            localbe3.a(false);
            if (this.e.a(localbe3, localar2.b, localar2.c, localar1.b, localar1.c))
              q();
          }
        }
        int i7;
        int i8;
        label1600: be localbe1;
        be localbe2;
        int i9;
        int i10;
        int i11;
        int i12;
        if (this.f.c != null)
        {
          i7 = this.f.c.size();
          i8 = i7 - 1;
          if (i8 < 0)
            break label1853;
          long l1 = ((Long)this.f.c.b(i8)).longValue();
          localbe1 = (be)this.f.c.get(Long.valueOf(l1));
          if ((!localbe1.b()) && (aw.a(this.a) != null) && (aw.a(this.a).contains(localbe1)))
          {
            localbe2 = (be)locala3.get(Long.valueOf(l1));
            localbe1.a(false);
            removeDetachedView(localbe1.a, false);
            e(localbe1.a);
            localbe1.g = localbe2;
            this.a.b(localbe1);
            i9 = localbe1.a.getLeft();
            i10 = localbe1.a.getTop();
            if ((localbe2 != null) && (!localbe2.b()))
              break label1817;
            i11 = i10;
            i12 = i9;
          }
        }
        while (true)
        {
          this.e.a(localbe1, localbe2, i9, i10, i12, i11);
          q();
          i8--;
          break label1600;
          i7 = 0;
          break;
          i12 = localbe2.a.getLeft();
          i11 = localbe2.a.getTop();
          localbe2.a(false);
          localbe2.h = localbe1;
        }
        label1853: a(false);
        as localas = this.p;
        aw localaw = this.a;
        if (!bb.a(this.f));
        while (true)
        {
          localas.a(localaw, bool1);
          bb.c(this.f, this.f.d);
          this.B = false;
          bb.c(this.f, false);
          bb.d(this.f, false);
          this.C = false;
          as.a(this.p, false);
          if (aw.a(this.a) != null)
            aw.a(this.a).clear();
          this.f.c = null;
          return;
          bool1 = false;
        }
      }
    }
  }

  final void c(int paramInt1, int paramInt2)
  {
    int i1 = -1;
    int i2 = this.c.b();
    int i3;
    int i4;
    int i5;
    int i6;
    label28: be localbe2;
    if (paramInt1 < paramInt2)
    {
      i3 = i1;
      i4 = paramInt2;
      i5 = paramInt1;
      i6 = 0;
      if (i6 >= i2)
        break label130;
      localbe2 = b(this.c.c(i6));
      if ((localbe2 != null) && (localbe2.b >= i5) && (localbe2.b <= i4))
      {
        if (localbe2.b != paramInt1)
          break label119;
        localbe2.a(paramInt2 - paramInt1, false);
      }
    }
    while (true)
    {
      bb.a(this.f, true);
      i6++;
      break label28;
      i3 = 1;
      i4 = paramInt1;
      i5 = paramInt2;
      break;
      label119: localbe2.a(i3, false);
    }
    label130: aw localaw = this.a;
    int i8;
    int i7;
    int i10;
    label160: be localbe1;
    if (paramInt1 < paramInt2)
    {
      i8 = paramInt2;
      i7 = paramInt1;
      int i9 = localaw.b.size();
      i10 = 0;
      if (i10 >= i9)
        break label252;
      localbe1 = (be)localaw.b.get(i10);
      if ((localbe1 != null) && (localbe1.b >= i7) && (localbe1.b <= i8))
      {
        if (localbe1.b != paramInt1)
          break label242;
        localbe1.a(paramInt2 - paramInt1, false);
      }
    }
    while (true)
    {
      i10++;
      break label160;
      i1 = 1;
      i7 = paramInt2;
      i8 = paramInt1;
      break;
      label242: localbe1.a(i1, false);
    }
    label252: requestLayout();
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof RecyclerView.LayoutParams)) && (this.p.a((RecyclerView.LayoutParams)paramLayoutParams));
  }

  protected int computeHorizontalScrollExtent()
  {
    if (this.p.e())
      return this.p.c(this.f);
    return 0;
  }

  protected int computeHorizontalScrollOffset()
  {
    if (this.p.e())
      return this.p.a(this.f);
    return 0;
  }

  protected int computeHorizontalScrollRange()
  {
    if (this.p.e())
      return this.p.e(this.f);
    return 0;
  }

  protected int computeVerticalScrollExtent()
  {
    if (this.p.f())
      return this.p.d(this.f);
    return 0;
  }

  protected int computeVerticalScrollOffset()
  {
    if (this.p.f())
      return this.p.b(this.f);
    return 0;
  }

  protected int computeVerticalScrollRange()
  {
    if (this.p.f())
      return this.p.f(this.f);
    return 0;
  }

  final Rect d(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    if (!localLayoutParams.c)
      return localLayoutParams.b;
    Rect localRect1 = localLayoutParams.b;
    localRect1.set(0, 0, 0, 0);
    int i1 = this.r.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      this.n.set(0, 0, 0, 0);
      ((aq)this.r.get(i2));
      Rect localRect2 = this.n;
      ((RecyclerView.LayoutParams)paramView.getLayoutParams()).e();
      localRect2.set(0, 0, 0, 0);
      localRect1.left += this.n.left;
      localRect1.top += this.n.top;
      localRect1.right += this.n.right;
      localRect1.bottom += this.n.bottom;
    }
    localLayoutParams.c = false;
    return localRect1;
  }

  final void d()
  {
    int i1 = this.c.a();
    int i2 = 0;
    if (i2 < i1)
    {
      be localbe = b(this.c.b(i2));
      if ((localbe != null) && (!localbe.b()))
      {
        if ((!localbe.l()) && (!localbe.h()))
          break label62;
        requestLayout();
      }
      while (true)
      {
        i2++;
        break;
        label62: if (localbe.i())
          if (localbe.e == 0)
          {
            if ((!localbe.j()) || (!p()))
              this.o.a(localbe, localbe.b);
            else
              requestLayout();
          }
          else
          {
            localbe.a(4);
            requestLayout();
          }
      }
    }
  }

  final void d(int paramInt1, int paramInt2)
  {
    int i1 = this.c.b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      be localbe2 = b(this.c.c(i2));
      if ((localbe2 != null) && (!localbe2.b()) && (localbe2.b >= paramInt1))
      {
        localbe2.a(paramInt2, false);
        bb.a(this.f, true);
      }
    }
    aw localaw = this.a;
    int i3 = localaw.b.size();
    for (int i4 = 0; i4 < i3; i4++)
    {
      be localbe1 = (be)localaw.b.get(i4);
      if ((localbe1 != null) && (localbe1.c() >= paramInt1))
        localbe1.a(paramInt2, true);
    }
    requestLayout();
  }

  public void draw(Canvas paramCanvas)
  {
    int i1 = 1;
    super.draw(paramCanvas);
    int i2 = this.r.size();
    for (int i3 = 0; i3 < i2; i3++)
      this.r.get(i3);
    int i14;
    int i4;
    if ((this.D != null) && (!this.D.a()))
    {
      int i13 = paramCanvas.save();
      if (this.l)
      {
        i14 = getPaddingBottom();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(i14 + -getHeight(), 0.0F);
        if ((this.D == null) || (!this.D.a(paramCanvas)))
          break label460;
        i4 = i1;
        label123: paramCanvas.restoreToCount(i13);
      }
    }
    while (true)
    {
      int i12;
      label194: int i9;
      label249: int i10;
      if ((this.E != null) && (!this.E.a()))
      {
        int i11 = paramCanvas.save();
        if (this.l)
          paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        if ((this.E != null) && (this.E.a(paramCanvas)))
        {
          i12 = i1;
          i4 |= i12;
          paramCanvas.restoreToCount(i11);
        }
      }
      else
      {
        if ((this.F != null) && (!this.F.a()))
        {
          int i7 = paramCanvas.save();
          int i8 = getWidth();
          if (!this.l)
            break label472;
          i9 = getPaddingTop();
          paramCanvas.rotate(90.0F);
          paramCanvas.translate(-i9, -i8);
          if ((this.F == null) || (!this.F.a(paramCanvas)))
            break label478;
          i10 = i1;
          label289: i4 |= i10;
          paramCanvas.restoreToCount(i7);
        }
        if ((this.G != null) && (!this.G.a()))
        {
          int i5 = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!this.l)
            break label484;
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label365: u localu = this.G;
          int i6 = 0;
          if (localu != null)
          {
            boolean bool = this.G.a(paramCanvas);
            i6 = 0;
            if (bool)
              i6 = i1;
          }
          i4 |= i6;
          paramCanvas.restoreToCount(i5);
        }
        if ((i4 != 0) || (this.e == null) || (this.r.size() <= 0) || (!this.e.b()))
          break label503;
      }
      while (true)
      {
        if (i1 != 0)
          av.d(this);
        return;
        i14 = 0;
        break;
        label460: i4 = 0;
        break label123;
        i12 = 0;
        break label194;
        label472: i9 = 0;
        break label249;
        label478: i10 = 0;
        break label289;
        label484: paramCanvas.translate(-getWidth(), -getHeight());
        break label365;
        label503: i1 = i4;
      }
      i4 = 0;
    }
  }

  final void e(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = this.c.b();
    int i3 = paramInt1 + paramInt2;
    for (int i4 = 0; i4 < i2; i4++)
    {
      View localView = this.c.c(i4);
      be localbe2 = b(localView);
      if ((localbe2 != null) && (!localbe2.b()) && (localbe2.b >= paramInt1) && (localbe2.b < i3))
      {
        localbe2.a(2);
        if (p())
          localbe2.a(64);
        ((RecyclerView.LayoutParams)localView.getLayoutParams()).c = true;
      }
    }
    aw localaw = this.a;
    int i5 = paramInt1 + paramInt2;
    int i6 = localaw.b.size();
    while (i1 < i6)
    {
      be localbe1 = (be)localaw.b.get(i1);
      if (localbe1 != null)
      {
        int i7 = localbe1.c();
        if ((i7 >= paramInt1) && (i7 < i5))
          localbe1.a(2);
      }
      i1++;
    }
  }

  public View focusSearch(View paramView, int paramInt)
  {
    as.r();
    View localView = FocusFinder.getInstance().findNextFocus(this, paramView, paramInt);
    if ((localView == null) && (this.o != null))
    {
      b();
      localView = this.p.c(paramInt, this.a, this.f);
      a(false);
    }
    if (localView != null)
      return localView;
    return super.focusSearch(paramView, paramInt);
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (this.p == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    return this.p.b();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (this.p == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    return this.p.a(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.p == null)
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    return this.p.a(paramLayoutParams);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.u = true;
    this.v = false;
    if (this.p != null)
      as.i();
    this.U = false;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.e != null)
      this.e.c();
    this.v = false;
    c(0);
    h();
    this.u = false;
    if (this.p != null)
      this.p.a(this, this.a);
    removeCallbacks(this.W);
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = this.r.size();
    for (int i2 = 0; i2 < i1; i2++)
      this.r.get(i2);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = -1;
    int i2 = paramMotionEvent.getAction();
    if ((i2 == 3) || (i2 == 0))
      this.t = null;
    int i3 = this.s.size();
    int i4 = 0;
    if (i4 < i3)
    {
      at localat = (at)this.s.get(i4);
      if ((localat.a()) && (i2 != 3))
        this.t = localat;
    }
    for (int i5 = 1; ; i5 = 0)
    {
      if (i5 == 0)
        break label101;
      o();
      return true;
      i4++;
      break;
    }
    label101: boolean bool1 = this.p.e();
    boolean bool2 = this.p.f();
    if (this.J == null)
      this.J = VelocityTracker.obtain();
    this.J.addMovement(paramMotionEvent);
    int i6 = af.a(paramMotionEvent);
    int i7 = af.b(paramMotionEvent);
    label196: int i12;
    int i18;
    switch (i6)
    {
    case 4:
    default:
    case 0:
    case 5:
    case 2:
      while (true)
        if (this.H != 1)
        {
          return false;
          this.I = af.b(paramMotionEvent, 0);
          int i21 = (int)(0.5F + paramMotionEvent.getX());
          this.M = i21;
          this.K = i21;
          int i22 = (int)(0.5F + paramMotionEvent.getY());
          this.N = i22;
          this.L = i22;
          if (this.H == 2)
          {
            getParent().requestDisallowInterceptTouchEvent(true);
            c(1);
            continue;
            this.I = af.b(paramMotionEvent, i7);
            int i19 = (int)(0.5F + af.c(paramMotionEvent, i7));
            this.M = i19;
            this.K = i19;
            int i20 = (int)(0.5F + af.d(paramMotionEvent, i7));
            this.N = i20;
            this.L = i20;
            continue;
            int i8 = af.a(paramMotionEvent, this.I);
            if (i8 < 0)
            {
              new StringBuilder().append("Error processing scroll; pointer index for id ").append(this.I).append(" not found. Did any MotionEvents get skipped?").toString();
              return false;
            }
            int i9 = (int)(0.5F + af.c(paramMotionEvent, i8));
            int i10 = (int)(0.5F + af.d(paramMotionEvent, i8));
            if (this.H != 1)
            {
              int i11 = i9 - this.K;
              i12 = i10 - this.L;
              if ((!bool1) || (Math.abs(i11) <= this.O))
                break label608;
              int i16 = this.K;
              int i17 = this.O;
              if (i11 < 0)
              {
                i18 = i1;
                label486: this.M = (i16 + i18 * i17);
              }
            }
          }
        }
    case 6:
    case 1:
    case 3:
    }
    label578: label608: for (int i13 = 1; ; i13 = 0)
    {
      int i14;
      int i15;
      if ((bool2) && (Math.abs(i12) > this.O))
      {
        i14 = this.L;
        i15 = this.O;
        if (i12 >= 0)
          break label578;
      }
      while (true)
      {
        this.N = (i14 + i1 * i15);
        i13 = 1;
        if (i13 == 0)
          break;
        getParent().requestDisallowInterceptTouchEvent(true);
        c(1);
        break;
        i18 = 1;
        break label486;
        i1 = 1;
      }
      a(paramMotionEvent);
      break label196;
      this.J.clear();
      break label196;
      o();
      break label196;
      break;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b();
    c();
    a(false);
    this.v = true;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.y)
    {
      b();
      r();
      if (bb.a(this.f))
      {
        bb.b(this.f, true);
        this.y = false;
        a(false);
      }
    }
    else
    {
      if (this.o == null)
        break label115;
    }
    label115: for (this.f.d = this.o.b(); ; this.f.d = 0)
    {
      as localas = this.p;
      localas.e(paramInt1, paramInt2);
      bb.b(this.f, false);
      return;
      this.b.d();
      bb.b(this.f, false);
      break;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    this.k = ((RecyclerView.SavedState)paramParcelable);
    super.onRestoreInstanceState(this.k.getSuperState());
    if ((this.p != null) && (this.k.a != null))
      this.p.a(this.k.a);
  }

  protected Parcelable onSaveInstanceState()
  {
    RecyclerView.SavedState localSavedState = new RecyclerView.SavedState(super.onSaveInstanceState());
    if (this.k != null)
    {
      RecyclerView.SavedState.a(localSavedState, this.k);
      return localSavedState;
    }
    if (this.p != null)
    {
      localSavedState.a = this.p.d();
      return localSavedState;
    }
    localSavedState.a = null;
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
      n();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = -1;
    int i2 = paramMotionEvent.getAction();
    int i31;
    int i3;
    if (this.t != null)
    {
      if (i2 == 0)
        this.t = null;
    }
    else
    {
      if (i2 == 0)
        break label122;
      int i30 = this.s.size();
      i31 = 0;
      if (i31 >= i30)
        break label122;
      at localat = (at)this.s.get(i31);
      if (!localat.a())
        break label116;
      this.t = localat;
      i3 = 1;
    }
    while (true)
    {
      if (i3 == 0)
        break label128;
      o();
      return true;
      if ((i2 == 3) || (i2 == 1))
        this.t = null;
      i3 = 1;
      continue;
      label116: i31++;
      break;
      label122: i3 = 0;
    }
    label128: boolean bool1 = this.p.e();
    boolean bool2 = this.p.f();
    if (this.J == null)
      this.J = VelocityTracker.obtain();
    this.J.addMovement(paramMotionEvent);
    int i4 = af.a(paramMotionEvent);
    int i5 = af.b(paramMotionEvent);
    int i12;
    int i13;
    int i19;
    int i25;
    switch (i4)
    {
    case 4:
    default:
      return true;
    case 0:
      this.I = af.b(paramMotionEvent, 0);
      int i28 = (int)(0.5F + paramMotionEvent.getX());
      this.M = i28;
      this.K = i28;
      int i29 = (int)(0.5F + paramMotionEvent.getY());
      this.N = i29;
      this.L = i29;
      return true;
    case 5:
      this.I = af.b(paramMotionEvent, i5);
      int i26 = (int)(0.5F + af.c(paramMotionEvent, i5));
      this.M = i26;
      this.K = i26;
      int i27 = (int)(0.5F + af.d(paramMotionEvent, i5));
      this.N = i27;
      this.L = i27;
      return true;
    case 2:
      int i11 = af.a(paramMotionEvent, this.I);
      if (i11 < 0)
      {
        new StringBuilder().append("Error processing scroll; pointer index for id ").append(this.I).append(" not found. Did any MotionEvents get skipped?").toString();
        return false;
      }
      i12 = (int)(0.5F + af.c(paramMotionEvent, i11));
      i13 = (int)(0.5F + af.d(paramMotionEvent, i11));
      if (this.H != 1)
      {
        int i18 = i12 - this.K;
        i19 = i13 - this.L;
        if ((!bool1) || (Math.abs(i18) <= this.O))
          break label878;
        int i23 = this.K;
        int i24 = this.O;
        if (i18 >= 0)
          break label632;
        i25 = i1;
        this.M = (i23 + i25 * i24);
      }
      break;
    case 6:
    case 1:
    case 3:
    }
    label530: label600: label860: label866: label878: for (int i20 = 1; ; i20 = 0)
    {
      int i15;
      int i16;
      if ((bool2) && (Math.abs(i19) > this.O))
      {
        int i21 = this.L;
        int i22 = this.O;
        if (i19 < 0)
        {
          this.N = (i21 + i1 * i22);
          i20 = 1;
        }
      }
      else
      {
        if (i20 != 0)
        {
          getParent().requestDisallowInterceptTouchEvent(true);
          c(1);
        }
        if (this.H == 1)
        {
          int i14 = i12 - this.M;
          i15 = i13 - this.N;
          if (!bool1)
            break label643;
          i16 = -i14;
          if (!bool2)
            break label649;
        }
      }
      for (int i17 = -i15; ; i17 = 0)
      {
        f(i16, i17);
        this.M = i12;
        this.N = i13;
        return true;
        label632: i25 = 1;
        break;
        i1 = 1;
        break label530;
        i16 = 0;
        break label600;
      }
      a(paramMotionEvent);
      return true;
      this.J.computeCurrentVelocity(1000, this.Q);
      float f1;
      float f2;
      if (bool1)
      {
        f1 = -android.support.v4.view.ar.a(this.J, this.I);
        if (!bool2)
          break label860;
        f2 = -android.support.v4.view.ar.b(this.J, this.I);
        if ((f1 != 0.0F) || (f2 != 0.0F))
        {
          int i6 = (int)f1;
          int i7 = (int)f2;
          if (Math.abs(i6) < this.P)
            i6 = 0;
          if (Math.abs(i7) < this.P)
            i7 = 0;
          int i8 = Math.max(-this.Q, Math.min(i6, this.Q));
          int i9 = Math.max(-this.Q, Math.min(i7, this.Q));
          if ((i8 == 0) && (i9 == 0))
            break label866;
          this.R.a(i8, i9);
        }
      }
      for (int i10 = 1; ; i10 = 0)
      {
        if (i10 == 0)
          c(0);
        this.J.clear();
        i();
        return true;
        f1 = 0.0F;
        break;
        f2 = 0.0F;
        break label715;
      }
      o();
      return true;
    }
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    as localas = this.p;
    if ((!localas.a(this, paramView1, paramView2)) && (paramView2 != null))
    {
      this.n.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
      offsetDescendantRectToMyCoords(paramView2, this.n);
      offsetRectIntoDescendantCoords(paramView1, this.n);
      Rect localRect = this.n;
      boolean bool1 = this.v;
      boolean bool2 = false;
      if (!bool1)
        bool2 = true;
      requestChildRectangleOnScreen(paramView1, localRect, bool2);
    }
    super.requestChildFocus(paramView1, paramView2);
  }

  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return this.p.a(this, paramView, paramRect, paramBoolean);
  }

  public void requestLayout()
  {
    if (!this.w)
    {
      super.requestLayout();
      return;
    }
    this.x = true;
  }

  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (this.p == null)
      throw new IllegalStateException("Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    boolean bool1 = this.p.e();
    boolean bool2 = this.p.f();
    if ((bool1) || (bool2))
    {
      if (!bool1)
        break label60;
      if (!bool2)
        break label65;
    }
    while (true)
    {
      f(paramInt1, paramInt2);
      return;
      label60: paramInt1 = 0;
      break;
      label65: paramInt2 = 0;
    }
  }

  public void scrollTo(int paramInt1, int paramInt2)
  {
    throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
  }

  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.l)
      n();
    this.l = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.v)
      requestLayout();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView
 * JD-Core Version:    0.6.2
 */