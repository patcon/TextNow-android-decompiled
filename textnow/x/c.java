package textnow.x;

import android.content.Context;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import textnow.v.n;

public abstract class c extends b
{
  private static final int DEFAULT_CONN_TIMEOUT_IN_MS = 20000;
  private static final int DEFAULT_SO_TIMEOUT_IN_MS = 30000;
  protected static final int MAX_CONNECTION_PER_ROUTE = 50;
  protected static final int MAX_TOTAL_CONNECTION = 100;
  public static final String METHOD_DELETE = "DELETE";
  public static final String METHOD_GET = "GET";
  public static final String METHOD_HEAD = "HEAD";
  public static final String METHOD_PATCH = "PATCH";
  public static final String METHOD_POST = "POST";
  public static final String METHOD_PUT = "PUT";
  private static final String TAG = "AbstractHttpCommand";
  private static final Object clientLock = new Object();
  private static volatile HttpClient mDefaultClient;
  private static d sConnPerRoute = new d((byte)0);
  protected Context mContext;
  private HashMap<String, String> mHeaders = new HashMap();
  private HttpRequestBase mRequest;
  private URI mUri;

  public c(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private void addHeadersToRequest()
  {
    Iterator localIterator = this.mHeaders.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.mRequest.addHeader(str, (String)this.mHeaders.get(str));
    }
  }

