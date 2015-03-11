package com.enflick.android.TextNow.activities;

import android.content.Intent;
import android.support.v4.app.ac;
import android.view.MenuItem;
import com.enflick.android.TextNow.activities.account.a;
import com.enflick.android.TextNow.activities.account.c;
import com.enflick.android.TextNow.activities.account.k;
import com.enflick.android.TextNow.activities.phone.DialerFragment;
import com.enflick.android.TextNow.activities.phone.DialerFragment.DialerState;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import textnow.k.w;
import textnow.l.b;
import textnow.n.h;
import textnow.u.f;

public final class n extends l
{
  private boolean d;

  public n(MainActivity paramMainActivity)
  {
    super(paramMainActivity);
  }

  private void c(ao paramao)
  {
    new StringBuilder().append("Pushing parent fragment: ").append(paramao).toString();
    ac localac = this.b.a();
    localac.a(4099);
    if (l() != null)
    {
      while (!a(e.class))
      {
        ao localao = m();
        new StringBuilder().append("Popping fragment ").append(localao).toString();
        localac.a(localao);
      }
      new StringBuilder().append("Detaching previous fragment ").append(l()).toString();
      localac.b(l());
    }
    b(paramao);
    localac.a(2131165522, paramao);
    a(localac);
    new StringBuilder().append("New back stack depth: ").append(this.c.size()).toString();
    i();
  }

  private void u()
  {
    ac localac = this.b.a();
    localac.a(4099);
    while (!a(e.class))
    {
      ao localao = m();
      new StringBuilder().append("Popping fragment ").append(localao).toString();
      localac.a(localao);
    }
    localac.c(l());
    a(localac);
    i();
  }

  public final int a()
  {
    return 2130903134;
  }

  public final void a(int paramInt)
  {
    if (!a(a.class))
      c(a.a());
    switch (paramInt)
    {
    default:
      return;
    case 3:
      a(c.a());
      return;
    case 2:
      a(com.enflick.android.TextNow.activities.account.j.a());
      return;
    case 1:
    }
    a(k.a());
  }

  public final void a(Intent paramIntent)
  {
    this.d = paramIntent.getBooleanExtra("extra_from_notification", false);
  }

  protected final void a(ao paramao)
  {
    new StringBuilder().append("Pushing child fragment ").append(paramao).toString();
    ac localac = this.b.a();
    localac.a(4099);
    new StringBuilder().append("Detaching previous fragment ").append(l()).toString();
    localac.b(l());
    b(paramao);
    localac.a(2131165522, paramao);
    a(localac);
    new StringBuilder().append("New back stack depth: ").append(this.c.size()).toString();
    i();
  }

  protected final void a(String paramString1, String paramString2)
  {
    c(MessageViewFragment.a(paramString1, paramString2, this));
  }

  protected final void a(textnow.u.d paramd, DialerFragment.DialerState paramDialerState, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2);
    try
    {
      a(DialerFragment.a(paramd, paramDialerState, paramBoolean1, paramBoolean2, this));
      return;
      c(DialerFragment.a(paramd, paramDialerState, paramBoolean1, paramBoolean2, this));
      return;
    }
    catch (com.enflick.android.TextNow.activities.phone.j localj)
    {
    }
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    case 2131165755:
    default:
    case 2131165754:
    case 2131165756:
    }
    e locale;
    do
    {
      return super.a(paramMenuItem);
      if (com.enflick.android.TextNow.activities.phone.d.d())
        a(null, null, false, false);
      while (true)
      {
        return true;
        this.a.c(2131493041);
      }
      locale = (e)b(e.class);
    }
    while (locale == null);
    locale.f();
    return true;
  }

  protected final void b(int paramInt, f paramf, MessageViewFragment.MessageViewState paramMessageViewState, w paramw, String paramString)
  {
    if (paramf != null)
      new StringBuilder().append("open conversation with ").append(paramf.c()).toString();
    if (paramw == null)
    {
      c(MessageViewFragment.a(paramInt, paramf, paramMessageViewState, this, paramw, paramString));
      return;
    }
    a(MessageViewFragment.a(paramInt, paramf, paramMessageViewState, this, paramw, paramString));
  }

  public final void b(String paramString1, String paramString2)
  {
    a(b.a(paramString1, paramString2));
  }

  public final boolean b()
  {
    ao localao1 = l();
    if ((localao1 != null) && (localao1.B()));
    while (true)
    {
      return true;
      try
      {
        if ((a(DialerFragment.class)) && (com.enflick.android.TextNow.activities.phone.d.c(com.enflick.android.TextNow.activities.phone.d.a().y())))
        {
          u();
          return true;
        }
      }
      catch (com.enflick.android.TextNow.activities.phone.j localj)
      {
        localj.printStackTrace();
        if (!a(e.class))
        {
          ao localao2 = m();
          if (localao2 == null)
            continue;
          new StringBuilder().append("Popping element from back stack ").append(localao2).toString();
          ac localac = this.b.a();
          localac.a(4099);
          localac.a(localao2);
          ao localao3 = l();
          new StringBuilder().append("Attaching previous fragment ").append(localao3).toString();
          localac.c(localao3);
          a(localac);
          i();
          new StringBuilder().append("New back stack depth: ").append(this.c.size()).toString();
          return true;
        }
      }
    }
    return false;
  }

  protected final void c()
  {
    e locale = (e)b(e.class);
    if (locale != null)
      locale.j();
  }

  public final void d()
  {
    if (a(y.class))
      return;
    c(y.c(0));
  }

  public final void e()
  {
    if (a(ab.class))
      return;
    c(ab.c(0));
  }

  public final void f()
  {
    if (a(h.class))
      return;
    c(new h());
  }

  public final void g()
  {
    if (l() == null)
    {
      c(e.a(this));
      return;
    }
    if (a(MessageViewFragment.class))
    {
      MessageViewFragment localMessageViewFragment = (MessageViewFragment)b(MessageViewFragment.class);
      if (localMessageViewFragment.h())
        localMessageViewFragment.i();
      if (localMessageViewFragment.g())
        localMessageViewFragment.a(false);
      localMessageViewFragment.C();
    }
    while (true)
    {
      u();
      return;
      if (a(DialerFragment.class))
      {
        DialerFragment localDialerFragment = (DialerFragment)b(DialerFragment.class);
        if (localDialerFragment.c())
          localDialerFragment.d();
      }
      else if (a(aa.class))
      {
        ((aa)b(aa.class)).C();
      }
    }
  }

  public final void h()
  {
    if (a(aa.class))
      return;
    c(aa.a());
  }

  protected final void i()
  {
    ao localao = l();
    String str = localao.l();
    if (str != null)
      this.a.setTitle(str);
    this.a.b(localao.n());
    super.i();
  }

  public final void j()
  {
    super.j();
    c(e.a(this));
  }

  public final void k()
  {
    super.k();
    if (this.d)
    {
      this.a.h();
      this.d = false;
    }
  }

  protected final void p()
  {
    super.p();
    this.a.y();
    MessageViewFragment localMessageViewFragment = (MessageViewFragment)b(MessageViewFragment.class);
    if ((localMessageViewFragment != null) && (localMessageViewFragment.g()))
      localMessageViewFragment.a(false);
  }

  protected final void q()
  {
    super.q();
    if ((!a(DialerFragment.class)) && (!a(j.class)))
    {
      if (this.a.o())
      {
        this.a.z();
        this.a.a(false);
      }
    }
    else
      return;
    this.a.a(1, TimeUnit.SECONDS);
  }

  public final void t()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.n
 * JD-Core Version:    0.6.2
 */