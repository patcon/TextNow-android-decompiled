package com.enflick.android.TextNow;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import com.appsflyer.AppsFlyerLib;
import com.enflick.android.TextNow.activities.phone.h;
import com.enflick.android.TextNow.activities.phone.n;
import com.enflick.android.TextNow.chatheads.g;
import com.enflick.android.TextNow.pullservice.PullAlarmReceiver;
import com.google.android.gcm.a;
import textnow.v.o;
import textnow.z.r;
import textnow.z.u;

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
    g localg;
    if (g.f())
    {
      localg = g.a(a);
      if (d)
        localg.k();
    }
    else
    {
      return;
    }
    localg.a();
  }

  public static void b()
  {
    g.g();
    a.a(a);
    u localu = new u(a);
    localu.l(null);
    localu.c(false);
    localu.B();
    TextNowApp localTextNowApp = a;
    b.cancel(localTextNowApp.c);
    h.g();
  }

  public static boolean c()
  {
    return d;
  }

  public final void d()
  {
    long l = new u(this).L();
    new StringBuilder().append("Schedule next auto pull service in ").append(l / 1000L).append(" seconds").toString();
    b.setRepeating(2, l + SystemClock.elapsedRealtime(), l, this.c);
  }

  public void onCreate()
  {
    super.onCreate();
    r.a(this);
    try
    {
      h.a();
      label12: b = (AlarmManager)getSystemService("alarm");
      this.c = PendingIntent.getBroadcast(this, 0, new Intent(this, PullAlarmReceiver.class), 0);
      AppsFlyerLib.setAppsFlyerKey("yYxAmNc5Sjr84FZ2HVGX7K");
      return;
    }
    catch (n localn)
    {
      break label12;
    }
  }

  public void onLowMemory()
  {
    o.g();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.TextNowApp
 * JD-Core Version:    0.6.2
 */