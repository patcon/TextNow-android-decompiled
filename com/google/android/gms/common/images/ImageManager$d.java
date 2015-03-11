package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Map;

final class ImageManager$d
  implements Runnable
{
  private final a KF;

  public ImageManager$d(ImageManager paramImageManager, a parama)
  {
    this.KF = parama;
  }

  public final void run()
  {
    com.google.android.gms.common.internal.a.aT("LoadImageRunnable must be executed on the main thread");
    ImageManager.ImageReceiver localImageReceiver1 = (ImageManager.ImageReceiver)ImageManager.a(this.KD).get(this.KF);
    if (localImageReceiver1 != null)
    {
      ImageManager.a(this.KD).remove(this.KF);
      localImageReceiver1.c(this.KF);
    }
    a.a locala = this.KF.KH;
    if (locala.uri == null)
    {
      this.KF.a(ImageManager.b(this.KD), ImageManager.c(this.KD), true);
      return;
    }
    Bitmap localBitmap = ImageManager.a(this.KD, locala);
    if (localBitmap != null)
    {
      this.KF.a(ImageManager.b(this.KD), localBitmap, true);
      return;
    }
    Long localLong = (Long)ImageManager.d(this.KD).get(locala.uri);
    if (localLong != null)
    {
      if (SystemClock.elapsedRealtime() - localLong.longValue() < 3600000L)
      {
        this.KF.a(ImageManager.b(this.KD), ImageManager.c(this.KD), true);
        return;
      }
      ImageManager.d(this.KD).remove(locala.uri);
    }
    this.KF.a(ImageManager.b(this.KD), ImageManager.c(this.KD));
    ImageManager.ImageReceiver localImageReceiver2 = (ImageManager.ImageReceiver)ImageManager.e(this.KD).get(locala.uri);
    if (localImageReceiver2 == null)
    {
      localImageReceiver2 = new ImageManager.ImageReceiver(this.KD, locala.uri);
      ImageManager.e(this.KD).put(locala.uri, localImageReceiver2);
    }
    localImageReceiver2.b(this.KF);
    if (!(this.KF instanceof a.c))
      ImageManager.a(this.KD).put(this.KF, localImageReceiver2);
    synchronized (ImageManager.gH())
    {
      if (!ImageManager.gI().contains(locala.uri))
      {
        ImageManager.gI().add(locala.uri);
        localImageReceiver2.gJ();
      }
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.d
 * JD-Core Version:    0.6.2
 */