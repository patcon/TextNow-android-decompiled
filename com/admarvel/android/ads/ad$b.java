package com.admarvel.android.ads;

import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

class ad$b
  implements Runnable
{
  private final WeakReference<ImageView> b;
  private String c;

  public ad$b(ad paramad, ImageView paramImageView, String paramString)
  {
    this.b = new WeakReference(paramImageView);
    this.c = paramString;
  }

  public void run()
  {
    if (this.b.get() != null)
    {
      ad.a locala = new ad.a(this.a, (ImageView)this.b.get());
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.c;
      locala.executeOnExecutor(localExecutor, arrayOfString);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.ad.b
 * JD-Core Version:    0.6.2
 */