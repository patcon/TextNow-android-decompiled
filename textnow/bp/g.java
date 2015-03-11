package textnow.bp;

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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bp.g
 * JD-Core Version:    0.6.2
 */