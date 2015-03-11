package com.enflick.android.TextNow.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.s;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.enflick.android.TextNow.activities.account.a;
import com.enflick.android.TextNow.activities.account.l;
import com.enflick.android.TextNow.activities.phone.DialerFragment;
import com.enflick.android.TextNow.activities.phone.DialerFragment.DialerState;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.MarkMessagesReadTask;
import java.util.ArrayList;
import java.util.Stack;
import textnow.q.b;
import textnow.z.u;

public final class t extends q
{
  private Stack<av> d = new Stack();

  public t(MainActivity paramMainActivity)
  {
    super(paramMainActivity);
  }

  private <T> T c(Class<T> paramClass)
  {
    av localav = t();
    try
    {
      if (paramClass.isInstance(localav))
      {
        Object localObject = paramClass.cast(localav);
        return localObject;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private void c(av paramav)
  {
    new StringBuilder().append("Pushing parent fragment ").append(paramav).toString();
    s locals = this.b.a();
    locals.a(4099);
    while ((!this.d.isEmpty()) && (!a(MessageViewFragment.class)))
    {
      av localav2 = u();
      locals.a(localav2);
      new StringBuilder().append("Popping fragment from stack two ").append(localav2).toString();
    }
    if (l() != null)
    {
      while (!a(f.class))
      {
        av localav1 = m();
        locals.a(localav1);
        new StringBuilder().append("Popping fragment from stack one ").append(localav1).toString();
      }
      new StringBuilder().append("Detaching previous fragment ").append(l()).toString();
      locals.b(l());
    }
    b(paramav);
    locals.b(2131558801, paramav);
    a(locals);
    new StringBuilder().append("New back stack depth: ").append(this.c.size()).toString();
  }

  private void c(textnow.z.h paramh)
  {
    if ((paramh != null) && (n() != null) && (paramh.a() == n().a()) && (paramh.i() > 0))
      new MarkMessagesReadTask(paramh.c()).b(this.a);
  }

  private av t()
  {
    if (this.d.isEmpty())
      return null;
    return (av)this.d.peek();
  }

  private av u()
  {
    if (this.d.isEmpty())
      return null;
    return (av)this.d.pop();
  }

  private void v()
  {
    s locals = this.b.a();
    locals.a(4099);
    while (!a(f.class))
    {
      av localav2 = m();
      new StringBuilder().append("Popping fragment ").append(localav2).toString();
      locals.a(localav2);
    }
    locals.c(l());
    while (!a(MessageViewFragment.class))
    {
      av localav1 = u();
      new StringBuilder().append("Popping fragment ").append(localav1).toString();
      locals.a(localav1);
    }
    locals.c(t());
    a(locals);
  }

  private void w()
  {
    b(-1, null, MessageViewFragment.MessageViewState.a);
  }

  public final int a()
  {
    return 2130903152;
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
      a(new k());
      return;
    case 3:
      a(com.enflick.android.TextNow.activities.account.c.a());
      return;
    case 2:
      a(com.enflick.android.TextNow.activities.account.k.a());
      return;
    case 1:
      a(l.a());
      return;
    case 6:
    }
    a(com.enflick.android.TextNow.activities.account.e.a());
  }

  protected final void a(av paramav)
  {
    new StringBuilder().append("Pushing child fragment ").append(paramav).toString();
    s locals = this.b.a();
    locals.a(4099);
    if (!this.d.isEmpty())
    {
      while ((!this.d.isEmpty()) && (!a(MessageViewFragment.class)))
      {
        av localav2 = u();
        new StringBuilder().append("Popping fragment from stack two ").append(localav2).toString();
        locals.a(localav2);
      }
      if (!(paramav instanceof MessageViewFragment))
        break label192;
      av localav1 = u();
      new StringBuilder().append("Popping message fragment from stack two ").append(localav1).toString();
      locals.a(localav1);
    }
    while (true)
    {
      this.d.push(paramav);
      locals.b(2131558802, paramav);
      a(locals);
      new StringBuilder().append("New back stack depth: ").append(this.d.size()).toString();
      return;
      label192: new StringBuilder().append("Detaching message fragment from stack two ").append(this.d.peek()).toString();
      locals.b((Fragment)this.d.peek());
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    a(b.a(paramString1, paramString2));
  }

  public final void a(textnow.z.f paramf, DialerFragment.DialerState paramDialerState, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      if ((!a(f.class)) && (!a(com.enflick.android.TextNow.activities.phone.e.class)))
        b();
      a(DialerFragment.a(paramf, paramDialerState, paramBoolean1, paramBoolean2, this));
      return;
    }
    catch (com.enflick.android.TextNow.activities.phone.n localn)
    {
    }
  }

  public final void a(textnow.z.h paramh)
  {
    f localf = (f)b(f.class);
    if (localf != null)
      localf.a(paramh);
  }

  public final void a(boolean paramBoolean)
  {
    if (a(textnow.s.h.class))
      return;
    c(textnow.s.h.a(false));
    a(new k());
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    case 2131559060:
    default:
      return super.a(paramMenuItem);
    case 2131559061:
      new GetUserInfoTask(new u(this.a).b()).b(this.a);
      new GetNewMessagesTask().b(this.a);
      MessageViewFragment localMessageViewFragment2 = (MessageViewFragment)b(MessageViewFragment.class);
      if ((localMessageViewFragment2 != null) && (localMessageViewFragment2.g() != null))
        localMessageViewFragment2.t();
      return true;
    case 2131559059:
    }
    if (!com.enflick.android.TextNow.activities.phone.h.d())
    {
      this.a.b(2131296448);
      return true;
    }
    MessageViewFragment localMessageViewFragment1 = (MessageViewFragment)b(MessageViewFragment.class);
    if (localMessageViewFragment1 != null)
    {
      textnow.z.f localf = localMessageViewFragment1.g();
      if ((localf != null) && (localf.j()))
        a(localf, null, false, false);
    }
    while (true)
    {
      return true;
      a(null, null, false, false);
      continue;
      a(null, null, false, false);
    }
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    if ((!this.d.isEmpty()) && (((av)this.d.peek()).a(paramc, paramBoolean)))
      return true;
    return super.a(paramc, paramBoolean);
  }

  public final boolean a(Class<?> paramClass)
  {
    return (paramClass.isInstance(t())) || (super.a(paramClass));
  }

  public final <T> T b(Class<T> paramClass)
  {
    Object localObject = c(paramClass);
    if (localObject != null)
      return localObject;
    return super.b(paramClass);
  }

  protected final void b(int paramInt, textnow.z.h paramh, MessageViewFragment.MessageViewState paramMessageViewState)
  {
    if (!a(f.class))
      b();
    f localf = (f)b(f.class);
    if (paramh != null)
    {
      new StringBuilder().append(this).append(" open conversation with ").append(paramh.c()).toString();
      c(paramh);
    }
    while (true)
    {
      a(MessageViewFragment.a(paramInt, paramh, paramMessageViewState, this));
      if ((paramh != null) && (localf != null))
        localf.a(paramh);
      return;
      if (localf != null)
        localf.d();
      c(null);
    }
  }

  public final void b(boolean paramBoolean)
  {
    if (a(com.enflick.android.TextNow.activities.phone.e.class))
      return;
    c(com.enflick.android.TextNow.activities.phone.e.a(paramBoolean));
    a(new k());
  }

  public final boolean b()
  {
    av localav1 = l();
    if ((localav1 != null) && (localav1.C()));
    av localav2;
    do
    {
      return true;
      if (!a(f.class))
      {
        v();
        return true;
      }
      if ((this.d.isEmpty()) || (a(MessageViewFragment.class)))
        break;
      localav2 = u();
    }
    while (localav2 == null);
    s locals = this.b.a();
    locals.a(4099);
    locals.a(localav2);
    av localav3 = t();
    if (localav3 != null)
      locals.c(localav3);
    a(locals);
    return true;
    return false;
  }

  protected final void c()
  {
    f localf = (f)b(f.class);
    int i;
    if (localf != null)
    {
      av localav = t();
      if ((localav instanceof MessageViewFragment))
      {
        textnow.z.f localf1 = ((MessageViewFragment)localav).g();
        if ((localf1 == null) || (!localf.k().contains(localf1.a())))
        {
          i = 1;
          localf.j();
        }
      }
    }
    while (true)
    {
      if (i == 0)
        w();
      return;
      i = 0;
      break;
      i = 0;
      break;
      i = 0;
    }
  }

  public final void d()
  {
    if (a(ae.class))
      return;
    c(ae.c(0));
    a(new k());
  }

  public final void e()
  {
    if (a(ah.class))
      return;
    c(ah.c(0));
    a(new k());
  }

  public final void f()
  {
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
      v();
      return;
      if (a(ag.class))
        ((ag)b(ag.class)).e();
    }
  }

