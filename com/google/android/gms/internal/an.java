package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;

public final class an extends as.a
{
  private final AppEventListener mh;

  public an(AppEventListener paramAppEventListener)
  {
    this.mh = paramAppEventListener;
  }

  public final void onAppEvent(String paramString1, String paramString2)
  {
    this.mh.onAppEvent(paramString1, paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.an
 * JD-Core Version:    0.6.2
 */