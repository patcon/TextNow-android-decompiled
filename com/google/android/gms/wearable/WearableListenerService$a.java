package com.google.android.gms.wearable;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.ae.a;
import com.google.android.gms.wearable.internal.ah;
import com.google.android.gms.wearable.internal.ak;

class WearableListenerService$a extends ae.a
{
  private WearableListenerService$a(WearableListenerService paramWearableListenerService)
  {
  }

  public void Z(final DataHolder paramDataHolder)
  {
    if (Log.isLoggable("WearableLS", 3))
      new StringBuilder().append("onDataItemChanged: ").append(WearableListenerService.a(this.avf)).append(": ").append(paramDataHolder).toString();
    WearableListenerService.b(this.avf);
    synchronized (WearableListenerService.c(this.avf))
    {
      if (WearableListenerService.d(this.avf))
      {
        paramDataHolder.close();
        return;
      }
      WearableListenerService.e(this.avf).post(new Runnable()
      {
        public void run()
        {
          DataEventBuffer localDataEventBuffer = new DataEventBuffer(paramDataHolder);
          try
          {
            WearableListenerService.a.this.avf.onDataChanged(localDataEventBuffer);
            return;
          }
          finally
          {
            localDataEventBuffer.release();
          }
        }
      });
      return;
    }
  }

  public void a(final ah paramah)
  {
    if (Log.isLoggable("WearableLS", 3))
      new StringBuilder().append("onMessageReceived: ").append(paramah).toString();
    WearableListenerService.b(this.avf);
    synchronized (WearableListenerService.c(this.avf))
    {
      if (WearableListenerService.d(this.avf))
        return;
      WearableListenerService.e(this.avf).post(new Runnable()
      {
        public void run()
        {
          WearableListenerService.a.this.avf.onMessageReceived(paramah);
        }
      });
      return;
    }
  }

  public void a(final ak paramak)
  {
    if (Log.isLoggable("WearableLS", 3))
      new StringBuilder().append("onPeerConnected: ").append(WearableListenerService.a(this.avf)).append(": ").append(paramak).toString();
    WearableListenerService.b(this.avf);
    synchronized (WearableListenerService.c(this.avf))
    {
      if (WearableListenerService.d(this.avf))
        return;
      WearableListenerService.e(this.avf).post(new Runnable()
      {
        public void run()
        {
          WearableListenerService.a.this.avf.onPeerConnected(paramak);
        }
      });
      return;
    }
  }

  public void b(final ak paramak)
  {
    if (Log.isLoggable("WearableLS", 3))
      new StringBuilder().append("onPeerDisconnected: ").append(WearableListenerService.a(this.avf)).append(": ").append(paramak).toString();
    WearableListenerService.b(this.avf);
    synchronized (WearableListenerService.c(this.avf))
    {
      if (WearableListenerService.d(this.avf))
        return;
      WearableListenerService.e(this.avf).post(new Runnable()
      {
        public void run()
        {
          WearableListenerService.a.this.avf.onPeerDisconnected(paramak);
        }
      });
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.WearableListenerService.a
 * JD-Core Version:    0.6.2
 */