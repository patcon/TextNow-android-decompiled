package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;

final class e$g extends a
{
  private final a.d<Status> abL;

  public e$g(a.d<Status> paramd)
  {
    Object localObject;
    this.abL = localObject;
  }

  public final void h(int paramInt, Bundle paramBundle)
  {
    if (paramBundle != null);
    for (PendingIntent localPendingIntent = (PendingIntent)paramBundle.getParcelable("pendingIntent"); ; localPendingIntent = null)
    {
      Status localStatus = new Status(paramInt, null, localPendingIntent);
      this.abM.a(new e.h(this.abM, this.abL, localStatus));
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e.g
 * JD-Core Version:    0.6.2
 */