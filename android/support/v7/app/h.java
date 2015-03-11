package android.support.v7.app;

import android.view.Menu;
import android.view.MenuItem;
import textnow.i.a;
import textnow.i.b;

final class h
  implements b
{
  private b b;

  public h(f paramf, b paramb)
  {
    this.b = paramb;
  }

  public final void a(a parama)
  {
    this.b.a(parama);
    d.e();
    f.a(this.a, null);
  }

  public final boolean a(a parama, Menu paramMenu)
  {
    return this.b.a(parama, paramMenu);
  }

  public final boolean a(a parama, MenuItem paramMenuItem)
  {
    return this.b.a(parama, paramMenuItem);
  }

  public final boolean b(a parama, Menu paramMenu)
  {
    return this.b.b(parama, paramMenu);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.h
 * JD-Core Version:    0.6.2
 */