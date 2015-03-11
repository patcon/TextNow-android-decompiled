package com.google.android.gms.common.internal;

import com.google.android.gms.common.data.DataHolder;

public abstract class e$d<TListener> extends e<T>.b<TListener>
{
  private final DataHolder II;

  public e$d(TListener paramTListener, DataHolder paramDataHolder)
  {
    super(paramTListener, paramDataHolder);
    Object localObject;
    this.II = localObject;
  }

  protected abstract void a(TListener paramTListener, DataHolder paramDataHolder);

  protected final void g(TListener paramTListener)
  {
    a(paramTListener, this.II);
  }

  protected void gT()
  {
    if (this.II != null)
      this.II.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.e.d
 * JD-Core Version:    0.6.2
 */