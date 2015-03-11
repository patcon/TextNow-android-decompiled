package textnow.h;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.j;
import android.support.v4.view.v;
import android.support.v7.internal.view.menu.r;
import android.support.v7.internal.view.menu.s;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import textnow.g.k;

final class f
{
  private Menu b;
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private boolean h;
  private boolean i;
  private int j;
  private int k;
  private CharSequence l;
  private CharSequence m;
  private int n;
  private char o;
  private char p;
  private int q;
  private boolean r;
  private boolean s;
  private boolean t;
  private int u;
  private int v;
  private String w;
  private String x;
  private String y;
  private j z;

  public f(d paramd, Menu paramMenu)
  {
    this.b = paramMenu;
    a();
  }

  private static char a(String paramString)
  {
    if (paramString == null)
      return '\000';
    return paramString.charAt(0);
  }

  private <T> T a(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = d.a(this.a).getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
      new StringBuilder().append("Cannot instantiate class: ").append(paramString).toString();
    }
    return null;
  }

  private void a(MenuItem paramMenuItem)
  {
    boolean bool1 = true;
    MenuItem localMenuItem = paramMenuItem.setChecked(this.r).setVisible(this.s).setEnabled(this.t);
    if (this.q > 0);
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      localMenuItem.setCheckable(bool2).setTitleCondensed(this.m).setIcon(this.n).setAlphabeticShortcut(this.o).setNumericShortcut(this.p);
      if (this.u >= 0)
        v.a(paramMenuItem, this.u);
      if (this.y == null)
        break label162;
      if (!d.a(this.a).isRestricted())
        break;
      throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
    }
    paramMenuItem.setOnMenuItemClickListener(new e(d.c(this.a), this.y));
    label162: if (this.q >= 2)
    {
      if ((paramMenuItem instanceof r))
        ((r)paramMenuItem).a(bool1);
    }
    else
    {
      if (this.w == null)
        break label273;
      v.a(paramMenuItem, (View)a(this.w, d.b(), d.d(this.a)));
    }
    while (true)
    {
      if ((this.v > 0) && (!bool1))
        v.b(paramMenuItem, this.v);
      if (this.z != null)
        v.a(paramMenuItem, this.z);
      return;
      if (!(paramMenuItem instanceof s))
        break;
      ((s)paramMenuItem).a(bool1);
      break;
      label273: bool1 = false;
    }
  }

  public final void a()
  {
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = true;
    this.h = true;
  }

  public final void a(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = d.a(this.a).obtainStyledAttributes(paramAttributeSet, k.j);
    this.c = localTypedArray.getResourceId(1, 0);
    this.d = localTypedArray.getInt(3, 0);
    this.e = localTypedArray.getInt(4, 0);
    this.f = localTypedArray.getInt(5, 0);
    this.g = localTypedArray.getBoolean(2, true);
    this.h = localTypedArray.getBoolean(0, true);
    localTypedArray.recycle();
  }

  public final void b()
  {
    this.i = true;
    a(this.b.add(this.c, this.j, this.k, this.l));
  }

  public final void b(AttributeSet paramAttributeSet)
  {
    int i1 = 1;
    TypedArray localTypedArray = d.a(this.a).obtainStyledAttributes(paramAttributeSet, k.k);
    this.j = localTypedArray.getResourceId(2, 0);
    int i2 = localTypedArray.getInt(5, this.d);
    int i3 = localTypedArray.getInt(6, this.e);
    this.k = (i2 & 0xFFFF0000 | i3 & 0xFFFF);
    this.l = localTypedArray.getText(7);
    this.m = localTypedArray.getText(8);
    this.n = localTypedArray.getResourceId(0, 0);
    this.o = a(localTypedArray.getString(9));
    this.p = a(localTypedArray.getString(10));
    int i4;
    if (localTypedArray.hasValue(11))
      if (localTypedArray.getBoolean(11, false))
      {
        i4 = i1;
        this.q = i4;
        label151: this.r = localTypedArray.getBoolean(3, false);
        this.s = localTypedArray.getBoolean(4, this.g);
        this.t = localTypedArray.getBoolean(i1, this.h);
        this.u = localTypedArray.getInt(13, -1);
        this.y = localTypedArray.getString(12);
        this.v = localTypedArray.getResourceId(14, 0);
        this.w = localTypedArray.getString(15);
        this.x = localTypedArray.getString(16);
        if (this.x == null)
          break label316;
        label246: if ((i1 == 0) || (this.v != 0) || (this.w != null))
          break label321;
      }
    label316: label321: for (this.z = ((j)a(this.x, d.a(), d.b(this.a))); ; this.z = null)
    {
      localTypedArray.recycle();
      this.i = false;
      return;
      i4 = 0;
      break;
      this.q = this.f;
      break label151;
      i1 = 0;
      break label246;
    }
  }

  public final SubMenu c()
  {
    this.i = true;
    SubMenu localSubMenu = this.b.addSubMenu(this.c, this.j, this.k, this.l);
    a(localSubMenu.getItem());
    return localSubMenu;
  }

  public final boolean d()
  {
    return this.i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.h.f
 * JD-Core Version:    0.6.2
 */