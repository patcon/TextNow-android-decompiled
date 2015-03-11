package textnow.k;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.j;
import android.support.v4.view.z;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.n;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import textnow.g.l;

final class g
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

  public g(e parame, Menu paramMenu)
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
      Object localObject = e.a(this.a).getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
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
        z.a(paramMenuItem, this.u);
      if (this.y == null)
        break label162;
      if (!e.a(this.a).isRestricted())
        break;
      throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
    }
    paramMenuItem.setOnMenuItemClickListener(new f(e.c(this.a), this.y));
    label162: if (this.q >= 2)
    {
      if ((paramMenuItem instanceof m))
        ((m)paramMenuItem).a(bool1);
    }
    else
    {
      if (this.w == null)
        break label273;
      z.a(paramMenuItem, (View)a(this.w, e.b(), e.d(this.a)));
    }
    while (true)
    {
      if ((this.v > 0) && (!bool1))
        z.b(paramMenuItem, this.v);
      if (this.z != null)
        z.a(paramMenuItem, this.z);
      return;
      if (!(paramMenuItem instanceof n))
        break;
      ((n)paramMenuItem).a(bool1);
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
    TypedArray localTypedArray = e.a(this.a).obtainStyledAttributes(paramAttributeSet, l.aj);
    this.c = localTypedArray.getResourceId(l.am, 0);
    this.d = localTypedArray.getInt(l.an, 0);
    this.e = localTypedArray.getInt(l.ao, 0);
    this.f = localTypedArray.getInt(l.ak, 0);
    this.g = localTypedArray.getBoolean(l.ap, true);
    this.h = localTypedArray.getBoolean(l.al, true);
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
    TypedArray localTypedArray = e.a(this.a).obtainStyledAttributes(paramAttributeSet, l.aq);
    this.j = localTypedArray.getResourceId(l.az, 0);
    int i2 = localTypedArray.getInt(l.aA, this.d);
    int i3 = localTypedArray.getInt(l.aD, this.e);
    this.k = (i2 & 0xFFFF0000 | i3 & 0xFFFF);
    this.l = localTypedArray.getText(l.aE);
    this.m = localTypedArray.getText(l.aF);
    this.n = localTypedArray.getResourceId(l.ay, 0);
    this.o = a(localTypedArray.getString(l.au));
    this.p = a(localTypedArray.getString(l.aB));
    int i4;
    if (localTypedArray.hasValue(l.av))
      if (localTypedArray.getBoolean(l.av, false))
      {
        i4 = i1;
        this.q = i4;
        label164: this.r = localTypedArray.getBoolean(l.aw, false);
        this.s = localTypedArray.getBoolean(l.aG, this.g);
        this.t = localTypedArray.getBoolean(l.ax, this.h);
        this.u = localTypedArray.getInt(l.aH, -1);
        this.y = localTypedArray.getString(l.aC);
        this.v = localTypedArray.getResourceId(l.ar, 0);
        this.w = localTypedArray.getString(l.at);
        this.x = localTypedArray.getString(l.as);
        if (this.x == null)
          break label340;
        label270: if ((i1 == 0) || (this.v != 0) || (this.w != null))
          break label345;
      }
    label340: label345: for (this.z = ((j)a(this.x, e.a(), e.b(this.a))); ; this.z = null)
    {
      localTypedArray.recycle();
      this.i = false;
      return;
      i4 = 0;
      break;
      this.q = this.f;
      break label164;
      i1 = 0;
      break label270;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.k.g
 * JD-Core Version:    0.6.2
 */