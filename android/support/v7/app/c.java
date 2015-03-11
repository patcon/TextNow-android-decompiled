package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import textnow.g.l;
import textnow.k.e;

abstract class c
{
  final b a;
  boolean b;
  boolean c;
  boolean d;
  boolean e;
  final textnow.i.a f = new textnow.i.a()
  {
    public final boolean a(int paramAnonymousInt, Menu paramAnonymousMenu)
    {
      return c.this.a.a(paramAnonymousInt, paramAnonymousMenu);
    }

    public final boolean a(int paramAnonymousInt, MenuItem paramAnonymousMenuItem)
    {
      return c.this.a.onMenuItemSelected(paramAnonymousInt, paramAnonymousMenuItem);
    }

    public final boolean a(int paramAnonymousInt, View paramAnonymousView, Menu paramAnonymousMenu)
    {
      return c.this.a.a(paramAnonymousInt, paramAnonymousView, paramAnonymousMenu);
    }

    public final void b(int paramAnonymousInt, Menu paramAnonymousMenu)
    {
      c.this.a.onPanelClosed(paramAnonymousInt, paramAnonymousMenu);
    }

    public final boolean c(int paramAnonymousInt, Menu paramAnonymousMenu)
    {
      return c.this.a.onMenuOpened(paramAnonymousInt, paramAnonymousMenu);
    }
  };
  private ActionBar g;
  private MenuInflater h;
  private textnow.i.a i;
  private boolean j;

  c(b paramb)
  {
    this.a = paramb;
    this.i = this.f;
  }

  abstract ActionBar a();

  abstract View a(String paramString, AttributeSet paramAttributeSet);

  abstract textnow.l.a a(textnow.l.b paramb);

  abstract void a(int paramInt);

  abstract void a(int paramInt, Menu paramMenu);

  abstract void a(Configuration paramConfiguration);

  void a(Bundle paramBundle)
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(l.bz);
    if (!localTypedArray.hasValue(l.bB))
    {
      localTypedArray.recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    this.b = localTypedArray.getBoolean(l.bB, false);
    this.c = localTypedArray.getBoolean(l.bC, false);
    this.d = localTypedArray.getBoolean(l.bD, false);
    this.e = localTypedArray.getBoolean(l.bA, false);
    localTypedArray.recycle();
  }

  abstract void a(View paramView);

  abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  abstract void a(CharSequence paramCharSequence);

  boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  abstract boolean a(int paramInt, View paramView, Menu paramMenu);

  abstract boolean a(KeyEvent paramKeyEvent);

  final ActionBar b()
  {
    if ((this.b) && (this.g == null))
      this.g = a();
    return this.g;
  }

  abstract View b(int paramInt);

  abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  abstract boolean b(int paramInt, Menu paramMenu);

  final MenuInflater c()
  {
    if (this.h == null)
      this.h = new e(i());
    return this.h;
  }

  abstract boolean c(int paramInt, Menu paramMenu);

  abstract void d();

  abstract void e();

  abstract void f();

  abstract boolean g();

  abstract int h();

  protected final Context i()
  {
    ActionBar localActionBar = b();
    Object localObject = null;
    if (localActionBar != null)
      localObject = localActionBar.c();
    if (localObject == null)
      localObject = this.a;
    return localObject;
  }

  final textnow.i.a j()
  {
    return this.i;
  }

  final void k()
  {
    this.j = true;
  }

  final boolean l()
  {
    return this.j;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.c
 * JD-Core Version:    0.6.2
 */