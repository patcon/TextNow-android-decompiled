package textnow.bd;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

final class a
  implements bp
{
  private final List<Integer> a = new ArrayList();
  private final SparseArray<c[]> b = new SparseArray();
  private int c = 0;
  private final b d;
  private final d e;

  public a(b paramb, d paramd)
  {
    if (paramb == null)
      throw new IllegalArgumentException("The adapter accessor type cannot be null.");
    this.d = paramb;
    this.e = paramd;
  }

  private c a(o paramo, c[] paramArrayOfc)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject3;
    if ((j < paramArrayOfc.length) && (localObject1 == null))
    {
      localObject3 = paramArrayOfc[j];
      if ((localObject3 == null) || (!((c)localObject3).a.equals(paramo)))
        break label248;
    }
    while (true)
    {
      j++;
      localObject1 = localObject3;
      break;
      Object localObject2;
      if (localObject1 == null)
      {
        localObject1 = new c((byte)0);
        ((c)localObject1).a = paramo;
        ((c)localObject1).b = new ArrayList();
        switch (1.a[this.d.ordinal()])
        {
        default:
          localObject2 = localObject1;
        case 1:
        case 2:
        case 3:
        }
      }
      while (true)
      {
        if (localObject2 != null)
        {
          if (this.e != null)
            this.e.a(localObject2.b);
          this.c -= localObject2.b.size();
        }
        return localObject1;
        c localc2;
        for (localObject2 = localObject1; (i < paramArrayOfc.length) && (localObject2 != null); localObject2 = localc2)
        {
          localc2 = paramArrayOfc[i];
          paramArrayOfc[i] = localObject2;
          i++;
        }
        int k = -1 + paramArrayOfc.length;
        c localc1;
        for (localObject2 = localObject1; k >= 0; localObject2 = localc1)
        {
          localc1 = paramArrayOfc[k];
          paramArrayOfc[k] = localObject2;
          k--;
        }
      }
      label248: localObject3 = localObject1;
    }
  }

  private u a(boolean paramBoolean)
  {
    if (this.c == 0)
      return null;
    if (this.a.isEmpty())
      throw new IllegalStateException("Fatal error: The size of the accessor cannot be non-zero while there are no pending adapter ids!");
    int i = ((Integer)this.a.get(-1 + this.a.size())).intValue();
    c[] arrayOfc = (c[])this.b.get(i);
    int j = 0;
    int k = 0;
    int m = -1;
    while (j < arrayOfc.length)
    {
      if (arrayOfc[j] != null)
      {
        k++;
        if (m == -1)
          m = j;
      }
      j++;
    }
    if (paramBoolean)
    {
      List localList = arrayOfc[m].b;
      u localu = (u)localList.remove(0);
      p localp;
      if (this.d == b.a)
      {
        ax localax = localu.a.d();
        localp = localu.c();
        o localo = localp.e();
        if (localax == ax.e)
        {
          if (m >= localo.c)
            break label261;
          localp.a(ax.f);
        }
      }
      while (true)
      {
        if (localList.isEmpty())
        {
          arrayOfc[m] = null;
          if (k - 1 == 0)
          {
            this.b.remove(Integer.valueOf(i).intValue());
            this.a.remove(Integer.valueOf(i));
          }
        }
        this.c = (-1 + this.c);
        return localu;
        label261: localp.a(ax.g);
      }
    }
    return (u)arrayOfc[m].b.get(0);
  }

  public final bo a()
  {
    try
    {
      u localu = a(true);
      return localu;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(bo parambo)
  {
    u localu;
    o localo;
    int i;
    c[] arrayOfc;
    try
    {
      localu = (u)parambo;
      localo = localu.c().e();
      i = localo.a;
      if (!this.a.contains(Integer.valueOf(i)))
        this.a.add(Integer.valueOf(i));
      arrayOfc = (c[])this.b.get(i);
      if (arrayOfc != null)
        break label147;
      switch (1.a[this.d.ordinal()])
      {
      default:
        throw new IllegalStateException("The adapter accessor type cannot be null.");
      case 1:
      case 2:
      case 3:
      }
    }
    finally
    {
    }
    int j = localo.c + localo.d;
    while (true)
    {
      arrayOfc = new c[j];
      label147: this.b.append(i, arrayOfc);
      a(localo, arrayOfc).b.add(localu);
      this.c = (1 + this.c);
      return;
      j = localo.d;
      continue;
      j = localo.c;
    }
  }

  public final int b()
  {
    try
    {
      int i = this.c;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final bo c()
  {
    try
    {
      u localu = a(false);
      return localu;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.a
 * JD-Core Version:    0.6.2
 */