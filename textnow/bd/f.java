package textnow.bd;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class f
{
  private final bk<String, i, ak> a = new bk();
  private final bk<String, i, ak> b = new bk();
  private final bk<s, i, ak> c = new bk();
  private final h d;
  private final k e;
  private final k f;
  private final bl<String, i, ak> g = new bl()
  {
  };
  private final bl<s, i, ak> h = new bl()
  {
  };
  private final d i = new d()
  {
    public final void a(List<u> paramAnonymousList)
    {
      f.a(f.this, paramAnonymousList);
    }
  };
  private final d j = new d()
  {
    public final void a(List<u> paramAnonymousList)
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

  private boolean a(p paramp)
  {
    try
    {
      boolean bool = this.a.a(paramp.a());
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private boolean a(s params)
  {
    try
    {
      boolean bool = this.c.a(params);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static bp[] a(d paramd)
  {
    bp[] arrayOfbp = new bp[7];
    arrayOfbp[0] = new by();
    arrayOfbp[1] = new by();
    arrayOfbp[2] = new a(b.b, paramd);
    arrayOfbp[3] = new a(b.c, paramd);
    arrayOfbp[4] = new a(b.a, paramd);
    arrayOfbp[5] = new br();
    arrayOfbp[6] = new br();
    return arrayOfbp;
  }

  private void b(ak paramak)
  {
    try
    {
      i locali = (i)this.a.a(paramak, this.g, true);
      if (locali != null)
      {
        this.e.b(locali.c);
        p localp = locali.b;
        if (localp.d() == ax.b)
        {
          localp.a(ax.e);
          this.e.a(this.d.a(locali.b));
        }
      }
      return;
    }
    finally
    {
    }
  }

  private boolean b(p paramp)
  {
    try
    {
      boolean bool = this.b.a(paramp.a());
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private s c(p paramp)
  {
    try
    {
      int k = this.d.c(paramp);
      s locals = new s(paramp.a(), k, paramp.b().j);
      return locals;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final g a(p paramp, ak paramak)
  {
    try
    {
      g localg = g.d;
      ax localax = paramp.d();
      if (a(paramp))
      {
        b(paramp, paramak);
        localg = g.a;
      }
      while (true)
      {
        return localg;
        if (b(paramp))
        {
          a(paramp, paramak, ba.b);
          localg = g.b;
        }
        else if (localax != ax.i)
        {
          s locals = c(paramp);
          if (a(locals))
          {
            a(paramp, locals, paramak, ba.b);
            localg = g.c;
          }
        }
      }
    }
    finally
    {
    }
  }

  public final void a(Bitmap paramBitmap, ba paramba, s params)
  {
    try
    {
      List localList = this.c.a(params, this.h);
      this.f.a(new bu(params));
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        if (localIterator.hasNext())
          ((i)localIterator.next()).a.a(new ay(paramBitmap, paramba, az.b));
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
      this.e.a(new bu(paramString));
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          i locali = (i)localIterator.next();
          bo localbo = this.d.b(locali.b);
          this.f.a(localbo);
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
      this.e.a(new bu(paramString1));
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

  public final void a(ak paramak)
  {
    while (true)
    {
      try
      {
        if (this.a.b(paramak))
        {
          b(paramak);
          return;
        }
        if (this.b.b(paramak))
        {
          i locali2 = (i)this.b.a(paramak, this.g, true);
          if (locali2 == null)
            continue;
          this.f.b(locali2.c);
          p localp2 = locali2.b;
          if (localp2.d() != ax.b)
            continue;
          localp2.a(ax.e);
          this.f.a(this.d.b(locali2.b));
          continue;
        }
      }
      finally
      {
      }
      if (this.c.b(paramak))
      {
        i locali1 = (i)this.c.a(paramak, this.h, true);
        if (locali1 != null)
        {
          this.f.b(locali1.c);
          p localp1 = locali1.b;
          if (localp1.d() == ax.b)
          {
            localp1.a(ax.e);
            this.f.a(this.d.a(locali1.b, locali1.e, locali1.d));
          }
        }
      }
    }
  }

  final void a(p paramp, ak paramak, ba paramba)
  {
    try
    {
      bo localbo = this.d.b(paramp);
      i locali = new i(this, paramak, paramp, localbo, paramba);
      this.b.a(paramp.a(), locali, paramak);
      this.f.a(localbo);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void a(p paramp, s params, ak paramak, ba paramba)
  {
    try
    {
      bo localbo = this.d.a(paramp, params, paramba);
      i locali = new i(this, paramak, paramp, localbo, paramba);
      locali.e = params;
      this.c.a(params, locali, paramak);
      this.f.a(localbo);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(s params, String paramString)
  {
    try
    {
      List localList = this.c.a(params, this.h);
      this.f.a(new bu(params));
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
      this.f.a(new bu(paramString));
      this.b.a(paramString, new bm()
      {
      }
      , this.g);
      Iterator localIterator = localArrayList.iterator();
      if (localIterator.hasNext())
        ((ak)localIterator.next()).a(new ay(null, null, az.c));
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
      this.f.a(new bu(paramString1));
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

  final void b(p paramp, ak paramak)
  {
    try
    {
      bo localbo = this.d.a(paramp);
      i locali = new i(this, paramak, paramp, localbo, ba.c);
      this.a.a(paramp.a(), locali, paramak);
      this.e.a(localbo);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.f
 * JD-Core Version:    0.6.2
 */