package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppState;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.appstate.AppStateManager.StateConflictResult;
import com.google.android.gms.appstate.AppStateManager.StateLoadedResult;
import com.google.android.gms.appstate.AppStateManager.StateResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.data.DataHolder;

final class ga$f extends b
  implements AppStateManager.StateConflictResult, AppStateManager.StateLoadedResult, AppStateManager.StateResult
{
  private final int yS;
  private final AppStateBuffer yT;

  public ga$f(int paramInt, DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    this.yS = paramInt;
    this.yT = new AppStateBuffer(paramDataHolder);
  }

  private boolean dW()
  {
    return this.yz.getStatusCode() == 2000;
  }

  public final AppStateManager.StateConflictResult getConflictResult()
  {
    if (dW())
      return this;
    return null;
  }

  public final AppStateManager.StateLoadedResult getLoadedResult()
  {
    if (dW())
      this = null;
    return this;
  }

  public final byte[] getLocalData()
  {
    if (this.yT.getCount() == 0)
      return null;
    return this.yT.get(0).getLocalData();
  }

  public final String getResolvedVersion()
  {
    if (this.yT.getCount() == 0)
      return null;
    return this.yT.get(0).getConflictVersion();
  }

  public final byte[] getServerData()
  {
    if (this.yT.getCount() == 0)
      return null;
    return this.yT.get(0).getConflictData();
  }

  public final int getStateKey()
  {
    return this.yS;
  }

  public final void release()
  {
    this.yT.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ga.f
 * JD-Core Version:    0.6.2
 */