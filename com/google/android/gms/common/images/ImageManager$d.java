package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.internal.gx;
import java.util.HashSet;
import java.util.Map;

final class ImageManager$d
  implements Runnable
{
  private final a Fk;

  public ImageManager$d(ImageManager paramImageManager, a parama)
  {
    this.Fk = parama;
  }

  public final void run()
  {
    gx.ay("LoadImageRunnable must be executed on the main thread");
    ImageManager.ImageReceiver localImageReceiver1 = (ImageManager.ImageReceiver)ImageManager.a(this.Fi).get(this.Fk);
    if (localImageReceiver1 != null)
    {
      ImageManager.a(this.Fi).remove(this.Fk);
      localImageReceiver1.c(this.Fk);
    }
    a.a locala = this.Fk.Fm;
    if (locala.uri == null)
    {
      this.Fk.a(ImageManager.b(this.Fi), ImageManager.c(this.Fi), true);
      return;
    }
    Bitmap localBitmap = ImageManager.a(this.Fi, locala);
    if (localBitmap != null)
    {
      this.Fk.a(ImageManager.b(this.Fi), localBitmap, true);
      return;
    }
    Long localLong = (Long)ImageManager.d(this.Fi).get(locala.uri);
    if (localLong != null)
    {
      if (SystemClock.elapsedRealtime() - localLong.longValue() < 3600000L)
      {
        this.Fk.a(ImageManager.b(this.Fi), ImageManager.c(this.Fi), true);
        return;
      }
      ImageManager.d(this.Fi).remove(locala.uri);
    }
    this.Fk.a(ImageManager.b(this.Fi), ImageManager.c(this.Fi));
    ImageManager.ImageReceiver localImageReceiver2 = (ImageManager.ImageReceiver)ImageManager.e(this.Fi).get(locala.uri);
    if (localImageReceiver2 == null)
    {
      localImageReceiver2 = new ImageManager.ImageReceiver(this.Fi, locala.uri);
      ImageManager.e(this.Fi).put(locala.uri, localImageReceiver2);
    }
    localImageReceiver2.b(this.Fk);
    if (!(this.Fk instanceof a.c))
      ImageManager.a(this.Fi).put(this.Fk, localImageReceiver2);
    synchronized (ImageManager.fd())
    {
      if (!ImageManager.fe().contains(locala.uri))
      {
        ImageManager.fe().add(locala.uri);
        localImageReceiver2.ff();
      }
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.d
 * JD-Core Version:    0.6.2
 */