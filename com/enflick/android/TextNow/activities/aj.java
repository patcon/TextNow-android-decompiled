package com.enflick.android.TextNow.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings.Banner;
import com.enflick.android.TextNow.tasks.c;
import com.enflick.android.TextNow.views.TNMoPubView;
import java.util.TreeSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import textnow.q.ad;
import textnow.u.q;
import textnow.u.r;

public abstract class aj extends ai
{
  private TNMoPubView b;
  private ViewGroup c;
  private boolean d = false;
  private View e;
  private View f;
  private String g;
  protected BroadcastReceiver k = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if ((paramAnonymousIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) && (textnow.q.b.b(aj.this)))
        aj.a(aj.this);
    }
  };
  private TreeSet<ak> l = new TreeSet();
  private boolean m = false;
  private boolean n = true;
  private ScheduledExecutorService o = Executors.newSingleThreadScheduledExecutor();
  private ScheduledFuture<?> p;
  private volatile boolean q;

  private void b(int paramInt, TimeUnit paramTimeUnit)
  {
    try
    {
      new StringBuilder().append("Schedule ads show in ").append(paramInt).append(" ").append(paramTimeUnit).toString();
      if (this.p != null)
        this.p.cancel(true);
      this.p = this.o.schedule(new Runnable()
      {
        public final void run()
        {
          aj.this.runOnUiThread(new Runnable()
          {
            public final void run()
            {
              synchronized (aj.this)
              {
                if (aj.c(aj.this))
                {
                  aj.d(aj.this);
                  aj.a(aj.this, false);
                }
                return;
              }
            }
          });
        }
      }
      , paramInt, paramTimeUnit);
      return;
    }
    finally
    {
    }
  }

  private void g()
  {
    if (this.m);
    try
    {
      unregisterReceiver(this.k);
      label15: this.l.remove(al.a(2131493393, getResources()));
      h();
      return;
    }
    catch (Exception localException)
    {
      break label15;
    }
  }

  private void h()
  {
    int i = 2131165524;
    if ((!this.n) && (this.e != null))
      this.e.setVisibility(8);
    ViewGroup localViewGroup;
    do
    {
      do
      {
        return;
        if (!this.l.isEmpty())
          break;
      }
      while (this.e == null);
      this.e.setVisibility(8);
      return;
      if (this.e != null)
        break;
      if (findViewById(i) == null)
        i = 2131165286;
      localViewGroup = (ViewGroup)findViewById(i);
    }
    while (localViewGroup == null);
    this.e = getLayoutInflater().inflate(2130903118, null);
    localViewGroup.addView(this.e, 0);
    this.e.findViewById(2131165476).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        aj.b(aj.this);
      }
    });
    final ak localak = (ak)this.l.first();
    this.e.setBackgroundDrawable(localak.a(this));
    TextView localTextView1 = (TextView)this.e.findViewById(2131165474);
    TextView localTextView2 = (TextView)this.e.findViewById(2131165475);
    View localView = this.e.findViewById(2131165473);
    localTextView1.setText(localak.a);
    localTextView2.setText(localak.b);
    if (this.e.getVisibility() != 0)
      this.e.setVisibility(0);
    if ((localak instanceof am))
      localView.setVisibility(8);
    while ((localak.a(al.a(2131493393, getResources())) == 0) && (new q(this).b() == null))
    {
      this.e.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if ((aj.this instanceof MainActivity))
            ((MainActivity)aj.this).a(new textnow.n.b());
        }
      });
      return;
      localView.setVisibility(0);
    }
    if (((localak instanceof am)) && (((am)localak).c != null))
    {
      this.e.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          aj.b(aj.this);
          com.enflick.android.TextNow.ads.a.a("promo_banner_clicked", "title", localak.a);
          String str = ((am)localak).c;
          Intent localIntent = new Intent("android.intent.action.VIEW");
          localIntent.setData(Uri.parse(str));
          aj.this.startActivity(localIntent);
        }
      });
      return;
    }
    this.e.setOnClickListener(null);
  }

  private void i()
  {
    try
    {
      if ((v()) && (!u()))
      {
        if (this.b == null)
          x();
        if (this.c != null)
        {
          ViewGroup.LayoutParams localLayoutParams = this.c.getLayoutParams();
          localLayoutParams.height = ad.a(this, 50);
          this.c.setLayoutParams(localLayoutParams);
        }
        if (this.b != null)
          this.b.setVisibility(0);
      }
      return;
    }
    finally
    {
    }
  }

  public final boolean A()
  {
    return (this.b != null) && (this.b.getVisibility() != 0);
  }

  public final void a(int paramInt, TimeUnit paramTimeUnit)
  {
    if (paramInt > 0);
    try
    {
      this.q = true;
      b(paramInt, paramTimeUnit);
      while (true)
      {
        return;
        i();
      }
    }
    finally
    {
    }
  }

  protected final void a(Settings.AndroidSettings.Banner paramBanner)
  {
    if (!v());
    while ((paramBanner == null) || ((!textnow.q.a.a) && ((new q(this).b() != null) || ((textnow.q.b.c(this)) && ("us".equalsIgnoreCase(paramBanner.target))))))
      return;
    this.l.add(new am(paramBanner.primary, paramBanner.secondary, paramBanner.color, paramBanner.url));
    h();
  }

  protected void a(c paramc)
  {
    super.a(paramc);
    if (paramc.i() == 200)
    {
      g();
      this.m = false;
    }
  }

  public final void c(boolean paramBoolean)
  {
    this.n = paramBoolean;
    h();
  }

  protected final boolean c(String paramString)
  {
    if ("NO_NETWORK".equals(paramString))
    {
      this.l.add(al.a(2131493393, getResources()));
      h();
      registerReceiver(this.k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
      this.m = true;
      return true;
    }
    if (textnow.q.b.b(this))
    {
      g();
      this.m = false;
    }
    return false;
  }

  public final void d(String paramString)
  {
    this.g = paramString;
    if (this.b != null)
      this.b.a(paramString);
  }

  public final void d(boolean paramBoolean)
  {
    if (!paramBoolean)
      if ((this.f != null) && (this.f.getVisibility() != 8))
        this.f.setVisibility(8);
    do
    {
      ViewGroup localViewGroup;
      do
      {
        return;
        if (this.f != null)
          break;
        localViewGroup = (ViewGroup)findViewById(2131165286);
      }
      while (localViewGroup == null);
      this.f = getLayoutInflater().inflate(2130903192, null);
      localViewGroup.addView(this.f, 0);
    }
    while (this.f.getVisibility() == 0);
    this.f.setVisibility(0);
  }

  public final void e(int paramInt)
  {
    if (this.c != null)
      this.c.setBackgroundResource(paramInt);
  }

  public final void e(boolean paramBoolean)
  {
    View localView1;
    View localView2;
    if (this.f != null)
    {
      localView1 = this.f.findViewById(2131165675);
      localView2 = this.f.findViewById(2131165676);
      if (paramBoolean)
      {
        localView1.setVisibility(8);
        localView2.setVisibility(0);
        new Handler().postDelayed(new Runnable()
        {
          public final void run()
          {
            aj.this.d(false);
          }
        }
        , 1500L);
      }
    }
    else
    {
      return;
    }
    localView1.setVisibility(0);
    localView2.setVisibility(8);
  }

  public final void f(boolean paramBoolean)
  {
    TNMoPubView localTNMoPubView;
    if ((this.b != null) && (!u()) && (this.b.getAutorefreshEnabled() == paramBoolean))
    {
      localTNMoPubView = this.b;
      if (paramBoolean)
        break label42;
    }
    label42: for (boolean bool = true; ; bool = false)
    {
      localTNMoPubView.setAutorefreshEnabled(bool);
      return;
    }
  }

  protected void onDestroy()
  {
    if (this.d)
    {
      this.b.destroy();
      this.b = null;
    }
    g();
    this.m = false;
    super.onDestroy();
  }

  protected final boolean v()
  {
    return textnow.q.b.a(this.h.t(), this.h.U());
  }

  public final void w()
  {
    if (u());
    do
    {
      return;
      if (this.b != null)
      {
        this.b.forceRefresh();
        return;
      }
    }
    while (!v());
    x();
  }

  protected final void x()
  {
    ViewGroup localViewGroup1;
    if ((ad.a()) && (v()))
    {
      localViewGroup1 = (ViewGroup)findViewById(2131165524);
      if (localViewGroup1 != null)
        break label185;
    }
    label174: label185: for (ViewGroup localViewGroup2 = (ViewGroup)findViewById(2131165286); ; localViewGroup2 = localViewGroup1)
    {
      if (localViewGroup2 == null)
        return;
      this.c = ((ViewGroup)findViewById(2131165523));
      ViewGroup.LayoutParams localLayoutParams = this.c.getLayoutParams();
      localLayoutParams.height = ad.a(this, 50);
      this.c.setLayoutParams(localLayoutParams);
      this.b = ((TNMoPubView)localViewGroup2.findViewById(2131165285));
      if (this.b == null)
      {
        this.b = ((TNMoPubView)getLayoutInflater().inflate(2130903065, null, false));
        if (this.c == null)
          break label174;
        this.c.addView(this.b);
      }
      while (true)
      {
        this.b.a(this.g);
        this.d = true;
        this.b.setAdUnitId("22f25a4a812711e295fa123138070049");
        this.b.loadAd();
        return;
        localViewGroup2.addView(this.b);
      }
    }
  }

  public final void y()
  {
    try
    {
      if (this.p != null)
        this.p.cancel(true);
      this.q = false;
      if (this.b != null)
        this.b.setVisibility(8);
      if (this.c != null)
      {
        ViewGroup.LayoutParams localLayoutParams = this.c.getLayoutParams();
        localLayoutParams.height = 0;
        this.c.setLayoutParams(localLayoutParams);
      }
      return;
    }
    finally
    {
    }
  }

  public final void z()
  {
    try
    {
      a(0, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.aj
 * JD-Core Version:    0.6.2
 */