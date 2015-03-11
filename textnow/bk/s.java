package textnow.bk;

import java.util.HashMap;
import java.util.Map;

final class s
{
  private final Map<String, ad> a = new HashMap();
  private final af<String> b = new af();
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

  public final ad a(String paramString)
  {
    try
    {
      ad localad = (ad)this.a.get(paramString);
      return localad;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(String paramString, ad paramad)
  {
    try
    {
      if (this.a.containsKey(paramString))
        this.c -= ((ad)this.a.get(paramString)).a();
      this.a.put(paramString, paramad);
      this.c += paramad.a();
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
      ad localad = (ad)this.a.remove(paramString);
      this.b.remove(paramString);
      if (localad != null)
        this.c -= localad.a();
      return;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.s
 * JD-Core Version:    0.6.2
 */