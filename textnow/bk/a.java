package textnow.bk;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

final class a
  implements br
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

  private c a(p paramp, c[] paramArrayOfc)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject3;
    if ((j < paramArrayOfc.length) && (localObject1 == null))
    {
      localObject3 = paramArrayOfc[j];
      if ((localObject3 == null) || (!((c)localObject3).a.equals(paramp)))
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
        ((c)localObject1).a = paramp;
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

  private v a(boolean paramBoolean)
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
      v localv = (v)localList.remove(0);
      q localq;
      if (this.d == b.a)
      {
        ay localay = localv.a.d();
        localq = localv.c();
        p localp = localq.e();
        if (localay == ay.e)
        {
          if (m >= localp.c)
            break label261;
          localq.a(ay.f);
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
        return localv;
        label261: localq.a(ay.g);
      }
    }
    return (v)arrayOfc[m].b.get(0);
  }

  public final bq a()
  {
    try
    {
      v localv = a(true);
      return localv;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(bq parambq)
  {
    v localv;
    p localp;
    int i;
    c[] arrayOfc;
    try
    {
      localv = (v)parambq;
      localp = localv.c().e();
      i = localp.a;
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
    int j = localp.c + localp.d;
    while (true)
    {
      arrayOfc = new c[j];
      label147: this.b.append(i, arrayOfc);
      a(localp, arrayOfc).b.add(localv);
      this.c = (1 + this.c);
      return;
      j = localp.d;
      continue;
      j = localp.c;
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

  public final bq c()
  {
    try
    {
      v localv = a(false);
      return localv;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.a
 * JD-Core Version:    0.6.2
 */