package textnow.z;

import java.util.HashMap;
import java.util.Map;

public final class d
{
  private static d b;
  private Map<String, String> a = new HashMap();

  public static d a()
  {
    if (b == null)
    {
      d locald = new d();
      b = locald;
      return locald;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.z.d
 * JD-Core Version:    0.6.2
 */