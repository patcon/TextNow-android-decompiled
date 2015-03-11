package textnow.k;

import android.content.Context;
import android.support.v7.internal.view.menu.z;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import textnow.e.o;
import textnow.l.a;
import textnow.l.b;

public final class d
  implements b
{
  final ActionMode.Callback a;
  final Context b;
  final o<a, c> c;

  public d(Context paramContext, ActionMode.Callback paramCallback)
  {
    this.b = paramContext;
    this.a = paramCallback;
    this.c = new o();
  }

  private ActionMode b(a parama)
  {
    c localc1 = (c)this.c.get(parama);
    if (localc1 != null)
      return localc1;
    c localc2 = new c(this.b, parama);
    this.c.put(parama, localc2);
    return localc2;
  }

  public final void a(a parama)
  {
    this.a.onDestroyActionMode(b(parama));
  }

  public final boolean a(a parama, Menu paramMenu)
  {
    return this.a.onCreateActionMode(b(parama), z.a(paramMenu));
  }

  public final boolean a(a parama, MenuItem paramMenuItem)
  {
    return this.a.onActionItemClicked(b(parama), z.a(paramMenuItem));
  }

  public final boolean b(a parama, Menu paramMenu)
  {
    return this.a.onPrepareActionMode(b(parama), z.a(paramMenu));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.k.d
 * JD-Core Version:    0.6.2
 */