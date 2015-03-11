package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.j;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import textnow.c.b;

public final class a
  implements b
{
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  private CharSequence e;
  private CharSequence f;
  private Intent g;
  private char h;
  private char i;
  private Drawable j;
  private int k = 0;
  private Context l;
  private MenuItem.OnMenuItemClickListener m;
  private int n = 16;

  public a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence)
  {
    this.l = paramContext;
    this.a = 16908332;
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.e = paramCharSequence;
  }

  private b a(int paramInt)
  {
    return this;
  }

  public final b a(j paramj)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean collapseActionView()
  {
    return false;
  }

  public final boolean expandActionView()
  {
    return false;
  }

  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException();
  }

  public final View getActionView()
  {
    return null;
  }

  public final char getAlphabeticShortcut()
  {
    return this.i;
  }

  public final int getGroupId()
  {
    return this.b;
  }

  public final Drawable getIcon()
  {
    return this.j;
  }

  public final Intent getIntent()
  {
    return this.g;
  }

  public final int getItemId()
  {
    return this.a;
  }

  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }

  public final char getNumericShortcut()
  {
    return this.h;
  }

  public final int getOrder()
  {
    return this.d;
  }

  public final SubMenu getSubMenu()
  {
    return null;
  }

  public final CharSequence getTitle()
  {
    return this.e;
  }

  public final CharSequence getTitleCondensed()
  {
    return this.f;
  }

  public final boolean hasSubMenu()
  {
    return false;
  }

  public final boolean isActionViewExpanded()
  {
    return false;
  }

  public final boolean isCheckable()
  {
    return (0x1 & this.n) != 0;
  }

  public final boolean isChecked()
  {
    return (0x2 & this.n) != 0;
  }

  public final boolean isEnabled()
  {
    return (0x10 & this.n) != 0;
  }

  public final boolean isVisible()
  {
    return (0x8 & this.n) == 0;
  }

  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException();
  }

  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    this.i = paramChar;
    return this;
  }

  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i1 = 0xFFFFFFFE & this.n;
    if (paramBoolean);
    for (int i2 = 1; ; i2 = 0)
    {
      this.n = (i2 | i1);
      return this;
    }
  }

  public final MenuItem setChecked(boolean paramBoolean)
  {
    int i1 = 0xFFFFFFFD & this.n;
    if (paramBoolean);
    for (int i2 = 2; ; i2 = 0)
    {
      this.n = (i2 | i1);
      return this;
    }
  }

  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int i1 = 0xFFFFFFEF & this.n;
    if (paramBoolean);
    for (int i2 = 16; ; i2 = 0)
    {
      this.n = (i2 | i1);
      return this;
    }
  }

  public final MenuItem setIcon(int paramInt)
  {
    this.k = paramInt;
    this.j = this.l.getResources().getDrawable(paramInt);
    return this;
  }

  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.j = paramDrawable;
    this.k = 0;
    return this;
  }

  public final MenuItem setIntent(Intent paramIntent)
  {
    this.g = paramIntent;
    return this;
  }

  public final MenuItem setNumericShortcut(char paramChar)
  {
    this.h = paramChar;
    return this;
  }

  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException();
  }

  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.m = paramOnMenuItemClickListener;
    return this;
  }

  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.h = paramChar1;
    this.i = paramChar2;
    return this;
  }

  public final void setShowAsAction(int paramInt)
  {
  }

  public final MenuItem setTitle(int paramInt)
  {
    this.e = this.l.getResources().getString(paramInt);
    return this;
  }

  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    return this;
  }

  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.f = paramCharSequence;
    return this;
  }

  public final MenuItem setVisible(boolean paramBoolean)
  {
    int i1 = 0x8 & this.n;
    if (paramBoolean);
    for (int i2 = 0; ; i2 = 8)
    {
      this.n = (i2 | i1);
      return this;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.a
 * JD-Core Version:    0.6.2
 */