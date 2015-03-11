package com.appsflyer;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

class AppsFlyerLib$AttributionIdFetcher
  implements Runnable
{
  private static final String AF_ATTRIBUTION_ID_URI = "https://api.appsflyer.com/install_data/v3/";
  private static AtomicInteger currentRequestsCounter = new AtomicInteger(0);
  private String appsFlyerDevKey;
  private WeakReference<Context> ctxReference = null;
  private ScheduledExecutorService executorService;

  public AppsFlyerLib$AttributionIdFetcher(Context paramContext, String paramString, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.ctxReference = new WeakReference(paramContext);
    this.appsFlyerDevKey = paramString;
    this.executorService = paramScheduledExecutorService;
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:appsFlyerDevKey	Ljava/lang/String;
    //   4: ifnull +13 -> 17
    //   7: aload_0
    //   8: getfield 40	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:appsFlyerDevKey	Ljava/lang/String;
    //   11: invokevirtual 53	java/lang/String:length	()I
    //   14: ifne +4 -> 18
    //   17: return
    //   18: getstatic 28	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:currentRequestsCounter	Ljava/util/concurrent/atomic/AtomicInteger;
    //   21: invokevirtual 56	java/util/concurrent/atomic/AtomicInteger:incrementAndGet	()I
    //   24: pop
    //   25: aload_0
    //   26: getfield 33	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:ctxReference	Ljava/lang/ref/WeakReference;
    //   29: invokevirtual 60	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   32: checkcast 62	android/content/Context
    //   35: astore 8
    //   37: aload 8
    //   39: ifnonnull +11 -> 50
    //   42: getstatic 28	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:currentRequestsCounter	Ljava/util/concurrent/atomic/AtomicInteger;
    //   45: invokevirtual 65	java/util/concurrent/atomic/AtomicInteger:decrementAndGet	()I
    //   48: pop
    //   49: return
    //   50: aload 8
    //   52: aload 8
    //   54: invokestatic 71	com/appsflyer/AppsFlyerLib:access$700	(Landroid/content/Context;)Ljava/lang/String;
    //   57: invokestatic 75	com/appsflyer/AppsFlyerLib:access$800	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   60: astore 9
    //   62: ldc 77
    //   64: astore 10
    //   66: aload 9
    //   68: ifnull +25 -> 93
    //   71: new 79	java/lang/StringBuilder
    //   74: dup
    //   75: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   78: ldc 82
    //   80: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: aload 9
    //   85: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: astore 10
    //   93: new 79	java/lang/StringBuilder
    //   96: dup
    //   97: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   100: ldc 10
    //   102: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: aload 8
    //   107: invokevirtual 93	android/content/Context:getPackageName	()Ljava/lang/String;
    //   110: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: aload 10
    //   115: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: ldc 95
    //   120: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: aload_0
    //   124: getfield 40	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:appsFlyerDevKey	Ljava/lang/String;
    //   127: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: ldc 97
    //   132: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: aload 8
    //   137: invokestatic 100	com/appsflyer/AppsFlyerLib:getAppsFlyerUID	(Landroid/content/Context;)Ljava/lang/String;
    //   140: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: astore 11
    //   145: aload 8
    //   147: invokestatic 104	com/appsflyer/AppsFlyerLib:access$900	(Landroid/content/Context;)Z
    //   150: ifeq +27 -> 177
    //   153: new 79	java/lang/StringBuilder
    //   156: dup
    //   157: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   160: ldc 106
    //   162: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload 11
    //   167: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: pop
    //   177: new 108	java/net/URL
    //   180: dup
    //   181: aload 11
    //   183: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: invokespecial 111	java/net/URL:<init>	(Ljava/lang/String;)V
    //   189: invokevirtual 115	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   192: checkcast 117	java/net/HttpURLConnection
    //   195: astore_3
    //   196: aload_3
    //   197: ldc 119
    //   199: invokevirtual 122	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   202: aload_3
    //   203: sipush 10000
    //   206: invokevirtual 125	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   209: aload_3
    //   210: ldc 127
    //   212: ldc 129
    //   214: invokevirtual 133	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   217: aload_3
    //   218: invokevirtual 136	java/net/HttpURLConnection:connect	()V
    //   221: aload_3
    //   222: invokevirtual 139	java/net/HttpURLConnection:getResponseCode	()I
    //   225: sipush 200
    //   228: if_icmpne +376 -> 604
    //   231: new 79	java/lang/StringBuilder
    //   234: dup
    //   235: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   238: astore 12
    //   240: new 141	java/io/InputStreamReader
    //   243: dup
    //   244: aload_3
    //   245: invokevirtual 145	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   248: invokespecial 148	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   251: astore 13
    //   253: new 150	java/io/BufferedReader
    //   256: dup
    //   257: aload 13
    //   259: invokespecial 153	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   262: astore 14
    //   264: aload 14
    //   266: invokevirtual 156	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   269: astore 17
    //   271: aload 17
    //   273: ifnull +97 -> 370
    //   276: aload 12
    //   278: aload 17
    //   280: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: bipush 10
    //   285: invokevirtual 159	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   288: pop
    //   289: goto -25 -> 264
    //   292: astore 15
    //   294: aload 14
    //   296: astore 16
    //   298: aload 16
    //   300: ifnull +8 -> 308
    //   303: aload 16
    //   305: invokevirtual 161	java/io/BufferedReader:close	()V
    //   308: aload 13
    //   310: ifnull +8 -> 318
    //   313: aload 13
    //   315: invokevirtual 162	java/io/InputStreamReader:close	()V
    //   318: aload 15
    //   320: athrow
    //   321: astore_2
    //   322: invokestatic 166	com/appsflyer/AppsFlyerLib:access$1100	()Lcom/appsflyer/AppsFlyerConversionListener;
    //   325: ifnull +15 -> 340
    //   328: invokestatic 166	com/appsflyer/AppsFlyerLib:access$1100	()Lcom/appsflyer/AppsFlyerConversionListener;
    //   331: aload_2
    //   332: invokevirtual 169	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   335: invokeinterface 174 2 0
    //   340: aload_2
    //   341: invokevirtual 169	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   344: pop
    //   345: getstatic 28	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:currentRequestsCounter	Ljava/util/concurrent/atomic/AtomicInteger;
    //   348: invokevirtual 65	java/util/concurrent/atomic/AtomicInteger:decrementAndGet	()I
    //   351: pop
    //   352: aload_3
    //   353: ifnull +7 -> 360
    //   356: aload_3
    //   357: invokevirtual 177	java/net/HttpURLConnection:disconnect	()V
    //   360: aload_0
    //   361: getfield 42	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:executorService	Ljava/util/concurrent/ScheduledExecutorService;
    //   364: invokeinterface 182 1 0
    //   369: return
    //   370: aload 14
    //   372: invokevirtual 161	java/io/BufferedReader:close	()V
    //   375: aload 13
    //   377: invokevirtual 162	java/io/InputStreamReader:close	()V
    //   380: aload 8
    //   382: invokestatic 104	com/appsflyer/AppsFlyerLib:access$900	(Landroid/content/Context;)Z
    //   385: ifeq +27 -> 412
    //   388: new 79	java/lang/StringBuilder
    //   391: dup
    //   392: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   395: ldc 184
    //   397: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: aload 12
    //   402: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   405: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   411: pop
    //   412: aload 12
    //   414: invokevirtual 185	java/lang/StringBuilder:length	()I
    //   417: ifle +160 -> 577
    //   420: aload 8
    //   422: ifnull +155 -> 577
    //   425: aload 12
    //   427: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   430: invokestatic 189	com/appsflyer/AppsFlyerLib:access$1000	(Ljava/lang/String;)Ljava/util/Map;
    //   433: astore 19
    //   435: aload 19
    //   437: ldc 191
    //   439: invokeinterface 196 2 0
    //   444: checkcast 49	java/lang/String
    //   447: astore 20
    //   449: aload 20
    //   451: ifnull +13 -> 464
    //   454: ldc 198
    //   456: aload 20
    //   458: invokevirtual 202	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   461: ifeq +75 -> 536
    //   464: aload 8
    //   466: ldc 204
    //   468: iconst_0
    //   469: invokevirtual 208	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   472: invokeinterface 214 1 0
    //   477: astore 21
    //   479: aload 21
    //   481: ldc 216
    //   483: aload 12
    //   485: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   488: invokeinterface 222 3 0
    //   493: pop
    //   494: aload 21
    //   496: invokeinterface 226 1 0
    //   501: pop
    //   502: aload 8
    //   504: invokestatic 104	com/appsflyer/AppsFlyerLib:access$900	(Landroid/content/Context;)Z
    //   507: ifeq +29 -> 536
    //   510: new 79	java/lang/StringBuilder
    //   513: dup
    //   514: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   517: ldc 228
    //   519: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   522: aload 20
    //   524: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: ldc 230
    //   529: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   532: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   535: pop
    //   536: invokestatic 166	com/appsflyer/AppsFlyerLib:access$1100	()Lcom/appsflyer/AppsFlyerConversionListener;
    //   539: ifnull +38 -> 577
    //   542: getstatic 28	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:currentRequestsCounter	Ljava/util/concurrent/atomic/AtomicInteger;
    //   545: invokevirtual 233	java/util/concurrent/atomic/AtomicInteger:intValue	()I
    //   548: istore 25
    //   550: iload 25
    //   552: iconst_1
    //   553: if_icmpgt +24 -> 577
    //   556: aload 8
    //   558: invokestatic 237	com/appsflyer/AppsFlyerLib:getConversionData	(Landroid/content/Context;)Ljava/util/Map;
    //   561: astore 28
    //   563: aload 28
    //   565: astore 27
    //   567: invokestatic 166	com/appsflyer/AppsFlyerLib:access$1100	()Lcom/appsflyer/AppsFlyerConversionListener;
    //   570: aload 27
    //   572: invokeinterface 241 2 0
    //   577: getstatic 28	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:currentRequestsCounter	Ljava/util/concurrent/atomic/AtomicInteger;
    //   580: invokevirtual 65	java/util/concurrent/atomic/AtomicInteger:decrementAndGet	()I
    //   583: pop
    //   584: aload_3
    //   585: ifnull -225 -> 360
    //   588: aload_3
    //   589: invokevirtual 177	java/net/HttpURLConnection:disconnect	()V
    //   592: goto -232 -> 360
    //   595: astore 26
    //   597: aload 19
    //   599: astore 27
    //   601: goto -34 -> 567
    //   604: invokestatic 166	com/appsflyer/AppsFlyerLib:access$1100	()Lcom/appsflyer/AppsFlyerConversionListener;
    //   607: ifnull +33 -> 640
    //   610: invokestatic 166	com/appsflyer/AppsFlyerLib:access$1100	()Lcom/appsflyer/AppsFlyerConversionListener;
    //   613: new 79	java/lang/StringBuilder
    //   616: dup
    //   617: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   620: ldc 243
    //   622: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: aload_3
    //   626: invokevirtual 139	java/net/HttpURLConnection:getResponseCode	()I
    //   629: invokevirtual 246	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   632: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   635: invokeinterface 174 2 0
    //   640: aload 8
    //   642: invokestatic 104	com/appsflyer/AppsFlyerLib:access$900	(Landroid/content/Context;)Z
    //   645: ifeq -68 -> 577
    //   648: new 79	java/lang/StringBuilder
    //   651: dup
    //   652: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   655: ldc 248
    //   657: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   660: aload_3
    //   661: invokevirtual 139	java/net/HttpURLConnection:getResponseCode	()I
    //   664: invokevirtual 246	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   667: ldc 250
    //   669: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   672: aload 11
    //   674: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   677: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   680: pop
    //   681: goto -104 -> 577
    //   684: astore 4
    //   686: getstatic 28	com/appsflyer/AppsFlyerLib$AttributionIdFetcher:currentRequestsCounter	Ljava/util/concurrent/atomic/AtomicInteger;
    //   689: invokevirtual 65	java/util/concurrent/atomic/AtomicInteger:decrementAndGet	()I
    //   692: pop
    //   693: aload_3
    //   694: ifnull +7 -> 701
    //   697: aload_3
    //   698: invokevirtual 177	java/net/HttpURLConnection:disconnect	()V
    //   701: aload 4
    //   703: athrow
    //   704: astore 4
    //   706: aconst_null
    //   707: astore_3
    //   708: goto -22 -> 686
    //   711: astore_2
    //   712: aconst_null
    //   713: astore_3
    //   714: goto -392 -> 322
    //   717: astore 15
    //   719: aconst_null
    //   720: astore 13
    //   722: aconst_null
    //   723: astore 16
    //   725: goto -427 -> 298
    //   728: astore 15
    //   730: aconst_null
    //   731: astore 16
    //   733: goto -435 -> 298
    //
    // Exception table:
    //   from	to	target	type
    //   264	271	292	finally
    //   276	289	292	finally
    //   196	240	321	java/lang/Throwable
    //   303	308	321	java/lang/Throwable
    //   313	318	321	java/lang/Throwable
    //   318	321	321	java/lang/Throwable
    //   370	412	321	java/lang/Throwable
    //   412	420	321	java/lang/Throwable
    //   425	449	321	java/lang/Throwable
    //   454	464	321	java/lang/Throwable
    //   464	536	321	java/lang/Throwable
    //   536	550	321	java/lang/Throwable
    //   556	563	321	java/lang/Throwable
    //   567	577	321	java/lang/Throwable
    //   604	640	321	java/lang/Throwable
    //   640	681	321	java/lang/Throwable
    //   556	563	595	com/appsflyer/AttributionIDNotReady
    //   196	240	684	finally
    //   303	308	684	finally
    //   313	318	684	finally
    //   318	321	684	finally
    //   322	340	684	finally
    //   340	345	684	finally
    //   370	412	684	finally
    //   412	420	684	finally
    //   425	449	684	finally
    //   454	464	684	finally
    //   464	536	684	finally
    //   536	550	684	finally
    //   556	563	684	finally
    //   567	577	684	finally
    //   604	640	684	finally
    //   640	681	684	finally
    //   25	37	704	finally
    //   50	62	704	finally
    //   71	93	704	finally
    //   93	177	704	finally
    //   177	196	704	finally
    //   25	37	711	java/lang/Throwable
    //   50	62	711	java/lang/Throwable
    //   71	93	711	java/lang/Throwable
    //   93	177	711	java/lang/Throwable
    //   177	196	711	java/lang/Throwable
    //   240	253	717	finally
    //   253	264	728	finally
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.AppsFlyerLib.AttributionIdFetcher
 * JD-Core Version:    0.6.2
 */