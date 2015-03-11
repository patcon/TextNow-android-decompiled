package textnow.az;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tremorvideo.sdk.android.videoad.ba;
import com.tremorvideo.sdk.android.videoad.du;
import com.tremorvideo.sdk.android.videoad.dx;
import com.tremorvideo.sdk.android.videoad.i;
import com.tremorvideo.sdk.android.videoad.j;
import com.tremorvideo.sdk.android.videoad.r;
import java.io.File;
import java.util.List;
import java.util.Timer;
import org.apache.http.NameValuePair;

public final class c
  implements du, j
{
  public static dx a;
  public static j b;
  boolean c = true;
  int d = -1;
  Timer e;
  BroadcastReceiver f = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      c.this.c = false;
      c.a(c.this).j();
    }
  };
  BroadcastReceiver g = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      c.this.c = true;
      c.a(c.this);
    }
  };
  BroadcastReceiver h = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (c.this.c)
        c.a(c.this).d();
    }
  };
  private a i;
  private Activity j;
  private WebView k;
  private j l;

  public final int a(ba paramba)
  {
    return this.l.a(paramba, -1);
  }

  public final int a(ba paramba, int paramInt)
  {
    return this.l.a(paramba, paramInt);
  }

  public final int a(ba paramba, int paramInt, List<NameValuePair> paramList)
  {
    return this.l.a(paramba, paramInt, paramList);
  }

  public final void a()
  {
    this.i.a();
  }

  public final void a(float paramFloat1, float paramFloat2, int paramInt)
  {
  }

  public final void a(int paramInt)
  {
    this.l.a(paramInt);
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public final void a(Activity paramActivity)
  {
    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
    {
      public final void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
      {
        r.a(paramAnonymousThrowable.getStackTrace());
        r.d(paramAnonymousThrowable.getMessage());
        c.b(c.this).finish();
      }
    });
    this.j = paramActivity;
    this.i = new a(this, this.j, a);
    this.j.requestWindowFeature(1);
    this.j.getWindow().setFlags(1024, 1024);
    this.k = new p(this.j, this);
    File localFile = new File(a.y().h().getAbsolutePath() + "/index.html");
    Double localDouble = Double.valueOf(new Double(((WindowManager)this.j.getSystemService("window")).getDefaultDisplay().getWidth()).doubleValue() / new Double(440.0D).doubleValue());
    this.k.setPadding(0, 0, 0, 0);
    if (localDouble.doubleValue() >= 1.0D)
    {
      float f2 = this.j.getResources().getDisplayMetrics().density;
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams((int)(440.0F * f2), (int)(320.0F * f2));
      localLayoutParams.gravity = 17;
      LinearLayout localLinearLayout = new LinearLayout(this.j);
      localLinearLayout.setGravity(17);
      this.k.setInitialScale((int)(f2 * 100.0F));
      this.e = new Timer();
      this.e.schedule(new d(this, "file://" + localFile.getAbsolutePath()), 1000L);
      localLinearLayout.addView(this.k, localLayoutParams);
      this.j.setContentView(localLinearLayout);
    }
    while (true)
    {
      this.l = b;
      this.j.registerReceiver(this.f, new IntentFilter("android.intent.action.SCREEN_OFF"));
      this.j.registerReceiver(this.g, new IntentFilter("android.intent.action.SCREEN_ON"));
      this.j.registerReceiver(this.h, new IntentFilter("android.intent.action.USER_PRESENT"));
      return;
      float f1 = r.J();
      this.k.setInitialScale((int)(f1 * 100.0F));
      this.e = new Timer();
      this.e.schedule(new d(this, "file://" + localFile.getAbsolutePath()), 1000L);
      this.j.setContentView(this.k);
    }
  }

  public final void a(Configuration paramConfiguration)
  {
  }

  public final void a(i parami)
  {
    this.j.setResult(100, new Intent());
    this.j.finish();
  }

  public final boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  public final void b()
  {
    this.i.b();
  }

  public final void b(int paramInt)
  {
    this.d = paramInt;
  }

  public final void c()
  {
    this.i.c();
  }

  public final void d()
  {
  }

  public final void e()
  {
    r.d("BuyItNowWebView - onDestroy");
    if (this.i != null)
    {
      a locala = this.i;
      if (locala.b != null)
      {
        locala.b.cancel();
        locala.b.purge();
        locala.b = null;
      }
      this.i = null;
    }
    this.j.unregisterReceiver(this.f);
    this.j.unregisterReceiver(this.g);
    this.j.unregisterReceiver(this.h);
    System.gc();
  }

  public final dx f()
  {
    return a;
  }

  public final Context g()
  {
    return this.j;
  }

  public final int h()
  {
    if (Resources.getSystem().getConfiguration().orientation == 2)
      return 0;
    return 1;
  }

  public final int i()
  {
    return this.d;
  }

  public final a j()
  {
    return this.i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.az.c
 * JD-Core Version:    0.6.2
 */