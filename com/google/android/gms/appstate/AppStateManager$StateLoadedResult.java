package com.google.android.gms.appstate;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface AppStateManager$StateLoadedResult extends Releasable, Result
{
  public abstract byte[] getLocalData();

  public abstract int getStateKey();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppStateManager.StateLoadedResult
 * JD-Core Version:    0.6.2
 */