package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;

public final class ad
{
  static final ag a = new ae();

  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new af();
      return;
    }
  }

  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    a.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ad
 * JD-Core Version:    0.6.2
 */