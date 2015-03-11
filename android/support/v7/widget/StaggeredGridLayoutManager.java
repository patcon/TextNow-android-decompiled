package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.av;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.BitSet;
import textnow.f.a;
import textnow.f.e;
import textnow.f.n;
import textnow.f.x;

public final class StaggeredGridLayoutManager extends as
{
  private final Runnable A;
  ak a;
  ak b;
  boolean c;
  int d;
  int e;
  StaggeredGridLayoutManager.LazySpanLookup f;
  private int g;
  private bm[] h;
  private int i;
  private int j;
  private v k;
  private boolean l;
  private BitSet m;
  private int n;
  private boolean o;
  private boolean s;
  private StaggeredGridLayoutManager.SavedState t;
  private int u;
  private int v;
  private int w;
  private final bl x;
  private boolean y;
  private boolean z;

  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0));
    int i1;
    do
    {
      return paramInt1;
      i1 = View.MeasureSpec.getMode(paramInt1);
    }
    while ((i1 != -2147483648) && (i1 != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3, i1);
  }

  private int a(aw paramaw, v paramv, bb parambb)
  {
    this.m.set(0, this.g, true);
    int i3;
    int i4;
    int i5;
    label92: int i6;
    label113: View localView1;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams1;
    label175: label205: int i9;
    StaggeredGridLayoutManager.LazySpanLookup localLazySpanLookup1;
    int i10;
    label240: int i11;
    if (paramv.d == 1)
    {
      int i54 = this.a.d() + this.k.a;
      int i55 = i54 + this.k.e + this.a.g();
      i3 = i54;
      i4 = i55;
      f(paramv.d, i4);
      if (!this.c)
        break label460;
      i5 = this.a.d();
      if ((paramv.b < 0) || (paramv.b >= parambb.e()))
        break label472;
      i6 = 1;
      if ((i6 == 0) || (this.m.isEmpty()))
        break label1685;
      localView1 = paramaw.b(paramv.b);
      paramv.b += paramv.c;
      localLayoutParams1 = (StaggeredGridLayoutManager.LayoutParams)localView1.getLayoutParams();
      if (paramv.d != 1)
        break label478;
      b(localView1);
      if (!localLayoutParams1.f)
        break label505;
      if (this.i != 1)
        break label488;
      a(localView1, this.u, this.w);
      i9 = localLayoutParams1.e();
      localLazySpanLookup1 = this.f;
      if ((localLazySpanLookup1.a != null) && (i9 < localLazySpanLookup1.a.length))
        break label522;
      i10 = -1;
      if (i10 != -1)
        break label535;
      i11 = 1;
    }
    Object localObject2;
    label270: Object localObject1;
    label300: int i34;
    label324: int i14;
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2;
    label460: label472: label478: label488: label505: int i36;
    label522: label535: int i53;
    label563: int i39;
    label575: int i42;
    int i40;
    int i41;
    label594: int i48;
    int i50;
    label622: Object localObject4;
    int i51;
    while (true)
      if (i11 != 0)
      {
        if (localLayoutParams1.f)
        {
          localObject2 = this.h[0];
          StaggeredGridLayoutManager.LazySpanLookup localLazySpanLookup2 = this.f;
          localLazySpanLookup2.c(i9);
          localLazySpanLookup2.a[i9] = ((bm)localObject2).d;
          localObject1 = localObject2;
          if (paramv.d != 1)
            break label961;
          if (!localLayoutParams1.f)
            break label843;
          i34 = g(i5);
          i14 = i34 + this.a.c(localView1);
          if ((i11 == 0) || (!localLayoutParams1.f))
            break label1772;
          localFullSpanItem2 = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
          localFullSpanItem2.c = new int[this.g];
          for (int i35 = 0; i35 < this.g; i35++)
            localFullSpanItem2.c[i35] = (i34 - this.h[i35].b(i34));
          int i1 = this.a.c() - this.k.a;
          int i2 = i1 - this.k.e - this.a.c();
          i3 = i1;
          i4 = i2;
          break;
          i5 = this.a.c();
          break label92;
          i6 = 0;
          break label113;
          b(localView1, 0);
          break label175;
          a(localView1, this.v, this.u);
          break label205;
          a(localView1, this.v, this.w);
          break label205;
          i10 = localLazySpanLookup1.a[i9];
          break label240;
          i11 = 0;
          continue;
        }
        i36 = paramv.d;
        if (this.i == 0)
          if (i36 == -1)
          {
            i53 = 1;
            if (i53 == this.c)
              break label682;
            i39 = 1;
            if (i39 == 0)
              break label742;
            i42 = -1 + this.g;
            i40 = -1;
            i41 = -1;
            if (paramv.d != 1)
              break label757;
            localObject2 = null;
            i48 = 2147483647;
            int i49 = this.a.c();
            i50 = i42;
            if (i50 != i40)
            {
              localObject4 = this.h[i50];
              i51 = ((bm)localObject4).b(i49);
              if (i51 >= i48)
                break label1790;
            }
          }
      }
    for (int i52 = i51; ; i52 = i48)
    {
      i50 += i41;
      i48 = i52;
      localObject2 = localObject4;
      break label622;
      break label270;
      i53 = 0;
      break label563;
      label682: i39 = 0;
      break label575;
      int i37;
      if (i36 == -1)
      {
        i37 = 1;
        label697: if (i37 != this.c)
          break label730;
      }
      label730: for (int i38 = 1; ; i38 = 0)
      {
        if (i38 != w())
          break label736;
        i39 = 1;
        break;
        i37 = 0;
        break label697;
      }
      label736: i39 = 0;
      break label575;
      label742: i40 = this.g;
      i41 = 1;
      i42 = 0;
      break label594;
      label757: localObject2 = null;
      int i43 = -2147483648;
      int i44 = this.a.d();
      int i45 = i42;
      label777: Object localObject3;
      int i46;
      if (i45 != i40)
      {
        localObject3 = this.h[i45];
        i46 = ((bm)localObject3).a(i44);
        if (i46 <= i43)
          break label1779;
      }
      for (int i47 = i46; ; i47 = i43)
      {
        i45 += i41;
        i43 = i47;
        localObject2 = localObject3;
        break label777;
        break label270;
        localObject1 = this.h[i10];
        break label300;
        label843: i34 = ((bm)localObject1).b(i5);
        break label324;
        localFullSpanItem2.b = -1;
        localFullSpanItem2.a = i9;
        this.f.a(localFullSpanItem2);
        int i13 = i34;
        while (true)
        {
          if ((localLayoutParams1.f) && (paramv.c == -1) && (i11 != 0))
            this.y = true;
          localLayoutParams1.e = ((bm)localObject1);
          label961: label1099: label1116: int i15;
          label1133: int i16;
          label1169: label1190: int i25;
          int i26;
          label1224: int i30;
          if (paramv.d == 1)
          {
            if (localLayoutParams1.f)
            {
              for (int i32 = -1 + this.g; i32 >= 0; i32--)
                this.h[i32].b(localView1);
              if (localLayoutParams1.f);
              StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1;
              for (int i12 = f(i5); ; i12 = ((bm)localObject1).a(i5))
              {
                i13 = i12 - this.a.c(localView1);
                if ((i11 == 0) || (!localLayoutParams1.f))
                  break label1099;
                localFullSpanItem1 = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
                localFullSpanItem1.c = new int[this.g];
                for (int i33 = 0; i33 < this.g; i33++)
                  localFullSpanItem1.c[i33] = (this.h[i33].a(i12) - i12);
              }
              localFullSpanItem1.b = 1;
              localFullSpanItem1.a = i9;
              this.f.a(localFullSpanItem1);
              i14 = i12;
            }
            else
            {
              localLayoutParams1.e.b(localView1);
              if (localLayoutParams1.f)
              {
                i15 = this.b.c();
                i16 = i15 + this.b.c(localView1);
                if (this.i != 1)
                  break label1339;
                b(localView1, i15, i13, i16, i14);
                if (!localLayoutParams1.f)
                  break label1356;
                f(this.k.d, i4);
                if (this.k.d != -1)
                  break label1505;
                int i24 = ((bm)localObject1).a();
                i25 = this.h[0].a(i24);
                i26 = 1;
                if (i26 >= this.g)
                  break label1378;
                i30 = this.h[i26].a(i24);
                if (i30 <= i25)
                  break label1765;
              }
            }
          }
          else
          {
            while (true)
            {
              i26++;
              i25 = i30;
              break label1224;
              if (localLayoutParams1.f)
              {
                for (int i31 = -1 + this.g; i31 >= 0; i31--)
                  this.h[i31].a(localView1);
                break label1116;
              }
              localLayoutParams1.e.a(localView1);
              break label1116;
              i15 = ((bm)localObject1).d * this.j + this.b.c();
              break label1133;
              label1339: b(localView1, i13, i15, i14, i16);
              break label1169;
              label1356: int i17 = this.k.d;
              a((bm)localObject1, i17, i4);
              break label1190;
              label1378: int i27 = Math.max(i3, i25) + (this.a.e() - this.a.c());
              for (int i28 = -1 + k(); ; i28--)
              {
                if (i28 < 0)
                  break label1503;
                View localView3 = b(i28);
                if (this.a.a(localView3) <= i27)
                  break;
                StaggeredGridLayoutManager.LayoutParams localLayoutParams3 = (StaggeredGridLayoutManager.LayoutParams)localView3.getLayoutParams();
                if (localLayoutParams3.f)
                  for (int i29 = 0; i29 < this.g; i29++)
                    this.h[i29].d();
                localLayoutParams3.e.d();
                a(localView3, paramaw);
              }
              label1503: break;
              label1505: int i18 = ((bm)localObject1).b();
              int i19 = this.h[0].b(i18);
              int i20 = 1;
              label1528: int i23;
              if (i20 < this.g)
              {
                i23 = this.h[i20].b(i18);
                if (i23 >= i19)
                  break label1758;
              }
              while (true)
              {
                i20++;
                i19 = i23;
                break label1528;
                int i21 = Math.min(i3, i19) - (this.a.e() - this.a.c());
                while (true)
                {
                  if (k() <= 0)
                    break label1683;
                  View localView2 = b(0);
                  if (this.a.b(localView2) >= i21)
                    break;
                  StaggeredGridLayoutManager.LayoutParams localLayoutParams2 = (StaggeredGridLayoutManager.LayoutParams)localView2.getLayoutParams();
                  if (localLayoutParams2.f)
                    for (int i22 = 0; i22 < this.g; i22++)
                      this.h[i22].e();
                  localLayoutParams2.e.e();
                  a(localView2, paramaw);
                }
                label1683: break;
                label1685: if (this.k.d == -1)
                {
                  int i8 = f(this.a.c());
                  return Math.max(0, this.k.a + (i3 - i8));
                }
                int i7 = g(this.a.d());
                return Math.max(0, this.k.a + (i7 - i3));
                label1758: i23 = i19;
              }
              label1765: i30 = i25;
            }
            label1772: i13 = i34;
          }
        }
        label1779: localObject3 = localObject2;
      }
      label1790: localObject4 = localObject2;
    }
  }

  private View a(boolean paramBoolean)
  {
    int i1 = this.a.c();
    int i2 = this.a.d();
    int i3 = k();
    for (int i4 = 0; i4 < i3; i4++)
    {
      View localView = b(i4);
      if (((!paramBoolean) || (this.a.a(localView) >= i1)) && (this.a.b(localView) <= i2))
        return localView;
    }
    return null;
  }

  private void a(int paramInt, bb parambb)
  {
    int i1 = 1;
    this.k.a = 0;
    this.k.b = paramInt;
    label61: v localv;
    if (j())
    {
      int i2 = parambb.c();
      int i3 = this.c;
      if (i2 < paramInt)
      {
        int i4 = i1;
        if (i3 != i4)
          break label95;
        this.k.e = 0;
        this.k.d = -1;
        localv = this.k;
        if (!this.c)
          break label123;
      }
    }
    while (true)
    {
      localv.c = i1;
      return;
      int i5 = 0;
      break;
      label95: this.k.e = this.a.f();
      break label61;
      this.k.e = 0;
      break label61;
      label123: i1 = -1;
    }
  }

  private void a(aw paramaw, bb parambb, boolean paramBoolean)
  {
    int i1 = g(this.a.d());
    int i2 = this.a.d() - i1;
    if (i2 > 0)
    {
      int i3 = i2 - -d(-i2, paramaw, parambb);
      if ((paramBoolean) && (i3 > 0))
        this.a.a(i3);
    }
  }

  private void a(bm parambm, int paramInt1, int paramInt2)
  {
    int i1 = parambm.c;
    if (paramInt1 == -1)
      if (i1 + parambm.a() < paramInt2)
        this.m.set(parambm.d, false);
    while (parambm.b() - i1 <= paramInt2)
      return;
    this.m.set(parambm.d, false);
  }

  private void a(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = this.q.d(paramView);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    paramView.measure(a(paramInt1, localLayoutParams.leftMargin + localRect.left, localLayoutParams.rightMargin + localRect.right), a(paramInt2, localLayoutParams.topMargin + localRect.top, localLayoutParams.bottomMargin + localRect.bottom));
  }

  private View b(boolean paramBoolean)
  {
    int i1 = this.a.c();
    int i2 = this.a.d();
    for (int i3 = -1 + k(); i3 >= 0; i3--)
    {
      View localView = b(i3);
      if ((this.a.a(localView) >= i1) && ((!paramBoolean) || (this.a.b(localView) <= i2)))
        return localView;
    }
    return null;
  }

  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1;
    if (this.c)
    {
      i1 = x();
      this.f.b(paramInt1);
      switch (paramInt3)
      {
      case 2:
      default:
        label52: if (paramInt1 + paramInt2 > i1)
          break;
      case 0:
      case 1:
      case 3:
      }
    }
    while (true)
    {
      return;
      i1 = y();
      break;
      this.f.b(paramInt1, paramInt2);
      break label52;
      this.f.a(paramInt1, paramInt2);
      break label52;
      this.f.a(paramInt1, 1);
      this.f.b(paramInt2, 1);
      break label52;
      if (this.c);
      for (int i2 = y(); paramInt1 <= i2; i2 = x())
      {
        h();
        return;
      }
    }
  }

  private void b(int paramInt, bb parambb)
  {
    int i1 = 1;
    this.k.a = 0;
    this.k.b = paramInt;
    if (j())
    {
      int i2 = parambb.c();
      int i3 = this.c;
      if (i2 > paramInt)
      {
        int i4 = i1;
        if (i3 != i4)
          break label97;
        this.k.e = 0;
      }
    }
    while (true)
    {
      this.k.d = i1;
      v localv = this.k;
      if (this.c)
        i1 = -1;
      localv.c = i1;
      return;
      int i5 = 0;
      break;
      label97: this.k.e = this.a.f();
      continue;
      this.k.e = 0;
    }
  }

  private void b(aw paramaw, bb parambb, boolean paramBoolean)
  {
    int i1 = f(this.a.c()) - this.a.c();
    if (i1 > 0)
    {
      int i2 = i1 - d(i1, paramaw, parambb);
      if ((paramBoolean) && (i2 > 0))
        this.a.a(-i2);
    }
  }

  private void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    a(paramView, paramInt1 + localLayoutParams.leftMargin, paramInt2 + localLayoutParams.topMargin, paramInt3 - localLayoutParams.rightMargin, paramInt4 - localLayoutParams.bottomMargin);
  }

  private int d(int paramInt, aw paramaw, bb parambb)
  {
    int i1 = 1;
    int i2 = -1;
    g();
    int i3;
    int i5;
    label103: int i6;
    if (paramInt > 0)
    {
      this.k.d = i1;
      v localv3 = this.k;
      if (this.c)
      {
        localv3.c = i2;
        i3 = x();
        this.k.b = (i3 + this.k.c);
        int i4 = Math.abs(paramInt);
        this.k.a = i4;
        v localv2 = this.k;
        if (!j())
          break label200;
        i5 = this.a.f();
        localv2.e = i5;
        i6 = a(paramaw, this.k, parambb);
        if (i4 >= i6)
          break label206;
      }
    }
    while (true)
    {
      this.a.a(-paramInt);
      this.o = this.c;
      return paramInt;
      i2 = i1;
      break;
      this.k.d = i2;
      v localv1 = this.k;
      if (this.c);
      while (true)
      {
        localv1.c = i1;
        i3 = y();
        break;
        i1 = i2;
      }
      label200: i5 = 0;
      break label103;
      label206: if (paramInt < 0)
        paramInt = -i6;
      else
        paramInt = i6;
    }
  }

  private int f(int paramInt)
  {
    int i1 = this.h[0].a(paramInt);
    for (int i2 = 1; i2 < this.g; i2++)
    {
      int i3 = this.h[i2].a(paramInt);
      if (i3 < i1)
        i1 = i3;
    }
    return i1;
  }

  private void f(int paramInt1, int paramInt2)
  {
    for (int i1 = 0; i1 < this.g; i1++)
      if (!bm.a(this.h[i1]).isEmpty())
        a(this.h[i1], paramInt1, paramInt2);
  }

  private int g(int paramInt)
  {
    int i1 = this.h[0].b(paramInt);
    for (int i2 = 1; i2 < this.g; i2++)
    {
      int i3 = this.h[i2].b(paramInt);
      if (i3 > i1)
        i1 = i3;
    }
    return i1;
  }

  private int g(bb parambb)
  {
    boolean bool1 = true;
    if (k() == 0)
      return 0;
    ak localak = this.a;
    boolean bool2;
    View localView;
    if (!this.z)
    {
      bool2 = bool1;
      localView = a(bool2);
      if (this.z)
        break label69;
    }
    while (true)
    {
      return bg.a(parambb, localak, localView, b(bool1), this, this.z, this.c);
      bool2 = false;
      break;
      label69: bool1 = false;
    }
  }

  private void g()
  {
    if (this.a == null)
    {
      this.a = ak.a(this, this.i);
      this.b = ak.a(this, 1 - this.i);
      this.k = new v();
    }
  }

  private int h(bb parambb)
  {
    boolean bool1 = true;
    if (k() == 0)
      return 0;
    ak localak = this.a;
    boolean bool2;
    View localView;
    if (!this.z)
    {
      bool2 = bool1;
      localView = a(bool2);
      if (this.z)
        break label65;
    }
    while (true)
    {
      return bg.a(parambb, localak, localView, b(bool1), this, this.z);
      bool2 = false;
      break;
      label65: bool1 = false;
    }
  }

  private int i(bb parambb)
  {
    boolean bool1 = true;
    if (k() == 0)
      return 0;
    ak localak = this.a;
    boolean bool2;
    View localView;
    if (!this.z)
    {
      bool2 = bool1;
      localView = a(bool2);
      if (this.z)
        break label65;
    }
    while (true)
    {
      return bg.b(parambb, localak, localView, b(bool1), this, this.z);
      bool2 = false;
      break;
      label65: bool1 = false;
    }
  }

  private void v()
  {
    int i1 = 1;
    boolean bool;
    if ((this.i == i1) || (!w()))
      bool = this.l;
    while (true)
    {
      this.c = bool;
      return;
      if (this.l)
        bool = false;
    }
  }

  private boolean w()
  {
    return av.h(this.q) == 1;
  }

  private int x()
  {
    int i1 = k();
    if (i1 == 0)
      return 0;
    return c(b(i1 - 1));
  }

  private int y()
  {
    if (k() == 0)
      return 0;
    return c(b(0));
  }

  public final int a(int paramInt, aw paramaw, bb parambb)
  {
    return d(paramInt, paramaw, parambb);
  }

  public final int a(aw paramaw, bb parambb)
  {
    if (this.i == 0)
      return this.g;
    return super.a(paramaw, parambb);
  }

  public final int a(bb parambb)
  {
    return g(parambb);
  }

  public final RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new StaggeredGridLayoutManager.LayoutParams(paramContext, paramAttributeSet);
  }

  public final RecyclerView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new StaggeredGridLayoutManager.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new StaggeredGridLayoutManager.LayoutParams(paramLayoutParams);
  }

  public final void a()
  {
    this.f.a();
    h();
  }

  public final void a(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 0);
  }

  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof StaggeredGridLayoutManager.SavedState))
    {
      this.t = ((StaggeredGridLayoutManager.SavedState)paramParcelable);
      h();
    }
  }

  public final void a(RecyclerView paramRecyclerView, aw paramaw)
  {
    for (int i1 = 0; i1 < this.g; i1++)
      this.h[i1].c();
  }

  public final void a(aw paramaw, bb parambb, View paramView, e parame)
  {
    int i1 = -1;
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof StaggeredGridLayoutManager.LayoutParams))
    {
      super.a(paramView, parame);
      return;
    }
    StaggeredGridLayoutManager.LayoutParams localLayoutParams1 = (StaggeredGridLayoutManager.LayoutParams)localLayoutParams;
    int i9;
    int i5;
    int i3;
    int i2;
    if (this.i == 0)
    {
      int i8 = localLayoutParams1.a();
      if (localLayoutParams1.f)
      {
        i9 = this.g;
        i5 = i9;
        i3 = i8;
        i2 = i1;
      }
    }
    while (true)
    {
      parame.b(n.a(i3, i5, i2, i1, localLayoutParams1.f, false));
      return;
      i9 = 1;
      break;
      i2 = localLayoutParams1.a();
      if (localLayoutParams1.f)
      {
        int i6 = this.g;
        i3 = i1;
        int i7 = i1;
        i1 = i6;
        i5 = i7;
      }
      else
      {
        i3 = i1;
        int i4 = i1;
        i1 = 1;
        i5 = i4;
      }
    }
  }

  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    x localx;
    View localView1;
    View localView2;
    if (k() > 0)
    {
      localx = a.a(paramAccessibilityEvent);
      localView1 = a(false);
      localView2 = b(false);
      if ((localView1 != null) && (localView2 != null));
    }
    else
    {
      return;
    }
    int i1 = c(localView1);
    int i2 = c(localView2);
    if (i1 < i2)
    {
      localx.b(i1);
      localx.c(i2);
      return;
    }
    localx.b(i2);
    localx.c(i1);
  }

  public final void a(String paramString)
  {
    if (this.t == null)
      super.a(paramString);
  }

  public final boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof StaggeredGridLayoutManager.LayoutParams;
  }

  public final int b(int paramInt, aw paramaw, bb parambb)
  {
    return d(paramInt, paramaw, parambb);
  }

  public final int b(aw paramaw, bb parambb)
  {
    if (this.i == 1)
      return this.g;
    return super.b(paramaw, parambb);
  }

  public final int b(bb parambb)
  {
    return g(parambb);
  }

  public final RecyclerView.LayoutParams b()
  {
    return new StaggeredGridLayoutManager.LayoutParams(-2, -2);
  }

  public final void b(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 1);
  }

  public final int c(bb parambb)
  {
    return h(parambb);
  }

  public final void c(int paramInt)
  {
    super.c(paramInt);
    for (int i1 = 0; i1 < this.g; i1++)
      this.h[i1].d(paramInt);
  }

  public final void c(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 2);
  }

  public final void c(aw paramaw, bb parambb)
  {
    g();
    this.f.b = parambb.e();
    bl localbl = this.x;
    localbl.a = -1;
    localbl.b = -2147483648;
    localbl.c = false;
    localbl.d = false;
    label153: label328: int i1;
    label346: int i11;
    label372: int i9;
    if (this.t != null)
    {
      if (this.t.c > 0)
        if (this.t.c == this.g)
        {
          int i21 = 0;
          if (i21 < this.g)
          {
            this.h[i21].c();
            int i22 = this.t.d[i21];
            if (i22 != -2147483648)
            {
              if (!this.t.i)
                break label153;
              i22 += this.a.d();
            }
            while (true)
            {
              this.h[i21].c(i22);
              i21++;
              break;
              i22 += this.a.c();
            }
          }
        }
        else
        {
          this.t.a();
          this.t.a = this.t.b;
        }
      this.s = this.t.j;
      boolean bool3 = this.t.h;
      a(null);
      if ((this.t != null) && (this.t.h != bool3))
        this.t.h = bool3;
      this.l = bool3;
      h();
      v();
      if (this.t.a != -1)
      {
        this.d = this.t.a;
        localbl.c = this.t.i;
        if (this.t.e > 1)
        {
          this.f.a = this.t.f;
          this.f.c = this.t.g;
        }
        if ((!parambb.a()) && (this.d != -1))
          break label561;
        i1 = 0;
        if (i1 == 0)
        {
          if (!this.o)
            break label1115;
          int i10 = parambb.e();
          i11 = -1 + k();
          if (i11 < 0)
            break label1109;
          i9 = c(b(i11));
          if ((i9 < 0) || (i9 >= i10))
            break label1103;
        }
      }
    }
    while (true)
    {
      localbl.a = i9;
      localbl.b = -2147483648;
      if ((this.t == null) && ((localbl.c != this.o) || (w() != this.s)))
      {
        this.f.a();
        localbl.d = true;
      }
      if ((k() <= 0) || ((this.t != null) && (this.t.c > 0)))
        break label1322;
      if (!localbl.d)
        break label1172;
      for (int i5 = 0; i5 < this.g; i5++)
      {
        this.h[i5].c();
        if (localbl.b != -2147483648)
          this.h[i5].c(localbl.b);
      }
      localbl.c = this.c;
      break;
      v();
      localbl.c = this.c;
      break label328;
      label561: if ((this.d < 0) || (this.d >= parambb.e()))
      {
        this.d = -1;
        this.e = -2147483648;
        i1 = 0;
        break label346;
      }
      View localView;
      label652: label715: label744: int i20;
      if ((this.t == null) || (this.t.a == -1) || (this.t.c <= 0))
      {
        localView = a(this.d);
        if (localView != null)
        {
          int i17;
          if (this.c)
          {
            i17 = x();
            localbl.a = i17;
            if (this.e == -2147483648)
              break label744;
            if (!localbl.c)
              break label715;
          }
          for (localbl.b = (this.a.d() - this.e - this.a.b(localView)); ; localbl.b = (this.a.c() + this.e - this.a.a(localView)))
          {
            i1 = 1;
            break;
            i17 = y();
            break label652;
          }
          if (this.a.c(localView) > this.a.f())
            if (localbl.c)
            {
              i20 = this.a.d();
              label779: localbl.b = i20;
            }
        }
      }
      while (true)
      {
        i1 = 1;
        break;
        i20 = this.a.c();
        break label779;
        int i18 = this.a.a(localView) - this.a.c();
        if (i18 < 0)
        {
          localbl.b = (-i18);
        }
        else
        {
          int i19 = this.a.d() - this.a.b(localView);
          if (i19 < 0)
          {
            localbl.b = i19;
          }
          else
          {
            localbl.b = -2147483648;
            continue;
            localbl.a = this.d;
            int i13;
            int i15;
            label919: boolean bool2;
            label928: int i16;
            if (this.e == -2147483648)
            {
              i13 = localbl.a;
              if (k() == 0)
                if (this.c)
                {
                  i15 = 1;
                  if (i15 != 1)
                    break label1012;
                  bool2 = true;
                  localbl.c = bool2;
                  if (!localbl.c)
                    break label1018;
                  i16 = localbl.e.a.d();
                  label953: localbl.b = i16;
                }
            }
            while (true)
            {
              localbl.d = true;
              break;
              i15 = -1;
              break label919;
              if (i13 < y());
              for (int i14 = 1; ; i14 = 0)
              {
                if (i14 == this.c)
                  break label1006;
                i15 = -1;
                break;
              }
              label1006: i15 = 1;
              break label919;
              label1012: bool2 = false;
              break label928;
              label1018: i16 = localbl.e.a.c();
              break label953;
              int i12 = this.e;
              if (localbl.c)
                localbl.b = (localbl.e.a.d() - i12);
              else
                localbl.b = (i12 + localbl.e.a.c());
            }
            localbl.b = -2147483648;
            localbl.a = this.d;
          }
        }
      }
      label1103: i11--;
      break label372;
      label1109: i9 = 0;
      continue;
      label1115: int i6 = parambb.e();
      int i7 = k();
      for (int i8 = 0; ; i8++)
      {
        if (i8 >= i7)
          break label1166;
        i9 = c(b(i8));
        if ((i9 >= 0) && (i9 < i6))
          break;
      }
      label1166: i9 = 0;
    }
    label1172: int i2 = 0;
    if (i2 < this.g)
    {
      bm localbm = this.h[i2];
      boolean bool1 = this.c;
      int i3 = localbl.b;
      int i4;
      if (bool1)
      {
        i4 = localbm.b(-2147483648);
        label1219: localbm.c();
        if ((i4 != -2147483648) && ((!bool1) || (i4 >= localbm.e.a.d())) && ((bool1) || (i4 <= localbm.e.a.c())))
          break label1291;
      }
      while (true)
      {
        i2++;
        break;
        i4 = localbm.a(-2147483648);
        break label1219;
        label1291: if (i3 != -2147483648)
          i4 += i3;
        localbm.b = i4;
        localbm.a = i4;
      }
    }
    label1322: a(paramaw);
    this.y = false;
    this.j = (this.b.f() / this.g);
    this.u = View.MeasureSpec.makeMeasureSpec(this.b.f(), 1073741824);
    if (this.i == 1)
    {
      this.v = View.MeasureSpec.makeMeasureSpec(this.j, 1073741824);
      this.w = View.MeasureSpec.makeMeasureSpec(0, 0);
      if (!localbl.c)
        break label1592;
      a(localbl.a, parambb);
      a(paramaw, this.k, parambb);
      b(localbl.a, parambb);
      v localv2 = this.k;
      localv2.b += this.k.c;
      a(paramaw, this.k, parambb);
      label1465: if (k() > 0)
      {
        if (!this.c)
          break label1659;
        a(paramaw, parambb, true);
        b(paramaw, parambb, false);
      }
    }
    while (true)
    {
      if (!parambb.a())
      {
        if ((k() > 0) && (this.d != -1) && (this.y))
          av.a(b(0), this.A);
        this.d = -1;
        this.e = -2147483648;
      }
      this.o = localbl.c;
      this.s = w();
      this.t = null;
      return;
      this.w = View.MeasureSpec.makeMeasureSpec(this.j, 1073741824);
      this.v = View.MeasureSpec.makeMeasureSpec(0, 0);
      break;
      label1592: b(localbl.a, parambb);
      a(paramaw, this.k, parambb);
      a(localbl.a, parambb);
      v localv1 = this.k;
      localv1.b += this.k.c;
      a(paramaw, this.k, parambb);
      break label1465;
      label1659: b(paramaw, parambb, true);
      a(paramaw, parambb, false);
    }
  }

  public final boolean c()
  {
    return this.t == null;
  }

  public final int d(bb parambb)
  {
    return h(parambb);
  }

  public final Parcelable d()
  {
    if (this.t != null)
      return new StaggeredGridLayoutManager.SavedState(this.t);
    StaggeredGridLayoutManager.SavedState localSavedState = new StaggeredGridLayoutManager.SavedState();
    localSavedState.h = this.l;
    localSavedState.i = this.o;
    localSavedState.j = this.s;
    int i1;
    label118: View localView;
    label136: int i2;
    label143: int i3;
    label170: int i4;
    if ((this.f != null) && (this.f.a != null))
    {
      localSavedState.f = this.f.a;
      localSavedState.e = localSavedState.f.length;
      localSavedState.g = this.f.c;
      if (k() <= 0)
        break label304;
      if (!this.o)
        break label242;
      i1 = x();
      localSavedState.a = i1;
      if (!this.c)
        break label250;
      localView = b(true);
      if (localView != null)
        break label259;
      i2 = -1;
      localSavedState.b = i2;
      localSavedState.c = this.g;
      localSavedState.d = new int[this.g];
      i3 = 0;
      if (i3 >= this.g)
        break label319;
      if (!this.o)
        break label268;
      i4 = this.h[i3].b(-2147483648);
      if (i4 != -2147483648)
        i4 -= this.a.d();
    }
    while (true)
    {
      localSavedState.d[i3] = i4;
      i3++;
      break label170;
      localSavedState.e = 0;
      break;
      label242: i1 = y();
      break label118;
      label250: localView = a(true);
      break label136;
      label259: i2 = c(localView);
      break label143;
      label268: i4 = this.h[i3].a(-2147483648);
      if (i4 != -2147483648)
        i4 -= this.a.c();
    }
    label304: localSavedState.a = -1;
    localSavedState.b = -1;
    localSavedState.c = 0;
    label319: return localSavedState;
  }

  public final void d(int paramInt)
  {
    super.d(paramInt);
    for (int i1 = 0; i1 < this.g; i1++)
      this.h[i1].d(paramInt);
  }

  public final void d(int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 3);
  }

  public final int e(bb parambb)
  {
    return i(parambb);
  }

  public final void e(int paramInt)
  {
    if ((paramInt != 0) || (k() == 0) || (this.n == 0))
      return;
    int i2;
    int i3;
    label41: int i5;
    BitSet localBitSet;
    int i6;
    label96: int i8;
    int i7;
    label112: int i9;
    label122: int i10;
    label126: View localView2;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams1;
    bm localbm;
    int i18;
    label199: View localView1;
    if (this.c)
    {
      int i19 = x();
      i2 = y();
      i3 = i19;
      if (i3 != 0)
        break label532;
      i5 = -1 + k();
      localBitSet = new BitSet(this.g);
      localBitSet.set(0, this.g, true);
      if ((this.i != 1) || (!w()))
        break label245;
      i6 = 1;
      if (!this.c)
        break label251;
      i8 = i5 - 1;
      i7 = -1;
      if (i8 >= i7)
        break label261;
      i9 = 1;
      i10 = i8;
      if (i10 == i7)
        break label526;
      localView2 = b(i10);
      localLayoutParams1 = (StaggeredGridLayoutManager.LayoutParams)localView2.getLayoutParams();
      if (!localBitSet.get(localLayoutParams1.e.d))
        break label307;
      localbm = localLayoutParams1.e;
      if (!this.c)
        break label267;
      if (localbm.b() >= this.a.d())
        break label288;
      i18 = 1;
      if (i18 == 0)
        break label294;
      localView1 = localView2;
      label208: if (localView1 == null)
        break label532;
      this.f.a();
    }
    while (true)
    {
      u();
      h();
      return;
      int i1 = y();
      i2 = x();
      i3 = i1;
      break label41;
      label245: i6 = -1;
      break label96;
      label251: i7 = i5;
      i8 = 0;
      break label112;
      label261: i9 = -1;
      break label122;
      label267: if (localbm.a() > this.a.c())
      {
        i18 = 1;
        break label199;
      }
      label288: i18 = 0;
      break label199;
      label294: localBitSet.clear(localLayoutParams1.e.d);
      label307: if ((!localLayoutParams1.f) && (i10 + i9 != i7))
      {
        View localView3 = b(i10 + i9);
        int i13;
        int i14;
        if (this.c)
        {
          int i16 = this.a.b(localView2);
          int i17 = this.a.b(localView3);
          if (i16 < i17)
          {
            localView1 = localView2;
            break label208;
          }
          i13 = 0;
          if (i16 == i17)
            i13 = 1;
          if (i13 == 0)
            break label516;
          StaggeredGridLayoutManager.LayoutParams localLayoutParams2 = (StaggeredGridLayoutManager.LayoutParams)localView3.getLayoutParams();
          if (localLayoutParams1.e.d - localLayoutParams2.e.d >= 0)
            break label504;
          i14 = 1;
          if (i6 >= 0)
            break label510;
        }
        label504: label510: for (int i15 = 1; ; i15 = 0)
        {
          if (i14 == i15)
            break label516;
          localView1 = localView2;
          break;
          int i11 = this.a.a(localView2);
          int i12 = this.a.a(localView3);
          if (i11 > i12)
          {
            localView1 = localView2;
            break;
          }
          i13 = 0;
          if (i11 != i12)
            break label392;
          i13 = 1;
          break label392;
          i14 = 0;
          break label430;
        }
      }
      label392: label430: i10 += i9;
      label516: break label126;
      label526: localView1 = null;
      break label208;
      label532: if (!this.y)
        break;
      if (this.c);
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1;
      for (int i4 = -1; ; i4 = 1)
      {
        localFullSpanItem1 = this.f.a(i3, i2 + 1, i4);
        if (localFullSpanItem1 != null)
          break;
        this.y = false;
        this.f.a(i2 + 1);
        return;
      }
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2 = this.f.a(i3, localFullSpanItem1.a, i4 * -1);
      if (localFullSpanItem2 == null)
        this.f.a(localFullSpanItem1.a);
      else
        this.f.a(1 + localFullSpanItem2.a);
    }
  }

  public final boolean e()
  {
    return this.i == 0;
  }

  public final int f(bb parambb)
  {
    return i(parambb);
  }

  public final boolean f()
  {
    return this.i == 1;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager
 * JD-Core Version:    0.6.2
 */