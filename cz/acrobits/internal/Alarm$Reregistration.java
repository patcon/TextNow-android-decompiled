package cz.acrobits.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.SystemClock;

final class Alarm$Reregistration
{
  private static final String ACTION = "Reregistration";
  private static final int REQUEST_ID = 1383228775;
  public static PendingIntent sIntent;
  public static boolean sScheduled = false;

  public static void cancel()
  {
    if (!sScheduled)
      return;
    Alarm.access$0().cancel(sIntent);
    sScheduled = false;
  }

  private static native int getDelay();

  private static native void handleAlarm();

  public static void onAlarm()
  {
    if (!sScheduled)
      return;
    sScheduled = false;
    handleAlarm();
  }

  public static void schedule()
  {
    if (sScheduled);
    long l;
    do
    {
      return;
      l = 1000L * getDelay();
    }
    while (l == 0L);
    Alarm.access$0().set(2, l + SystemClock.elapsedRealtime(), sIntent);
    sScheduled = true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.internal.Alarm.Reregistration
 * JD-Core Version:    0.6.2
 */