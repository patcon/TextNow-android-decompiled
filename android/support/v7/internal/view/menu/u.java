package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class u extends BaseAdapter
{
  private i b;
  private int c = -1;

  public u(t paramt, i parami)
  {
    this.b = parami;
    a();
  }

  private void a()
  {
    m localm = t.c(this.a).s();
    if (localm != null)
    {
      ArrayList localArrayList = t.c(this.a).m();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        if ((m)localArrayList.get(j) == localm)
        {
          this.c = j;
          return;
        }
    }
    this.c = -1;
  }

  public final m a(int paramInt)
  {
    if (t.a(this.a));
    for (ArrayList localArrayList = this.b.m(); ; localArrayList = this.b.j())
    {
      if ((this.c >= 0) && (paramInt >= this.c))
        paramInt++;
      return (m)localArrayList.get(paramInt);
    }
  }

  public final int getCount()
  {
    if (t.a(this.a));
    for (ArrayList localArrayList = this.b.m(); this.c < 0; localArrayList = this.b.j())
      return localArrayList.size();
    return -1 + localArrayList.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = t.b(this.a).inflate(t.a, paramViewGroup, false); ; localView = paramView)
    {
      y localy = (y)localView;
      if (this.a.b)
        ((ListMenuItemView)localView).a(true);
      localy.a(a(paramInt), 0);
      return localView;
    }
  }

  public final void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.u
 * JD-Core Version:    0.6.2
 */