  private HttpClient createHttpClient(int paramInt1, int paramInt2)
  {
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    localSchemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, paramInt1);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, paramInt2);
    HttpProtocolParams.setUserAgent(localBasicHttpParams, getUserAgent());
    ConnManagerParams.setMaxTotalConnections(localBasicHttpParams, 100);
    ConnManagerParams.setMaxConnectionsPerRoute(localBasicHttpParams, sConnPerRoute);
    return new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
  }

  private HttpClient getDefaultHttpClient()
  {
    if (mDefaultClient == null);
    synchronized (clientLock)
    {
      if (mDefaultClient == null)
        mDefaultClient = createHttpClient(20000, 30000);
      return mDefaultClient;
    }
  }

  protected final void addHeader(String paramString1, String paramString2)
  {
    this.mHeaders.put(paramString1, paramString2);
  }

  protected abstract URI buildURI();

  protected void execute()
  {
    HttpClient localHttpClient = getHttpClient();
    i locali = new i();
    locali.a(getRequest().a());
    locali.b(getRequest().c());
    new StringBuilder().append(getClass().getSimpleName()).append(" request made").toString();
    new StringBuilder().append(getClass().getSimpleName()).append(" URI: ").append(this.mUri.toString()).toString();
    long l = System.currentTimeMillis();
    try
    {
      HttpResponse localHttpResponse = localHttpClient.execute(this.mRequest);
      Header localHeader = localHttpResponse.getFirstHeader("Date");
      if (localHeader != null)
        locali.a(localHeader.getValue());
      int i = localHttpResponse.getStatusLine().getStatusCode();
      if (i == 200)
      {
        localObject2 = getSuccessResponse(localHttpResponse);
        new StringBuilder().append(getClass().getSimpleName()).append(" response ok").toString();
        new StringBuilder().append(getClass().getSimpleName()).append(" response: ").append(localObject2).toString();
        locali.a(false);
        locali.a(200);
      }
      while (true)
      {
        localHttpClient.getConnectionManager().closeIdleConnections(2L, TimeUnit.SECONDS);
        locali.b(localObject2);
        setResponse(locali);
        new StringBuilder().append(getClass().getSimpleName()).append(" request completed").toString();
        return;
        localObject2 = getErrorResponse(localHttpResponse);
        new StringBuilder().append(getClass().getSimpleName()).append(" response error, status: ").append(i).toString();
        new StringBuilder().append(getClass().getSimpleName()).append(" response: ").append(localObject2).toString();
        locali.a(true);
        locali.a(i);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Log.getStackTraceString(localException);
        new StringBuilder().append("Request took ").append(System.currentTimeMillis() - l).append("ms").toString();
        Object localObject2 = getErrorResponse(localException);
        locali.a(true);
        locali.a(-1);
        localHttpClient.getConnectionManager().closeIdleConnections(2L, TimeUnit.SECONDS);
      }
    }
    finally
    {
      localHttpClient.getConnectionManager().closeIdleConnections(2L, TimeUnit.SECONDS);
    }
  }

  protected int getConnectionTimeOut()
  {
    return 20000;
  }

  protected abstract String getContentType();

  protected HttpEntity getEntityBody()
  {
    return null;
  }

  protected Object getErrorResponse(Exception paramException)
  {
    return paramException;
  }

  protected Object getErrorResponse(HttpResponse paramHttpResponse)
  {
    return null;
  }

  protected HttpClient getHttpClient()
  {
    HttpClient localHttpClient = getDefaultHttpClient();
    HttpParams localHttpParams = localHttpClient.getParams();
    HttpConnectionParams.setConnectionTimeout(localHttpParams, getConnectionTimeOut());
    HttpConnectionParams.setSoTimeout(localHttpParams, getSocketTimeOut());
    ((DefaultHttpClient)localHttpClient).setParams(localHttpParams);
    return localHttpClient;
  }

  protected HttpRequestBase getHttpRequest()
  {
    String str = getMethod();
    if ("POST".equals(str))
      return new HttpPost(this.mUri);
    if ("DELETE".equals(str))
      return new HttpDelete(this.mUri);
    if ("PUT".equals(str))
      return new HttpPut(this.mUri);
    if ("PATCH".equals(str))
      return new e(this.mUri);
    if ("HEAD".equals(str))
      return new HttpHead(this.mUri);
    if ("GET".equals(str))
      return new HttpGet(this.mUri);
    new StringBuilder().append("Bad Http Method: ").append(str).toString();
    return null;
  }

  protected final String getMethod()
  {
    return ((textnow.y.b)getClass().getAnnotation(textnow.y.b.class)).a();
  }

  protected String getResponseAsString(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    n.a(paramInputStream, localByteArrayOutputStream, new byte[512]);
    String str = localByteArrayOutputStream.toString("UTF-8");
    localByteArrayOutputStream.close();
    return str;
  }

  protected int getSocketTimeOut()
  {
    return 30000;
  }

  protected Object getSuccessResponse(HttpResponse paramHttpResponse)
  {
    Object localObject = null;
    if (paramHttpResponse != null)
    {
      HttpEntity localHttpEntity = paramHttpResponse.getEntity();
      localObject = null;
      if (localHttpEntity == null);
    }
    try
    {
      InputStream localInputStream = paramHttpResponse.getEntity().getContent();
      localObject = localInputStream;
      return localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return getErrorResponse(localException);
    }
  }

  public URI getURI()
  {
    return this.mUri;
  }

  protected String getUserAgent()
  {
    return "";
  }

  protected void initializeHeaders()
  {
  }

  protected final void onBeforeExecute()
  {
    this.mUri = buildURI();
    this.mRequest = getHttpRequest();
    addHeadersToRequest();
    String str = getContentType();
    if (str != null)
      this.mRequest.addHeader("Content-Type", str);
    onBeforeExecute(this.mRequest);
  }

  protected void onBeforeExecute(HttpRequestBase paramHttpRequestBase)
  {
    HttpEntity localHttpEntity = getEntityBody();
    if (localHttpEntity != null)
    {
      if ((localHttpEntity instanceof AbstractHttpEntity))
        ((AbstractHttpEntity)localHttpEntity).setContentType(getContentType());
      ((HttpEntityEnclosingRequestBase)paramHttpRequestBase).setEntity(localHttpEntity);
    }
  }

  protected void prepare()
  {
    initializeHeaders();
  }

  public void setURI(URI paramURI)
  {
    this.mUri = paramURI;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.x.c
 * JD-Core Version:    0.6.2
 */