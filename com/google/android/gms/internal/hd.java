package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

public final class hd
  implements Handler.Callback
{
  private static final Object Gv = new Object();
  private static hd Gw;
  private final HashMap<String, hd.a> Gx = new HashMap();
  private final Context lz;
  private final Handler mHandler = new Handler(paramContext.getMainLooper(), this);

  private hd(Context paramContext)
  {
    this.lz = paramContext.getApplicationContext();
  }

  public static hd E(Context paramContext)
  {
    synchronized (Gv)
    {
      if (Gw == null)
        Gw = new hd(paramContext.getApplicationContext());
      return Gw;
    }
  }

  public final boolean a(String paramString, hb<?>.f paramhb)
  {
    while (true)
    {
      hd.a locala;
      synchronized (this.Gx)
      {
        locala = (hd.a)this.Gx.get(paramString);
        if (locala == null)
        {
          locala = new hd.a(this, paramString);
          locala.a(paramhb);
          Intent localIntent1 = new Intent(paramString).setPackage("com.google.android.gms");
          locala.B(this.lz.bindService(localIntent1, locala.fx(), 129));
          this.Gx.put(paramString, locala);
          boolean bool = locala.isBound();
          return bool;
        }
        this.mHandler.removeMessages(0, locala);
        if (locala.c(paramhb))
          throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + paramString);
      }
      locala.a(paramhb);
      switch (locala.getState())
      {
      case 1:
        paramhb.onServiceConnected(locala.getComponentName(), locala.getBinder());
        break;
      case 2:
        Intent localIntent2 = new Intent(paramString).setPackage("com.google.android.gms");
        locala.B(this.lz.bindService(localIntent2, locala.fx(), 129));
      }
    }
  }

  public final void b(String paramString, hb<?>.f paramhb)
  {
    hd.a locala;
    synchronized (this.Gx)
    {
      locala = (hd.a)this.Gx.get(paramString);
      if (locala == null)
        throw new IllegalStateException("Nonexistent connection status for service action: " + paramString);
    }
    if (!locala.c(paramhb))
      throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + paramString);
    locala.b(paramhb);
    if (locala.fz())
    {
      Message localMessage = this.mHandler.obtainMessage(0, locala);
      this.mHandler.sendMessageDelayed(localMessage, 5000L);
    }
  }

  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return false;
    case 0:
    }
    hd.a locala = (hd.a)paramMessage.obj;
    synchronized (this.Gx)
    {
      if (locala.fz())
      {
        this.lz.unbindService(locala.fx());
        this.Gx.remove(locala.fy());
      }
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hd
 * JD-Core Version:    0.6.2
 */