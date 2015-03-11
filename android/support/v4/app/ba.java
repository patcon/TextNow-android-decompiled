package android.support.v4.app;

import android.app.Notification;

class ba
  implements ax
{
  public Notification a(av paramav)
  {
    Notification localNotification = paramav.B;
    localNotification.setLatestEventInfo(paramav.a, paramav.b, paramav.c, paramav.d);
    if (paramav.j > 0)
      localNotification.flags = (0x80 | localNotification.flags);
    return localNotification;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ba
 * JD-Core Version:    0.6.2
 */