package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

class aw$a extends a
{
  private final BaseImplementation.b<DataApi.DataItemResult> De;
  private final List<FutureTask<Boolean>> avW;

  aw$a(BaseImplementation.b<DataApi.DataItemResult> paramb, List<FutureTask<Boolean>> paramList)
  {
    this.De = paramb;
    this.avW = paramList;
  }

  public void a(ao paramao)
  {
    this.De.b(new f.a(new Status(paramao.statusCode), paramao.avA));
    if (paramao.statusCode != 0)
    {
      Iterator localIterator = this.avW.iterator();
      while (localIterator.hasNext())
        ((FutureTask)localIterator.next()).cancel(true);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.aw.a
 * JD-Core Version:    0.6.2
 */