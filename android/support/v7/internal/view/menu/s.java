package android.support.v7.internal.view.menu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
import textnow.c.b;
import textnow.i.c;

public class s extends j<MenuItem>
  implements b
{
  private final boolean b;
  private boolean c;
  private Method d;

  s(MenuItem paramMenuItem)
  {
    this(paramMenuItem, true);
  }

  s(MenuItem paramMenuItem, boolean paramBoolean)
  {
    super(paramMenuItem);
    this.c = paramMenuItem.isVisible();
    this.b = paramBoolean;
  }

  public final b a(android.support.v4.view.j paramj)
  {
    MenuItem localMenuItem = (MenuItem)this.a;
    if (paramj != null);
    for (t localt = b(paramj); ; localt = null)
    {
      localMenuItem.setActionProvider(localt);
      return this;
    }
  }

  public final void a(boolean paramBoolean)
  {
    try
    {
      if (this.d == null)
      {
        Class localClass = ((MenuItem)this.a).getClass();
        Class[] arrayOfClass = new Class[1];
        arrayOfClass[0] = Boolean.TYPE;
        this.d = localClass.getDeclaredMethod("setExclusiveCheckable", arrayOfClass);
      }
      Method localMethod = this.d;
      Object localObject = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(true);
      localMethod.invoke(localObject, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  t b(android.support.v4.view.j paramj)
  {
    return new t(this, paramj);
  }

  final boolean b()
  {
    t localt;
    if (this.c)
    {
      localt = (t)((MenuItem)this.a).getActionProvider();
      if (localt == null);
    }
    return false;
  }

  public boolean collapseActionView()
  {
    return ((MenuItem)this.a).collapseActionView();
  }

  public boolean expandActionView()
  {
    return ((MenuItem)this.a).expandActionView();
  }

  public ActionProvider getActionProvider()
  {
    return ((MenuItem)this.a).getActionProvider();
  }

  public View getActionView()
  {
    View localView = ((MenuItem)this.a).getActionView();
    if ((localView instanceof u))
      localView = ((u)localView).a();
    return localView;
  }

  public char getAlphabeticShortcut()
  {
    return ((MenuItem)this.a).getAlphabeticShortcut();
  }

  public int getGroupId()
  {
    return ((MenuItem)this.a).getGroupId();
  }

  public Drawable getIcon()
  {
    return ((MenuItem)this.a).getIcon();
  }

  public Intent getIntent()
  {
    return ((MenuItem)this.a).getIntent();
  }

  public int getItemId()
  {
    return ((MenuItem)this.a).getItemId();
  }

  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((MenuItem)this.a).getMenuInfo();
  }

  public char getNumericShortcut()
  {
    return ((MenuItem)this.a).getNumericShortcut();
  }

  public int getOrder()
  {
    return ((MenuItem)this.a).getOrder();
  }

  public SubMenu getSubMenu()
  {
    return a(((MenuItem)this.a).getSubMenu());
  }

  public CharSequence getTitle()
  {
    return ((MenuItem)this.a).getTitle();
  }

  public CharSequence getTitleCondensed()
  {
    return ((MenuItem)this.a).getTitleCondensed();
  }

  public boolean hasSubMenu()
  {
    return ((MenuItem)this.a).hasSubMenu();
  }

  public boolean isActionViewExpanded()
  {
    return ((MenuItem)this.a).isActionViewExpanded();
  }

  public boolean isCheckable()
  {
    return ((MenuItem)this.a).isCheckable();
  }

  public boolean isChecked()
  {
    return ((MenuItem)this.a).isChecked();
  }

  public boolean isEnabled()
  {
    return ((MenuItem)this.a).isEnabled();
  }

  public boolean isVisible()
  {
    return ((MenuItem)this.a).isVisible();
  }

  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    ((MenuItem)this.a).setActionProvider(paramActionProvider);
    if ((paramActionProvider != null) && (this.b))
      b();
    return this;
  }

  public MenuItem setActionView(int paramInt)
  {
    ((MenuItem)this.a).setActionView(paramInt);
    View localView = ((MenuItem)this.a).getActionView();
    if ((localView instanceof c))
      ((MenuItem)this.a).setActionView(new u(localView));
    return this;
  }

  public MenuItem setActionView(View paramView)
  {
    if ((paramView instanceof c))
      paramView = new u(paramView);
    ((MenuItem)this.a).setActionView(paramView);
    return this;
  }

  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((MenuItem)this.a).setAlphabeticShortcut(paramChar);
    return this;
  }

  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((MenuItem)this.a).setCheckable(paramBoolean);
    return this;
  }

  public MenuItem setChecked(boolean paramBoolean)
  {
    ((MenuItem)this.a).setChecked(paramBoolean);
    return this;
  }

  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((MenuItem)this.a).setEnabled(paramBoolean);
    return this;
  }

  public MenuItem setIcon(int paramInt)
  {
    ((MenuItem)this.a).setIcon(paramInt);
    return this;
  }

  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((MenuItem)this.a).setIcon(paramDrawable);
    return this;
  }

  public MenuItem setIntent(Intent paramIntent)
  {
    ((MenuItem)this.a).setIntent(paramIntent);
    return this;
  }

  public MenuItem setNumericShortcut(char paramChar)
  {
    ((MenuItem)this.a).setNumericShortcut(paramChar);
    return this;
  }

  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    ((MenuItem)this.a).setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }

  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    MenuItem localMenuItem = (MenuItem)this.a;
    if (paramOnMenuItemClickListener != null);
    for (v localv = new v(this, paramOnMenuItemClickListener); ; localv = null)
    {
      localMenuItem.setOnMenuItemClickListener(localv);
      return this;
    }
  }

  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((MenuItem)this.a).setShortcut(paramChar1, paramChar2);
    return this;
  }

  public void setShowAsAction(int paramInt)
  {
    ((MenuItem)this.a).setShowAsAction(paramInt);
  }

  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((MenuItem)this.a).setShowAsActionFlags(paramInt);
    return this;
  }

  public MenuItem setTitle(int paramInt)
  {
    ((MenuItem)this.a).setTitle(paramInt);
    return this;
  }

  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((MenuItem)this.a).setTitle(paramCharSequence);
    return this;
  }

  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((MenuItem)this.a).setTitleCondensed(paramCharSequence);
    return this;
  }

  public MenuItem setVisible(boolean paramBoolean)
  {
    if (this.b)
    {
      this.c = paramBoolean;
      if (b())
        return this;
    }
    return ((MenuItem)this.a).setVisible(paramBoolean);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.s
 * JD-Core Version:    0.6.2
 */