package com.mopub.nativeads;

import com.mopub.common.VisibleForTesting;
import java.util.HashSet;
import java.util.Set;

 enum NativeResponse$Parameter
{

  @VisibleForTesting
  static final Set<String> requiredKeys;
  final String name;
  final boolean required;

  static
  {
    int i = 0;
    IMPRESSION_TRACKER = new Parameter("IMPRESSION_TRACKER", 0, "imptracker", true);
    CLICK_TRACKER = new Parameter("CLICK_TRACKER", 1, "clktracker", true);
    TITLE = new Parameter("TITLE", 2, "title", false);
    TEXT = new Parameter("TEXT", 3, "text", false);
    MAIN_IMAGE = new Parameter("MAIN_IMAGE", 4, "mainimage", false);
    ICON_IMAGE = new Parameter("ICON_IMAGE", 5, "iconimage", false);
    CLICK_DESTINATION = new Parameter("CLICK_DESTINATION", 6, "clk", false);
    FALLBACK = new Parameter("FALLBACK", 7, "fallback", false);
    CALL_TO_ACTION = new Parameter("CALL_TO_ACTION", 8, "ctatext", false);
    STAR_RATING = new Parameter("STAR_RATING", 9, "starrating", false);
    Parameter[] arrayOfParameter1 = new Parameter[10];
    arrayOfParameter1[0] = IMPRESSION_TRACKER;
    arrayOfParameter1[1] = CLICK_TRACKER;
    arrayOfParameter1[2] = TITLE;
    arrayOfParameter1[3] = TEXT;
    arrayOfParameter1[4] = MAIN_IMAGE;
    arrayOfParameter1[5] = ICON_IMAGE;
    arrayOfParameter1[6] = CLICK_DESTINATION;
    arrayOfParameter1[7] = FALLBACK;
    arrayOfParameter1[8] = CALL_TO_ACTION;
    arrayOfParameter1[9] = STAR_RATING;
    $VALUES = arrayOfParameter1;
    requiredKeys = new HashSet();
    Parameter[] arrayOfParameter2 = values();
    int j = arrayOfParameter2.length;
    while (i < j)
    {
      Parameter localParameter = arrayOfParameter2[i];
      if (localParameter.required)
        requiredKeys.add(localParameter.name);
      i++;
    }
  }

  private NativeResponse$Parameter(String paramString, boolean paramBoolean)
  {
    this.name = paramString;
    this.required = paramBoolean;
  }

  static Parameter from(String paramString)
  {
    for (Parameter localParameter : values())
      if (localParameter.name.equals(paramString))
        return localParameter;
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.NativeResponse.Parameter
 * JD-Core Version:    0.6.2
 */