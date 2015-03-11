package textnow.bf;

import android.os.AsyncTask;

final class n extends AsyncTask<String, Void, String>
{
  String a;
  private boolean c = false;
  private boolean d = false;
  private boolean e = false;

  n(l paraml)
  {
  }

  // ERROR //
  private String a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 31	textnow/bf/n:a	Ljava/lang/String;
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
    //   41: getfield 17	textnow/bf/n:b	Ltextnow/bf/l;
    //   44: aload 5
    //   46: invokestatic 64	textnow/bf/l:a	(Ltextnow/bf/l;Lorg/apache/http/client/HttpClient;)V
    //   49: aload_1
    //   50: iconst_1
    //   51: aaload
    //   52: ldc 66
    //   54: invokevirtual 72	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   57: ifeq +204 -> 261
    //   60: aload_1
    //   61: iconst_0
    //   62: aaload
    //   63: astore 16
    //   65: new 74	org/apache/http/client/methods/HttpPost
    //   68: dup
    //   69: new 76	java/net/URI
    //   72: dup
    //   73: aload 16
    //   75: invokespecial 79	java/net/URI:<init>	(Ljava/lang/String;)V
    //   78: invokespecial 82	org/apache/http/client/methods/HttpPost:<init>	(Ljava/net/URI;)V
    //   81: astore 17
    //   83: aload 17
    //   85: aload 16
    //   87: invokestatic 87	textnow/be/m:a	(Lorg/apache/http/client/methods/HttpPost;Ljava/lang/String;)V
    //   90: new 89	org/json/JSONObject
    //   93: dup
    //   94: aload_1
    //   95: iconst_2
    //   96: aaload
    //   97: invokespecial 90	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   100: astore 18
    //   102: aload 18
    //   104: invokevirtual 94	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   107: astore 19
    //   109: aload 19
    //   111: invokeinterface 100 1 0
    //   116: ifeq +75 -> 191
    //   119: aload 19
    //   121: invokeinterface 104 1 0
    //   126: checkcast 68	java/lang/String
    //   129: astore 21
    //   131: aload 18
    //   133: aload 21
    //   135: invokevirtual 108	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   138: astore 24
    //   140: aload 24
    //   142: astore 23
    //   144: aload 23
    //   146: ifnull -37 -> 109
    //   149: aload 17
    //   151: aload 21
    //   153: aload 23
    //   155: invokevirtual 112	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: goto -49 -> 109
    //   161: astore_2
    //   162: aload_2
    //   163: invokestatic 117	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   166: aload_0
    //   167: iconst_1
    //   168: putfield 24	textnow/bf/n:d	Z
    //   171: aload_0
    //   172: iconst_1
    //   173: putfield 26	textnow/bf/n:e	Z
    //   176: aconst_null
    //   177: areturn
    //   178: astore 22
    //   180: aload 22
    //   182: invokestatic 117	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   185: aconst_null
    //   186: astore 23
    //   188: goto -44 -> 144
    //   191: aload 17
    //   193: new 119	org/apache/http/entity/StringEntity
    //   196: dup
    //   197: aload_1
    //   198: iconst_3
    //   199: aaload
    //   200: ldc 121
    //   202: invokespecial 123	org/apache/http/entity/StringEntity:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   205: invokevirtual 127	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   208: aload 5
    //   210: aload 17
    //   212: invokeinterface 133 2 0
    //   217: astore 20
    //   219: aload_0
    //   220: aload 20
    //   222: invokeinterface 139 1 0
    //   227: invokestatic 145	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   230: putfield 31	textnow/bf/n:a	Ljava/lang/String;
    //   233: aload_0
    //   234: getfield 24	textnow/bf/n:d	Z
    //   237: ifne +8 -> 245
    //   240: aload_0
    //   241: iconst_1
    //   242: putfield 24	textnow/bf/n:d	Z
    //   245: aload 20
    //   247: invokeinterface 149 1 0
    //   252: invokeinterface 155 1 0
    //   257: invokestatic 160	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   260: areturn
    //   261: aload_1
    //   262: iconst_0
    //   263: aaload
    //   264: astore 6
    //   266: new 162	org/apache/http/client/methods/HttpGet
    //   269: dup
    //   270: new 76	java/net/URI
    //   273: dup
    //   274: aload 6
    //   276: invokespecial 79	java/net/URI:<init>	(Ljava/lang/String;)V
    //   279: invokespecial 163	org/apache/http/client/methods/HttpGet:<init>	(Ljava/net/URI;)V
    //   282: astore 7
    //   284: aload 7
    //   286: aload 6
    //   288: invokestatic 166	textnow/be/m:a	(Lorg/apache/http/client/methods/HttpGet;Ljava/lang/String;)V
    //   291: new 89	org/json/JSONObject
    //   294: dup
    //   295: aload_1
    //   296: iconst_2
    //   297: aaload
    //   298: invokespecial 90	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   301: astore 8
    //   303: aload 8
    //   305: invokevirtual 94	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   308: astore 9
    //   310: aload 9
    //   312: invokeinterface 100 1 0
    //   317: ifeq +58 -> 375
    //   320: aload 9
    //   322: invokeinterface 104 1 0
    //   327: checkcast 68	java/lang/String
    //   330: astore 12
    //   332: aload 8
    //   334: aload 12
    //   336: invokevirtual 108	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   339: astore 15
    //   341: aload 15
    //   343: astore 14
    //   345: aload 14
    //   347: ifnull -37 -> 310
    //   350: aload 7
    //   352: aload 12
    //   354: aload 14
    //   356: invokevirtual 167	org/apache/http/client/methods/HttpGet:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   359: goto -49 -> 310
    //   362: astore 13
    //   364: aload 13
    //   366: invokestatic 117	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   369: aconst_null
    //   370: astore 14
    //   372: goto -27 -> 345
    //   375: aload 5
    //   377: aload 7
    //   379: invokeinterface 133 2 0
    //   384: astore 10
    //   386: aload_0
    //   387: aload 10
    //   389: invokeinterface 139 1 0
    //   394: invokestatic 145	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   397: putfield 31	textnow/bf/n:a	Ljava/lang/String;
    //   400: aload_0
    //   401: getfield 24	textnow/bf/n:d	Z
    //   404: ifne +8 -> 412
    //   407: aload_0
    //   408: iconst_1
    //   409: putfield 24	textnow/bf/n:d	Z
    //   412: aload 10
    //   414: invokeinterface 149 1 0
    //   419: invokeinterface 155 1 0
    //   424: invokestatic 160	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   427: astore 11
    //   429: aload 11
    //   431: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	109	161	java/lang/Exception
    //   109	131	161	java/lang/Exception
    //   149	158	161	java/lang/Exception
    //   180	185	161	java/lang/Exception
    //   191	245	161	java/lang/Exception
    //   245	261	161	java/lang/Exception
    //   261	310	161	java/lang/Exception
    //   310	332	161	java/lang/Exception
    //   350	359	161	java/lang/Exception
    //   364	369	161	java/lang/Exception
    //   375	412	161	java/lang/Exception
    //   412	429	161	java/lang/Exception
    //   131	140	178	java/lang/Exception
    //   332	341	362	java/lang/Exception
  }

  public final void a()
  {
    this.d = true;
    this.c = true;
    this.b.a(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bf.n
 * JD-Core Version:    0.6.2
 */