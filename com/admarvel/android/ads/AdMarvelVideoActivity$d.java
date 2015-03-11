package com.admarvel.android.ads;

import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

class AdMarvelVideoActivity$d
  implements Runnable
{
  private final WeakReference<String> b;
  private final WeakReference<ImageView> c;

  public AdMarvelVideoActivity$d(AdMarvelVideoActivity paramAdMarvelVideoActivity, ImageView paramImageView, String paramString)
  {
    this.b = new WeakReference(paramString);
    this.c = new WeakReference(paramImageView);
  }

  public void run()
  {
    if ((this.c.get() != null) && (this.b.get() != null))
    {
      AdMarvelVideoActivity.c localc = new AdMarvelVideoActivity.c(this.a, (ImageView)this.c.get());
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = ((String)this.b.get());
      localc.executeOnExecutor(localExecutor, arrayOfString);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.d
 * JD-Core Version:    0.6.2
 */