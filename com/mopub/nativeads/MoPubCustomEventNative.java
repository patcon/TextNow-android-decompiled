package com.mopub.nativeads;

import android.content.Context;
import java.util.Map;
import org.json.JSONException;

public class MoPubCustomEventNative extends CustomEventNative
{
  protected void loadNativeAd(Context paramContext, final CustomEventNative.CustomEventNativeListener paramCustomEventNativeListener, Map<String, Object> paramMap, Map<String, String> paramMap1)
  {
    try
    {
      final MoPubCustomEventNative.MoPubForwardingNativeAd localMoPubForwardingNativeAd = new MoPubCustomEventNative.MoPubForwardingNativeAd((String)paramMap1.get("response_body_key"));
      preCacheImages(paramContext, localMoPubForwardingNativeAd.getAllImageUrls(), new CustomEventNative.ImageListener()
      {
        public void onImagesCached()
        {
          paramCustomEventNativeListener.onNativeAdLoaded(localMoPubForwardingNativeAd);
        }

        public void onImagesFailedToCache(NativeErrorCode paramAnonymousNativeErrorCode)
        {
          paramCustomEventNativeListener.onNativeAdFailed(paramAnonymousNativeErrorCode);
        }
      });
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      paramCustomEventNativeListener.onNativeAdFailed(NativeErrorCode.UNSPECIFIED);
      return;
    }
    catch (JSONException localJSONException)
    {
      paramCustomEventNativeListener.onNativeAdFailed(NativeErrorCode.INVALID_JSON);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.MoPubCustomEventNative
 * JD-Core Version:    0.6.2
 */