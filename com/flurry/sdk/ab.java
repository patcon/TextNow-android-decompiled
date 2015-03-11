package com.flurry.sdk;

import android.content.Context;
import android.content.Intent;
import com.flurry.android.FlurryFullscreenTakeoverActivity;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;

public final class ab extends aj
{
  public ab(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit)
  {
    super(paramContext, paramFlurryAdModule, parame, paramAdUnit);
  }

  public final void a()
  {
    Intent localIntent = new Intent(do.a().b(), FlurryFullscreenTakeoverActivity.class);
    if (!c().a().a(b(), localIntent, e().b().toString()))
      eo.b(a, "Unable to launch FlurryFullscreenTakeoverActivity. Fix by declaring this Activity in your AndroidManifest.xml");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ab
 * JD-Core Version:    0.6.2
 */