package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class d extends Drawable
{
  final ActionBarContainer a;

  public d(ActionBarContainer paramActionBarContainer)
  {
    this.a = paramActionBarContainer;
  }

  public void draw(Canvas paramCanvas)
  {
    if (this.a.d)
      if (this.a.c != null)
        this.a.c.draw(paramCanvas);
    do
    {
      return;
      if (this.a.a != null)
        this.a.a.draw(paramCanvas);
    }
    while ((this.a.b == null) || (!this.a.e));
    this.a.b.draw(paramCanvas);
  }

  public int getOpacity()
  {
    return 0;
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.d
 * JD-Core Version:    0.6.2
 */