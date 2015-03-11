package android.support.v7.widget;

import android.widget.PopupWindow;

final class ah
  implements Runnable
{
  private ah(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void run()
  {
    if ((ListPopupWindow.a(this.a) != null) && (ListPopupWindow.a(this.a).getCount() > ListPopupWindow.a(this.a).getChildCount()) && (ListPopupWindow.a(this.a).getChildCount() <= this.a.b))
    {
      ListPopupWindow.b(this.a).setInputMethodMode(2);
      this.a.c();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ah
 * JD-Core Version:    0.6.2
 */