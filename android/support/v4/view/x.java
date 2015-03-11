package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

class x
  implements z
{
  public final MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    return paramMenuItem.setActionView(paramView);
  }

  public final View a(MenuItem paramMenuItem)
  {
    return paramMenuItem.getActionView();
  }

  public final void a(MenuItem paramMenuItem, int paramInt)
  {
    paramMenuItem.setShowAsAction(paramInt);
  }

  public final MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    return paramMenuItem.setActionView(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.x
 * JD-Core Version:    0.6.2
 */