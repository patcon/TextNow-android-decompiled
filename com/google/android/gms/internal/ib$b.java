package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppStateManager.StateDeletedResult;
import com.google.android.gms.common.api.Status;

final class ib$b
  implements AppStateManager.StateDeletedResult
{
  private final Status CM;
  private final int Df;

  public ib$b(Status paramStatus, int paramInt)
  {
    this.CM = paramStatus;
    this.Df = paramInt;
  }

  public final int getStateKey()
  {
    return this.Df;
  }

  public final Status getStatus()
  {
    return this.CM;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ib.b
 * JD-Core Version:    0.6.2
 */