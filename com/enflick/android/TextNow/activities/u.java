package com.enflick.android.TextNow.activities;

import android.view.Menu;
import android.view.MenuItem;

public final class u
{
  private Menu a;

  public u(Menu paramMenu)
  {
    this.a = paramMenu;
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    if (this.a != null)
    {
      MenuItem localMenuItem = this.a.findItem(paramInt);
      if (localMenuItem != null)
        localMenuItem.setVisible(paramBoolean);
    }
  }

  public final void a()
  {
    if (this.a != null)
      for (int i = 0; i < this.a.size(); i++)
        this.a.getItem(i).setVisible(true);
  }

  public final void a(int paramInt)
  {
    a(paramInt, false);
  }

  public final void b(int paramInt)
  {
    a(paramInt, true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.u
 * JD-Core Version:    0.6.2
 */