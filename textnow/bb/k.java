package textnow.bb;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class k
  implements Map<String, String>
{
  private Map<String, String> a = new HashMap();

  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.a.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("&");
      localStringBuilder.append(str1);
      String str2 = (String)this.a.get(str1);
      if (str2 != null)
      {
        localStringBuilder.append("=");
        try
        {
          localStringBuilder.append(URLEncoder.encode(str2, "UTF-8"));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
    return localStringBuilder.toString();
  }

  public final k a(String paramString1, String paramString2)
  {
    this.a.put(paramString1, paramString2);
    return this;
  }

  public final void clear()
  {
    this.a.clear();
  }

  public final boolean containsKey(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }

  public final boolean containsValue(Object paramObject)
  {
    return this.a.containsValue(paramObject);
  }

  public final Set<Map.Entry<String, String>> entrySet()
  {
    return this.a.entrySet();
  }

  public final boolean isEmpty()
  {
    return this.a.isEmpty();
  }

  public final Set<String> keySet()
  {
    return this.a.keySet();
  }

  public final void putAll(Map<? extends String, ? extends String> paramMap)
  {
    this.a.putAll(paramMap);
  }

  public final int size()
  {
    return this.a.size();
  }

  public final Collection<String> values()
  {
    return this.a.values();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bb.k
 * JD-Core Version:    0.6.2
 */