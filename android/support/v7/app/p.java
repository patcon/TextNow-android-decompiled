package android.support.v7.app;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;

final class p
  implements ActionMode.Callback
{
  private final ActionMode.Callback b;

  p(o paramo, ActionMode.Callback paramCallback)
  {
    this.b = paramCallback;
  }

  public final boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return this.b.onActionItemClicked(paramActionMode, paramMenuItem);
  }

  public final boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    boolean bool = this.b.onCreateActionMode(paramActionMode, paramMenu);
    if (bool)
    {
      o.a(this.a, paramActionMode);
      this.a.e();
    }
    return bool;
  }

  public final void onDestroyActionMode(ActionMode paramActionMode)
  {
    this.b.onDestroyActionMode(paramActionMode);
    this.a.f();
    o.a(this.a, null);
  }

  public final boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return this.b.onPrepareActionMode(paramActionMode, paramMenu);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.p
 * JD-Core Version:    0.6.2
 */