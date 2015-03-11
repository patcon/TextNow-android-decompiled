package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

class b$b extends Handler
{
  b$b(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      b.a(this.Jq).lock();
      try
      {
        if ((!this.Jq.isConnected()) && (!this.Jq.isConnecting()))
        {
          boolean bool = b.e(this.Jq);
          if (bool);
        }
        else
        {
          return;
        }
        b.h(this.Jq);
        this.Jq.connect();
        return;
      }
      finally
      {
        b.a(this.Jq).unlock();
      }
    }
    Log.wtf("GoogleApiClientImpl", "Don't know how to handle this message.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.b.b
 * JD-Core Version:    0.6.2
 */