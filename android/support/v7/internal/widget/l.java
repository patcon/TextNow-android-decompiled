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

abstract class l<T extends Adapter> extends ViewGroup
{
  int A;
  int B = -1;
  long C = -9223372036854775808L;
  boolean D = false;
  private int a;
  private View b;
  private boolean c;
  private boolean d;
  private l<T>.q e;

  @ViewDebug.ExportedProperty(category="scrolling")
  int k = 0;
  int l;
  int m;
  long n = -9223372036854775808L;
  long o;
  boolean p = false;
  int q;
  boolean r = false;
  p s;
  n t;
  boolean u;

  @ViewDebug.ExportedProperty(category="list")
  int v = -1;
  long w = -9223372036854775808L;

  @ViewDebug.ExportedProperty(category="list")
  int x = -1;
  long y = -9223372036854775808L;

  @ViewDebug.ExportedProperty(category="list")
  int z;

  l(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
    if (this.s == null)
      return;
    int i = this.v;
    if (i >= 0)
    {
      b();
      this.s.a(i, c().getItemId(i));
      return;
    }
  }

  public void a(n paramn)
  {
    this.t = paramn;
  }

  public final boolean a(View paramView, int paramInt, long paramLong)
  {
    if (this.t != null)
    {
      playSoundEffect(0);
      if (paramView != null)
        paramView.sendAccessibilityEvent(1);
      this.t.a(paramView, paramInt);
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
    this.x = paramInt;
    this.y = a(paramInt);
  }

  public abstract T c();

  final void c(int paramInt)
  {
    this.v = paramInt;
    this.w = a(paramInt);
    if ((this.p) && (this.q == 0) && (paramInt >= 0))
    {
      this.m = paramInt;
      this.n = this.w;
    }
  }

  protected boolean canAnimate()
  {
    return (super.canAnimate()) && (this.z > 0);
  }

  @ViewDebug.CapturedViewProperty
  public final int d()
  {
    return this.v;
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
    int j;
    label29: boolean bool2;
    label44: boolean bool3;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      i = bool1;
      if (i != 0)
        break label150;
      j = bool1;
      if ((j == 0) || (!this.d))
        break label156;
      bool2 = bool1;
      super.setFocusableInTouchMode(bool2);
      if ((j == 0) || (!this.c))
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
      if (this.u)
        onLayout(false, getLeft(), getTop(), getRight(), getBottom());
      return;
      i = 0;
      break;
      label150: j = 0;
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
    int i = this.z;
    int i2;
    int i6;
    int i7;
    int i8;
    int i3;
    if (i > 0)
      if (this.p)
      {
        this.p = false;
        i2 = this.z;
        if (i2 != 0)
        {
          long l1 = this.n;
          int i4 = this.m;
          if (l1 != -9223372036854775808L)
          {
            int i5 = Math.max(0, i4);
            i6 = Math.min(i2 - 1, i5);
            long l2 = 100L + SystemClock.uptimeMillis();
            i7 = 0;
            Adapter localAdapter = c();
            if (localAdapter != null)
            {
              i8 = i6;
              i3 = i6;
              if (SystemClock.uptimeMillis() <= l2)
                if (localAdapter.getItemId(i3) == l1)
                {
                  label127: if ((i3 < 0) || (i3 != i3))
                    break label332;
                  c(i3);
                  j = 1;
                  label147: if (j == 0)
                  {
                    int i1 = this.v;
                    if (i1 >= i)
                      i1 = i - 1;
                    if (i1 < 0)
                      i1 = 0;
                    if ((i1 >= 0) || (i1 >= 0))
                    {
                      c(i1);
                      g();
                    }
                  }
                }
            }
          }
        }
      }
    for (int j = 1; ; j = 0)
    {
      if (j == 0)
      {
        this.x = -1;
        this.y = -9223372036854775808L;
        this.v = -1;
        this.w = -9223372036854775808L;
        this.p = false;
        g();
      }
      return;
      int i9;
      label240: int i10;
      if (i6 == i2 - 1)
      {
        i9 = 1;
        if (i8 != 0)
          break label292;
        i10 = 1;
      }
      while (true)
        if ((i9 == 0) || (i10 == 0))
        {
          if ((i10 != 0) || ((i7 != 0) && (i9 == 0)))
          {
            i6++;
            i3 = i6;
            i7 = 0;
            break;
            i9 = 0;
            break label240;
            label292: i10 = 0;
            continue;
          }
          if ((i9 == 0) && ((i7 != 0) || (i10 != 0)))
            break;
          i8--;
          i7 = 1;
          i3 = i8;
          break;
        }
      i3 = -1;
      break label127;
      label332: j = 0;
      break label147;
    }
  }

  final void g()
  {
    if ((this.x != this.B) || (this.y != this.C))
      if (this.s != null)
      {
        if ((!this.r) && (!this.D))
          break label117;
        if (this.e == null)
          this.e = new q(this, (byte)0);
        post(this.e);
      }
    while (true)
    {
      if ((this.x != -1) && (isShown()) && (!isInTouchMode()))
        sendAccessibilityEvent(4);
      this.B = this.x;
      this.C = this.y;
      return;
      label117: a();
    }
  }

  final void h()
  {
    if (getChildCount() > 0)
    {
      this.p = true;
      this.o = this.a;
      if (this.x >= 0)
      {
        View localView2 = getChildAt(this.x - this.k);
        this.n = this.w;
        this.m = this.v;
        if (localView2 != null)
          this.l = localView2.getTop();
        this.q = 0;
      }
    }
    else
    {
      return;
    }
    View localView1 = getChildAt(0);
    Adapter localAdapter = c();
    if ((this.k >= 0) && (this.k < localAdapter.getCount()));
    for (this.n = localAdapter.getItemId(this.k); ; this.n = -1L)
    {
      this.m = this.k;
      if (localView1 != null)
        this.l = localView1.getTop();
      this.q = 1;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.l
 * JD-Core Version:    0.6.2
 */