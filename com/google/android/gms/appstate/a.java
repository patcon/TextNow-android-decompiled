package com.google.android.gms.appstate;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;

public final class a
  implements AppState
{
  private final int CO;
  private final String CP;
  private final byte[] CQ;
  private final boolean CR;
  private final String CS;
  private final byte[] CT;

  public a(AppState paramAppState)
  {
    this.CO = paramAppState.getKey();
    this.CP = paramAppState.getLocalVersion();
    this.CQ = paramAppState.getLocalData();
    this.CR = paramAppState.hasConflict();
    this.CS = paramAppState.getConflictVersion();
    this.CT = paramAppState.getConflictData();
  }

  static int a(AppState paramAppState)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Integer.valueOf(paramAppState.getKey());
    arrayOfObject[1] = paramAppState.getLocalVersion();
    arrayOfObject[2] = paramAppState.getLocalData();
    arrayOfObject[3] = Boolean.valueOf(paramAppState.hasConflict());
    arrayOfObject[4] = paramAppState.getConflictVersion();
    arrayOfObject[5] = paramAppState.getConflictData();
    return n.hashCode(arrayOfObject);
  }

  static boolean a(AppState paramAppState, Object paramObject)
  {
    if (!(paramObject instanceof AppState));
    AppState localAppState;
    do
    {
      return false;
      if (paramAppState == paramObject)
        return true;
      localAppState = (AppState)paramObject;
    }
    while ((!n.equal(Integer.valueOf(localAppState.getKey()), Integer.valueOf(paramAppState.getKey()))) || (!n.equal(localAppState.getLocalVersion(), paramAppState.getLocalVersion())) || (!n.equal(localAppState.getLocalData(), paramAppState.getLocalData())) || (!n.equal(Boolean.valueOf(localAppState.hasConflict()), Boolean.valueOf(paramAppState.hasConflict()))) || (!n.equal(localAppState.getConflictVersion(), paramAppState.getConflictVersion())) || (!n.equal(localAppState.getConflictData(), paramAppState.getConflictData())));
    return true;
  }

  static String b(AppState paramAppState)
  {
    return n.h(paramAppState).a("Key", Integer.valueOf(paramAppState.getKey())).a("LocalVersion", paramAppState.getLocalVersion()).a("LocalData", paramAppState.getLocalData()).a("HasConflict", Boolean.valueOf(paramAppState.hasConflict())).a("ConflictVersion", paramAppState.getConflictVersion()).a("ConflictData", paramAppState.getConflictData()).toString();
  }

  public final boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }

  public final AppState fo()
  {
    return this;
  }

  public final byte[] getConflictData()
  {
    return this.CT;
  }

  public final String getConflictVersion()
  {
    return this.CS;
  }

  public final int getKey()
  {
    return this.CO;
  }

  public final byte[] getLocalData()
  {
    return this.CQ;
  }

  public final String getLocalVersion()
  {
    return this.CP;
  }

  public final boolean hasConflict()
  {
    return this.CR;
  }

  public final int hashCode()
  {
    return a(this);
  }

  public final boolean isDataValid()
  {
    return true;
  }

  public final String toString()
  {
    return b(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.a
 * JD-Core Version:    0.6.2
 */