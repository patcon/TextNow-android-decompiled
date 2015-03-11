package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e.b;

final class e$h extends com.google.android.gms.common.internal.e<d>.b<BaseImplementation.b<Status>>
{
  private final Status CM;

  public e$h(BaseImplementation.b<Status> paramb, Status paramStatus)
  {
    super(paramb, paramStatus);
    Object localObject;
    this.CM = localObject;
  }

  protected final void gT()
  {
  }

  protected final void n(BaseImplementation.b<Status> paramb)
  {
    this.alw.disconnect();
    if (paramb != null)
      paramb.b(this.CM);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e.h
 * JD-Core Version:    0.6.2
 */