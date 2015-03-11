package com.google.android.gms.appstate;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

public final class b extends d
  implements AppState
{
  b(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }

  public final boolean equals(Object paramObject)
  {
    return a.a(this, paramObject);
  }

  public final AppState fo()
  {
    return new a(this);
  }

  public final byte[] getConflictData()
  {
    return getByteArray("conflict_data");
  }

  public final String getConflictVersion()
  {
    return getString("conflict_version");
  }

  public final int getKey()
  {
    return getInteger("key");
  }

  public final byte[] getLocalData()
  {
    return getByteArray("local_data");
  }

  public final String getLocalVersion()
  {
    return getString("local_version");
  }

  public final boolean hasConflict()
  {
    return !aS("conflict_version");
  }

  public final int hashCode()
  {
    return a.a(this);
  }

  public final String toString()
  {
    return a.b(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.b
 * JD-Core Version:    0.6.2
 */