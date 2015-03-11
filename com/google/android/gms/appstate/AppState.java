package com.google.android.gms.appstate;

import com.google.android.gms.common.data.Freezable;

public abstract interface AppState extends Freezable<AppState>
{
  public abstract byte[] getConflictData();

  public abstract String getConflictVersion();

  public abstract int getKey();

  public abstract byte[] getLocalData();

  public abstract String getLocalVersion();

  public abstract boolean hasConflict();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppState
 * JD-Core Version:    0.6.2
 */