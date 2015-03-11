package textnow.bi;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class g
{
  public static String a(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return "";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bi.g
 * JD-Core Version:    0.6.2
 */