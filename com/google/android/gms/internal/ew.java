package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.b;

@ez
public final class ew extends et.a
{
  private final b oE;
  private final PublisherAdView sQ;

  public ew(b paramb, PublisherAdView paramPublisherAdView)
  {
    this.oE = paramb;
    this.sQ = paramPublisherAdView;
  }

  public final void a(es parames)
  {
    this.oE.a(this.sQ, new ev(parames));
  }

  public final boolean e(String paramString1, String paramString2)
  {
    return this.oE.a(this.sQ, paramString1, paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ew
 * JD-Core Version:    0.6.2
 */