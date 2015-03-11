package com.mopub.common.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.mopub.common.logging.MoPubLog;
import java.util.List;

public class IntentUtils
{
  private static final String HTTP = "http";
  private static final String HTTPS = "https";
  private static final String MARKET = "market";
  private static final String MARKET_ANDROID_COM = "market.android.com";
  private static final String PLAY_GOOGLE_COM = "play.google.com";
  private static final String TWITTER_APPLICATION_DEEPLINK_URL = "twitter://timeline";

  public static boolean canHandleApplicationUrl(Context paramContext, String paramString)
  {
    return canHandleApplicationUrl(paramContext, paramString, true);
  }

  public static boolean canHandleApplicationUrl(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (!deviceCanHandleIntent(paramContext, new Intent("android.intent.action.VIEW", Uri.parse(paramString))))
    {
      if (paramBoolean)
        MoPubLog.w("Could not handle application specific action: " + paramString + ". " + "You may be running in the emulator or another device which does not " + "have the required application.");
      return false;
    }
    return true;
  }

  public static boolean canHandleTwitterUrl(Context paramContext)
  {
    return canHandleApplicationUrl(paramContext, "twitter://timeline", false);
  }

  public static boolean deviceCanHandleIntent(Context paramContext, Intent paramIntent)
  {
    try
    {
      boolean bool1 = paramContext.getPackageManager().queryIntentActivities(paramIntent, 0).isEmpty();
      boolean bool2 = false;
      if (!bool1)
        bool2 = true;
      return bool2;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public static Intent getStartActivityIntent(Context paramContext, Class paramClass, Bundle paramBundle)
  {
    Intent localIntent = new Intent(paramContext, paramClass);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    if (paramBundle != null)
      localIntent.putExtras(paramBundle);
    return localIntent;
  }

  private static boolean isAppStoreUrl(String paramString)
  {
    if (paramString == null);
    String str1;
    do
    {
      return false;
      Uri localUri = Uri.parse(paramString);
      str1 = localUri.getScheme();
      String str2 = localUri.getHost();
      if (("play.google.com".equals(str2)) || ("market.android.com".equals(str2)))
        return true;
    }
    while (!"market".equals(str1));
    return true;
  }

  public static boolean isDeepLink(String paramString)
  {
    return (isAppStoreUrl(paramString)) || (!isHttpUrl(paramString));
  }

  public static boolean isHttpUrl(String paramString)
  {
    if (paramString == null);
    String str;
    do
    {
      return false;
      str = Uri.parse(paramString).getScheme();
    }
    while ((!"http".equals(str)) && (!"https".equals(str)));
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.IntentUtils
 * JD-Core Version:    0.6.2
 */