package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class m extends BaseAdapter
{
  private int b = -1;

  public m(l paraml)
  {
    a();
  }

  private void a()
  {
    r localr = this.a.c.s();
    if (localr != null)
    {
      ArrayList localArrayList = this.a.c.m();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
        if ((r)localArrayList.get(j) == localr)
        {
          this.b = j;
          return;
        }
    }
    this.b = -1;
  }

  public final r a(int paramInt)
  {
    ArrayList localArrayList = this.a.c.m();
    int i = paramInt + l.a(this.a);
    if ((this.b >= 0) && (i >= this.b))
      i++;
    return (r)localArrayList.get(i);
  }

  public final int getCount()
  {
    int i = this.a.c.m().size() - l.a(this.a);
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
      ((ad)localView).a(a(paramInt), 0);
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
 * Qualified Name:     android.support.v7.internal.view.menu.m
 * JD-Core Version:    0.6.2
 */