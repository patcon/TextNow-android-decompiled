package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.Moments.LoadMomentsResult;

final class e$b extends a
{
  private final a.d<Moments.LoadMomentsResult> abL;

  public e$b(a.d<Moments.LoadMomentsResult> paramd)
  {
    Object localObject;
    this.abL = localObject;
  }

  public final void a(DataHolder paramDataHolder, String paramString1, String paramString2)
  {
    if (paramDataHolder.eU() != null);
    for (PendingIntent localPendingIntent = (PendingIntent)paramDataHolder.eU().getParcelable("pendingIntent"); ; localPendingIntent = null)
    {
      Status localStatus = new Status(paramDataHolder.getStatusCode(), null, localPendingIntent);
      if ((!localStatus.isSuccess()) && (paramDataHolder != null))
        if (!paramDataHolder.isClosed())
          paramDataHolder.close();
      for (DataHolder localDataHolder = null; ; localDataHolder = paramDataHolder)
      {
        this.abM.a(new e.c(this.abM, this.abL, localStatus, localDataHolder, paramString1, paramString2));
        return;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e.b
 * JD-Core Version:    0.6.2
 */