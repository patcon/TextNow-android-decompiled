package textnow.ay;

import android.os.AsyncTask;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.HttpParams;

public final class k extends AsyncTask<String, Void, String>
{
  String a;
  v b;
  private boolean c = false;
  private boolean d = false;
  private boolean e = false;

  public k(v paramv)
  {
    this.b = paramv;
  }

  // ERROR //
  private String a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 31	textnow/ay/k:a	Ljava/lang/String;
    //   5: new 33	org/apache/http/params/BasicHttpParams
    //   8: dup
    //   9: invokespecial 34	org/apache/http/params/BasicHttpParams:<init>	()V
    //   12: astore_3
    //   13: aload_3
    //   14: ldc 36
    //   16: getstatic 42	org/apache/http/HttpVersion:HTTP_1_1	Lorg/apache/http/HttpVersion;
    //   19: invokeinterface 48 3 0
    //   24: pop
    //   25: aload_3
    //   26: iconst_1
    //   27: invokestatic 54	org/apache/http/params/HttpConnectionParams:setTcpNoDelay	(Lorg/apache/http/params/HttpParams;Z)V
    //   30: new 56	org/apache/http/impl/client/DefaultHttpClient
    //   33: dup
    //   34: aload_3
    //   35: invokespecial 59	org/apache/http/impl/client/DefaultHttpClient:<init>	(Lorg/apache/http/params/HttpParams;)V
    //   38: astore 5
    //   40: invokestatic 65	com/tremorvideo/sdk/android/videoad/r:p	()I
    //   43: bipush 14
    //   45: if_icmpge +43 -> 88
    //   48: new 67	textnow/ay/k$1
    //   51: dup
    //   52: aload_0
    //   53: invokespecial 70	textnow/ay/k$1:<init>	(Ltextnow/ay/k;)V
    //   56: astore 6
    //   58: aload 5
    //   60: invokeinterface 76 1 0
    //   65: invokeinterface 82 1 0
    //   70: new 84	org/apache/http/conn/scheme/Scheme
    //   73: dup
    //   74: ldc 86
    //   76: aload 6
    //   78: sipush 443
    //   81: invokespecial 89	org/apache/http/conn/scheme/Scheme:<init>	(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
    //   84: invokevirtual 95	org/apache/http/conn/scheme/SchemeRegistry:register	(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    //   87: pop
    //   88: aload_1
    //   89: iconst_1
    //   90: aaload
    //   91: ldc 97
    //   93: invokevirtual 103	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   96: ifeq +204 -> 300
    //   99: aload_1
    //   100: iconst_0
    //   101: aaload
    //   102: astore 18
    //   104: new 105	org/apache/http/client/methods/HttpPost
    //   107: dup
    //   108: new 107	java/net/URI
    //   111: dup
    //   112: aload 18
    //   114: invokespecial 110	java/net/URI:<init>	(Ljava/lang/String;)V
    //   117: invokespecial 113	org/apache/http/client/methods/HttpPost:<init>	(Ljava/net/URI;)V
    //   120: astore 19
    //   122: aload 19
    //   124: aload 18
    //   126: invokestatic 118	textnow/ax/m:a	(Lorg/apache/http/client/methods/HttpPost;Ljava/lang/String;)V
    //   129: new 120	org/json/JSONObject
    //   132: dup
    //   133: aload_1
    //   134: iconst_2
    //   135: aaload
    //   136: invokespecial 121	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   139: astore 20
    //   141: aload 20
    //   143: invokevirtual 125	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   146: astore 21
    //   148: aload 21
    //   150: invokeinterface 131 1 0
    //   155: ifeq +75 -> 230
    //   158: aload 21
    //   160: invokeinterface 135 1 0
    //   165: checkcast 99	java/lang/String
    //   168: astore 23
    //   170: aload 20
    //   172: aload 23
    //   174: invokevirtual 139	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   177: astore 26
    //   179: aload 26
    //   181: astore 25
    //   183: aload 25
    //   185: ifnull -37 -> 148
    //   188: aload 19
    //   190: aload 23
    //   192: aload 25
    //   194: invokevirtual 143	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   197: goto -49 -> 148
    //   200: astore_2
    //   201: aload_2
    //   202: invokestatic 146	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   205: aload_0
    //   206: iconst_1
    //   207: putfield 22	textnow/ay/k:d	Z
    //   210: aload_0
    //   211: iconst_1
    //   212: putfield 24	textnow/ay/k:e	Z
    //   215: aconst_null
    //   216: areturn
    //   217: astore 24
    //   219: aload 24
    //   221: invokestatic 146	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   224: aconst_null
    //   225: astore 25
    //   227: goto -44 -> 183
    //   230: aload 19
    //   232: new 148	org/apache/http/entity/StringEntity
    //   235: dup
    //   236: aload_1
    //   237: iconst_3
    //   238: aaload
    //   239: ldc 150
    //   241: invokespecial 152	org/apache/http/entity/StringEntity:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   244: invokevirtual 156	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   247: aload 5
    //   249: aload 19
    //   251: invokeinterface 160 2 0
    //   256: astore 22
    //   258: aload_0
    //   259: aload 22
    //   261: invokeinterface 166 1 0
    //   266: invokestatic 172	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   269: putfield 31	textnow/ay/k:a	Ljava/lang/String;
    //   272: aload_0
    //   273: getfield 22	textnow/ay/k:d	Z
    //   276: ifne +8 -> 284
    //   279: aload_0
    //   280: iconst_1
    //   281: putfield 22	textnow/ay/k:d	Z
    //   284: aload 22
    //   286: invokeinterface 176 1 0
    //   291: invokeinterface 181 1 0
    //   296: invokestatic 186	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   299: areturn
    //   300: aload_1
    //   301: iconst_0
    //   302: aaload
    //   303: astore 8
    //   305: new 188	org/apache/http/client/methods/HttpGet
    //   308: dup
    //   309: new 107	java/net/URI
    //   312: dup
    //   313: aload 8
    //   315: invokespecial 110	java/net/URI:<init>	(Ljava/lang/String;)V
    //   318: invokespecial 189	org/apache/http/client/methods/HttpGet:<init>	(Ljava/net/URI;)V
    //   321: astore 9
    //   323: aload 9
    //   325: aload 8
    //   327: invokestatic 192	textnow/ax/m:a	(Lorg/apache/http/client/methods/HttpGet;Ljava/lang/String;)V
    //   330: new 120	org/json/JSONObject
    //   333: dup
    //   334: aload_1
    //   335: iconst_2
    //   336: aaload
    //   337: invokespecial 121	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   340: astore 10
    //   342: aload 10
    //   344: invokevirtual 125	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   347: astore 11
    //   349: aload 11
    //   351: invokeinterface 131 1 0
    //   356: ifeq +58 -> 414
    //   359: aload 11
    //   361: invokeinterface 135 1 0
    //   366: checkcast 99	java/lang/String
    //   369: astore 14
    //   371: aload 10
    //   373: aload 14
    //   375: invokevirtual 139	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   378: astore 17
    //   380: aload 17
    //   382: astore 16
    //   384: aload 16
    //   386: ifnull -37 -> 349
    //   389: aload 9
    //   391: aload 14
    //   393: aload 16
    //   395: invokevirtual 193	org/apache/http/client/methods/HttpGet:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   398: goto -49 -> 349
    //   401: astore 15
    //   403: aload 15
    //   405: invokestatic 146	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   408: aconst_null
    //   409: astore 16
    //   411: goto -27 -> 384
    //   414: aload 5
    //   416: aload 9
    //   418: invokeinterface 160 2 0
    //   423: astore 12
    //   425: aload_0
    //   426: aload 12
    //   428: invokeinterface 166 1 0
    //   433: invokestatic 172	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   436: putfield 31	textnow/ay/k:a	Ljava/lang/String;
    //   439: aload_0
    //   440: getfield 22	textnow/ay/k:d	Z
    //   443: ifne +8 -> 451
    //   446: aload_0
    //   447: iconst_1
    //   448: putfield 22	textnow/ay/k:d	Z
    //   451: aload 12
    //   453: invokeinterface 176 1 0
    //   458: invokeinterface 181 1 0
    //   463: invokestatic 186	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   466: astore 13
    //   468: aload 13
    //   470: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	88	200	java/lang/Exception
    //   88	148	200	java/lang/Exception
    //   148	170	200	java/lang/Exception
    //   188	197	200	java/lang/Exception
    //   219	224	200	java/lang/Exception
    //   230	284	200	java/lang/Exception
    //   284	300	200	java/lang/Exception
    //   300	349	200	java/lang/Exception
    //   349	371	200	java/lang/Exception
    //   389	398	200	java/lang/Exception
    //   403	408	200	java/lang/Exception
    //   414	451	200	java/lang/Exception
    //   451	468	200	java/lang/Exception
    //   170	179	217	java/lang/Exception
    //   371	380	401	java/lang/Exception
  }

  public final void a()
  {
    this.d = true;
    this.c = true;
    this.b.a(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.k
 * JD-Core Version:    0.6.2
 */