package textnow.bk;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class f
{
  private final bl<String, i, al> a = new bl();
  private final bl<String, i, al> b = new bl();
  private final bl<t, i, al> c = new bl();
  private final h d;
  private final k e;
  private final k f;
  private final bm<String, i, al> g = new bm()
  {
  };
  private final bm<t, i, al> h = new bm()
  {
  };
  private final d i = new d()
  {
    public final void a(List<v> paramAnonymousList)
    {
      f.a(f.this, paramAnonymousList);
    }
  };
  private final d j = new d()
  {
    public final void a(List<v> paramAnonymousList)
    {
      f.b(f.this, paramAnonymousList);
    }
  };

  public f(h paramh)
  {
    this.d = paramh;
    this.e = new m(a(this.i)).a(3).a();
    this.f = new m(a(this.j)).a(1).a();
  }

  private boolean a(q paramq)
  {
    try
    {
      boolean bool = this.a.a(paramq.a());
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private boolean a(t paramt)
  {
    try
    {
      boolean bool = this.c.a(paramt);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static br[] a(d paramd)
  {
    br[] arrayOfbr = new br[7];
    arrayOfbr[0] = new ca();
    arrayOfbr[1] = new ca();
    arrayOfbr[2] = new a(b.b, paramd);
    arrayOfbr[3] = new a(b.c, paramd);
    arrayOfbr[4] = new a(b.a, paramd);
    arrayOfbr[5] = new bt();
    arrayOfbr[6] = new bt();
    return arrayOfbr;
  }

  private void b(al paramal)
  {
    try
    {
      i locali = (i)this.a.a(paramal, this.g, true);
      if (locali != null)
      {
        this.e.b(locali.c);
        q localq = locali.b;
        if (localq.d() == ay.b)
        {
          localq.a(ay.e);
          this.e.a(this.d.a(locali.b));
        }
      }
      return;
    }
    finally
    {
    }
  }

  private boolean b(q paramq)
  {
    try
    {
      boolean bool = this.b.a(paramq.a());
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private t c(q paramq)
  {
    try
    {
      int k = this.d.c(paramq);
      t localt = new t(paramq.a(), k, paramq.b().j);
      return localt;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final g a(q paramq, al paramal)
  {
    try
    {
      g localg = g.d;
      ay localay = paramq.d();
      if (a(paramq))
      {
        b(paramq, paramal);
        localg = g.a;
      }
      while (true)
      {
        return localg;
        if (b(paramq))
        {
          a(paramq, paramal, bb.b);
          localg = g.b;
        }
        else if (localay != ay.i)
        {
          t localt = c(paramq);
          if (a(localt))
          {
            a(paramq, localt, paramal, bb.b);
            localg = g.c;
          }
        }
      }
    }
    finally
    {
    }
  }

  public final void a(Bitmap paramBitmap, bb parambb, t paramt)
  {
    try
    {
      List localList = this.c.a(paramt, this.h);
      this.f.a(new bw(paramt));
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        if (localIterator.hasNext())
          ((i)localIterator.next()).a.a(new az(paramBitmap, parambb, ba.b));
      }
    }
    finally
    {
    }
  }

  public final void a(String paramString)
  {
    try
    {
      List localList = this.a.a(paramString, this.b, this.g);
      this.e.a(new bw(paramString));
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          i locali = (i)localIterator.next();
          bq localbq = this.d.b(locali.b);
          this.f.a(localbq);
        }
      }
    }
    finally
    {
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    try
    {
      List localList = this.a.a(paramString1, this.g);
      this.e.a(new bw(paramString1));
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        if (localIterator.hasNext())
          ((i)localIterator.next()).a.a(paramString2);
      }
    }
    finally
    {
    }
  }

  public final void a(al paramal)
  {
    while (true)
    {
      try
      {
        if (this.a.b(paramal))
        {
          b(paramal);
          return;
        }
        if (this.b.b(paramal))
        {
          i locali2 = (i)this.b.a(paramal, this.g, true);
          if (locali2 == null)
            continue;
          this.f.b(locali2.c);
          q localq2 = locali2.b;
          if (localq2.d() != ay.b)
            continue;
          localq2.a(ay.e);
          this.f.a(this.d.b(locali2.b));
          continue;
        }
      }
      finally
      {
      }
      if (this.c.b(paramal))
      {
        i locali1 = (i)this.c.a(paramal, this.h, true);
        if (locali1 != null)
        {
          this.f.b(locali1.c);
          q localq1 = locali1.b;
          if (localq1.d() == ay.b)
          {
            localq1.a(ay.e);
            this.f.a(this.d.a(locali1.b, locali1.e, locali1.d));
          }
        }
      }
    }
  }

  final void a(q paramq, al paramal, bb parambb)
  {
    try
    {
      bq localbq = this.d.b(paramq);
      i locali = new i(this, paramal, paramq, localbq, parambb);
      this.b.a(paramq.a(), locali, paramal);
      this.f.a(localbq);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void a(q paramq, t paramt, al paramal, bb parambb)
  {
    try
    {
      bq localbq = this.d.a(paramq, paramt, parambb);
      i locali = new i(this, paramal, paramq, localbq, parambb);
      locali.e = paramt;
      this.c.a(paramt, locali, paramal);
      this.f.a(localbq);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(t paramt, String paramString)
  {
    try
    {
      List localList = this.c.a(paramt, this.h);
      this.f.a(new bw(paramt));
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        if (localIterator.hasNext())
          ((i)localIterator.next()).a.a(paramString);
      }
    }
    finally
    {
    }
  }

  public final void b(String paramString)
  {
    final ArrayList localArrayList = new ArrayList();
    try
    {
      this.f.a(new bw(paramString));
      this.b.a(paramString, new bn()
      {
      }
      , this.g);
      Iterator localIterator = localArrayList.iterator();
      if (localIterator.hasNext())
        ((al)localIterator.next()).a(new az(null, null, ba.c));
    }
    finally
    {
    }
  }

  public final void b(String paramString1, String paramString2)
  {
    try
    {
      List localList = this.b.a(paramString1, this.g);
      this.f.a(new bw(paramString1));
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        if (localIterator.hasNext())
          ((i)localIterator.next()).a.a(paramString2);
      }
    }
    finally
    {
    }
  }

  final void b(q paramq, al paramal)
  {
    try
    {
      bq localbq = this.d.a(paramq);
      i locali = new i(this, paramal, paramq, localbq, bb.c);
      this.a.a(paramq.a(), locali, paramal);
      this.e.a(localbq);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.f
 * JD-Core Version:    0.6.2
 */