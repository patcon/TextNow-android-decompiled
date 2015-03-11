package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class ImageManager$f
  implements Runnable
{
  private boolean KG;
  private final Bitmap mBitmap;
  private final Uri mUri;
  private final CountDownLatch mg;

  public ImageManager$f(ImageManager paramImageManager, Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
  {
    this.mUri = paramUri;
    this.mBitmap = paramBitmap;
    this.KG = paramBoolean;
    this.mg = paramCountDownLatch;
  }

  private void a(ImageManager.ImageReceiver paramImageReceiver, boolean paramBoolean)
  {
    ArrayList localArrayList = ImageManager.ImageReceiver.a(paramImageReceiver);
    int i = localArrayList.size();
    int j = 0;
    if (j < i)
    {
      a locala = (a)localArrayList.get(j);
      if (paramBoolean)
        locala.a(ImageManager.b(this.KD), this.mBitmap, false);
      while (true)
      {
        if (!(locala instanceof a.c))
          ImageManager.a(this.KD).remove(locala);
        j++;
        break;
        ImageManager.d(this.KD).put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
        locala.a(ImageManager.b(this.KD), ImageManager.c(this.KD), false);
      }
    }
  }

  public final void run()
  {
    com.google.android.gms.common.internal.a.aT("OnBitmapLoadedRunnable must be executed in the main thread");
    boolean bool;
    if (this.mBitmap != null)
      bool = true;
    while (ImageManager.h(this.KD) != null)
      if (this.KG)
      {
        ImageManager.h(this.KD).evictAll();
        System.gc();
        this.KG = false;
        ImageManager.g(this.KD).post(this);
        return;
        bool = false;
      }
      else if (bool)
      {
        ImageManager.h(this.KD).put(new a.a(this.mUri), this.mBitmap);
      }
    ImageManager.ImageReceiver localImageReceiver = (ImageManager.ImageReceiver)ImageManager.e(this.KD).remove(this.mUri);
    if (localImageReceiver != null)
      a(localImageReceiver, bool);
    this.mg.countDown();
    synchronized (ImageManager.gH())
    {
      ImageManager.gI().remove(this.mUri);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.f
 * JD-Core Version:    0.6.2
 */