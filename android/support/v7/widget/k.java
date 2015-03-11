package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;
import textnow.e.n;

final class k
  implements aj
{
  final ArrayList<m> a = new ArrayList();
  final ArrayList<m> b = new ArrayList();
  final l c;
  Runnable d;
  final boolean e;
  final ai f;
  private textnow.e.m<m> g = new n(30);

  k(l paraml)
  {
    this(paraml, false);
  }

  private k(l paraml, boolean paramBoolean)
  {
    this.c = paraml;
    this.e = false;
    this.f = new ai(this);
  }

  private void a(m paramm, int paramInt)
  {
    this.c.a(paramm);
    switch (paramm.a)
    {
    default:
      throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    case 1:
      this.c.a(paramInt, paramm.c);
      return;
    case 2:
    }
    this.c.c(paramInt, paramm.c);
  }

  private int b(int paramInt1, int paramInt2)
  {
    int i = -1 + this.b.size();
    int j = paramInt1;
    if (i >= 0)
    {
      m localm2 = (m)this.b.get(i);
      int n;
      int i1;
      label66: label106: int m;
      if (localm2.a == 3)
        if (localm2.b < localm2.c)
        {
          n = localm2.b;
          i1 = localm2.c;
          if ((j < n) || (j > i1))
            break label204;
          if (n != localm2.b)
            break label159;
          if (paramInt2 != 0)
            break label139;
          localm2.c = (1 + localm2.c);
          m = j + 1;
        }
      while (true)
      {
        i--;
        j = m;
        break;
        n = localm2.c;
        i1 = localm2.b;
        break label66;
        label139: if (paramInt2 != 1)
          break label106;
        localm2.c = (-1 + localm2.c);
        break label106;
        label159: if (paramInt2 == 0)
          localm2.b = (1 + localm2.b);
        while (true)
        {
          m = j - 1;
          break;
          if (paramInt2 == 1)
            localm2.b = (-1 + localm2.b);
        }
        label204: if (j < localm2.b)
        {
          if (paramInt2 == 0)
          {
            localm2.b = (1 + localm2.b);
            localm2.c = (1 + localm2.c);
            m = j;
          }
          else if (paramInt2 == 1)
          {
            localm2.b = (-1 + localm2.b);
            localm2.c = (-1 + localm2.c);
          }
        }
        else
        {
          m = j;
          continue;
          if (localm2.b <= j)
          {
            if (localm2.a == 0)
              m = j - localm2.c;
            else if (localm2.a == 1)
              m = j + localm2.c;
          }
          else if (paramInt2 == 0)
          {
            localm2.b = (1 + localm2.b);
            m = j;
          }
          else
          {
            if (paramInt2 == 1)
              localm2.b = (-1 + localm2.b);
            m = j;
          }
        }
      }
    }
    int k = -1 + this.b.size();
    if (k >= 0)
    {
      m localm1 = (m)this.b.get(k);
      if (localm1.a == 3)
        if ((localm1.c == localm1.b) || (localm1.c < 0))
        {
          this.b.remove(k);
          a(localm1);
        }
      while (true)
      {
        k--;
        break;
        if (localm1.c <= 0)
        {
          this.b.remove(k);
          a(localm1);
        }
      }
    }
    return j;
  }

  private void b(m paramm)
  {
    if ((paramm.a == 0) || (paramm.a == 3))
      throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    int i = b(paramm.b, paramm.a);
    int j = paramm.b;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    label110: int i3;
    int i4;
    switch (paramm.a)
    {
    default:
      throw new IllegalArgumentException("op should be remove or update." + paramm);
    case 2:
      k = 1;
      m = 1;
      n = i;
      i1 = j;
      i2 = 1;
      if (i2 >= paramm.c)
        break label280;
      i3 = b(paramm.b + k * i2, paramm.a);
      switch (paramm.a)
      {
      default:
        i4 = 0;
        label167: if (i4 != 0)
          m++;
        break;
      case 2:
      case 1:
      }
      break;
    case 1:
    }
    while (true)
    {
      i2++;
      break label110;
      k = 0;
      break;
      if (i3 == n + 1)
      {
        i4 = 1;
        break label167;
      }
      i4 = 0;
      break label167;
      if (i3 == n)
      {
        i4 = 1;
        break label167;
      }
      i4 = 0;
      break label167;
      m localm2 = a(paramm.a, n, m);
      a(localm2, i1);
      a(localm2);
      if (paramm.a == 2)
        i1 += m;
      m = 1;
      n = i3;
    }
    label280: a(paramm);
    if (m > 0)
    {
      m localm1 = a(paramm.a, n, m);
      a(localm1, i1);
      a(localm1);
    }
  }

  private boolean b(int paramInt)
  {
    int i = this.b.size();
    for (int j = 0; j < i; j++)
    {
      m localm = (m)this.b.get(j);
      if (localm.a == 3)
      {
        if (a(localm.c, j + 1) == paramInt)
          return true;
      }
      else if (localm.a == 0)
      {
        int k = localm.b + localm.c;
        for (int m = localm.b; m < k; m++)
          if (a(m, j + 1) == paramInt)
            return true;
      }
    }
    return false;
  }

  private void c(m paramm)
  {
    this.b.add(paramm);
    switch (paramm.a)
    {
    default:
      throw new IllegalArgumentException("Unknown update op type for " + paramm);
    case 0:
      this.c.d(paramm.b, paramm.c);
      return;
    case 3:
      this.c.e(paramm.b, paramm.c);
      return;
    case 1:
      this.c.b(paramm.b, paramm.c);
      return;
    case 2:
    }
    this.c.c(paramm.b, paramm.c);
  }

  final int a(int paramInt)
  {
    return a(paramInt, 0);
  }

  final int a(int paramInt1, int paramInt2)
  {
    int i = this.b.size();
    int j = paramInt1;
    m localm;
    if (paramInt2 < i)
    {
      localm = (m)this.b.get(paramInt2);
      if (localm.a == 3)
        if (localm.b == j)
          j = localm.c;
    }
    while (true)
    {
      paramInt2++;
      break;
      if (localm.b < j)
        j--;
      if (localm.c <= j)
      {
        j++;
        continue;
        if (localm.b <= j)
          if (localm.a == 1)
          {
            if (j < localm.b + localm.c)
            {
              j = -1;
              return j;
            }
            j -= localm.c;
          }
          else if (localm.a == 0)
          {
            j += localm.c;
          }
      }
    }
  }

  public final m a(int paramInt1, int paramInt2, int paramInt3)
  {
    m localm = (m)this.g.a();
    if (localm == null)
      return new m(paramInt1, paramInt2, paramInt3);
    localm.a = paramInt1;
    localm.b = paramInt2;
    localm.c = paramInt3;
    return localm;
  }

  final void a()
  {
    this.f.a(this.a);
    int i = this.a.size();
    int j = 0;
    m localm;
    int i8;
    int i9;
    int i10;
    int i11;
    int i12;
    if (j < i)
    {
      localm = (m)this.a.get(j);
      switch (localm.a)
      {
      default:
      case 0:
        while (true)
        {
          if (this.d != null)
            this.d.run();
          j++;
          break;
          c(localm);
        }
      case 1:
        i8 = localm.b;
        i9 = localm.b + localm.c;
        i10 = localm.b;
        i11 = -1;
        i12 = 0;
        label131: if (i10 < i9)
          if ((this.c.a(i10) != null) || (b(i10)))
          {
            if (i11 != 0)
              break label556;
            b(a(1, i8, i12));
          }
        break;
      case 2:
      case 3:
      }
    }
    label550: label556: for (int i13 = 1; ; i13 = 0)
    {
      i11 = 1;
      label185: int i18;
      int i16;
      int i17;
      if (i13 != 0)
      {
        i18 = i10 - i12;
        i16 = i9 - i12;
        i17 = 1;
        label207: int i19 = i18 + 1;
        i12 = i17;
        i9 = i16;
        i10 = i19;
        break label131;
        if (i11 != 1)
          break label550;
        c(a(1, i8, i12));
      }
      for (i13 = 1; ; i13 = 0)
      {
        i11 = 0;
        break label185;
        int i14 = i12 + 1;
        int i15 = i10;
        i16 = i9;
        i17 = i14;
        i18 = i15;
        break label207;
        if (i12 != localm.c)
        {
          a(localm);
          localm = a(1, i8, i12);
        }
        if (i11 == 0)
        {
          b(localm);
          break;
        }
        c(localm);
        break;
        int k = localm.b;
        int m = localm.b + localm.c;
        int n = localm.b;
        int i1 = -1;
        int i2 = 0;
        if (n < m)
        {
          int i3;
          int i4;
          if ((this.c.a(n) != null) || (b(n)))
          {
            if (i1 == 0)
            {
              b(a(2, k, i2));
              i2 = 0;
              k = n;
            }
            i3 = k;
            i4 = i2;
          }
          for (int i5 = 1; ; i5 = 0)
          {
            int i6 = i4 + 1;
            n++;
            int i7 = i5;
            i2 = i6;
            k = i3;
            i1 = i7;
            break;
            if (i1 == 1)
            {
              c(a(2, k, i2));
              i2 = 0;
              k = n;
            }
            i3 = k;
            i4 = i2;
          }
        }
        if (i2 != localm.c)
        {
          a(localm);
          localm = a(2, k, i2);
        }
        if (i1 == 0)
        {
          b(localm);
          break;
        }
        c(localm);
        break;
        c(localm);
        break;
        this.a.clear();
        return;
      }
    }
  }

  public final void a(m paramm)
  {
    if (!this.e)
      this.g.a(paramm);
  }

  final void a(List<m> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++)
      a((m)paramList.get(j));
    paramList.clear();
  }

  final void b()
  {
    int i = this.b.size();
    for (int j = 0; j < i; j++)
      this.c.b((m)this.b.get(j));
    a(this.b);
  }

  final boolean c()
  {
    return this.a.size() > 0;
  }

  final void d()
  {
    b();
    int i = this.a.size();
    int j = 0;
    if (j < i)
    {
      m localm = (m)this.a.get(j);
      switch (localm.a)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        if (this.d != null)
          this.d.run();
        j++;
        break;
        this.c.b(localm);
        this.c.d(localm.b, localm.c);
        continue;
        this.c.b(localm);
        this.c.a(localm.b, localm.c);
        continue;
        this.c.b(localm);
        this.c.c(localm.b, localm.c);
        continue;
        this.c.b(localm);
        this.c.e(localm.b, localm.c);
      }
    }
    a(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.k
 * JD-Core Version:    0.6.2
 */