package com.google.android.gms.internal;

import android.content.Intent;
import android.os.IInterface;

public abstract interface df extends IInterface
{
  public abstract void finishPurchase();

  public abstract String getProductId();

  public abstract Intent getPurchaseData();

  public abstract int getResultCode();

  public abstract boolean isVerified();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.df
 * JD-Core Version:    0.6.2
 */