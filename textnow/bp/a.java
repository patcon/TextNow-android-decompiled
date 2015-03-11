package textnow.bp;

import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class a
{
  private HttpClient a;

  private a()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
    HttpProtocolParams.setContentCharset(localBasicHttpParams, "utf-8");
    localBasicHttpParams.setBooleanParameter("http.protocol.expect-continue", false);
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    SSLSocketFactory localSSLSocketFactory = SSLSocketFactory.getSocketFactory();
    localSSLSocketFactory.setHostnameVerifier(SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    localSchemeRegistry.register(new Scheme("https", localSSLSocketFactory, 443));
    this.a = new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
  }

  public static a a()
  {
    return b.a;
  }

  public final HttpClient b()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bp.a
 * JD-Core Version:    0.6.2
 */