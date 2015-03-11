package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.av;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import textnow.f.a;

public class LinearLayoutManager extends as
{
  private y a;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e;
  private boolean f;
  int i;
  ak j;
  boolean k;
  int l;
  int m;
  LinearLayoutManager.SavedState n;
  final w o;

  private int a(int paramInt, aw paramaw, bb parambb, boolean paramBoolean)
  {
    int i1 = this.j.d() - paramInt;
    if (i1 > 0)
    {
      int i2 = -d(-i1, paramaw, parambb);
      int i3 = paramInt + i2;
      if (paramBoolean)
      {
        int i4 = this.j.d() - i3;
        if (i4 > 0)
        {
          this.j.a(i4);
          i2 += i4;
        }
      }
      return i2;
    }
    return 0;
  }

  private int a(aw paramaw, y paramy, bb parambb, boolean paramBoolean)
  {
    int i1 = paramy.c;
    if (paramy.g != -2147483648)
    {
      if (paramy.c < 0)
        paramy.g += paramy.c;
      a(paramaw, paramy);
    }
    int i2 = paramy.c + paramy.h;
    x localx = new x();
    do
    {
      if ((i2 <= 0) || (!paramy.a(parambb)))
        break;
      localx.a = 0;
      localx.b = false;
      localx.c = false;
      localx.d = false;
      a(paramaw, parambb, paramy, localx);
      if (localx.b)
        break;
      paramy.b += localx.a * paramy.f;
      if ((!localx.c) || (this.a.j != null) || (!parambb.a()))
      {
        paramy.c -= localx.a;
        i2 -= localx.a;
      }
      if (paramy.g != -2147483648)
      {
        paramy.g += localx.a;
        if (paramy.c < 0)
          paramy.g += paramy.c;
        a(paramaw, paramy);
      }
    }
    while ((!paramBoolean) || (!localx.d));
    return i1 - paramy.c;
  }

  private View a(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    int i1 = this.j.c();
    int i2 = this.j.d();
    int i3;
    Object localObject2;
    label32: Object localObject3;
    Object localObject4;
    if (paramInt2 > paramInt1)
    {
      i3 = 1;
      localObject2 = null;
      if (paramInt1 == paramInt2)
        break label151;
      localObject3 = b(paramInt1);
      int i4 = c((View)localObject3);
      if ((i4 < 0) || (i4 >= paramInt3))
        break label166;
      if (!((RecyclerView.LayoutParams)((View)localObject3).getLayoutParams()).c())
        break label107;
      if (localObject2 != null)
        break label166;
      localObject4 = localObject1;
    }
    label151: label166: 
    while (true)
    {
      paramInt1 += i3;
      localObject1 = localObject4;
      localObject2 = localObject3;
      break label32;
      i3 = -1;
      break;
      label107: if ((this.j.a((View)localObject3) >= i2) || (this.j.b((View)localObject3) < i1))
      {
        if (localObject1 == null)
        {
          localObject4 = localObject3;
          localObject3 = localObject2;
          continue;
          if (localObject1 != null)
            localObject3 = localObject1;
        }
      }
      else
      {
        return localObject3;
        return localObject2;
        localObject4 = localObject1;
        localObject3 = localObject2;
      }
    }
  }

