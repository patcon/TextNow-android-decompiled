package com.mopub.mobileads;

import android.content.Context;
import android.net.Uri;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.ads.c;
import com.enflick.android.TextNow.ads.d;
import com.mopub.mobileads.factories.MraidViewFactory;
import java.util.Map;

class MraidBanner extends CustomEventBanner
  implements d
{
  private CustomEventBanner.CustomEventBannerListener mBannerListener;
  private MraidView mMraidView;

  private boolean extrasAreValid(Map<String, String> paramMap)
  {
    return paramMap.containsKey("Html-Response-Body");
  }

  private void initMraidListener()
  {
    this.mMraidView.setMraidListener(new MraidView.MraidListener()
    {
      public void onClose(MraidView paramAnonymousMraidView, MraidView.ViewState paramAnonymousViewState)
      {
        MraidBanner.this.onClose();
      }

      public void onExpand(MraidView paramAnonymousMraidView)
      {
        MraidBanner.this.onExpand();
      }

      public void onFailure(MraidView paramAnonymousMraidView)
      {
        MraidBanner.this.onFail();
      }

      public void onOpen(MraidView paramAnonymousMraidView)
      {
        MraidBanner.this.onOpen();
      }

      public void onReady(MraidView paramAnonymousMraidView)
      {
        MraidBanner.this.onReady();
      }
    });
  }

  private void onClose()
  {
    this.mBannerListener.onBannerCollapsed();
  }

  private void onExpand()
  {
    this.mBannerListener.onBannerExpanded();
    this.mBannerListener.onBannerClicked();
  }

  private void onFail()
  {
    this.mBannerListener.onBannerFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
  }

  private void onOpen()
  {
    this.mBannerListener.onBannerClicked();
  }

  private void onReady()
  {
    this.mBannerListener.onBannerLoaded(this.mMraidView);
  }

  private void resetMraidListener()
  {
    this.mMraidView.setMraidListener(null);
  }

  public void invalidate()
  {
    if (this.mMraidView != null)
      this.mMraidView.destroy();
  }

  protected void loadBanner(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, Map<String, Object> paramMap, Map<String, String> paramMap1)
  {
    this.mBannerListener = new a(paramCustomEventBannerListener);
    if (extrasAreValid(paramMap1))
    {
      String str = Uri.decode((String)paramMap1.get("Html-Response-Body"));
      this.mMraidView = MraidViewFactory.create(paramContext, AdConfiguration.extractFromMap(paramMap));
      this.mMraidView.loadHtmlData(str);
      initMraidListener();
      return;
    }
    this.mBannerListener.onBannerFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
  }

  protected void onInvalidate()
  {
    if (this.mMraidView != null)
      resetMraidListener();
    c.a(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidBanner
 * JD-Core Version:    0.6.2
 */