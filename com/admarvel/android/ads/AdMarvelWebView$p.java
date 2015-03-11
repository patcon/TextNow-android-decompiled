package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.webkit.URLUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;

class AdMarvelWebView$p
  implements Runnable
{
  private String a = null;
  private final WeakReference<AdMarvelWebView> b;
  private final AdMarvelAd c;

  public AdMarvelWebView$p(AdMarvelWebView paramAdMarvelWebView, String paramString, AdMarvelAd paramAdMarvelAd)
  {
    this.b = new WeakReference(paramAdMarvelWebView);
    this.a = paramString;
    this.c = paramAdMarvelAd;
  }

  public void run()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.b.get();
    if (localAdMarvelWebView == null);
    while ((this.a != null) && (URLUtil.isNetworkUrl(this.a)) && (!ab.f(localAdMarvelWebView.getContext())))
      return;
    AdMarvelInternalWebView.a(localAdMarvelWebView.e, (o)AdMarvelWebView.n(localAdMarvelWebView).get());
    Intent localIntent = new Intent(localAdMarvelWebView.getContext(), AdMarvelActivity.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("expand_url", this.a);
    localIntent.putExtra("closeBtnEnabled", AdMarvelWebView.v(localAdMarvelWebView));
    localIntent.putExtra("closeAreaEnabled", AdMarvelWebView.w(localAdMarvelWebView));
    if (AdMarvelWebView.x(localAdMarvelWebView))
      localIntent.putExtra("orientationState", AdMarvelWebView.y(localAdMarvelWebView));
    localIntent.putExtra("isInterstitial", false);
    localIntent.putExtra("isInterstitialClick", false);
    localIntent.putExtra("source", AdMarvelWebView.i(localAdMarvelWebView));
    localIntent.putExtra("GUID", localAdMarvelWebView.e);
    this.c.removeNonStringEntriesTargetParam();
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
      localObjectOutputStream.writeObject(this.c);
      localObjectOutputStream.close();
      localIntent.putExtra("serialized_admarvelad", localByteArrayOutputStream.toByteArray());
      localAdMarvelWebView.getContext().startActivity(localIntent);
      if (AdMarvelWebView.a(localAdMarvelWebView.e) != null)
        AdMarvelWebView.a(localAdMarvelWebView.e).a();
      new ab(localAdMarvelWebView.getContext(), AdMarvelWebView.d(localAdMarvelWebView)).b(AdMarvelWebView.h(localAdMarvelWebView));
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.p
 * JD-Core Version:    0.6.2
 */