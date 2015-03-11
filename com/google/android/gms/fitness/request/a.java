package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.BleDevice;

public class a extends l.a
{
  private final BleScanCallback Uf;

  private a(BleScanCallback paramBleScanCallback)
  {
    this.Uf = ((BleScanCallback)o.i(paramBleScanCallback));
  }

  public void onDeviceFound(BleDevice paramBleDevice)
  {
    this.Uf.onDeviceFound(paramBleDevice);
  }

  public void onScanStopped()
  {
    this.Uf.onScanStopped();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.a
 * JD-Core Version:    0.6.2
 */