package com.enflick.android.TextNow.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.app.n;
import android.support.v4.app.s;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import com.enflick.android.TextNow.activities.phone.DialerFragment.DialerState;
import com.enflick.android.TextNow.activities.phone.p;
import com.enflick.android.TextNow.tasks.c;
import java.util.Stack;
import textnow.v.a;
import textnow.z.f;

public abstract class q
  implements g, p, v
{
  protected final MainActivity a;
  protected final n b;
  protected Stack<av> c;
  private boolean d = false;

  public q(MainActivity paramMainActivity)
  {
    this.a = paramMainActivity;
    this.b = paramMainActivity.getSupportFragmentManager();
    this.c = new Stack();
    if (a.a)
      n.a(true);
  }

  public abstract int a();

  public abstract void a(int paramInt);

  public final void a(int paramInt, textnow.z.h paramh, MessageViewFragment.MessageViewState paramMessageViewState)
  {
    b(paramInt, paramh, paramMessageViewState);
  }

  public void a(Intent paramIntent)
  {
  }

  protected final void a(s params)
  {
    new StringBuilder().append("commitFragmentTransaction: ").append(params).toString();
    if (this.a.x());
    while (params.c())
      return;
    params.b();
  }

  protected abstract void a(av paramav);

  public abstract void a(String paramString1, String paramString2);

  protected abstract void a(f paramf, DialerFragment.DialerState paramDialerState, boolean paramBoolean1, boolean paramBoolean2);

  public void a(textnow.z.h paramh)
  {
  }

  public abstract void a(boolean paramBoolean);

  public final boolean a(Menu paramMenu)
  {
    if (!com.enflick.android.TextNow.activities.phone.h.d())
    {
      MenuItem localMenuItem = paramMenu.findItem(2131559059);
      if (localMenuItem != null)
        localMenuItem.getIcon().setAlpha(153);
      paramMenu.removeItem(2131559049);
      paramMenu.removeItem(2131559055);
      paramMenu.removeItem(2131559083);
    }
    return false;
  }

  public boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 2131559060:
    }
    b(1, null, MessageViewFragment.MessageViewState.a);
    return true;
  }

  protected boolean a(c paramc, boolean paramBoolean)
  {
    if (!this.c.isEmpty())
      return ((av)this.c.peek()).a(paramc, paramBoolean);
    return false;
  }

  public boolean a(Class<?> paramClass)
  {
    return paramClass.isInstance(l());
  }

  public <T> T b(Class<T> paramClass)
  {
    av localav = l();
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

  protected abstract void b(int paramInt, textnow.z.h paramh, MessageViewFragment.MessageViewState paramMessageViewState);

  protected final void b(av paramav)
  {
    this.c.push(paramav);
  }

  public final void b(textnow.z.h paramh)
  {
    if (paramh != null)
    {
      b(2, paramh, MessageViewFragment.MessageViewState.a);
      return;
    }
    this.a.j();
  }

  public abstract void b(boolean paramBoolean);

  public abstract boolean b();

  protected abstract void c();

  public abstract void d();

  public abstract void e();

  public abstract void f();

  public abstract void g();

  protected void h()
  {
    this.a.supportInvalidateOptionsMenu();
  }

  public void i()
  {
    this.a.findViewById(2131558516).getViewTreeObserver().addOnGlobalLayoutListener(new r(this, (byte)0));
  }

  public void j()
  {
  }

  public void k()
  {
  }

  protected final av l()
  {
    if (this.c.empty())
      return null;
    return (av)this.c.peek();
  }

  protected final av m()
  {
    if (this.c.empty())
      return null;
    return (av)this.c.pop();
  }

  protected final textnow.z.h n()
  {
    MessageViewFragment localMessageViewFragment = (MessageViewFragment)b(MessageViewFragment.class);
    if (localMessageViewFragment != null)
      return localMessageViewFragment.f();
    return null;
  }

  public final void o()
  {
    c();
  }

  protected void p()
  {
  }

  protected void q()
  {
  }

  public final boolean r()
  {
    return this.d;
  }

  public String toString()
  {
    return getClass().getSimpleName();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.q
 * JD-Core Version:    0.6.2
 */