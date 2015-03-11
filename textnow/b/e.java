package textnow.b;

import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

final class e extends org.apache.http.conn.ssl.SSLSocketFactory
{
  SSLContext a = SSLContext.getInstance("TLS");

  public e(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    X509TrustManager local1 = new X509TrustManager()
    {
      public final void checkClientTrusted(X509Certificate[] paramAnonymousArrayOfX509Certificate, String paramAnonymousString)
      {
      }

      public final void checkServerTrusted(X509Certificate[] paramAnonymousArrayOfX509Certificate, String paramAnonymousString)
      {
      }

      public final X509Certificate[] getAcceptedIssuers()
      {
        return null;
      }
    };
    this.a.init(null, new TrustManager[] { local1 }, null);
  }

  public final Socket createSocket()
  {
    return this.a.getSocketFactory().createSocket();
  }

  public final Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return this.a.getSocketFactory().createSocket(paramSocket, paramString, paramInt, paramBoolean);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.b.e
 * JD-Core Version:    0.6.2
 */