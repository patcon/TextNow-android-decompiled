package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class z extends BaseAdapter
{
  private n b;
  private int c = -1;

  public z(y paramy, n paramn)
  {
    this.b = paramn;
    a();
  }

  private void a()
  {
    r localr = y.c(this.a).s();
    if (localr != null)
    {
      ArrayList localArrayList = y.c(this.a).m();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        if ((r)localArrayList.get(j) == localr)
        {
          this.c = j;
          return;
        }
    }
    this.c = -1;
  }

  public final r a(int paramInt)
  {
    if (y.a(this.a));
    for (ArrayList localArrayList = this.b.m(); ; localArrayList = this.b.j())
    {
      if ((this.c >= 0) && (paramInt >= this.c))
        paramInt++;
      return (r)localArrayList.get(paramInt);
    }
  }

  public final int getCount()
  {
    if (y.a(this.a));
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
    for (View localView = y.b(this.a).inflate(y.b, paramViewGroup, false); ; localView = paramView)
    {
      ad localad = (ad)localView;
      if (this.a.c)
        ((ListMenuItemView)localView).a(true);
      localad.a(a(paramInt), 0);
      return localView;
    }
  }

  public final void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.z
 * JD-Core Version:    0.6.2
 */