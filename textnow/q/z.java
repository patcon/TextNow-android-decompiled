package textnow.q;

import java.util.HashMap;
import java.util.Map;

public final class z
{
  private static z b;
  private Map<String, String> a = new HashMap();

  public static z a()
  {
    if (b == null)
    {
      z localz = new z();
      b = localz;
      return localz;
    }
    return b;
  }

  public final String a(String paramString)
  {
    String str = (String)this.a.get(paramString);
    if (str == null)
      str = "";
    return str;
  }

  public final void a(String paramString1, String paramString2)
  {
    this.a.put(paramString1, paramString2);
  }

  public final void b(String paramString)
  {
    this.a.remove(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.z
 * JD-Core Version:    0.6.2
 */