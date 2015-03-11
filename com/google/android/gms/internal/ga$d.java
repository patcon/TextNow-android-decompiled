package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.appstate.AppStateManager.StateListResult;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.data.DataHolder;

final class ga$d extends b
  implements AppStateManager.StateListResult
{
  private final AppStateBuffer yT;

  public ga$d(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    this.yT = new AppStateBuffer(paramDataHolder);
  }

  public final AppStateBuffer getStateBuffer()
  {
    return this.yT;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ga.d
 * JD-Core Version:    0.6.2
 */