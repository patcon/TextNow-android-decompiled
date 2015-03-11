package textnow.z;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import textnow.ab.g;
import textnow.ac.p;

public final class h
{
  private g a = g.a;
  private v b = v.a;
  private e c = d.a;
  private final Map<Type, i<?>> d = new HashMap();
  private final List<z> e = new ArrayList();
  private final List<z> f = new ArrayList();
  private boolean g;
  private String h;
  private int i = 2;
  private int j = 2;
  private boolean k;
  private boolean l;
  private boolean m = true;
  private boolean n;
  private boolean o;

  public final h a()
  {
    this.g = true;
    return this;
  }

  public final h a(Type paramType, Object paramObject)
  {
    boolean bool1;
    textnow.ad.a locala;
    List localList;
    if (((paramObject instanceof t)) || ((paramObject instanceof l)) || ((paramObject instanceof i)) || ((paramObject instanceof y)))
    {
      bool1 = true;
      textnow.ab.a.a(bool1);
      if ((paramObject instanceof i))
        this.d.put(paramType, (i)paramObject);
      if (((paramObject instanceof t)) || ((paramObject instanceof l)))
      {
        locala = textnow.ad.a.a(paramType);
        localList = this.e;
        if (locala.b() != locala.a())
          break label155;
      }
    }
    label155: for (boolean bool2 = true; ; bool2 = false)
    {
      localList.add(new x(paramObject, locala, bool2, null, (byte)0));
      if ((paramObject instanceof y))
        this.e.add(p.a(textnow.ad.a.a(paramType), (y)paramObject));
      return this;
      bool1 = false;
      break;
    }
  }

  public final h a(d paramd)
  {
    this.c = paramd;
    return this;
  }

  public final h b()
  {
    this.n = true;
    return this;
  }

  public final f c()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.e);
    Collections.reverse(localArrayList);
    localArrayList.addAll(this.f);
    String str = this.h;
    int i1 = this.i;
    int i2 = this.j;
    if ((str != null) && (!"".equals(str.trim())));
    for (a locala = new a(str); ; locala = new a(i1, i2))
    {
      localArrayList.add(w.a(textnow.ad.a.a(java.util.Date.class), locala));
      localArrayList.add(w.a(textnow.ad.a.a(Timestamp.class), locala));
      localArrayList.add(w.a(textnow.ad.a.a(java.sql.Date.class), locala));
      do
        return new f(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.l, this.b, localArrayList);
      while ((i1 == 2) || (i2 == 2));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.z.h
 * JD-Core Version:    0.6.2
 */