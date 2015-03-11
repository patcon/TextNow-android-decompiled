package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import textnow.b.a;

class aa extends e<Menu>
  implements a
{
  aa(Menu paramMenu)
  {
    super(paramMenu);
  }

  public MenuItem add(int paramInt)
  {
    return a(((Menu)this.a).add(paramInt));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(((Menu)this.a).add(paramInt1, paramInt2, paramInt3, paramInt4));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(((Menu)this.a).add(paramInt1, paramInt2, paramInt3, paramCharSequence));
  }

  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(((Menu)this.a).add(paramCharSequence));
  }

  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    MenuItem[] arrayOfMenuItem = null;
    if (paramArrayOfMenuItem != null)
      arrayOfMenuItem = new MenuItem[paramArrayOfMenuItem.length];
    int i = ((Menu)this.a).addIntentOptions(paramInt1, paramInt2, paramInt3, paramComponentName, paramArrayOfIntent, paramIntent, paramInt4, arrayOfMenuItem);
    if (arrayOfMenuItem != null)
    {
      int j = 0;
      int k = arrayOfMenuItem.length;
      while (j < k)
      {
        paramArrayOfMenuItem[j] = a(arrayOfMenuItem[j]);
        j++;
      }
    }
    return i;
  }

  public SubMenu addSubMenu(int paramInt)
  {
    return a(((Menu)this.a).addSubMenu(paramInt));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(((Menu)this.a).addSubMenu(paramInt1, paramInt2, paramInt3, paramInt4));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(((Menu)this.a).addSubMenu(paramInt1, paramInt2, paramInt3, paramCharSequence));
  }

  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return a(((Menu)this.a).addSubMenu(paramCharSequence));
  }

  public void clear()
  {
    a();
    ((Menu)this.a).clear();
  }

  public void close()
  {
    ((Menu)this.a).close();
  }

  public MenuItem findItem(int paramInt)
  {
    return a(((Menu)this.a).findItem(paramInt));
  }

  public MenuItem getItem(int paramInt)
  {
    return a(((Menu)this.a).getItem(paramInt));
  }

  public boolean hasVisibleItems()
  {
    return ((Menu)this.a).hasVisibleItems();
  }

  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return ((Menu)this.a).isShortcutKey(paramInt, paramKeyEvent);
  }

  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return ((Menu)this.a).performIdentifierAction(paramInt1, paramInt2);
  }

  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    return ((Menu)this.a).performShortcut(paramInt1, paramKeyEvent, paramInt2);
  }

  public void removeGroup(int paramInt)
  {
    a(paramInt);
    ((Menu)this.a).removeGroup(paramInt);
  }

  public void removeItem(int paramInt)
  {
    b(paramInt);
    ((Menu)this.a).removeItem(paramInt);
  }

  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ((Menu)this.a).setGroupCheckable(paramInt, paramBoolean1, paramBoolean2);
  }

  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    ((Menu)this.a).setGroupEnabled(paramInt, paramBoolean);
  }

  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    ((Menu)this.a).setGroupVisible(paramInt, paramBoolean);
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    ((Menu)this.a).setQwertyMode(paramBoolean);
  }

  public int size()
  {
    return ((Menu)this.a).size();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.aa
 * JD-Core Version:    0.6.2
 */