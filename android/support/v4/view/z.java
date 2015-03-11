package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.View;
import textnow.b.b;

public final class z
{
  static final ad a = new aa();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      a = new ac();
      return;
    }
    if (i >= 11)
    {
      a = new ab();
      return;
    }
  }

  public static MenuItem a(MenuItem paramMenuItem, j paramj)
  {
    if ((paramMenuItem instanceof b))
      paramMenuItem = ((b)paramMenuItem).a(paramj);
    return paramMenuItem;
  }

  public static MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).setActionView(paramView);
    return a.a(paramMenuItem, paramView);
  }

  public static View a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).getActionView();
    return a.a(paramMenuItem);
  }

  public static void a(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof b))
    {
      ((b)paramMenuItem).setShowAsAction(paramInt);
      return;
    }
    a.a(paramMenuItem, paramInt);
  }

  public static MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).setActionView(paramInt);
    return a.b(paramMenuItem, paramInt);
  }

  public static boolean b(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).expandActionView();
    return a.b(paramMenuItem);
  }

  public static boolean c(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).isActionViewExpanded();
    return a.c(paramMenuItem);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.z
 * JD-Core Version:    0.6.2
 */