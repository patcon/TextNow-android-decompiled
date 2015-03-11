package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;

public abstract class hb$d<TListener> extends hb<T>.b<TListener>
{
  private final DataHolder DG;

  public hb$d(TListener paramTListener, DataHolder paramDataHolder)
  {
    super(paramTListener, paramDataHolder);
    Object localObject;
    this.DG = localObject;
  }

  protected abstract void a(TListener paramTListener, DataHolder paramDataHolder);

  protected final void d(TListener paramTListener)
  {
    a(paramTListener, this.DG);
  }

  protected void fu()
  {
    if (this.DG != null)
      this.DG.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hb.d
 * JD-Core Version:    0.6.2
 */