  public final void g()
  {
    if (a(ag.class))
      return;
    c(ag.a());
    a(new k());
  }

  protected final void h()
  {
    av localav2;
    if (!this.d.isEmpty())
    {
      localav2 = (av)this.d.peek();
      if ((localav2 == null) || (!localav2.isAdded()));
    }
    for (String str1 = localav2.m(); ; str1 = null)
    {
      av localav1 = l();
      label94: View localView;
      if (str1 != null)
      {
        this.a.setTitle(str1);
        String str2 = null;
        if (localav1 != null)
        {
          boolean bool = localav1.isAdded();
          str2 = null;
          if (bool)
            str2 = localav1.A();
        }
        if (str2 == null)
          break label199;
        this.a.a(str2);
        localView = this.a.findViewById(2131558800);
        if (localView != null)
        {
          if (b(f.class) == null)
            break label212;
          this.a.E();
          localView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0F));
        }
      }
      while (true)
      {
        this.a.d(false);
        super.h();
        return;
        if ((localav1 != null) && (localav1.isAdded()))
          str1 = localav1.m();
        if (str1 != null)
        {
          this.a.setTitle(str1);
          break;
        }
        this.a.setTitle(2131296418);
        break;
        label199: this.a.a("");
        break label94;
        label212: this.a.D();
        localView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.5F));
      }
    }
  }

  public final void i()
  {
    super.i();
    c(f.a(this));
    w();
  }

  public final void k()
  {
    f localf = (f)b(f.class);
    if (localf != null)
    {
      localf.d();
      w();
    }
  }

  public final void s()
  {
    f localf = (f)b(f.class);
    if (localf != null)
      localf.c_();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.t
 * JD-Core Version:    0.6.2
 */