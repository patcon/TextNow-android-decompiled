package com.flurry.sdk;

import android.content.Context;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.util.Map;

public abstract class ba extends aj
{
  private static final String b = ba.class.getSimpleName();

  public ba(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit)
  {
    super(paramContext, paramFlurryAdModule, parame, paramAdUnit);
  }

  private void a(String paramString, Map<String, String> paramMap)
  {
    eo.a(3, b, "onEvent: " + paramString);
    if (e() != null)
    {
      c().a(new q(paramString, paramMap, b(), e(), d(), 0), c().a(), 0);
      return;
    }
    eo.a(3, b, "adUnit == null");
  }

  public void a(Map<String, String> paramMap)
  {
    a("rendered", paramMap);
  }

  public void b(Map<String, String> paramMap)
  {
    a("clicked", paramMap);
  }

  public void c(Map<String, String> paramMap)
  {
    a("adClosed", paramMap);
  }

  public void d(Map<String, String> paramMap)
  {
    a("renderFailed", paramMap);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ba
 * JD-Core Version:    0.6.2
 */