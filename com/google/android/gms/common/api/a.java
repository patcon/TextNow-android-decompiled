package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class a
  implements Releasable, Result
{
  protected final Status CM;
  protected final DataHolder II;

  protected a(DataHolder paramDataHolder)
  {
    this.CM = new Status(paramDataHolder.getStatusCode());
    this.II = paramDataHolder;
  }

  public Status getStatus()
  {
    return this.CM;
  }

  public void release()
  {
    if (this.II != null)
      this.II.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.a
 * JD-Core Version:    0.6.2
 */