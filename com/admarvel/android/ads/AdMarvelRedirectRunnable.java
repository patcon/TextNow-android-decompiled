package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.URLUtil;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;

public class AdMarvelRedirectRunnable
  implements Runnable
{
  private final String GUID;
  private final AdMarvelAd adMarvelAd;
  private final String adType;
  private final boolean isClickRedirectEnabled;
  private final boolean isOfflineSDK;
  private final boolean isPostitialView;
  private final WeakReference<Context> mContextReference;
  private final String url;

  public AdMarvelRedirectRunnable(String paramString1, Context paramContext, AdMarvelAd paramAdMarvelAd, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.url = paramString1;
    this.mContextReference = new WeakReference(paramContext);
    this.adMarvelAd = paramAdMarvelAd;
    this.adType = paramString2;
    this.GUID = paramString3;
    this.isClickRedirectEnabled = paramBoolean1;
    this.isOfflineSDK = paramBoolean2;
    this.isPostitialView = paramBoolean3;
  }

  public void run()
  {
    final Context localContext = (Context)this.mContextReference.get();
    if (localContext == null);
    label1481: 
    do
    {
      while (true)
      {
        return;
        if (this.isClickRedirectEnabled)
          try
          {
            if ((this.url != null) && (this.isOfflineSDK) && (!r.g(this.url)))
              if ((URLUtil.isNetworkUrl(this.url)) && (r.a(localContext, this.url, this.isPostitialView)))
                if (this.adType.equals("banner"))
                {
                  if (m.a(this.GUID) == null)
                    continue;
                  m.a(this.GUID).a(this.adMarvelAd, this.url);
                }
          }
          catch (Exception localException1)
          {
            Logging.log(localException1.getMessage() + "Exception in RedirectRunnable ");
          }
      }
      while (true)
        if (this.adType.equals("banner"))
        {
          if (m.a(this.GUID) == null)
            break;
          m.a(this.GUID).a(this.adMarvelAd, this.url);
          return;
          if (this.adType.equals("interstitial"))
          {
            AdMarvelInterstitialAds.getListener().a(localContext, this.url, this.adMarvelAd.getSiteId(), this.adMarvelAd.getId(), this.adMarvelAd.getTargetParams(), this.adMarvelAd.getIpAddress());
            return;
          }
          String str2 = this.adMarvelAd.getOfflinekeyUrl();
          if (r.a(localContext, str2.substring(0, str2.lastIndexOf("/")) + "/" + this.url, this.isPostitialView))
          {
            if (this.adType.equals("banner"))
            {
              if (m.a(this.GUID) == null)
                break;
              m.a(this.GUID).a(this.adMarvelAd, this.url);
              return;
            }
            if (this.adType.equals("interstitial"))
            {
              AdMarvelInterstitialAds.getListener().a(localContext, this.url, this.adMarvelAd.getSiteId(), this.adMarvelAd.getId(), this.adMarvelAd.getTargetParams(), this.adMarvelAd.getIpAddress());
              return;
              if ((this.url != null) && (!r.g(this.url)) && (r.a(localContext, this.url, this.isPostitialView)))
              {
                if (!this.adType.equals("native"))
                  new r(localContext).c(this.adMarvelAd.getXml());
                if (this.adType.equals("banner"))
                {
                  if (m.a(this.GUID) == null)
                    break;
                  m.a(this.GUID).a(this.adMarvelAd, this.url);
                  return;
                }
                if (this.adType.equals("interstitial"))
                {
                  AdMarvelInterstitialAds.getListener().a(localContext, this.url, this.adMarvelAd.getSiteId(), this.adMarvelAd.getId(), this.adMarvelAd.getTargetParams(), this.adMarvelAd.getIpAddress());
                  return;
                }
              }
            }
          }
          if ((this.url != null) && (r.a(this.url, "admarvelsdk") != r.q.c))
          {
            if (this.adType.equals("banner"))
              if (m.a(this.GUID) != null)
                m.a(this.GUID).a(this.adMarvelAd, r.a(this.url, "admarvelsdk", "", r.a(this.url, "admarvelsdk"), localContext));
            while (!this.adType.equals("native"))
            {
              new r(localContext).c(this.adMarvelAd.getXml());
              return;
              if (this.adType.equals("interstitial"))
                AdMarvelInterstitialAds.getListener().a(localContext, r.a(this.url, "admarvelsdk", "", r.a(this.url, "admarvelsdk"), localContext), this.adMarvelAd.getSiteId(), this.adMarvelAd.getId(), this.adMarvelAd.getTargetParams(), this.adMarvelAd.getIpAddress());
            }
            break;
          }
          if ((this.url != null) && (r.a(this.url, "admarvelinternal") != r.q.c))
          {
            if (this.adType.equals("banner"))
              if (m.a(this.GUID) != null)
                m.a(this.GUID).a(this.adMarvelAd, r.a(this.url, "admarvelinternal", "", r.a(this.url, "admarvelinternal"), localContext));
            while (!this.adType.equals("native"))
            {
              new r(localContext).c(this.adMarvelAd.getXml());
              return;
              if (this.adType.equals("interstitial"))
                AdMarvelInterstitialAds.getListener().a(localContext, r.a(this.url, "admarvelinternal", "", r.a(this.url, "admarvelinternal"), localContext), this.adMarvelAd.getSiteId(), this.adMarvelAd.getId(), this.adMarvelAd.getTargetParams(), this.adMarvelAd.getIpAddress());
            }
            break;
          }
          if ((r.f(localContext)) && (this.url != null) && (r.a(this.url, "admarvelvideo") != r.q.c))
          {
            String str1 = r.a(this.url, "admarvelvideo", "http://", r.a(this.url, "admarvelvideo"), localContext);
            Intent localIntent5 = new Intent("android.intent.action.VIEW");
            localIntent5.addFlags(268435456);
            localIntent5.setDataAndType(Uri.parse(str1), "video/*");
            if (r.a(localContext, localIntent5))
              localContext.startActivity(localIntent5);
            if (this.adType.equals("native"))
              continue;
            new r(localContext).c(this.adMarvelAd.getXml());
            continue;
          }
          if ((r.f(localContext)) && (this.url != null) && (r.a(this.url, "admarvelexternal") != r.q.c))
          {
            Intent localIntent4 = new Intent("android.intent.action.VIEW", Uri.parse(r.a(this.url, "admarvelexternal", "", r.a(this.url, "admarvelexternal"), localContext)));
            localIntent4.addFlags(268435456);
            if (r.a(localContext, localIntent4))
              localContext.startActivity(localIntent4);
            if (this.adType.equals("native"))
              continue;
            new r(localContext).c(this.adMarvelAd.getXml());
            continue;
          }
          if ((r.f(localContext)) && (this.url != null) && (r.a(this.url, "admarvelcustomvideo") != r.q.c))
          {
            final Intent localIntent3 = new Intent(localContext, AdMarvelVideoActivity.class);
            localIntent3.addFlags(268435456);
            if (!this.adType.equals("native"))
              this.adMarvelAd.removeNonStringEntriesTargetParam();
            try
            {
              ByteArrayOutputStream localByteArrayOutputStream2 = new ByteArrayOutputStream();
              ObjectOutputStream localObjectOutputStream2 = new ObjectOutputStream(localByteArrayOutputStream2);
              localObjectOutputStream2.writeObject(this.adMarvelAd);
              localObjectOutputStream2.close();
              localIntent3.putExtra("serialized_admarvelad", localByteArrayOutputStream2.toByteArray());
              localIntent3.putExtra("xml", this.adMarvelAd.getXml());
              localIntent3.putExtra("source", this.adMarvelAd.getSource());
              localIntent3.putExtra("url", this.url);
              localIntent3.putExtra("isCustomUrl", true);
              localIntent3.putExtra("GUID", this.GUID);
            }
            catch (IOException localIOException2)
            {
              try
              {
                new Handler(Looper.getMainLooper()).post(new Runnable()
                {
                  public void run()
                  {
                    localContext.startActivity(localIntent3);
                  }
                });
                if (this.adType.equals("native"))
                  continue;
                new r(localContext).c(this.adMarvelAd.getXml());
                continue;
                localIOException2 = localIOException2;
                localIOException2.printStackTrace();
              }
              catch (Exception localException2)
              {
                while (true)
                  localException2.printStackTrace();
              }
            }
          }
          if ((!r.f(localContext)) || (this.url == null) || (this.url.length() <= 0))
            continue;
          Intent localIntent2;
          Object localObject;
          if (this.adType.equals("banner"))
            if (this.isPostitialView)
            {
              localIntent2 = new Intent(localContext, AdMarvelPostitialActivity.class);
              localIntent2.addFlags(268435456);
              if (this.isPostitialView)
                localIntent2.addFlags(8388608);
              localIntent2.putExtra("url", this.url);
              localIntent2.putExtra("isInterstitial", false);
              localIntent2.putExtra("isInterstitialClick", false);
              localIntent2.putExtra("xml", this.adMarvelAd.getXml());
              localObject = localIntent2;
              ((Intent)localObject).putExtra("GUID", this.GUID);
              if (!this.adType.equals("native"))
                this.adMarvelAd.removeNonStringEntriesTargetParam();
            }
          try
          {
            ByteArrayOutputStream localByteArrayOutputStream1 = new ByteArrayOutputStream();
            ObjectOutputStream localObjectOutputStream1 = new ObjectOutputStream(localByteArrayOutputStream1);
            localObjectOutputStream1.writeObject(this.adMarvelAd);
            localObjectOutputStream1.close();
            ((Intent)localObject).putExtra("serialized_admarvelad", localByteArrayOutputStream1.toByteArray());
            if (this.adMarvelAd.getSource() != null)
              ((Intent)localObject).putExtra("source", this.adMarvelAd.getSource());
            localContext.startActivity((Intent)localObject);
            if (!this.adType.equals("native"))
            {
              new r(localContext).c(this.adMarvelAd.getXml());
              continue;
              localIntent2 = new Intent(localContext, AdMarvelActivity.class);
              break label1481;
              Intent localIntent1 = new Intent(localContext, AdMarvelActivity.class);
              localIntent1.addFlags(268435456);
              localIntent1.putExtra("url", this.url);
              localIntent1.putExtra("isInterstitial", false);
              if (this.adType.equals("native"))
              {
                localIntent1.putExtra("isInterstitialClick", false);
                localObject = localIntent1;
                break label1558;
              }
              localIntent1.putExtra("isInterstitialClick", true);
              localIntent1.putExtra("xml", this.adMarvelAd.getXml());
              localObject = localIntent1;
            }
          }
          catch (IOException localIOException1)
          {
            while (true)
              localIOException1.printStackTrace();
          }
        }
    }
    while (!this.adType.equals("interstitial"));
    label1558: AdMarvelInterstitialAds.getListener().a(localContext, this.url, this.adMarvelAd.getSiteId(), this.adMarvelAd.getId(), this.adMarvelAd.getTargetParams(), this.adMarvelAd.getIpAddress());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelRedirectRunnable
 * JD-Core Version:    0.6.2
 */