package com.admarvel.android.ads;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;

class AdMarvelActivity$u
  implements Runnable
{
  private String a;
  private final WeakReference<AdMarvelActivity> b;
  private final AdMarvelAd c;

  public AdMarvelActivity$u(String paramString, AdMarvelActivity paramAdMarvelActivity, AdMarvelAd paramAdMarvelAd)
  {
    this.a = paramString;
    this.b = new WeakReference(paramAdMarvelActivity);
    this.c = paramAdMarvelAd;
  }

  public void run()
  {
    if (this.b != null);
    for (AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.b.get(); localAdMarvelActivity == null; localAdMarvelActivity = null)
      return;
    if (AdMarvelInterstitialAds.getEnableClickRedirect())
      try
      {
        if ((this.a != null) && (AdMarvelInterstitialAds.enableOfflineSDK) && (!ab.e(this.a)))
          if ((URLUtil.isNetworkUrl(this.a)) && (ab.b(localAdMarvelActivity, this.a)))
          {
            AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, this.a, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
            return;
          }
      }
      catch (Exception localException)
      {
        Logging.log(localException.getMessage() + "Exception in RedirectRunnable ");
      }
    while (true)
    {
      AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, this.a, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
      return;
      String str2 = this.c.getOfflinekeyUrl();
      if (ab.b(localAdMarvelActivity, str2.substring(0, str2.lastIndexOf("/")) + "/" + this.a))
      {
        AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, this.a, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
        return;
        if ((this.a != null) && (!ab.e(this.a)) && (ab.b(localAdMarvelActivity, this.a)))
        {
          new ab(localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity)).b(AdMarvelActivity.e(localAdMarvelActivity));
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, this.a, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
          return;
        }
      }
      if ((this.a != null) && (ab.a(this.a, "admarvelsdk") != ab.f.c))
      {
        AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, ab.a(this.a, "admarvelsdk", "", ab.a(this.a, "admarvelsdk"), localAdMarvelActivity), this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
        new ab(localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity)).b(AdMarvelActivity.e(localAdMarvelActivity));
        return;
      }
      if ((this.a != null) && (ab.a(this.a, "admarvelinternal") != ab.f.c))
      {
        AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, ab.a(this.a, "admarvelinternal", "", ab.a(this.a, "admarvelinternal"), localAdMarvelActivity), this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
        new ab(localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity)).b(AdMarvelActivity.e(localAdMarvelActivity));
        return;
      }
      if ((ab.f(localAdMarvelActivity)) && (this.a != null) && (ab.a(this.a, "admarvelvideo") != ab.f.c))
      {
        String str1 = ab.a(this.a, "admarvelvideo", "http://", ab.a(this.a, "admarvelvideo"), localAdMarvelActivity);
        Intent localIntent3 = new Intent("android.intent.action.VIEW");
        localIntent3.addFlags(268435456);
        localIntent3.setDataAndType(Uri.parse(str1), "video/*");
        if (ab.a(localAdMarvelActivity.getBaseContext(), localIntent3))
          localAdMarvelActivity.startActivity(localIntent3);
        new ab(localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity)).b(AdMarvelActivity.e(localAdMarvelActivity));
        continue;
      }
      if ((ab.f(localAdMarvelActivity)) && (this.a != null) && (ab.a(this.a, "admarvelexternal") != ab.f.c))
      {
        Intent localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse(ab.a(this.a, "admarvelexternal", "", ab.a(this.a, "admarvelexternal"), localAdMarvelActivity)));
        localIntent2.addFlags(268435456);
        if (ab.a(localAdMarvelActivity.getBaseContext(), localIntent2))
          localAdMarvelActivity.startActivity(localIntent2);
        new ab(localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity)).b(AdMarvelActivity.e(localAdMarvelActivity));
        continue;
      }
      if ((!ab.f(localAdMarvelActivity)) || (this.a == null) || (this.a.length() <= 0))
        continue;
      Intent localIntent1 = new Intent(localAdMarvelActivity.getBaseContext(), AdMarvelActivity.class);
      localIntent1.addFlags(268435456);
      localIntent1.putExtra("url", this.a);
      localIntent1.putExtra("isInterstitial", false);
      localIntent1.putExtra("isInterstitialClick", true);
      localIntent1.putExtra("xml", AdMarvelActivity.e(localAdMarvelActivity));
      localIntent1.putExtra("GUID", AdMarvelActivity.c(localAdMarvelActivity));
      this.c.removeNonStringEntriesTargetParam();
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
        localObjectOutputStream.writeObject(this.c);
        localObjectOutputStream.close();
        localIntent1.putExtra("serialized_admarvelad", localByteArrayOutputStream.toByteArray());
        if (localAdMarvelActivity.f() != null)
          localIntent1.putExtra("source", AdMarvelActivity.t(localAdMarvelActivity));
        localAdMarvelActivity.startActivity(localIntent1);
        new ab(localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity)).b(AdMarvelActivity.e(localAdMarvelActivity));
      }
      catch (IOException localIOException)
      {
        while (true)
          localIOException.printStackTrace();
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.u
 * JD-Core Version:    0.6.2
 */