package android.support.v7.internal.widget;

import android.content.Context;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

public abstract class o<T extends Adapter> extends ViewGroup
{
  int A = -1;
  long B = -9223372036854775808L;
  boolean C = false;
  private int a;
  private View b;
  private boolean c;
  private boolean d;
  private o<T>.s e;

  @ViewDebug.ExportedProperty(category="scrolling")
  int j = 0;
  int k;
  int l;
  long m = -9223372036854775808L;
  long n;
  boolean o = false;
  int p;
  boolean q = false;
  r r;
  q s;
  boolean t;

  @ViewDebug.ExportedProperty(category="list")
  int u = -1;
  long v = -9223372036854775808L;

  @ViewDebug.ExportedProperty(category="list")
  int w = -1;
  long x = -9223372036854775808L;

  @ViewDebug.ExportedProperty(category="list")
  int y;
  int z;

  o(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private long a(int paramInt)
  {
    Adapter localAdapter = c();
    if ((localAdapter == null) || (paramInt < 0))
      return -9223372036854775808L;
    return localAdapter.getItemId(paramInt);
  }

  private void a()
  {
    if (this.r == null)
      return;
    int i = this.u;
    if (i >= 0)
    {
      b();
      c().getItemId(i);
      return;
    }
  }

  public void a(q paramq)
  {
    this.s = paramq;
  }

  public final boolean a(View paramView, int paramInt, long paramLong)
  {
    if (this.s != null)
    {
      playSoundEffect(0);
      if (paramView != null)
        paramView.sendAccessibilityEvent(1);
      this.s.a(paramView);
      return true;
    }
    return false;
  }

  public void addView(View paramView)
  {
    throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
  }

  public void addView(View paramView, int paramInt)
  {
    throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
  }

  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
  }

  public abstract View b();

  final void b(int paramInt)
  {
    this.w = paramInt;
    this.x = a(paramInt);
  }

  public abstract T c();

  final void c(int paramInt)
  {
    this.u = paramInt;
    this.v = a(paramInt);
    if ((this.o) && (this.p == 0) && (paramInt >= 0))
    {
      this.l = paramInt;
      this.m = this.v;
    }
  }

  protected boolean canAnimate()
  {
    return (super.canAnimate()) && (this.y > 0);
  }

