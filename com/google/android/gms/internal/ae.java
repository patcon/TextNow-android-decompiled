package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

@ez
public final class ae
  implements ag
{
  private final Object mw = new Object();
  private final WeakHashMap<fz, af> mx = new WeakHashMap();
  private final ArrayList<af> my = new ArrayList();

  public final af a(Context paramContext, ay paramay, fz paramfz, View paramView, gt paramgt)
  {
    synchronized (this.mw)
    {
      if (c(paramfz))
      {
        af localaf2 = (af)this.mx.get(paramfz);
        return localaf2;
      }
      af localaf1 = new af(paramContext, paramay, paramfz, paramView, paramgt);
      localaf1.a(this);
      this.mx.put(paramfz, localaf1);
      this.my.add(localaf1);
      return localaf1;
    }
  }

  public final af a(ay paramay, fz paramfz)
  {
    return a(paramfz.rN.getContext(), paramay, paramfz, paramfz.rN, paramfz.rN.dx());
  }

  public final void a(af paramaf)
  {
    synchronized (this.mw)
    {
      if (!paramaf.aH())
        this.my.remove(paramaf);
      return;
    }
  }

  public final boolean c(fz paramfz)
  {
    synchronized (this.mw)
    {
      af localaf = (af)this.mx.get(paramfz);
      if ((localaf != null) && (localaf.aH()))
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  public final void d(fz paramfz)
  {
    synchronized (this.mw)
    {
      af localaf = (af)this.mx.get(paramfz);
      if (localaf != null)
        localaf.aF();
      return;
    }
  }

  public final void pause()
  {
    synchronized (this.mw)
    {
      Iterator localIterator = this.my.iterator();
      if (localIterator.hasNext())
        ((af)localIterator.next()).pause();
    }
  }

  public final void resume()
  {
    synchronized (this.mw)
    {
      Iterator localIterator = this.my.iterator();
      if (localIterator.hasNext())
        ((af)localIterator.next()).resume();
    }
  }

  public final void stop()
  {
    synchronized (this.mw)
    {
      Iterator localIterator = this.my.iterator();
      if (localIterator.hasNext())
        ((af)localIterator.next()).stop();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ae
 * JD-Core Version:    0.6.2
 */