package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppStateManager.StateListResult;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.o;

final class ib$c extends ia
{
  private final BaseImplementation.b<AppStateManager.StateListResult> De;

  public ib$c(BaseImplementation.b<AppStateManager.StateListResult> paramb)
  {
    this.De = ((BaseImplementation.b)o.b(paramb, "Result holder must not be null"));
  }

  public final void a(DataHolder paramDataHolder)
  {
    this.De.b(new ib.d(paramDataHolder));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ib.c
 * JD-Core Version:    0.6.2
 */