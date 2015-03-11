package com.google.android.gms.appstate;

import com.google.android.gms.common.api.Status;

abstract class AppStateManager$c extends AppStateManager.a<AppStateManager.StateListResult>
{
  public AppStateManager.StateListResult h(final Status paramStatus)
  {
    return new AppStateManager.StateListResult()
    {
      public AppStateBuffer getStateBuffer()
      {
        return new AppStateBuffer(null);
      }

      public Status getStatus()
      {
        return paramStatus;
      }
    };
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppStateManager.c
 * JD-Core Version:    0.6.2
 */