package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

final class y extends v
{
  private boolean a = true;

  public y(Drawable paramDrawable)
  {
    super(paramDrawable);
  }

  final void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public final void draw(Canvas paramCanvas)
  {
    if (this.a)
      super.draw(paramCanvas);
  }

  public final void setHotspot(float paramFloat1, float paramFloat2)
  {
    if (this.a)
      super.setHotspot(paramFloat1, paramFloat2);
  }

  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a)
      super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final boolean setState(int[] paramArrayOfInt)
  {
    if (this.a)
      return super.setState(paramArrayOfInt);
    return false;
  }

  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.a)
      return super.setVisible(paramBoolean1, paramBoolean2);
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.y
 * JD-Core Version:    0.6.2
 */