package textnow.h;

import android.content.Context;
import android.support.v7.internal.view.menu.ae;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import textnow.i.a;

public final class b extends a
{
  final MenuInflater a;
  final ActionMode b;

  public b(Context paramContext, ActionMode paramActionMode)
  {
    this.b = paramActionMode;
    this.a = new d(paramContext);
  }

  public final Menu a()
  {
    return ae.a(this.b.getMenu());
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.b.setTitle(paramCharSequence);
  }

  public final void b()
  {
    this.b.finish();
  }

  public final void c()
  {
    this.b.invalidate();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.h.b
 * JD-Core Version:    0.6.2
 */