package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppState;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.appstate.AppStateManager.StateConflictResult;
import com.google.android.gms.appstate.AppStateManager.StateLoadedResult;
import com.google.android.gms.appstate.AppStateManager.StateResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.data.DataHolder;

final class ib$f extends a
  implements AppStateManager.StateConflictResult, AppStateManager.StateLoadedResult, AppStateManager.StateResult
{
  private final int Df;
  private final AppStateBuffer Dg;

  public ib$f(int paramInt, DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    this.Df = paramInt;
    this.Dg = new AppStateBuffer(paramDataHolder);
  }

  private boolean fs()
  {
    return this.CM.getStatusCode() == 2000;
  }

  public final AppStateManager.StateConflictResult getConflictResult()
  {
    if (fs())
      return this;
    return null;
  }

  public final AppStateManager.StateLoadedResult getLoadedResult()
  {
    if (fs())
      this = null;
    return this;
  }

  public final byte[] getLocalData()
  {
    if (this.Dg.getCount() == 0)
      return null;
    return this.Dg.get(0).getLocalData();
  }

  public final String getResolvedVersion()
  {
    if (this.Dg.getCount() == 0)
      return null;
    return this.Dg.get(0).getConflictVersion();
  }

  public final byte[] getServerData()
  {
    if (this.Dg.getCount() == 0)
      return null;
    return this.Dg.get(0).getConflictData();
  }

  public final int getStateKey()
  {
    return this.Df;
  }

  public final void release()
  {
    this.Dg.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ib.f
 * JD-Core Version:    0.6.2
 */