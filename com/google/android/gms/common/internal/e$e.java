package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class e$e extends k.a
{
  private e LI;

  public e$e(e parame)
  {
    this.LI = parame;
  }

  public final void b(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    o.b("onPostInitComplete can be called only once per call to getServiceFromBroker", this.LI);
    this.LI.a(paramInt, paramIBinder, paramBundle);
    this.LI = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.e.e
 * JD-Core Version:    0.6.2
 */