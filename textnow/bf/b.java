package textnow.bf;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebView;
import com.tremorvideo.sdk.android.videoad.ba;
import com.tremorvideo.sdk.android.videoad.du;
import com.tremorvideo.sdk.android.videoad.dx;
import com.tremorvideo.sdk.android.videoad.i;
import com.tremorvideo.sdk.android.videoad.j;
import com.tremorvideo.sdk.android.videoad.r;
import java.util.List;
import java.util.Timer;
import org.apache.http.NameValuePair;

public final class b
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
      b.this.c = false;
      b.a(b.this).j();
    }
  };
  BroadcastReceiver g = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      b.this.c = true;
      b.a(b.this);
    }
  };
  BroadcastReceiver h = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (b.this.c)
        b.a(b.this).d();
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
        b.b(b.this).finish();
      }
    });
    this.j = paramActivity;
    this.j.requestWindowFeature(1);
    this.j.getWindow().setFlags(1024, 1024);
    this.i = new a(this, this.j, a);
    String str1 = this.j.getIntent().getExtras().getString("path");
    String str2 = this.j.getIntent().getExtras().getString("params");
    this.k = new d(this.j, this);
    ((d)this.k).a(str2);
    String str3 = a.t();
    this.k.setPadding(0, 0, 0, 0);
    this.e = new Timer();
    this.e.schedule(new c(this, "file://" + str3 + "/" + str1), 1000L);
    this.j.setContentView(this.k);
    this.l = b;
    this.j.registerReceiver(this.f, new IntentFilter("android.intent.action.SCREEN_OFF"));
    this.j.registerReceiver(this.g, new IntentFilter("android.intent.action.SCREEN_ON"));
    this.j.registerReceiver(this.h, new IntentFilter("android.intent.action.USER_PRESENT"));
    if (r.p() >= 9)
    {
      this.j.setRequestedOrientation(6);
      return;
    }
    this.j.setRequestedOrientation(0);
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
    r.d("WebView - onDestroy");
    if (this.i != null)
      this.i = null;
    try
    {
      this.j.unregisterReceiver(this.f);
      this.j.unregisterReceiver(this.g);
      this.j.unregisterReceiver(this.h);
      label55: System.gc();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label55;
    }
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
 * Qualified Name:     textnow.bf.b
 * JD-Core Version:    0.6.2
 */