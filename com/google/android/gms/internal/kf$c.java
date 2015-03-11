package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

final class kf$c extends kd.a
{
  private final a.d<PanoramaApi.PanoramaResult> yR;

  public kf$c(a.d<PanoramaApi.PanoramaResult> paramd)
  {
    this.yR = paramd;
  }

  public final void a(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
  {
    if (paramBundle != null);
    for (PendingIntent localPendingIntent = (PendingIntent)paramBundle.getParcelable("pendingIntent"); ; localPendingIntent = null)
    {
      Status localStatus = new Status(paramInt1, null, localPendingIntent);
      this.yR.a(new kh(localStatus, paramIntent));
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kf.c
 * JD-Core Version:    0.6.2
 */