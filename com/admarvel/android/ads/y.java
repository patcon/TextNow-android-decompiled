package com.admarvel.android.ads;

import android.app.Activity;

class y
{
  static void a(Activity paramActivity, String paramString)
  {
    if (paramString.equalsIgnoreCase("LandscapeRight"))
      paramActivity.setRequestedOrientation(8);
    while (!paramString.equalsIgnoreCase("PortraitUpsideDown"))
      return;
    paramActivity.setRequestedOrientation(9);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.y
 * JD-Core Version:    0.6.2
 */