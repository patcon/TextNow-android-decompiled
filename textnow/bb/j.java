package textnow.bb;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public final class j
{
  private int a;
  private String b;
  private Map<String, List<String>> c;
  private byte[] d;

  public j(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte)
  {
    try
    {
      this.a = paramHttpURLConnection.getResponseCode();
      this.b = paramHttpURLConnection.getURL().toString();
      this.c = paramHttpURLConnection.getHeaderFields();
      this.d = paramArrayOfByte;
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }

  public final int a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }

  public final Map<String, List<String>> c()
  {
    return this.c;
  }

  public final String d()
  {
    if (this.d != null)
      return new String(this.d);
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bb.j
 * JD-Core Version:    0.6.2
 */