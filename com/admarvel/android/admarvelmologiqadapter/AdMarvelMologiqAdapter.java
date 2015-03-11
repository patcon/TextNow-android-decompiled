package com.admarvel.android.admarvelmologiqadapter;

import android.content.Context;
import com.admarvel.android.ads.AdMarvelAnalyticsAdapter;
import com.mologiq.analytics.r;
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

  public String getAdapterAnalyticsVersion()
  {
    return "1.2.9 2014-07-08";
  }

  protected Map getEnhancedTargetParams(String paramString, Map paramMap)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      return r.a(localContext).a(paramString, paramMap);
    return null;
  }

  protected void onAdClick(String paramString1, int paramInt, Map paramMap, String paramString2, String paramString3)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      r.a(localContext).c(paramString1, paramInt, paramMap, paramString3);
  }

  protected void onFailedToReceiveAd(String paramString1, int paramInt, Map paramMap, String paramString2)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      r.a(localContext).a(paramString1, paramInt, paramMap, paramString2);
  }

  protected void onReceiveAd(String paramString1, int paramInt, Map paramMap, String paramString2)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      r.a(localContext).b(paramString1, paramInt, paramMap, paramString2);
  }

  protected void pause()
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      r.a(localContext);
  }

  protected void resume()
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      r.a(localContext);
  }

  protected void start()
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      r.a(localContext).a();
  }

  protected void stop()
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      r.a(localContext).b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter
 * JD-Core Version:    0.6.2
 */