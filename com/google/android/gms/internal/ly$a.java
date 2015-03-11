package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.LocationListener;

class ly$a extends Handler
{
  private final LocationListener aeU;

  public ly$a(LocationListener paramLocationListener)
  {
    this.aeU = paramLocationListener;
  }

  public ly$a(LocationListener paramLocationListener, Looper paramLooper)
  {
    super(paramLooper);
    this.aeU = paramLocationListener;
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return;
    case 1:
    }
    Location localLocation = new Location((Location)paramMessage.obj);
    this.aeU.onLocationChanged(localLocation);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ly.a
 * JD-Core Version:    0.6.2
 */