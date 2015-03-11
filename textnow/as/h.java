package textnow.as;

import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;

final class h
{
  private static Map<String, i> a;

  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put("trigger-event", new i()
    {
    });
    a.put("cancel-auto-skip", new i()
    {
    });
    a.put("validate-complete", new i()
    {
    });
  }

  static f a(String paramString, Map<String, String> paramMap, WebView paramWebView)
  {
    i locali = (i)a.get(paramString);
    if (locali != null)
      return locali.a(paramMap, paramWebView);
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.as.h
 * JD-Core Version:    0.6.2
 */