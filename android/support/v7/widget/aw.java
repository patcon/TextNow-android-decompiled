package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aw
{
  final ArrayList<be> a = new ArrayList();
  final ArrayList<be> b = new ArrayList();
  private ArrayList<be> d = null;
  private final List<be> e = Collections.unmodifiableList(this.a);
  private int f = 2;
  private av g;
  private bc h;

  public aw(RecyclerView paramRecyclerView)
  {
  }

  private be a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    int j = this.a.size();
    be localbe1;
    for (int k = 0; k < j; k++)
    {
      localbe1 = (be)this.a.get(k);
      if ((!localbe1.f()) && (localbe1.c() == paramInt1) && (!localbe1.h()) && ((bb.d(this.c.f)) || (!localbe1.l())))
      {
        localbe1.a(32);
        return localbe1;
      }
    }
    int i1;
    label126: View localView;
    if (!paramBoolean)
    {
      n localn = this.c.c;
      int n = localn.c.size();
      i1 = 0;
      if (i1 >= n)
        break label275;
      localView = (View)localn.c.get(i1);
      be localbe2 = localn.a.b(localView);
      if ((localbe2.c() != paramInt1) || (localbe2.h()))
        break label269;
      label181: if (localView != null)
        this.c.e.c(this.c.a(localView));
    }
    int m = this.b.size();
    while (true)
    {
      if (i >= m)
        break label287;
      localbe1 = (be)this.b.get(i);
      if ((!localbe1.h()) && (localbe1.c() == paramInt1))
      {
        if (paramBoolean)
          break;
        this.b.remove(i);
        return localbe1;
        label269: i1++;
        break label126;
        label275: localView = null;
        break label181;
      }
      i++;
    }
    label287: return null;
  }

  private be a(long paramLong, int paramInt, boolean paramBoolean)
  {
    be localbe;
    for (int i = -1 + this.a.size(); i >= 0; i--)
    {
      localbe = (be)this.a.get(i);
      if ((localbe.d == paramLong) && (!localbe.f()))
      {
        if (paramInt == localbe.e)
        {
          localbe.a(32);
          if ((localbe.l()) && (!this.c.f.a()))
            localbe.a(2, 14);
          return localbe;
        }
        if (!paramBoolean)
        {
          this.a.remove(i);
          RecyclerView.b(this.c, localbe.a, false);
          b(localbe.a);
        }
      }
    }
    for (int j = -1 + this.b.size(); ; j--)
    {
      if (j < 0)
        break label224;
      localbe = (be)this.b.get(j);
      if (localbe.d == paramLong)
      {
        if (paramInt == localbe.e)
        {
          if (paramBoolean)
            break;
          this.b.remove(j);
          return localbe;
        }
        if (!paramBoolean)
          c(j);
      }
    }
    label224: return null;
  }

  private void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    for (int i = -1 + paramViewGroup.getChildCount(); i >= 0; i--)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup))
        a((ViewGroup)localView, true);
    }
    if (!paramBoolean)
      return;
    if (paramViewGroup.getVisibility() == 4)
    {
      paramViewGroup.setVisibility(0);
      paramViewGroup.setVisibility(4);
      return;
    }
    int j = paramViewGroup.getVisibility();
    paramViewGroup.setVisibility(4);
    paramViewGroup.setVisibility(j);
  }

  private av c()
  {
    if (this.g == null)
      this.g = new av();
    return this.g;
  }

  private void c(be parambe)
  {
    if (RecyclerView.m(this.c) != null)
      RecyclerView.m(this.c);
    if (RecyclerView.f(this.c) != null)
      RecyclerView.f(this.c);
    if (this.c.f != null)
      this.c.f.a(parambe);
  }

  private be d(int paramInt)
  {
    int i = 0;
    int j;
    if (this.d != null)
    {
      j = this.d.size();
      if (j != 0);
    }
    else
    {
      return null;
    }
    for (int k = 0; k < j; k++)
    {
      be localbe2 = (be)this.d.get(k);
      if ((!localbe2.f()) && (localbe2.c() == paramInt))
      {
        localbe2.a(32);
        return localbe2;
      }
    }
    if (RecyclerView.f(this.c).c())
    {
      int m = this.c.b.a(paramInt, 0);
      if ((m > 0) && (m < RecyclerView.f(this.c).b()))
      {
        RecyclerView.f(this.c);
        while (i < j)
        {
          be localbe1 = (be)this.d.get(i);
          if ((!localbe1.f()) && (localbe1.d == -1L))
          {
            localbe1.a(32);
            return localbe1;
          }
          i++;
        }
      }
    }
    return null;
  }

  public final int a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c.f.e()))
      throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State " + "item count is " + this.c.f.e());
    if (!this.c.f.a())
      return paramInt;
    return this.c.b.a(paramInt);
  }

  public final List<be> a()
  {
    return this.e;
  }

  final void a(be parambe)
  {
    boolean bool1 = true;
    if ((parambe.d()) || (parambe.a.getParent() != null))
    {
      StringBuilder localStringBuilder = new StringBuilder().append("Scrapped or attached views may not be recycled. isScrap:").append(parambe.d()).append(" isAttached:");
      if (parambe.a.getParent() != null);
      while (true)
      {
        throw new IllegalArgumentException(bool1);
        bool1 = false;
      }
    }
    if (parambe.b())
      throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
    if (parambe.n())
    {
      boolean bool2 = parambe.h();
      int i = 0;
      if (!bool2)
        if (!bb.d(this.c.f))
        {
          boolean bool4 = parambe.l();
          i = 0;
          if (bool4);
        }
        else
        {
          boolean bool3 = parambe.j();
          i = 0;
          if (!bool3)
          {
            if ((this.b.size() == this.f) && (!this.b.isEmpty()))
              for (int m = 0; (m < this.b.size()) && (!c(m)); m++);
            int j = this.b.size();
            int k = this.f;
            i = 0;
            if (j < k)
            {
              this.b.add(parambe);
              i = bool1;
            }
          }
        }
      if (i == 0)
      {
        c().a(parambe);
        c(parambe);
      }
    }
    this.c.f.a(parambe);
  }

  public final void a(View paramView)
  {
    be localbe = RecyclerView.b(paramView);
    if (localbe.d())
      localbe.e();
    while (true)
    {
      a(localbe);
      return;
      if (localbe.f())
        localbe.g();
    }
  }

  public final View b(int paramInt)
  {
    int i = 1;
    if ((paramInt < 0) || (paramInt >= this.c.f.e()))
      throw new IndexOutOfBoundsException("Invalid item position " + paramInt + "(" + paramInt + "). Item count:" + this.c.f.e());
    int i4;
    int j;
    Object localObject1;
    if (this.c.f.a())
    {
      be localbe3 = d(paramInt);
      if (localbe3 != null)
      {
        i4 = i;
        j = i4;
        localObject1 = localbe3;
      }
    }
    while (true)
    {
      int i3;
      label262: int k;
      if (localObject1 == null)
      {
        localObject1 = a(paramInt, -1, false);
        if (localObject1 != null)
          if (!((be)localObject1).l())
          {
            if ((((be)localObject1).b < 0) || (((be)localObject1).b >= RecyclerView.f(this.c).b()))
            {
              throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + localObject1);
              i4 = 0;
              break;
            }
            if (!this.c.f.a())
            {
              RecyclerView.f(this.c);
              if (((be)localObject1).e != 0)
              {
                i3 = 0;
                if (i3 != 0)
                  break label447;
                ((be)localObject1).a(4);
                if (!((be)localObject1).d())
                  break label433;
                RecyclerView.a(this.c, ((be)localObject1).a, false);
                ((be)localObject1).e();
                a((be)localObject1);
                localObject1 = null;
                k = j;
              }
            }
          }
      }
      while (true)
      {
        label433: label447: be localbe1;
        int m;
        if (localObject1 == null)
        {
          int i2 = this.c.b.a(paramInt);
          if ((i2 < 0) || (i2 >= RecyclerView.f(this.c).b()))
          {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + i2 + ")." + "state:" + this.c.f.e());
            if (RecyclerView.f(this.c).c())
            {
              long l = ((be)localObject1).d;
              RecyclerView.f(this.c);
              if (l == -1L)
              {
                i3 = i;
                break;
              }
              i3 = 0;
              break;
            }
            i3 = i;
            break;
            if (!((be)localObject1).f())
              break label262;
            ((be)localObject1).g();
            break label262;
            k = i;
            continue;
          }
          RecyclerView.f(this.c);
          if (RecyclerView.f(this.c).c())
          {
            RecyclerView.f(this.c);
            localObject1 = a(-1L, 0, false);
            if (localObject1 != null)
            {
              ((be)localObject1).b = i2;
              k = i;
            }
          }
          if ((localObject1 == null) && (this.h != null))
          {
            View localView2 = this.h.a();
            if (localView2 != null)
            {
              localObject1 = this.c.a(localView2);
              if (localObject1 == null)
                throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
              if (((be)localObject1).b())
                throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
            }
          }
          if (localObject1 == null)
          {
            av localav = c();
            RecyclerView.f(this.c);
            be localbe2 = localav.a(0);
            if (localbe2 != null)
            {
              localbe2.m();
              if ((RecyclerView.f()) && ((localbe2.a instanceof ViewGroup)))
                a((ViewGroup)localbe2.a, false);
            }
            localObject1 = localbe2;
          }
          if (localObject1 == null)
          {
            al localal = RecyclerView.f(this.c);
            RecyclerView.f(this.c);
            localbe1 = localal.a();
            localbe1.e = 0;
            m = k;
          }
        }
        for (Object localObject2 = localbe1; ; localObject2 = localObject1)
        {
          int i1;
          if ((this.c.f.a()) && (((be)localObject2).k()))
          {
            ((be)localObject2).f = paramInt;
            i1 = 0;
          }
          while (true)
          {
            ViewGroup.LayoutParams localLayoutParams = ((be)localObject2).a.getLayoutParams();
            RecyclerView.LayoutParams localLayoutParams1;
            if (localLayoutParams == null)
            {
              localLayoutParams1 = (RecyclerView.LayoutParams)this.c.generateDefaultLayoutParams();
              ((be)localObject2).a.setLayoutParams(localLayoutParams1);
              label756: localLayoutParams1.a = ((be)localObject2);
              if ((m == 0) || (i1 == 0))
                break label977;
            }
            while (true)
            {
              localLayoutParams1.d = i;
              return ((be)localObject2).a;
              if ((((be)localObject2).k()) && (!((be)localObject2).i()) && (!((be)localObject2).h()))
                break label982;
              int n = this.c.b.a(paramInt);
              RecyclerView.f(this.c).a((be)localObject2, n);
              View localView1 = ((be)localObject2).a;
              if ((RecyclerView.k(this.c) != null) && (RecyclerView.k(this.c).isEnabled()))
              {
                if (android.support.v4.view.av.e(localView1) == 0)
                  android.support.v4.view.av.c(localView1, i);
                if (!android.support.v4.view.av.b(localView1))
                  android.support.v4.view.av.a(localView1, RecyclerView.l(this.c).b());
              }
              if (this.c.f.a())
                ((be)localObject2).f = paramInt;
              i1 = i;
              break;
              if (!this.c.checkLayoutParams(localLayoutParams))
              {
                localLayoutParams1 = (RecyclerView.LayoutParams)this.c.generateLayoutParams(localLayoutParams);
                ((be)localObject2).a.setLayoutParams(localLayoutParams1);
                break label756;
              }
              localLayoutParams1 = (RecyclerView.LayoutParams)localLayoutParams;
              break label756;
              label977: i = 0;
            }
            label982: i1 = 0;
          }
          m = k;
        }
        k = j;
      }
      localObject1 = null;
      j = 0;
    }
  }

  final void b()
  {
    int i = 0;
    int j = this.b.size();
    for (int k = 0; k < j; k++)
      ((be)this.b.get(k)).a();
    int m = this.a.size();
    for (int n = 0; n < m; n++)
      ((be)this.a.get(n)).a();
    if (this.d != null)
    {
      int i1 = this.d.size();
      while (i < i1)
      {
        ((be)this.d.get(i)).a();
        i++;
      }
    }
  }

  final void b(be parambe)
  {
    if ((!parambe.j()) || (!RecyclerView.g(this.c)) || (this.d == null))
      this.a.remove(parambe);
    while (true)
    {
      be.a(parambe, null);
      parambe.g();
      return;
      this.d.remove(parambe);
    }
  }

  final void b(View paramView)
  {
    be localbe = RecyclerView.b(paramView);
    be.a(localbe, null);
    localbe.g();
    a(localbe);
  }

  final void c(View paramView)
  {
    be localbe = RecyclerView.b(paramView);
    localbe.a(this);
    if ((!localbe.j()) || (!RecyclerView.g(this.c)))
    {
      if ((localbe.h()) && (!localbe.l()) && (!RecyclerView.f(this.c).c()))
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
      this.a.add(localbe);
      return;
    }
    if (this.d == null)
      this.d = new ArrayList();
    this.d.add(localbe);
  }

  final boolean c(int paramInt)
  {
    be localbe = (be)this.b.get(paramInt);
    if (localbe.n())
    {
      c().a(localbe);
      c(localbe);
      this.b.remove(paramInt);
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.aw
 * JD-Core Version:    0.6.2
 */