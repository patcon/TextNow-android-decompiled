package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o;

public abstract class kk$c extends kk.a<Status>
{
  protected Status d(Status paramStatus)
  {
    if (!paramStatus.isSuccess());
    for (boolean bool = true; ; bool = false)
    {
      o.K(bool);
      return paramStatus;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kk.c
 * JD-Core Version:    0.6.2
 */