package android.support.v7.internal.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

final class e extends d
{
  public e(ActionBarContainer paramActionBarContainer)
  {
    super(paramActionBarContainer);
  }

  public final void getOutline(Outline paramOutline)
  {
    if (this.a.d)
      if (this.a.c != null)
        this.a.c.getOutline(paramOutline);
    while (this.a.a == null)
      return;
    this.a.a.getOutline(paramOutline);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.e
 * JD-Core Version:    0.6.2
 */