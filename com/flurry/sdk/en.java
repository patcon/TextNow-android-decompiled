package com.flurry.sdk;

import android.os.Build.VERSION;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.security.SecureRandom;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.AbstractHttpEntity;

public class en extends fg
{
  private static final String a = en.class.getSimpleName();
  private static SSLContext b;
  private static HostnameVerifier c;
  private String d;
  private en.a e;
  private int f = 10000;
  private int i = 15000;
  private boolean j = true;
  private final ds<String, String> k = new ds();
  private en.c l;
  private HttpURLConnection m;
  private HttpClient n;
  private boolean o;
  private boolean p;
  private Exception q;
  private int r = -1;
  private final ds<String, String> s = new ds();
  private final Object t = new Object();

  private void a(InputStream paramInputStream)
  {
    if (this.l == null);
    while ((b()) || (paramInputStream == null))
      return;
    this.l.a(this, paramInputStream);
  }

  private void a(OutputStream paramOutputStream)
  {
    if (this.l == null);
    while ((b()) || (paramOutputStream == null))
      return;
    this.l.a(this, paramOutputStream);
  }

  private static SSLContext m()
  {
    try
    {
      SSLContext localSSLContext1;
      if (b != null)
        localSSLContext1 = b;
      while (true)
      {
        return localSSLContext1;
        try
        {
          TrustManager[] arrayOfTrustManager = new TrustManager[1];
          arrayOfTrustManager[0] = new ej(null);
          SSLContext localSSLContext2 = SSLContext.getInstance("TLS");
          b = localSSLContext2;
          localSSLContext2.init(null, arrayOfTrustManager, new SecureRandom());
          localSSLContext1 = b;
        }
        catch (Exception localException)
        {
          while (true)
            eo.a(3, a, "Exception creating SSL context", localException);
        }
      }
    }
    finally
    {
    }
  }

  private static HostnameVerifier n()
  {
    try
    {
      Object localObject2;
      if (c != null)
        localObject2 = c;
      while (true)
      {
        return localObject2;
        localObject2 = new eh();
        c = (HostnameVerifier)localObject2;
      }
    }
    finally
    {
    }
  }

