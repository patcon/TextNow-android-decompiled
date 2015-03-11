package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class a
  implements ServiceConnection
{
  boolean CQ = false;
  private final BlockingQueue<IBinder> CR = new LinkedBlockingQueue();

  public IBinder ew()
  {
    if (this.CQ)
      throw new IllegalStateException();
    this.CQ = true;
    return (IBinder)this.CR.take();
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      this.CR.put(paramIBinder);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.a
 * JD-Core Version:    0.6.2
 */