package textnow.aq;

import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import textnow.bb.j;
import textnow.bb.k;
import textnow.bc.a;

class d
  implements Runnable
{
  static final String a = d.class.getName();
  i b = null;
  private String c;
  private String d;
  private String e;
  private int f;
  private k g;
  private Map<String, String> h;
  private m i;
  private n j;

  public d(String paramString1, String paramString2, String paramString3, k paramk, int paramInt, Map<String, String> paramMap, m paramm)
  {
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramInt;
    this.g = paramk;
    this.h = paramMap;
    this.i = paramm;
    this.j = n.b;
    this.b = new i();
  }

  public void run()
  {
    a locala = new a(this.c + "://" + this.d, this.b);
    locala.a(this.f);
    locala.b(this.f);
    locala.a(new textnow.bb.m()
    {
      public final void a(String paramAnonymousString)
      {
      }

      public final void a(HttpURLConnection paramAnonymousHttpURLConnection, Object paramAnonymousObject)
      {
      }

      public final void a(j paramAnonymousj)
      {
      }

      public final boolean a()
      {
        return false;
      }
    });
    if (this.h != null)
    {
      Iterator localIterator = this.h.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        locala.a((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    j localj = locala.a(this.e, this.g);
    if (localj == null)
    {
      this.j = this.b.a;
      new StringBuilder("failed to retrieve from ").append(this.d).toString();
      if (this.i != null)
      {
        this.i.a(this.j);
        this.i.d();
      }
    }
    do
    {
      return;
      new StringBuilder("retrieved: ").append(localj.b());
    }
    while (localj.a() == 200);
    new StringBuilder("error (").append(localj.a()).append(") status on request to ").append(this.c).append("://").append(this.d).toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aq.d
 * JD-Core Version:    0.6.2
 */