package com.google.android.gms.common.images;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class ImageManager$e
  implements ComponentCallbacks2
{
  private final ImageManager.b Fc;

  public ImageManager$e(ImageManager.b paramb)
  {
    this.Fc = paramb;
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  public final void onLowMemory()
  {
    this.Fc.evictAll();
  }

  public final void onTrimMemory(int paramInt)
  {
    if (paramInt >= 60)
      this.Fc.evictAll();
    while (paramInt < 20)
      return;
    this.Fc.trimToSize(this.Fc.size() / 2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.e
 * JD-Core Version:    0.6.2
 */