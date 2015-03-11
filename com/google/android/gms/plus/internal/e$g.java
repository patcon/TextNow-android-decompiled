package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;

final class e$g extends a
{
  private final BaseImplementation.b<Status> alv;

  public e$g(BaseImplementation.b<Status> paramb)
  {
    Object localObject;
    this.alv = localObject;
  }

  public final void h(int paramInt, Bundle paramBundle)
  {
    if (paramBundle != null);
    for (PendingIntent localPendingIntent = (PendingIntent)paramBundle.getParcelable("pendingIntent"); ; localPendingIntent = null)
    {
      Status localStatus = new Status(paramInt, null, localPendingIntent);
      this.alw.a(new e.h(this.alw, this.alv, localStatus));
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e.g
 * JD-Core Version:    0.6.2
 */