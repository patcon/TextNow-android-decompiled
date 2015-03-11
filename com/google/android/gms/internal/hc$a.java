package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.ArrayList;

final class hc$a extends Handler
{
  public hc$a(hc paramhc, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
      synchronized (hc.a(this.Gu))
      {
        if ((hc.b(this.Gu).eO()) && (hc.b(this.Gu).isConnected()) && (hc.a(this.Gu).contains(paramMessage.obj)))
        {
          Bundle localBundle = hc.b(this.Gu).ef();
          ((GoogleApiClient.ConnectionCallbacks)paramMessage.obj).onConnected(localBundle);
        }
        return;
      }
    Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hc.a
 * JD-Core Version:    0.6.2
 */