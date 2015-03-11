package android.support.v7.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.cm;
import android.support.v4.app.cn;
import android.support.v4.app.k;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class b extends k
  implements cn, q
{
  private c a;

  public static void c()
  {
  }

  public static void d()
  {
  }

  public static void f()
  {
  }

  private boolean g()
  {
    Intent localIntent = ad.a(this);
    if (localIntent != null)
    {
      if (ad.a(this, localIntent))
      {
        cm localcm = cm.a(this);
        localcm.a(this);
        localcm.a();
      }
      while (true)
      {
        try
        {
          android.support.v4.app.a.a(this);
          return true;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
          continue;
        }
        ad.b(this, localIntent);
      }
    }
    return false;
  }

  private c h()
  {
    if (this.a == null)
      if (Build.VERSION.SDK_INT < 11)
        break label34;
    label34: for (Object localObject = new h(this); ; localObject = new ActionBarActivityDelegateBase(this))
    {
      this.a = ((c)localObject);
      return this.a;
    }
  }

  public final Intent a()
  {
    return ad.a(this);
  }

  public final textnow.l.a a(textnow.l.b paramb)
  {
    return h().a(paramb);
  }

  final void a(View paramView)
  {
    super.setContentView(paramView);
  }

  final boolean a(int paramInt, Menu paramMenu)
  {
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  final boolean a(int paramInt, View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    h().b(paramView, paramLayoutParams);
  }

  public final ActionBar b()
  {
    return h().b();
  }

  final void b(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }

  final boolean c(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }

  public final j e()
  {
    return new d(h(), (byte)0);
  }

  public MenuInflater getMenuInflater()
  {
    return h().c();
  }

  public void invalidateOptionsMenu()
  {
    h().f();
  }

  public void onBackPressed()
  {
    if (!h().g())
      super.onBackPressed();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    h().a(paramConfiguration);
  }

  public final void onContentChanged()
  {
    h();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    h().a(paramBundle);
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return h().c(paramInt, paramMenu);
  }

  public View onCreatePanelView(int paramInt)
  {
    if (paramInt == 0)
      return h().b(paramInt);
    return super.onCreatePanelView(paramInt);
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = super.onCreateView(paramString, paramContext, paramAttributeSet);
    if (localView != null)
      return localView;
    return h().a(paramString, paramAttributeSet);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    h().k();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (super.onKeyDown(paramInt, paramKeyEvent))
      return true;
    return h().a(paramInt, paramKeyEvent);
  }

  public boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    return h().a(paramKeyEvent);
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true;
    ActionBar localActionBar = h().b();
    if ((paramMenuItem.getItemId() == 16908332) && (localActionBar != null) && ((0x4 & localActionBar.a()) != 0))
      return g();
    return false;
  }

  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return h().b(paramInt, paramMenu);
  }

  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    h().a(paramInt, paramMenu);
  }

  protected void onPostResume()
  {
    super.onPostResume();
    h().e();
  }

  protected boolean onPrepareOptionsPanel(View paramView, Menu paramMenu)
  {
    c localc = h();
    if (Build.VERSION.SDK_INT < 16)
      return localc.a.onPrepareOptionsMenu(paramMenu);
    return localc.a.onPrepareOptionsPanel(paramView, paramMenu);
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return h().a(paramInt, paramView, paramMenu);
  }

  protected void onStop()
  {
    super.onStop();
    h().d();
  }

  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    h().a(paramCharSequence);
  }

  public void setContentView(int paramInt)
  {
    h().a(paramInt);
  }

  public void setContentView(View paramView)
  {
    h().a(paramView);
  }

  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    h().a(paramView, paramLayoutParams);
  }

  public void supportInvalidateOptionsMenu()
  {
    h().f();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.b
 * JD-Core Version:    0.6.2
 */