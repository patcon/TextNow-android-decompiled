package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.j;
import android.support.v4.view.k;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.ab;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.t;
import android.support.v7.internal.view.menu.x;
import android.support.v7.internal.view.menu.y;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import textnow.g.h;

public final class ActionMenuPresenter extends android.support.v7.internal.view.menu.d
  implements k
{
  final f g = new f(this, (byte)0);
  int h;
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
  private e v;
  private a w;
  private c x;
  private b y;

  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext, textnow.g.i.c, textnow.g.i.b);
  }

  public final x a(ViewGroup paramViewGroup)
  {
    x localx = super.a(paramViewGroup);
    ((ActionMenuView)localx).a(this);
    return localx;
  }

  public final View a(m paramm, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramm.getActionView();
    if ((localView == null) || (paramm.m()))
      localView = super.a(paramm, paramView, paramViewGroup);
    if (paramm.isActionViewExpanded());
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

  public final void a(int paramInt, boolean paramBoolean)
  {
    this.l = paramInt;
    this.p = true;
    this.q = true;
  }

  public final void a(Context paramContext, android.support.v7.internal.view.menu.i parami)
  {
    super.a(paramContext, parami);
    Resources localResources = paramContext.getResources();
    textnow.k.a locala = textnow.k.a.a(paramContext);
    if (!this.k)
      this.j = locala.b();
    if (!this.q)
      this.l = locala.c();
    if (!this.o)
      this.n = locala.a();
    int i1 = this.l;
    if (this.j)
    {
      if (this.i == null)
      {
        this.i = new d(this, this.a);
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
      this.i = null;
    }
  }

  public final void a(android.support.v7.internal.view.menu.i parami, boolean paramBoolean)
  {
    f();
    super.a(parami, paramBoolean);
  }

  public final void a(m paramm, y paramy)
  {
    paramy.a(paramm, 0);
    ActionMenuView localActionMenuView = (ActionMenuView)this.f;
    ActionMenuItemView localActionMenuItemView = (ActionMenuItemView)paramy;
    localActionMenuItemView.a(localActionMenuView);
    if (this.y == null)
      this.y = new b(this, (byte)0);
    localActionMenuItemView.a(this.y);
  }

  public final void a(ActionMenuView paramActionMenuView)
  {
    this.f = paramActionMenuView;
    paramActionMenuView.a(this.c);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      super.a(null);
      return;
    }
    this.c.a(false);
  }

  public final boolean a(ab paramab)
  {
    if (!paramab.hasVisibleItems())
      return false;
    for (ab localab = paramab; localab.t() != this.c; localab = (ab)localab.t());
    MenuItem localMenuItem = localab.getItem();
    ViewGroup localViewGroup = (ViewGroup)this.f;
    int i2;
    View localView1;
    if (localViewGroup != null)
    {
      int i1 = localViewGroup.getChildCount();
      i2 = 0;
      if (i2 < i1)
      {
        View localView2 = localViewGroup.getChildAt(i2);
        if (((localView2 instanceof y)) && (((y)localView2).a() == localMenuItem))
          localView1 = localView2;
      }
    }
    while (true)
      if (localView1 == null)
      {
        if (this.i == null)
        {
          return false;
          i2++;
          break;
          localView1 = null;
          continue;
        }
        localView1 = this.i;
      }
    this.h = paramab.getItem().getItemId();
    this.w = new a(this, this.b, paramab);
    this.w.a(localView1);
    this.w.a();
    super.a(paramab);
    return true;
  }

  public final boolean a(m paramm)
  {
    return paramm.h();
  }

  public final boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.i)
      return false;
    return super.a(paramViewGroup, paramInt);
  }

  public final void b(int paramInt)
  {
    this.n = 2147483647;
    this.o = true;
  }

  public final void b(boolean paramBoolean)
  {
    int i1 = 1;
    ((View)this.f).getParent();
    super.b(paramBoolean);
    ((View)this.f).requestLayout();
    if (this.c != null)
    {
      ArrayList localArrayList2 = this.c.l();
      int i5 = localArrayList2.size();
      for (int i6 = 0; i6 < i5; i6++)
      {
        j localj = ((m)localArrayList2.get(i6)).l();
        if (localj != null)
          localj.a(this);
      }
    }
    ArrayList localArrayList1;
    int i2;
    int i3;
    int i4;
    if (this.c != null)
    {
      localArrayList1 = this.c.m();
      boolean bool = this.j;
      i2 = 0;
      if (bool)
      {
        i2 = 0;
        if (localArrayList1 != null)
        {
          i3 = localArrayList1.size();
          if (i3 != i1)
            break label279;
          if (((m)localArrayList1.get(0)).isActionViewExpanded())
            break label273;
          i4 = i1;
          label162: i2 = i4;
        }
      }
      if (i2 == 0)
        break label295;
      if (this.i == null)
        this.i = new d(this, this.a);
      ViewGroup localViewGroup = (ViewGroup)this.i.getParent();
      if (localViewGroup != this.f)
      {
        if (localViewGroup != null)
          localViewGroup.removeView(this.i);
        ActionMenuView localActionMenuView = (ActionMenuView)this.f;
        localActionMenuView.addView(this.i, localActionMenuView.b());
      }
    }
    while (true)
    {
      ((ActionMenuView)this.f).a(this.j);
      return;
      localArrayList1 = null;
      break;
      label273: i4 = 0;
      break label162;
      label279: if (i3 > 0);
      while (true)
      {
        i2 = i1;
        break;
        i1 = 0;
      }
      label295: if ((this.i != null) && (this.i.getParent() == this.f))
        ((ViewGroup)this.f).removeView(this.i);
    }
  }

  public final boolean b()
  {
    ArrayList localArrayList = this.c.j();
    int i1 = localArrayList.size();
    int i2 = this.n;
    int i3 = this.m;
    int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)this.f;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    m localm3;
    if (i8 < i1)
    {
      localm3 = (m)localArrayList.get(i8);
      if (localm3.j())
      {
        i5++;
        label80: if ((!this.r) || (!localm3.isActionViewExpanded()))
          break label807;
      }
    }
    label546: label807: for (int i32 = 0; ; i32 = i2)
    {
      i8++;
      i2 = i32;
      break;
      if (localm3.i())
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
        m localm1;
        View localView2;
        int i15;
        label295: int i17;
        int i28;
        if (i13 < i1)
        {
          localm1 = (m)localArrayList.get(i13);
          if (localm1.j())
          {
            localView2 = a(localm1, this.u, localViewGroup);
            if (this.u == null)
              this.u = localView2;
            if (this.p)
            {
              i15 = i14 - ActionMenuView.a(localView2, i11, i14, i4, 0);
              i17 = localView2.getMeasuredWidth();
              i28 = i3 - i17;
              if (i12 != 0)
                break label791;
            }
          }
        }
        while (true)
        {
          int i29 = localm1.getGroupId();
          if (i29 != 0)
            localSparseBooleanArray.put(i29, true);
          localm1.d(true);
          int i16 = i28;
          int i18 = i9;
          i13++;
          i3 = i16;
          i9 = i18;
          i12 = i17;
          i14 = i15;
          break;
          localView2.measure(i4, i4);
          i15 = i14;
          break label295;
          int i19;
          boolean bool1;
          boolean bool2;
          label440: View localView1;
          label508: int i26;
          boolean bool3;
          int i20;
          if (localm1.i())
          {
            i19 = localm1.getGroupId();
            bool1 = localSparseBooleanArray.get(i19);
            if (((i9 > 0) || (bool1)) && (i3 > 0) && ((!this.p) || (i14 > 0)))
            {
              bool2 = true;
              if (!bool2)
                break label780;
              localView1 = a(localm1, this.u, localViewGroup);
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
              localm1.d(bool3);
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
                while (true)
                  if (i23 < i13)
                  {
                    m localm2 = (m)localArrayList.get(i23);
                    if (localm2.getGroupId() == i19)
                    {
                      if (localm2.h())
                        i22++;
                      localm2.d(false);
                    }
                    i23++;
                    continue;
                    localm1.d(false);
                    i15 = i14;
                    i16 = i3;
                    i17 = i12;
                    i18 = i9;
                    break;
                    return true;
                  }
                i21 = i22;
              }
              else
              {
                i21 = i9;
              }
            }
            bool3 = bool2;
            i20 = i14;
          }
          i17 = i12;
        }
        i10 = 0;
        i11 = 0;
      }
    }
  }

  public final void c()
  {
    if (!this.o)
      this.n = this.b.getResources().getInteger(h.a);
    if (this.c != null)
      this.c.b(true);
  }

  public final void c(boolean paramBoolean)
  {
    this.j = true;
    this.k = true;
  }

  public final void d(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }

  public final boolean d()
  {
    if ((this.j) && (!h()) && (this.c != null) && (this.f != null) && (this.x == null) && (!this.c.m().isEmpty()))
    {
      this.x = new c(this, new e(this, this.b, this.c, this.i, true));
      ((View)this.f).post(this.x);
      super.a(null);
      return true;
    }
    return false;
  }

  public final boolean e()
  {
    if ((this.x != null) && (this.f != null))
    {
      ((View)this.f).removeCallbacks(this.x);
      this.x = null;
      return true;
    }
    e locale = this.v;
    if (locale != null)
    {
      locale.e();
      return true;
    }
    return false;
  }

  public final boolean f()
  {
    return e() | g();
  }

  public final boolean g()
  {
    if (this.w != null)
    {
      this.w.e();
      return true;
    }
    return false;
  }

  public final boolean h()
  {
    return (this.v != null) && (this.v.f());
  }

  public final boolean i()
  {
    return (this.x != null) || (h());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActionMenuPresenter
 * JD-Core Version:    0.6.2
 */