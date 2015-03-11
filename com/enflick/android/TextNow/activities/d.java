package com.enflick.android.TextNow.activities;

import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import textnow.i.a;

public final class d
  implements textnow.i.b
{
  public d(b paramb)
  {
  }

  public final void a(a parama)
  {
    b.a(this.a, null);
    b.c(this.a).d();
    b.c(this.a).b();
  }

  public final boolean a(a parama, Menu paramMenu)
  {
    b.a(this.a, parama);
    b.a(this.a).getMenuInflater().inflate(b.b(this.a), paramMenu);
    b.c(this.a).a();
    return true;
  }

  public final boolean a(a parama, MenuItem paramMenuItem)
  {
    return b.c(this.a).a(paramMenuItem);
  }

  public final boolean b(a parama, Menu paramMenu)
  {
    int i = b.c(this.a).c();
    a locala = b.e(this.a);
    Resources localResources = b.a(this.a).getResources();
    int j = b.d(this.a);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    locala.a(localResources.getQuantityString(j, i, arrayOfObject));
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.d
 * JD-Core Version:    0.6.2
 */