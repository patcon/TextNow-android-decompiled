package com.enflick.android.TextNow.views.fab;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

abstract class a
  implements AbsListView.OnScrollListener
{
  private int a;
  private int b;
  private AbsListView c;
  private int d;

  private int c()
  {
    if ((this.c == null) || (this.c.getChildAt(0) == null))
      return 0;
    return this.c.getChildAt(0).getTop();
  }

  abstract void a();

  public final void a(int paramInt)
  {
    this.d = paramInt;
  }

  public final void a(AbsListView paramAbsListView)
  {
    this.c = paramAbsListView;
  }

  abstract void b();

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    int j;
    int k;
    if (paramInt1 == this.b)
    {
      j = i;
      if (j == 0)
        break label87;
      k = c();
      if (Math.abs(this.a - k) <= this.d)
        break label74;
      label43: if (i != 0)
      {
        if (this.a <= k)
          break label80;
        a();
      }
    }
    while (true)
    {
      this.a = k;
      return;
      j = 0;
      break;
      label74: i = 0;
      break label43;
      label80: b();
    }
    label87: if (paramInt1 > this.b)
      a();
    while (true)
    {
      this.a = c();
      this.b = paramInt1;
      return;
      b();
    }
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.fab.a
 * JD-Core Version:    0.6.2
 */