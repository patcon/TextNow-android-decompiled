package cz.acrobits.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.SystemClock;

final class Alarm$KeepAlive
{
  private static final String ACTION = "KeepAlive";
  private static final int REQUEST_ID = 1097623926;
  public static PendingIntent sIntent;
  public static boolean sScheduled = false;

  public static void cancel()
  {
    if (!sScheduled)
      return;
    Alarm.access$0().cancel(sIntent);
    sScheduled = false;
  }

  private static native int getPeriod();

  private static native void handleAlarm();

  public static void onAlarm()
  {
    if (!sScheduled)
    {
      if (sIntent == null)
        Alarm.access$1();
      Alarm.access$0().cancel(sIntent);
      return;
    }
    handleAlarm();
  }

  public static void schedule()
  {
    if (sScheduled);
    long l;
    do
    {
      return;
      l = 1000L * getPeriod();
    }
    while (l == 0L);
    Alarm.access$0().setRepeating(2, l + SystemClock.elapsedRealtime(), l, sIntent);
    sScheduled = true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.internal.Alarm.KeepAlive
 * JD-Core Version:    0.6.2
 */