package com.google.android.gms.internal;

import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;

class lc$d extends kt.a
{
  private final BaseImplementation.b<Status> De;
  private final lc.b TX;

  private lc$d(BaseImplementation.b<Status> paramb, lc.b paramb1)
  {
    this.De = paramb;
    this.TX = paramb1;
  }

  public void k(Status paramStatus)
  {
    if ((this.TX != null) && (paramStatus.isSuccess()))
      this.TX.jd();
    this.De.b(paramStatus);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lc.d
 * JD-Core Version:    0.6.2
 */