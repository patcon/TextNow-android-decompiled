package textnow.bi;

import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class e
  implements m
{
  private void a(Map<String, List<String>> paramMap)
  {
    if (paramMap != null)
    {
      Iterator localIterator1 = paramMap.keySet().iterator();
      while (localIterator1.hasNext())
      {
        String str1 = (String)localIterator1.next();
        Iterator localIterator2 = ((List)paramMap.get(str1)).iterator();
        while (localIterator2.hasNext())
        {
          String str2 = (String)localIterator2.next();
          String str3 = str1 + ":" + str2;
          System.out.println(str3);
        }
      }
    }
  }

  public final void a(String paramString)
  {
    System.out.println(paramString);
  }

  public final void a(HttpURLConnection paramHttpURLConnection, Object paramObject)
  {
    System.out.println("=== HTTP Request ===");
    String str1 = paramHttpURLConnection.getRequestMethod() + " " + paramHttpURLConnection.getURL().toString();
    System.out.println(str1);
    if ((paramObject instanceof String))
    {
      String str2 = "Content: " + (String)paramObject;
      System.out.println(str2);
    }
    a(paramHttpURLConnection.getRequestProperties());
  }

  public final void a(j paramj)
  {
    if (paramj != null)
    {
      System.out.println("=== HTTP Response ===");
      String str1 = "Receive url: " + paramj.b();
      System.out.println(str1);
      String str2 = "Status: " + paramj.a();
      System.out.println(str2);
      a(paramj.c());
      String str3 = "Content:\n" + paramj.d();
      System.out.println(str3);
    }
  }

  public final boolean a()
  {
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bi.e
 * JD-Core Version:    0.6.2
 */