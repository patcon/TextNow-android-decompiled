package textnow.k;

import android.content.Context;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import textnow.l.a;

public final class b extends a
  implements j
{
  private Context a;
  private ActionBarContextView b;
  private textnow.l.b c;
  private WeakReference<View> d;
  private boolean e;
  private boolean f;
  private i g;

  public b(Context paramContext, ActionBarContextView paramActionBarContextView, textnow.l.b paramb, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = paramActionBarContextView;
    this.c = paramb;
    this.g = new i(paramContext).a(1);
    this.g.a(this);
    this.f = paramBoolean;
  }

  public final Menu a()
  {
    return this.g;
  }

  public final void a(int paramInt)
  {
    b(this.a.getString(paramInt));
  }

  public final void a(i parami)
  {
    c();
    this.b.a();
  }

  public final void a(View paramView)
  {
    this.b.d(paramView);
    if (paramView != null);
    for (WeakReference localWeakReference = new WeakReference(paramView); ; localWeakReference = null)
    {
      this.d = localWeakReference;
      return;
    }
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.b.b(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    this.b.a(paramBoolean);
  }

  public final boolean a(i parami, MenuItem paramMenuItem)
  {
    return this.c.a(this, paramMenuItem);
  }

  public final void b()
  {
    if (this.e)
      return;
    this.e = true;
    this.b.sendAccessibilityEvent(32);
    this.c.a(this);
  }

  public final void b(int paramInt)
  {
    a(this.a.getString(paramInt));
  }

  public final void b(CharSequence paramCharSequence)
  {
    this.b.a(paramCharSequence);
  }

  public final void c()
  {
    this.c.b(this, this.g);
  }

  public final CharSequence e()
  {
    return this.b.b();
  }

  public final CharSequence f()
  {
    return this.b.c();
  }

  public final boolean g()
  {
    return this.b.f();
  }

  public final View h()
  {
    if (this.d != null)
      return (View)this.d.get();
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.k.b
 * JD-Core Version:    0.6.2
 */