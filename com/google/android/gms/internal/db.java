package com.google.android.gms.internal;

import android.os.IInterface;

public abstract interface db extends IInterface
{
  public abstract String getProductId();

  public abstract void recordPlayBillingResolution(int paramInt);

  public abstract void recordResolution(int paramInt);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.db
 * JD-Core Version:    0.6.2
 */