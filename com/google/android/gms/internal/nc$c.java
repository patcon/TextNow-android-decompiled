package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

final class nc$c extends na.a
{
  private final BaseImplementation.b<PanoramaApi.PanoramaResult> De;

  public nc$c(BaseImplementation.b<PanoramaApi.PanoramaResult> paramb)
  {
    this.De = paramb;
  }

  public final void a(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
  {
    if (paramBundle != null);
    for (PendingIntent localPendingIntent = (PendingIntent)paramBundle.getParcelable("pendingIntent"); ; localPendingIntent = null)
    {
      Status localStatus = new Status(paramInt1, null, localPendingIntent);
      this.De.b(new ne(localStatus, paramIntent));
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nc.c
 * JD-Core Version:    0.6.2
 */