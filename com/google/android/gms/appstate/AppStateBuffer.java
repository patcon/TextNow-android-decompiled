package com.google.android.gms.appstate;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class AppStateBuffer extends DataBuffer<AppState>
{
  public AppStateBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }

  public final AppState get(int paramInt)
  {
    return new b(this.DG, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppStateBuffer
 * JD-Core Version:    0.6.2
 */