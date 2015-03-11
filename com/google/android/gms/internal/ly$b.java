package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.a.a;

class ly$b extends a.a
{
  private Handler aeV;

  ly$b(LocationListener paramLocationListener, Looper paramLooper)
  {
    if (paramLooper == null);
    for (ly.a locala = new ly.a(paramLocationListener); ; locala = new ly.a(paramLocationListener, paramLooper))
    {
      this.aeV = locala;
      return;
    }
  }

  public void onLocationChanged(Location paramLocation)
  {
    if (this.aeV == null)
      return;
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    localMessage.obj = paramLocation;
    this.aeV.sendMessage(localMessage);
  }

  public void release()
  {
    this.aeV = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ly.b
 * JD-Core Version:    0.6.2
 */