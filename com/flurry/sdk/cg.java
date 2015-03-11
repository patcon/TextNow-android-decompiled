package com.flurry.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;

public final class cg
{
  public static String a(Context paramContext)
  {
    String str;
    if (paramContext == null)
      str = null;
    do
    {
      return str;
      str = b(paramContext);
    }
    while (!TextUtils.isEmpty(str));
    return c(paramContext);
  }

  @TargetApi(17)
  static String b(Context paramContext)
  {
    if (paramContext == null);
    while (Build.VERSION.SDK_INT < 17)
      return null;
    return WebSettings.getDefaultUserAgent(paramContext);
  }

  static String c(Context paramContext)
  {
    if (paramContext == null)
      return null;
    return new WebView(paramContext).getSettings().getUserAgentString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.cg
 * JD-Core Version:    0.6.2
 */