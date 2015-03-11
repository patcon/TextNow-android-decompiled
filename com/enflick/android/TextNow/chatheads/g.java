package com.enflick.android.TextNow.chatheads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.content.m;
import android.text.TextUtils;
import com.enflick.android.TextNow.activities.ChatHeadMessageActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import textnow.v.y;

public final class g
  implements b
{
  private static g a;
  private Context b;
  private boolean c = false;
  private List<a> d = Collections.synchronizedList(new ArrayList());
  private ArrayList<Integer> e = new ArrayList();
  private ArrayList<Integer> f = new ArrayList();
  private h g;
  private f h;
  private BroadcastReceiver i;

  private g(Context paramContext)
  {
    this.b = paramContext;
    this.h = new f(this.b);
    this.g = new h(paramContext, this.h);
    this.i = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        if ((paramAnonymousIntent == null) || (paramAnonymousIntent.getAction() == null))
          return;
        g.a(g.this);
      }
    };
    if ((this.i != null) && (this.b != null))
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
      this.b.registerReceiver(this.i, localIntentFilter);
    }
  }

  public static g a(Context paramContext)
  {
    if (a == null)
    {
      g localg = new g(paramContext);
      a = localg;
      return localg;
    }
    return a;
  }

  private a b(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    synchronized (this.d)
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (locala.a().a().compareTo(paramString) == 0)
          return locala;
      }
    }
    return null;
  }

  private void b(textnow.z.f paramf)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("action_open_conversation");
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("arg_contact", paramf);
    localIntent.putExtras(localBundle);
    m.a(this.b).a(localIntent);
  }

  private void c(a parama)
  {
    if (parama == null)
      return;
    this.d.remove(parama);
  }

  private void d(a parama)
  {
    int j = 0;
    if (this.d.size() == 1);
    while (((a)this.d.get(0)).a(parama))
      return;
    while (true)
    {
      synchronized (this.d)
      {
        if (j < this.d.size())
        {
          if (((a)this.d.get(j)).a(parama))
          {
            parama.d();
            this.d.remove(j);
            this.d.add(0, parama);
          }
        }
        else
        {
          this.g.g();
          return;
        }
      }
      j++;
    }
  }

  public static boolean f()
  {
    return a != null;
  }

  public static void g()
  {
    g localg2;
    if (a != null)
    {
      g localg1 = a;
      synchronized (localg1.d)
      {
        Iterator localIterator = localg1.d.iterator();
        if (localIterator.hasNext())
          ((a)localIterator.next()).b(false);
      }
      localg1.d.clear();
      localg1.g.b();
      localg1.g = null;
      localg2 = a;
      if ((localg2.i == null) || (localg2.b == null));
    }
    try
    {
      localg2.b.unregisterReceiver(localg2.i);
      label114: a = null;
      return;
    }
    catch (Exception localException)
    {
      break label114;
    }
  }

  private a m()
  {
    if (this.d.size() == 0)
      return null;
    return (a)this.d.get(0);
  }

  private void n()
  {
    a locala = m();
    if (locala == null)
      return;
    b(locala.a());
  }

  private boolean o()
  {
    if (this.d.size() == 0)
      return false;
    synchronized (this.d)
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
        if (!((a)localIterator.next()).f())
          return false;
      return true;
    }
  }

  private void p()
  {
    List localList = this.d;
    int j = 0;
    try
    {
      while (j < this.d.size())
      {
        ((a)this.d.get(j)).c(j);
        j++;
      }
      c.a(this.h).a(false, 500, 1);
      return;
    }
    finally
    {
    }
  }

  private void q()
  {
    Intent localIntent = new Intent();
    localIntent.setAction("action_close");
    m.a(this.b).a(localIntent);
  }

  public final void a()
  {
    a locala = m();
    if (locala == null)
      return;
    Point localPoint = locala.i();
    synchronized (this.d)
    {
      Iterator localIterator = this.d.iterator();
      if (localIterator.hasNext())
        ((a)localIterator.next()).a(localPoint);
    }
  }

  public final void a(float paramFloat)
  {
    this.c = true;
    synchronized (this.d)
    {
      Iterator localIterator = this.d.iterator();
      if (localIterator.hasNext())
        ((a)localIterator.next()).a((int)paramFloat);
    }
  }

  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j = -1 + this.d.size();
    this.e.add(0, Integer.valueOf(paramInt1));
    this.f.add(0, Integer.valueOf(paramInt2));
    if (this.e.size() > j)
      this.e.remove(-1 + this.e.size());
    if (this.f.size() > j)
      this.f.remove(-1 + this.f.size());
    List localList;
    if (this.d.size() != 0)
      localList = this.d;
    for (int k = 1; ; k++)
      try
      {
        if (k < this.d.size())
        {
          if (this.e.size() >= k)
            ((a)this.d.get(k)).a(((Integer)this.e.get(k - 1)).intValue(), ((Integer)this.f.get(k - 1)).intValue());
        }
        else
          return;
      }
      finally
      {
      }
  }

  public final void a(long paramLong)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("action_open_img_preview");
    localIntent.putExtra("msg_id", paramLong);
    m.a(this.b).a(localIntent);
  }

  public final void a(a parama)
  {
    if (m() == null)
      return;
    if ((o()) && (ChatHeadMessageActivity.g()))
    {
      if (!b(parama))
      {
        d(parama);
        n();
        return;
      }
      q();
      return;
    }
    p();
  }

  public final void a(a parama, boolean paramBoolean)
  {
    int j = -1 + this.d.size();
    boolean bool = o();
    c(parama);
    if ((this.d.size() == 0) && (bool))
      q();
    while (paramBoolean)
    {
      for (int k = 0; k < j; k++)
        ((a)this.d.get(0)).a(false);
      if (bool)
      {
        p();
        n();
      }
    }
  }

  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    a locala;
    do
    {
      return;
      locala = b(paramString);
    }
    while (locala == null);
    locala.a(false);
  }

  public final void a(textnow.z.f paramf)
  {
    if (paramf == null);
    a locala1;
    do
    {
      return;
      locala1 = b(paramf.a());
      if (locala1 == null)
        break;
    }
    while (o());
    d(locala1);
    return;
    a locala2 = new a(this.b, this, this.h, this.g, paramf, this);
    a locala3;
    if (1 + this.d.size() > 5)
      if (this.d.size() == 0)
      {
        locala3 = null;
        c(locala3);
      }
    while (true)
    {
      if (o())
      {
        this.d.add(locala2);
        locala2.a(null, false);
        p();
        if (locala3 != null)
        {
          b(paramf);
          locala3.b(true);
        }
        this.g.g();
        j();
        com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "info", "total Floating chatheads = " + this.d.size());
        return;
        if (this.d.size() == 1)
        {
          locala3 = (a)this.d.get(0);
          break;
        }
        locala3 = (a)this.d.get(-1 + this.d.size());
        break;
      }
      a locala4 = m();
      if (locala4 != null)
        locala2.a(locala4.b(), true);
      while (true)
      {
        this.d.add(0, locala2);
        d(locala2);
        if (locala3 == null)
          break;
        locala3.b(true);
        break;
        locala2.a(null, true);
      }
      locala3 = null;
    }
  }

  public final boolean a(textnow.z.h paramh)
  {
    if (paramh == null);
    textnow.z.h localh;
    do
    {
      return false;
      textnow.z.f localf = new textnow.z.f(paramh.c(), paramh.d(), paramh.e(), paramh.h());
      localh = textnow.z.h.a(this.b, localf);
    }
    while ((localh == null) || (b(localh.c()) == null));
    return true;
  }

  public final void b()
  {
    if (this.d.size() != 0)
    {
      a();
      this.e.clear();
      this.f.clear();
    }
  }

  public final boolean b(a parama)
  {
    a locala = m();
    if (locala == null)
      return false;
    return locala.a(parama);
  }

  public final void c()
  {
    this.c = false;
  }

  public final void d()
  {
    this.e.clear();
    this.f.clear();
    List localList;
    int j;
    if ((!o()) && (this.d.size() != 0))
    {
      localList = this.d;
      j = 1;
    }
    try
    {
      while (j < this.d.size())
      {
        ((a)this.d.get(j)).g();
        j++;
      }
      return;
    }
    finally
    {
    }
  }

  public final void e()
  {
    List localList;
    int j;
    if ((!o()) && (this.d.size() != 0))
    {
      localList = this.d;
      j = 1;
    }
    try
    {
      while (j < this.d.size())
      {
        ((a)this.d.get(j)).h();
        j++;
      }
      return;
    }
    finally
    {
    }
  }

  public final void h()
  {
    synchronized (this.d)
    {
      Iterator localIterator = this.d.iterator();
      if (localIterator.hasNext())
        ((a)localIterator.next()).c();
    }
  }

  public final boolean i()
  {
    return this.c;
  }

  public final void j()
  {
    while (true)
    {
      a locala;
      synchronized (this.d)
      {
        Iterator localIterator = this.d.iterator();
        if (!localIterator.hasNext())
          break;
        locala = (a)localIterator.next();
        if (b(locala))
          locala.b(y.b(this.b, 2130772068));
      }
      locala.b(0);
    }
  }

  public final void k()
  {
    synchronized (this.d)
    {
      Iterator localIterator = this.d.iterator();
      if (localIterator.hasNext())
        ((a)localIterator.next()).j();
    }
  }

  public final void l()
  {
    if (m() != null)
      synchronized (this.d)
      {
        Iterator localIterator = this.d.iterator();
        if (localIterator.hasNext())
          ((a)localIterator.next()).a(null, null);
      }
    c.a(this.h).a(false, 500, 3);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.chatheads.g
 * JD-Core Version:    0.6.2
 */