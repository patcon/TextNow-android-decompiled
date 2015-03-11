package android.support.v7.internal.widget;

import android.support.v7.app.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

final class aa extends BaseAdapter
{
  private aa(ScrollingTabContainerView paramScrollingTabContainerView)
  {
  }

  public final int getCount()
  {
    return ScrollingTabContainerView.a(this.a).getChildCount();
  }

  public final Object getItem(int paramInt)
  {
    return ((ScrollingTabContainerView.TabView)ScrollingTabContainerView.a(this.a).getChildAt(paramInt)).a();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      return ScrollingTabContainerView.a(this.a, (c)getItem(paramInt), true);
    ((ScrollingTabContainerView.TabView)paramView).a((c)getItem(paramInt));
    return paramView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.aa
 * JD-Core Version:    0.6.2
 */