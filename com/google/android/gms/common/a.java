package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class a
  implements ServiceConnection
{
  boolean HC = false;
  private final BlockingQueue<IBinder> HD = new LinkedBlockingQueue();

  public IBinder fW()
  {
    if (this.HC)
      throw new IllegalStateException();
    this.HC = true;
    return (IBinder)this.HD.take();
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.HD.add(paramIBinder);
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.a
 * JD-Core Version:    0.6.2
 */