package textnow.ax;

import java.net.HttpURLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import textnow.bi.j;
import textnow.bi.k;
import textnow.bj.a;

class b
  implements Runnable
{
  static final String a = b.class.getName();
  String b = null;
  String c = null;
  String d = null;
  int e = 10000;
  StringBuilder f = null;
  n g;
  i h = null;

  public b(String paramString1, String paramString2, String paramString3, int paramInt, StringBuilder paramStringBuilder)
  {
    this.c = paramString2;
    this.d = paramString1;
    this.e = paramInt;
    this.f = paramStringBuilder;
    this.b = paramString3;
    this.g = n.b;
    this.h = new i();
  }

  public void run()
  {
    j localj;
    try
    {
      a locala = new a("https://" + this.d, this.h);
      k localk = a.a();
      localk.a("org_id", this.c);
      localk.a("session_id", this.b);
      locala.a(this.e);
      locala.b(this.e);
      locala.a(new textnow.bi.m()
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
      localj = locala.a("/fp/ls_fp.html", localk);
      if (localj == null)
      {
        this.g = this.h.a;
        new StringBuilder("Failed to fetch w: ").append(this.g.toString()).toString();
        return;
      }
      if (localj.a() >= 400)
      {
        new StringBuilder("W fetch error: ").append(localj.a()).toString();
        this.g = n.c;
        return;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
    String str = localj.d();
    if ((str == null) || (str.length() < "<body></body><script>var".length()))
    {
      new StringBuilder("W fetch empty: ").append(localj.a()).toString();
      this.g = n.c;
      return;
    }
    if (!str.regionMatches(true, 0, "<body></body><script>var", 0, "<body></body><script>var".length()))
    {
      new StringBuilder("W fetch parse error: ").append(localj.a()).toString();
      this.g = n.c;
      return;
    }
    Matcher localMatcher = Pattern.compile("='(.*?)'").matcher(str);
    for (int i = 0; ; i++)
      if (i < 4)
      {
        if (!localMatcher.find())
        {
          new StringBuilder("W fetch find error: ").append(localj.a()).toString();
          this.g = n.c;
        }
      }
      else
      {
        this.f.append(m.a(localMatcher.group(1)));
        return;
      }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ax.b
 * JD-Core Version:    0.6.2
 */