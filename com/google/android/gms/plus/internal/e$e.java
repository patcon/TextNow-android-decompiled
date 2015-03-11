package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.People.LoadPeopleResult;

final class e$e extends a
{
  private final a.d<People.LoadPeopleResult> abL;

  public e$e(a.d<People.LoadPeopleResult> paramd)
  {
    Object localObject;
    this.abL = localObject;
  }

  public final void a(DataHolder paramDataHolder, String paramString)
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
        this.abM.a(new e.f(this.abM, this.abL, localStatus, localDataHolder, paramString));
        return;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e.e
 * JD-Core Version:    0.6.2
 */