  private View a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = this.j.c();
    int i2 = this.j.d();
    int i3;
    if (paramInt2 > paramInt1)
      i3 = 1;
    while (paramInt1 != paramInt2)
    {
      View localView = b(paramInt1);
      int i4 = this.j.a(localView);
      int i5 = this.j.b(localView);
      if ((i4 < i2) && (i5 > i1))
      {
        return localView;
        i3 = -1;
      }
      else
      {
        paramInt1 += i3;
      }
    }
    return null;
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean, bb parambb)
  {
    int i1 = -1;
    int i2 = 1;
    this.a.h = g(parambb);
    this.a.f = paramInt1;
    int i3;
    if (paramInt1 == i2)
    {
      y localy4 = this.a;
      localy4.h += this.j.g();
      View localView2 = y();
      y localy5 = this.a;
      if (this.k);
      while (true)
      {
        localy5.e = i1;
        this.a.d = (c(localView2) + this.a.e);
        this.a.b = this.j.b(localView2);
        i3 = this.j.b(localView2) - this.j.d();
        this.a.c = paramInt2;
        if (paramBoolean)
        {
          y localy3 = this.a;
          localy3.c -= i3;
        }
        this.a.g = i3;
        return;
        i1 = i2;
      }
    }
    View localView1 = x();
    y localy1 = this.a;
    localy1.h += this.j.c();
    y localy2 = this.a;
    if (this.k);
    while (true)
    {
      localy2.e = i2;
      this.a.d = (c(localView1) + this.a.e);
      this.a.b = this.j.a(localView1);
      i3 = -this.j.a(localView1) + this.j.c();
      break;
      i2 = i1;
    }
  }

  private void a(aw paramaw, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2);
    while (true)
    {
      return;
      if (paramInt2 > paramInt1)
        for (int i1 = paramInt2 - 1; i1 >= paramInt1; i1--)
          a(i1, paramaw);
      else
        while (paramInt1 > paramInt2)
        {
          a(paramInt1, paramaw);
          paramInt1--;
        }
    }
  }

  private void a(aw paramaw, y paramy)
  {
    if (!paramy.a);
    while (true)
    {
      return;
      if (paramy.f == -1)
      {
        int i5 = paramy.g;
        int i6 = k();
        if (i5 >= 0)
        {
          int i7 = this.j.e() - i5;
          if (this.k)
            for (int i9 = 0; i9 < i6; i9++)
            {
              View localView4 = b(i9);
              if (this.j.a(localView4) < i7)
              {
                a(paramaw, 0, i9);
                return;
              }
            }
          else
            for (int i8 = i6 - 1; i8 >= 0; i8--)
            {
              View localView3 = b(i8);
              if (this.j.a(localView3) < i7)
              {
                a(paramaw, i6 - 1, i8);
                return;
              }
            }
        }
      }
      else
      {
        int i1 = paramy.g;
        if (i1 >= 0)
        {
          int i2 = k();
          if (this.k)
            for (int i4 = i2 - 1; i4 >= 0; i4--)
            {
              View localView2 = b(i4);
              if (this.j.b(localView2) > i1)
              {
                a(paramaw, i2 - 1, i4);
                return;
              }
            }
          else
            for (int i3 = 0; i3 < i2; i3++)
            {
              View localView1 = b(i3);
              if (this.j.b(localView1) > i1)
              {
                a(paramaw, 0, i3);
                return;
              }
            }
        }
      }
    }
  }

  private void a(w paramw)
  {
    f(paramw.a, paramw.b);
  }

  private int b(int paramInt, aw paramaw, bb parambb, boolean paramBoolean)
  {
    int i1 = paramInt - this.j.c();
    if (i1 > 0)
    {
      int i2 = -d(i1, paramaw, parambb);
      int i3 = paramInt + i2;
      if (paramBoolean)
      {
        int i4 = i3 - this.j.c();
        if (i4 > 0)
        {
          this.j.a(-i4);
          i2 -= i4;
        }
      }
      return i2;
    }
    return 0;
  }

  private void b(w paramw)
  {
    g(paramw.a, paramw.b);
  }

  private int d(int paramInt, aw paramaw, bb parambb)
  {
    if ((k() == 0) || (paramInt == 0))
      return 0;
    this.a.a = true;
    w();
    if (paramInt > 0);
    int i2;
    int i3;
    for (int i1 = 1; ; i1 = -1)
    {
      i2 = Math.abs(paramInt);
      a(i1, i2, true, parambb);
      i3 = this.a.g + a(paramaw, this.a, parambb, false);
      if (i3 >= 0)
        break;
      return 0;
    }
    if (i2 > i3)
      paramInt = i1 * i3;
    this.j.a(-paramInt);
    return paramInt;
  }

  private View f(int paramInt)
  {
    return a(0, k(), paramInt);
  }

  private void f(int paramInt1, int paramInt2)
  {
    this.a.c = (this.j.d() - paramInt2);
    y localy = this.a;
    if (this.k);
    for (int i1 = -1; ; i1 = 1)
    {
      localy.e = i1;
      this.a.d = paramInt1;
      this.a.f = 1;
      this.a.b = paramInt2;
      this.a.g = -2147483648;
      return;
    }
  }

  private int g(bb parambb)
  {
    if (parambb.d())
      return this.j.f();
    return 0;
  }

  private View g(int paramInt)
  {
    return a(-1 + k(), -1, paramInt);
  }

  private void g(int paramInt1, int paramInt2)
  {
    this.a.c = (paramInt2 - this.j.c());
    this.a.d = paramInt1;
    y localy = this.a;
    if (this.k);
    for (int i1 = 1; ; i1 = -1)
    {
      localy.e = i1;
      this.a.f = -1;
      this.a.b = paramInt2;
      this.a.g = -2147483648;
      return;
    }
  }

  private int h(bb parambb)
  {
    if (k() == 0)
      return 0;
    return bg.a(parambb, this.j, x(), y(), this, this.e, this.k);
  }

  private int i(bb parambb)
  {
    if (k() == 0)
      return 0;
    return bg.a(parambb, this.j, x(), y(), this, this.e);
  }

  private int j(bb parambb)
  {
    if (k() == 0)
      return 0;
    return bg.b(parambb, this.j, x(), y(), this, this.e);
  }

  private View k(bb parambb)
  {
    if (this.k)
      return f(parambb.e());
    return g(parambb.e());
  }

  private View l(bb parambb)
  {
    if (this.k)
      return g(parambb.e());
    return f(parambb.e());
  }

  private void v()
  {
    int i1 = 1;
    boolean bool;
    if ((this.i == i1) || (!g()))
      bool = this.c;
    while (true)
    {
      this.k = bool;
      return;
      if (this.c)
        bool = false;
    }
  }

  private void w()
  {
    if (this.a == null)
      this.a = new y();
    if (this.j == null)
      this.j = ak.a(this, this.i);
  }

  private View x()
  {
    if (this.k);
    for (int i1 = -1 + k(); ; i1 = 0)
      return b(i1);
  }

  private View y()
  {
    if (this.k);
    for (int i1 = 0; ; i1 = -1 + k())
      return b(i1);
  }

  public final int a(int paramInt, aw paramaw, bb parambb)
  {
    if (this.i == 1)
      return 0;
    return d(paramInt, paramaw, parambb);
  }

  public final int a(bb parambb)
  {
    return h(parambb);
  }

  public final View a(int paramInt)
  {
    int i1 = k();
    if (i1 == 0);
    int i2;
    do
    {
      return null;
      i2 = paramInt - c(b(0));
    }
    while ((i2 < 0) || (i2 >= i1));
    return b(i2);
  }

  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof LinearLayoutManager.SavedState))
    {
      this.n = ((LinearLayoutManager.SavedState)paramParcelable);
      h();
    }
  }

  public final void a(RecyclerView paramRecyclerView, aw paramaw)
  {
    super.a(paramRecyclerView, paramaw);
    if (this.f)
    {
      for (int i1 = -1 + k(); i1 >= 0; i1--)
        if (!RecyclerView.b(b(i1)).b())
          a(i1, paramaw);
      paramaw.a.clear();
      for (int i2 = -1 + paramaw.b.size(); i2 >= 0; i2--)
        paramaw.c(i2);
      paramaw.b.clear();
    }
  }

  void a(aw paramaw, bb parambb, y paramy, x paramx)
  {
    View localView = paramy.a(paramaw);
    if (localView == null)
    {
      paramx.b = true;
      return;
    }
    RecyclerView.LayoutParams localLayoutParams1 = (RecyclerView.LayoutParams)localView.getLayoutParams();
    boolean bool4;
    label66: int i8;
    int i7;
    label256: int i3;
    int i5;
    int i6;
    int i4;
    if (paramy.j == null)
    {
      boolean bool3 = this.k;
      if (paramy.f == -1)
      {
        bool4 = true;
        if (bool3 != bool4)
          break label370;
        b(localView);
        RecyclerView.LayoutParams localLayoutParams2 = (RecyclerView.LayoutParams)localView.getLayoutParams();
        Rect localRect = this.q.d(localView);
        int i1 = 0 + (localRect.left + localRect.right);
        int i2 = 0 + (localRect.top + localRect.bottom);
        localView.measure(as.a(l(), i1 + (n() + p() + localLayoutParams2.leftMargin + localLayoutParams2.rightMargin), localLayoutParams2.width, e()), as.a(m(), i2 + (o() + q() + localLayoutParams2.topMargin + localLayoutParams2.bottomMargin), localLayoutParams2.height, f()));
        paramx.a = this.j.c(localView);
        if (this.i != 1)
          break label489;
        if (!g())
          break label429;
        i8 = l() - p();
        i7 = i8 - this.j.d(localView);
        if (paramy.f != -1)
          break label452;
        int i11 = paramy.b;
        i3 = paramy.b - paramx.a;
        i5 = i7;
        i6 = i8;
        i4 = i11;
      }
    }
    while (true)
    {
      a(localView, i5 + localLayoutParams1.leftMargin, i3 + localLayoutParams1.topMargin, i6 - localLayoutParams1.rightMargin, i4 - localLayoutParams1.bottomMargin);
      if ((localLayoutParams1.c()) || (localLayoutParams1.d()))
        paramx.c = true;
      paramx.d = localView.isFocusable();
      return;
      bool4 = false;
      break;
      label370: b(localView, 0);
      break label66;
      boolean bool1 = this.k;
      if (paramy.f == -1);
      for (boolean bool2 = true; ; bool2 = false)
      {
        if (bool1 != bool2)
          break label419;
        a(localView);
        break;
      }
      label419: a(localView, 0);
      break label66;
      label429: i7 = n();
      i8 = i7 + this.j.d(localView);
      break label256;
      label452: int i9 = paramy.b;
      int i10 = paramy.b + paramx.a;
      i3 = i9;
      i5 = i7;
      i6 = i8;
      i4 = i10;
      continue;
      label489: i3 = o();
      i4 = i3 + this.j.d(localView);
      if (paramy.f == -1)
      {
        i6 = paramy.b;
        i5 = paramy.b - paramx.a;
      }
      else
      {
        i5 = paramy.b;
        i6 = paramy.b + paramx.a;
      }
    }
  }

  void a(bb parambb, w paramw)
  {
  }

  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i1 = -1;
    super.a(paramAccessibilityEvent);
    textnow.f.x localx;
    View localView1;
    int i2;
    View localView2;
    if (k() > 0)
    {
      localx = a.a(paramAccessibilityEvent);
      localView1 = a(0, k(), false);
      if (localView1 != null)
        break label70;
      i2 = i1;
      localx.b(i2);
      localView2 = a(-1 + k(), i1, false);
      if (localView2 != null)
        break label80;
    }
    while (true)
    {
      localx.c(i1);
      return;
      label70: i2 = c(localView1);
      break;
      label80: i1 = c(localView2);
    }
  }

  public final void a(String paramString)
  {
    if (this.n == null)
      super.a(paramString);
  }

  public final int b(int paramInt, aw paramaw, bb parambb)
  {
    if (this.i == 0)
      return 0;
    return d(paramInt, paramaw, parambb);
  }

  public final int b(bb parambb)
  {
    return h(parambb);
  }

  public RecyclerView.LayoutParams b()
  {
    return new RecyclerView.LayoutParams(-2, -2);
  }

  public final int c(bb parambb)
  {
    return i(parambb);
  }

  public final View c(int paramInt, aw paramaw, bb parambb)
  {
    v();
    if (k() == 0);
    int i1;
    label76: View localView1;
    label96: 
    do
    {
      do
      {
        return null;
        switch (paramInt)
        {
        default:
          i1 = -2147483648;
        case 1:
        case 2:
        case 33:
        case 130:
        case 17:
        case 66:
        }
      }
      while (i1 == -2147483648);
      if (i1 != -1)
        break;
      localView1 = l(parambb);
    }
    while (localView1 == null);
    w();
    a(i1, (int)(0.33F * this.j.f()), false, parambb);
    this.a.g = -2147483648;
    this.a.a = false;
    a(paramaw, this.a, parambb, true);
    if (i1 == -1);
    for (View localView2 = x(); (localView2 != localView1) && (localView2.isFocusable()); localView2 = y())
    {
      return localView2;
      i1 = -1;
      break label76;
      i1 = 1;
      break label76;
      if (this.i == 1)
      {
        i1 = -1;
        break label76;
      }
      i1 = -2147483648;
      break label76;
      if (this.i == 1)
      {
        i1 = 1;
        break label76;
      }
      i1 = -2147483648;
      break label76;
      if (this.i == 0)
      {
        i1 = -1;
        break label76;
      }
      i1 = -2147483648;
      break label76;
      if (this.i == 0)
      {
        i1 = 1;
        break label76;
      }
      i1 = -2147483648;
      break label76;
      localView1 = k(parambb);
      break label96;
    }
  }

  public void c(aw paramaw, bb parambb)
  {
    if ((this.n != null) && (this.n.a()))
      this.l = this.n.a;
    w();
    this.a.a = false;
    v();
    w localw1 = this.o;
    localw1.a = -1;
    localw1.b = -2147483648;
    localw1.c = false;
    this.o.c = (this.k ^ this.d);
    w localw2 = this.o;
    int i1;
    Object localObject;
    label127: int i45;
    label180: int i41;
    label188: int i42;
    label213: int i3;
    label244: int i4;
    label264: int i5;
    int i6;
    View localView1;
    int i39;
    label358: label370: int i8;
    int i7;
    label527: int i9;
    int i10;
    if ((parambb.a()) || (this.l == -1))
    {
      i1 = 0;
      if (i1 == 0)
      {
        if (k() == 0)
          break label1321;
        if (this.q != null)
          break label1115;
        localObject = null;
        if (localObject == null)
          break label1165;
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)((View)localObject).getLayoutParams();
        if ((localLayoutParams.c()) || (localLayoutParams.e() < 0) || (localLayoutParams.e() >= parambb.e()))
          break label1159;
        localw2.a((View)localObject);
        i45 = 1;
        if (i45 == 0)
          break label1165;
        i41 = 1;
        if (i41 == 0)
        {
          localw2.a();
          if (!this.d)
            break label1327;
          i42 = -1 + parambb.e();
          localw2.a = i42;
        }
      }
      int i2 = g(parambb);
      if (parambb.c() >= this.o.a)
        break label1333;
      i3 = 1;
      if (i3 != this.k)
        break label1339;
      int i40 = i2;
      i2 = 0;
      i4 = i40;
      i5 = i2 + this.j.c();
      i6 = i4 + this.j.g();
      if ((parambb.a()) && (this.l != -1) && (this.m != -2147483648))
      {
        localView1 = a(this.l);
        if (localView1 != null)
        {
          if (!this.k)
            break label1345;
          i39 = this.j.d() - this.j.b(localView1) - this.m;
          if (i39 <= 0)
            break label1376;
          i5 += i39;
        }
      }
      a(parambb, this.o);
      a(paramaw);
      this.a.i = parambb.a();
      if (!this.o.c)
        break label1386;
      b(this.o);
      this.a.h = i5;
      a(paramaw, this.a, parambb, false);
      i8 = this.a.b;
      if (this.a.c > 0)
        i6 += this.a.c;
      a(this.o);
      this.a.h = i6;
      y localy4 = this.a;
      localy4.d += this.a.e;
      a(paramaw, this.a, parambb, false);
      i7 = this.a.b;
      if (k() <= 0)
        break label1929;
      if (!(this.k ^ this.d))
        break label1511;
      int i32 = a(i7, paramaw, parambb, true);
      int i33 = i8 + i32;
      int i34 = i7 + i32;
      int i35 = b(i33, paramaw, parambb, false);
      int i36 = i33 + i35;
      int i37 = i34 + i35;
      i9 = i36;
      i10 = i37;
    }
    while (true)
    {
      if ((!parambb.b()) || (k() == 0) || (parambb.a()) || (!c()))
      {
        if (!parambb.a())
        {
          this.l = -1;
          this.m = -2147483648;
          this.j.a();
        }
        this.b = this.d;
        this.n = null;
        return;
        if ((this.l < 0) || (this.l >= parambb.e()))
        {
          this.l = -1;
          this.m = -2147483648;
          i1 = 0;
          break;
        }
        localw2.a = this.l;
        if ((this.n != null) && (this.n.a()))
        {
          localw2.c = this.n.c;
          if (localw2.c);
          for (localw2.b = (this.j.d() - this.n.b); ; localw2.b = (this.j.c() + this.n.b))
          {
            i1 = 1;
            break;
          }
        }
        View localView4;
        if (this.m == -2147483648)
        {
          localView4 = a(this.l);
          if (localView4 != null)
            if (this.j.c(localView4) > this.j.f())
              localw2.a();
        }
        while (true)
        {
          i1 = 1;
          break;
          if (this.j.a(localView4) - this.j.c() < 0)
          {
            localw2.b = this.j.c();
            localw2.c = false;
          }
          else if (this.j.d() - this.j.b(localView4) < 0)
          {
            localw2.b = this.j.d();
            localw2.c = true;
          }
          else
          {
            if (localw2.c);
            for (int i48 = this.j.b(localView4) + this.j.b(); ; i48 = this.j.a(localView4))
            {
              localw2.b = i48;
              i1 = 1;
              break;
            }
            int i47;
            if (k() > 0)
            {
              int i46 = c(b(0));
              if (this.l >= i46)
                break label1047;
              i47 = 1;
              label1020: if (i47 != this.k)
                break label1053;
            }
            label1047: label1053: for (boolean bool = true; ; bool = false)
            {
              localw2.c = bool;
              localw2.a();
              break;
              i47 = 0;
              break label1020;
            }
            localw2.c = this.k;
            if (this.k)
              localw2.b = (this.j.d() - this.m);
            else
              localw2.b = (this.j.c() + this.m);
          }
        }
        label1115: View localView2 = this.q.getFocusedChild();
        if ((localView2 == null) || (this.p.c.contains(localView2)))
        {
          localObject = null;
          break label127;
        }
        localObject = localView2;
        break label127;
        label1159: i45 = 0;
        break label180;
        label1165: if (this.b == this.d)
        {
          View localView3;
          label1191: int i43;
          if (localw2.c)
          {
            localView3 = k(parambb);
            if (localView3 == null)
              break label1321;
            localw2.a(localView3);
            if ((!parambb.a()) && (c()))
            {
              if ((this.j.a(localView3) < this.j.d()) && (this.j.b(localView3) >= this.j.c()))
                break label1303;
              i43 = 1;
              label1258: if (i43 != 0)
                if (!localw2.c)
                  break label1309;
            }
          }
          label1303: label1309: for (int i44 = this.j.d(); ; i44 = this.j.c())
          {
            localw2.b = i44;
            i41 = 1;
            break;
            localView3 = l(parambb);
            break label1191;
            i43 = 0;
            break label1258;
          }
        }
        label1321: i41 = 0;
        break label188;
        label1327: i42 = 0;
        break label213;
        label1333: i3 = 0;
        break label244;
        label1339: i4 = 0;
        break label264;
        label1345: int i38 = this.j.a(localView1) - this.j.c();
        i39 = this.m - i38;
        break label358;
        label1376: i6 -= i39;
        break label370;
        label1386: a(this.o);
        this.a.h = i6;
        a(paramaw, this.a, parambb, false);
        i7 = this.a.b;
        if (this.a.c > 0)
          i5 += this.a.c;
        b(this.o);
        this.a.h = i5;
        y localy1 = this.a;
        localy1.d += this.a.e;
        a(paramaw, this.a, parambb, false);
        i8 = this.a.b;
        break label527;
        label1511: int i26 = b(i8, paramaw, parambb, true);
        int i27 = i8 + i26;
        int i28 = i7 + i26;
        int i29 = a(i28, paramaw, parambb, false);
        int i30 = i27 + i29;
        int i31 = i28 + i29;
        i9 = i30;
        i10 = i31;
        continue;
      }
      int i11 = 0;
      int i12 = 0;
      List localList = paramaw.a();
      int i13 = localList.size();
      int i14 = c(b(0));
      int i15 = 0;
      if (i15 < i13)
      {
        be localbe = (be)localList.get(i15);
        int i20;
        label1640: int i21;
        label1652: int i23;
        int i22;
        if (localbe.c() < i14)
        {
          i20 = 1;
          if (i20 == this.k)
            break label1707;
          i21 = -1;
          if (i21 != -1)
            break label1713;
          int i24 = i11 + this.j.c(localbe.a);
          int i25 = i12;
          i23 = i24;
          i22 = i25;
        }
        while (true)
        {
          i15++;
          i11 = i23;
          i12 = i22;
          break;
          i20 = 0;
          break label1640;
          label1707: i21 = 1;
          break label1652;
          label1713: i22 = i12 + this.j.c(localbe.a);
          i23 = i11;
        }
      }
      this.a.j = localList;
      int i19;
      label1804: y localy2;
      int i16;
      if (i11 > 0)
      {
        g(c(x()), i9);
        this.a.h = i11;
        this.a.c = 0;
        y localy3 = this.a;
        int i18 = localy3.d;
        if (this.k)
        {
          i19 = 1;
          localy3.d = (i19 + i18);
          a(paramaw, this.a, parambb, false);
        }
      }
      else if (i12 > 0)
      {
        f(c(y()), i10);
        this.a.h = i12;
        this.a.c = 0;
        localy2 = this.a;
        i16 = localy2.d;
        if (!this.k)
          break label1923;
      }
      label1923: for (int i17 = -1; ; i17 = 1)
      {
        localy2.d = (i17 + i16);
        a(paramaw, this.a, parambb, false);
        this.a.j = null;
        break;
        i19 = -1;
        break label1804;
      }
      label1929: i9 = i8;
      i10 = i7;
    }
  }

  public boolean c()
  {
    return (this.n == null) && (this.b == this.d);
  }

  public final int d(bb parambb)
  {
    return i(parambb);
  }

  public final Parcelable d()
  {
    if (this.n != null)
      return new LinearLayoutManager.SavedState(this.n);
    LinearLayoutManager.SavedState localSavedState = new LinearLayoutManager.SavedState();
    if (k() > 0)
    {
      boolean bool = this.b ^ this.k;
      localSavedState.c = bool;
      if (bool)
      {
        View localView2 = y();
        localSavedState.b = (this.j.d() - this.j.b(localView2));
        localSavedState.a = c(localView2);
        return localSavedState;
      }
      View localView1 = x();
      localSavedState.a = c(localView1);
      localSavedState.b = (this.j.a(localView1) - this.j.c());
      return localSavedState;
    }
    localSavedState.b();
    return localSavedState;
  }

  public final int e(bb parambb)
  {
    return j(parambb);
  }

  public final boolean e()
  {
    return this.i == 0;
  }

  public final int f(bb parambb)
  {
    return j(parambb);
  }

  public final boolean f()
  {
    return this.i == 1;
  }

  protected final boolean g()
  {
    return av.h(this.q) == 1;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutManager
 * JD-Core Version:    0.6.2
 */