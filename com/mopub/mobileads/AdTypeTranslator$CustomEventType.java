package com.mopub.mobileads;

public enum AdTypeTranslator$CustomEventType
{
  private final String mClassName;
  private final String mKey;

  static
  {
    HTML_BANNER = new CustomEventType("HTML_BANNER", 6, "html_banner", "com.mopub.mobileads.HtmlBanner");
    HTML_INTERSTITIAL = new CustomEventType("HTML_INTERSTITIAL", 7, "html_interstitial", "com.mopub.mobileads.HtmlInterstitial");
    VAST_VIDEO_INTERSTITIAL = new CustomEventType("VAST_VIDEO_INTERSTITIAL", 8, "vast_interstitial", "com.mopub.mobileads.VastVideoInterstitial");
    UNSPECIFIED = new CustomEventType("UNSPECIFIED", 9, "", null);
    CustomEventType[] arrayOfCustomEventType = new CustomEventType[10];
    arrayOfCustomEventType[0] = GOOGLE_PLAY_SERVICES_BANNER;
    arrayOfCustomEventType[1] = GOOGLE_PLAY_SERVICES_INTERSTITIAL;
    arrayOfCustomEventType[2] = MILLENNIAL_BANNER;
    arrayOfCustomEventType[3] = MILLENNIAL_INTERSTITIAL;
    arrayOfCustomEventType[4] = MRAID_BANNER;
    arrayOfCustomEventType[5] = MRAID_INTERSTITIAL;
    arrayOfCustomEventType[6] = HTML_BANNER;
    arrayOfCustomEventType[7] = HTML_INTERSTITIAL;
    arrayOfCustomEventType[8] = VAST_VIDEO_INTERSTITIAL;
    arrayOfCustomEventType[9] = UNSPECIFIED;
  }

  private AdTypeTranslator$CustomEventType(String paramString1, String paramString2)
  {
    this.mKey = paramString1;
    this.mClassName = paramString2;
  }

  private static CustomEventType fromString(String paramString)
  {
    for (CustomEventType localCustomEventType : values())
      if (localCustomEventType.mKey.equals(paramString))
        return localCustomEventType;
    return UNSPECIFIED;
  }

  public final String toString()
  {
    return this.mClassName;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdTypeTranslator.CustomEventType
 * JD-Core Version:    0.6.2
 */