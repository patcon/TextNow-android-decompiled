package textnow.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

final class f extends e
{
  public final void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    paramDrawable.setHotspot(paramFloat1, paramFloat2);
  }

  public final void a(Drawable paramDrawable, int paramInt)
  {
    paramDrawable.setTint(paramInt);
  }

  public final void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    paramDrawable.setTintList(paramColorStateList);
  }

  public final void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    paramDrawable.setTintMode(paramMode);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.a.f
 * JD-Core Version:    0.6.2
 */