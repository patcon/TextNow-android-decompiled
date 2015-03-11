package com.google.android.gms.internal;

import android.content.Intent;
import android.os.IInterface;

public abstract interface ei extends IInterface
{
  public abstract void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent);

  public abstract void onCreate();

  public abstract void onDestroy();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ei
 * JD-Core Version:    0.6.2
 */