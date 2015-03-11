package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

final class bb extends ba
{
  public final Notification a(av paramav)
  {
    Notification localNotification = paramav.B;
    localNotification.setLatestEventInfo(paramav.a, paramav.b, paramav.c, paramav.d);
    Context localContext = paramav.a;
    CharSequence localCharSequence1 = paramav.b;
    CharSequence localCharSequence2 = paramav.c;
    PendingIntent localPendingIntent1 = paramav.d;
    PendingIntent localPendingIntent2 = paramav.e;
    localNotification.setLatestEventInfo(localContext, localCharSequence1, localCharSequence2, localPendingIntent1);
    localNotification.fullScreenIntent = localPendingIntent2;
    if (paramav.j > 0)
      localNotification.flags = (0x80 | localNotification.flags);
    return localNotification;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bb
 * JD-Core Version:    0.6.2
 */