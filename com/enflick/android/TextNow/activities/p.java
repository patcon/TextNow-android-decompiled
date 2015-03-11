package com.enflick.android.TextNow.activities;

import android.view.Menu;
import android.view.MenuItem;

public final class p
{
  private Menu a;

  public p(Menu paramMenu)
  {
    this.a = paramMenu;
  }

  public final void a()
  {
    if (this.a != null)
      for (int i = 0; i < this.a.size(); i++)
        this.a.getItem(i).setVisible(true);
  }

  public final void a(int paramInt)
  {
    if (this.a != null)
    {
      MenuItem localMenuItem = this.a.findItem(paramInt);
      if (localMenuItem != null)
        localMenuItem.setVisible(false);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.p
 * JD-Core Version:    0.6.2
 */