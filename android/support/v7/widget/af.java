package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

final class af
  implements AbsListView.OnScrollListener
{
  private af(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!this.a.f()) && (ListPopupWindow.b(this.a).getContentView() != null))
    {
      ListPopupWindow.d(this.a).removeCallbacks(ListPopupWindow.c(this.a));
      ListPopupWindow.c(this.a).run();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.af
 * JD-Core Version:    0.6.2
 */