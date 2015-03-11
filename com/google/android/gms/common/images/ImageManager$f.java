package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.gx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class ImageManager$f
  implements Runnable
{
  private boolean Fl;
  private final CountDownLatch kK;
  private final Bitmap mBitmap;
  private final Uri mUri;

  public ImageManager$f(ImageManager paramImageManager, Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
  {
    this.mUri = paramUri;
    this.mBitmap = paramBitmap;
    this.Fl = paramBoolean;
    this.kK = paramCountDownLatch;
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
        locala.a(ImageManager.b(this.Fi), this.mBitmap, false);
      while (true)
      {
        if (!(locala instanceof a.c))
          ImageManager.a(this.Fi).remove(locala);
        j++;
        break;
        ImageManager.d(this.Fi).put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
        locala.a(ImageManager.b(this.Fi), ImageManager.c(this.Fi), false);
      }
    }
  }

  public final void run()
  {
    gx.ay("OnBitmapLoadedRunnable must be executed in the main thread");
    boolean bool;
    if (this.mBitmap != null)
      bool = true;
    while (ImageManager.h(this.Fi) != null)
      if (this.Fl)
      {
        ImageManager.h(this.Fi).evictAll();
        System.gc();
        this.Fl = false;
        ImageManager.g(this.Fi).post(this);
        return;
        bool = false;
      }
      else if (bool)
      {
        ImageManager.h(this.Fi).put(new a.a(this.mUri), this.mBitmap);
      }
    ImageManager.ImageReceiver localImageReceiver = (ImageManager.ImageReceiver)ImageManager.e(this.Fi).remove(this.mUri);
    if (localImageReceiver != null)
      a(localImageReceiver, bool);
    this.kK.countDown();
    synchronized (ImageManager.fd())
    {
      ImageManager.fe().remove(this.mUri);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.f
 * JD-Core Version:    0.6.2
 */