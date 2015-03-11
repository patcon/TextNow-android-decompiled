package com.google.android.gms.common.api;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.o;

public final class c<L>
{
  private final c<L>.a Js;
  private volatile L mListener;

  c(Looper paramLooper, L paramL)
  {
    this.Js = new c.a(this, paramLooper);
    this.mListener = o.b(paramL, "Listener must not be null");
  }

  public final void a(c.b<L> paramb)
  {
    o.b(paramb, "Notifier must not be null");
    Message localMessage = this.Js.obtainMessage(1, paramb);
    this.Js.sendMessage(localMessage);
  }

  final void b(c.b<L> paramb)
  {
    Object localObject = this.mListener;
    if (localObject == null)
    {
      paramb.gr();
      return;
    }
    try
    {
      paramb.d(localObject);
      return;
    }
    catch (Exception localException)
    {
      paramb.gr();
    }
  }

  public final void clear()
  {
    this.mListener = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c
 * JD-Core Version:    0.6.2
 */