package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class b
  implements Releasable, Result
{
  protected final DataHolder DG;
  protected final Status yz;

  protected b(DataHolder paramDataHolder)
  {
    this.yz = new Status(paramDataHolder.getStatusCode());
    this.DG = paramDataHolder;
  }

  public Status getStatus()
  {
    return this.yz;
  }

  public void release()
  {
    if (this.DG != null)
      this.DG.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.b
 * JD-Core Version:    0.6.2
 */