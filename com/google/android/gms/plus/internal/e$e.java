package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.People.LoadPeopleResult;

final class e$e extends a
{
  private final BaseImplementation.b<People.LoadPeopleResult> alv;

  public e$e(BaseImplementation.b<People.LoadPeopleResult> paramb)
  {
    Object localObject;
    this.alv = localObject;
  }

  public final void a(DataHolder paramDataHolder, String paramString)
  {
    if (paramDataHolder.gy() != null);
    for (PendingIntent localPendingIntent = (PendingIntent)paramDataHolder.gy().getParcelable("pendingIntent"); ; localPendingIntent = null)
    {
      Status localStatus = new Status(paramDataHolder.getStatusCode(), null, localPendingIntent);
      if ((!localStatus.isSuccess()) && (paramDataHolder != null))
        if (!paramDataHolder.isClosed())
          paramDataHolder.close();
      for (DataHolder localDataHolder = null; ; localDataHolder = paramDataHolder)
      {
        this.alw.a(new e.f(this.alw, this.alv, localStatus, localDataHolder, paramString));
        return;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e.e
 * JD-Core Version:    0.6.2
 */