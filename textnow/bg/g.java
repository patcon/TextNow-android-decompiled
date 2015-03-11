package textnow.bg;

import android.os.AsyncTask;

final class g extends AsyncTask<String, Void, String>
{
  String a;
  private boolean c = false;
  private boolean d = false;
  private boolean e = false;

  g(e parame)
  {
  }

  // ERROR //
  private String a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 31	textnow/bg/g:a	Ljava/lang/String;
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
    //   40: aload_0
    //   41: getfield 17	textnow/bg/g:b	Ltextnow/bg/e;
    //   44: aload 5
    //   46: invokestatic 64	textnow/bg/e:a	(Ltextnow/bg/e;Lorg/apache/http/client/HttpClient;)V
    //   49: aload_1
    //   50: iconst_1
    //   51: aaload
    //   52: ldc 66
    //   54: invokevirtual 72	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   57: ifeq +231 -> 288
    //   60: aload_1
    //   61: iconst_0
    //   62: aaload
    //   63: astore 15
    //   65: new 74	org/apache/http/client/methods/HttpPost
    //   68: dup
    //   69: new 76	java/net/URI
    //   72: dup
    //   73: aload 15
    //   75: invokespecial 79	java/net/URI:<init>	(Ljava/lang/String;)V
    //   78: invokespecial 82	org/apache/http/client/methods/HttpPost:<init>	(Ljava/net/URI;)V
    //   81: astore 16
    //   83: aload 16
    //   85: aload 15
    //   87: invokestatic 87	textnow/be/m:a	(Lorg/apache/http/client/methods/HttpPost;Ljava/lang/String;)V
    //   90: new 89	org/json/JSONObject
    //   93: dup
    //   94: aload_1
    //   95: iconst_2
    //   96: aaload
    //   97: invokespecial 90	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   100: astore 17
    //   102: aload 17
    //   104: invokevirtual 94	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   107: astore 18
    //   109: aload 18
    //   111: invokeinterface 100 1 0
    //   116: ifeq +93 -> 209
    //   119: aload 18
    //   121: invokeinterface 104 1 0
    //   126: checkcast 68	java/lang/String
    //   129: astore 20
    //   131: aload 17
    //   133: aload 20
    //   135: invokevirtual 108	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   138: astore 23
    //   140: aload 23
    //   142: astore 22
    //   144: aload 22
    //   146: ifnull -37 -> 109
    //   149: aload 16
    //   151: aload 20
    //   153: aload 22
    //   155: invokevirtual 112	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: goto -49 -> 109
    //   161: astore_2
    //   162: aload_2
    //   163: invokestatic 117	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   166: aload_0
    //   167: iconst_1
    //   168: putfield 24	textnow/bg/g:d	Z
    //   171: aload_0
    //   172: iconst_1
    //   173: putfield 26	textnow/bg/g:e	Z
    //   176: aload_0
    //   177: getfield 17	textnow/bg/g:b	Ltextnow/bg/e;
    //   180: ldc 119
    //   182: invokevirtual 121	textnow/bg/e:a	(Ljava/lang/String;)V
    //   185: aload_0
    //   186: getfield 17	textnow/bg/g:b	Ltextnow/bg/e;
    //   189: ldc 123
    //   191: invokevirtual 125	textnow/bg/e:c	(Ljava/lang/String;)V
    //   194: aconst_null
    //   195: areturn
    //   196: astore 21
    //   198: aload 21
    //   200: invokestatic 117	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   203: aconst_null
    //   204: astore 22
    //   206: goto -62 -> 144
    //   209: aload 16
    //   211: new 127	org/apache/http/entity/StringEntity
    //   214: dup
    //   215: aload_1
    //   216: iconst_3
    //   217: aaload
    //   218: ldc 129
    //   220: invokespecial 131	org/apache/http/entity/StringEntity:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   223: invokevirtual 135	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   226: aload 5
    //   228: aload 16
    //   230: invokeinterface 141 2 0
    //   235: astore 19
    //   237: aload_0
    //   238: aload 19
    //   240: invokeinterface 147 1 0
    //   245: invokestatic 153	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   248: putfield 31	textnow/bg/g:a	Ljava/lang/String;
    //   251: aload_0
    //   252: getfield 24	textnow/bg/g:d	Z
    //   255: ifne +17 -> 272
    //   258: aload_0
    //   259: getfield 17	textnow/bg/g:b	Ltextnow/bg/e;
    //   262: ldc 119
    //   264: invokevirtual 121	textnow/bg/e:a	(Ljava/lang/String;)V
    //   267: aload_0
    //   268: iconst_1
    //   269: putfield 24	textnow/bg/g:d	Z
    //   272: aload 19
    //   274: invokeinterface 157 1 0
    //   279: invokeinterface 163 1 0
    //   284: invokestatic 168	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   287: areturn
    //   288: new 170	org/apache/http/client/methods/HttpGet
    //   291: dup
    //   292: new 76	java/net/URI
    //   295: dup
    //   296: aload_1
    //   297: iconst_0
    //   298: aaload
    //   299: invokespecial 79	java/net/URI:<init>	(Ljava/lang/String;)V
    //   302: invokespecial 171	org/apache/http/client/methods/HttpGet:<init>	(Ljava/net/URI;)V
    //   305: astore 6
    //   307: new 89	org/json/JSONObject
    //   310: dup
    //   311: aload_1
    //   312: iconst_2
    //   313: aaload
    //   314: invokespecial 90	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   317: astore 7
    //   319: aload 7
    //   321: invokevirtual 94	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   324: astore 8
    //   326: aload 8
    //   328: invokeinterface 100 1 0
    //   333: ifeq +58 -> 391
    //   336: aload 8
    //   338: invokeinterface 104 1 0
    //   343: checkcast 68	java/lang/String
    //   346: astore 11
    //   348: aload 7
    //   350: aload 11
    //   352: invokevirtual 108	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   355: astore 14
    //   357: aload 14
    //   359: astore 13
    //   361: aload 13
    //   363: ifnull -37 -> 326
    //   366: aload 6
    //   368: aload 11
    //   370: aload 13
    //   372: invokevirtual 172	org/apache/http/client/methods/HttpGet:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   375: goto -49 -> 326
    //   378: astore 12
    //   380: aload 12
    //   382: invokestatic 117	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   385: aconst_null
    //   386: astore 13
    //   388: goto -27 -> 361
    //   391: aload 5
    //   393: aload 6
    //   395: invokeinterface 141 2 0
    //   400: astore 9
    //   402: aload_0
    //   403: aload 9
    //   405: invokeinterface 147 1 0
    //   410: invokestatic 153	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   413: putfield 31	textnow/bg/g:a	Ljava/lang/String;
    //   416: aload_0
    //   417: getfield 24	textnow/bg/g:d	Z
    //   420: ifne +17 -> 437
    //   423: aload_0
    //   424: getfield 17	textnow/bg/g:b	Ltextnow/bg/e;
    //   427: ldc 119
    //   429: invokevirtual 121	textnow/bg/e:a	(Ljava/lang/String;)V
    //   432: aload_0
    //   433: iconst_1
    //   434: putfield 24	textnow/bg/g:d	Z
    //   437: aload 9
    //   439: invokeinterface 157 1 0
    //   444: invokeinterface 163 1 0
    //   449: invokestatic 168	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   452: astore 10
    //   454: aload 10
    //   456: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	109	161	java/lang/Exception
    //   109	131	161	java/lang/Exception
    //   149	158	161	java/lang/Exception
    //   198	203	161	java/lang/Exception
    //   209	272	161	java/lang/Exception
    //   272	288	161	java/lang/Exception
    //   288	326	161	java/lang/Exception
    //   326	348	161	java/lang/Exception
    //   366	375	161	java/lang/Exception
    //   380	385	161	java/lang/Exception
    //   391	437	161	java/lang/Exception
    //   437	454	161	java/lang/Exception
    //   131	140	196	java/lang/Exception
    //   348	357	378	java/lang/Exception
  }

  public final void a()
  {
    this.d = true;
    this.b.a("url-request");
    this.c = true;
    this.b.a(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bg.g
 * JD-Core Version:    0.6.2
 */