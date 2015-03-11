package cz.acrobits.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cz.acrobits.ali.AndroidUtil;

public final class Alarm extends BroadcastReceiver
{
  private static AlarmManager sAlarmManager;

  public static void cancel()
  {
    if (sAlarmManager == null)
      return;
    Alarm.KeepAlive.cancel();
    Alarm.Reregistration.cancel();
  }

  private static void create()
  {
    Context localContext = AndroidUtil.getApplicationContext();
    sAlarmManager = (AlarmManager)localContext.getSystemService("alarm");
    Alarm.KeepAlive.sIntent = PendingIntent.getBroadcast(localContext, 1097623926, new Intent("KeepAlive", null, localContext, Alarm.class), 0);
    Alarm.Reregistration.sIntent = PendingIntent.getBroadcast(localContext, 1383228775, new Intent("Reregistration", null, localContext, Alarm.class), 0);
  }

  public static void schedule()
  {
    if (sAlarmManager == null)
      create();
    Alarm.KeepAlive.schedule();
    Alarm.Reregistration.schedule();
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    if ("KeepAlive".equals(str))
      Alarm.KeepAlive.onAlarm();
    while (!"Reregistration".equals(str))
      return;
    Alarm.Reregistration.onAlarm();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.internal.Alarm
 * JD-Core Version:    0.6.2
 */