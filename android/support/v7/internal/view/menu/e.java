package android.support.v7.internal.view.menu;

import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import textnow.b.b;

abstract class e<T> extends f<T>
{
  private HashMap<MenuItem, b> b;
  private HashMap<SubMenu, SubMenu> c;

  e(T paramT)
  {
    super(paramT);
  }

  final SubMenu a(SubMenu paramSubMenu)
  {
    if (paramSubMenu != null)
    {
      if (this.c == null)
        this.c = new HashMap();
      Object localObject = (SubMenu)this.c.get(paramSubMenu);
      if (localObject == null)
      {
        if (Build.VERSION.SDK_INT >= 14)
        {
          localObject = new ac(paramSubMenu);
          this.c.put(paramSubMenu, localObject);
        }
      }
      else
        return localObject;
      throw new UnsupportedOperationException();
    }
    return null;
  }

  final b a(MenuItem paramMenuItem)
  {
    if (paramMenuItem != null)
    {
      if (this.b == null)
        this.b = new HashMap();
      Object localObject = (b)this.b.get(paramMenuItem);
      if (localObject == null)
        if (Build.VERSION.SDK_INT < 16)
          break label67;
      for (localObject = new r(paramMenuItem); ; localObject = new n(paramMenuItem))
      {
        this.b.put(paramMenuItem, localObject);
        return localObject;
        label67: if (Build.VERSION.SDK_INT < 14)
          break;
      }
      throw new UnsupportedOperationException();
    }
    return null;
  }

  final void a()
  {
    if (this.b != null)
      this.b.clear();
    if (this.c != null)
      this.c.clear();
  }

  final void a(int paramInt)
  {
    if (this.b == null);
    while (true)
    {
      return;
      Iterator localIterator = this.b.keySet().iterator();
      while (localIterator.hasNext())
        if (paramInt == ((MenuItem)localIterator.next()).getGroupId())
          localIterator.remove();
    }
  }

  final void b(int paramInt)
  {
    if (this.b == null);
    Iterator localIterator;
    do
    {
      return;
      while (!localIterator.hasNext())
        localIterator = this.b.keySet().iterator();
    }
    while (paramInt != ((MenuItem)localIterator.next()).getItemId());
    localIterator.remove();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.e
 * JD-Core Version:    0.6.2
 */