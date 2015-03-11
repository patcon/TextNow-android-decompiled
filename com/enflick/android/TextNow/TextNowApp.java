package com.enflick.android.TextNow;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import com.enflick.android.TextNow.activities.phone.d;
import com.enflick.android.TextNow.activities.phone.j;
import com.enflick.android.TextNow.pullservice.PullAlarmReceiver;
import com.vessel.VesselSDK;
import textnow.q.q;
import textnow.u.p;
import textnow.u.r;

public class TextNowApp extends Application
{
  private static TextNowApp a;
  private static AlarmManager b;
  private static volatile boolean d;
  private PendingIntent c;

  public TextNowApp()
  {
    a = this;
  }

  public static TextNowApp a()
  {
    return a;
  }

  public static void a(boolean paramBoolean)
  {
    d = paramBoolean;
  }

  public static void b()
  {
    com.google.android.gcm.a.a(a);
    r localr = new r(a);
    localr.l(null);
    localr.c(false);
    localr.n();
    TextNowApp localTextNowApp = a;
    b.cancel(localTextNowApp.c);
    d.g();
  }

  public static boolean c()
  {
    return d;
  }

  public final void d()
  {
    long l = new r(this).J();
    new StringBuilder().append("Schedule next auto pull service in ").append(l / 1000L).append(" seconds").toString();
    b.setRepeating(2, l + SystemClock.elapsedRealtime(), l, this.c);
  }

  public void onCreate()
  {
    super.onCreate();
    p.a(this);
    try
    {
      d.a();
      b = (AlarmManager)getSystemService("alarm");
      this.c = PendingIntent.getBroadcast(this, 0, new Intent(this, PullAlarmReceiver.class), 0);
      textnow.x.a.a(getApplicationContext());
    }
    catch (j localj)
    {
      try
      {
        VesselSDK.initialize(getApplicationContext(), "cmZEb2hCdDNhblh1bVJHOTRMVWs1SFBD");
        return;
        localj = localj;
      }
      catch (Throwable localThrowable)
      {
      }
    }
  }

  public void onLowMemory()
  {
    q.g();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.TextNowApp
 * JD-Core Version:    0.6.2
 */