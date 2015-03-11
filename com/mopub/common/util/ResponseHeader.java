package com.mopub.common.util;

public enum ResponseHeader
{
  private final String key;

  static
  {
    CUSTOM_EVENT_HTML_DATA = new ResponseHeader("CUSTOM_EVENT_HTML_DATA", 5, "X-Custom-Event-Html-Data");
    DSP_CREATIVE_ID = new ResponseHeader("DSP_CREATIVE_ID", 6, "X-DspCreativeid");
    FAIL_URL = new ResponseHeader("FAIL_URL", 7, "X-Failurl");
    FULL_AD_TYPE = new ResponseHeader("FULL_AD_TYPE", 8, "X-Fulladtype");
    HEIGHT = new ResponseHeader("HEIGHT", 9, "X-Height");
    IMPRESSION_URL = new ResponseHeader("IMPRESSION_URL", 10, "X-Imptracker");
    REDIRECT_URL = new ResponseHeader("REDIRECT_URL", 11, "X-Launchpage");
    NATIVE_PARAMS = new ResponseHeader("NATIVE_PARAMS", 12, "X-Nativeparams");
    NETWORK_TYPE = new ResponseHeader("NETWORK_TYPE", 13, "X-Networktype");
    REFRESH_TIME = new ResponseHeader("REFRESH_TIME", 14, "X-Refreshtime");
    SCROLLABLE = new ResponseHeader("SCROLLABLE", 15, "X-Scrollable");
    WARMUP = new ResponseHeader("WARMUP", 16, "X-Warmup");
    WIDTH = new ResponseHeader("WIDTH", 17, "X-Width");
    LOCATION = new ResponseHeader("LOCATION", 18, "Location");
    USER_AGENT = new ResponseHeader("USER_AGENT", 19, "User-Agent");
    CUSTOM_SELECTOR = new ResponseHeader("CUSTOM_SELECTOR", 20, "X-Customselector");
    ResponseHeader[] arrayOfResponseHeader = new ResponseHeader[21];
    arrayOfResponseHeader[0] = AD_TIMEOUT;
    arrayOfResponseHeader[1] = AD_TYPE;
    arrayOfResponseHeader[2] = CLICKTHROUGH_URL;
    arrayOfResponseHeader[3] = CUSTOM_EVENT_DATA;
    arrayOfResponseHeader[4] = CUSTOM_EVENT_NAME;
    arrayOfResponseHeader[5] = CUSTOM_EVENT_HTML_DATA;
    arrayOfResponseHeader[6] = DSP_CREATIVE_ID;
    arrayOfResponseHeader[7] = FAIL_URL;
    arrayOfResponseHeader[8] = FULL_AD_TYPE;
    arrayOfResponseHeader[9] = HEIGHT;
    arrayOfResponseHeader[10] = IMPRESSION_URL;
    arrayOfResponseHeader[11] = REDIRECT_URL;
    arrayOfResponseHeader[12] = NATIVE_PARAMS;
    arrayOfResponseHeader[13] = NETWORK_TYPE;
    arrayOfResponseHeader[14] = REFRESH_TIME;
    arrayOfResponseHeader[15] = SCROLLABLE;
    arrayOfResponseHeader[16] = WARMUP;
    arrayOfResponseHeader[17] = WIDTH;
    arrayOfResponseHeader[18] = LOCATION;
    arrayOfResponseHeader[19] = USER_AGENT;
    arrayOfResponseHeader[20] = CUSTOM_SELECTOR;
  }

  private ResponseHeader(String paramString)
  {
    this.key = paramString;
  }

  public final String getKey()
  {
    return this.key;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.ResponseHeader
 * JD-Core Version:    0.6.2
 */