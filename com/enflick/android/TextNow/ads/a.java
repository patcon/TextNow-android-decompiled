package com.enflick.android.TextNow.ads;

import android.view.View;
import com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener;
import com.mopub.mobileads.MoPubErrorCode;

public final class a
  implements CustomEventBanner.CustomEventBannerListener
{
  private CustomEventBanner.CustomEventBannerListener a;

  public a(CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener)
  {
    this.a = paramCustomEventBannerListener;
  }

  public final void onBannerClicked()
  {
    this.a.onBannerClicked();
  }

  public final void onBannerCollapsed()
  {
    this.a.onBannerCollapsed();
  }

  public final void onBannerExpanded()
  {
    this.a.onBannerExpanded();
  }

  public final void onBannerFailed(MoPubErrorCode paramMoPubErrorCode)
  {
    this.a.onBannerFailed(paramMoPubErrorCode);
  }

  public final void onBannerLoaded(View paramView)
  {
    c.a();
    this.a.onBannerLoaded(paramView);
  }

  public final void onLeaveApplication()
  {
    this.a.onLeaveApplication();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.ads.a
 * JD-Core Version:    0.6.2
 */