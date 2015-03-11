package com.mopub.mobileads.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.mopub.common.logging.MoPubLog;

public class Utils
{
  public static boolean executeIntent(Context paramContext, Intent paramIntent, String paramString)
  {
    try
    {
      if (!(paramContext instanceof Activity))
        paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
      return true;
    }
    catch (Exception localException)
    {
      if (paramString == null);
    }
    while (true)
    {
      MoPubLog.d(paramString);
      return false;
      paramString = "Unable to start intent.";
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.Utils
 * JD-Core Version:    0.6.2
 */