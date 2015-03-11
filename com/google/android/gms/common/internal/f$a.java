package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.ArrayList;

final class f$a extends Handler
{
  public f$a(f paramf, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
      synchronized (f.a(this.LR))
      {
        if ((f.b(this.LR).gq()) && (f.b(this.LR).isConnected()) && (f.a(this.LR).contains(paramMessage.obj)))
        {
          Bundle localBundle = f.b(this.LR).fC();
          ((GoogleApiClient.ConnectionCallbacks)paramMessage.obj).onConnected(localBundle);
        }
        return;
      }
    Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.f.a
 * JD-Core Version:    0.6.2
 */