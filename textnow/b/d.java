package textnow.b;

import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.vessel.VesselSDK;
import com.vessel.errors.VesselError;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  static AsyncTask<Void, Integer, Boolean> a = null;

  private static String a(HttpResponse paramHttpResponse)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramHttpResponse.getEntity().getContent()));
    StringBuffer localStringBuffer = new StringBuffer("");
    for (String str = localBufferedReader.readLine(); str != null; str = localBufferedReader.readLine())
      localStringBuffer.append(str);
    localBufferedReader.close();
    return localStringBuffer.toString();
  }

  private static HttpParams a()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpProtocolParams.setUserAgent(localBasicHttpParams, "VesselSDK 1.9.1");
    HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
    HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
    HttpProtocolParams.setUseExpectContinue(localBasicHttpParams, false);
    localBasicHttpParams.setParameter("http.conn-manager.max-total", Integer.valueOf(30));
    localBasicHttpParams.setParameter("http.conn-manager.max-per-route", new ConnPerRouteBean(30));
    return localBasicHttpParams;
  }

  private static JSONObject a(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      if (localJSONObject.optBoolean("success", false))
        return localJSONObject;
      if (localJSONObject.has("error_message"))
        throw new VesselError(localJSONObject.getString("error_message"));
    }
    catch (JSONException localJSONException)
    {
      throw new VesselError("JSONException");
      throw new VesselError("unknown error");
    }
    catch (Exception localException)
    {
    }
    throw new VesselError("Internal error occured");
  }

  public static JSONObject a(String paramString1, String paramString2, List<Header> paramList)
  {
    if (paramString2 != null)
      return a(b("https://ab.vesselapp.com" + paramString1, paramString2, paramList));
    return null;
  }

  public static JSONObject a(String paramString, List<Header> paramList)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Object localObject = null;
    if (bool);
    while (true)
    {
      return localObject;
      HttpResponse localHttpResponse;
      try
      {
        localHttpResponse = b("https://ab.vesselapp.com" + paramString, paramList);
        localObject = null;
        if (localHttpResponse == null)
          continue;
        if ((localHttpResponse.getStatusLine() != null) && (localHttpResponse.getStatusLine().getStatusCode() == 304))
        {
          JSONObject localJSONObject2 = new JSONObject();
          try
          {
            localJSONObject2.put("success", true);
            return localJSONObject2;
          }
          catch (JSONException localJSONException)
          {
            localJSONException.getMessage();
            throw new VesselError("Internal error occurred");
          }
        }
      }
      catch (IOException localIOException)
      {
        throw new VesselError("IOException");
      }
      JSONObject localJSONObject1 = a(a(localHttpResponse));
      localObject = localJSONObject1;
      if (localObject != null)
        try
        {
          Header localHeader = localHttpResponse.getFirstHeader("ETag");
          if (localHeader != null)
          {
            String str = localHeader.getValue();
            new StringBuilder("Etag is ").append(str).toString();
            ((JSONObject)localObject).put("etag", str);
            return localObject;
          }
        }
        catch (Exception localException)
        {
        }
    }
    throw new VesselError("Internal error occurred");
  }

  // ERROR //
  private static String b(String paramString1, String paramString2, List<Header> paramList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: invokestatic 218	textnow/b/d:a	()Lorg/apache/http/params/HttpParams;
    //   5: astore 12
    //   7: getstatic 224	android/os/Build$VERSION:SDK_INT	I
    //   10: bipush 8
    //   12: if_icmpge +125 -> 137
    //   15: invokestatic 227	textnow/b/d:b	()Lorg/apache/http/client/HttpClient;
    //   18: astore 24
    //   20: aload 24
    //   22: astore 6
    //   24: aload 6
    //   26: invokeinterface 232 1 0
    //   31: sipush 10000
    //   34: invokestatic 238	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   37: new 240	org/apache/http/client/methods/HttpPost
    //   40: dup
    //   41: aload_0
    //   42: invokespecial 241	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   45: astore 20
    //   47: aload 20
    //   49: ldc 243
    //   51: ldc 245
    //   53: invokevirtual 249	org/apache/http/client/methods/HttpPost:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: aload_2
    //   57: invokeinterface 255 1 0
    //   62: astore 21
    //   64: aload 21
    //   66: invokeinterface 261 1 0
    //   71: ifeq +154 -> 225
    //   74: aload 20
    //   76: aload 21
    //   78: invokeinterface 265 1 0
    //   83: checkcast 202	org/apache/http/Header
    //   86: invokevirtual 269	org/apache/http/client/methods/HttpPost:addHeader	(Lorg/apache/http/Header;)V
    //   89: goto -25 -> 64
    //   92: astore 19
    //   94: aload 6
    //   96: astore_3
    //   97: new 131	com/vessel/errors/VesselError
    //   100: dup
    //   101: ldc_w 271
    //   104: invokespecial 136	com/vessel/errors/VesselError:<init>	(Ljava/lang/String;)V
    //   107: athrow
    //   108: astore 8
    //   110: aload_3
    //   111: astore 6
    //   113: aload 8
    //   115: astore 5
    //   117: aload 6
    //   119: ifnull +15 -> 134
    //   122: aload 6
    //   124: invokeinterface 275 1 0
    //   129: invokeinterface 280 1 0
    //   134: aload 5
    //   136: athrow
    //   137: new 282	org/apache/http/conn/scheme/SchemeRegistry
    //   140: dup
    //   141: invokespecial 283	org/apache/http/conn/scheme/SchemeRegistry:<init>	()V
    //   144: astore 13
    //   146: aload 13
    //   148: new 285	org/apache/http/conn/scheme/Scheme
    //   151: dup
    //   152: ldc_w 287
    //   155: invokestatic 293	org/apache/http/conn/scheme/PlainSocketFactory:getSocketFactory	()Lorg/apache/http/conn/scheme/PlainSocketFactory;
    //   158: bipush 80
    //   160: invokespecial 296	org/apache/http/conn/scheme/Scheme:<init>	(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
    //   163: invokevirtual 300	org/apache/http/conn/scheme/SchemeRegistry:register	(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    //   166: pop
    //   167: aload 13
    //   169: new 285	org/apache/http/conn/scheme/Scheme
    //   172: dup
    //   173: ldc_w 302
    //   176: new 304	textnow/b/f
    //   179: dup
    //   180: invokespecial 305	textnow/b/f:<init>	()V
    //   183: sipush 443
    //   186: invokespecial 296	org/apache/http/conn/scheme/Scheme:<init>	(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
    //   189: invokevirtual 300	org/apache/http/conn/scheme/SchemeRegistry:register	(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    //   192: pop
    //   193: new 307	org/apache/http/impl/client/DefaultHttpClient
    //   196: dup
    //   197: new 309	org/apache/http/impl/conn/SingleClientConnManager
    //   200: dup
    //   201: aload 12
    //   203: aload 13
    //   205: invokespecial 312	org/apache/http/impl/conn/SingleClientConnManager:<init>	(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
    //   208: aload 12
    //   210: invokespecial 315	org/apache/http/impl/client/DefaultHttpClient:<init>	(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
    //   213: astore 6
    //   215: goto -191 -> 24
    //   218: astore 11
    //   220: aconst_null
    //   221: astore_3
    //   222: goto -125 -> 97
    //   225: aload 20
    //   227: aload 12
    //   229: invokevirtual 319	org/apache/http/client/methods/HttpPost:setParams	(Lorg/apache/http/params/HttpParams;)V
    //   232: aload 20
    //   234: new 321	org/apache/http/entity/StringEntity
    //   237: dup
    //   238: aload_1
    //   239: ldc 81
    //   241: invokespecial 323	org/apache/http/entity/StringEntity:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   244: invokevirtual 327	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   247: aload 6
    //   249: aload 20
    //   251: invokeinterface 331 2 0
    //   256: astore 22
    //   258: aload 22
    //   260: ifnull +30 -> 290
    //   263: aload 22
    //   265: invokestatic 194	textnow/b/d:a	(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    //   268: astore 23
    //   270: aload 6
    //   272: ifnull +15 -> 287
    //   275: aload 6
    //   277: invokeinterface 275 1 0
    //   282: invokeinterface 280 1 0
    //   287: aload 23
    //   289: areturn
    //   290: aload 6
    //   292: ifnull +15 -> 307
    //   295: aload 6
    //   297: invokeinterface 275 1 0
    //   302: invokeinterface 280 1 0
    //   307: ldc 39
    //   309: areturn
    //   310: astore 10
    //   312: new 131	com/vessel/errors/VesselError
    //   315: dup
    //   316: ldc_w 333
    //   319: invokespecial 136	com/vessel/errors/VesselError:<init>	(Ljava/lang/String;)V
    //   322: athrow
    //   323: new 131	com/vessel/errors/VesselError
    //   326: dup
    //   327: ldc 192
    //   329: invokespecial 136	com/vessel/errors/VesselError:<init>	(Ljava/lang/String;)V
    //   332: athrow
    //   333: new 131	com/vessel/errors/VesselError
    //   336: dup
    //   337: ldc_w 271
    //   340: invokespecial 136	com/vessel/errors/VesselError:<init>	(Ljava/lang/String;)V
    //   343: athrow
    //   344: astore 4
    //   346: aload 4
    //   348: astore 5
    //   350: aconst_null
    //   351: astore 6
    //   353: goto -236 -> 117
    //   356: astore 5
    //   358: goto -241 -> 117
    //   361: astore 18
    //   363: aload 6
    //   365: astore_3
    //   366: goto -33 -> 333
    //   369: astore 17
    //   371: aload 6
    //   373: astore_3
    //   374: goto -51 -> 323
    //   377: astore 16
    //   379: aload 6
    //   381: astore_3
    //   382: goto -70 -> 312
    //   385: astore 9
    //   387: aconst_null
    //   388: astore_3
    //   389: goto -66 -> 323
    //   392: astore 7
    //   394: aconst_null
    //   395: astore_3
    //   396: goto -63 -> 333
    //
    // Exception table:
    //   from	to	target	type
    //   24	64	92	java/io/UnsupportedEncodingException
    //   64	89	92	java/io/UnsupportedEncodingException
    //   225	258	92	java/io/UnsupportedEncodingException
    //   263	270	92	java/io/UnsupportedEncodingException
    //   97	108	108	finally
    //   312	323	108	finally
    //   323	333	108	finally
    //   333	344	108	finally
    //   2	20	218	java/io/UnsupportedEncodingException
    //   137	215	218	java/io/UnsupportedEncodingException
    //   2	20	310	org/apache/http/client/ClientProtocolException
    //   137	215	310	org/apache/http/client/ClientProtocolException
    //   2	20	344	finally
    //   137	215	344	finally
    //   24	64	356	finally
    //   64	89	356	finally
    //   225	258	356	finally
    //   263	270	356	finally
    //   24	64	361	java/lang/Exception
    //   64	89	361	java/lang/Exception
    //   225	258	361	java/lang/Exception
    //   263	270	361	java/lang/Exception
    //   24	64	369	java/io/IOException
    //   64	89	369	java/io/IOException
    //   225	258	369	java/io/IOException
    //   263	270	369	java/io/IOException
    //   24	64	377	org/apache/http/client/ClientProtocolException
    //   64	89	377	org/apache/http/client/ClientProtocolException
    //   225	258	377	org/apache/http/client/ClientProtocolException
    //   263	270	377	org/apache/http/client/ClientProtocolException
    //   2	20	385	java/io/IOException
    //   137	215	385	java/io/IOException
    //   2	20	392	java/lang/Exception
    //   137	215	392	java/lang/Exception
  }

  private static HttpResponse b(String paramString, List<Header> paramList)
  {
    HttpParams localHttpParams = a();
    if (Build.VERSION.SDK_INT < 8);
    HttpGet localHttpGet;
    SchemeRegistry localSchemeRegistry;
    for (Object localObject = b(); ; localObject = new DefaultHttpClient(new SingleClientConnManager(localHttpParams, localSchemeRegistry), localHttpParams))
    {
      HttpConnectionParams.setConnectionTimeout(((HttpClient)localObject).getParams(), 10000);
      HttpConnectionParams.setSoTimeout(((HttpClient)localObject).getParams(), VesselSDK.getNetworkTimeout());
      localHttpGet = new HttpGet(paramString);
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        localHttpGet.addHeader((Header)localIterator.next());
      localSchemeRegistry = new SchemeRegistry();
      localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
      localSchemeRegistry.register(new Scheme("https", new f(), 443));
    }
    try
    {
      HttpResponse localHttpResponse = ((HttpClient)localObject).execute(localHttpGet);
      return localHttpResponse;
    }
    catch (ClientProtocolException localClientProtocolException)
    {
      throw new VesselError("ClientProtocolException");
    }
    catch (IOException localIOException)
    {
    }
    throw new VesselError("IOException");
  }

  private static HttpClient b()
  {
    try
    {
      KeyStore localKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
      localKeyStore.load(null, null);
      e locale = new e(localKeyStore);
      locale.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
      BasicHttpParams localBasicHttpParams = new BasicHttpParams();
      HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
      HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
      SchemeRegistry localSchemeRegistry = new SchemeRegistry();
      localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
      localSchemeRegistry.register(new Scheme("https", locale, 443));
      DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
      return localDefaultHttpClient;
    }
    catch (Exception localException)
    {
    }
    return new DefaultHttpClient();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.b.d
 * JD-Core Version:    0.6.2
 */