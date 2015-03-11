package com.enflick.android.TextNow.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.app.ac;
import android.support.v4.app.y;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import com.enflick.android.TextNow.activities.phone.DialerFragment.DialerState;
import com.enflick.android.TextNow.tasks.c;
import java.util.Stack;
import textnow.k.w;
import textnow.q.a;

public abstract class l
  implements f, com.enflick.android.TextNow.activities.phone.l, q
{
  protected final MainActivity a;
  protected final y b;
  protected Stack<ao> c;
  private boolean d = false;

  public l(MainActivity paramMainActivity)
  {
    this.a = paramMainActivity;
    this.b = paramMainActivity.getSupportFragmentManager();
    this.c = new Stack();
    if (a.a)
      y.a(true);
  }

  public abstract int a();

  public abstract void a(int paramInt);

  public final void a(int paramInt, textnow.u.f paramf, MessageViewFragment.MessageViewState paramMessageViewState, w paramw, String paramString)
  {
    b(paramInt, paramf, paramMessageViewState, paramw, paramString);
  }

  public void a(Intent paramIntent)
  {
  }

  protected final void a(ac paramac)
  {
    new StringBuilder().append("commitFragmentTransaction: ").append(paramac).toString();
    if (this.a.u());
    while (paramac.c())
      return;
    paramac.b();
    this.b.b();
  }

  protected abstract void a(ao paramao);

  protected abstract void a(String paramString1, String paramString2);

  protected abstract void a(textnow.u.d paramd, DialerFragment.DialerState paramDialerState, boolean paramBoolean1, boolean paramBoolean2);

  public void a(textnow.u.f paramf)
  {
  }

  public final boolean a(Menu paramMenu)
  {
    if (!com.enflick.android.TextNow.activities.phone.d.d())
    {
      MenuItem localMenuItem = paramMenu.findItem(2131165754);
      if (localMenuItem != null)
        localMenuItem.getIcon().setAlpha(153);
      paramMenu.removeItem(2131165787);
      paramMenu.removeItem(2131165763);
      paramMenu.removeItem(2131165779);
    }
    return false;
  }

  public boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 2131165755:
    }
    a(1, null, MessageViewFragment.MessageViewState.a, null, null);
    return true;
  }

  protected boolean a(c paramc, boolean paramBoolean)
  {
    if (!this.c.isEmpty())
      return ((ao)this.c.peek()).a(paramc, paramBoolean);
    return false;
  }

  public boolean a(Class<?> paramClass)
  {
    return paramClass.isInstance(l());
  }

  public <T> T b(Class<T> paramClass)
  {
    ao localao = l();
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

  protected abstract void b(int paramInt, textnow.u.f paramf, MessageViewFragment.MessageViewState paramMessageViewState, w paramw, String paramString);

  protected final void b(ao paramao)
  {
    this.c.push(paramao);
  }

  public abstract void b(String paramString1, String paramString2);

  public final void b(textnow.u.f paramf)
  {
    if (paramf != null)
    {
      a(2, paramf, MessageViewFragment.MessageViewState.a, null, null);
      return;
    }
    this.a.h();
  }

  public abstract boolean b();

  protected abstract void c();

  public abstract void d();

  public abstract void e();

  public abstract void f();

  public abstract void g();

  public abstract void h();

  protected void i()
  {
    this.a.supportInvalidateOptionsMenu();
  }

  public void j()
  {
    this.a.findViewById(2131165286).getViewTreeObserver().addOnGlobalLayoutListener(new m(this, (byte)0));
  }

  public void k()
  {
  }

  protected final ao l()
  {
    if (this.c.empty())
      return null;
    return (ao)this.c.peek();
  }

  protected final ao m()
  {
    if (this.c.empty())
      return null;
    return (ao)this.c.pop();
  }

  protected final textnow.u.f n()
  {
    MessageViewFragment localMessageViewFragment = (MessageViewFragment)b(MessageViewFragment.class);
    if (localMessageViewFragment != null)
      return localMessageViewFragment.e();
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

  public void s()
  {
  }

  public String toString()
  {
    return getClass().getSimpleName();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.l
 * JD-Core Version:    0.6.2
 */