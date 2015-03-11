package textnow.x;

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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.x.e
 * JD-Core Version:    0.6.2
 */