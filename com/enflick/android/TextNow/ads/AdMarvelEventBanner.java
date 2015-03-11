package com.enflick.android.TextNow.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import com.admarvel.android.ads.AdMarvelUtils.ErrorReason;
import com.admarvel.android.ads.AdMarvelView;
import com.admarvel.android.ads.AdMarvelView.AdMarvelViewListener;
import com.mopub.mobileads.CustomEventBanner;
import com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener;
import com.mopub.mobileads.MoPubErrorCode;
import java.util.HashMap;
import java.util.Map;
import textnow.u.r;

public class AdMarvelEventBanner extends CustomEventBanner
  implements AdMarvelView.AdMarvelViewListener
{
  private static String a = "AdMarvelEventBanner";
  private AdMarvelView b;
  private CustomEventBanner.CustomEventBannerListener c;

  @SuppressLint({"NewApi"})
  protected void loadBanner(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, Map<String, Object> paramMap, Map<String, String> paramMap1)
  {
    this.c = paramCustomEventBannerListener;
    if (!(paramContext instanceof Activity))
    {
      this.c.onBannerFailed(MoPubErrorCode.INTERNAL_ERROR);
      return;
    }
    this.b = new AdMarvelView(paramContext);
    this.b.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    this.b.setListener(this);
    r localr = new r(paramContext);
    HashMap localHashMap = new HashMap();
    localHashMap.put("AGE", Integer.valueOf(localr.q()));
    if (localr.s() == 1);
    for (String str = "m"; ; str = "f")
    {
      localHashMap.put("GENDER", str);
      localHashMap.put("AREA_CODE", localr.d());
      this.b.requestNewAd(localHashMap, "afd0c07c7875b2ac", "77435");
      return;
    }
  }

  public void onClickAd(AdMarvelView paramAdMarvelView, String paramString)
  {
    this.c.onBannerClicked();
  }

  public void onClose()
  {
    this.c.onBannerCollapsed();
  }

  public void onExpand()
  {
    this.c.onBannerExpanded();
  }

  public void onFailedToReceiveAd(AdMarvelView paramAdMarvelView, int paramInt, AdMarvelUtils.ErrorReason paramErrorReason)
  {
    new StringBuilder().append("Failed to receive adMarvel ad: ").append(paramErrorReason.name()).toString();
    this.c.onBannerFailed(MoPubErrorCode.NO_FILL);
  }

  protected void onInvalidate()
  {
    this.b.setListener(null);
    this.b.destroy();
  }

  public void onReceiveAd(AdMarvelView paramAdMarvelView)
  {
    this.c.onBannerLoaded(this.b);
  }

  public void onRequestAd(AdMarvelView paramAdMarvelView)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.ads.AdMarvelEventBanner
 * JD-Core Version:    0.6.2
 */