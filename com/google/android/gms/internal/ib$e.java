package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppStateManager.StateResult;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.o;

final class ib$e extends ia
{
  private final BaseImplementation.b<AppStateManager.StateResult> De;

  public ib$e(BaseImplementation.b<AppStateManager.StateResult> paramb)
  {
    this.De = ((BaseImplementation.b)o.b(paramb, "Result holder must not be null"));
  }

  public final void a(int paramInt, DataHolder paramDataHolder)
  {
    this.De.b(new ib.f(paramInt, paramDataHolder));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ib.e
 * JD-Core Version:    0.6.2
 */