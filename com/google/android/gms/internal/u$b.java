package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class u$b
  implements g, Runnable
{
  private u.c kC;
  private final List<Object[]> kJ = new Vector();
  private final CountDownLatch kK = new CountDownLatch(1);
  private final AtomicReference<g> kL = new AtomicReference();

  public u$b(u.c paramc)
  {
    this.kC = paramc;
    if (et.bW())
    {
      en.execute(this);
      return;
    }
    run();
  }

  private void ao()
  {
    try
    {
      this.kK.await();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      eu.c("Interrupted during GADSignals creation.", localInterruptedException);
    }
  }

  private void ap()
  {
    if (this.kJ.isEmpty());
    while (true)
    {
      return;
      Iterator localIterator = this.kJ.iterator();
      while (localIterator.hasNext())
      {
        Object[] arrayOfObject = (Object[])localIterator.next();
        if (arrayOfObject.length == 1)
          ((Runnable)this.kL.get()).a((MotionEvent)arrayOfObject[0]);
        else if (arrayOfObject.length == 3)
          ((Runnable)this.kL.get()).a(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue());
      }
    }
  }

  public final String a(Context paramContext)
  {
    ao();
    if (this.kL.get() != null)
    {
      ap();
      return ((Runnable)this.kL.get()).a(paramContext);
    }
    return "";
  }

  public final String a(Context paramContext, String paramString)
  {
    ao();
    if (this.kL.get() != null)
    {
      ap();
      return ((Runnable)this.kL.get()).a(paramContext, paramString);
    }
    return "";
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    g localg = (Runnable)this.kL.get();
    if (localg != null)
    {
      ap();
      localg.a(paramInt1, paramInt2, paramInt3);
      return;
    }
    List localList = this.kJ;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    localList.add(arrayOfObject);
  }

  public final void a(MotionEvent paramMotionEvent)
  {
    g localg = (Runnable)this.kL.get();
    if (localg != null)
    {
      ap();
      localg.a(paramMotionEvent);
      return;
    }
    this.kJ.add(new Object[] { paramMotionEvent });
  }

  public final String b(Context paramContext)
  {
    ao();
    if (this.kL.get() != null)
    {
      ap();
      return ((Runnable)this.kL.get()).b(paramContext);
    }
    return "";
  }

  public final void run()
  {
    try
    {
      this.kL.set(j.a(this.kC.kQ.sw, this.kC.kO));
      return;
    }
    finally
    {
      this.kK.countDown();
      this.kC = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.u.b
 * JD-Core Version:    0.6.2
 */