package com.enflick.android.TextNow.activities;

import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import com.enflick.android.TextNow.activities.account.a;
import com.enflick.android.TextNow.activities.account.c;
import com.enflick.android.TextNow.activities.account.k;
import com.enflick.android.TextNow.activities.phone.DialerFragment;
import com.enflick.android.TextNow.activities.phone.DialerFragment.DialerState;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import textnow.q.b;

public final class s extends q
{
  private boolean d;

  public s(MainActivity paramMainActivity)
  {
    super(paramMainActivity);
  }

  private void c(av paramav)
  {
    new StringBuilder().append("Pushing parent fragment: ").append(paramav).toString();
    android.support.v4.app.s locals = this.b.a();
    locals.a(4099);
    if (l() != null)
    {
      while (!a(f.class))
      {
        av localav = m();
        new StringBuilder().append("Popping fragment ").append(localav).toString();
        locals.a(localav);
      }
      new StringBuilder().append("Detaching previous fragment ").append(l()).toString();
      locals.b(l());
    }
    b(paramav);
    locals.b(2131558797, paramav);
    a(locals);
    new StringBuilder().append("New back stack depth: ").append(this.c.size()).toString();
  }

  private void t()
  {
    android.support.v4.app.s locals = this.b.a();
    locals.a(4099);
    while (!a(f.class))
    {
      av localav = m();
      new StringBuilder().append("Popping fragment ").append(localav).toString();
      locals.a(localav);
    }
    locals.c(l());
    a(locals);
  }

  public final int a()
  {
    return 2130903151;
  }

  public final void a(int paramInt)
  {
    if (!a(a.class))
      c(a.a());
    switch (paramInt)
    {
    case 4:
    case 5:
    default:
      return;
    case 3:
      a(c.a());
      return;
    case 2:
      a(k.a());
      return;
    case 1:
      a(com.enflick.android.TextNow.activities.account.l.a());
      return;
    case 6:
    }
    a(com.enflick.android.TextNow.activities.account.e.a());
  }

  public final void a(Intent paramIntent)
  {
    this.d = paramIntent.getBooleanExtra("extra_from_notification", false);
  }

  protected final void a(av paramav)
  {
    new StringBuilder().append("Pushing child fragment ").append(paramav).toString();
    android.support.v4.app.s locals = this.b.a();
    locals.a(4099);
    new StringBuilder().append("Detaching previous fragment ").append(l()).toString();
    locals.b(l());
    b(paramav);
    locals.b(2131558797, paramav);
    a(locals);
    new StringBuilder().append("New back stack depth: ").append(this.c.size()).toString();
  }

  public final void a(String paramString1, String paramString2)
  {
    a(b.a(paramString1, paramString2));
  }

