package textnow.aw;

import java.util.Map;

abstract class e
{
  protected Map<String, String> a;
  protected q b;

  e(Map<String, String> paramMap, q paramq)
  {
    this.a = paramMap;
    this.b = paramq;
  }

  protected final int a(String paramString)
  {
    String str = (String)this.a.get(paramString);
    if (str == null)
      return -1;
    try
    {
      int i = Integer.parseInt(str, 10);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return -1;
  }

  abstract void a();

  protected final String b(String paramString)
  {
    return (String)this.a.get(paramString);
  }

  protected final boolean c(String paramString)
  {
    return "true".equals(this.a.get(paramString));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aw.e
 * JD-Core Version:    0.6.2
 */