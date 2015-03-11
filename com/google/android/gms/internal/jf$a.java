package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.LocationListener;

class jf$a extends Handler
{
  private final LocationListener VN;

  public jf$a(LocationListener paramLocationListener)
  {
    this.VN = paramLocationListener;
  }

  public jf$a(LocationListener paramLocationListener, Looper paramLooper)
  {
    super(paramLooper);
    this.VN = paramLocationListener;
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
    this.VN.onLocationChanged(localLocation);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jf.a
 * JD-Core Version:    0.6.2
 */