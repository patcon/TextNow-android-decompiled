package textnow.bd;

import java.util.HashMap;
import java.util.Map;

final class r
{
  private final Map<String, ac> a = new HashMap();
  private final ae<String> b = new ae();
  private long c = 0L;

  private String a()
  {
    try
    {
      String str = (String)this.b.peek();
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String a(long paramLong)
  {
    try
    {
      if (this.c > paramLong)
      {
        str = a();
        c(str);
        return str;
      }
      String str = null;
    }
    finally
    {
    }
  }

  public final ac a(String paramString)
  {
    try
    {
      ac localac = (ac)this.a.get(paramString);
      return localac;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(String paramString, ac paramac)
  {
    try
    {
      if (this.a.containsKey(paramString))
        this.c -= ((ac)this.a.get(paramString)).a();
      this.a.put(paramString, paramac);
      this.c += paramac.a();
      this.b.add(paramString);
      return;
    }
    finally
    {
    }
  }

  public final boolean b(String paramString)
  {
    try
    {
      boolean bool = this.a.containsKey(paramString);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void c(String paramString)
  {
    try
    {
      ac localac = (ac)this.a.remove(paramString);
      this.b.remove(paramString);
      if (localac != null)
        this.c -= localac.a();
      return;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.r
 * JD-Core Version:    0.6.2
 */