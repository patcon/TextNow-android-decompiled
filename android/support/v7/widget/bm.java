package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

final class bm
{
  int a;
  int b;
  int c;
  final int d;
  private ArrayList<View> f;

  private void f()
  {
    View localView = (View)this.f.get(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
    this.a = this.e.a.a(localView);
    if (localLayoutParams.f)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = this.e.f.d(localLayoutParams.e());
      if ((localFullSpanItem != null) && (localFullSpanItem.b == -1))
        this.a -= localFullSpanItem.a(this.d);
    }
  }

  private void g()
  {
    View localView = (View)this.f.get(-1 + this.f.size());
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
    this.b = this.e.a.b(localView);
    if (localLayoutParams.f)
    {
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = this.e.f.d(localLayoutParams.e());
      if ((localFullSpanItem != null) && (localFullSpanItem.b == 1))
        this.b += localFullSpanItem.a(this.d);
    }
  }

  final int a()
  {
    if (this.a != -2147483648)
      return this.a;
    f();
    return this.a;
  }

  final int a(int paramInt)
  {
    if (this.a != -2147483648)
      paramInt = this.a;
    while (this.f.size() == 0)
      return paramInt;
    f();
    return this.a;
  }

  final void a(View paramView)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    localLayoutParams.e = this;
    this.f.add(0, paramView);
    this.a = -2147483648;
    if (this.f.size() == 1)
      this.b = -2147483648;
    if ((localLayoutParams.c()) || (localLayoutParams.d()))
      this.c += this.e.a.c(paramView);
  }

  final int b()
  {
    if (this.b != -2147483648)
      return this.b;
    g();
    return this.b;
  }

  final int b(int paramInt)
  {
    if (this.b != -2147483648)
      paramInt = this.b;
    while (this.f.size() == 0)
      return paramInt;
    g();
    return this.b;
  }

  final void b(View paramView)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    localLayoutParams.e = this;
    this.f.add(paramView);
    this.b = -2147483648;
    if (this.f.size() == 1)
      this.a = -2147483648;
    if ((localLayoutParams.c()) || (localLayoutParams.d()))
      this.c += this.e.a.c(paramView);
  }

  final void c()
  {
    this.f.clear();
    this.a = -2147483648;
    this.b = -2147483648;
    this.c = 0;
  }

  final void c(int paramInt)
  {
    this.a = paramInt;
    this.b = paramInt;
  }

  final void d()
  {
    int i = this.f.size();
    View localView = (View)this.f.remove(i - 1);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
    localLayoutParams.e = null;
    if ((localLayoutParams.c()) || (localLayoutParams.d()))
      this.c -= this.e.a.c(localView);
    if (i == 1)
      this.a = -2147483648;
    this.b = -2147483648;
  }

  final void d(int paramInt)
  {
    if (this.a != -2147483648)
      this.a = (paramInt + this.a);
    if (this.b != -2147483648)
      this.b = (paramInt + this.b);
  }

  final void e()
  {
    View localView = (View)this.f.remove(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
    localLayoutParams.e = null;
    if (this.f.size() == 0)
      this.b = -2147483648;
    if ((localLayoutParams.c()) || (localLayoutParams.d()))
      this.c -= this.e.a.c(localView);
    this.a = -2147483648;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bm
 * JD-Core Version:    0.6.2
 */