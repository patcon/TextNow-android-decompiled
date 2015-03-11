package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;

final class ga$g extends fz
{
  private final a.d<Status> yR;

  public ga$g(a.d<Status> paramd)
  {
    this.yR = ((a.d)hm.b(paramd, "Holder must not be null"));
  }

  public final void dT()
  {
    Status localStatus = new Status(0);
    this.yR.a(localStatus);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ga.g
 * JD-Core Version:    0.6.2
 */