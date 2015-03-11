package com.enflick.android.TextNow.activities;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.widget.TextView;
import textnow.q.ab;
import textnow.u.r;

public abstract class ah extends aj
{
  protected boolean g = false;

  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.g = paramBoolean1;
    ActionBar localActionBar = c();
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

  public void b(boolean paramBoolean)
  {
    a(paramBoolean, paramBoolean);
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = new r(getApplicationContext()).ac().intValue();
    int j;
    if (i == 0)
      j = 2131558578;
    while (true)
    {
      setTheme(j);
      super.onCreate(paramBundle);
      return;
      if (ab.a(i))
      {
        TypedArray localTypedArray2 = getResources().obtainTypedArray(2131623940);
        j = localTypedArray2.getResourceId(i - 1, 2131558582);
        localTypedArray2.recycle();
      }
      else
      {
        TypedArray localTypedArray1 = getResources().obtainTypedArray(2131623941);
        j = localTypedArray1.getResourceId(i - 101, 2131558581);
        localTypedArray1.recycle();
      }
    }
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 16908332:
    case 2131165204:
    }
    do
      return super.onOptionsItemSelected(paramMenuItem);
    while (!this.g);
    onBackPressed();
    return true;
  }

  public final int q()
  {
    ActionBar localActionBar = c();
    if (localActionBar == null)
      return 0;
    return localActionBar.b();
  }

  public void setTitle(int paramInt)
  {
    super.setTitle(paramInt);
    ActionBar localActionBar = c();
    if (localActionBar != null)
      localActionBar.a(paramInt);
    if (Build.VERSION.SDK_INT < 11)
      ((TextView)findViewById(2131165255)).setText(paramInt);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    ActionBar localActionBar = c();
    if (localActionBar != null)
      localActionBar.a(paramCharSequence);
    if (Build.VERSION.SDK_INT < 11)
      ((TextView)findViewById(2131165255)).setText(paramCharSequence);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ah
 * JD-Core Version:    0.6.2
 */