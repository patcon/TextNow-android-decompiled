package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

public class hd$a$a
  implements ServiceConnection
{
  public hd$a$a(hd.a parama)
  {
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (hd.a(this.GF.GE))
    {
      hd.a.a(this.GF, paramIBinder);
      hd.a.a(this.GF, paramComponentName);
      Iterator localIterator = hd.a.a(this.GF).iterator();
      if (localIterator.hasNext())
        ((hb.f)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
    }
    hd.a.a(this.GF, 1);
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (hd.a(this.GF.GE))
    {
      hd.a.a(this.GF, null);
      hd.a.a(this.GF, paramComponentName);
      Iterator localIterator = hd.a.a(this.GF).iterator();
      if (localIterator.hasNext())
        ((hb.f)localIterator.next()).onServiceDisconnected(paramComponentName);
    }
    hd.a.a(this.GF, 2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hd.a.a
 * JD-Core Version:    0.6.2
 */