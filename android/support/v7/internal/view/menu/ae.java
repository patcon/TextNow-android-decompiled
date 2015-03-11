package android.support.v7.internal.view.menu;

import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;

public final class ae
{
  public static Menu a(Menu paramMenu)
  {
    if (Build.VERSION.SDK_INT >= 14)
      paramMenu = new af(paramMenu);
    return paramMenu;
  }

  public static MenuItem a(MenuItem paramMenuItem)
  {
    if (Build.VERSION.SDK_INT >= 16)
      paramMenuItem = new w(paramMenuItem);
    while (Build.VERSION.SDK_INT < 14)
      return paramMenuItem;
    return new s(paramMenuItem);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ae
 * JD-Core Version:    0.6.2
 */