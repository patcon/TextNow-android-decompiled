package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.d;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.model.moments.MomentBuffer;

final class e$c extends e<d>.d<BaseImplementation.b<Moments.LoadMomentsResult>>
  implements Moments.LoadMomentsResult
{
  private final Status CM;
  private final String Nq;
  private final String alx;
  private MomentBuffer aly;

  public e$c(BaseImplementation.b<Moments.LoadMomentsResult> paramb, Status paramStatus, DataHolder paramDataHolder, String paramString1, String paramString2)
  {
    super(paramb, paramStatus, paramString1);
    this.CM = paramDataHolder;
    this.Nq = paramString2;
    Object localObject;
    this.alx = localObject;
  }

  protected final void a(BaseImplementation.b<Moments.LoadMomentsResult> paramb, DataHolder paramDataHolder)
  {
    if (paramDataHolder != null);
    for (MomentBuffer localMomentBuffer = new MomentBuffer(paramDataHolder); ; localMomentBuffer = null)
    {
      this.aly = localMomentBuffer;
      paramb.b(this);
      return;
    }
  }

  public final MomentBuffer getMomentBuffer()
  {
    return this.aly;
  }

  public final String getNextPageToken()
  {
    return this.Nq;
  }

  public final Status getStatus()
  {
    return this.CM;
  }

  public final String getUpdated()
  {
    return this.alx;
  }

  public final void release()
  {
    if (this.aly != null)
      this.aly.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e.c
 * JD-Core Version:    0.6.2
 */