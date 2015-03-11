package textnow.az;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.webkit.URLUtil;
import com.tremorvideo.sdk.android.videoad.ba;
import com.tremorvideo.sdk.android.videoad.bc;
import com.tremorvideo.sdk.android.videoad.cv;
import com.tremorvideo.sdk.android.videoad.dx;
import com.tremorvideo.sdk.android.videoad.i;
import com.tremorvideo.sdk.android.videoad.j;
import com.tremorvideo.sdk.android.videoad.r;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;

public final class a extends i
{
  cv a;
  Timer b;
  private e e;
  private boolean f;
  private boolean g = false;
  private boolean h = false;
  private long i = -1L;
  private long j = -1L;

  public a(j paramj, Activity paramActivity, dx paramdx)
  {
    super(paramj, paramActivity);
    this.e = paramdx.y();
    this.f = false;
    this.a = paramdx.q();
  }

  private void e()
  {
    try
    {
      if (!this.f)
      {
        this.f = true;
        ba localba = this.e.a(bc.V);
        if (localba != null)
          this.d.a(localba);
        this.d.a(this);
      }
      return;
    }
    finally
    {
    }
  }

  private void f()
  {
    try
    {
      if (!this.f)
      {
        this.f = true;
        ba localba = this.e.a(bc.W);
        if (localba != null)
          this.d.a(localba);
        this.d.a(this);
      }
      return;
    }
    finally
    {
    }
  }

  private void g()
  {
    try
    {
      if (!this.f)
      {
        this.f = true;
        ba localba = this.e.a(bc.V);
        if (localba != null)
          this.d.a(localba);
        this.d.a(this);
      }
      return;
    }
    finally
    {
    }
  }

  public final void a()
  {
    if (!this.g)
      this.g = true;
    try
    {
      this.d.a(this.e.a(bc.T));
      if (this.e.a() > 0)
      {
        this.i = GregorianCalendar.getInstance().getTimeInMillis();
        this.j = 0L;
        this.b = new Timer();
        this.b.schedule(new b(this), this.e.a());
      }
      return;
    }
    catch (Exception localException)
    {
      r.a(localException);
      this.d.a(this);
    }
  }

  public final void a(Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("event_type");
    ba localba1 = this.e.a(str1);
    if (localba1 != null)
    {
      if (localba1.a() != bc.U)
        break label138;
      paramMap.get("dealer_id");
      String str2 = (String)paramMap.get("click_url");
      ba localba2 = this.e.a(bc.U);
      if (localba2 != null)
      {
        localba2.b("dealer_id", str2);
        localba2.b("click_uri", str2);
        this.d.a(localba2);
      }
      if (URLUtil.isValidUrl(str2))
        this.c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
      f();
    }
    label138: 
    do
    {
      return;
      if (localba1.a() == bc.V)
      {
        e();
        return;
      }
    }
    while (localba1.a() != bc.W);
    f();
  }

  public final void b()
  {
    if (this.b != null)
    {
      this.j = (GregorianCalendar.getInstance().getTimeInMillis() - this.i + this.j);
      this.h = true;
      this.b.cancel();
      this.b.purge();
      this.b = null;
    }
    super.b();
  }

  public final void c()
  {
    if ((this.h) && (!((KeyguardManager)this.c.getSystemService("keyguard")).inKeyguardRestrictedInputMode()))
    {
      long l = this.e.a() - this.j;
      if (l > 0L)
      {
        this.b = new Timer();
        this.b.schedule(new b(this), l);
        this.i = GregorianCalendar.getInstance().getTimeInMillis();
      }
      this.h = false;
    }
    super.c();
  }

  public final void d()
  {
    if (this.h)
      super.d();
    try
    {
      Iterator localIterator = ((ActivityManager)this.c.getSystemService("activity")).getRunningAppProcesses().iterator();
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
      do
      {
        if (!localIterator.hasNext())
          break;
        localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      }
      while (localRunningAppProcessInfo.pid != Process.myPid());
      int m = localRunningAppProcessInfo.importance;
      if (m == 100)
      {
        k = 1;
        if (k != 0)
          c();
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        r.a(localException);
        int k = 0;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.az.a
 * JD-Core Version:    0.6.2
 */