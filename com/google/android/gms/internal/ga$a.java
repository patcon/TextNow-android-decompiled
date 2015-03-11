package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppStateManager.StateDeletedResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;

final class ga$a extends fz
{
  private final a.d<AppStateManager.StateDeletedResult> yR;

  public ga$a(a.d<AppStateManager.StateDeletedResult> paramd)
  {
    this.yR = ((a.d)hm.b(paramd, "Result holder must not be null"));
  }

  public final void b(int paramInt1, int paramInt2)
  {
    Status localStatus = new Status(paramInt1);
    this.yR.a(new ga.b(localStatus, paramInt2));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ga.a
 * JD-Core Version:    0.6.2
 */