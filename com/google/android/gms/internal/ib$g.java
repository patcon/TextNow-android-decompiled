package com.google.android.gms.internal;

import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o;

final class ib$g extends ia
{
  private final BaseImplementation.b<Status> De;

  public ib$g(BaseImplementation.b<Status> paramb)
  {
    this.De = ((BaseImplementation.b)o.b(paramb, "Holder must not be null"));
  }

  public final void fp()
  {
    Status localStatus = new Status(0);
    this.De.b(localStatus);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ib.g
 * JD-Core Version:    0.6.2
 */