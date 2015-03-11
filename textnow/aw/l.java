package textnow.aw;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import java.util.ArrayList;

final class l extends b
{
  protected float b;
  protected int c = -1;
  protected int d = -1;
  private ac e = ac.d;
  private final r f;
  private final v g;
  private boolean h;
  private Runnable i = new Runnable()
  {
    public final void run()
    {
      if (l.a(l.this) != true)
      {
        l.a(l.this, true);
        l.this.a().a(ad.a(l.a(l.this)));
      }
      l.b(l.this).postDelayed(this, 3000L);
    }
  };
  private Handler j = new Handler();
  private final int k;
  private BroadcastReceiver l = new BroadcastReceiver()
  {
    private int b;

    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (paramAnonymousIntent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED"))
      {
        int i = l.c(l.this);
        if (i != this.b)
        {
          this.b = i;
          l.a(l.this, this.b);
        }
      }
    }
  };
  private boolean m;

  public l(q paramq, r paramr, v paramv)
  {
    super(paramq);
    this.f = paramr;
    this.g = paramv;
    Context localContext = a().getContext();
    if ((localContext instanceof Activity));
    for (int n = ((Activity)localContext).getRequestedOrientation(); ; n = -1)
    {
      this.k = n;
      this.e = ac.a;
      e();
      this.j.removeCallbacks(this.i);
      this.j.post(this.i);
      a().getContext().registerReceiver(this.l, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
      return;
    }
  }

  private void e()
  {
    Context localContext = a().getContext();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    this.b = localDisplayMetrics.density;
    int i1;
    int n;
    if ((localContext instanceof Activity))
    {
      Window localWindow = ((Activity)localContext).getWindow();
      Rect localRect = new Rect();
      localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect);
      i1 = localRect.top;
      n = localWindow.findViewById(16908290).getTop() - i1;
    }
    while (true)
    {
      int i2 = localDisplayMetrics.widthPixels;
      int i3 = localDisplayMetrics.heightPixels - i1 - n;
      this.c = ((int)(i2 * (160.0D / localDisplayMetrics.densityDpi)));
      this.d = ((int)(i3 * (160.0D / localDisplayMetrics.densityDpi)));
      return;
      n = 0;
      i1 = 0;
    }
  }

  protected final void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.f == r.b);
    do
    {
      return;
      if ((paramString != null) && (!URLUtil.isValidUrl(paramString)))
      {
        a().a("expand", "URL passed to expand() was invalid.");
        return;
      }
      a(paramBoolean1);
      this.e = ac.c;
      a().a(p.a(this.e));
    }
    while (a().h() == null);
    a().h();
    a();
  }

  protected final void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
    q localq = a();
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      if (localq.k() != null)
        localq.k().a(bool);
      return;
    }
  }

  public final void b()
  {
    this.j.removeCallbacks(this.i);
    try
    {
      a().getContext().unregisterReceiver(this.l);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (localIllegalArgumentException.getMessage().contains("Receiver not registered"));
      throw localIllegalArgumentException;
    }
  }

  protected final void c()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(o.a(this.c, this.d));
    localArrayList.add(ad.a(this.h));
    a().a(localArrayList);
    this.e = ac.b;
    a().a(p.a(this.e));
  }

  protected final void d()
  {
    a().setVisibility(4);
    this.e = ac.d;
    if (a().i() != null)
    {
      x localx = a().i();
      a();
      localx.a();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aw.l
 * JD-Core Version:    0.6.2
 */