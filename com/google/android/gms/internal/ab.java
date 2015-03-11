package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class ab
  implements ad
{
  private final Object ls = new Object();
  private WeakHashMap<ef, ac> lt = new WeakHashMap();
  private ArrayList<ac> lu = new ArrayList();

  public final ac a(al paramal, ef paramef)
  {
    synchronized (this.ls)
    {
      if (c(paramef))
      {
        ac localac2 = (ac)this.lt.get(paramef);
        return localac2;
      }
      ac localac1 = new ac(paramal, paramef);
      localac1.a(this);
      this.lt.put(paramef, localac1);
      this.lu.add(localac1);
      return localac1;
    }
  }

  public final void a(ac paramac)
  {
    synchronized (this.ls)
    {
      if (!paramac.az())
        this.lu.remove(paramac);
      return;
    }
  }

  public final boolean c(ef paramef)
  {
    synchronized (this.ls)
    {
      ac localac = (ac)this.lt.get(paramef);
      if ((localac != null) && (localac.az()))
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  public final void d(ef paramef)
  {
    synchronized (this.ls)
    {
      ac localac = (ac)this.lt.get(paramef);
      if (localac != null)
        localac.ax();
      return;
    }
  }

  public final void pause()
  {
    synchronized (this.ls)
    {
      Iterator localIterator = this.lu.iterator();
      if (localIterator.hasNext())
        ((ac)localIterator.next()).pause();
    }
  }

  public final void resume()
  {
    synchronized (this.ls)
    {
      Iterator localIterator = this.lu.iterator();
      if (localIterator.hasNext())
        ((ac)localIterator.next()).resume();
    }
  }

  public final void stop()
  {
    synchronized (this.ls)
    {
      Iterator localIterator = this.lu.iterator();
      if (localIterator.hasNext())
        ((ac)localIterator.next()).stop();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ab
 * JD-Core Version:    0.6.2
 */