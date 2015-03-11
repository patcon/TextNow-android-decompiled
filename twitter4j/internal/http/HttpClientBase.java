package twitter4j.internal.http;

import java.io.DataOutputStream;
import java.io.Serializable;
import twitter4j.internal.logging.Logger;

public abstract class HttpClientBase
  implements Serializable, HttpClient
{
  private static final Logger logger = Logger.getLogger(HttpClientBase.class);
  private static final long serialVersionUID = 6944924907755685265L;
  protected final HttpClientConfiguration CONF;

  public HttpClientBase(HttpClientConfiguration paramHttpClientConfiguration)
  {
    this.CONF = paramHttpClientConfiguration;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    HttpClientBase localHttpClientBase;
    do
    {
      return true;
      if (!(paramObject instanceof HttpClientBase))
        return false;
      localHttpClientBase = (HttpClientBase)paramObject;
    }
    while (this.CONF.equals(localHttpClientBase.CONF));
    return false;
  }

  public int hashCode()
  {
    return this.CONF.hashCode();
  }

  protected boolean isProxyConfigured()
  {
    return (this.CONF.getHttpProxyHost() != null) && (!this.CONF.getHttpProxyHost().equals(""));
  }

  public void shutdown()
  {
  }

  public String toString()
  {
    return "HttpClientBase{CONF=" + this.CONF + '}';
  }

  public void write(DataOutputStream paramDataOutputStream, String paramString)
  {
    paramDataOutputStream.writeBytes(paramString);
    logger.debug(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.http.HttpClientBase
 * JD-Core Version:    0.6.2
 */