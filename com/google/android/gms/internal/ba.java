package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@ez
public final class ba extends bf.a
{
  private final AppEventListener oi;

  public ba(AppEventListener paramAppEventListener)
  {
    this.oi = paramAppEventListener;
  }

  public final void onAppEvent(String paramString1, String paramString2)
  {
    this.oi.onAppEvent(paramString1, paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ba
 * JD-Core Version:    0.6.2
 */