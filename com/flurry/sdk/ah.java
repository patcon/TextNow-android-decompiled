package com.flurry.sdk;

import android.content.Context;
import android.view.ViewGroup;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;

public abstract class ah
{
  private final FlurryAdModule a;
  private final AdUnit b;
  private final e c;
  private final String d;

  public ah(FlurryAdModule paramFlurryAdModule, AdUnit paramAdUnit, e parame)
  {
    this.a = paramFlurryAdModule;
    this.b = paramAdUnit;
    this.c = parame;
    if (paramAdUnit != null);
    for (String str = paramAdUnit.b().toString(); ; str = null)
    {
      this.d = str;
      return;
    }
  }

  public abstract void a(Context paramContext, ViewGroup paramViewGroup);

  public FlurryAdModule b()
  {
    return this.a;
  }

  public AdUnit c()
  {
    return this.b;
  }

  public e d()
  {
    return this.c;
  }

  public String e()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ah
 * JD-Core Version:    0.6.2
 */