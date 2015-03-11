package com.google.android.gms.appstate;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface AppStateManager$StateResult extends Releasable, Result
{
  public abstract AppStateManager.StateConflictResult getConflictResult();

  public abstract AppStateManager.StateLoadedResult getLoadedResult();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppStateManager.StateResult
 * JD-Core Version:    0.6.2
 */