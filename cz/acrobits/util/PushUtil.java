package cz.acrobits.util;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public class PushUtil
{
  public static final String TAG = "PushUtil";

  public static void showMessage(Context paramContext, Class<? extends Activity> paramClass, int paramInt, String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString2))
      return;
    long l = System.currentTimeMillis();
    NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
    Notification localNotification = new Notification(paramInt, paramString2, l);
    Intent localIntent = new Intent(paramContext, paramClass);
    localIntent.setFlags(603979776);
    localNotification.setLatestEventInfo(paramContext, paramString1, paramString2, PendingIntent.getActivity(paramContext, 0, localIntent, 0));
    localNotification.flags = (0x10 | localNotification.flags);
    localNotificationManager.notify("PushUtil", 0, localNotification);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.util.PushUtil
 * JD-Core Version:    0.6.2
 */