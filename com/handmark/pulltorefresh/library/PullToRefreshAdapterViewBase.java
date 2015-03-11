package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import textnow.af.a;
import textnow.af.c;

public abstract class PullToRefreshAdapterViewBase<T extends AbsListView> extends PullToRefreshBase<T>
  implements AbsListView.OnScrollListener
{
  private boolean b;
  private AbsListView.OnScrollListener c;
  private f d;
  private View e;
  private c f;
  private c g;
  private boolean h;
  private boolean i = true;

  public PullToRefreshAdapterViewBase(Context paramContext)
  {
    super(paramContext);
    ((AbsListView)this.a).setOnScrollListener(this);
  }

  public PullToRefreshAdapterViewBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    ((AbsListView)this.a).setOnScrollListener(this);
  }

  public PullToRefreshAdapterViewBase(Context paramContext, e parame)
  {
    super(paramContext, parame);
    ((AbsListView)this.a).setOnScrollListener(this);
  }

  public PullToRefreshAdapterViewBase(Context paramContext, e parame, d paramd)
  {
    super(paramContext, parame, paramd);
    ((AbsListView)this.a).setOnScrollListener(this);
  }

  private void w()
  {
    e locale = h();
    FrameLayout localFrameLayout = v();
    if ((locale.c()) && (this.f == null))
    {
      this.f = new c(getContext(), e.b);
      FrameLayout.LayoutParams localLayoutParams2 = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams2.rightMargin = getResources().getDimensionPixelSize(2131361824);
      localLayoutParams2.gravity = 53;
      localFrameLayout.addView(this.f, localLayoutParams2);
    }
    do
      while ((locale.d()) && (this.g == null))
      {
        this.g = new c(getContext(), e.c);
        FrameLayout.LayoutParams localLayoutParams1 = new FrameLayout.LayoutParams(-2, -2);
        localLayoutParams1.rightMargin = getResources().getDimensionPixelSize(2131361824);
        localLayoutParams1.gravity = 85;
        localFrameLayout.addView(this.g, localLayoutParams1);
        return;
        if ((!locale.c()) && (this.f != null))
        {
          localFrameLayout.removeView(this.f);
          this.f = null;
        }
      }
    while ((locale.d()) || (this.g == null));
    localFrameLayout.removeView(this.g);
    this.g = null;
  }

  private boolean x()
  {
    return (this.h) && (l());
  }

  private void y()
  {
    if (this.f != null)
    {
      v().removeView(this.f);
      this.f = null;
    }
    if (this.g != null)
    {
      v().removeView(this.g);
      this.g = null;
    }
  }

  private void z()
  {
    if (this.f != null)
    {
      if ((n()) || (!d()))
        break label77;
      if (!this.f.a())
        this.f.c();
    }
    label77: 
    do
      while (true)
      {
        if (this.g != null)
        {
          if ((n()) || (!e()))
            break;
          if (!this.g.a())
            this.g.c();
        }
        return;
        if (this.f.a())
          this.f.b();
      }
    while (!this.g.a());
    this.g.b();
  }

  protected final void a()
  {
    super.a();
    if (x());
    switch (1.a[g().ordinal()])
    {
    default:
      return;
    case 1:
      this.g.e();
      return;
    case 2:
    }
    this.f.e();
  }

  protected void a(TypedArray paramTypedArray)
  {
    if (!m());
    for (boolean bool = true; ; bool = false)
    {
      this.h = paramTypedArray.getBoolean(5, bool);
      return;
    }
  }

  public final void a(View paramView)
  {
    FrameLayout localFrameLayout = v();
    FrameLayout.LayoutParams localLayoutParams1;
    FrameLayout.LayoutParams localLayoutParams2;
    if (paramView != null)
    {
      paramView.setClickable(true);
      ViewParent localViewParent = paramView.getParent();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
        ((ViewGroup)localViewParent).removeView(paramView);
      ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
      if (localLayoutParams == null)
        break label162;
      localLayoutParams1 = new FrameLayout.LayoutParams(localLayoutParams);
      if (!(localLayoutParams instanceof LinearLayout.LayoutParams))
        break label126;
      localLayoutParams1.gravity = ((LinearLayout.LayoutParams)localLayoutParams).gravity;
      localLayoutParams2 = localLayoutParams1;
    }
    while (true)
    {
      if (localLayoutParams2 != null)
      {
        localFrameLayout.addView(paramView, localLayoutParams2);
        label97: if (!(this.a instanceof a))
          break label148;
        ((a)this.a).a(paramView);
      }
      while (true)
      {
        this.e = paramView;
        return;
        label126: localLayoutParams1.gravity = 17;
        localLayoutParams2 = localLayoutParams1;
        break;
        localFrameLayout.addView(paramView);
        break label97;
        label148: ((AbsListView)this.a).setEmptyView(paramView);
      }
      label162: localLayoutParams2 = null;
    }
  }

  public final void a(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.c = paramOnScrollListener;
  }

  public final void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    ((AbsListView)this.a).setOnItemClickListener(paramOnItemClickListener);
  }

  public final void a(ListAdapter paramListAdapter)
  {
    ((AdapterView)this.a).setAdapter(paramListAdapter);
  }

  public final void a(boolean paramBoolean)
  {
    this.h = false;
    if (x())
    {
      w();
      return;
    }
    y();
  }

  protected final void b()
  {
    super.b();
    if (x());
    switch (1.a[g().ordinal()])
    {
    default:
      return;
    case 1:
      this.g.d();
      return;
    case 2:
    }
    this.f.d();
  }

  protected void b(boolean paramBoolean)
  {
    super.b(paramBoolean);
    if (x())
      z();
  }

  protected void c()
  {
    super.c();
    if (x())
      z();
  }

  protected final boolean d()
  {
    Adapter localAdapter = ((AbsListView)this.a).getAdapter();
    boolean bool1;
    if ((localAdapter == null) || (localAdapter.isEmpty()))
      bool1 = true;
    int j;
    int k;
    do
    {
      return bool1;
      if (((AbsListView)this.a).getFirstVisiblePosition() > 1)
        break;
      View localView = ((AbsListView)this.a).getChildAt(0);
      if (localView == null)
        break;
      j = localView.getTop();
      k = ((AbsListView)this.a).getTop();
      bool1 = false;
    }
    while (j < k);
    for (boolean bool2 = true; ; bool2 = false)
      return bool2;
  }

  protected final boolean e()
  {
    Adapter localAdapter = ((AbsListView)this.a).getAdapter();
    boolean bool1;
    if ((localAdapter == null) || (localAdapter.isEmpty()))
      bool1 = true;
    int n;
    int i1;
    do
    {
      return bool1;
      int j = -1 + ((AbsListView)this.a).getCount();
      int k = ((AbsListView)this.a).getLastVisiblePosition();
      new StringBuilder().append("isLastItemVisible. Last Item Position: ").append(j).append(" Last Visible Pos: ").append(k).toString();
      if (k < j - 1)
        break;
      int m = k - ((AbsListView)this.a).getFirstVisiblePosition();
      View localView = ((AbsListView)this.a).getChildAt(m);
      if (localView == null)
        break;
      n = localView.getBottom();
      i1 = ((AbsListView)this.a).getBottom();
      bool1 = false;
    }
    while (n > i1);
    for (boolean bool2 = true; ; bool2 = false)
      return bool2;
  }

  protected final void f()
  {
    super.f();
    if (x())
    {
      w();
      return;
    }
    y();
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    new StringBuilder().append("First Visible: ").append(paramInt1).append(". Visible Count: ").append(paramInt2).append(". Total Items:").append(paramInt3).toString();
    if (this.d != null)
      if ((paramInt3 <= 0) || (paramInt1 + paramInt2 < paramInt3 - 1))
        break label106;
    label106: for (boolean bool = true; ; bool = false)
    {
      this.b = bool;
      if (x())
        z();
      if (this.c != null)
        this.c.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
      return;
    }
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.e != null) && (!this.i))
      this.e.scrollTo(-paramInt1, -paramInt2);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (((paramInt != 0) || (this.d == null) || (!this.b)) || (this.c != null))
      this.c.onScrollStateChanged(paramAbsListView, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.handmark.pulltorefresh.library.PullToRefreshAdapterViewBase
 * JD-Core Version:    0.6.2
 */