  @ViewDebug.CapturedViewProperty
  public final int d()
  {
    return this.u;
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    View localView = b();
    return (localView != null) && (localView.getVisibility() == 0) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent));
  }

  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }

  final void e()
  {
    boolean bool1 = true;
    Adapter localAdapter = c();
    int i;
    int i1;
    label29: boolean bool2;
    label44: boolean bool3;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      i = bool1;
      if (i != 0)
        break label150;
      i1 = bool1;
      if ((i1 == 0) || (!this.d))
        break label156;
      bool2 = bool1;
      super.setFocusableInTouchMode(bool2);
      if ((i1 == 0) || (!this.c))
        break label162;
      bool3 = bool1;
      label65: super.setFocusable(bool3);
      if (this.b != null)
      {
        if ((localAdapter != null) && (!localAdapter.isEmpty()))
          break label168;
        label91: if (!bool1)
          break label181;
        if (this.b == null)
          break label173;
        this.b.setVisibility(0);
        setVisibility(8);
      }
    }
    while (true)
    {
      if (this.t)
        onLayout(false, getLeft(), getTop(), getRight(), getBottom());
      return;
      i = 0;
      break;
      label150: i1 = 0;
      break label29;
      label156: bool2 = false;
      break label44;
      label162: bool3 = false;
      break label65;
      label168: bool1 = false;
      break label91;
      label173: setVisibility(0);
    }
    label181: if (this.b != null)
      this.b.setVisibility(8);
    setVisibility(0);
  }

  final void f()
  {
    int i = this.y;
    int i3;
    int i7;
    int i8;
    int i9;
    int i4;
    if (i > 0)
      if (this.o)
      {
        this.o = false;
        i3 = this.y;
        if (i3 != 0)
        {
          long l1 = this.m;
          int i5 = this.l;
          if (l1 != -9223372036854775808L)
          {
            int i6 = Math.max(0, i5);
            i7 = Math.min(i3 - 1, i6);
            long l2 = 100L + SystemClock.uptimeMillis();
            i8 = 0;
            Adapter localAdapter = c();
            if (localAdapter != null)
            {
              i9 = i7;
              i4 = i7;
              if (SystemClock.uptimeMillis() <= l2)
                if (localAdapter.getItemId(i4) == l1)
                {
                  label127: if ((i4 < 0) || (i4 != i4))
                    break label332;
                  c(i4);
                  i1 = 1;
                  label147: if (i1 == 0)
                  {
                    int i2 = this.u;
                    if (i2 >= i)
                      i2 = i - 1;
                    if (i2 < 0)
                      i2 = 0;
                    if ((i2 >= 0) || (i2 >= 0))
                    {
                      c(i2);
                      g();
                    }
                  }
                }
            }
          }
        }
      }
    for (int i1 = 1; ; i1 = 0)
    {
      if (i1 == 0)
      {
        this.w = -1;
        this.x = -9223372036854775808L;
        this.u = -1;
        this.v = -9223372036854775808L;
        this.o = false;
        g();
      }
      return;
      int i10;
      label240: int i11;
      if (i7 == i3 - 1)
      {
        i10 = 1;
        if (i9 != 0)
          break label292;
        i11 = 1;
      }
      while (true)
        if ((i10 == 0) || (i11 == 0))
        {
          if ((i11 != 0) || ((i8 != 0) && (i10 == 0)))
          {
            i7++;
            i4 = i7;
            i8 = 0;
            break;
            i10 = 0;
            break label240;
            label292: i11 = 0;
            continue;
          }
          if ((i10 == 0) && ((i8 != 0) || (i11 != 0)))
            break;
          i9--;
          i8 = 1;
          i4 = i9;
          break;
        }
      i4 = -1;
      break label127;
      label332: i1 = 0;
      break label147;
    }
  }

  final void g()
  {
    if ((this.w != this.A) || (this.x != this.B))
      if (this.r != null)
      {
        if ((!this.q) && (!this.C))
          break label117;
        if (this.e == null)
          this.e = new s(this, (byte)0);
        post(this.e);
      }
    while (true)
    {
      if ((this.w != -1) && (isShown()) && (!isInTouchMode()))
        sendAccessibilityEvent(4);
      this.A = this.w;
      this.B = this.x;
      return;
      label117: a();
    }
  }

  final void h()
  {
    if (getChildCount() > 0)
    {
      this.o = true;
      this.n = this.a;
      if (this.w >= 0)
      {
        View localView2 = getChildAt(this.w - this.j);
        this.m = this.v;
        this.l = this.u;
        if (localView2 != null)
          this.k = localView2.getTop();
        this.p = 0;
      }
    }
    else
    {
      return;
    }
    View localView1 = getChildAt(0);
    Adapter localAdapter = c();
    if ((this.j >= 0) && (this.j < localAdapter.getCount()));
    for (this.m = localAdapter.getItemId(this.j); ; this.m = -1L)
    {
      this.l = this.j;
      if (localView1 != null)
        this.k = localView1.getTop();
      this.p = 1;
      return;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.e);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = getHeight();
  }

  public void removeAllViews()
  {
    throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
  }

  public void removeView(View paramView)
  {
    throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
  }

  public void removeViewAt(int paramInt)
  {
    throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
  }

  public void setFocusable(boolean paramBoolean)
  {
    boolean bool1 = true;
    Adapter localAdapter = c();
    boolean bool2;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      bool2 = bool1;
      this.c = paramBoolean;
      if (!paramBoolean)
        this.d = false;
      if ((!paramBoolean) || (bool2))
        break label58;
    }
    while (true)
    {
      super.setFocusable(bool1);
      return;
      bool2 = false;
      break;
      label58: bool1 = false;
    }
  }

  public void setFocusableInTouchMode(boolean paramBoolean)
  {
    boolean bool1 = true;
    Adapter localAdapter = c();
    boolean bool2;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      bool2 = bool1;
      this.d = paramBoolean;
      if (paramBoolean)
        this.c = bool1;
      if ((!paramBoolean) || (bool2))
        break label58;
    }
    while (true)
    {
      super.setFocusableInTouchMode(bool1);
      return;
      bool2 = false;
      break;
      label58: bool1 = false;
    }
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.o
 * JD-Core Version:    0.6.2
 */