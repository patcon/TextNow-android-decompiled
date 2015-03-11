package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v4.view.j;
import android.support.v4.view.k;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import textnow.g.h;
import textnow.h.a;

public final class ActionMenuPresenter extends i
  implements k
{
  final g a = new g(this, (byte)0);
  int b;
  private View i;
  private boolean j;
  private boolean k;
  private int l;
  private int m;
  private int n;
  private boolean o;
  private boolean p;
  private boolean q;
  private boolean r;
  private int s;
  private final SparseBooleanArray t = new SparseBooleanArray();
  private View u;
  private f v;
  private c w;
  private d x;

  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext, h.g, h.f);
  }

  public final ac a(ViewGroup paramViewGroup)
  {
    ac localac = super.a(paramViewGroup);
    ((ActionMenuView)localac).a(this);
    return localac;
  }

  public final View a(r paramr, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramr.getActionView();
    if ((localView == null) || (paramr.m()))
    {
      if (!(paramView instanceof ActionMenuItemView))
        paramView = null;
      localView = super.a(paramr, paramView, paramViewGroup);
    }
    if (paramr.isActionViewExpanded());
    for (int i1 = 8; ; i1 = 0)
    {
      localView.setVisibility(i1);
      ActionMenuView localActionMenuView = (ActionMenuView)paramViewGroup;
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      if (!localActionMenuView.checkLayoutParams(localLayoutParams))
        localView.setLayoutParams(localActionMenuView.a(localLayoutParams));
      return localView;
    }
  }

  public final void a()
  {
    if (!this.o)
      this.n = this.d.getResources().getInteger(textnow.g.g.a);
    if (this.e != null)
      this.e.b(true);
  }

  public final void a(int paramInt)
  {
    this.n = 2147483647;
    this.o = true;
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    this.l = paramInt;
    this.p = true;
    this.q = true;
  }

  public final void a(Context paramContext, n paramn)
  {
    super.a(paramContext, paramn);
    Resources localResources = paramContext.getResources();
    a locala = a.a(paramContext);
    boolean bool;
    int i1;
    if (!this.k)
    {
      if (Build.VERSION.SDK_INT >= 11)
      {
        bool = true;
        this.j = bool;
      }
    }
    else
    {
      if (!this.q)
        this.l = locala.b();
      if (!this.o)
        this.n = locala.a();
      i1 = this.l;
      if (!this.j)
        break label172;
      if (this.i == null)
      {
        this.i = new e(this, this.c);
        int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.i.measure(i2, i2);
      }
      i1 -= this.i.getMeasuredWidth();
    }
    while (true)
    {
      this.m = i1;
      this.s = ((int)(56.0F * localResources.getDisplayMetrics().density));
      this.u = null;
      return;
      bool = false;
      break;
      label172: this.i = null;
    }
  }

  public final void a(n paramn, boolean paramBoolean)
  {
    d();
    super.a(paramn, paramBoolean);
  }

  public final void a(r paramr, ad paramad)
  {
    paramad.a(paramr, 0);
    ActionMenuView localActionMenuView = (ActionMenuView)this.h;
    ((ActionMenuItemView)paramad).a(localActionMenuView);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      super.a(null);
      return;
    }
    this.e.a(false);
  }

  public final boolean a(ag paramag)
  {
    if (!paramag.hasVisibleItems())
      return false;
    for (ag localag = paramag; localag.t() != this.e; localag = (ag)localag.t());
    MenuItem localMenuItem = localag.getItem();
    ViewGroup localViewGroup = (ViewGroup)this.h;
    int i2;
    View localView;
    if (localViewGroup != null)
    {
      int i1 = localViewGroup.getChildCount();
      i2 = 0;
      if (i2 < i1)
      {
        localView = localViewGroup.getChildAt(i2);
        if ((!(localView instanceof ad)) || (((ad)localView).a() != localMenuItem));
      }
    }
    while (true)
    {
      if (localView != null)
        break label131;
      if (this.i != null)
        break label126;
      return false;
      i2++;
      break;
      localView = null;
    }
    label126: this.b = paramag.getItem().getItemId();
    label131: this.w = new c(this, paramag);
    this.w.a(null);
    super.a(paramag);
    return true;
  }

  public final boolean a(r paramr)
  {
    return paramr.h();
  }

  public final boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.i)
      return false;
    return super.a(paramViewGroup, paramInt);
  }

  public final void b(boolean paramBoolean)
  {
    this.j = true;
    this.k = true;
  }

  public final boolean b()
  {
    if ((this.j) && (!f()) && (this.e != null) && (this.h != null) && (this.x == null))
    {
      this.x = new d(this, new f(this, this.d, this.e, this.i, true));
      ((View)this.h).post(this.x);
      super.a(null);
      return true;
    }
    return false;
  }

  public final void c(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }

  public final boolean c()
  {
    if ((this.x != null) && (this.h != null))
    {
      ((View)this.h).removeCallbacks(this.x);
      this.x = null;
      return true;
    }
    f localf = this.v;
    if (localf != null)
    {
      localf.b();
      return true;
    }
    return false;
  }

  public final void d(boolean paramBoolean)
  {
    int i1 = 1;
    super.d(paramBoolean);
    if (this.h == null)
      return;
    if (this.e != null)
    {
      ArrayList localArrayList2 = this.e.l();
      int i5 = localArrayList2.size();
      for (int i6 = 0; i6 < i5; i6++)
      {
        j localj = ((r)localArrayList2.get(i6)).l();
        if (localj != null)
          localj.a(this);
      }
    }
    ArrayList localArrayList1;
    int i2;
    int i3;
    int i4;
    if (this.e != null)
    {
      localArrayList1 = this.e.m();
      boolean bool = this.j;
      i2 = 0;
      if (bool)
      {
        i2 = 0;
        if (localArrayList1 != null)
        {
          i3 = localArrayList1.size();
          if (i3 != i1)
            break label261;
          if (((r)localArrayList1.get(0)).isActionViewExpanded())
            break label255;
          i4 = i1;
          label145: i2 = i4;
        }
      }
      if (i2 == 0)
        break label277;
      if (this.i == null)
        this.i = new e(this, this.c);
      ViewGroup localViewGroup = (ViewGroup)this.i.getParent();
      if (localViewGroup != this.h)
      {
        if (localViewGroup != null)
          localViewGroup.removeView(this.i);
        ActionMenuView localActionMenuView = (ActionMenuView)this.h;
        localActionMenuView.addView(this.i, localActionMenuView.a());
      }
    }
    while (true)
    {
      ((ActionMenuView)this.h).a(this.j);
      return;
      localArrayList1 = null;
      break;
      label255: i4 = 0;
      break label145;
      label261: if (i3 > 0);
      while (true)
      {
        i2 = i1;
        break;
        i1 = 0;
      }
      label277: if ((this.i != null) && (this.i.getParent() == this.h))
        ((ViewGroup)this.h).removeView(this.i);
    }
  }

  public final boolean d()
  {
    return c() | e();
  }

  public final boolean e()
  {
    if (this.w != null)
    {
      this.w.a();
      return true;
    }
    return false;
  }

  public final boolean f()
  {
    return (this.v != null) && (this.v.c());
  }

  public final boolean g()
  {
    return this.j;
  }

  public final boolean h()
  {
    ArrayList localArrayList = this.e.j();
    int i1 = localArrayList.size();
    int i2 = this.n;
    int i3 = this.m;
    int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)this.h;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    r localr3;
    if (i8 < i1)
    {
      localr3 = (r)localArrayList.get(i8);
      if (localr3.j())
      {
        i5++;
        label80: if ((!this.r) || (!localr3.isActionViewExpanded()))
          break label801;
      }
    }
    label785: label801: for (int i32 = 0; ; i32 = i2)
    {
      i8++;
      i2 = i32;
      break;
      if (localr3.i())
      {
        i6++;
        break label80;
      }
      i7 = 1;
      break label80;
      if ((this.j) && ((i7 != 0) || (i5 + i6 > i2)))
        i2--;
      int i9 = i2 - i5;
      SparseBooleanArray localSparseBooleanArray = this.t;
      localSparseBooleanArray.clear();
      int i11;
      int i10;
      if (this.p)
      {
        int i30 = i3 / this.s;
        int i31 = i3 % this.s;
        i11 = this.s + i31 / i30;
        i10 = i30;
      }
      while (true)
      {
        int i12 = 0;
        int i13 = 0;
        int i14 = i10;
        r localr1;
        View localView2;
        int i15;
        label295: int i17;
        int i28;
        if (i13 < i1)
        {
          localr1 = (r)localArrayList.get(i13);
          if (localr1.j())
          {
            localView2 = a(localr1, this.u, localViewGroup);
            if (this.u == null)
              this.u = localView2;
            if (this.p)
            {
              i15 = i14 - ActionMenuView.a(localView2, i11, i14, i4, 0);
              i17 = localView2.getMeasuredWidth();
              i28 = i3 - i17;
              if (i12 != 0)
                break label785;
            }
          }
        }
        while (true)
        {
          int i29 = localr1.getGroupId();
          if (i29 != 0)
            localSparseBooleanArray.put(i29, true);
          localr1.d(true);
          int i16 = i28;
          int i18 = i9;
          while (true)
          {
            i13++;
            i3 = i16;
            i9 = i18;
            i12 = i17;
            i14 = i15;
            break;
            localView2.measure(i4, i4);
            i15 = i14;
            break label295;
            if (localr1.i())
            {
              int i19 = localr1.getGroupId();
              boolean bool1 = localSparseBooleanArray.get(i19);
              boolean bool2;
              label440: View localView1;
              label508: int i26;
              label546: boolean bool3;
              int i20;
              if (((i9 > 0) || (bool1)) && (i3 > 0) && ((!this.p) || (i14 > 0)))
              {
                bool2 = true;
                if (!bool2)
                  break label755;
                localView1 = a(localr1, this.u, localViewGroup);
                if (this.u == null)
                  this.u = localView1;
                if (!this.p)
                  break label619;
                int i27 = ActionMenuView.a(localView1, i11, i14, i4, 0);
                i14 -= i27;
                if (i27 == 0)
                  bool2 = false;
                int i24 = localView1.getMeasuredWidth();
                i3 -= i24;
                if (i12 == 0)
                  i12 = i24;
                if (!this.p)
                  break label637;
                if (i3 < 0)
                  break label631;
                i26 = 1;
                bool3 = bool2 & i26;
                i20 = i14;
              }
              while (true)
              {
                int i21;
                if ((bool3) && (i19 != 0))
                {
                  localSparseBooleanArray.put(i19, true);
                  i21 = i9;
                }
                while (true)
                {
                  if (bool3)
                    i21--;
                  localr1.d(bool3);
                  i17 = i12;
                  i16 = i3;
                  i18 = i21;
                  i15 = i20;
                  break;
                  bool2 = false;
                  break label440;
                  label619: localView1.measure(i4, i4);
                  break label508;
                  label631: i26 = 0;
                  break label546;
                  label637: if (i3 + i12 > 0);
                  for (int i25 = 1; ; i25 = 0)
                  {
                    bool3 = bool2 & i25;
                    i20 = i14;
                    break;
                  }
                  if (bool1)
                  {
                    localSparseBooleanArray.put(i19, false);
                    int i22 = i9;
                    int i23 = 0;
                    while (i23 < i13)
                    {
                      r localr2 = (r)localArrayList.get(i23);
                      if (localr2.getGroupId() == i19)
                      {
                        if (localr2.h())
                          i22++;
                        localr2.d(false);
                      }
                      i23++;
                      continue;
                      return true;
                    }
                    i21 = i22;
                  }
                  else
                  {
                    i21 = i9;
                  }
                }
                label755: bool3 = bool2;
                i20 = i14;
              }
            }
            i15 = i14;
            i16 = i3;
            i17 = i12;
            i18 = i9;
          }
          i17 = i12;
        }
        i10 = 0;
        i11 = 0;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuPresenter
 * JD-Core Version:    0.6.2
 */