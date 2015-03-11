package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.appstate.AppStateManager.StateListResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.data.DataHolder;

final class ib$d extends a
  implements AppStateManager.StateListResult
{
  private final AppStateBuffer Dg;

  public ib$d(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    this.Dg = new AppStateBuffer(paramDataHolder);
  }

  public final AppStateBuffer getStateBuffer()
  {
    return this.Dg;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ib.d
 * JD-Core Version:    0.6.2
 */