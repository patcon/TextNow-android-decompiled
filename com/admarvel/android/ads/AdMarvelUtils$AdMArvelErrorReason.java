package com.admarvel.android.ads;

public enum AdMarvelUtils$AdMArvelErrorReason
{
  private final int a;

  static
  {
    SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH = new AdMArvelErrorReason("SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH", 1, 202);
    BOT_USER_AGENT_FOUND = new AdMArvelErrorReason("BOT_USER_AGENT_FOUND", 2, 203);
    NO_BANNER_FOUND = new AdMArvelErrorReason("NO_BANNER_FOUND", 3, 204);
    NO_AD_FOUND = new AdMArvelErrorReason("NO_AD_FOUND", 4, 205);
    NO_USER_AGENT_FOUND = new AdMArvelErrorReason("NO_USER_AGENT_FOUND", 5, 206);
    SITE_ID_NOT_PRESENT = new AdMArvelErrorReason("SITE_ID_NOT_PRESENT", 6, 207);
    PARTNER_ID_NOT_PRESENT = new AdMArvelErrorReason("PARTNER_ID_NOT_PRESENT", 7, 208);
    NO_NETWORK_CONNECTIVITY = new AdMArvelErrorReason("NO_NETWORK_CONNECTIVITY", 8, 301);
    NETWORK_CONNECTIVITY_DISRUPTED = new AdMArvelErrorReason("NETWORK_CONNECTIVITY_DISRUPTED", 9, 302);
    AD_REQUEST_XML_PARSING_EXCEPTION = new AdMArvelErrorReason("AD_REQUEST_XML_PARSING_EXCEPTION", 10, 303);
    AD_REQUEST_IN_PROCESS_EXCEPTION = new AdMArvelErrorReason("AD_REQUEST_IN_PROCESS_EXCEPTION", 11, 304);
    AD_UNIT_NOT_ABLE_TO_RENDER = new AdMArvelErrorReason("AD_UNIT_NOT_ABLE_TO_RENDER", 12, 305);
    AD_REQUEST_MISSING_XML_ELEMENTS = new AdMArvelErrorReason("AD_REQUEST_MISSING_XML_ELEMENTS", 13, 306);
    AD_REQUEST_SDK_TYPE_UNSUPPORTED = new AdMArvelErrorReason("AD_REQUEST_SDK_TYPE_UNSUPPORTED", 14, 307);
    AD_UNIT_NOT_ABLE_TO_LOAD = new AdMArvelErrorReason("AD_UNIT_NOT_ABLE_TO_LOAD", 15, 308);
    AdMArvelErrorReason[] arrayOfAdMArvelErrorReason = new AdMArvelErrorReason[16];
    arrayOfAdMArvelErrorReason[0] = SITE_ID_OR_PARTNER_ID_NOT_PRESENT;
    arrayOfAdMArvelErrorReason[1] = SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH;
    arrayOfAdMArvelErrorReason[2] = BOT_USER_AGENT_FOUND;
    arrayOfAdMArvelErrorReason[3] = NO_BANNER_FOUND;
    arrayOfAdMArvelErrorReason[4] = NO_AD_FOUND;
    arrayOfAdMArvelErrorReason[5] = NO_USER_AGENT_FOUND;
    arrayOfAdMArvelErrorReason[6] = SITE_ID_NOT_PRESENT;
    arrayOfAdMArvelErrorReason[7] = PARTNER_ID_NOT_PRESENT;
    arrayOfAdMArvelErrorReason[8] = NO_NETWORK_CONNECTIVITY;
    arrayOfAdMArvelErrorReason[9] = NETWORK_CONNECTIVITY_DISRUPTED;
    arrayOfAdMArvelErrorReason[10] = AD_REQUEST_XML_PARSING_EXCEPTION;
    arrayOfAdMArvelErrorReason[11] = AD_REQUEST_IN_PROCESS_EXCEPTION;
    arrayOfAdMArvelErrorReason[12] = AD_UNIT_NOT_ABLE_TO_RENDER;
    arrayOfAdMArvelErrorReason[13] = AD_REQUEST_MISSING_XML_ELEMENTS;
    arrayOfAdMArvelErrorReason[14] = AD_REQUEST_SDK_TYPE_UNSUPPORTED;
    arrayOfAdMArvelErrorReason[15] = AD_UNIT_NOT_ABLE_TO_LOAD;
  }

  private AdMarvelUtils$AdMArvelErrorReason(int paramInt)
  {
    this.a = paramInt;
  }

  public final int getErrorCode()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelUtils.AdMArvelErrorReason
 * JD-Core Version:    0.6.2
 */