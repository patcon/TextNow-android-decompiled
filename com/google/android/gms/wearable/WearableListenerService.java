package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;

public abstract class WearableListenerService extends Service
  implements DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener
{
  public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
  private String BZ;
  private IBinder LZ;
  private volatile int NX = -1;
  private Handler avc;
  private Object avd = new Object();
  private boolean ave;

  private boolean bc(int paramInt)
  {
    String[] arrayOfString = getPackageManager().getPackagesForUid(paramInt);
    boolean bool = false;
    if (arrayOfString != null);
    for (int i = 0; ; i++)
    {
      int j = arrayOfString.length;
      bool = false;
      if (i < j)
      {
        if ("com.google.android.gms".equals(arrayOfString[i]))
          bool = true;
      }
      else
        return bool;
    }
  }

  private void pU()
  {
    int i = Binder.getCallingUid();
    if (i == this.NX)
      return;
    if ((GooglePlayServicesUtil.b(getPackageManager(), "com.google.android.gms")) && (bc(i)))
    {
      this.NX = i;
      return;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }

  public final IBinder onBind(Intent paramIntent)
  {
    if ("com.google.android.gms.wearable.BIND_LISTENER".equals(paramIntent.getAction()))
      return this.LZ;
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    if (Log.isLoggable("WearableLS", 3))
      new StringBuilder().append("onCreate: ").append(getPackageName()).toString();
    this.BZ = getPackageName();
    HandlerThread localHandlerThread = new HandlerThread("WearableListenerService");
    localHandlerThread.start();
    this.avc = new Handler(localHandlerThread.getLooper());
    this.LZ = new WearableListenerService.a(this, null);
  }

  public void onDataChanged(DataEventBuffer paramDataEventBuffer)
  {
  }

  public void onDestroy()
  {
    synchronized (this.avd)
    {
      this.ave = true;
      this.avc.getLooper().quit();
      super.onDestroy();
      return;
    }
  }

  public void onMessageReceived(MessageEvent paramMessageEvent)
  {
  }

  public void onPeerConnected(Node paramNode)
  {
  }

  public void onPeerDisconnected(Node paramNode)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.WearableListenerService
 * JD-Core Version:    0.6.2
 */