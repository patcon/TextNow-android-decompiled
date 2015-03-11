package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

class c$b extends Handler
{
  c$b(c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      c.a(this.Ek).lock();
      try
      {
        if ((!this.Ek.isConnected()) && (!this.Ek.isConnecting()))
          this.Ek.connect();
        return;
      }
      finally
      {
        c.a(this.Ek).unlock();
      }
    }
    Log.wtf("GoogleApiClientImpl", "Don't know how to handle this message.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c.b
 * JD-Core Version:    0.6.2
 */