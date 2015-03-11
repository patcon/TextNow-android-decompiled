package com.enflick.android.TextNow.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.enflick.android.TextNow.activities.account.a;
import com.enflick.android.TextNow.activities.account.k;
import com.enflick.android.TextNow.activities.phone.DialerFragment;
import com.enflick.android.TextNow.activities.phone.DialerFragment.DialerState;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.MarkMessagesReadTask;
import java.util.Stack;
import textnow.k.w;
import textnow.l.b;
import textnow.n.h;
import textnow.u.f;
import textnow.u.r;

public final class o extends l
{
  private Stack<ao> d = new Stack();

  public o(MainActivity paramMainActivity)
  {
    super(paramMainActivity);
  }

  private <T> T c(Class<T> paramClass)
  {
    ao localao = u();
    try
    {
      if (paramClass.isInstance(localao))
      {
        Object localObject = paramClass.cast(localao);
        return localObject;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private void c(ao paramao)
  {
    new StringBuilder().append("Pushing parent fragment ").append(paramao).toString();
    ac localac = this.b.a();
    localac.a(4099);
    while ((!this.d.isEmpty()) && (!a(MessageViewFragment.class)))
    {
      ao localao2 = v();
      localac.a(localao2);
      new StringBuilder().append("Popping fragment from stack two ").append(localao2).toString();
    }
    if (l() != null)
    {
      while (!a(e.class))
      {
        ao localao1 = m();
        localac.a(localao1);
        new StringBuilder().append("Popping fragment from stack one ").append(localao1).toString();
      }
      new StringBuilder().append("Detaching previous fragment ").append(l()).toString();
      localac.b(l());
    }
    b(paramao);
    localac.a(2131165525, paramao);
    a(localac);
    new StringBuilder().append("New back stack depth: ").append(this.c.size()).toString();
    i();
  }

  private void c(f paramf)
  {
    if ((paramf != null) && (n() != null) && (paramf.a() == n().a()) && (paramf.i() > 0))
      new MarkMessagesReadTask(paramf.c()).b(this.a);
  }

  private ao u()
  {
    if (this.d.isEmpty())
      return null;
    return (ao)this.d.peek();
  }

  private ao v()
  {
    if (this.d.isEmpty())
      return null;
    return (ao)this.d.pop();
  }

  private void w()
  {
    ac localac = this.b.a();
    localac.a(4099);
    while (!a(e.class))
    {
      ao localao2 = m();
      new StringBuilder().append("Popping fragment ").append(localao2).toString();
      localac.a(localao2);
    }
    localac.c(l());
    while (!a(MessageViewFragment.class))
    {
      ao localao1 = v();
      new StringBuilder().append("Popping fragment ").append(localao1).toString();
      localac.a(localao1);
    }
    localac.c(u());
    a(localac);
    i();
  }

  private void x()
  {
    b(-1, null, MessageViewFragment.MessageViewState.a, null, null);
  }

  public final int a()
  {
    return 2130903135;
  }

  public final void a(int paramInt)
  {
    if (!a(a.class))
      c(a.a());
    switch (paramInt)
    {
    default:
      a(new i());
      return;
    case 3:
      a(com.enflick.android.TextNow.activities.account.c.a());
      return;
    case 2:
      a(com.enflick.android.TextNow.activities.account.j.a());
      return;
    case 1:
    }
    a(k.a());
  }

  protected final void a(ao paramao)
  {
    new StringBuilder().append("Pushing child fragment ").append(paramao).toString();
    ac localac = this.b.a();
    localac.a(4099);
    if (!this.d.isEmpty())
    {
      while ((!this.d.isEmpty()) && (!a(MessageViewFragment.class)))
      {
        ao localao2 = v();
        new StringBuilder().append("Popping fragment from stack two ").append(localao2).toString();
        localac.a(localao2);
      }
      if (!(paramao instanceof MessageViewFragment))
        break label196;
      ao localao1 = v();
      new StringBuilder().append("Popping message fragment from stack two ").append(localao1).toString();
      localac.a(localao1);
    }
    while (true)
    {
      this.d.push(paramao);
      localac.a(2131165526, paramao);
      a(localac);
      new StringBuilder().append("New back stack depth: ").append(this.d.size()).toString();
      i();
      return;
      label196: new StringBuilder().append("Detaching message fragment from stack two ").append(this.d.peek()).toString();
      localac.b((Fragment)this.d.peek());
    }
  }

  protected final void a(String paramString1, String paramString2)
  {
    e locale = (e)b(e.class);
    if (locale != null)
      locale.d();
    new StringBuilder().append("send sms to: ").append(paramString1).toString();
    a(MessageViewFragment.a(paramString1, paramString2, this));
  }

  public final void a(textnow.u.d paramd, DialerFragment.DialerState paramDialerState, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      if (!a(e.class))
        b();
      a(DialerFragment.a(paramd, paramDialerState, paramBoolean1, paramBoolean2, this));
      return;
    }
    catch (com.enflick.android.TextNow.activities.phone.j localj)
    {
    }
  }

  public final void a(f paramf)
  {
    e locale = (e)b(e.class);
    if (locale != null)
      locale.a(paramf);
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    case 2131165755:
    default:
      return super.a(paramMenuItem);
    case 2131165756:
      new GetUserInfoTask(new r(this.a).b()).b(this.a);
      new GetNewMessagesTask().b(this.a);
      MessageViewFragment localMessageViewFragment2 = (MessageViewFragment)b(MessageViewFragment.class);
      if ((localMessageViewFragment2 != null) && (localMessageViewFragment2.f() != null))
        localMessageViewFragment2.s();
      return true;
    case 2131165754:
    }
    if (!com.enflick.android.TextNow.activities.phone.d.d())
    {
      this.a.c(2131493041);
      return true;
    }
    MessageViewFragment localMessageViewFragment1 = (MessageViewFragment)b(MessageViewFragment.class);
    if (localMessageViewFragment1 != null)
    {
      textnow.u.d locald = localMessageViewFragment1.f();
      if ((locald != null) && (locald.j()))
        a(locald, null, false, false);
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
    if ((!this.d.isEmpty()) && (((ao)this.d.peek()).a(paramc, paramBoolean)))
      return true;
    return super.a(paramc, paramBoolean);
  }

  public final boolean a(Class<?> paramClass)
  {
    return (paramClass.isInstance(u())) || (super.a(paramClass));
  }

  public final <T> T b(Class<T> paramClass)
  {
    Object localObject = c(paramClass);
    if (localObject != null)
      return localObject;
    return super.b(paramClass);
  }

  protected final void b(int paramInt, f paramf, MessageViewFragment.MessageViewState paramMessageViewState, w paramw, String paramString)
  {
    if (!a(e.class))
      b();
    e locale = (e)b(e.class);
    if (paramf != null)
    {
      new StringBuilder().append(this).append(" open conversation with ").append(paramf.c()).toString();
      c(paramf);
    }
    while (true)
    {
      MessageViewFragment localMessageViewFragment = MessageViewFragment.a(paramInt, paramf, paramMessageViewState, this, paramw, paramString);
      a(localMessageViewFragment);
      if ((paramf != null) && (locale != null))
        locale.a(localMessageViewFragment.e());
      return;
      if (locale != null)
        locale.d();
      c(null);
    }
  }

  public final void b(String paramString1, String paramString2)
  {
    a(b.a(paramString1, paramString2));
  }

  public final boolean b()
  {
    ao localao1 = l();
    if ((localao1 != null) && (localao1.B()));
    ao localao2;
    do
    {
      return true;
      if (!a(e.class))
      {
        w();
        return true;
      }
      if ((this.d.isEmpty()) || (a(MessageViewFragment.class)))
        break;
      localao2 = v();
    }
    while (localao2 == null);
    ac localac = this.b.a();
    localac.a(4099);
    localac.a(localao2);
    ao localao3 = u();
    if (localao3 != null)
      localac.c(localao3);
    a(localac);
    i();
    return true;
    return false;
  }

  protected final void c()
  {
    e locale = (e)b(e.class);
    if (locale != null)
      locale.j();
    x();
  }

  public final void d()
  {
    if (a(y.class))
      return;
    c(y.c(0));
    a(new i());
  }

  public final void e()
  {
    if (a(ab.class))
      return;
    c(ab.c(0));
    a(new i());
  }

  public final void f()
  {
    if (a(h.class))
      return;
    c(new h());
    a(new i());
  }

  public final void g()
  {
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
      w();
      return;
      if (a(aa.class))
        ((aa)b(aa.class)).C();
    }
  }

  public final void h()
  {
    if (a(aa.class))
      return;
    c(aa.a());
    a(new i());
  }

  protected final void i()
  {
    boolean bool = this.d.isEmpty();
    String str1 = null;
    if (!bool)
      str1 = ((ao)this.d.peek()).l();
    View localView;
    if (str1 != null)
    {
      this.a.setTitle(str1);
      localView = this.a.findViewById(2131165524);
      if (localView != null)
      {
        if (b(e.class) == null)
          break label137;
        this.a.z();
        localView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0F));
      }
    }
    while (true)
    {
      this.a.b(false);
      super.i();
      return;
      String str2 = l().l();
      if (str2 != null)
      {
        this.a.setTitle(str2);
        break;
      }
      this.a.setTitle(2131493012);
      break;
      label137: this.a.y();
      localView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.5F));
    }
  }

  public final void j()
  {
    super.j();
    c(e.a(this));
    x();
  }

  public final void s()
  {
    e locale = (e)b(e.class);
    if (locale != null)
    {
      locale.d();
      x();
    }
  }

  public final void t()
  {
    e locale = (e)b(e.class);
    if (locale != null)
      locale.e();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.o
 * JD-Core Version:    0.6.2
 */