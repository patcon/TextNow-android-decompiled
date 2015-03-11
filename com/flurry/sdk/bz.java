package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import com.millennialmedia.android.MMInterstitial;
import com.millennialmedia.android.RequestListener;

public final class bz extends ba
{
  private static final String b = bz.class.getSimpleName();
  private boolean c;
  private final String d;
  private MMInterstitial e;
  private RequestListener f;

  public bz(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit, Bundle paramBundle)
  {
    super(paramContext, paramFlurryAdModule, parame, paramAdUnit);
    this.d = paramBundle.getString("com.flurry.millennial.MYAPIDINTERSTITIAL");
  }

  public final void a()
  {
    this.e = new MMInterstitial((Activity)b());
    this.e.setApid(this.d);
    this.f = new bz.a(this, null);
    this.e.setListener(this.f);
    this.e.fetch();
    this.c = this.e.display();
    if (this.c)
    {
      eo.a(3, b, "Millennial MMAdView Interstitial ad displayed immediately:" + System.currentTimeMillis() + " " + this.c);
      return;
    }
    eo.a(3, b, "Millennial MMAdView Interstitial ad did not display immediately:" + System.currentTimeMillis() + " " + this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bz
 * JD-Core Version:    0.6.2
 */