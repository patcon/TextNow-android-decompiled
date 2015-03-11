package com.enflick.android.TextNow.activities;

import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import textnow.l.a;

public final class e
  implements textnow.l.b
{
  public e(c paramc)
  {
  }

  public final void a(a parama)
  {
    c.a(this.a, null);
    c.c(this.a).d();
    c.c(this.a).b();
  }

  public final boolean a(a parama, Menu paramMenu)
  {
    c.a(this.a, parama);
    c.a(this.a).getMenuInflater().inflate(c.b(this.a), paramMenu);
    c.c(this.a).a();
    return true;
  }

  public final boolean a(a parama, MenuItem paramMenuItem)
  {
    return c.c(this.a).a(paramMenuItem);
  }

  public final boolean b(a parama, Menu paramMenu)
  {
    int i = c.c(this.a).c();
    a locala = c.e(this.a);
    Resources localResources = c.a(this.a).getResources();
    int j = c.d(this.a);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    locala.b(localResources.getQuantityString(j, i, arrayOfObject));
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.e
 * JD-Core Version:    0.6.2
 */