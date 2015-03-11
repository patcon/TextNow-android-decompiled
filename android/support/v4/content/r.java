package android.support.v4.content;

import android.os.Handler;
import android.os.Message;

final class r extends Handler
{
  public final void handleMessage(Message paramMessage)
  {
    q localq = (q)paramMessage.obj;
    switch (paramMessage.what)
    {
    default:
      return;
    case 1:
      p.c(localq.a, localq.b[0]);
      return;
    case 2:
    }
    p.b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.content.r
 * JD-Core Version:    0.6.2
 */