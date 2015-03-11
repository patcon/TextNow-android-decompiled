package android.support.v7.app;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.ak;
import android.support.v4.app.f;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import textnow.g.k;
import textnow.i.a;
import textnow.i.b;

abstract class e
{
  final d a;
  boolean b;
  boolean c;
  private ActionBar d;
  private MenuInflater e;
  private boolean f;

  e(d paramd)
  {
    this.a = paramd;
  }

  abstract ActionBar a();

  abstract a a(b paramb);

  abstract void a(int paramInt);

  abstract void a(Configuration paramConfiguration);

  void a(Bundle paramBundle)
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(k.c);
    if (!localTypedArray.hasValue(0))
    {
      localTypedArray.recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    this.b = localTypedArray.getBoolean(0, false);
    this.c = localTypedArray.getBoolean(1, false);
    localTypedArray.recycle();
    if (ak.b(this.a) != null)
    {
      if (this.d == null)
        this.f = true;
    }
    else
      return;
    this.d.b(true);
  }

  abstract void a(View paramView);

  abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  abstract void a(CharSequence paramCharSequence);

  abstract boolean a(int paramInt, Menu paramMenu);

  abstract boolean a(int paramInt, MenuItem paramMenuItem);

  abstract boolean a(int paramInt, View paramView, Menu paramMenu);

  final ActionBar b()
  {
    if ((this.b) || (this.c))
      if (this.d == null)
      {
        this.d = a();
        if (this.f)
          this.d.b(true);
      }
    while (true)
    {
      return this.d;
      this.d = null;
    }
  }

  abstract View b(int paramInt);

  abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  final MenuInflater c()
  {
    ActionBar localActionBar;
    if (this.e == null)
    {
      localActionBar = b();
      if (localActionBar == null)
        break label36;
    }
    label36: for (this.e = new textnow.h.d(localActionBar.c()); ; this.e = new textnow.h.d(this.a))
      return this.e;
  }

  abstract void d();

  abstract void e();

  abstract void f();

  abstract boolean g();

  abstract f h();

  abstract void i();

  protected final String j()
  {
    try
    {
      ActivityInfo localActivityInfo = this.a.getPackageManager().getActivityInfo(this.a.getComponentName(), 128);
      Bundle localBundle = localActivityInfo.metaData;
      Object localObject = null;
      if (localBundle != null)
      {
        String str = localActivityInfo.metaData.getString("android.support.UI_OPTIONS");
        localObject = str;
      }
      return localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      new StringBuilder().append("getUiOptionsFromMetadata: Activity '").append(this.a.getClass().getSimpleName()).append("' not in manifest").toString();
    }
    return null;
  }

  protected final Context k()
  {
    Object localObject = this.a;
    ActionBar localActionBar = b();
    if (localActionBar != null)
      localObject = localActionBar.c();
    return localObject;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.e
 * JD-Core Version:    0.6.2
 */