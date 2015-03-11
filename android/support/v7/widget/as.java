package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.av;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import textnow.f.a;
import textnow.f.e;
import textnow.f.m;
import textnow.f.x;

public abstract class as
{
  private boolean a = false;
  n p;
  RecyclerView q;
  az r;

  public static int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = 1073741824;
    int j = Math.max(0, paramInt1 - paramInt2);
    if (paramBoolean)
      if (paramInt3 < 0);
    while (true)
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt3, i);
      i = 0;
      paramInt3 = 0;
      continue;
      if (paramInt3 < 0)
        if (paramInt3 == -1)
        {
          paramInt3 = j;
        }
        else if (paramInt3 == -2)
        {
          i = -2147483648;
          paramInt3 = j;
        }
        else
        {
          i = 0;
          paramInt3 = 0;
        }
    }
  }

  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b;
    paramView.layout(paramInt1 + localRect.left, paramInt2 + localRect.top, paramInt3 - localRect.right, paramInt4 - localRect.bottom);
  }

  private void a(View paramView, int paramInt, boolean paramBoolean)
  {
    be localbe1 = RecyclerView.b(paramView);
    RecyclerView.LayoutParams localLayoutParams1;
    if ((paramBoolean) || (localbe1.l()))
    {
      RecyclerView.c(this.q, paramView);
      localLayoutParams1 = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      if ((!localbe1.f()) && (!localbe1.d()))
        break label120;
      if (!localbe1.d())
        break label112;
      localbe1.e();
      label64: this.p.a(paramView, paramInt, paramView.getLayoutParams(), false);
    }
    while (true)
    {
      if (localLayoutParams1.d)
      {
        localbe1.a.invalidate();
        localLayoutParams1.d = false;
      }
      return;
      RecyclerView.d(this.q, paramView);
      break;
      label112: localbe1.g();
      break label64;
      label120: if (paramView.getParent() == this.q)
      {
        n localn = this.p;
        int i = localn.a.a(paramView);
        int j;
        if (i == -1)
          j = -1;
        while (true)
        {
          if (paramInt == -1)
            paramInt = this.p.a();
          if (j != -1)
            break;
          throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.q.indexOfChild(paramView));
          if (localn.b.b(i))
            j = -1;
          else
            j = i - localn.b.d(i);
        }
        if (j != paramInt)
        {
          as localas = RecyclerView.d(this.q);
          View localView = localas.b(j);
          if (localView == null)
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j);
          localas.g(j);
          RecyclerView.LayoutParams localLayoutParams2 = (RecyclerView.LayoutParams)localView.getLayoutParams();
          be localbe2 = RecyclerView.b(localView);
          if (localbe2.l())
            RecyclerView.c(localas.q, localView);
          while (true)
          {
            localas.p.a(localView, paramInt, localLayoutParams2, localbe2.l());
            break;
            RecyclerView.d(localas.q, localView);
          }
        }
      }
      else
      {
        this.p.a(paramView, paramInt, false);
        localLayoutParams1.c = true;
        if ((this.r != null) && (this.r.c()))
          this.r.a(paramView);
      }
    }
  }

  public static int c(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).e();
  }

  public static int d(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b;
    return paramView.getMeasuredWidth() + localRect.left + localRect.right;
  }

  public static int e(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b;
    return paramView.getMeasuredHeight() + localRect.top + localRect.bottom;
  }

  private void f(int paramInt)
  {
    if (b(paramInt) != null)
      this.p.a(paramInt);
  }

  private void g(int paramInt)
  {
    b(paramInt);
    this.p.d(paramInt);
  }

  public static void i()
  {
  }

  public static View r()
  {
    return null;
  }

  public static boolean s()
  {
    return false;
  }

  public int a(int paramInt, aw paramaw, bb parambb)
  {
    return 0;
  }

  public int a(aw paramaw, bb parambb)
  {
    if ((this.q == null) || (RecyclerView.f(this.q) == null));
    while (!f())
      return 1;
    return RecyclerView.f(this.q).b();
  }

  public int a(bb parambb)
  {
    return 0;
  }

  public RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new RecyclerView.LayoutParams(paramContext, paramAttributeSet);
  }

  public RecyclerView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof RecyclerView.LayoutParams))
      return new RecyclerView.LayoutParams((RecyclerView.LayoutParams)paramLayoutParams);
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new RecyclerView.LayoutParams(paramLayoutParams);
  }

  public View a(int paramInt)
  {
    int i = k();
    for (int j = 0; j < i; j++)
    {
      View localView = b(j);
      be localbe = RecyclerView.b(localView);
      if ((localbe != null) && (localbe.c() == paramInt) && (!localbe.b()) && ((this.q.f.a()) || (!localbe.l())))
        return localView;
    }
    return null;
  }

  public void a()
  {
  }

  public void a(int paramInt1, int paramInt2)
  {
  }

  public final void a(int paramInt, aw paramaw)
  {
    View localView = b(paramInt);
    f(paramInt);
    paramaw.a(localView);
  }

  public void a(Parcelable paramParcelable)
  {
  }

  public void a(RecyclerView paramRecyclerView, aw paramaw)
  {
  }

  public final void a(aw paramaw)
  {
    int i = -1 + k();
    if (i >= 0)
    {
      View localView = b(i);
      be localbe = RecyclerView.b(localView);
      if (!localbe.b())
      {
        if ((!localbe.h()) || (localbe.l()) || (localbe.j()) || (RecyclerView.f(this.q).c()))
          break label85;
        f(i);
        paramaw.a(localbe);
      }
      while (true)
      {
        i--;
        break;
        label85: g(i);
        paramaw.c(localView);
      }
    }
  }

  public void a(aw paramaw, bb parambb, View paramView, e parame)
  {
    int i;
    if (f())
    {
      i = c(paramView);
      if (!e())
        break label49;
    }
    label49: for (int j = c(paramView); ; j = 0)
    {
      parame.b(textnow.f.n.a(i, 1, j, 1, false, false));
      return;
      i = 0;
      break;
    }
  }

  final void a(aw paramaw, boolean paramBoolean)
  {
    int i = paramaw.a.size();
    for (int j = 0; j < i; j++)
    {
      View localView = ((be)paramaw.a.get(j)).a;
      if (!RecyclerView.b(localView).b())
      {
        if (paramBoolean)
          RecyclerView.c(this.q, localView, false);
        paramaw.b(localView);
      }
    }
    paramaw.a.clear();
    if ((paramBoolean) && (i > 0))
      this.q.invalidate();
  }

  public final void a(View paramView)
  {
    a(paramView, -1, true);
  }

  public final void a(View paramView, int paramInt)
  {
    a(paramView, paramInt, true);
  }

  public final void a(View paramView, aw paramaw)
  {
    n localn = this.p;
    int i = localn.a.a(paramView);
    if (i >= 0)
    {
      localn.a.a(i);
      if (localn.b.c(i))
        localn.c.remove(paramView);
    }
    paramaw.a(paramView);
  }

  final void a(View paramView, e parame)
  {
    a(this.q.a, this.q.f, paramView, parame);
  }

  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = 1;
    x localx = a.a(paramAccessibilityEvent);
    if ((this.q == null) || (localx == null))
      return;
    if ((av.b(this.q, i)) || (av.b(this.q, -1)) || (av.a(this.q, -1)) || (av.a(this.q, i)));
    while (true)
    {
      localx.a(i);
      if (RecyclerView.f(this.q) == null)
        break;
      localx.a(RecyclerView.f(this.q).b());
      return;
      int j = 0;
    }
  }

  public void a(String paramString)
  {
    if (this.q != null)
      this.q.a(paramString);
  }

  final void a(e parame)
  {
    aw localaw = this.q.a;
    bb localbb = this.q.f;
    parame.b(RecyclerView.class.getName());
    if ((av.b(this.q, -1)) || (av.a(this.q, -1)))
    {
      parame.a(8192);
      parame.i(true);
    }
    if ((av.b(this.q, 1)) || (av.a(this.q, 1)))
    {
      parame.a(4096);
      parame.i(true);
    }
    parame.a(m.a(a(localaw, localbb), b(localaw, localbb), false, 0));
  }

  final boolean a(int paramInt, Bundle paramBundle)
  {
    if (this.q == null);
    int k;
    int j;
    do
    {
      return false;
      switch (paramInt)
      {
      default:
        k = 0;
        j = 0;
      case 8192:
      case 4096:
      }
    }
    while ((j == 0) && (k == 0));
    this.q.scrollBy(k, j);
    return true;
    if (av.b(this.q, -1));
    for (int i = -(m() - o() - q()); ; i = 0)
    {
      if (av.a(this.q, -1))
      {
        int n = -(l() - n() - p());
        j = i;
        k = n;
        break;
        if (!av.b(this.q, 1))
          break label223;
      }
      label223: for (i = m() - o() - q(); ; i = 0)
      {
        if (av.a(this.q, 1))
        {
          int m = l() - n() - p();
          j = i;
          k = m;
          break;
        }
        j = i;
        k = 0;
        break;
      }
    }
  }

  public boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams != null;
  }

  public final boolean a(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean)
  {
    int i = n();
    int j = o();
    int k = l() - p();
    int m = m() - q();
    int n = paramView.getLeft() + paramRect.left;
    int i1 = paramView.getTop() + paramRect.top;
    int i2 = n + paramRect.right;
    int i3 = i1 + paramRect.bottom;
    int i4 = Math.min(0, n - i);
    int i5 = Math.min(0, i1 - j);
    int i6 = Math.max(0, i2 - k);
    int i7 = Math.max(0, i3 - m);
    label135: int i8;
    if (av.h(paramRecyclerView) == 1)
      if (i6 != 0)
      {
        i4 = i6;
        if (i5 == 0)
          break label188;
        i8 = i5;
        label144: if ((i4 == 0) && (i8 == 0))
          break label206;
        if (!paramBoolean)
          break label195;
        paramRecyclerView.scrollBy(i4, i8);
      }
    while (true)
    {
      return true;
      i6 = i4;
      break;
      if (i4 != 0)
        break label135;
      i4 = i6;
      break label135;
      label188: i8 = i7;
      break label144;
      label195: paramRecyclerView.a(i4, i8);
    }
    label206: return false;
  }

  public final boolean a(RecyclerView paramRecyclerView, View paramView1, View paramView2)
  {
    return false;
  }

  final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return false;
  }

  public int b(int paramInt, aw paramaw, bb parambb)
  {
    return 0;
  }

  public int b(aw paramaw, bb parambb)
  {
    if ((this.q == null) || (RecyclerView.f(this.q) == null));
    while (!e())
      return 1;
    return RecyclerView.f(this.q).b();
  }

  public int b(bb parambb)
  {
    return 0;
  }

  public abstract RecyclerView.LayoutParams b();

  public final View b(int paramInt)
  {
    if (this.p != null)
      return this.p.b(paramInt);
    return null;
  }

  public void b(int paramInt1, int paramInt2)
  {
  }

  public final void b(View paramView)
  {
    a(paramView, -1, false);
  }

  public final void b(View paramView, int paramInt)
  {
    a(paramView, paramInt, false);
  }

  public int c(bb parambb)
  {
    return 0;
  }

  public View c(int paramInt, aw paramaw, bb parambb)
  {
    return null;
  }

  public void c(int paramInt)
  {
    if (this.q != null)
      this.q.b(paramInt);
  }

  public void c(int paramInt1, int paramInt2)
  {
  }

  public void c(aw paramaw, bb parambb)
  {
  }

  public boolean c()
  {
    return false;
  }

  public int d(bb parambb)
  {
    return 0;
  }

  public Parcelable d()
  {
    return null;
  }

  public void d(int paramInt)
  {
    if (this.q != null)
      this.q.a(paramInt);
  }

  public void d(int paramInt1, int paramInt2)
  {
  }

  public int e(bb parambb)
  {
    return 0;
  }

  public void e(int paramInt)
  {
  }

  public final void e(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    switch (i)
    {
    default:
      k = av.o(this.q);
    case 1073741824:
    case -2147483648:
    }
    switch (j)
    {
    default:
      m = av.p(this.q);
    case 1073741824:
    case -2147483648:
    }
    RecyclerView.b(this.q, k, m);
  }

  public boolean e()
  {
    return false;
  }

  public int f(bb parambb)
  {
    return 0;
  }

  public final int f(View paramView)
  {
    return paramView.getLeft() - ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.left;
  }

  public boolean f()
  {
    return false;
  }

  public final int g(View paramView)
  {
    return paramView.getTop() - ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.top;
  }

  public final int h(View paramView)
  {
    return paramView.getRight() + ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.right;
  }

  public final void h()
  {
    if (this.q != null)
      this.q.requestLayout();
  }

  public final int i(View paramView)
  {
    return paramView.getBottom() + ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.bottom;
  }

  public final boolean j()
  {
    return (this.r != null) && (this.r.c());
  }

  public final int k()
  {
    if (this.p != null)
      return this.p.a();
    return 0;
  }

  public final int l()
  {
    if (this.q != null)
      return this.q.getWidth();
    return 0;
  }

  public final int m()
  {
    if (this.q != null)
      return this.q.getHeight();
    return 0;
  }

  public final int n()
  {
    if (this.q != null)
      return this.q.getPaddingLeft();
    return 0;
  }

  public final int o()
  {
    if (this.q != null)
      return this.q.getPaddingTop();
    return 0;
  }

  public final int p()
  {
    if (this.q != null)
      return this.q.getPaddingRight();
    return 0;
  }

  public final int q()
  {
    if (this.q != null)
      return this.q.getPaddingBottom();
    return 0;
  }

  final void t()
  {
    if (this.r != null)
      this.r.a();
  }

  public final void u()
  {
    this.a = true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.as
 * JD-Core Version:    0.6.2
 */