package textnow.h;

import android.content.Context;
import android.support.v7.internal.view.menu.ae;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import textnow.i.a;

public final class c
  implements ActionMode.Callback
{
  final textnow.i.b a;
  final Context b;
  private b c;

  public c(Context paramContext, textnow.i.b paramb)
  {
    this.b = paramContext;
    this.a = paramb;
  }

  private a a(ActionMode paramActionMode)
  {
    if ((this.c != null) && (this.c.b == paramActionMode))
      return this.c;
    return new b(this.b, paramActionMode);
  }

  public final void a(b paramb)
  {
    this.c = paramb;
  }

  public final boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return this.a.a(a(paramActionMode), ae.a(paramMenuItem));
  }

  public final boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return this.a.a(a(paramActionMode), ae.a(paramMenu));
  }

  public final void onDestroyActionMode(ActionMode paramActionMode)
  {
    this.a.a(a(paramActionMode));
  }

  public final boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return this.a.b(a(paramActionMode), ae.a(paramMenu));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.h.c
 * JD-Core Version:    0.6.2
 */