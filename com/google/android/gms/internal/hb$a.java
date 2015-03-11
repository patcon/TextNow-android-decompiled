package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class hb$a extends Handler
{
  public hb$a(hb paramhb, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what == 1) && (!this.Gi.isConnecting()))
    {
      hb.b localb2 = (hb.b)paramMessage.obj;
      localb2.fu();
      localb2.unregister();
      return;
    }
    if (paramMessage.what == 3)
    {
      hb.a(this.Gi).a(new ConnectionResult(((Integer)paramMessage.obj).intValue(), null));
      return;
    }
    if (paramMessage.what == 4)
    {
      hb.a(this.Gi, 1);
      hb.a(this.Gi, null);
      hb.a(this.Gi).ao(((Integer)paramMessage.obj).intValue());
      return;
    }
    if ((paramMessage.what == 2) && (!this.Gi.isConnected()))
    {
      hb.b localb1 = (hb.b)paramMessage.obj;
      localb1.fu();
      localb1.unregister();
      return;
    }
    if ((paramMessage.what == 2) || (paramMessage.what == 1))
    {
      ((hb.b)paramMessage.obj).fv();
      return;
    }
    Log.wtf("GmsClient", "Don't know how to handle this message.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hb.a
 * JD-Core Version:    0.6.2
 */