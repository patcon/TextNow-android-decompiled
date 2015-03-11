package android.support.v7.internal.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class an extends Resources
{
  private final al a;

  public an(Resources paramResources, al paramal)
  {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    this.a = paramal;
  }

  public final Drawable getDrawable(int paramInt)
  {
    Drawable localDrawable = super.getDrawable(paramInt);
    if (localDrawable != null)
      this.a.a(paramInt, localDrawable);
    return localDrawable;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.an
 * JD-Core Version:    0.6.2
 */