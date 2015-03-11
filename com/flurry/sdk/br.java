package com.flurry.sdk;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;

public final class br extends ba
{
  private static final String b = br.class.getSimpleName();
  private final String c;
  private final String d;
  private final boolean e;
  private final InterstitialAd f;
  private final AdListener g;

  public br(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit, Bundle paramBundle)
  {
    super(paramContext, paramFlurryAdModule, parame, paramAdUnit);
    this.c = paramBundle.getString("com.flurry.gms.ads.MY_AD_UNIT_ID");
    this.d = paramBundle.getString("com.flurry.gms.ads.MYTEST_AD_DEVICE_ID");
    this.e = paramBundle.getBoolean("com.flurry.gms.ads.test");
    this.g = new br.a(this, null);
    this.f = new InterstitialAd(b());
    this.f.setAdUnitId(this.c);
    this.f.setAdListener(this.g);
  }

  public final void a()
  {
    AdRequest.Builder localBuilder = new AdRequest.Builder();
    if (this.e)
    {
      eo.a(3, b, "GMS AdView set to Test Mode.");
      localBuilder.addTestDevice(AdRequest.DEVICE_ID_EMULATOR);
      if (!TextUtils.isEmpty(this.d))
        localBuilder.addTestDevice(this.d);
    }
    this.f.loadAd(localBuilder.build());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.br
 * JD-Core Version:    0.6.2
 */