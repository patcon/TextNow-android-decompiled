package android.support.v7.internal.view.menu;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import textnow.l.c;

final class p extends FrameLayout
  implements CollapsibleActionView
{
  final c a;

  p(View paramView)
  {
    super(paramView.getContext());
    this.a = ((c)paramView);
    addView(paramView);
  }

  final View a()
  {
    return (View)this.a;
  }

  public final void onActionViewCollapsed()
  {
    this.a.b();
  }

  public final void onActionViewExpanded()
  {
    this.a.a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.p
 * JD-Core Version:    0.6.2
 */