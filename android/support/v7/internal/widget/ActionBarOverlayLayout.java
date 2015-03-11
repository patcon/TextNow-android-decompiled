package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.av;
import android.support.v4.view.cd;
import android.support.v4.view.cp;
import android.support.v4.view.cq;
import android.support.v4.widget.ai;
import android.support.v7.internal.view.menu.w;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import textnow.g.b;
import textnow.g.g;

public class ActionBarOverlayLayout extends ViewGroup
  implements t
{
  static final int[] a = arrayOfInt;
  private final cp A = new cq()
  {
    public final void b(View paramAnonymousView)
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, null);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, false);
    }

    public final void c(View paramAnonymousView)
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, null);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, false);
    }
  };
  private final cp B = new cq()
  {
    public final void b(View paramAnonymousView)
    {
      ActionBarOverlayLayout.b(ActionBarOverlayLayout.this, null);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, false);
    }

    public final void c(View paramAnonymousView)
    {
      ActionBarOverlayLayout.b(ActionBarOverlayLayout.this, null);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, false);
    }
  };
  private final Runnable C = new Runnable()
  {
    public final void run()
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, av.q(ActionBarOverlayLayout.c(ActionBarOverlayLayout.this)).c(0.0F).a(ActionBarOverlayLayout.b(ActionBarOverlayLayout.this)));
      if ((ActionBarOverlayLayout.d(ActionBarOverlayLayout.this) != null) && (ActionBarOverlayLayout.d(ActionBarOverlayLayout.this).getVisibility() != 8))
        ActionBarOverlayLayout.b(ActionBarOverlayLayout.this, av.q(ActionBarOverlayLayout.d(ActionBarOverlayLayout.this)).c(0.0F).a(ActionBarOverlayLayout.e(ActionBarOverlayLayout.this)));
    }
  };
  private final Runnable D = new Runnable()
  {
    public final void run()
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, av.q(ActionBarOverlayLayout.c(ActionBarOverlayLayout.this)).c(-ActionBarOverlayLayout.c(ActionBarOverlayLayout.this).getHeight()).a(ActionBarOverlayLayout.b(ActionBarOverlayLayout.this)));
      if ((ActionBarOverlayLayout.d(ActionBarOverlayLayout.this) != null) && (ActionBarOverlayLayout.d(ActionBarOverlayLayout.this).getVisibility() != 8))
        ActionBarOverlayLayout.b(ActionBarOverlayLayout.this, av.q(ActionBarOverlayLayout.d(ActionBarOverlayLayout.this)).c(ActionBarOverlayLayout.d(ActionBarOverlayLayout.this).getHeight()).a(ActionBarOverlayLayout.e(ActionBarOverlayLayout.this)));
    }
  };
  private int b;
  private int c = 0;
  private ContentFrameLayout d;
  private ActionBarContainer e;
  private ActionBarContainer f;
  private u g;
  private Drawable h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private int n;
  private int o;
  private final Rect p = new Rect();
  private final Rect q = new Rect();
  private final Rect r = new Rect();
  private final Rect s = new Rect();
  private final Rect t = new Rect();
  private final Rect u = new Rect();
  private f v;
  private final int w = 600;
  private ai x;
  private cd y;
  private cd z;

  static
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = b.b;
    arrayOfInt[1] = 16842841;
  }

  public ActionBarOverlayLayout(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    int i1 = 1;
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(a);
    this.b = localTypedArray.getDimensionPixelSize(0, 0);
    this.h = localTypedArray.getDrawable(i1);
    if (this.h == null)
    {
      int i2 = i1;
      setWillNotDraw(i2);
      localTypedArray.recycle();
      if (paramContext.getApplicationInfo().targetSdkVersion >= 19)
        break label87;
    }
    while (true)
    {
      this.i = i1;
      this.x = ai.a(paramContext);
      return;
      int i3 = 0;
      break;
      label87: i1 = 0;
    }
  }

  private static boolean a(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    ActionBarOverlayLayout.LayoutParams localLayoutParams = (ActionBarOverlayLayout.LayoutParams)paramView.getLayoutParams();
    int i1 = localLayoutParams.leftMargin;
    int i2 = paramRect.left;
    boolean bool = false;
    if (i1 != i2)
    {
      localLayoutParams.leftMargin = paramRect.left;
      bool = true;
    }
    if ((paramBoolean2) && (localLayoutParams.topMargin != paramRect.top))
    {
      localLayoutParams.topMargin = paramRect.top;
      bool = true;
    }
    if (localLayoutParams.rightMargin != paramRect.right)
    {
      localLayoutParams.rightMargin = paramRect.right;
      bool = true;
    }
    if ((paramBoolean3) && (localLayoutParams.bottomMargin != paramRect.bottom))
    {
      localLayoutParams.bottomMargin = paramRect.bottom;
      return true;
    }
    return bool;
  }

  public static void b()
  {
  }

  private void b(int paramInt)
  {
    k();
    int i1 = this.f.getHeight();
    int i2 = Math.max(0, Math.min(paramInt, i1));
    av.b(this.f, -i2);
    if ((this.e != null) && (this.e.getVisibility() != 8))
    {
      int i3 = (int)(i2 / i1 * this.e.getHeight());
      av.b(this.e, i3);
    }
  }

  private void j()
  {
    View localView;
    if (this.d == null)
    {
      this.d = ((ContentFrameLayout)findViewById(g.b));
      this.f = ((ActionBarContainer)findViewById(g.c));
      localView = findViewById(g.a);
      if (!(localView instanceof u))
        break label75;
    }
    for (u localu = (u)localView; ; localu = ((Toolbar)localView).o())
    {
      this.g = localu;
      this.e = ((ActionBarContainer)findViewById(g.A));
      return;
      label75: if (!(localView instanceof Toolbar))
        break;
    }
    throw new IllegalStateException("Can't make a decor toolbar out of " + localView.getClass().getSimpleName());
  }

  private void k()
  {
    removeCallbacks(this.C);
    removeCallbacks(this.D);
    if (this.y != null)
      this.y.a();
    if (this.z != null)
      this.z.a();
  }

  public final void a(int paramInt)
  {
    boolean bool = true;
    j();
    switch (paramInt)
    {
    default:
      return;
    case 2:
      return;
    case 5:
      return;
    case 9:
    }
    this.j = bool;
    if (getContext().getApplicationInfo().targetSdkVersion < 19);
    while (true)
    {
      this.i = bool;
      return;
      bool = false;
    }
  }

  public final void a(f paramf)
  {
    this.v = paramf;
    if (getWindowToken() != null)
    {
      this.v.c(this.c);
      if (this.o != 0)
      {
        onWindowSystemUiVisibilityChanged(this.o);
        av.t(this);
      }
    }
  }

  public final void a(Menu paramMenu, w paramw)
  {
    j();
    this.g.a(paramMenu, paramw);
  }

  public final void a(CharSequence paramCharSequence)
  {
    j();
    this.g.a(paramCharSequence);
  }

  public final void a(textnow.i.a parama)
  {
    j();
    this.g.a(parama);
  }

  public final void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  public final boolean a()
  {
    return this.j;
  }

  public final void b(boolean paramBoolean)
  {
    if (paramBoolean != this.l)
    {
      this.l = paramBoolean;
      if (!paramBoolean)
      {
        if (textnow.h.a.a())
          stopNestedScroll();
        k();
        b(0);
      }
    }
  }

  public final boolean c()
  {
    j();
    return this.g.e();
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ActionBarOverlayLayout.LayoutParams;
  }

  public final boolean d()
  {
    j();
    return this.g.f();
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((this.h != null) && (!this.i))
      if (this.f.getVisibility() != 0)
        break label82;
    label82: for (int i1 = (int)(0.5F + (this.f.getBottom() + av.n(this.f))); ; i1 = 0)
    {
      this.h.setBounds(0, i1, getWidth(), i1 + this.h.getIntrinsicHeight());
      this.h.draw(paramCanvas);
      return;
    }
  }

  public final boolean e()
  {
    j();
    return this.g.g();
  }

  public final boolean f()
  {
    j();
    return this.g.h();
  }

  protected boolean fitSystemWindows(Rect paramRect)
  {
    j();
    av.s(this);
    boolean bool = a(this.f, paramRect, true, true, false, true);
    if (this.e != null)
      bool |= a(this.e, paramRect, true, false, true, true);
    this.s.set(paramRect);
    ar.a(this, this.s, this.p);
    if (!this.q.equals(this.p))
    {
      this.q.set(this.p);
      bool = true;
    }
    if (bool)
      requestLayout();
    return true;
  }

  public final boolean g()
  {
    j();
    return this.g.i();
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new ActionBarOverlayLayout.LayoutParams(paramLayoutParams);
  }

  public final void h()
  {
    j();
    this.g.j();
  }

  public final void i()
  {
    j();
    this.g.k();
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    a(getContext());
    av.t(this);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    k();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = getPaddingLeft();
    getPaddingRight();
    int i3 = getPaddingTop();
    int i4 = paramInt4 - paramInt2 - getPaddingBottom();
    int i5 = 0;
    if (i5 < i1)
    {
      View localView = getChildAt(i5);
      ActionBarOverlayLayout.LayoutParams localLayoutParams;
      int i6;
      int i7;
      int i8;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (ActionBarOverlayLayout.LayoutParams)localView.getLayoutParams();
        i6 = localView.getMeasuredWidth();
        i7 = localView.getMeasuredHeight();
        i8 = i2 + localLayoutParams.leftMargin;
        if (localView != this.e)
          break label143;
      }
      label143: for (int i9 = i4 - i7 - localLayoutParams.bottomMargin; ; i9 = i3 + localLayoutParams.topMargin)
      {
        localView.layout(i8, i9, i6 + i8, i7 + i9);
        i5++;
        break;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    j();
    measureChildWithMargins(this.f, paramInt1, 0, paramInt2, 0);
    ActionBarOverlayLayout.LayoutParams localLayoutParams1 = (ActionBarOverlayLayout.LayoutParams)this.f.getLayoutParams();
    int i1 = Math.max(0, this.f.getMeasuredWidth() + localLayoutParams1.leftMargin + localLayoutParams1.rightMargin);
    int i2 = Math.max(0, this.f.getMeasuredHeight() + localLayoutParams1.topMargin + localLayoutParams1.bottomMargin);
    int i3 = ar.a(0, av.l(this.f));
    int i15;
    int i4;
    int i5;
    if (this.e != null)
    {
      measureChildWithMargins(this.e, paramInt1, 0, paramInt2, 0);
      ActionBarOverlayLayout.LayoutParams localLayoutParams3 = (ActionBarOverlayLayout.LayoutParams)this.e.getLayoutParams();
      int i14 = Math.max(i1, this.e.getMeasuredWidth() + localLayoutParams3.leftMargin + localLayoutParams3.rightMargin);
      i15 = Math.max(i2, this.e.getMeasuredHeight() + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin);
      i4 = ar.a(i3, av.l(this.e));
      i5 = i14;
    }
    for (int i6 = i15; ; i6 = i2)
    {
      int i7;
      int i8;
      if ((0x100 & av.s(this)) != 0)
      {
        i7 = 1;
        if (i7 == 0)
          break label532;
        i8 = this.b;
        if ((this.k) && (this.f.a() != null))
          i8 += this.b;
      }
      while (true)
      {
        label242: this.r.set(this.p);
        this.t.set(this.s);
        Rect localRect4;
        if ((!this.j) && (i7 == 0))
        {
          Rect localRect3 = this.r;
          localRect3.top = (i8 + localRect3.top);
          localRect4 = this.r;
        }
        label532: Rect localRect2;
        for (localRect4.bottom = (0 + localRect4.bottom); ; localRect2.bottom = (0 + localRect2.bottom))
        {
          a(this.d, this.r, true, true, true, true);
          if (!this.u.equals(this.t))
          {
            this.u.set(this.t);
            this.d.a(this.t);
          }
          measureChildWithMargins(this.d, paramInt1, 0, paramInt2, 0);
          ActionBarOverlayLayout.LayoutParams localLayoutParams2 = (ActionBarOverlayLayout.LayoutParams)this.d.getLayoutParams();
          int i9 = Math.max(i5, this.d.getMeasuredWidth() + localLayoutParams2.leftMargin + localLayoutParams2.rightMargin);
          int i10 = Math.max(i6, this.d.getMeasuredHeight() + localLayoutParams2.topMargin + localLayoutParams2.bottomMargin);
          int i11 = ar.a(i4, av.l(this.d));
          int i12 = i9 + (getPaddingLeft() + getPaddingRight());
          int i13 = Math.max(i10 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
          setMeasuredDimension(av.a(Math.max(i12, getSuggestedMinimumWidth()), paramInt1, i11), av.a(i13, paramInt2, i11 << 16));
          return;
          i7 = 0;
          break;
          if (this.f.getVisibility() == 8)
            break label596;
          i8 = this.f.getMeasuredHeight();
          break label242;
          Rect localRect1 = this.t;
          localRect1.top = (i8 + localRect1.top);
          localRect2 = this.t;
        }
        label596: i8 = 0;
      }
      i4 = i3;
      i5 = i1;
    }
  }

  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((!this.l) || (!paramBoolean))
      return false;
    this.x.a(0, 0, 0, (int)paramFloat2, 0, 0, -2147483648, 2147483647);
    int i1 = this.x.e();
    int i2 = this.f.getHeight();
    int i3 = 0;
    if (i1 > i2)
      i3 = 1;
    if (i3 != 0)
    {
      k();
      this.D.run();
    }
    while (true)
    {
      this.m = true;
      return true;
      k();
      this.C.run();
    }
  }

  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.n = (paramInt2 + this.n);
    b(this.n);
  }

  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    super.onNestedScrollAccepted(paramView1, paramView2, paramInt);
    if (this.f != null);
    for (int i1 = -(int)av.n(this.f); ; i1 = 0)
    {
      this.n = i1;
      k();
      if (this.v != null)
        this.v.i();
      return;
    }
  }

  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) == 0) || (this.f.getVisibility() != 0))
      return false;
    return this.l;
  }

  public void onStopNestedScroll(View paramView)
  {
    super.onStopNestedScroll(paramView);
    if ((this.l) && (!this.m))
    {
      if (this.n > this.f.getHeight())
        break label62;
      k();
      postDelayed(this.C, 600L);
    }
    while (true)
    {
      if (this.v != null);
      return;
      label62: k();
      postDelayed(this.D, 600L);
    }
  }

  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    boolean bool1 = true;
    if (Build.VERSION.SDK_INT >= 16)
      super.onWindowSystemUiVisibilityChanged(paramInt);
    j();
    int i1 = paramInt ^ this.o;
    this.o = paramInt;
    boolean bool2;
    boolean bool3;
    if ((paramInt & 0x4) == 0)
    {
      bool2 = bool1;
      if ((paramInt & 0x100) == 0)
        break label122;
      bool3 = bool1;
      label51: if (this.v != null)
      {
        f localf = this.v;
        if (bool3)
          break label128;
        label69: localf.g(bool1);
        if ((!bool2) && (bool3))
          break label133;
        this.v.g();
      }
    }
    while (true)
    {
      if (((i1 & 0x100) != 0) && (this.v != null))
        av.t(this);
      return;
      bool2 = false;
      break;
      label122: bool3 = false;
      break label51;
      label128: bool1 = false;
      break label69;
      label133: this.v.h();
    }
  }

  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.c = paramInt;
    if (this.v != null)
      this.v.c(paramInt);
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarOverlayLayout
 * JD-Core Version:    0.6.2
 */