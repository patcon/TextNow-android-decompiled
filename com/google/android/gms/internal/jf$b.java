package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.a.a;

class jf$b extends a.a
{
  private Handler VO;

  jf$b(LocationListener paramLocationListener, Looper paramLooper)
  {
    if (paramLooper == null);
    for (jf.a locala = new jf.a(paramLocationListener); ; locala = new jf.a(paramLocationListener, paramLooper))
    {
      this.VO = locala;
      return;
    }
  }

  public void onLocationChanged(Location paramLocation)
  {
    if (this.VO == null)
      return;
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    localMessage.obj = paramLocation;
    this.VO.sendMessage(localMessage);
  }

  public void release()
  {
    this.VO = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jf.b
 * JD-Core Version:    0.6.2
 */