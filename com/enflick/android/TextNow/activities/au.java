package com.enflick.android.TextNow.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.i;
import android.view.MenuItem;
import android.view.View;
import com.enflick.android.TextNow.views.AbsDrawerView;
import com.enflick.android.TextNow.views.a;

public abstract class au extends an
  implements a
{
  private DrawerLayout a;
  private AbsDrawerView b;
  private i c;

  public final void G()
  {
    if (this.b != null)
      this.b.a();
  }

  public final boolean H()
  {
    if (this.a != null)
      return this.a.f(this.b);
    return false;
  }

  public final void I()
  {
    if (this.a != null)
      this.a.e(this.b);
  }

  protected final void a(int paramInt1, int paramInt2)
  {
    this.a = ((DrawerLayout)findViewById(2131558799));
    this.a.a(2130837812, 8388611);
    this.c = new i(this, this.a, 2131296713, 2131296714)
    {
      public final void a(View paramAnonymousView)
      {
        ((AbsDrawerView)paramAnonymousView).c();
      }

      public final void b(View paramAnonymousView)
      {
        ((AbsDrawerView)paramAnonymousView).b();
      }
    };
    this.a.a(this.c);
    this.b = ((AbsDrawerView)findViewById(2131558803));
    this.b.a(this);
  }

  public final void d(boolean paramBoolean)
  {
    boolean bool = true;
    this.g = paramBoolean;
    ActionBar localActionBar = b();
    if (localActionBar != null)
    {
      localActionBar.a(bool);
      localActionBar.b(bool);
      localActionBar.c(bool);
    }
    i locali;
    if (this.c != null)
    {
      locali = this.c;
      if (paramBoolean)
        break label55;
    }
    while (true)
    {
      locali.a(bool);
      return;
      label55: bool = false;
    }
  }

  public void g()
  {
    b().a(getTitle());
    supportInvalidateOptionsMenu();
  }

  public void h()
  {
    b().a(2131296418);
    supportInvalidateOptionsMenu();
  }

  public int m()
  {
    return -1;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.c != null)
      this.c.b();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.a != null)
      this.a.removeAllViews();
    if (this.b != null)
      this.b.removeAllViews();
    this.b = null;
    this.a = null;
    this.c = null;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if ((this.c != null) && (this.c.a(paramMenuItem)))
      return true;
    return super.onOptionsItemSelected(paramMenuItem);
  }

  public void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    this.c.a();
  }

  public final void s()
  {
    if (this.b != null)
      this.b.a(m());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.au
 * JD-Core Version:    0.6.2
 */