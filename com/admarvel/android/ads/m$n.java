package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.webkit.URLUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;

class m$n
  implements Runnable
{
  private String a = null;
  private final WeakReference<m> b;
  private final AdMarvelAd c;

  public m$n(m paramm, String paramString, AdMarvelAd paramAdMarvelAd)
  {
    this.b = new WeakReference(paramm);
    this.a = paramString;
    this.c = paramAdMarvelAd;
  }

  public void run()
  {
    m localm = (m)this.b.get();
    if (localm == null);
    while ((this.a != null) && (URLUtil.isNetworkUrl(this.a)) && (!r.f(localm.getContext())))
      return;
    d.a(localm.s, (i)m.h(localm).get());
    Intent localIntent;
    if (localm.R)
      localIntent = new Intent(localm.getContext(), AdMarvelPostitialActivity.class);
    while (true)
    {
      localIntent.addFlags(268435456);
      if (localm.R)
        localIntent.addFlags(8388608);
      localIntent.putExtra("expand_url", this.a);
      localIntent.putExtra("closeBtnEnabled", localm.i);
      localIntent.putExtra("closeAreaEnabled", localm.h);
      if (localm.w)
        localIntent.putExtra("orientationState", localm.o);
      localIntent.putExtra("isInterstitial", false);
      localIntent.putExtra("isInterstitialClick", false);
      localIntent.putExtra("source", m.g(localm));
      localIntent.putExtra("GUID", localm.s);
      this.c.removeNonStringEntriesTargetParam();
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
        localObjectOutputStream.writeObject(this.c);
        localObjectOutputStream.close();
        localIntent.putExtra("serialized_admarvelad", localByteArrayOutputStream.toByteArray());
        localm.getContext().startActivity(localIntent);
        if (m.a(localm.s) != null)
          m.a(localm.s).a();
        new r(localm.getContext()).c(m.f(localm));
        return;
        localIntent = new Intent(localm.getContext(), AdMarvelActivity.class);
      }
      catch (IOException localIOException)
      {
        while (true)
          localIOException.printStackTrace();
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.n
 * JD-Core Version:    0.6.2
 */