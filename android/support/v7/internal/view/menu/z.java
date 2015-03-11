package android.support.v7.internal.view.menu;

import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;

public final class z
{
  public static Menu a(Menu paramMenu)
  {
    if (Build.VERSION.SDK_INT >= 14)
      paramMenu = new aa(paramMenu);
    return paramMenu;
  }

  public static MenuItem a(MenuItem paramMenuItem)
  {
    if (Build.VERSION.SDK_INT >= 16)
      paramMenuItem = new r(paramMenuItem);
    while (Build.VERSION.SDK_INT < 14)
      return paramMenuItem;
    return new n(paramMenuItem);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.z
 * JD-Core Version:    0.6.2
 */