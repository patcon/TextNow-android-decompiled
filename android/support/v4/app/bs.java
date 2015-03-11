package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;

class bs extends br
{
  public final void a(NotificationManager paramNotificationManager, String paramString, int paramInt)
  {
    paramNotificationManager.cancel(paramString, paramInt);
  }

  public final void a(NotificationManager paramNotificationManager, String paramString, int paramInt, Notification paramNotification)
  {
    paramNotificationManager.notify(paramString, paramInt, paramNotification);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bs
 * JD-Core Version:    0.6.2
 */