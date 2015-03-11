package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class hb$e extends hh.a
{
  private hb Gl;

  public hb$e(hb paramhb)
  {
    this.Gl = paramhb;
  }

  public final void b(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    hm.b("onPostInitComplete can be called only once per call to getServiceFromBroker", this.Gl);
    this.Gl.a(paramInt, paramIBinder, paramBundle);
    this.Gl = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hb.e
 * JD-Core Version:    0.6.2
 */