package textnow.at;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import com.tremorvideo.sdk.android.videoad.Playvideo;
import com.tremorvideo.sdk.android.videoad.ba;
import com.tremorvideo.sdk.android.videoad.bc;
import com.tremorvideo.sdk.android.videoad.cv;
import com.tremorvideo.sdk.android.videoad.dx;
import com.tremorvideo.sdk.android.videoad.i;
import com.tremorvideo.sdk.android.videoad.j;
import com.tremorvideo.sdk.android.videoad.r;
import com.tremorvideo.sdk.android.videoad.s;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

public final class a extends i
{
  cv a;
  Timer b;
  private e e;
  private boolean f;
  private boolean g = false;
  private boolean h;
  private boolean i = false;
  private long j = -1L;
  private long k = -1L;

  public a(j paramj, Activity paramActivity, dx paramdx)
  {
    super(paramj, paramActivity);
    this.e = paramdx.z();
    this.f = false;
    this.a = paramdx.q();
  }

  private void n()
  {
    try
    {
      if (!this.f)
      {
        this.f = true;
        ba localba = this.e.a(bc.aa);
        if (localba != null)
        {
          int m = this.d.a(localba);
          this.d.a(m);
        }
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
    {
      this.g = true;
      this.h = false;
    }
    try
    {
      int m = this.d.a(this.e.a(bc.Y));
      this.d.a(m);
      return;
    }
    catch (Exception localException)
    {
      r.a(localException);
      this.d.a(this);
    }
  }

  public final void a(bc parambc)
  {
    ba localba = this.e.a(parambc);
    if (localba != null)
    {
      int m = this.d.a(localba);
      this.d.a(m);
    }
  }

  public final void a(bc parambc, String paramString)
  {
    try
    {
      a(parambc);
      Intent localIntent = new Intent(this.c, Playvideo.class);
      localIntent.putExtra("tremorVideoType", "webview");
      localIntent.putExtra("tremorVideoURL", paramString);
      this.c.startActivityForResult(localIntent, 3232);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(bc parambc, String paramString1, String paramString2, String paramString3)
  {
    try
    {
      a(parambc);
      Double localDouble1 = Double.valueOf(Double.parseDouble(paramString1));
      Double localDouble2 = Double.valueOf(Double.parseDouble(paramString2));
      String str1;
      Intent localIntent1;
      if ((localDouble2.doubleValue() == 0.0D) && (localDouble1.doubleValue() == 0.0D))
      {
        str1 = "0,0";
        String str2 = str1 + "?z=20";
        String str3 = str2 + "&q=" + paramString3 + "(" + paramString3 + ")";
        Uri localUri = Uri.parse("geo:" + str3);
        r.a(s.b, "Map URL: " + localUri.toString());
        localIntent1 = new Intent("android.intent.action.VIEW", localUri);
        if (this.c.getPackageManager().resolveActivity(localIntent1, 0) != null)
          break label323;
        String str4 = "http://maps.google.com/?q=" + paramString3 + "&ll=" + localDouble2 + "," + localDouble1;
        Intent localIntent2 = new Intent(this.c, Playvideo.class);
        localIntent2.putExtra("tremorVideoType", "webview");
        localIntent2.putExtra("tremorVideoURL", str4);
        this.c.startActivityForResult(localIntent2, 3232);
      }
      while (true)
      {
        return;
        str1 = "" + localDouble2 + "," + localDouble1;
        break;
        label323: this.c.startActivityForResult(localIntent1, 11);
      }
    }
    finally
    {
    }
  }

  public final void b()
  {
    if (this.b != null)
    {
      this.k = (GregorianCalendar.getInstance().getTimeInMillis() - this.j + this.k);
      this.i = true;
      this.b.cancel();
      this.b.purge();
      this.b = null;
    }
    super.b();
  }

  public final void c()
  {
    if ((this.i) && (!((KeyguardManager)this.c.getSystemService("keyguard")).inKeyguardRestrictedInputMode()))
    {
      long l = this.e.a() - this.k;
      if (l > 0L)
      {
        this.b = new Timer();
        this.b.schedule(new b(this), l);
        this.j = GregorianCalendar.getInstance().getTimeInMillis();
      }
      this.i = false;
    }
    super.c();
  }

  public final void d()
  {
    if (this.i)
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
      int n = localRunningAppProcessInfo.importance;
      if (n == 100)
      {
        m = 1;
        if (m != 0)
          c();
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        r.a(localException);
        int m = 0;
      }
    }
  }

  public final void e()
  {
    try
    {
      if (!this.f)
      {
        this.f = true;
        ba localba = this.e.a(bc.aa);
        if (localba != null)
        {
          int m = this.d.a(localba);
          this.d.a(m);
        }
        this.d.a(this);
      }
      return;
    }
    finally
    {
    }
  }

  public final void f()
  {
    try
    {
      if (!this.f)
      {
        this.f = true;
        ba localba = this.e.a(bc.Z);
        if (localba != null)
        {
          int m = this.d.a(localba);
          this.d.a(m);
        }
        this.d.a(this);
      }
      return;
    }
    finally
    {
    }
  }

  public final void g()
  {
    if ((!this.h) && (this.e.a() > 0))
    {
      this.j = GregorianCalendar.getInstance().getTimeInMillis();
      this.k = 0L;
      this.b = new Timer();
      this.b.schedule(new b(this), this.e.a());
      this.h = true;
    }
  }

  public final void h()
  {
    this.h = true;
    if (this.b != null)
    {
      this.b.cancel();
      this.b.purge();
      this.b = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.at.a
 * JD-Core Version:    0.6.2
 */