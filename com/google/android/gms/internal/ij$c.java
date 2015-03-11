package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast.Listener;
import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

class ij$c extends io.a
{
  private AtomicBoolean GR = new AtomicBoolean(false);

  private ij$c(ij paramij)
  {
  }

  private boolean ag(int paramInt)
  {
    synchronized (ij.fJ())
    {
      if (ij.j(this.GQ) != null)
      {
        ij.j(this.GQ).b(new Status(paramInt));
        ij.b(this.GQ, null);
        return true;
      }
      return false;
    }
  }

  private void c(long paramLong, int paramInt)
  {
    synchronized (ij.i(this.GQ))
    {
      BaseImplementation.b localb = (BaseImplementation.b)ij.i(this.GQ).remove(Long.valueOf(paramLong));
      if (localb != null)
        localb.b(new Status(paramInt));
      return;
    }
  }

  public void a(ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.GR.get())
      return;
    ij.a(this.GQ, paramApplicationMetadata);
    ij.a(this.GQ, paramApplicationMetadata.getApplicationId());
    ij.b(this.GQ, paramString2);
    synchronized (ij.fI())
    {
      if (ij.d(this.GQ) != null)
      {
        ij.d(this.GQ).b(new ij.a(new Status(0), paramApplicationMetadata, paramString1, paramString2, paramBoolean));
        ij.a(this.GQ, null);
      }
      return;
    }
  }

  public void a(String paramString, double paramDouble, boolean paramBoolean)
  {
    ij.fH().b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
  }

  public void a(String paramString, long paramLong)
  {
    if (this.GR.get())
      return;
    c(paramLong, 0);
  }

  public void a(String paramString, long paramLong, int paramInt)
  {
    if (this.GR.get())
      return;
    c(paramLong, paramInt);
  }

  public void ac(int paramInt)
  {
    if (!fK());
    do
    {
      return;
      ip localip = ij.fH();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      localip.b("ICastDeviceControllerListener.onDisconnected: %d", arrayOfObject);
    }
    while (paramInt == 0);
    this.GQ.aA(2);
  }

  public void ad(int paramInt)
  {
    if (this.GR.get())
      return;
    synchronized (ij.fI())
    {
      if (ij.d(this.GQ) != null)
      {
        ij.d(this.GQ).b(new ij.a(new Status(paramInt)));
        ij.a(this.GQ, null);
      }
      return;
    }
  }

  public void ae(int paramInt)
  {
    if (this.GR.get())
      return;
    ag(paramInt);
  }

  public void af(int paramInt)
  {
    if (this.GR.get())
      return;
    ag(paramInt);
  }

  public void b(final ig paramig)
  {
    if (this.GR.get())
      return;
    ij.fH().b("onApplicationStatusChanged", new Object[0]);
    ij.f(this.GQ).post(new Runnable()
    {
      public void run()
      {
        ij.a(ij.c.this.GQ, paramig);
      }
    });
  }

  public void b(final il paramil)
  {
    if (this.GR.get())
      return;
    ij.fH().b("onDeviceStatusChanged", new Object[0]);
    ij.f(this.GQ).post(new Runnable()
    {
      public void run()
      {
        ij.a(ij.c.this.GQ, paramil);
      }
    });
  }

  public void b(String paramString, byte[] paramArrayOfByte)
  {
    if (this.GR.get())
      return;
    ip localip = ij.fH();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(paramArrayOfByte.length);
    localip.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", arrayOfObject);
  }

  public boolean fK()
  {
    if (this.GR.getAndSet(true))
      return false;
    ij.c(this.GQ);
    return true;
  }

  public boolean fL()
  {
    return this.GR.get();
  }

  public void k(final String paramString1, final String paramString2)
  {
    if (this.GR.get())
      return;
    ij.fH().b("Receive (type=text, ns=%s) %s", new Object[] { paramString1, paramString2 });
    ij.f(this.GQ).post(new Runnable()
    {
      public void run()
      {
        synchronized (ij.g(ij.c.this.GQ))
        {
          Cast.MessageReceivedCallback localMessageReceivedCallback = (Cast.MessageReceivedCallback)ij.g(ij.c.this.GQ).get(paramString1);
          if (localMessageReceivedCallback != null)
          {
            localMessageReceivedCallback.onMessageReceived(ij.h(ij.c.this.GQ), paramString1, paramString2);
            return;
          }
        }
        ip localip = ij.fH();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = paramString1;
        localip.b("Discarded message for unknown namespace '%s'", arrayOfObject);
      }
    });
  }

  public void onApplicationDisconnected(final int paramInt)
  {
    if (this.GR.get());
    do
    {
      return;
      ij.a(this.GQ, null);
      ij.b(this.GQ, null);
      ag(paramInt);
    }
    while (ij.e(this.GQ) == null);
    ij.f(this.GQ).post(new Runnable()
    {
      public void run()
      {
        if (ij.e(ij.c.this.GQ) != null)
          ij.e(ij.c.this.GQ).onApplicationDisconnected(paramInt);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ij.c
 * JD-Core Version:    0.6.2
 */