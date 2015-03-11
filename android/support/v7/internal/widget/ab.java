package android.support.v7.internal.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

final class ab
  implements View.OnClickListener
{
  private ab(ScrollingTabContainerView paramScrollingTabContainerView)
  {
  }

  public final void onClick(View paramView)
  {
    ((ScrollingTabContainerView.TabView)paramView).a();
    int i = ScrollingTabContainerView.a(this.a).getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = ScrollingTabContainerView.a(this.a).getChildAt(j);
      if (localView == paramView);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        j++;
        break;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ab
 * JD-Core Version:    0.6.2
 */