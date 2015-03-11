package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

class AdMarvelInterstitialAds$b
  implements Runnable
{
  private final Map<String, Object> a;
  private final String b;
  private final String c;
  private final String d;
  private final int e;
  private final String f;
  private final WeakReference<AdMarvelInterstitialAds> g;
  private final int h;
  private final String i;
  private final WeakReference<Context> j;
  private final Handler k;

  public AdMarvelInterstitialAds$b(Map<String, Object> paramMap, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, AdMarvelInterstitialAds paramAdMarvelInterstitialAds, int paramInt2, String paramString5, Context paramContext, Handler paramHandler)
  {
    this.a = paramMap;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramInt1;
    this.f = paramString4;
    this.g = new WeakReference(paramAdMarvelInterstitialAds);
    this.h = paramInt2;
    this.i = paramString5;
    this.j = new WeakReference(paramContext);
    this.k = paramHandler;
  }

  public void run()
  {
    AdMarvelInterstitialAds localAdMarvelInterstitialAds = (AdMarvelInterstitialAds)this.g.get();
    Context localContext = (Context)this.j.get();
    if ((localAdMarvelInterstitialAds != null) && (localContext != null))
    {
      j localj = new j(localContext);
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      Object[] arrayOfObject = new Object[10];
      arrayOfObject[0] = this.a;
      arrayOfObject[1] = this.b;
      arrayOfObject[2] = this.c;
      arrayOfObject[3] = this.d;
      arrayOfObject[4] = Integer.valueOf(this.e);
      arrayOfObject[5] = this.f;
      arrayOfObject[6] = localAdMarvelInterstitialAds;
      arrayOfObject[7] = Integer.valueOf(this.h);
      arrayOfObject[8] = this.i;
      arrayOfObject[9] = this.k;
      localj.executeOnExecutor(localExecutor, arrayOfObject);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInterstitialAds.b
 * JD-Core Version:    0.6.2
 */