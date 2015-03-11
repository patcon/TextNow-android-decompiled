package com.admarvel.androidid;

import android.content.Context;
import android.provider.Settings.Secure;

public class FetchAndroidId
{
  public static String getId(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.androidid.FetchAndroidId
 * JD-Core Version:    0.6.2
 */