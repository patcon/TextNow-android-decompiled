package com.admarvel.android.ads;

public enum AdMarvelUtils$ErrorReason
{
  static
  {
    SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH = new ErrorReason("SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH", 1);
    BOT_USER_AGENT_FOUND = new ErrorReason("BOT_USER_AGENT_FOUND", 2);
    NO_BANNER_FOUND = new ErrorReason("NO_BANNER_FOUND", 3);
    NO_AD_FOUND = new ErrorReason("NO_AD_FOUND", 4);
    NO_USER_AGENT_FOUND = new ErrorReason("NO_USER_AGENT_FOUND", 5);
    SITE_ID_NOT_PRESENT = new ErrorReason("SITE_ID_NOT_PRESENT", 6);
    PARTNER_ID_NOT_PRESENT = new ErrorReason("PARTNER_ID_NOT_PRESENT", 7);
    NO_NETWORK_CONNECTIVITY = new ErrorReason("NO_NETWORK_CONNECTIVITY", 8);
    NETWORK_CONNECTIVITY_DISRUPTED = new ErrorReason("NETWORK_CONNECTIVITY_DISRUPTED", 9);
    AD_REQUEST_XML_PARSING_EXCEPTION = new ErrorReason("AD_REQUEST_XML_PARSING_EXCEPTION", 10);
    AD_REQUEST_IN_PROCESS_EXCEPTION = new ErrorReason("AD_REQUEST_IN_PROCESS_EXCEPTION", 11);
    AD_UNIT_NOT_ABLE_TO_RENDER = new ErrorReason("AD_UNIT_NOT_ABLE_TO_RENDER", 12);
    AD_REQUEST_MISSING_XML_ELEMENTS = new ErrorReason("AD_REQUEST_MISSING_XML_ELEMENTS", 13);
    AD_REQUEST_SDK_TYPE_UNSUPPORTED = new ErrorReason("AD_REQUEST_SDK_TYPE_UNSUPPORTED", 14);
    AD_UNIT_NOT_ABLE_TO_LOAD = new ErrorReason("AD_UNIT_NOT_ABLE_TO_LOAD", 15);
    ErrorReason[] arrayOfErrorReason = new ErrorReason[16];
    arrayOfErrorReason[0] = SITE_ID_OR_PARTNER_ID_NOT_PRESENT;
    arrayOfErrorReason[1] = SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH;
    arrayOfErrorReason[2] = BOT_USER_AGENT_FOUND;
    arrayOfErrorReason[3] = NO_BANNER_FOUND;
    arrayOfErrorReason[4] = NO_AD_FOUND;
    arrayOfErrorReason[5] = NO_USER_AGENT_FOUND;
    arrayOfErrorReason[6] = SITE_ID_NOT_PRESENT;
    arrayOfErrorReason[7] = PARTNER_ID_NOT_PRESENT;
    arrayOfErrorReason[8] = NO_NETWORK_CONNECTIVITY;
    arrayOfErrorReason[9] = NETWORK_CONNECTIVITY_DISRUPTED;
    arrayOfErrorReason[10] = AD_REQUEST_XML_PARSING_EXCEPTION;
    arrayOfErrorReason[11] = AD_REQUEST_IN_PROCESS_EXCEPTION;
    arrayOfErrorReason[12] = AD_UNIT_NOT_ABLE_TO_RENDER;
    arrayOfErrorReason[13] = AD_REQUEST_MISSING_XML_ELEMENTS;
    arrayOfErrorReason[14] = AD_REQUEST_SDK_TYPE_UNSUPPORTED;
    arrayOfErrorReason[15] = AD_UNIT_NOT_ABLE_TO_LOAD;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelUtils.ErrorReason
 * JD-Core Version:    0.6.2
 */