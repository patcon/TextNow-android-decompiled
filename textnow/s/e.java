package textnow.s;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class e extends HttpEntityEnclosingRequestBase
{
  public e()
  {
  }

  public e(URI paramURI)
  {
    setURI(paramURI);
  }

  public final String getMethod()
  {
    return "PATCH";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.s.e
 * JD-Core Version:    0.6.2
 */