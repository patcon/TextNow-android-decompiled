package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class h extends BaseAdapter
{
  private int b = -1;

  public h(g paramg)
  {
    a();
  }

  private void a()
  {
    m localm = this.a.c.s();
    if (localm != null)
    {
      ArrayList localArrayList = this.a.c.m();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        if ((m)localArrayList.get(j) == localm)
        {
          this.b = j;
          return;
        }
    }
    this.b = -1;
  }

  public final m a(int paramInt)
  {
    ArrayList localArrayList = this.a.c.m();
    int i = paramInt + g.a(this.a);
    if ((this.b >= 0) && (i >= this.b))
      i++;
    return (m)localArrayList.get(i);
  }

  public final int getCount()
  {
    int i = this.a.c.m().size() - g.a(this.a);
    if (this.b < 0)
      return i;
    return i - 1;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = this.a.b.inflate(this.a.f, paramViewGroup, false); ; localView = paramView)
    {
      ((y)localView).a(a(paramInt), 0);
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
 * Qualified Name:     android.support.v7.internal.view.menu.h
 * JD-Core Version:    0.6.2
 */