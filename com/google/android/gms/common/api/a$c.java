package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;

public class a$c<R extends Result> extends Handler
{
  public a$c()
  {
    this(Looper.getMainLooper());
  }

  public a$c(Looper paramLooper)
  {
    super(paramLooper);
  }

  public void a(ResultCallback<R> paramResultCallback, R paramR)
  {
    sendMessage(obtainMessage(1, new Pair(paramResultCallback, paramR)));
  }

  public void a(a.a<R> parama, long paramLong)
  {
    sendMessageDelayed(obtainMessage(2, parama), paramLong);
  }

  protected void b(ResultCallback<R> paramResultCallback, R paramR)
  {
    try
    {
      paramResultCallback.onResult(paramR);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      a.a(paramR);
      throw localRuntimeException;
    }
  }

  public void eH()
  {
    removeMessages(2);
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      Log.wtf("GoogleApi", "Don't know how to handle this message.");
      return;
    case 1:
      Pair localPair = (Pair)paramMessage.obj;
      b((ResultCallback)localPair.first, (Result)localPair.second);
      return;
    case 2:
    }
    a.a.a((a.a)paramMessage.obj);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.a.c
 * JD-Core Version:    0.6.2
 */