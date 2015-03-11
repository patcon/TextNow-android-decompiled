package android.support.v7.internal.widget;

import android.support.v7.app.a;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

final class ad extends BaseAdapter
{
  private ad(ac paramac)
  {
  }

  public final int getCount()
  {
    return ac.a(this.a).getChildCount();
  }

  public final Object getItem(int paramInt)
  {
    return ((af)ac.a(this.a).getChildAt(paramInt)).a();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      return ac.a(this.a, (a)getItem(paramInt), true);
    ((af)paramView).a((a)getItem(paramInt));
    return paramView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ad
 * JD-Core Version:    0.6.2
 */