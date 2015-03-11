package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

final class hb$f
  implements ServiceConnection
{
  hb$f(hb paramhb)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.Gi.I(paramIBinder);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.Gi.mHandler.sendMessage(this.Gi.mHandler.obtainMessage(4, Integer.valueOf(1)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hb.f
 * JD-Core Version:    0.6.2
 */