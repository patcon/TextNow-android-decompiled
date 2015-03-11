package com.google.android.gms.fitness.request;

import android.os.IInterface;
import com.google.android.gms.fitness.data.BleDevice;

public abstract interface l extends IInterface
{
  public abstract void onDeviceFound(BleDevice paramBleDevice);

  public abstract void onScanStopped();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.l
 * JD-Core Version:    0.6.2
 */