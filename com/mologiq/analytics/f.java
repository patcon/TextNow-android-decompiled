package com.mologiq.analytics;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

final class f
  implements ServiceConnection
{
  boolean a = false;
  private final LinkedBlockingQueue<IBinder> b = new LinkedBlockingQueue(1);

  public final IBinder a()
  {
    if (this.a)
      throw new IllegalStateException();
    this.a = true;
    return (IBinder)this.b.take();
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      this.b.put(paramIBinder);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.f
 * JD-Core Version:    0.6.2
 */