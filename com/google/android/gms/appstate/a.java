package com.google.android.gms.appstate;

import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hk.a;

public final class a
  implements AppState
{
  private final int yB;
  private final String yC;
  private final byte[] yD;
  private final boolean yE;
  private final String yF;
  private final byte[] yG;

  public a(AppState paramAppState)
  {
    this.yB = paramAppState.getKey();
    this.yC = paramAppState.getLocalVersion();
    this.yD = paramAppState.getLocalData();
    this.yE = paramAppState.hasConflict();
    this.yF = paramAppState.getConflictVersion();
    this.yG = paramAppState.getConflictData();
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
    return hk.hashCode(arrayOfObject);
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
    while ((!hk.equal(Integer.valueOf(localAppState.getKey()), Integer.valueOf(paramAppState.getKey()))) || (!hk.equal(localAppState.getLocalVersion(), paramAppState.getLocalVersion())) || (!hk.equal(localAppState.getLocalData(), paramAppState.getLocalData())) || (!hk.equal(Boolean.valueOf(localAppState.hasConflict()), Boolean.valueOf(paramAppState.hasConflict()))) || (!hk.equal(localAppState.getConflictVersion(), paramAppState.getConflictVersion())) || (!hk.equal(localAppState.getConflictData(), paramAppState.getConflictData())));
    return true;
  }

  static String b(AppState paramAppState)
  {
    return hk.e(paramAppState).a("Key", Integer.valueOf(paramAppState.getKey())).a("LocalVersion", paramAppState.getLocalVersion()).a("LocalData", paramAppState.getLocalData()).a("HasConflict", Boolean.valueOf(paramAppState.hasConflict())).a("ConflictVersion", paramAppState.getConflictVersion()).a("ConflictData", paramAppState.getConflictData()).toString();
  }

  public final AppState dS()
  {
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }

  public final byte[] getConflictData()
  {
    return this.yG;
  }

  public final String getConflictVersion()
  {
    return this.yF;
  }

  public final int getKey()
  {
    return this.yB;
  }

  public final byte[] getLocalData()
  {
    return this.yD;
  }

  public final String getLocalVersion()
  {
    return this.yC;
  }

  public final boolean hasConflict()
  {
    return this.yE;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.a
 * JD-Core Version:    0.6.2
 */