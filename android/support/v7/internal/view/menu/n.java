package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import textnow.c.a;
import textnow.g.d;

public class n
  implements a
{
  private static final int[] d = { 1, 4, 5, 3, 2, 0 };
  CharSequence a;
  Drawable b;
  View c;
  private final Context e;
  private final Resources f;
  private boolean g;
  private boolean h;
  private o i;
  private ArrayList<r> j;
  private ArrayList<r> k;
  private boolean l;
  private ArrayList<r> m;
  private ArrayList<r> n;
  private boolean o;
  private int p = 0;
  private ContextMenu.ContextMenuInfo q;
  private boolean r = false;
  private boolean s = false;
  private boolean t = false;
  private boolean u = false;
  private ArrayList<r> v = new ArrayList();
  private CopyOnWriteArrayList<WeakReference<aa>> w = new CopyOnWriteArrayList();
  private r x;

  public n(Context paramContext)
  {
    this.e = paramContext;
    this.f = paramContext.getResources();
    this.j = new ArrayList();
    this.k = new ArrayList();
    this.l = i1;
    this.m = new ArrayList();
    this.n = new ArrayList();
    this.o = i1;
    if ((this.f.getConfiguration().keyboard != i1) && (this.f.getBoolean(d.d)));
    while (true)
    {
      this.h = i1;
      return;
      i1 = 0;
    }
  }

  private static int a(ArrayList<r> paramArrayList, int paramInt)
  {
    for (int i1 = -1 + paramArrayList.size(); i1 >= 0; i1--)
      if (((r)paramArrayList.get(i1)).b() <= paramInt)
        return i1 + 1;
    return 0;
  }

  private r a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.v;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    r localr;
    if (localArrayList.isEmpty())
      localr = null;
    label181: 
    while (true)
    {
      return localr;
      int i1 = paramKeyEvent.getMetaState();
      KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
      paramKeyEvent.getKeyData(localKeyData);
      int i2 = localArrayList.size();
      if (i2 == 1)
        return (r)localArrayList.get(0);
      boolean bool = a();
      int i3 = 0;
      if (i3 >= i2)
        break;
      localr = (r)localArrayList.get(i3);
      if (bool);
      for (int i4 = localr.getAlphabeticShortcut(); ; i4 = localr.getNumericShortcut())
      {
        if (((i4 == localKeyData.meta[0]) && ((i1 & 0x2) == 0)) || ((i4 == localKeyData.meta[2]) && ((i1 & 0x2) != 0)) || ((bool) && (i4 == 8) && (paramInt == 67)))
          break label181;
        i3++;
        break;
      }
    }
    return null;
  }

  private MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = (0xFFFF0000 & paramInt3) >> 16;
    if ((i1 < 0) || (i1 >= d.length))
      throw new IllegalArgumentException("order does not contain a valid category.");
    int i2 = d[i1] << 16 | 0xFFFF & paramInt3;
    r localr = new r(this, paramInt1, paramInt2, paramInt3, i2, paramCharSequence, this.p);
    if (this.q != null)
      localr.a(this.q);
    this.j.add(a(this.j, i2), localr);
    b(true);
    return localr;
  }

  private void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    if (paramView != null)
    {
      this.c = paramView;
      this.a = null;
      this.b = null;
    }
    while (true)
    {
      b(false);
      return;
      if (paramCharSequence != null)
        this.a = paramCharSequence;
      if (paramDrawable != null)
        this.b = paramDrawable;
      this.c = null;
    }
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt >= this.j.size()));
    do
    {
      return;
      this.j.remove(paramInt);
    }
    while (!paramBoolean);
    b(true);
  }

  private void a(List<r> paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = a();
    int i1 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67))
      return;
    int i2 = this.j.size();
    int i3 = 0;
    label49: r localr;
    if (i3 < i2)
    {
      localr = (r)this.j.get(i3);
      if (localr.hasSubMenu())
        ((n)localr.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      if (!bool)
        break label181;
    }
    label181: for (int i4 = localr.getAlphabeticShortcut(); ; i4 = localr.getNumericShortcut())
    {
      if (((i1 & 0x5) == 0) && (i4 != 0) && ((i4 == localKeyData.meta[0]) || (i4 == localKeyData.meta[2]) || ((bool) && (i4 == 8) && (paramInt == 67))) && (localr.isEnabled()))
        paramList.add(localr);
      i3++;
      break label49;
      break;
    }
  }

  public final n a(int paramInt)
  {
    this.p = 1;
    return this;
  }

  protected final n a(Drawable paramDrawable)
  {
    a(0, null, 0, paramDrawable, null);
    return this;
  }

  protected final n a(View paramView)
  {
    a(0, null, 0, null, paramView);
    return this;
  }

  protected final n a(CharSequence paramCharSequence)
  {
    a(0, paramCharSequence, 0, null, null);
    return this;
  }

  public final void a(aa paramaa)
  {
    this.w.add(new WeakReference(paramaa));
    paramaa.a(this.e, this);
    this.o = true;
  }

  public void a(o paramo)
  {
    this.i = paramo;
  }

  final void a(MenuItem paramMenuItem)
  {
    int i1 = paramMenuItem.getGroupId();
    int i2 = this.j.size();
    int i3 = 0;
    if (i3 < i2)
    {
      r localr = (r)this.j.get(i3);
      if ((localr.getGroupId() == i1) && (localr.f()) && (localr.isCheckable()))
        if (localr != paramMenuItem)
          break label85;
      label85: for (boolean bool = true; ; bool = false)
      {
        localr.b(bool);
        i3++;
        break;
      }
    }
  }

  final void a(boolean paramBoolean)
  {
    if (this.u)
      return;
    this.u = true;
    Iterator localIterator = this.w.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      aa localaa = (aa)localWeakReference.get();
      if (localaa == null)
        this.w.remove(localWeakReference);
      else
        localaa.a(this, paramBoolean);
    }
    this.u = false;
  }

  boolean a()
  {
    return this.g;
  }

  boolean a(n paramn, MenuItem paramMenuItem)
  {
    return (this.i != null) && (this.i.a(paramMenuItem));
  }

  public boolean a(r paramr)
  {
    boolean bool1 = this.w.isEmpty();
    boolean bool2 = false;
    if (bool1);
    label104: 
    do
    {
      return bool2;
      f();
      Iterator localIterator = this.w.iterator();
      boolean bool3 = false;
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        aa localaa = (aa)localWeakReference.get();
        if (localaa == null)
        {
          this.w.remove(localWeakReference);
        }
        else
        {
          bool2 = localaa.b(paramr);
          if (bool2)
            break label104;
          bool3 = bool2;
        }
      }
      bool2 = bool3;
      g();
    }
    while (!bool2);
    this.x = paramr;
    return bool2;
  }

  public final boolean a(MenuItem paramMenuItem, int paramInt)
  {
    r localr = (r)paramMenuItem;
    boolean bool1;
    if ((localr == null) || (!localr.isEnabled()))
      bool1 = false;
    boolean bool2;
    ag localag;
    boolean bool4;
    do
    {
      do
      {
        return bool1;
        bool2 = localr.a();
        localr.l();
        if (!localr.m())
          break;
        bool1 = bool2 | localr.expandActionView();
      }
      while (!bool1);
      a(true);
      return bool1;
      if (!localr.hasSubMenu())
        break label236;
      a(false);
      if (!localr.hasSubMenu())
        localr.a(new ag(this.e, this, localr));
      localag = (ag)localr.getSubMenu();
      boolean bool3 = this.w.isEmpty();
      bool4 = false;
      if (!bool3)
        break;
      bool1 = bool2 | bool4;
    }
    while (bool1);
    a(true);
    return bool1;
    Iterator localIterator = this.w.iterator();
    boolean bool5 = false;
    label156: aa localaa;
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      localaa = (aa)localWeakReference.get();
      if (localaa == null)
        this.w.remove(localWeakReference);
      else
        if (bool5)
          break label250;
    }
    label236: label250: for (boolean bool6 = localaa.a(localag); ; bool6 = bool5)
    {
      bool5 = bool6;
      break label156;
      bool4 = bool5;
      break;
      if ((paramInt & 0x1) == 0)
        a(true);
      return bool2;
    }
  }

  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, this.f.getString(paramInt));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }

  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }

  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.e.getPackageManager();
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i1;
    int i2;
    label52: ResolveInfo localResolveInfo;
    if (localList != null)
    {
      i1 = localList.size();
      if ((paramInt4 & 0x1) == 0)
        removeGroup(paramInt1);
      i2 = 0;
      if (i2 >= i1)
        break label211;
      localResolveInfo = (ResolveInfo)localList.get(i2);
      if (localResolveInfo.specificIndex >= 0)
        break label198;
    }
    label198: for (Intent localIntent1 = paramIntent; ; localIntent1 = paramArrayOfIntent[localResolveInfo.specificIndex])
    {
      Intent localIntent2 = new Intent(localIntent1);
      localIntent2.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
      MenuItem localMenuItem = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(localIntent2);
      if ((paramArrayOfMenuItem != null) && (localResolveInfo.specificIndex >= 0))
        paramArrayOfMenuItem[localResolveInfo.specificIndex] = localMenuItem;
      i2++;
      break label52;
      i1 = 0;
      break;
    }
    label211: return i1;
  }

  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, this.f.getString(paramInt));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    r localr = (r)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    ag localag = new ag(this.e, this, localr);
    localr.a(localag);
    return localag;
  }

  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }

  public final void b(aa paramaa)
  {
    Iterator localIterator = this.w.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      aa localaa = (aa)localWeakReference.get();
      if ((localaa == null) || (localaa == paramaa))
        this.w.remove(localWeakReference);
    }
  }

  final void b(boolean paramBoolean)
  {
    if (!this.r)
    {
      if (paramBoolean)
      {
        this.l = true;
        this.o = true;
      }
      if (!this.w.isEmpty())
      {
        f();
        Iterator localIterator = this.w.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          aa localaa = (aa)localWeakReference.get();
          if (localaa == null)
            this.w.remove(localWeakReference);
          else
            localaa.d(paramBoolean);
        }
        g();
      }
      return;
    }
    this.s = true;
  }

  public boolean b()
  {
    return this.h;
  }

  public boolean b(r paramr)
  {
    boolean bool1 = this.w.isEmpty();
    boolean bool2 = false;
    if (!bool1)
    {
      r localr = this.x;
      bool2 = false;
      if (localr == paramr)
        break label30;
    }
    label30: label118: 
    do
    {
      return bool2;
      f();
      Iterator localIterator = this.w.iterator();
      boolean bool3 = false;
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        aa localaa = (aa)localWeakReference.get();
        if (localaa == null)
        {
          this.w.remove(localWeakReference);
        }
        else
        {
          bool2 = localaa.c(paramr);
          if (bool2)
            break label118;
          bool3 = bool2;
        }
      }
      bool2 = bool3;
      g();
    }
    while (!bool2);
    this.x = null;
    return bool2;
  }

  final Resources c()
  {
    return this.f;
  }

  public void clear()
  {
    if (this.x != null)
      b(this.x);
    this.j.clear();
    b(true);
  }

  public void clearHeader()
  {
    this.b = null;
    this.a = null;
    this.c = null;
    b(false);
  }

  public void close()
  {
    a(true);
  }

  public final Context d()
  {
    return this.e;
  }

  public final void e()
  {
    if (this.i != null)
      this.i.a(this);
  }

  public final void f()
  {
    if (!this.r)
    {
      this.r = true;
      this.s = false;
    }
  }

  public MenuItem findItem(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = (r)this.j.get(i2);
      if (((r)localObject).getItemId() == paramInt);
      do
      {
        return localObject;
        if (!((r)localObject).hasSubMenu())
          break;
        localObject = ((r)localObject).getSubMenu().findItem(paramInt);
      }
      while (localObject != null);
    }
    return null;
  }

  public final void g()
  {
    this.r = false;
    if (this.s)
    {
      this.s = false;
      b(true);
    }
  }

  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.j.get(paramInt);
  }

  final void h()
  {
    this.l = true;
    b(true);
  }

  public boolean hasVisibleItems()
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
      if (((r)this.j.get(i2)).isVisible())
        return true;
    return false;
  }

  final void i()
  {
    this.o = true;
    b(true);
  }

  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, paramKeyEvent) != null;
  }

  final ArrayList<r> j()
  {
    if (!this.l)
      return this.k;
    this.k.clear();
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      r localr = (r)this.j.get(i2);
      if (localr.isVisible())
        this.k.add(localr);
    }
    this.l = false;
    this.o = true;
    return this.k;
  }

  public final void k()
  {
    if (!this.o)
      return;
    Iterator localIterator = this.w.iterator();
    boolean bool = false;
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      aa localaa = (aa)localWeakReference.get();
      if (localaa == null)
        this.w.remove(localWeakReference);
      else
        bool |= localaa.h();
    }
    if (bool)
    {
      this.m.clear();
      this.n.clear();
      ArrayList localArrayList = j();
      int i1 = localArrayList.size();
      int i2 = 0;
      if (i2 < i1)
      {
        r localr = (r)localArrayList.get(i2);
        if (localr.h())
          this.m.add(localr);
        while (true)
        {
          i2++;
          break;
          this.n.add(localr);
        }
      }
    }
    else
    {
      this.m.clear();
      this.n.clear();
      this.n.addAll(j());
    }
    this.o = false;
  }

  final ArrayList<r> l()
  {
    k();
    return this.m;
  }

  final ArrayList<r> m()
  {
    k();
    return this.n;
  }

  public final CharSequence n()
  {
    return this.a;
  }

  public final Drawable o()
  {
    return this.b;
  }

  public final View p()
  {
    return this.c;
  }

  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return a(findItem(paramInt1), paramInt2);
  }

  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    r localr = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (localr != null)
      bool = a(localr, paramInt2);
    if ((paramInt2 & 0x2) != 0)
      a(true);
    return bool;
  }

  public n q()
  {
    return this;
  }

  final boolean r()
  {
    return this.t;
  }

  public void removeGroup(int paramInt)
  {
    int i1 = size();
    int i2 = 0;
    int i3;
    if (i2 < i1)
      if (((r)this.j.get(i2)).getGroupId() == paramInt)
        i3 = i2;
    while (true)
      if (i3 >= 0)
      {
        int i4 = this.j.size() - i3;
        int i6;
        for (int i5 = 0; ; i5 = i6)
        {
          i6 = i5 + 1;
          if ((i5 >= i4) || (((r)this.j.get(i3)).getGroupId() != paramInt))
            break;
          a(i3, false);
        }
        i2++;
        break;
        i3 = -1;
        continue;
        b(true);
      }
  }

  public void removeItem(int paramInt)
  {
    int i1 = size();
    int i2 = 0;
    if (i2 < i1)
      if (((r)this.j.get(i2)).getItemId() != paramInt);
    for (int i3 = i2; ; i3 = -1)
    {
      a(i3, true);
      return;
      i2++;
      break;
    }
  }

  public final r s()
  {
    return this.x;
  }

  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      r localr = (r)this.j.get(i2);
      if (localr.getGroupId() == paramInt)
      {
        localr.a(paramBoolean2);
        localr.setCheckable(paramBoolean1);
      }
    }
  }

  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i1 = this.j.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      r localr = (r)this.j.get(i2);
      if (localr.getGroupId() == paramInt)
        localr.setEnabled(paramBoolean);
    }
  }

  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i1 = this.j.size();
    int i2 = 0;
    int i3 = 0;
    if (i2 < i1)
    {
      r localr = (r)this.j.get(i2);
      if ((localr.getGroupId() != paramInt) || (!localr.c(paramBoolean)))
        break label76;
    }
    label76: for (int i4 = 1; ; i4 = i3)
    {
      i2++;
      i3 = i4;
      break;
      if (i3 != 0)
        b(true);
      return;
    }
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    this.g = paramBoolean;
    b(false);
  }

  public int size()
  {
    return this.j.size();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.n
 * JD-Core Version:    0.6.2
 */