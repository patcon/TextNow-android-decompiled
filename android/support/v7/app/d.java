package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ak;
import android.support.v4.app.ce;
import android.support.v4.app.cf;
import android.support.v4.app.g;
import android.support.v4.app.v;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import textnow.i.b;

public class d extends v
  implements cf, g, a
{
  e a;

  public static void d()
  {
  }

  public static void e()
  {
  }

  public static void f()
  {
  }

  private boolean g()
  {
    Intent localIntent = ak.a(this);
    if (localIntent != null)
    {
      if (ak.a(this, localIntent))
      {
        ce localce = ce.a(this);
        localce.a(this);
        localce.a();
      }
      while (true)
      {
        try
        {
          android.support.v4.app.l.a(this);
          return true;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
          continue;
        }
        ak.b(this, localIntent);
      }
    }
    return false;
  }

  public final android.support.v4.app.f a()
  {
    return this.a.h();
  }

  public final textnow.i.a a(b paramb)
  {
    return this.a.a(paramb);
  }

  final void a(int paramInt)
  {
    super.setContentView(paramInt);
  }

  final void a(View paramView)
  {
    super.setContentView(paramView);
  }

  final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(paramView, paramLayoutParams);
  }

  final boolean a(int paramInt, Menu paramMenu)
  {
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  final boolean a(int paramInt, MenuItem paramMenuItem)
  {
    return super.onMenuItemSelected(paramInt, paramMenuItem);
  }

  final boolean a(int paramInt, View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.a.b(paramView, paramLayoutParams);
  }

  public final Intent b()
  {
    return ak.a(this);
  }

  final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addContentView(paramView, paramLayoutParams);
  }

  public final ActionBar c()
  {
    return this.a.b();
  }

  public MenuInflater getMenuInflater()
  {
    return this.a.c();
  }

  public void onBackPressed()
  {
    if (!this.a.g())
      super.onBackPressed();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.a.a(paramConfiguration);
  }

  public final void onContentChanged()
  {
    this.a.i();
  }

  protected void onCreate(Bundle paramBundle)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 16)
      localObject = new l(this);
    while (true)
    {
      this.a = ((e)localObject);
      super.onCreate(paramBundle);
      this.a.a(paramBundle);
      return;
      if (i >= 14)
        localObject = new j(this);
      else if (i >= 11)
        localObject = new i(this);
      else
        localObject = new f(this);
    }
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return this.a.a(paramInt, paramMenu);
  }

  public View onCreatePanelView(int paramInt)
  {
    if (paramInt == 0)
      return this.a.b(paramInt);
    return super.onCreatePanelView(paramInt);
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (this.a.a(paramInt, paramMenuItem))
      return true;
    ActionBar localActionBar = this.a.b();
    if ((paramMenuItem.getItemId() == 16908332) && (localActionBar != null) && ((0x4 & localActionBar.a()) != 0))
      return g();
    return false;
  }

  protected void onPostResume()
  {
    super.onPostResume();
    this.a.e();
  }

  protected boolean onPrepareOptionsPanel(View paramView, Menu paramMenu)
  {
    e locale = this.a;
    if (Build.VERSION.SDK_INT < 16)
      return locale.a.onPrepareOptionsMenu(paramMenu);
    return locale.a.onPrepareOptionsPanel(paramView, paramMenu);
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return this.a.a(paramInt, paramView, paramMenu);
  }

  protected void onStop()
  {
    super.onStop();
    this.a.d();
  }

  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    this.a.a(paramCharSequence);
  }

  public void setContentView(int paramInt)
  {
    this.a.a(paramInt);
  }

  public void setContentView(View paramView)
  {
    this.a.a(paramView);
  }

  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.a.a(paramView, paramLayoutParams);
  }

  public void supportInvalidateOptionsMenu()
  {
    if (Build.VERSION.SDK_INT >= 14)
      super.supportInvalidateOptionsMenu();
    this.a.f();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.d
 * JD-Core Version:    0.6.2
 */