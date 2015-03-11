package textnow.bd;

import java.util.HashMap;
import java.util.Map;

final class i
{
  private static Map<String, j> a;

  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("close", new j()
    {
      public final e a(Map<String, String> paramAnonymousMap, q paramAnonymousq)
      {
        return new f(paramAnonymousMap, paramAnonymousq);
      }
    });
    a.put("expand", new j()
    {
      public final e a(Map<String, String> paramAnonymousMap, q paramAnonymousq)
      {
        return new g(paramAnonymousMap, paramAnonymousq);
      }
    });
    a.put("usecustomclose", new j()
    {
      public final e a(Map<String, String> paramAnonymousMap, q paramAnonymousq)
      {
        return new k(paramAnonymousMap, paramAnonymousq);
      }
    });
    a.put("open", new j()
    {
      public final e a(Map<String, String> paramAnonymousMap, q paramAnonymousq)
      {
        return new h(paramAnonymousMap, paramAnonymousq);
      }
    });
  }

  static e a(String paramString, Map<String, String> paramMap, q paramq)
  {
    j localj = (j)a.get(paramString);
    if (localj != null)
      return localj.a(paramMap, paramq);
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bd.i
 * JD-Core Version:    0.6.2
 */