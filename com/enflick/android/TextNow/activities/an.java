package com.enflick.android.TextNow.activities;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.util.TypedValue;
import android.view.MenuItem;
import textnow.v.y;
import textnow.z.u;

public abstract class an extends ap
{
  private boolean a = false;
  protected boolean g = false;
  protected boolean h = false;

  public final void a(CharSequence paramCharSequence)
  {
    ActionBar localActionBar = b();
    if (localActionBar != null)
      localActionBar.b(paramCharSequence);
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.g = paramBoolean1;
    ActionBar localActionBar = b();
    if (localActionBar != null)
    {
      if (!paramBoolean1)
        break label34;
      localActionBar.b(true);
      localActionBar.c(true);
    }
    while (true)
    {
      localActionBar.a(paramBoolean2);
      return;
      label34: localActionBar.a(false);
      localActionBar.b(false);
    }
  }

  public void d(boolean paramBoolean)
  {
    a(paramBoolean, paramBoolean);
  }

  public final void e(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void onCreate(Bundle paramBundle)
  {
    setTheme(y.a(this, new u(getApplicationContext()).ab().intValue()));
    super.onCreate(paramBundle);
    ActionBar localActionBar = b();
    if (localActionBar != null)
      localActionBar.a(new ColorDrawable(y.b(this, 2130772068)));
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 16908332:
    case 2131558400:
    }
    do
      return super.onOptionsItemSelected(paramMenuItem);
    while (!this.g);
    onBackPressed();
    return true;
  }

  public void setTitle(int paramInt)
  {
    super.setTitle(paramInt);
    ActionBar localActionBar = b();
    if (localActionBar != null)
      localActionBar.a(paramInt);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    ActionBar localActionBar = b();
    if (localActionBar != null)
      localActionBar.a(paramCharSequence);
  }

  public final int t()
  {
    TypedValue localTypedValue = new TypedValue();
    boolean bool = getTheme().resolveAttribute(16843499, localTypedValue, true);
    int i = 0;
    if (bool)
      i = TypedValue.complexToDimensionPixelSize(localTypedValue.data, getResources().getDisplayMetrics());
    return i;
  }

  public final boolean u()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.an
 * JD-Core Version:    0.6.2
 */