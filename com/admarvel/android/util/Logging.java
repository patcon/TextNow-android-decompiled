package com.admarvel.android.util;

import android.util.Log;
import com.admarvel.android.ads.AdMarvelUtils;

public class Logging
{
  private static final String LOGTAG = "admarvel";

  public static void log(String paramString)
  {
    if (!Log.isLoggable("admarvel", 2))
      AdMarvelUtils.isLoggingEnabled();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.Logging
 * JD-Core Version:    0.6.2
 */