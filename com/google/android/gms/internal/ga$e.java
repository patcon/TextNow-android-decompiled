package com.google.android.gms.internal;

import com.google.android.gms.appstate.AppStateManager.StateResult;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.data.DataHolder;

final class ga$e extends fz
{
  private final a.d<AppStateManager.StateResult> yR;

  public ga$e(a.d<AppStateManager.StateResult> paramd)
  {
    this.yR = ((a.d)hm.b(paramd, "Result holder must not be null"));
  }

  public final void a(int paramInt, DataHolder paramDataHolder)
  {
    this.yR.a(new ga.f(paramInt, paramDataHolder));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ga.e
 * JD-Core Version:    0.6.2
 */