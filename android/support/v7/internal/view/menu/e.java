package android.support.v7.internal.view.menu;

import android.content.Context;
import android.widget.ImageButton;
import textnow.g.c;

final class e extends ImageButton
  implements h
{
  public e(ActionMenuPresenter paramActionMenuPresenter, Context paramContext)
  {
    super(paramContext, null, c.g);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
  }

  public final boolean d()
  {
    return false;
  }

  public final boolean e()
  {
    return false;
  }

  public final boolean performClick()
  {
    if (super.performClick())
      return true;
    playSoundEffect(0);
    this.a.b();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.e
 * JD-Core Version:    0.6.2
 */