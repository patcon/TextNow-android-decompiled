package com.mopub.common;

import android.content.Context;
import android.content.SharedPreferences;

public final class SharedPreferencesHelper
{
  public static final String PREFERENCE_NAME = "mopubSettings";

  public static SharedPreferences getSharedPreferences(Context paramContext)
  {
    return paramContext.getSharedPreferences("mopubSettings", 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.SharedPreferencesHelper
 * JD-Core Version:    0.6.2
 */