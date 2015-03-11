package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

final class n
{
  final p a;
  final o b;
  final List<View> c;

  n(p paramp)
  {
    this.a = paramp;
    this.b = new o();
    this.c = new ArrayList();
  }

  private int e(int paramInt)
  {
    if (paramInt < 0)
    {
      j = -1;
      return j;
    }
    int i = this.a.a();
    int j = paramInt;
    while (true)
    {
      if (j >= i)
        break label69;
      int k = paramInt - (j - this.b.d(j));
      if (k == 0)
      {
        while (this.b.b(j))
          j++;
        break;
      }
      j += k;
    }
    label69: return -1;
  }

  final int a()
  {
    return this.a.a() - this.c.size();
  }

  final void a(int paramInt)
  {
    int i = e(paramInt);
    View localView = this.a.b(i);
    if (localView == null);
    do
    {
      return;
      this.a.a(i);
    }
    while (!this.b.c(i));
    this.c.remove(localView);
  }

  final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramInt < 0);
    for (int i = this.a.a(); ; i = e(paramInt))
    {
      this.a.a(paramView, i, paramLayoutParams);
      this.b.a(i, paramBoolean);
      return;
    }
  }

  final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0);
    for (int i = this.a.a(); ; i = e(paramInt))
    {
      this.a.a(paramView, i);
      this.b.a(i, paramBoolean);
      if (paramBoolean)
        this.c.add(paramView);
      return;
    }
  }

  final void a(View paramView, boolean paramBoolean)
  {
    a(paramView, -1, true);
  }

  final int b()
  {
    return this.a.a();
  }

  final View b(int paramInt)
  {
    int i = e(paramInt);
    return this.a.b(i);
  }

  final View c(int paramInt)
  {
    return this.a.b(paramInt);
  }

  final void d(int paramInt)
  {
    int i = e(paramInt);
    this.a.c(i);
    this.b.c(i);
  }

  public final String toString()
  {
    return this.b.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.n
 * JD-Core Version:    0.6.2
 */