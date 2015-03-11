package com.mopub.mobileads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.mopub.common.util.Views;
import java.util.GregorianCalendar;
import java.util.Map;
import textnow.u.r;

class GooglePlayServicesBanner extends CustomEventBanner
{
  private static final String AD_HEIGHT_KEY = "adHeight";
  private static final String AD_UNIT_ID_KEY = "adUnitID";
  private static final String AD_WIDTH_KEY = "adWidth";
  private static final String LOCATION_KEY = "location";
  private CustomEventBanner.CustomEventBannerListener mBannerListener;
  private AdView mGoogleAdView;

  private AdSize calculateAdSize(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= AdSize.BANNER.getWidth()) && (paramInt2 <= AdSize.BANNER.getHeight()))
      return AdSize.BANNER;
    if ((paramInt1 <= AdSize.MEDIUM_RECTANGLE.getWidth()) && (paramInt2 <= AdSize.MEDIUM_RECTANGLE.getHeight()))
      return AdSize.MEDIUM_RECTANGLE;
    if ((paramInt1 <= AdSize.FULL_BANNER.getWidth()) && (paramInt2 <= AdSize.FULL_BANNER.getHeight()))
      return AdSize.FULL_BANNER;
    if ((paramInt1 <= AdSize.LEADERBOARD.getWidth()) && (paramInt2 <= AdSize.LEADERBOARD.getHeight()))
      return AdSize.LEADERBOARD;
    return null;
  }

  private boolean extrasAreValid(Map<String, String> paramMap)
  {
    try
    {
      Integer.parseInt((String)paramMap.get("adWidth"));
      Integer.parseInt((String)paramMap.get("adHeight"));
      return paramMap.containsKey("adUnitID");
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return false;
  }

  @Deprecated
  AdView getGoogleAdView()
  {
    return this.mGoogleAdView;
  }

  protected void loadBanner(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, Map<String, Object> paramMap, Map<String, String> paramMap1)
  {
    this.mBannerListener = paramCustomEventBannerListener;
    AdSize localAdSize;
    if (extrasAreValid(paramMap1))
    {
      String str = (String)paramMap1.get("adUnitID");
      int i = Integer.parseInt((String)paramMap1.get("adWidth"));
      int j = Integer.parseInt((String)paramMap1.get("adHeight"));
      this.mGoogleAdView = new AdView(paramContext);
      this.mGoogleAdView.setAdListener(new GooglePlayServicesBanner.AdViewListener(this, null));
      this.mGoogleAdView.setAdUnitId(str);
      localAdSize = calculateAdSize(i, j);
      if (localAdSize != null)
        break label140;
      this.mBannerListener.onBannerFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
    }
    label140: 
    do
    {
      return;
      this.mBannerListener.onBannerFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
      return;
      this.mGoogleAdView.setAdSize(localAdSize);
      r localr = new r(paramContext);
      AdRequest localAdRequest = new AdRequest.Builder().setBirthday(new GregorianCalendar(localr.r(), 0, 1).getTime()).setGender(localr.s()).build();
      try
      {
        this.mGoogleAdView.loadAd(localAdRequest);
        return;
      }
      catch (Throwable localThrowable)
      {
      }
    }
    while (this.mBannerListener == null);
    this.mBannerListener.onBannerFailed(MoPubErrorCode.NETWORK_NO_FILL);
  }

  protected void onInvalidate()
  {
    Views.removeFromParent(this.mGoogleAdView);
    if (this.mGoogleAdView != null)
    {
      this.mGoogleAdView.setAdListener(null);
      this.mGoogleAdView.destroy();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.GooglePlayServicesBanner
 * JD-Core Version:    0.6.2
 */