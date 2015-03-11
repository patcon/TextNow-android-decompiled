package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;

class AdMarvelWebView$ac
  implements Runnable
{
  private String a;
  private final WeakReference<AdMarvelWebView> b;
  private final AdMarvelAd c;

  public AdMarvelWebView$ac(String paramString, AdMarvelWebView paramAdMarvelWebView, AdMarvelAd paramAdMarvelAd)
  {
    this.a = paramString;
    this.b = new WeakReference(paramAdMarvelWebView);
    this.c = paramAdMarvelAd;
  }

  public void run()
  {
    AdMarvelWebView localAdMarvelWebView;
    Context localContext;
    try
    {
      localAdMarvelWebView = (AdMarvelWebView)this.b.get();
      if (localAdMarvelWebView == null)
        return;
      if (!AdMarvelWebView.g(localAdMarvelWebView))
        break label605;
      localContext = localAdMarvelWebView.getContext();
      if ((!AdMarvelView.b) || (ab.e(this.a)))
        break label208;
      if ((URLUtil.isNetworkUrl(this.a)) && (ab.b(localContext, this.a)))
      {
        if (AdMarvelWebView.a(localAdMarvelWebView.e) == null)
          return;
        AdMarvelWebView.a(localAdMarvelWebView.e).a(this.c, this.a);
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(localException.getMessage() + " Exception in RedirectRunnable ");
      return;
    }
    String str2 = localAdMarvelWebView.getAdMarvelAd().getOfflinekeyUrl();
    if (ab.b(localContext, str2.substring(0, str2.lastIndexOf("/")) + "/" + this.a))
    {
      if (AdMarvelWebView.a(localAdMarvelWebView.e) == null)
        return;
      AdMarvelWebView.a(localAdMarvelWebView.e).a(this.c, this.a);
      return;
      label208: if ((!ab.e(this.a)) && (ab.b(localAdMarvelWebView.getContext(), this.a)))
      {
        new ab(localAdMarvelWebView.getContext(), AdMarvelWebView.d(localAdMarvelWebView)).b(AdMarvelWebView.h(localAdMarvelWebView));
        if (AdMarvelWebView.a(localAdMarvelWebView.e) == null)
          return;
        AdMarvelWebView.a(localAdMarvelWebView.e).a(this.c, this.a);
        return;
      }
    }
    if ((this.a != null) && (ab.a(this.a, "admarvelsdk") != ab.f.c))
    {
      if (AdMarvelWebView.a(localAdMarvelWebView.e) != null)
        AdMarvelWebView.a(localAdMarvelWebView.e).a(this.c, ab.a(this.a, "admarvelsdk", "", ab.a(this.a, "admarvelsdk"), localAdMarvelWebView.getContext()));
      new ab(localAdMarvelWebView.getContext(), AdMarvelWebView.d(localAdMarvelWebView)).b(AdMarvelWebView.h(localAdMarvelWebView));
      return;
    }
    if ((this.a != null) && (ab.a(this.a, "admarvelinternal") != ab.f.c))
    {
      if (AdMarvelWebView.a(localAdMarvelWebView.e) != null)
        AdMarvelWebView.a(localAdMarvelWebView.e).a(this.c, ab.a(this.a, "admarvelinternal", "", ab.a(this.a, "admarvelinternal"), localAdMarvelWebView.getContext()));
      new ab(localAdMarvelWebView.getContext(), AdMarvelWebView.d(localAdMarvelWebView)).b(AdMarvelWebView.h(localAdMarvelWebView));
      return;
    }
    if ((ab.f(localContext)) && (this.a != null) && (ab.a(this.a, "admarvelvideo") != ab.f.c))
    {
      String str1 = ab.a(this.a, "admarvelvideo", "http://", ab.a(this.a, "admarvelvideo"), localAdMarvelWebView.getContext());
      Intent localIntent4 = new Intent("android.intent.action.VIEW");
      localIntent4.addFlags(268435456);
      localIntent4.setDataAndType(Uri.parse(str1), "video/*");
      if (ab.a(localAdMarvelWebView.getContext(), localIntent4))
        localAdMarvelWebView.getContext().startActivity(localIntent4);
      new ab(localAdMarvelWebView.getContext(), AdMarvelWebView.d(localAdMarvelWebView)).b(AdMarvelWebView.h(localAdMarvelWebView));
    }
    while (true)
      label605: if (AdMarvelWebView.a(localAdMarvelWebView.e) != null)
      {
        AdMarvelWebView.a(localAdMarvelWebView.e).a(this.c, this.a);
        return;
        if ((ab.f(localContext)) && (this.a != null) && (ab.a(this.a, "admarvelexternal") != ab.f.c))
        {
          Intent localIntent3 = new Intent("android.intent.action.VIEW", Uri.parse(ab.a(this.a, "admarvelexternal", "", ab.a(this.a, "admarvelexternal"), localAdMarvelWebView.getContext())));
          localIntent3.addFlags(268435456);
          if (ab.a(localAdMarvelWebView.getContext(), localIntent3))
            localAdMarvelWebView.getContext().startActivity(localIntent3);
          new ab(localAdMarvelWebView.getContext(), AdMarvelWebView.d(localAdMarvelWebView)).b(AdMarvelWebView.h(localAdMarvelWebView));
        }
        else if ((ab.f(localContext)) && (this.a != null) && (ab.a(this.a, "admarvelcustomvideo") != ab.f.c))
        {
          Intent localIntent2 = new Intent(localAdMarvelWebView.getContext(), AdMarvelVideoActivity.class);
          localIntent2.addFlags(268435456);
          this.c.removeNonStringEntriesTargetParam();
          try
          {
            ByteArrayOutputStream localByteArrayOutputStream2 = new ByteArrayOutputStream();
            ObjectOutputStream localObjectOutputStream2 = new ObjectOutputStream(localByteArrayOutputStream2);
            localObjectOutputStream2.writeObject(this.c);
            localObjectOutputStream2.close();
            localIntent2.putExtra("serialized_admarvelad", localByteArrayOutputStream2.toByteArray());
            localIntent2.putExtra("url", this.a);
            localIntent2.putExtra("isCustomUrl", true);
            localIntent2.putExtra("xml", AdMarvelWebView.h(localAdMarvelWebView));
            localIntent2.putExtra("source", AdMarvelWebView.i(localAdMarvelWebView));
            localIntent2.putExtra("GUID", localAdMarvelWebView.e);
            localAdMarvelWebView.getContext().startActivity(localIntent2);
            new ab(localAdMarvelWebView.getContext(), AdMarvelWebView.d(localAdMarvelWebView)).b(AdMarvelWebView.h(localAdMarvelWebView));
          }
          catch (IOException localIOException2)
          {
            while (true)
              localIOException2.printStackTrace();
          }
        }
        else if ((ab.f(localContext)) && (this.a != null) && (this.a.length() > 0))
        {
          Intent localIntent1 = new Intent(localAdMarvelWebView.getContext(), AdMarvelActivity.class);
          localIntent1.addFlags(268435456);
          localIntent1.putExtra("url", this.a);
          localIntent1.putExtra("isInterstitial", false);
          localIntent1.putExtra("isInterstitialClick", false);
          localIntent1.putExtra("xml", AdMarvelWebView.h(localAdMarvelWebView));
          localIntent1.putExtra("source", AdMarvelWebView.i(localAdMarvelWebView));
          localIntent1.putExtra("GUID", localAdMarvelWebView.e);
          this.c.removeNonStringEntriesTargetParam();
          try
          {
            ByteArrayOutputStream localByteArrayOutputStream1 = new ByteArrayOutputStream();
            ObjectOutputStream localObjectOutputStream1 = new ObjectOutputStream(localByteArrayOutputStream1);
            localObjectOutputStream1.writeObject(this.c);
            localObjectOutputStream1.close();
            localIntent1.putExtra("serialized_admarvelad", localByteArrayOutputStream1.toByteArray());
            localAdMarvelWebView.getContext().startActivity(localIntent1);
            new ab(localAdMarvelWebView.getContext(), AdMarvelWebView.d(localAdMarvelWebView)).b(AdMarvelWebView.h(localAdMarvelWebView));
          }
          catch (IOException localIOException1)
          {
            while (true)
              localIOException1.printStackTrace();
          }
        }
      }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.ac
 * JD-Core Version:    0.6.2
 */