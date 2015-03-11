package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

final class eg$a
{
  private long rN = -1L;
  private long rO = -1L;

  public final long bE()
  {
    return this.rO;
  }

  public final void bF()
  {
    this.rO = SystemClock.elapsedRealtime();
  }

  public final void bG()
  {
    this.rN = SystemClock.elapsedRealtime();
  }

  public final Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("topen", this.rN);
    localBundle.putLong("tclose", this.rO);
    return localBundle;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eg.a
 * JD-Core Version:    0.6.2
 */