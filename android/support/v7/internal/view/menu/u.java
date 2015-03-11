package android.support.v7.internal.view.menu;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import textnow.i.c;

final class u extends FrameLayout
  implements CollapsibleActionView
{
  final c a;

  u(View paramView)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.u
 * JD-Core Version:    0.6.2
 */