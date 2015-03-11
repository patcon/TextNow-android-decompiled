package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

public final class g
  implements Handler.Callback
{
  private static final Object LS = new Object();
  private static g LT;
  private final HashMap<String, g.a> LU = new HashMap();
  private final Context mD;
  private final Handler mHandler = new Handler(paramContext.getMainLooper(), this);

  private g(Context paramContext)
  {
    this.mD = paramContext.getApplicationContext();
  }

  public static g J(Context paramContext)
  {
    synchronized (LS)
    {
      if (LT == null)
        LT = new g(paramContext.getApplicationContext());
      return LT;
    }
  }

  public final boolean a(String paramString, e<?>.f parame)
  {
    while (true)
    {
      g.a locala;
      synchronized (this.LU)
      {
        locala = (g.a)this.LU.get(paramString);
        if (locala == null)
        {
          locala = new g.a(this, paramString);
          locala.a(parame);
          Intent localIntent1 = new Intent(paramString).setPackage("com.google.android.gms");
          locala.J(this.mD.bindService(localIntent1, locala.gW(), 129));
          this.LU.put(paramString, locala);
          boolean bool = locala.isBound();
          return bool;
        }
        this.mHandler.removeMessages(0, locala);
        if (locala.c(parame))
          throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + paramString);
      }
      locala.a(parame);
      switch (locala.getState())
      {
      case 1:
        parame.onServiceConnected(locala.getComponentName(), locala.getBinder());
        break;
      case 2:
        Intent localIntent2 = new Intent(paramString).setPackage("com.google.android.gms");
        locala.J(this.mD.bindService(localIntent2, locala.gW(), 129));
      }
    }
  }

  public final void b(String paramString, e<?>.f parame)
  {
    g.a locala;
    synchronized (this.LU)
    {
      locala = (g.a)this.LU.get(paramString);
      if (locala == null)
        throw new IllegalStateException("Nonexistent connection status for service action: " + paramString);
    }
    if (!locala.c(parame))
      throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + paramString);
    locala.b(parame);
    if (locala.gY())
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
    g.a locala = (g.a)paramMessage.obj;
    synchronized (this.LU)
    {
      if (locala.gY())
      {
        this.mD.unbindService(locala.gW());
        this.LU.remove(locala.gX());
      }
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.g
 * JD-Core Version:    0.6.2
 */