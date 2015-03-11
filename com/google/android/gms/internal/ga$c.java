package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppStateManager.StateListResult;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.data.DataHolder;

final class ga$c extends fz
{
  private final a.d<AppStateManager.StateListResult> yR;

  public ga$c(a.d<AppStateManager.StateListResult> paramd)
  {
    this.yR = ((a.d)hm.b(paramd, "Result holder must not be null"));
  }

  public final void a(DataHolder paramDataHolder)
  {
    this.yR.a(new ga.d(paramDataHolder));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ga.c
 * JD-Core Version:    0.6.2
 */