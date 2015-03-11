package textnow.aq;

import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.HttpsURLConnection;
import textnow.bb.d;
import textnow.bb.j;

public final class i extends d
{
  public n a = n.b;
  public boolean b = false;
  c c = new c(this);

  public final HttpURLConnection a(String paramString)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
    if ((localHttpURLConnection instanceof HttpsURLConnection))
      ((HttpsURLConnection)localHttpURLConnection).setHostnameVerifier(this.c);
    return localHttpURLConnection;
  }

  public final boolean a(textnow.bb.i parami)
  {
    j localj = parami.a();
    parami.printStackTrace();
    if ((localj != null) && (localj.a() > 0))
      return true;
    if (this.b)
      this.a = n.g;
    while (true)
    {
      return false;
      if ((parami.getCause() instanceof UnknownHostException))
        this.a = n.d;
      else if ((parami.getCause() instanceof SocketTimeoutException))
        this.a = n.e;
      else
        this.a = n.c;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aq.i
 * JD-Core Version:    0.6.2
 */