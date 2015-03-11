package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.hb.d;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.model.moments.MomentBuffer;

final class e$c extends hb<d>.d<a.d<Moments.LoadMomentsResult>>
  implements Moments.LoadMomentsResult
{
  private final String HS;
  private final String abN;
  private MomentBuffer abO;
  private final Status yz;

  public e$c(a.d<Moments.LoadMomentsResult> paramd, Status paramStatus, DataHolder paramDataHolder, String paramString1, String paramString2)
  {
    super(paramd, paramStatus, paramString1);
    this.yz = paramDataHolder;
    this.HS = paramString2;
    Object localObject;
    this.abN = localObject;
  }

  protected final void a(a.d<Moments.LoadMomentsResult> paramd, DataHolder paramDataHolder)
  {
    if (paramDataHolder != null);
    for (MomentBuffer localMomentBuffer = new MomentBuffer(paramDataHolder); ; localMomentBuffer = null)
    {
      this.abO = localMomentBuffer;
      paramd.a(this);
      return;
    }
  }

  public final MomentBuffer getMomentBuffer()
  {
    return this.abO;
  }

  public final String getNextPageToken()
  {
    return this.HS;
  }

  public final Status getStatus()
  {
    return this.yz;
  }

  public final String getUpdated()
  {
    return this.abN;
  }

  public final void release()
  {
    if (this.abO != null)
      this.abO.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e.c
 * JD-Core Version:    0.6.2
 */