package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

public final class er
{
  public static void a(Context paramContext, WebSettings paramWebSettings)
  {
    eq.a(paramContext, paramWebSettings);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
  }

  public static String getDefaultUserAgent(Context paramContext)
  {
    return WebSettings.getDefaultUserAgent(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.er
 * JD-Core Version:    0.6.2
 */