package com.admarvel.android.ads;

import android.app.Activity;

class q
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.q
 * JD-Core Version:    0.6.2
 */