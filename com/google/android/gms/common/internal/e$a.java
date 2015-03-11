package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class e$a extends Handler
{
  public e$a(e parame, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what == 1) && (!this.LF.isConnecting()))
    {
      e.b localb2 = (e.b)paramMessage.obj;
      localb2.gT();
      localb2.unregister();
      return;
    }
    if (paramMessage.what == 3)
    {
      e.a(this.LF).b(new ConnectionResult(((Integer)paramMessage.obj).intValue(), null));
      return;
    }
    if (paramMessage.what == 4)
    {
      e.a(this.LF, 1);
      e.a(this.LF, null);
      e.a(this.LF).aB(((Integer)paramMessage.obj).intValue());
      return;
    }
    if ((paramMessage.what == 2) && (!this.LF.isConnected()))
    {
      e.b localb1 = (e.b)paramMessage.obj;
      localb1.gT();
      localb1.unregister();
      return;
    }
    if ((paramMessage.what == 2) || (paramMessage.what == 1))
    {
      ((e.b)paramMessage.obj).gU();
      return;
    }
    Log.wtf("GmsClient", "Don't know how to handle this message.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.e.a
 * JD-Core Version:    0.6.2
 */