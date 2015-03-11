package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

abstract class fy$a<T>
  implements Result
{
  protected final T yA;
  private final Status yz;

  public fy$a(Status paramStatus, T paramT)
  {
    this.yz = paramStatus;
    this.yA = paramT;
  }

  public Status getStatus()
  {
    return this.yz;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fy.a
 * JD-Core Version:    0.6.2
 */