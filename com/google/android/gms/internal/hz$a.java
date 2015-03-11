package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

abstract class hz$a<T>
  implements Result
{
  private final Status CM;
  protected final T CN;

  public hz$a(Status paramStatus, T paramT)
  {
    this.CM = paramStatus;
    this.CN = paramT;
  }

  public Status getStatus()
  {
    return this.CM;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hz.a
 * JD-Core Version:    0.6.2
 */