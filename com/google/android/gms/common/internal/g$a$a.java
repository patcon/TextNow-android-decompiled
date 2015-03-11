package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

public class g$a$a
  implements ServiceConnection
{
  public g$a$a(g.a parama)
  {
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (g.a(this.Mc.Mb))
    {
      g.a.a(this.Mc, paramIBinder);
      g.a.a(this.Mc, paramComponentName);
      Iterator localIterator = g.a.a(this.Mc).iterator();
      if (localIterator.hasNext())
        ((e.f)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
    }
    g.a.a(this.Mc, 1);
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (g.a(this.Mc.Mb))
    {
      g.a.a(this.Mc, null);
      g.a.a(this.Mc, paramComponentName);
      Iterator localIterator = g.a.a(this.Mc).iterator();
      if (localIterator.hasNext())
        ((e.f)localIterator.next()).onServiceDisconnected(paramComponentName);
    }
    g.a.a(this.Mc, 2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.g.a.a
 * JD-Core Version:    0.6.2
 */