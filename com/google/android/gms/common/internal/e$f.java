package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

final class e$f
  implements ServiceConnection
{
  e$f(e parame)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.LF.N(paramIBinder);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.LF.mHandler.sendMessage(this.LF.mHandler.obtainMessage(4, Integer.valueOf(1)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.e.f
 * JD-Core Version:    0.6.2
 */