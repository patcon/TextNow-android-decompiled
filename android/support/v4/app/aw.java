package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

final class aw extends av
{
  public final Notification a(ap paramap)
  {
    Notification localNotification = paramap.B;
    localNotification.setLatestEventInfo(paramap.a, paramap.b, paramap.c, paramap.d);
    Context localContext = paramap.a;
    CharSequence localCharSequence1 = paramap.b;
    CharSequence localCharSequence2 = paramap.c;
    PendingIntent localPendingIntent1 = paramap.d;
    PendingIntent localPendingIntent2 = paramap.e;
    localNotification.setLatestEventInfo(localContext, localCharSequence1, localCharSequence2, localPendingIntent1);
    localNotification.fullScreenIntent = localPendingIntent2;
    if (paramap.j > 0)
      localNotification.flags = (0x80 | localNotification.flags);
    return localNotification;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.aw
 * JD-Core Version:    0.6.2
 */