  // ERROR //
  private void o()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 133	com/flurry/sdk/en:p	Z
    //   6: ifeq +4 -> 10
    //   9: return
    //   10: new 135	java/net/URL
    //   13: dup
    //   14: aload_0
    //   15: getfield 137	com/flurry/sdk/en:d	Ljava/lang/String;
    //   18: invokespecial 140	java/net/URL:<init>	(Ljava/lang/String;)V
    //   21: astore_2
    //   22: aload_0
    //   23: aload_2
    //   24: invokevirtual 144	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   27: checkcast 146	java/net/HttpURLConnection
    //   30: putfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   33: aload_0
    //   34: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   37: aload_0
    //   38: getfield 50	com/flurry/sdk/en:f	I
    //   41: invokevirtual 150	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   44: aload_0
    //   45: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   48: aload_0
    //   49: getfield 52	com/flurry/sdk/en:i	I
    //   52: invokevirtual 153	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   55: aload_0
    //   56: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   59: aload_0
    //   60: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   63: invokevirtual 160	com/flurry/sdk/en$a:toString	()Ljava/lang/String;
    //   66: invokevirtual 163	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   69: aload_0
    //   70: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   73: aload_0
    //   74: getfield 54	com/flurry/sdk/en:j	Z
    //   77: invokevirtual 167	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   80: aload_0
    //   81: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   84: getstatic 169	com/flurry/sdk/en$a:c	Lcom/flurry/sdk/en$a;
    //   87: aload_0
    //   88: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   91: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   94: invokevirtual 176	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   97: aload_0
    //   98: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   101: iconst_1
    //   102: invokevirtual 179	java/net/HttpURLConnection:setDoInput	(Z)V
    //   105: invokestatic 181	com/flurry/sdk/eo:d	()Z
    //   108: ifeq +41 -> 149
    //   111: aload_0
    //   112: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   115: instanceof 183
    //   118: ifeq +31 -> 149
    //   121: aload_0
    //   122: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   125: checkcast 183	javax/net/ssl/HttpsURLConnection
    //   128: astore 22
    //   130: aload 22
    //   132: invokestatic 185	com/flurry/sdk/en:n	()Ljavax/net/ssl/HostnameVerifier;
    //   135: invokevirtual 189	javax/net/ssl/HttpsURLConnection:setHostnameVerifier	(Ljavax/net/ssl/HostnameVerifier;)V
    //   138: aload 22
    //   140: invokestatic 191	com/flurry/sdk/en:m	()Ljavax/net/ssl/SSLContext;
    //   143: invokevirtual 195	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   146: invokevirtual 199	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   149: aload_0
    //   150: getfield 59	com/flurry/sdk/en:k	Lcom/flurry/sdk/ds;
    //   153: invokevirtual 202	com/flurry/sdk/ds:b	()Ljava/util/Collection;
    //   156: invokeinterface 208 1 0
    //   161: astore 4
    //   163: aload 4
    //   165: invokeinterface 213 1 0
    //   170: ifeq +52 -> 222
    //   173: aload 4
    //   175: invokeinterface 217 1 0
    //   180: checkcast 219	java/util/Map$Entry
    //   183: astore 21
    //   185: aload_0
    //   186: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   189: aload 21
    //   191: invokeinterface 222 1 0
    //   196: checkcast 224	java/lang/String
    //   199: aload 21
    //   201: invokeinterface 227 1 0
    //   206: checkcast 224	java/lang/String
    //   209: invokevirtual 231	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   212: goto -49 -> 163
    //   215: astore_3
    //   216: aload_0
    //   217: invokespecial 233	com/flurry/sdk/en:r	()V
    //   220: aload_3
    //   221: athrow
    //   222: getstatic 235	com/flurry/sdk/en$a:b	Lcom/flurry/sdk/en$a;
    //   225: aload_0
    //   226: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   229: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   232: ifne +27 -> 259
    //   235: getstatic 169	com/flurry/sdk/en$a:c	Lcom/flurry/sdk/en$a;
    //   238: aload_0
    //   239: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   242: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   245: ifne +14 -> 259
    //   248: aload_0
    //   249: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   252: ldc 237
    //   254: ldc 239
    //   256: invokevirtual 242	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   259: aload_0
    //   260: getfield 133	com/flurry/sdk/en:p	Z
    //   263: istore 5
    //   265: iload 5
    //   267: ifeq +8 -> 275
    //   270: aload_0
    //   271: invokespecial 233	com/flurry/sdk/en:r	()V
    //   274: return
    //   275: getstatic 169	com/flurry/sdk/en$a:c	Lcom/flurry/sdk/en$a;
    //   278: aload_0
    //   279: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   282: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   285: istore 6
    //   287: iload 6
    //   289: ifeq +39 -> 328
    //   292: aload_0
    //   293: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   296: invokevirtual 246	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   299: astore 20
    //   301: new 248	java/io/BufferedOutputStream
    //   304: dup
    //   305: aload 20
    //   307: invokespecial 250	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   310: astore 18
    //   312: aload_0
    //   313: aload 18
    //   315: invokespecial 75	com/flurry/sdk/en:a	(Ljava/io/OutputStream;)V
    //   318: aload 18
    //   320: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   323: aload 20
    //   325: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   328: aload_0
    //   329: aload_0
    //   330: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   333: invokevirtual 259	java/net/HttpURLConnection:getResponseCode	()I
    //   336: putfield 61	com/flurry/sdk/en:r	I
    //   339: aload_0
    //   340: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   343: invokevirtual 263	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   346: invokeinterface 269 1 0
    //   351: invokeinterface 208 1 0
    //   356: astore 7
    //   358: aload 7
    //   360: invokeinterface 213 1 0
    //   365: ifeq +86 -> 451
    //   368: aload 7
    //   370: invokeinterface 217 1 0
    //   375: checkcast 219	java/util/Map$Entry
    //   378: astore 14
    //   380: aload 14
    //   382: invokeinterface 227 1 0
    //   387: checkcast 271	java/util/List
    //   390: invokeinterface 272 1 0
    //   395: astore 15
    //   397: aload 15
    //   399: invokeinterface 213 1 0
    //   404: ifeq -46 -> 358
    //   407: aload 15
    //   409: invokeinterface 217 1 0
    //   414: checkcast 224	java/lang/String
    //   417: astore 16
    //   419: aload_0
    //   420: getfield 63	com/flurry/sdk/en:s	Lcom/flurry/sdk/ds;
    //   423: aload 14
    //   425: invokeinterface 222 1 0
    //   430: aload 16
    //   432: invokevirtual 275	com/flurry/sdk/ds:a	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   435: goto -38 -> 397
    //   438: aload 18
    //   440: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   443: aload 19
    //   445: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   448: aload 17
    //   450: athrow
    //   451: getstatic 235	com/flurry/sdk/en$a:b	Lcom/flurry/sdk/en$a;
    //   454: aload_0
    //   455: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   458: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   461: ifne +25 -> 486
    //   464: getstatic 169	com/flurry/sdk/en$a:c	Lcom/flurry/sdk/en$a;
    //   467: aload_0
    //   468: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   471: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   474: istore 13
    //   476: iload 13
    //   478: ifne +8 -> 486
    //   481: aload_0
    //   482: invokespecial 233	com/flurry/sdk/en:r	()V
    //   485: return
    //   486: aload_0
    //   487: getfield 133	com/flurry/sdk/en:p	Z
    //   490: istore 8
    //   492: iload 8
    //   494: ifeq +8 -> 502
    //   497: aload_0
    //   498: invokespecial 233	com/flurry/sdk/en:r	()V
    //   501: return
    //   502: aload_0
    //   503: getfield 71	com/flurry/sdk/en:m	Ljava/net/HttpURLConnection;
    //   506: invokevirtual 279	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   509: astore 11
    //   511: new 281	java/io/BufferedInputStream
    //   514: dup
    //   515: aload 11
    //   517: invokespecial 283	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   520: astore 12
    //   522: aload_0
    //   523: aload 12
    //   525: invokespecial 285	com/flurry/sdk/en:a	(Ljava/io/InputStream;)V
    //   528: aload 12
    //   530: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   533: aload 11
    //   535: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   538: aload_0
    //   539: invokespecial 233	com/flurry/sdk/en:r	()V
    //   542: return
    //   543: astore 9
    //   545: aconst_null
    //   546: astore 10
    //   548: aload 10
    //   550: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   553: aload_1
    //   554: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   557: aload 9
    //   559: athrow
    //   560: astore 9
    //   562: aload 11
    //   564: astore_1
    //   565: aconst_null
    //   566: astore 10
    //   568: goto -20 -> 548
    //   571: astore 9
    //   573: aload 11
    //   575: astore_1
    //   576: aload 12
    //   578: astore 10
    //   580: goto -32 -> 548
    //   583: astore 17
    //   585: aload 20
    //   587: astore 19
    //   589: aconst_null
    //   590: astore 18
    //   592: goto -154 -> 438
    //   595: astore 17
    //   597: aload 20
    //   599: astore 19
    //   601: goto -163 -> 438
    //   604: astore 17
    //   606: aconst_null
    //   607: astore 18
    //   609: aconst_null
    //   610: astore 19
    //   612: goto -174 -> 438
    //
    // Exception table:
    //   from	to	target	type
    //   22	149	215	finally
    //   149	163	215	finally
    //   163	212	215	finally
    //   222	259	215	finally
    //   259	265	215	finally
    //   275	287	215	finally
    //   318	328	215	finally
    //   328	358	215	finally
    //   358	397	215	finally
    //   397	435	215	finally
    //   438	451	215	finally
    //   451	476	215	finally
    //   486	492	215	finally
    //   528	538	215	finally
    //   548	560	215	finally
    //   502	511	543	finally
    //   511	522	560	finally
    //   522	528	571	finally
    //   301	312	583	finally
    //   312	318	595	finally
    //   292	301	604	finally
  }

  // ERROR //
  private void p()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 133	com/flurry/sdk/en:p	Z
    //   6: ifeq +4 -> 10
    //   9: return
    //   10: aload_0
    //   11: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   14: aload_0
    //   15: getfield 137	com/flurry/sdk/en:d	Ljava/lang/String;
    //   18: invokevirtual 288	com/flurry/sdk/en$a:a	(Ljava/lang/String;)Lorg/apache/http/client/methods/HttpRequestBase;
    //   21: astore_2
    //   22: aload_0
    //   23: getfield 59	com/flurry/sdk/en:k	Lcom/flurry/sdk/ds;
    //   26: invokevirtual 202	com/flurry/sdk/ds:b	()Ljava/util/Collection;
    //   29: invokeinterface 208 1 0
    //   34: astore_3
    //   35: aload_3
    //   36: invokeinterface 213 1 0
    //   41: ifeq +41 -> 82
    //   44: aload_3
    //   45: invokeinterface 217 1 0
    //   50: checkcast 219	java/util/Map$Entry
    //   53: astore 20
    //   55: aload_2
    //   56: aload 20
    //   58: invokeinterface 222 1 0
    //   63: checkcast 224	java/lang/String
    //   66: aload 20
    //   68: invokeinterface 227 1 0
    //   73: checkcast 224	java/lang/String
    //   76: invokevirtual 293	org/apache/http/client/methods/HttpRequestBase:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: goto -44 -> 35
    //   82: getstatic 235	com/flurry/sdk/en$a:b	Lcom/flurry/sdk/en$a;
    //   85: aload_0
    //   86: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   89: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   92: ifne +22 -> 114
    //   95: getstatic 169	com/flurry/sdk/en$a:c	Lcom/flurry/sdk/en$a;
    //   98: aload_0
    //   99: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   102: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   105: ifne +9 -> 114
    //   108: aload_2
    //   109: ldc 237
    //   111: invokevirtual 296	org/apache/http/client/methods/HttpRequestBase:removeHeaders	(Ljava/lang/String;)V
    //   114: getstatic 169	com/flurry/sdk/en$a:c	Lcom/flurry/sdk/en$a;
    //   117: aload_0
    //   118: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   121: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   124: ifeq +18 -> 142
    //   127: aload_2
    //   128: checkcast 298	org/apache/http/client/methods/HttpPost
    //   131: new 300	com/flurry/sdk/en$1
    //   134: dup
    //   135: aload_0
    //   136: invokespecial 303	com/flurry/sdk/en$1:<init>	(Lcom/flurry/sdk/en;)V
    //   139: invokevirtual 307	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   142: new 309	org/apache/http/params/BasicHttpParams
    //   145: dup
    //   146: invokespecial 310	org/apache/http/params/BasicHttpParams:<init>	()V
    //   149: astore 4
    //   151: aload 4
    //   153: aload_0
    //   154: getfield 50	com/flurry/sdk/en:f	I
    //   157: invokestatic 316	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   160: aload 4
    //   162: aload_0
    //   163: getfield 52	com/flurry/sdk/en:i	I
    //   166: invokestatic 319	org/apache/http/params/HttpConnectionParams:setSoTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   169: aload 4
    //   171: ldc_w 321
    //   174: aload_0
    //   175: getfield 54	com/flurry/sdk/en:j	Z
    //   178: invokestatic 327	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   181: invokeinterface 333 3 0
    //   186: pop
    //   187: aload_0
    //   188: aload 4
    //   190: invokestatic 338	com/flurry/sdk/ek:a	(Lorg/apache/http/params/HttpParams;)Lorg/apache/http/client/HttpClient;
    //   193: putfield 91	com/flurry/sdk/en:n	Lorg/apache/http/client/HttpClient;
    //   196: aload_0
    //   197: getfield 91	com/flurry/sdk/en:n	Lorg/apache/http/client/HttpClient;
    //   200: aload_2
    //   201: invokeinterface 344 2 0
    //   206: astore 7
    //   208: aload_0
    //   209: getfield 133	com/flurry/sdk/en:p	Z
    //   212: ifeq +23 -> 235
    //   215: new 94	java/lang/Exception
    //   218: dup
    //   219: ldc_w 346
    //   222: invokespecial 347	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   225: athrow
    //   226: astore 5
    //   228: aload_0
    //   229: invokespecial 233	com/flurry/sdk/en:r	()V
    //   232: aload 5
    //   234: athrow
    //   235: aload 7
    //   237: ifnull +212 -> 449
    //   240: aload_0
    //   241: aload 7
    //   243: invokeinterface 353 1 0
    //   248: invokeinterface 358 1 0
    //   253: putfield 61	com/flurry/sdk/en:r	I
    //   256: aload 7
    //   258: invokeinterface 362 1 0
    //   263: astore 8
    //   265: aload 8
    //   267: ifnull +79 -> 346
    //   270: aload 8
    //   272: arraylength
    //   273: istore 9
    //   275: iconst_0
    //   276: istore 10
    //   278: iload 10
    //   280: iload 9
    //   282: if_icmpge +64 -> 346
    //   285: aload 8
    //   287: iload 10
    //   289: aaload
    //   290: invokeinterface 368 1 0
    //   295: astore 11
    //   297: aload 11
    //   299: arraylength
    //   300: istore 12
    //   302: iconst_0
    //   303: istore 13
    //   305: iload 13
    //   307: iload 12
    //   309: if_icmpge +181 -> 490
    //   312: aload 11
    //   314: iload 13
    //   316: aaload
    //   317: astore 14
    //   319: aload_0
    //   320: getfield 63	com/flurry/sdk/en:s	Lcom/flurry/sdk/ds;
    //   323: aload 14
    //   325: invokeinterface 373 1 0
    //   330: aload 14
    //   332: invokeinterface 375 1 0
    //   337: invokevirtual 275	com/flurry/sdk/ds:a	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   340: iinc 13 1
    //   343: goto -38 -> 305
    //   346: getstatic 235	com/flurry/sdk/en$a:b	Lcom/flurry/sdk/en$a;
    //   349: aload_0
    //   350: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   353: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   356: ifne +25 -> 381
    //   359: getstatic 169	com/flurry/sdk/en$a:c	Lcom/flurry/sdk/en$a;
    //   362: aload_0
    //   363: getfield 155	com/flurry/sdk/en:e	Lcom/flurry/sdk/en$a;
    //   366: invokevirtual 173	com/flurry/sdk/en$a:equals	(Ljava/lang/Object;)Z
    //   369: istore 19
    //   371: iload 19
    //   373: ifne +8 -> 381
    //   376: aload_0
    //   377: invokespecial 233	com/flurry/sdk/en:r	()V
    //   380: return
    //   381: aload_0
    //   382: getfield 133	com/flurry/sdk/en:p	Z
    //   385: ifeq +14 -> 399
    //   388: new 94	java/lang/Exception
    //   391: dup
    //   392: ldc_w 346
    //   395: invokespecial 347	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   398: athrow
    //   399: aload 7
    //   401: invokeinterface 379 1 0
    //   406: astore 15
    //   408: aload 15
    //   410: ifnull +39 -> 449
    //   413: aload 15
    //   415: invokeinterface 384 1 0
    //   420: astore 18
    //   422: new 281	java/io/BufferedInputStream
    //   425: dup
    //   426: aload 18
    //   428: invokespecial 283	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   431: astore 17
    //   433: aload_0
    //   434: aload 17
    //   436: invokespecial 285	com/flurry/sdk/en:a	(Ljava/io/InputStream;)V
    //   439: aload 17
    //   441: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   444: aload 18
    //   446: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   449: aload_0
    //   450: invokespecial 233	com/flurry/sdk/en:r	()V
    //   453: return
    //   454: astore 16
    //   456: aconst_null
    //   457: astore 17
    //   459: aload 17
    //   461: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   464: aload_1
    //   465: invokestatic 255	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   468: aload 16
    //   470: athrow
    //   471: astore 16
    //   473: aload 18
    //   475: astore_1
    //   476: aconst_null
    //   477: astore 17
    //   479: goto -20 -> 459
    //   482: astore 16
    //   484: aload 18
    //   486: astore_1
    //   487: goto -28 -> 459
    //   490: iinc 10 1
    //   493: goto -215 -> 278
    //
    // Exception table:
    //   from	to	target	type
    //   142	226	226	finally
    //   240	265	226	finally
    //   270	275	226	finally
    //   285	302	226	finally
    //   312	340	226	finally
    //   346	371	226	finally
    //   381	399	226	finally
    //   399	408	226	finally
    //   439	449	226	finally
    //   459	471	226	finally
    //   413	422	454	finally
    //   422	433	471	finally
    //   433	439	482	finally
  }

  private void q()
  {
    if (this.l == null);
    while (b())
      return;
    this.l.a(this);
  }

  private void r()
  {
    if (this.o);
    do
    {
      return;
      this.o = true;
      if (this.m != null)
        this.m.disconnect();
    }
    while (this.n == null);
    this.n.getConnectionManager().shutdown();
  }

  private void s()
  {
    if (this.o);
    do
    {
      return;
      this.o = true;
    }
    while ((this.m == null) && (this.n == null));
    new Thread()
    {
      public void run()
      {
        if (en.a(en.this) != null)
          en.a(en.this).disconnect();
        if (en.b(en.this) != null)
          en.b(en.this).getConnectionManager().shutdown();
      }
    }
    .start();
  }

  public void a()
  {
    try
    {
      String str = this.d;
      if (str == null)
        return;
      if (!ev.a().c())
      {
        eo.a(3, a, "Network not available, aborting http request: " + this.d);
        return;
      }
      if ((this.e == null) || (en.a.a.equals(this.e)))
        this.e = en.a.b;
      if (Build.VERSION.SDK_INT >= 9)
        o();
      while (true)
      {
        eo.a(4, a, "HTTP status: " + this.r + " for url: " + this.d);
        return;
        p();
      }
    }
    catch (Exception localException)
    {
      eo.a(4, a, "HTTP status: " + this.r + " for url: " + this.d);
      eo.a(3, a, "Exception during http request: " + this.d, localException);
      this.q = localException;
      return;
    }
    finally
    {
      q();
    }
  }

  public void a(en.a parama)
  {
    this.e = parama;
  }

  public void a(en.c paramc)
  {
    this.l = paramc;
  }

  public void a(String paramString)
  {
    this.d = paramString;
  }

  public void a(String paramString1, String paramString2)
  {
    this.k.a(paramString1, paramString2);
  }

  public void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public List<String> b(String paramString)
  {
    if (paramString == null)
      return null;
    return this.s.a(paramString);
  }

  public boolean b()
  {
    synchronized (this.t)
    {
      boolean bool = this.p;
      return bool;
    }
  }

  public boolean c()
  {
    return (!f()) && (d());
  }

  public boolean d()
  {
    return (this.r >= 200) && (this.r < 400);
  }

  public int e()
  {
    return this.r;
  }

  public boolean f()
  {
    return this.q != null;
  }

  public void g()
  {
    synchronized (this.t)
    {
      this.p = true;
      s();
      return;
    }
  }

  public void h()
  {
    g();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.en
 * JD-Core Version:    0.6.2
 */