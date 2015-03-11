package textnow.aq;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public final class c
  implements HostnameVerifier
{
  private i a;

  public c(i parami)
  {
    this.a = parami;
  }

  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    boolean bool = true;
    if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(paramString, paramSSLSession))
    {
      this.a.b = bool;
      bool = false;
    }
    return bool;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aq.c
 * JD-Core Version:    0.6.2
 */