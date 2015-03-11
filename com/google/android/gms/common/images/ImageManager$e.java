package com.google.android.gms.common.images;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class ImageManager$e
  implements ComponentCallbacks2
{
  private final ImageManager.b Kx;

  public ImageManager$e(ImageManager.b paramb)
  {
    this.Kx = paramb;
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  public final void onLowMemory()
  {
    this.Kx.evictAll();
  }

  public final void onTrimMemory(int paramInt)
  {
    if (paramInt >= 60)
      this.Kx.evictAll();
    while (paramInt < 20)
      return;
    this.Kx.trimToSize(this.Kx.size() / 2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.e
 * JD-Core Version:    0.6.2
 */