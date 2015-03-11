package android.support.v7.widget;

import android.support.v4.view.av;
import android.support.v4.view.cd;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class q extends an
{
  private ArrayList<be> a = new ArrayList();
  private ArrayList<be> b = new ArrayList();
  private ArrayList<s> c = new ArrayList();
  private ArrayList<r> d = new ArrayList();
  private ArrayList<ArrayList<be>> e = new ArrayList();
  private ArrayList<ArrayList<s>> f = new ArrayList();
  private ArrayList<ArrayList<r>> g = new ArrayList();
  private ArrayList<be> h = new ArrayList();
  private ArrayList<be> i = new ArrayList();
  private ArrayList<be> j = new ArrayList();
  private ArrayList<be> k = new ArrayList();

  private void a(r paramr)
  {
    if (paramr.a != null)
      a(paramr, paramr.a);
    if (paramr.b != null)
      a(paramr, paramr.b);
  }

  private static void a(List<be> paramList)
  {
    for (int m = -1 + paramList.size(); m >= 0; m--)
      av.q(((be)paramList.get(m)).a).a();
  }

  private void a(List<r> paramList, be parambe)
  {
    for (int m = -1 + paramList.size(); m >= 0; m--)
    {
      r localr = (r)paramList.get(m);
      if ((a(localr, parambe)) && (localr.a == null) && (localr.b == null))
        paramList.remove(localr);
    }
  }

  private boolean a(r paramr, be parambe)
  {
    boolean bool1 = false;
    if (paramr.b == parambe)
      paramr.b = null;
    while (true)
    {
      av.c(parambe.a, 1.0F);
      av.a(parambe.a, 0.0F);
      av.b(parambe.a, 0.0F);
      a(parambe, bool1);
      boolean bool2 = true;
      be localbe;
      do
      {
        return bool2;
        localbe = paramr.a;
        bool2 = false;
      }
      while (localbe != parambe);
      paramr.a = null;
      bool1 = true;
    }
  }

  private void j()
  {
    if (!b())
      i();
  }

  public final void a()
  {
    int m;
    int n;
    label24: int i1;
    if (!this.a.isEmpty())
    {
      m = 1;
      if (this.c.isEmpty())
        break label72;
      n = 1;
      if (this.d.isEmpty())
        break label77;
      i1 = 1;
      label36: if (this.b.isEmpty())
        break label82;
    }
    label72: label77: label82: for (int i2 = 1; ; i2 = 0)
    {
      if ((m != 0) || (n != 0) || (i2 != 0) || (i1 != 0))
        break label88;
      return;
      m = 0;
      break;
      n = 0;
      break label24;
      i1 = 0;
      break label36;
    }
    label88: Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      final be localbe = (be)localIterator.next();
      final cd localcd = av.q(localbe.a);
      localcd.a(f()).a(0.0F).a(new t(localbe)
      {
        public final void a(View paramAnonymousView)
        {
        }

        public final void b(View paramAnonymousView)
        {
          localcd.a(null);
          av.c(paramAnonymousView, 1.0F);
          q.this.d(localbe);
          q.d(q.this).remove(localbe);
          q.e(q.this);
        }
      }).b();
      this.j.add(localbe);
    }
    this.a.clear();
    Runnable local1;
    label260: Runnable local2;
    label340: final ArrayList localArrayList3;
    Runnable local3;
    long l1;
    label415: long l2;
    if (n != 0)
    {
      final ArrayList localArrayList1 = new ArrayList();
      localArrayList1.addAll(this.c);
      this.f.add(localArrayList1);
      this.c.clear();
      local1 = new Runnable()
      {
        public final void run()
        {
          Iterator localIterator = localArrayList1.iterator();
          while (localIterator.hasNext())
          {
            s locals = (s)localIterator.next();
            q.a(q.this, locals.a, locals.b, locals.c, locals.d, locals.e);
          }
          localArrayList1.clear();
          q.a(q.this).remove(localArrayList1);
        }
      };
      if (m != 0)
        av.a(((s)localArrayList1.get(0)).a.a, local1, f());
    }
    else
    {
      if (i1 != 0)
      {
        final ArrayList localArrayList2 = new ArrayList();
        localArrayList2.addAll(this.d);
        this.g.add(localArrayList2);
        this.d.clear();
        local2 = new Runnable()
        {
          public final void run()
          {
            Iterator localIterator = localArrayList2.iterator();
            while (localIterator.hasNext())
            {
              r localr = (r)localIterator.next();
              q.a(q.this, localr);
            }
            localArrayList2.clear();
            q.b(q.this).remove(localArrayList2);
          }
        };
        if (m == 0)
          break label477;
        av.a(((r)localArrayList2.get(0)).a.a, local2, f());
      }
      if (i2 == 0)
        break label485;
      localArrayList3 = new ArrayList();
      localArrayList3.addAll(this.b);
      this.e.add(localArrayList3);
      this.b.clear();
      local3 = new Runnable()
      {
        public final void run()
        {
          Iterator localIterator = localArrayList3.iterator();
          while (localIterator.hasNext())
          {
            be localbe = (be)localIterator.next();
            q.a(q.this, localbe);
          }
          localArrayList3.clear();
          q.c(q.this).remove(localArrayList3);
        }
      };
      if ((m == 0) && (n == 0) && (i1 == 0))
        break label505;
      if (m == 0)
        break label487;
      l1 = f();
      if (n == 0)
        break label493;
      l2 = d();
      label425: if (i1 == 0)
        break label499;
    }
    label477: label485: label487: label493: label499: for (long l3 = g(); ; l3 = 0L)
    {
      long l4 = l1 + Math.max(l2, l3);
      av.a(((be)localArrayList3.get(0)).a, local3, l4);
      return;
      local1.run();
      break label260;
      local2.run();
      break label340;
      break;
      l1 = 0L;
      break label415;
      l2 = 0L;
      break label425;
    }
    label505: local3.run();
  }

  public final boolean a(be parambe)
  {
    c(parambe);
    this.a.add(parambe);
    return true;
  }

  public final boolean a(be parambe, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = parambe.a;
    int m = (int)(paramInt1 + av.m(parambe.a));
    int n = (int)(paramInt2 + av.n(parambe.a));
    c(parambe);
    int i1 = paramInt3 - m;
    int i2 = paramInt4 - n;
    if ((i1 == 0) && (i2 == 0))
    {
      e(parambe);
      return false;
    }
    if (i1 != 0)
      av.a(localView, -i1);
    if (i2 != 0)
      av.b(localView, -i2);
    this.c.add(new s(parambe, m, n, paramInt3, paramInt4, (byte)0));
    return true;
  }

  public final boolean a(be parambe1, be parambe2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = av.m(parambe1.a);
    float f2 = av.n(parambe1.a);
    float f3 = av.f(parambe1.a);
    c(parambe1);
    int m = (int)(paramInt3 - paramInt1 - f1);
    int n = (int)(paramInt4 - paramInt2 - f2);
    av.a(parambe1.a, f1);
    av.b(parambe1.a, f2);
    av.c(parambe1.a, f3);
    if ((parambe2 != null) && (parambe2.a != null))
    {
      c(parambe2);
      av.a(parambe2.a, -m);
      av.b(parambe2.a, -n);
      av.c(parambe2.a, 0.0F);
    }
    this.d.add(new r(parambe1, parambe2, paramInt1, paramInt2, paramInt3, paramInt4, (byte)0));
    return true;
  }

  public final boolean b()
  {
    return (!this.b.isEmpty()) || (!this.d.isEmpty()) || (!this.c.isEmpty()) || (!this.a.isEmpty()) || (!this.i.isEmpty()) || (!this.j.isEmpty()) || (!this.h.isEmpty()) || (!this.k.isEmpty()) || (!this.f.isEmpty()) || (!this.e.isEmpty()) || (!this.g.isEmpty());
  }

  public final boolean b(be parambe)
  {
    c(parambe);
    av.c(parambe.a, 0.0F);
    this.b.add(parambe);
    return true;
  }

  public final void c()
  {
    for (int m = -1 + this.c.size(); m >= 0; m--)
    {
      s locals2 = (s)this.c.get(m);
      View localView2 = locals2.a.a;
      av.b(localView2, 0.0F);
      av.a(localView2, 0.0F);
      e(locals2.a);
      this.c.remove(m);
    }
    for (int n = -1 + this.a.size(); n >= 0; n--)
    {
      d((be)this.a.get(n));
      this.a.remove(n);
    }
    for (int i1 = -1 + this.b.size(); i1 >= 0; i1--)
    {
      be localbe2 = (be)this.b.get(i1);
      av.c(localbe2.a, 1.0F);
      f(localbe2);
      this.b.remove(i1);
    }
    for (int i2 = -1 + this.d.size(); i2 >= 0; i2--)
      a((r)this.d.get(i2));
    this.d.clear();
    if (!b())
      return;
    for (int i3 = -1 + this.f.size(); i3 >= 0; i3--)
    {
      ArrayList localArrayList3 = (ArrayList)this.f.get(i3);
      for (int i8 = -1 + localArrayList3.size(); i8 >= 0; i8--)
      {
        s locals1 = (s)localArrayList3.get(i8);
        View localView1 = locals1.a.a;
        av.b(localView1, 0.0F);
        av.a(localView1, 0.0F);
        e(locals1.a);
        localArrayList3.remove(i8);
        if (localArrayList3.isEmpty())
          this.f.remove(localArrayList3);
      }
    }
    for (int i4 = -1 + this.e.size(); i4 >= 0; i4--)
    {
      ArrayList localArrayList2 = (ArrayList)this.e.get(i4);
      for (int i7 = -1 + localArrayList2.size(); i7 >= 0; i7--)
      {
        be localbe1 = (be)localArrayList2.get(i7);
        av.c(localbe1.a, 1.0F);
        f(localbe1);
        localArrayList2.remove(i7);
        if (localArrayList2.isEmpty())
          this.e.remove(localArrayList2);
      }
    }
    for (int i5 = -1 + this.g.size(); i5 >= 0; i5--)
    {
      ArrayList localArrayList1 = (ArrayList)this.g.get(i5);
      for (int i6 = -1 + localArrayList1.size(); i6 >= 0; i6--)
      {
        a((r)localArrayList1.get(i6));
        if (localArrayList1.isEmpty())
          this.g.remove(localArrayList1);
      }
    }
    a(this.j);
    a(this.i);
    a(this.h);
    a(this.k);
    i();
  }

  public final void c(be parambe)
  {
    View localView = parambe.a;
    av.q(localView).a();
    for (int m = -1 + this.c.size(); m >= 0; m--)
      if (((s)this.c.get(m)).a == parambe)
      {
        av.b(localView, 0.0F);
        av.a(localView, 0.0F);
        e(parambe);
        this.c.remove(parambe);
      }
    a(this.d, parambe);
    if (this.a.remove(parambe))
    {
      av.c(localView, 1.0F);
      d(parambe);
    }
    if (this.b.remove(parambe))
    {
      av.c(localView, 1.0F);
      f(parambe);
    }
    for (int n = -1 + this.g.size(); n >= 0; n--)
    {
      ArrayList localArrayList3 = (ArrayList)this.g.get(n);
      a(localArrayList3, parambe);
      if (localArrayList3.isEmpty())
        this.g.remove(localArrayList3);
    }
    int i1 = -1 + this.f.size();
    if (i1 >= 0)
    {
      ArrayList localArrayList2 = (ArrayList)this.f.get(i1);
      for (int i3 = -1 + localArrayList2.size(); ; i3--)
      {
        if (i3 >= 0)
        {
          if (((s)localArrayList2.get(i3)).a != parambe)
            continue;
          av.b(localView, 0.0F);
          av.a(localView, 0.0F);
          e(parambe);
          localArrayList2.remove(i3);
          if (localArrayList2.isEmpty())
            this.f.remove(localArrayList2);
        }
        i1--;
        break;
      }
    }
    for (int i2 = -1 + this.e.size(); i2 >= 0; i2--)
    {
      ArrayList localArrayList1 = (ArrayList)this.e.get(i2);
      if (localArrayList1.remove(parambe))
      {
        av.c(localView, 1.0F);
        f(parambe);
        if (localArrayList1.isEmpty())
          this.e.remove(localArrayList1);
      }
    }
    this.j.remove(parambe);
    this.h.remove(parambe);
    this.k.remove(parambe);
    this.i.remove(parambe);
    j();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.q
 * JD-Core Version:    0.6.2
 */