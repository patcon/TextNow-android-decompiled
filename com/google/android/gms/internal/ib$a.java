package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppStateManager.StateDeletedResult;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o;

final class ib$a extends ia
{
  private final BaseImplementation.b<AppStateManager.StateDeletedResult> De;

  public ib$a(BaseImplementation.b<AppStateManager.StateDeletedResult> paramb)
  {
    this.De = ((BaseImplementation.b)o.b(paramb, "Result holder must not be null"));
  }

  public final void e(int paramInt1, int paramInt2)
  {
    Status localStatus = new Status(paramInt1);
    this.De.b(new ib.b(localStatus, paramInt2));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ib.a
 * JD-Core Version:    0.6.2
 */