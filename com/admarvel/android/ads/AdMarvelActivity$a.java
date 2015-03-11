package com.admarvel.android.ads;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;

class AdMarvelActivity$a extends AsyncTask<Object, Object, Object>
{
  private final WeakReference<AdMarvelActivity> a;
  private final AdMarvelAd b;

  public AdMarvelActivity$a(AdMarvelActivity paramAdMarvelActivity, AdMarvelAd paramAdMarvelAd)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = paramAdMarvelAd;
  }

  protected Object doInBackground(Object[] paramArrayOfObject)
  {
    AdMarvelActivity localAdMarvelActivity;
    if (this.a != null)
    {
      localAdMarvelActivity = (AdMarvelActivity)this.a.get();
      if (localAdMarvelActivity != null)
        break label29;
    }
    label29: 
    do
    {
      return null;
      localAdMarvelActivity = null;
      break;
      while (true)
      {
        try
        {
          if ((AdMarvelActivity.j(localAdMarvelActivity) == null) || (ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelsdk") == ab.f.c))
            break;
          if ((AdMarvelActivity.s(localAdMarvelActivity)) && (AdMarvelInterstitialAds.getListener() != null))
          {
            AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelsdk", "", ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelsdk"), localAdMarvelActivity), this.b.getSiteId(), this.b.getId(), this.b.getTargetParams(), this.b.getIpAddress());
            AdMarvelActivity.q(localAdMarvelActivity).sendEmptyMessage(0);
            return null;
          }
        }
        catch (Exception localException)
        {
          Logging.log(Log.getStackTraceString(localException));
          localAdMarvelActivity.finish();
          return null;
        }
        if (AdMarvelWebView.a(AdMarvelActivity.c(localAdMarvelActivity)) != null)
          AdMarvelWebView.a(AdMarvelActivity.c(localAdMarvelActivity)).a(this.b, ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelsdk", "", ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelsdk"), localAdMarvelActivity));
      }
      if ((AdMarvelActivity.j(localAdMarvelActivity) != null) && (ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelinternal") != ab.f.c))
      {
        if (AdMarvelActivity.s(localAdMarvelActivity))
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelinternal", "", ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelinternal"), localAdMarvelActivity), this.b.getSiteId(), this.b.getId(), this.b.getTargetParams(), this.b.getIpAddress());
        while (true)
        {
          AdMarvelActivity.q(localAdMarvelActivity).sendEmptyMessage(0);
          return null;
          if (AdMarvelWebView.a(AdMarvelActivity.c(localAdMarvelActivity)) != null)
            AdMarvelWebView.a(AdMarvelActivity.c(localAdMarvelActivity)).a(this.b, ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelinternal", "", ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelinternal"), localAdMarvelActivity));
        }
      }
      if ((AdMarvelActivity.j(localAdMarvelActivity) != null) && (ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelvideo") != ab.f.c))
      {
        if (AdMarvelActivity.s(localAdMarvelActivity))
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, AdMarvelActivity.j(localAdMarvelActivity), this.b.getSiteId(), this.b.getId(), this.b.getTargetParams(), this.b.getIpAddress());
        while (true)
        {
          String str = ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelvideo", "http://", ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelvideo"), localAdMarvelActivity);
          Intent localIntent3 = new Intent("android.intent.action.VIEW");
          localIntent3.addFlags(268435456);
          localIntent3.setDataAndType(Uri.parse(str), "video/*");
          if (ab.a(localAdMarvelActivity.getBaseContext(), localIntent3))
            localAdMarvelActivity.startActivity(localIntent3);
          AdMarvelActivity.q(localAdMarvelActivity).sendEmptyMessage(0);
          return null;
          if (AdMarvelWebView.a(AdMarvelActivity.c(localAdMarvelActivity)) != null)
            AdMarvelWebView.a(AdMarvelActivity.c(localAdMarvelActivity)).a(this.b, AdMarvelActivity.j(localAdMarvelActivity));
        }
      }
      if ((AdMarvelActivity.j(localAdMarvelActivity) != null) && (ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelcustomvideo") != ab.f.c))
      {
        if (AdMarvelActivity.s(localAdMarvelActivity))
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, AdMarvelActivity.j(localAdMarvelActivity), this.b.getSiteId(), this.b.getId(), this.b.getTargetParams(), this.b.getIpAddress());
        while (true)
        {
          Intent localIntent2 = new Intent(localAdMarvelActivity, AdMarvelVideoActivity.class);
          this.b.removeNonStringEntriesTargetParam();
          try
          {
            ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
            localObjectOutputStream.writeObject(this.b);
            localObjectOutputStream.close();
            localIntent2.putExtra("serialized_admarvelad", localByteArrayOutputStream.toByteArray());
            localIntent2.addFlags(268435456);
            localIntent2.putExtra("url", AdMarvelActivity.j(localAdMarvelActivity));
            localIntent2.putExtra("isCustomUrl", true);
            localIntent2.putExtra("xml", AdMarvelActivity.e(localAdMarvelActivity));
            localIntent2.putExtra("source", AdMarvelActivity.t(localAdMarvelActivity));
            localIntent2.putExtra("GUID", AdMarvelActivity.c(localAdMarvelActivity));
            localAdMarvelActivity.startActivity(localIntent2);
            new ab(localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity)).b(AdMarvelActivity.e(localAdMarvelActivity));
            AdMarvelActivity.q(localAdMarvelActivity).sendEmptyMessage(0);
            return null;
            if (AdMarvelWebView.a(AdMarvelActivity.c(localAdMarvelActivity)) != null)
              AdMarvelWebView.a(AdMarvelActivity.c(localAdMarvelActivity)).a(this.b, AdMarvelActivity.j(localAdMarvelActivity));
          }
          catch (IOException localIOException)
          {
            while (true)
              localIOException.printStackTrace();
          }
        }
      }
      if ((AdMarvelActivity.j(localAdMarvelActivity) != null) && (ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelexternal") != ab.f.c))
      {
        Intent localIntent1 = new Intent("android.intent.action.VIEW", Uri.parse(ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelexternal", "", ab.a(AdMarvelActivity.j(localAdMarvelActivity), "admarvelexternal"), localAdMarvelActivity)));
        localIntent1.addFlags(268435456);
        if (ab.a(localAdMarvelActivity.getBaseContext(), localIntent1))
          localAdMarvelActivity.startActivity(localIntent1);
        if (AdMarvelActivity.e(localAdMarvelActivity) != null)
          new ab(localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity)).b(AdMarvelActivity.e(localAdMarvelActivity));
        AdMarvelActivity.q(localAdMarvelActivity).sendEmptyMessage(0);
        return null;
      }
      if (!ab.b(localAdMarvelActivity, AdMarvelActivity.j(localAdMarvelActivity)))
        break label995;
      new ab(localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity)).b(AdMarvelActivity.e(localAdMarvelActivity));
      AdMarvelActivity.q(localAdMarvelActivity).sendEmptyMessage(0);
    }
    while (AdMarvelWebView.a(AdMarvelActivity.c(localAdMarvelActivity)) == null);
    AdMarvelWebView.a(AdMarvelActivity.c(localAdMarvelActivity)).a(this.b, AdMarvelActivity.j(localAdMarvelActivity));
    return null;
    label995: AdMarvelActivity.u(localAdMarvelActivity).sendEmptyMessage(0);
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.a
 * JD-Core Version:    0.6.2
 */