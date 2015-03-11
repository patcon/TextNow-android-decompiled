package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppStateManager.StateDeletedResult;
import com.google.android.gms.common.api.Status;

final class ga$b
  implements AppStateManager.StateDeletedResult
{
  private final int yS;
  private final Status yz;

  public ga$b(Status paramStatus, int paramInt)
  {
    this.yz = paramStatus;
    this.yS = paramInt;
  }

  public final int getStateKey()
  {
    return this.yS;
  }

  public final Status getStatus()
  {
    return this.yz;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ga.b
 * JD-Core Version:    0.6.2
 */