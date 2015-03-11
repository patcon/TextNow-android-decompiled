package com.enflick.android.TextNow.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings.Banner;
import com.enflick.android.TextNow.tasks.c;
import com.enflick.android.TextNow.views.TNMoPubView;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import textnow.v.a;
import textnow.v.z;
import textnow.z.s;
import textnow.z.u;

public abstract class ap extends ao
{
  private TNMoPubView a;
  private ViewGroup b;
  private boolean c = false;
  private View d;
  private View e;
  private String f;
  private TreeSet<ar> g = new TreeSet();
  private boolean h = false;
  protected BroadcastReceiver n = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if ((paramAnonymousIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) && (textnow.v.b.b(ap.this)))
        ap.a(ap.this);
    }
  };
  private boolean o = true;
  private ScheduledExecutorService p = Executors.newSingleThreadScheduledExecutor();
  private ScheduledFuture<?> q;
  private volatile boolean r;

  private void b(int paramInt, TimeUnit paramTimeUnit)
  {
    try
    {
      new StringBuilder().append("Schedule ads show in ").append(paramInt).append(" ").append(paramTimeUnit).toString();
      if (this.q != null)
        this.q.cancel(true);
      this.q = this.p.schedule(new Runnable()
      {
        public final void run()
        {
          ap.this.runOnUiThread(new Runnable()
          {
            public final void run()
            {
              synchronized (ap.this)
              {
                if (ap.b(ap.this))
                {
                  ap.c(ap.this);
                  ap.a(ap.this, false);
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
    if (this.h);
    try
    {
      unregisterReceiver(this.n);
      label15: this.g.remove(as.a(2131296790, getResources(), null));
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
    int i = 2131558800;
    if ((!this.o) && (this.d != null))
      this.d.setVisibility(8);
    ViewGroup localViewGroup;
    do
    {
      do
      {
        return;
        if (!this.g.isEmpty())
          break;
      }
      while (this.d == null);
      this.d.setVisibility(8);
      return;
      if (this.d != null)
        break;
      if (findViewById(i) == null)
        i = 2131558516;
      localViewGroup = (ViewGroup)findViewById(i);
    }
    while (localViewGroup == null);
    this.d = getLayoutInflater().inflate(2130903132, null);
    localViewGroup.addView(this.d, 0);
    this.d.findViewById(2131558747).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        ap.this.z();
      }
    });
    final ar localar = (ar)this.g.first();
    this.d.setBackgroundDrawable(localar.a(this));
    TextView localTextView1 = (TextView)this.d.findViewById(2131558745);
    TextView localTextView2 = (TextView)this.d.findViewById(2131558746);
    View localView = this.d.findViewById(2131558744);
    if (TextUtils.isEmpty(localar.a))
    {
      localTextView1.setVisibility(8);
      localTextView2.setTextColor(-1);
      localTextView2.setText(localar.b);
      if (this.d.getVisibility() != 0)
        this.d.setVisibility(0);
      if (!(localar instanceof at))
        break label302;
      localView.setVisibility(8);
    }
    while (true)
    {
      this.d.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (ar.b(localar) != null)
            ar.b(localar).a();
        }
      });
      return;
      localTextView1.setVisibility(0);
      localTextView1.setText(localar.a);
      localTextView2.setTextColor(getResources().getColor(2131230809));
      break;
      label302: localView.setVisibility(0);
    }
  }

  private void i()
  {
    try
    {
      if ((A()) && (!x()))
      {
        if (this.a == null)
          C();
        if (this.b != null)
        {
          ViewGroup.LayoutParams localLayoutParams = this.b.getLayoutParams();
          localLayoutParams.height = z.a(this, 50);
          this.b.setLayoutParams(localLayoutParams);
        }
        if (this.a != null)
          this.a.setVisibility(0);
      }
      return;
    }
    finally
    {
    }
  }

  protected final boolean A()
  {
    return textnow.v.b.a(this.k.r(), this.k.W());
  }

  public final void B()
  {
    if (x());
    do
    {
      return;
      if (this.a != null)
      {
        this.a.forceRefresh();
        return;
      }
    }
    while (!A());
    C();
  }

  protected final void C()
  {
    ViewGroup localViewGroup1;
    if ((z.a()) && (A()))
    {
      localViewGroup1 = (ViewGroup)findViewById(2131558800);
      if (localViewGroup1 != null)
        break label192;
    }
    label181: label192: for (ViewGroup localViewGroup2 = (ViewGroup)findViewById(2131558516); ; localViewGroup2 = localViewGroup1)
    {
      if (localViewGroup2 == null);
      do
      {
        return;
        this.b = ((ViewGroup)findViewById(2131558520));
      }
      while (this.b == null);
      ViewGroup.LayoutParams localLayoutParams = this.b.getLayoutParams();
      localLayoutParams.height = z.a(this, 50);
      this.b.setLayoutParams(localLayoutParams);
      this.a = ((TNMoPubView)localViewGroup2.findViewById(2131558522));
      if (this.a == null)
      {
        this.a = ((TNMoPubView)getLayoutInflater().inflate(2130903069, null, false));
        if (this.b == null)
          break label181;
        this.b.addView(this.a);
      }
      while (true)
      {
        this.a.a(this.f);
        this.c = true;
        this.a.setAdUnitId("22f25a4a812711e295fa123138070049");
        this.a.loadAd();
        return;
        localViewGroup2.addView(this.a);
      }
    }
  }

  public final void D()
  {
    try
    {
      if (this.q != null)
        this.q.cancel(true);
      this.r = false;
      if (this.a != null)
        this.a.setVisibility(8);
      if (this.b != null)
      {
        ViewGroup.LayoutParams localLayoutParams = this.b.getLayoutParams();
        localLayoutParams.height = 0;
        this.b.setLayoutParams(localLayoutParams);
      }
      return;
    }
    finally
    {
    }
  }

  public final void E()
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

  public final boolean F()
  {
    return (this.a != null) && (this.a.getVisibility() != 0);
  }

  public final void a(int paramInt, TimeUnit paramTimeUnit)
  {
    if (paramInt > 0);
    try
    {
      this.r = true;
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

  protected final void a(Settings.AndroidSettings.Banner paramBanner, aq paramaq, boolean paramBoolean)
  {
    if ((paramBanner != null) && ("promo".equalsIgnoreCase(paramBanner.id)) && (!A()) && (!paramBoolean))
      y();
    while (paramBanner == null)
      return;
    if ((!a.a) && (((this.l.c() != null) && ("ACTIVE".equalsIgnoreCase(this.l.f()))) || ((textnow.v.b.c(this)) && ("us".equalsIgnoreCase(paramBanner.target)))))
    {
      y();
      return;
    }
    this.g.clear();
    this.g.add(new at(paramBanner.id, paramBanner.primary, paramBanner.secondary, paramBanner.color, paramBanner.url, paramaq));
    h();
  }

  protected void a(c paramc)
  {
    super.a(paramc);
    if (paramc.i() == 200)
    {
      g();
      this.h = false;
    }
  }

  protected final boolean c(String paramString)
  {
    if ("NO_NETWORK".equals(paramString))
    {
      aq local2 = new aq()
      {
        public final void a()
        {
          if ((ap.this.l.c() == null) && ((ap.this instanceof MainActivity)))
            ((MainActivity)ap.this).a(new textnow.s.b());
        }

        public final void b()
        {
        }
      };
      this.g.add(as.a(2131296790, getResources(), local2));
      h();
      registerReceiver(this.n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
      this.h = true;
      return true;
    }
    if (textnow.v.b.b(this))
    {
      g();
      this.h = false;
    }
    return false;
  }

  public final void d(int paramInt)
  {
    if (this.b != null)
      this.b.setBackgroundResource(paramInt);
  }

  public final void d(String paramString)
  {
    this.f = paramString;
    if (this.a != null)
      this.a.a(paramString);
  }

  public final void f(boolean paramBoolean)
  {
    this.o = paramBoolean;
    h();
  }

  public final void g(boolean paramBoolean)
  {
    if (!paramBoolean)
      if ((this.e != null) && (this.e.getVisibility() != 8))
        this.e.setVisibility(8);
    do
    {
      ViewGroup localViewGroup;
      do
      {
        return;
        if (this.e != null)
          break;
        localViewGroup = (ViewGroup)findViewById(2131558516);
      }
      while (localViewGroup == null);
      this.e = getLayoutInflater().inflate(2130903210, null);
      localViewGroup.addView(this.e, 0);
    }
    while (this.e.getVisibility() == 0);
    this.e.setVisibility(0);
  }

  public final void h(boolean paramBoolean)
  {
    View localView1;
    View localView2;
    if (this.e != null)
    {
      localView1 = this.e.findViewById(2131558977);
      localView2 = this.e.findViewById(2131558978);
      if (paramBoolean)
      {
        localView1.setVisibility(8);
        localView2.setVisibility(0);
        new Handler().postDelayed(new Runnable()
        {
          public final void run()
          {
            ap.this.g(false);
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

  public final void i(boolean paramBoolean)
  {
    TNMoPubView localTNMoPubView;
    if ((this.a != null) && (!x()) && (this.a.getAutorefreshEnabled() == paramBoolean))
    {
      localTNMoPubView = this.a;
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
    if (this.c)
    {
      this.a.destroy();
      this.a = null;
    }
    g();
    this.h = false;
    super.onDestroy();
  }

  protected final void y()
  {
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      ar localar = (ar)localIterator.next();
      if ((localar instanceof at))
      {
        if (ar.b(localar) != null)
          ar.b(localar).b();
        localIterator.remove();
      }
    }
    h();
  }

  protected final void z()
  {
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      ar localar = (ar)localIterator.next();
      if (ar.b(localar) != null)
        ar.b(localar).b();
    }
    this.g.clear();
    h();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ap
 * JD-Core Version:    0.6.2
 */