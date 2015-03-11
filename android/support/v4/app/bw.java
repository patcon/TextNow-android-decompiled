package android.support.v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class bw
  implements ServiceConnection, Handler.Callback
{
  private final Context a;
  private final HandlerThread b;
  private final Handler c;
  private final Map<ComponentName, bx> d = new HashMap();
  private Set<String> e = new HashSet();

  public bw(Context paramContext)
  {
    this.a = paramContext;
    this.b = new HandlerThread("NotificationManagerCompat");
    this.b.start();
    this.c = new Handler(this.b.getLooper(), this);
  }

  private void a(bx parambx)
  {
    if (parambx.b)
    {
      this.a.unbindService(this);
      parambx.b = false;
    }
    parambx.c = null;
  }

  private void b(bx parambx)
  {
    if (this.c.hasMessages(3, parambx.a))
      return;
    parambx.e = (1 + parambx.e);
    if (parambx.e > 6)
    {
      new StringBuilder().append("Giving up on delivering ").append(parambx.d.size()).append(" tasks to ").append(parambx.a).append(" after ").append(parambx.e).append(" retries").toString();
      parambx.d.clear();
      return;
    }
    int i = 1000 * (1 << -1 + parambx.e);
    if (Log.isLoggable("NotifManCompat", 3))
      new StringBuilder().append("Scheduling retry for ").append(i).append(" ms").toString();
    Message localMessage = this.c.obtainMessage(3, parambx.a);
    this.c.sendMessageDelayed(localMessage, i);
  }

  private void c(bx parambx)
  {
    if (Log.isLoggable("NotifManCompat", 3))
      new StringBuilder().append("Processing component ").append(parambx.a).append(", ").append(parambx.d.size()).append(" queued tasks").toString();
    if (parambx.d.isEmpty());
    while (true)
    {
      return;
      boolean bool;
      if (parambx.b)
      {
        bool = true;
        if ((!bool) || (parambx.c == null))
          b(parambx);
      }
      else
      {
        Intent localIntent = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(parambx.a);
        parambx.b = this.a.bindService(localIntent, this, bo.b());
        if (parambx.b)
          parambx.e = 0;
        while (true)
        {
          bool = parambx.b;
          break;
          new StringBuilder().append("Unable to bind to listener ").append(parambx.a).toString();
          this.a.unbindService(this);
        }
      }
      by localby = (by)parambx.d.peek();
      if (localby != null);
      try
      {
        if (Log.isLoggable("NotifManCompat", 3))
          new StringBuilder().append("Sending task ").append(localby).toString();
        localby.a(parambx.c);
        parambx.d.remove();
      }
      catch (DeadObjectException localDeadObjectException)
      {
        if (Log.isLoggable("NotifManCompat", 3))
          new StringBuilder().append("Remote service has died: ").append(parambx.a).toString();
        if (parambx.d.isEmpty())
          continue;
        b(parambx);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          new StringBuilder().append("RemoteException communicating with ").append(parambx.a).toString();
      }
    }
  }

  public final void a(by paramby)
  {
    this.c.obtainMessage(0, paramby).sendToTarget();
  }

  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return false;
    case 0:
      by localby = (by)paramMessage.obj;
      Set localSet = bo.b(this.a);
      if (!localSet.equals(this.e))
      {
        this.e = localSet;
        List localList = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 4);
        HashSet localHashSet = new HashSet();
        Iterator localIterator2 = localList.iterator();
        while (localIterator2.hasNext())
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localIterator2.next();
          if (localSet.contains(localResolveInfo.serviceInfo.packageName))
          {
            ComponentName localComponentName5 = new ComponentName(localResolveInfo.serviceInfo.packageName, localResolveInfo.serviceInfo.name);
            if (localResolveInfo.serviceInfo.permission != null)
              new StringBuilder().append("Permission present on component ").append(localComponentName5).append(", not adding listener record.").toString();
            else
              localHashSet.add(localComponentName5);
          }
        }
        Iterator localIterator3 = localHashSet.iterator();
        while (localIterator3.hasNext())
        {
          ComponentName localComponentName4 = (ComponentName)localIterator3.next();
          if (!this.d.containsKey(localComponentName4))
          {
            if (Log.isLoggable("NotifManCompat", 3))
              new StringBuilder().append("Adding listener record for ").append(localComponentName4).toString();
            this.d.put(localComponentName4, new bx(localComponentName4));
          }
        }
        Iterator localIterator4 = this.d.entrySet().iterator();
        while (localIterator4.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator4.next();
          if (!localHashSet.contains(localEntry.getKey()))
          {
            if (Log.isLoggable("NotifManCompat", 3))
              new StringBuilder().append("Removing listener record for ").append(localEntry.getKey()).toString();
            a((bx)localEntry.getValue());
            localIterator4.remove();
          }
        }
      }
      Iterator localIterator1 = this.d.values().iterator();
      while (localIterator1.hasNext())
      {
        bx localbx4 = (bx)localIterator1.next();
        localbx4.d.add(localby);
        c(localbx4);
      }
      return true;
    case 1:
      bv localbv = (bv)paramMessage.obj;
      ComponentName localComponentName3 = localbv.a;
      IBinder localIBinder = localbv.b;
      bx localbx3 = (bx)this.d.get(localComponentName3);
      if (localbx3 != null)
      {
        localbx3.c = x.a(localIBinder);
        localbx3.e = 0;
        c(localbx3);
      }
      return true;
    case 2:
      ComponentName localComponentName2 = (ComponentName)paramMessage.obj;
      bx localbx2 = (bx)this.d.get(localComponentName2);
      if (localbx2 != null)
        a(localbx2);
      return true;
    case 3:
    }
    ComponentName localComponentName1 = (ComponentName)paramMessage.obj;
    bx localbx1 = (bx)this.d.get(localComponentName1);
    if (localbx1 != null)
      c(localbx1);
    return true;
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (Log.isLoggable("NotifManCompat", 3))
      new StringBuilder().append("Connected to service ").append(paramComponentName).toString();
    this.c.obtainMessage(1, new bv(paramComponentName, paramIBinder)).sendToTarget();
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (Log.isLoggable("NotifManCompat", 3))
      new StringBuilder().append("Disconnected from service ").append(paramComponentName).toString();
    this.c.obtainMessage(2, paramComponentName).sendToTarget();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bw
 * JD-Core Version:    0.6.2
 */