  protected final void a(textnow.z.f paramf, DialerFragment.DialerState paramDialerState, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2);
    try
    {
      a(DialerFragment.a(paramf, paramDialerState, paramBoolean1, true, this));
      return;
      if (paramf != null)
      {
        c(DialerFragment.a(paramf, paramDialerState, paramBoolean1, false, this));
        return;
      }
      a(DialerFragment.a(null, paramDialerState, paramBoolean1, false, this));
      return;
    }
    catch (com.enflick.android.TextNow.activities.phone.n localn)
    {
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (a(textnow.s.h.class))
      return;
    textnow.s.h localh = textnow.s.h.a(paramBoolean);
    if (paramBoolean)
    {
      a(localh);
      return;
    }
    c(localh);
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.a(paramMenuItem);
    case 2131559059:
    }
    if (com.enflick.android.TextNow.activities.phone.h.d())
      a(null, null, false, false);
    while (true)
    {
      return true;
      this.a.b(2131296448);
    }
  }

  protected final void b(int paramInt, textnow.z.h paramh, MessageViewFragment.MessageViewState paramMessageViewState)
  {
    if (paramh != null)
      new StringBuilder().append("open conversation with ").append(paramh.c()).toString();
    if (TextUtils.isEmpty(paramMessageViewState.e))
    {
      c(MessageViewFragment.a(paramInt, paramh, paramMessageViewState, this));
      return;
    }
    a(MessageViewFragment.a(paramInt, paramh, paramMessageViewState, this));
  }

  public final void b(boolean paramBoolean)
  {
    if (a(com.enflick.android.TextNow.activities.phone.e.class))
      return;
    c(com.enflick.android.TextNow.activities.phone.e.a(paramBoolean));
  }

  public final boolean b()
  {
    av localav1 = l();
    if ((localav1 != null) && (localav1.C()));
    while (true)
    {
      return true;
      try
      {
        if ((a(DialerFragment.class)) && (com.enflick.android.TextNow.activities.phone.h.c(com.enflick.android.TextNow.activities.phone.h.a().y())))
        {
          t();
          return true;
        }
      }
      catch (com.enflick.android.TextNow.activities.phone.n localn)
      {
        localn.printStackTrace();
        if (!a(f.class))
        {
          av localav2 = m();
          if (localav2 == null)
            continue;
          new StringBuilder().append("Popping element from back stack ").append(localav2).toString();
          android.support.v4.app.s locals = this.b.a();
          locals.a(4099);
          locals.a(localav2);
          av localav3 = l();
          new StringBuilder().append("Attaching previous fragment ").append(localav3).toString();
          locals.c(localav3);
          a(locals);
          new StringBuilder().append("New back stack depth: ").append(this.c.size()).toString();
          return true;
        }
      }
    }
    return false;
  }

  protected final void c()
  {
    f localf = (f)b(f.class);
    if (localf != null)
      localf.j();
  }

  public final void d()
  {
    if (a(ae.class))
      return;
    c(ae.c(0));
  }

  public final void e()
  {
    if (a(ah.class))
      return;
    c(ah.c(0));
  }

  public final void f()
  {
    if (l() == null)
    {
      c(f.a(this));
      return;
    }
    if (a(MessageViewFragment.class))
    {
      MessageViewFragment localMessageViewFragment = (MessageViewFragment)b(MessageViewFragment.class);
      if (localMessageViewFragment.i())
        localMessageViewFragment.j();
      if (localMessageViewFragment.h())
        localMessageViewFragment.a(false);
      localMessageViewFragment.e();
    }
    while (true)
    {
      t();
      return;
      if (a(DialerFragment.class))
      {
        DialerFragment localDialerFragment = (DialerFragment)b(DialerFragment.class);
        if (localDialerFragment.c())
          localDialerFragment.d();
      }
      else if (a(ag.class))
      {
        ((ag)b(ag.class)).e();
      }
    }
  }

  public final void g()
  {
    if (a(ag.class))
      return;
    c(ag.a());
  }

  protected final void h()
  {
    av localav = l();
    if ((localav != null) && (localav.isAdded()))
    {
      String str1 = localav.m();
      if (str1 != null)
        this.a.setTitle(str1);
      String str2 = localav.A();
      if ((str2 == null) || (str2.equals(str1)))
        break label74;
      this.a.a(str2);
    }
    while (true)
    {
      this.a.d(localav.o());
      super.h();
      return;
      label74: this.a.a("");
    }
  }

  public final void i()
  {
    super.i();
    c(f.a(this));
  }

  public final void j()
  {
    super.j();
    if (this.d)
    {
      this.a.j();
      this.d = false;
    }
  }

  protected final void p()
  {
    super.p();
    this.a.D();
    MessageViewFragment localMessageViewFragment = (MessageViewFragment)b(MessageViewFragment.class);
    if ((localMessageViewFragment != null) && (localMessageViewFragment.h()))
      localMessageViewFragment.a(false);
  }

  protected final void q()
  {
    super.q();
    if ((!a(DialerFragment.class)) && (!a(l.class)))
    {
      if (this.a.u())
      {
        this.a.E();
        this.a.e(false);
      }
    }
    else
      return;
    this.a.a(1, TimeUnit.SECONDS);
  }

  public final void s()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.s
 * JD-Core Version:    0.6.2
 */