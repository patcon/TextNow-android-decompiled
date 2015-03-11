package com.enflick.android.TextNow.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import com.enflick.android.TextNow.views.AbsDrawerView;

public abstract class an extends ah
  implements com.enflick.android.TextNow.views.a
{
  private DrawerLayout b;
  private AbsDrawerView c;
  private android.support.v4.app.a d;

  public final boolean B()
  {
    if (this.b != null)
      return this.b.f(this.c);
    return false;
  }

  public final void C()
  {
    if (this.b != null)
      this.b.e(this.c);
  }

  protected final void a(int paramInt1, int paramInt2)
  {
    this.b = ((DrawerLayout)findViewById(2131165521));
    this.b.a(2130837857, 8388611);
    this.d = new android.support.v4.app.a(this, this.b, 2130837894, 2131493310, 2131493311)
    {
      public final void a(View paramAnonymousView)
      {
        an.this.c().a(2131493012);
        an.this.supportInvalidateOptionsMenu();
        ((AbsDrawerView)paramAnonymousView).b();
      }

      public final void b(View paramAnonymousView)
      {
        an.this.c().a(an.this.getTitle());
        an.this.supportInvalidateOptionsMenu();
        AbsDrawerView.a();
      }
    };
    this.b.a(this.d);
    this.c = ((AbsDrawerView)findViewById(2131165527));
    this.c.a(this);
  }

  public final void b(boolean paramBoolean)
  {
    boolean bool = true;
    this.g = paramBoolean;
    ActionBar localActionBar = c();
    if (localActionBar != null)
    {
      localActionBar.a(bool);
      localActionBar.b(bool);
      localActionBar.c(bool);
    }
    android.support.v4.app.a locala;
    if (this.d != null)
    {
      locala = this.d;
      if (paramBoolean)
        break label55;
    }
    while (true)
    {
      locala.a(bool);
      return;
      label55: bool = false;
    }
  }

  public final void f(int paramInt)
  {
    if (this.c != null)
      this.c.a(2131165539);
  }

  public int k()
  {
    return -1;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.d != null)
      this.d.b();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.c = null;
    this.b = null;
    this.d = null;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if ((this.d != null) && (this.d.a(paramMenuItem)))
      return true;
    return super.onOptionsItemSelected(paramMenuItem);
  }

  public void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    this.d.a();
  }

  public final void t()
  {
    if (this.c != null)
      this.c.a(k());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.an
 * JD-Core Version:    0.6.2
 */