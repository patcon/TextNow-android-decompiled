package com.flurry.sdk;

import android.content.Context;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.lang.ref.WeakReference;

public abstract class aj
{
  static final String a = aj.class.getSimpleName();
  private final WeakReference<Context> b;
  private final FlurryAdModule c;
  private final e d;
  private final AdUnit e;

  public aj(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit)
  {
    this.b = new WeakReference(paramContext);
    this.c = paramFlurryAdModule;
    this.d = parame;
    this.e = paramAdUnit;
  }

  public abstract void a();

  public Context b()
  {
    return (Context)this.b.get();
  }

  public FlurryAdModule c()
  {
    return this.c;
  }

  public e d()
  {
    return this.d;
  }

  public AdUnit e()
  {
    return this.e;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.aj
 * JD-Core Version:    0.6.2
 */