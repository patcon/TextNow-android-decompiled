package textnow.s;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i
{
  private static final Map<String, Integer> a = new HashMap();
  private static final Map<String, String> b = new HashMap();
  private static final Map<String, String> c = new HashMap();
  private static final Set<String> d = new HashSet();

  static
  {
    a.put("100credits", Integer.valueOf(100));
    a.put("200credits", Integer.valueOf(200));
    a.put("500credits", Integer.valueOf(500));
    b.put("callforwarding1month", "month");
    b.put("callforwarding1year", "year");
    c.put("adremoval1month", "month");
    c.put("adremoval1year", "year");
    d.addAll(a.keySet());
    d.addAll(b.keySet());
    d.addAll(c.keySet());
  }

  public static List<String> a()
  {
    return Arrays.asList(d.toArray(new String[0]));
  }

  public static boolean a(String paramString)
  {
    return a.containsKey(paramString);
  }

  public static int b(String paramString)
  {
    if (!a(paramString))
    {
      new StringBuilder().append("not a valid credit sku: ").append(paramString).toString();
      return 0;
    }
    return ((Integer)a.get(paramString)).intValue();
  }

  public static boolean c(String paramString)
  {
    return d.contains(paramString);
  }

  public static boolean d(String paramString)
  {
    return b.containsKey(paramString);
  }

  public static boolean e(String paramString)
  {
    return c.containsKey(paramString);
  }

  public static String f(String paramString)
  {
    if (d(paramString))
      return (String)b.get(paramString);
    if (e(paramString))
      return (String)c.get(paramString);
    new StringBuilder().append("not a valid purchase sku: ").append(paramString).toString();
    return "";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.s.i
 * JD-Core Version:    0.6.2
 */