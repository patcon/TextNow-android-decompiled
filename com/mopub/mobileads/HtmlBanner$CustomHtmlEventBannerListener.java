package com.mopub.mobileads;

import android.os.Handler;
import android.view.View;
import com.enflick.android.TextNow.ads.c;

public class HtmlBanner$CustomHtmlEventBannerListener
  implements CustomEventBanner.CustomEventBannerListener
{
  CustomEventBanner.CustomEventBannerListener mListener;

  public HtmlBanner$CustomHtmlEventBannerListener(CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener)
  {
    this.mListener = paramCustomEventBannerListener;
  }

  public void onBannerClicked()
  {
    if (this.mListener != null)
      this.mListener.onBannerClicked();
  }

  public void onBannerCollapsed()
  {
    if (this.mListener != null)
      this.mListener.onBannerCollapsed();
  }

  public void onBannerExpanded()
  {
    if (this.mListener != null)
      this.mListener.onBannerExpanded();
  }

  public void onBannerFailed(MoPubErrorCode paramMoPubErrorCode)
  {
    if (this.mListener != null)
      this.mListener.onBannerFailed(paramMoPubErrorCode);
  }

  public void onBannerLoaded(final View paramView)
  {
    if (HtmlBanner.access$000() != null)
    {
      HtmlBanner.access$100().removeCallbacks(HtmlBanner.access$000());
      HtmlBanner.access$002(null);
    }
    HtmlBanner.access$002(new Runnable()
    {
      public void run()
      {
        c.a();
        if (HtmlBanner.CustomHtmlEventBannerListener.this.mListener != null)
          HtmlBanner.CustomHtmlEventBannerListener.this.mListener.onBannerLoaded(paramView);
      }
    });
    HtmlBanner.access$100().postDelayed(HtmlBanner.access$000(), 3000L);
  }

  public void onLeaveApplication()
  {
    if (this.mListener != null)
      this.mListener.onLeaveApplication();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.HtmlBanner.CustomHtmlEventBannerListener
 * JD-Core Version:    0.6.2
 */