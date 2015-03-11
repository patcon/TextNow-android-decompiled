package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.o;

final class c$a extends Handler
{
  public c$a(c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = 1;
    if (paramMessage.what == i);
    while (true)
    {
      o.K(i);
      this.Jt.b((c.b)paramMessage.obj);
      return;
      int j = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c.a
 * JD-Core Version:    0.6.2
 */