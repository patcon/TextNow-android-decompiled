package com.mopub.mobileads;

public class AdTypeTranslator
{
  static String getAdNetworkType(String paramString1, String paramString2)
  {
    if ("interstitial".equals(paramString1));
    for (String str = paramString2; str != null; str = paramString1)
      return str;
    return "unknown";
  }

  static String getCustomEventNameForAdType(MoPubView paramMoPubView, String paramString1, String paramString2)
  {
    AdTypeTranslator.CustomEventType localCustomEventType;
    if (("html".equals(paramString1)) || ("mraid".equals(paramString1)))
      if (isInterstitial(paramMoPubView))
        localCustomEventType = AdTypeTranslator.CustomEventType.access$000(paramString1 + "_interstitial");
    while (true)
    {
      return localCustomEventType.toString();
      localCustomEventType = AdTypeTranslator.CustomEventType.access$000(paramString1 + "_banner");
      continue;
      if ("interstitial".equals(paramString1))
        localCustomEventType = AdTypeTranslator.CustomEventType.access$000(paramString2 + "_interstitial");
      else
        localCustomEventType = AdTypeTranslator.CustomEventType.access$000(paramString1 + "_banner");
    }
  }

  private static boolean isInterstitial(MoPubView paramMoPubView)
  {
    return paramMoPubView instanceof MoPubInterstitial.MoPubInterstitialView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdTypeTranslator
 * JD-Core Version:    0.6.2
 */