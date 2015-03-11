package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;
import textnow.f.e;
import textnow.f.n;

public final class GridLayoutManager extends LinearLayoutManager
{
  static final int a = View.MeasureSpec.makeMeasureSpec(0, 0);
  int b;
  int c;
  View[] d;
  final SparseIntArray e;
  final SparseIntArray f;
  u g;
  final Rect h;

  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0));
    int i;
    do
    {
      return paramInt1;
      i = View.MeasureSpec.getMode(paramInt1);
    }
    while ((i != -2147483648) && (i != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3, i);
  }

  private int a(aw paramaw, bb parambb, int paramInt)
  {
    if (!parambb.a())
      return this.g.b(paramInt, this.b);
    int i = paramaw.a(paramInt);
    if (i == -1)
    {
      new StringBuilder().append("Cannot find span size for pre layout position. ").append(paramInt).toString();
      return 0;
    }
    return this.g.b(i, this.b);
  }

  private void a(aw paramaw, bb parambb, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j;
    int i;
    int m;
    int k;
    label35: int n;
    int i1;
    label43: GridLayoutManager.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      j = 1;
      i = 0;
      if ((this.i != 1) || (!g()))
        break label152;
      m = paramInt2 - 1;
      k = -1;
      n = m;
      i1 = i;
      if (i1 == paramInt1)
        return;
      View localView = this.d[i1];
      localLayoutParams = (GridLayoutManager.LayoutParams)localView.getLayoutParams();
      GridLayoutManager.LayoutParams.a(localLayoutParams, b(paramaw, parambb, c(localView)));
      if ((k != -1) || (GridLayoutManager.LayoutParams.b(localLayoutParams) <= 1))
        break label161;
      GridLayoutManager.LayoutParams.b(localLayoutParams, n - (-1 + GridLayoutManager.LayoutParams.b(localLayoutParams)));
    }
    while (true)
    {
      n += k * GridLayoutManager.LayoutParams.b(localLayoutParams);
      i1 += j;
      break label43;
      i = paramInt1 - 1;
      j = -1;
      paramInt1 = -1;
      break;
      label152: k = 1;
      m = 0;
      break label35;
      label161: GridLayoutManager.LayoutParams.b(localLayoutParams, n);
    }
  }

  private void a(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = this.h;
    if (this.q == null)
      localRect.set(0, 0, 0, 0);
    while (true)
    {
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      paramView.measure(a(paramInt1, localLayoutParams.leftMargin + this.h.left, localLayoutParams.rightMargin + this.h.right), a(paramInt2, localLayoutParams.topMargin + this.h.top, localLayoutParams.bottomMargin + this.h.bottom));
      return;
      localRect.set(this.q.d(paramView));
    }
  }

  private int b(aw paramaw, bb parambb, int paramInt)
  {
    int i;
    if (!parambb.a())
      i = this.g.a();
    do
    {
      return i;
      i = this.e.get(paramInt, -1);
    }
    while (i != -1);
    if (paramaw.a(paramInt) == -1)
    {
      new StringBuilder().append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(paramInt).toString();
      return 1;
    }
    return this.g.a();
  }

  private static int f(int paramInt)
  {
    if (paramInt < 0)
      return a;
    return View.MeasureSpec.makeMeasureSpec(paramInt, 1073741824);
  }

  public final int a(aw paramaw, bb parambb)
  {
    if (this.i == 0)
      return this.b;
    if (parambb.e() <= 0)
      return 0;
    return a(paramaw, parambb, -1 + parambb.e());
  }

  public final RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new GridLayoutManager.LayoutParams(paramContext, paramAttributeSet);
  }

  public final RecyclerView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new GridLayoutManager.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new GridLayoutManager.LayoutParams(paramLayoutParams);
  }

  public final void a()
  {
    this.g.a.clear();
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.g.a.clear();
  }

  final void a(aw paramaw, bb parambb, y paramy, x paramx)
  {
    boolean bool;
    int i;
    int j;
    int k;
    int i21;
    int i22;
    if (paramy.e == 1)
    {
      bool = true;
      i = this.b;
      j = 0;
      k = 0;
      if (!bool)
      {
        i21 = paramy.d;
        if (parambb.a())
          break label179;
        i22 = this.g.a(i21, this.b);
        label56: i = i22 + b(paramaw, parambb, paramy.d);
      }
    }
    while (true)
    {
      if ((j >= this.b) || (!paramy.a(parambb)) || (i <= 0))
        break label302;
      int i19 = paramy.d;
      int i20 = b(paramaw, parambb, i19);
      if (i20 > this.b)
      {
        throw new IllegalArgumentException("Item at position " + i19 + " requires " + i20 + " spans but GridLayoutManager has only " + this.b + " spans.");
        bool = false;
        break;
        label179: i22 = this.f.get(i21, -1);
        if (i22 != -1)
          break label56;
        int i23 = paramaw.a(i21);
        if (i23 == -1)
        {
          new StringBuilder().append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i21).toString();
          i22 = 0;
          break label56;
        }
        i22 = this.g.a(i23, this.b);
        break label56;
      }
      i -= i20;
      if (i < 0)
        break label302;
      View localView4 = paramy.a(paramaw);
      if (localView4 == null)
        break label302;
      k += i20;
      this.d[j] = localView4;
      j++;
    }
    label302: if (j == 0)
    {
      paramx.b = true;
      return;
    }
    a(paramaw, parambb, j, k, bool);
    int m = 0;
    int n = 0;
    View localView3;
    label366: int i17;
    GridLayoutManager.LayoutParams localLayoutParams2;
    label423: int i18;
    if (m < j)
    {
      localView3 = this.d[m];
      if (paramy.j == null)
        if (bool)
        {
          b(localView3);
          i17 = View.MeasureSpec.makeMeasureSpec(b(paramaw, parambb, c(localView3)) * this.c, 1073741824);
          localLayoutParams2 = (GridLayoutManager.LayoutParams)localView3.getLayoutParams();
          if (this.i != 1)
            break label485;
          a(localView3, i17, f(localLayoutParams2.height));
          i18 = this.j.c(localView3);
          if (i18 <= n)
            break label944;
        }
    }
    while (true)
    {
      m++;
      n = i18;
      break;
      b(localView3, 0);
      break label366;
      if (bool)
      {
        a(localView3);
        break label366;
      }
      a(localView3, 0);
      break label366;
      label485: a(localView3, f(localLayoutParams2.width), i17);
      break label423;
      int i1 = f(n);
      int i2 = 0;
      if (i2 < j)
      {
        View localView2 = this.d[i2];
        int i16;
        if (this.j.c(localView2) != n)
        {
          i16 = View.MeasureSpec.makeMeasureSpec(b(paramaw, parambb, c(localView2)) * this.c, 1073741824);
          if (this.i != 1)
            break label591;
          a(localView2, i16, i1);
        }
        while (true)
        {
          i2++;
          break;
          label591: a(localView2, i1, i16);
        }
      }
      paramx.a = n;
      int i6;
      int i4;
      int i5;
      int i7;
      int i8;
      int i9;
      int i10;
      int i11;
      int i12;
      label669: View localView1;
      GridLayoutManager.LayoutParams localLayoutParams1;
      if (this.i == 1)
        if (paramy.f == -1)
        {
          i6 = paramy.b;
          int i15 = i6 - n;
          i4 = 0;
          i5 = 0;
          i7 = i15;
          i8 = 0;
          i9 = i4;
          i10 = i7;
          i11 = i5;
          i12 = i6;
          if (i8 >= j)
            break label935;
          localView1 = this.d[i8];
          localLayoutParams1 = (GridLayoutManager.LayoutParams)localView1.getLayoutParams();
          if (this.i != 1)
            break label901;
          i11 = n() + this.c * GridLayoutManager.LayoutParams.a(localLayoutParams1);
          i9 = i11 + this.j.d(localView1);
        }
      while (true)
      {
        a(localView1, i11 + localLayoutParams1.leftMargin, i10 + localLayoutParams1.topMargin, i9 - localLayoutParams1.rightMargin, i12 - localLayoutParams1.bottomMargin);
        if ((localLayoutParams1.c()) || (localLayoutParams1.d()))
          paramx.c = true;
        paramx.d |= localView1.isFocusable();
        i8++;
        break label669;
        int i14 = paramy.b;
        i6 = i14 + n;
        i7 = i14;
        i5 = 0;
        i4 = 0;
        break;
        if (paramy.f == -1)
        {
          int i13 = paramy.b;
          i5 = i13 - n;
          i4 = i13;
          i6 = 0;
          i7 = 0;
          break;
        }
        int i3 = paramy.b;
        i4 = n + i3;
        i5 = i3;
        i6 = 0;
        i7 = 0;
        break;
        label901: i10 = o() + this.c * GridLayoutManager.LayoutParams.a(localLayoutParams1);
        i12 = i10 + this.j.d(localView1);
      }
      label935: Arrays.fill(this.d, null);
      return;
      label944: i18 = n;
    }
  }

  public final void a(aw paramaw, bb parambb, View paramView, e parame)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof GridLayoutManager.LayoutParams))
    {
      super.a(paramView, parame);
      return;
    }
    GridLayoutManager.LayoutParams localLayoutParams1 = (GridLayoutManager.LayoutParams)localLayoutParams;
    int i = a(paramaw, parambb, localLayoutParams1.e());
    if (this.i == 0)
    {
      int m = localLayoutParams1.a();
      int n = localLayoutParams1.b();
      if ((this.b > 1) && (localLayoutParams1.b() == this.b));
      for (boolean bool2 = true; ; bool2 = false)
      {
        parame.b(n.a(m, n, i, 1, bool2, false));
        return;
      }
    }
    int j = localLayoutParams1.a();
    int k = localLayoutParams1.b();
    if ((this.b > 1) && (localLayoutParams1.b() == this.b));
    for (boolean bool1 = true; ; bool1 = false)
    {
      parame.b(n.a(i, 1, j, k, bool1, false));
      return;
    }
  }

  final void a(bb parambb, w paramw)
  {
    super.a(parambb, paramw);
    if (this.i == 1);
    for (int i = l() - p() - n(); ; i = m() - q() - o())
    {
      this.c = (i / this.b);
      if ((parambb.e() <= 0) || (parambb.a()))
        break;
      for (int j = this.g.a(paramw.a, this.b); (j > 0) && (paramw.a > 0); j = this.g.a(paramw.a, this.b))
        paramw.a = (-1 + paramw.a);
    }
    if ((this.d == null) || (this.d.length != this.b))
      this.d = new View[this.b];
  }

  public final boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof GridLayoutManager.LayoutParams;
  }

  public final int b(aw paramaw, bb parambb)
  {
    if (this.i == 1)
      return this.b;
    if (parambb.e() <= 0)
      return 0;
    return a(paramaw, parambb, -1 + parambb.e());
  }

  public final RecyclerView.LayoutParams b()
  {
    return new GridLayoutManager.LayoutParams(-2, -2);
  }

  public final void b(int paramInt1, int paramInt2)
  {
    this.g.a.clear();
  }

  public final void c(int paramInt1, int paramInt2)
  {
    this.g.a.clear();
  }

  public final void c(aw paramaw, bb parambb)
  {
    if (parambb.a())
    {
      int i = k();
      for (int j = 0; j < i; j++)
      {
        GridLayoutManager.LayoutParams localLayoutParams = (GridLayoutManager.LayoutParams)b(j).getLayoutParams();
        int k = localLayoutParams.e();
        this.e.put(k, localLayoutParams.b());
        this.f.put(k, localLayoutParams.a());
      }
    }
    super.c(paramaw, parambb);
    this.e.clear();
    this.f.clear();
  }

  public final boolean c()
  {
    return this.n == null;
  }

  public final void d(int paramInt1, int paramInt2)
  {
    this.g.a.clear();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayoutManager
 * JD-Core Version:    0.6.2
 */