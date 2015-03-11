package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import com.inmobi.commons.InMobi;
import com.inmobi.monetization.IMInterstitial;
import java.lang.reflect.Method;

public class bv extends ba
{
  private static final String b = bv.class.getSimpleName();
  private static final Method c = g();
  private final String d;
  private IMInterstitial e;
  private bv.a f;

  public bv(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit, Bundle paramBundle)
  {
    super(paramContext, paramFlurryAdModule, parame, paramAdUnit);
    this.d = paramBundle.getString("com.flurry.inmobi.MY_APP_ID");
    InMobi.initialize((Activity)b(), this.d);
  }

  private void a(IMInterstitial paramIMInterstitial, bv.a parama)
  {
    if (paramIMInterstitial == null);
    while (true)
    {
      return;
      try
      {
        if (c != null)
        {
          c.invoke(paramIMInterstitial, new Object[] { parama });
          return;
        }
      }
      catch (Exception localException)
      {
        eo.a(3, b, "InMobi set listener failed.");
      }
    }
  }

  private static Method g()
  {
    for (Method localMethod : IMInterstitial.class.getMethods())
    {
      String str = localMethod.getName();
      if ((str.equals("setIMInterstitialListener")) || (str.equals("setImInterstitialListener")))
        return localMethod;
    }
    return null;
  }

  public void a()
  {
    this.e = new IMInterstitial((Activity)b(), this.d);
    this.f = new bv.a(this, null);
    a(this.e, this.f);
    this.e.loadInterstitial();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bv
 * JD-Core Version:    0.6.2
 */