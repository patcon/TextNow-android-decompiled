package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

@ez
final class ga$a
{
  private long vH = -1L;
  private long vI = -1L;

  public final long cR()
  {
    return this.vI;
  }

  public final void cS()
  {
    this.vI = SystemClock.elapsedRealtime();
  }

  public final void cT()
  {
    this.vH = SystemClock.elapsedRealtime();
  }

  public final Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("topen", this.vH);
    localBundle.putLong("tclose", this.vI);
    return localBundle;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ga.a
 * JD-Core Version:    0.6.2
 */