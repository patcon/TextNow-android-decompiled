package android.support.v7.app;

import android.support.v4.view.av;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import textnow.l.a;

final class f
  implements textnow.l.b
{
  private textnow.l.b b;

  public f(ActionBarActivityDelegateBase paramActionBarActivityDelegateBase, textnow.l.b paramb)
  {
    this.b = paramb;
  }

  public final void a(a parama)
  {
    this.b.a(parama);
    if (this.a.i != null)
    {
      this.a.a.getWindow().getDecorView().removeCallbacks(this.a.j);
      this.a.i.dismiss();
    }
    while (true)
    {
      if (this.a.h != null)
        this.a.h.removeAllViews();
      if (this.a.a != null);
      try
      {
        b.d();
        label103: this.a.g = null;
        return;
        if (this.a.h == null)
          continue;
        this.a.h.setVisibility(8);
        if (this.a.h.getParent() == null)
          continue;
        av.t((View)this.a.h.getParent());
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        break label103;
      }
    }
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.f
 * JD-Core Version:    0.6.2
 */