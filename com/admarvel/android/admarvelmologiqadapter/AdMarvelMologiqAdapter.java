package com.admarvel.android.admarvelmologiqadapter;

import android.content.Context;
import com.admarvel.android.ads.AdMarvelAnalyticsAdapter;
import com.mologiq.analytics.a;
import java.lang.ref.WeakReference;
import java.util.Map;

public class AdMarvelMologiqAdapter extends AdMarvelAnalyticsAdapter
{
  private final WeakReference contextReference;

  public AdMarvelMologiqAdapter(Context paramContext)
  {
    super(paramContext);
    this.contextReference = new WeakReference(paramContext);
  }

  public void enableAppInstallCheck(boolean paramBoolean)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
    {
      a.a(localContext);
      a.a(localContext, paramBoolean);
    }
  }

  public String getAdapterAnalyticsVersion()
  {
    return "1.3.6 2014-11-17";
  }

  public Map getEnhancedTargetParams(String paramString, Map paramMap)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      return a.a(localContext).a(paramString, paramMap);
    return null;
  }

  public void onAdClick(String paramString1, int paramInt, Map paramMap, String paramString2, String paramString3)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      a.a(localContext).c(paramString1, paramInt, paramMap, paramString3);
  }

  public void onFailedToReceiveAd(String paramString1, int paramInt, Map paramMap, String paramString2)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      a.a(localContext).a(paramString1, paramInt, paramMap, paramString2);
  }

  public void onReceiveAd(String paramString1, int paramInt, Map paramMap, String paramString2)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      a.a(localContext).b(paramString1, paramInt, paramMap, paramString2);
  }

  public void pause()
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      a.a(localContext);
  }

  public void resume()
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      a.a(localContext);
  }

  public void start()
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      a.a(localContext).a();
  }

  public void stop()
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      a.a(localContext).b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter
 * JD-Core Version:    0.6.2
 */