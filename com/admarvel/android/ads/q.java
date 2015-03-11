package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;

class q extends AsyncTask<Object, Object, AdMarvelAd>
{
  private Map<String, Object> a;
  private WeakReference<AdMarvelView> b;
  private final WeakReference<Context> c;
  private final File d;

  public q(File paramFile, Context paramContext)
  {
    this.d = paramFile;
    this.c = new WeakReference(paramContext);
  }

  // ERROR //
  protected AdMarvelAd a(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_0
    //   3: aaload
    //   4: checkcast 34	java/util/Map
    //   7: putfield 36	com/admarvel/android/ads/q:a	Ljava/util/Map;
    //   10: aload_1
    //   11: iconst_1
    //   12: aaload
    //   13: checkcast 38	java/lang/String
    //   16: astore_2
    //   17: aload_1
    //   18: iconst_2
    //   19: aaload
    //   20: checkcast 38	java/lang/String
    //   23: astore_3
    //   24: aload_1
    //   25: iconst_3
    //   26: aaload
    //   27: checkcast 38	java/lang/String
    //   30: astore 4
    //   32: aload_1
    //   33: iconst_4
    //   34: aaload
    //   35: checkcast 40	java/lang/Integer
    //   38: invokevirtual 44	java/lang/Integer:intValue	()I
    //   41: istore 5
    //   43: aload_1
    //   44: iconst_5
    //   45: aaload
    //   46: checkcast 38	java/lang/String
    //   49: astore 6
    //   51: aload_0
    //   52: new 24	java/lang/ref/WeakReference
    //   55: dup
    //   56: aload_1
    //   57: bipush 6
    //   59: aaload
    //   60: checkcast 46	com/admarvel/android/ads/AdMarvelView
    //   63: invokespecial 27	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   66: putfield 48	com/admarvel/android/ads/q:b	Ljava/lang/ref/WeakReference;
    //   69: aload_1
    //   70: bipush 7
    //   72: aaload
    //   73: checkcast 40	java/lang/Integer
    //   76: invokevirtual 44	java/lang/Integer:intValue	()I
    //   79: istore 7
    //   81: aload_1
    //   82: bipush 8
    //   84: aaload
    //   85: checkcast 38	java/lang/String
    //   88: astore 8
    //   90: aload_1
    //   91: bipush 9
    //   93: aaload
    //   94: checkcast 50	android/os/Handler
    //   97: astore 9
    //   99: aload_1
    //   100: bipush 10
    //   102: aaload
    //   103: checkcast 52	java/lang/Boolean
    //   106: astore 10
    //   108: aload_1
    //   109: bipush 11
    //   111: aaload
    //   112: checkcast 52	java/lang/Boolean
    //   115: astore 11
    //   117: new 54	com/admarvel/android/ads/a
    //   120: dup
    //   121: invokespecial 55	com/admarvel/android/ads/a:<init>	()V
    //   124: astore 12
    //   126: aload_0
    //   127: getfield 29	com/admarvel/android/ads/q:c	Ljava/lang/ref/WeakReference;
    //   130: invokevirtual 59	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   133: checkcast 61	android/content/Context
    //   136: astore 13
    //   138: aload 13
    //   140: ifnull +572 -> 712
    //   143: ldc 63
    //   145: aload 13
    //   147: invokestatic 68	com/admarvel/android/ads/c:a	(Ljava/lang/String;Landroid/content/Context;)Lcom/admarvel/android/ads/AdMarvelAnalyticsAdapter;
    //   150: aload_3
    //   151: aload_0
    //   152: getfield 36	com/admarvel/android/ads/q:a	Ljava/util/Map;
    //   155: invokevirtual 74	com/admarvel/android/ads/AdMarvelAnalyticsAdapter:getEnhancedTargetParams	(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    //   158: astore 29
    //   160: aload 29
    //   162: astore 15
    //   164: aload 15
    //   166: ifnull +32 -> 198
    //   169: aload_0
    //   170: getfield 36	com/admarvel/android/ads/q:a	Ljava/util/Map;
    //   173: ifnull +361 -> 534
    //   176: aload 15
    //   178: aload_0
    //   179: getfield 36	com/admarvel/android/ads/q:a	Ljava/util/Map;
    //   182: invokeinterface 78 2 0
    //   187: aload_0
    //   188: getfield 36	com/admarvel/android/ads/q:a	Ljava/util/Map;
    //   191: aload 15
    //   193: invokeinterface 78 2 0
    //   198: aload_0
    //   199: getfield 48	com/admarvel/android/ads/q:b	Ljava/lang/ref/WeakReference;
    //   202: ifnull +341 -> 543
    //   205: aload_0
    //   206: getfield 48	com/admarvel/android/ads/q:b	Ljava/lang/ref/WeakReference;
    //   209: invokevirtual 59	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   212: checkcast 46	com/admarvel/android/ads/AdMarvelView
    //   215: astore 16
    //   217: iconst_0
    //   218: istore 17
    //   220: aload 16
    //   222: ifnull +10 -> 232
    //   225: aload 16
    //   227: invokevirtual 81	com/admarvel/android/ads/AdMarvelView:a	()Z
    //   230: istore 17
    //   232: getstatic 84	com/admarvel/android/ads/AdMarvelView:b	Z
    //   235: ifeq +314 -> 549
    //   238: aload 12
    //   240: getstatic 89	com/admarvel/android/ads/a$a:a	Lcom/admarvel/android/ads/a$a;
    //   243: aload 13
    //   245: aload 4
    //   247: iload 5
    //   249: aload 6
    //   251: aload_0
    //   252: getfield 36	com/admarvel/android/ads/q:a	Ljava/util/Map;
    //   255: aload_2
    //   256: aload_3
    //   257: iload 7
    //   259: aload 8
    //   261: iconst_0
    //   262: aload 9
    //   264: aload 10
    //   266: invokevirtual 92	java/lang/Boolean:booleanValue	()Z
    //   269: aload 11
    //   271: invokevirtual 92	java/lang/Boolean:booleanValue	()Z
    //   274: invokevirtual 95	com/admarvel/android/ads/a:a	(Lcom/admarvel/android/ads/a$a;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLandroid/os/Handler;ZZ)Ljava/lang/String;
    //   277: astore 18
    //   279: new 97	com/admarvel/android/ads/AdMarvelAd
    //   282: dup
    //   283: aload 18
    //   285: aload_0
    //   286: getfield 36	com/admarvel/android/ads/q:a	Ljava/util/Map;
    //   289: aload_2
    //   290: aload_3
    //   291: aload 4
    //   293: iload 5
    //   295: aload 6
    //   297: iconst_0
    //   298: aload 13
    //   300: invokevirtual 101	android/content/Context:getPackageName	()Ljava/lang/String;
    //   303: invokespecial 104	com/admarvel/android/ads/AdMarvelAd:<init>	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V
    //   306: astore 19
    //   308: invokestatic 109	com/admarvel/android/ads/AdMarvelUtils:isLogDumpEnabled	()Z
    //   311: ifeq +13 -> 324
    //   314: aload 19
    //   316: aload 12
    //   318: invokevirtual 112	com/admarvel/android/ads/a:a	()Lorg/json/JSONObject;
    //   321: invokevirtual 116	com/admarvel/android/ads/AdMarvelAd:setRequestJson	(Lorg/json/JSONObject;)V
    //   324: getstatic 84	com/admarvel/android/ads/AdMarvelView:b	Z
    //   327: ifeq +109 -> 436
    //   330: aload 13
    //   332: ldc 118
    //   334: iconst_0
    //   335: invokevirtual 122	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   338: astore 27
    //   340: aload 27
    //   342: ldc 124
    //   344: ldc 126
    //   346: invokeinterface 132 3 0
    //   351: astore 28
    //   353: aload 19
    //   355: new 134	java/lang/StringBuilder
    //   358: dup
    //   359: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   362: ldc 137
    //   364: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: aload 27
    //   369: ldc 143
    //   371: ldc 126
    //   373: invokeinterface 132 3 0
    //   378: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: ldc 145
    //   383: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: aload 28
    //   388: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   394: invokevirtual 152	com/admarvel/android/ads/AdMarvelAd:setOfflineBaseUrl	(Ljava/lang/String;)V
    //   397: aload 19
    //   399: new 134	java/lang/StringBuilder
    //   402: dup
    //   403: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   406: aload 27
    //   408: ldc 143
    //   410: ldc 126
    //   412: invokeinterface 132 3 0
    //   417: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: ldc 145
    //   422: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: aload 28
    //   427: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   433: invokevirtual 155	com/admarvel/android/ads/AdMarvelAd:setOfflinekeyUrl	(Ljava/lang/String;)V
    //   436: aload 18
    //   438: ifnull +255 -> 693
    //   441: aload 19
    //   443: aload_0
    //   444: getfield 22	com/admarvel/android/ads/q:d	Ljava/io/File;
    //   447: invokevirtual 159	com/admarvel/android/ads/AdMarvelAd:loadAd	(Ljava/io/File;)Lcom/admarvel/android/ads/AdMarvelXMLReader;
    //   450: astore 22
    //   452: aload 22
    //   454: ifnull +220 -> 674
    //   457: aload 19
    //   459: invokevirtual 162	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   462: ifnull +61 -> 523
    //   465: aload 19
    //   467: invokevirtual 162	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   470: invokevirtual 165	java/lang/String:length	()I
    //   473: istore 23
    //   475: iload 23
    //   477: ifle +46 -> 523
    //   480: aload_0
    //   481: getfield 48	com/admarvel/android/ads/q:b	Ljava/lang/ref/WeakReference;
    //   484: invokevirtual 59	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   487: checkcast 46	com/admarvel/android/ads/AdMarvelView
    //   490: astore 25
    //   492: aload 25
    //   494: ifnull +29 -> 523
    //   497: aload 25
    //   499: getfield 168	com/admarvel/android/ads/AdMarvelView:c	Ljava/lang/String;
    //   502: aload 19
    //   504: invokevirtual 162	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   507: invokestatic 173	com/admarvel/android/ads/b:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/admarvel/android/ads/AdMarvelAdapter;
    //   510: aload 19
    //   512: aload 22
    //   514: invokevirtual 178	com/admarvel/android/ads/AdMarvelAdapter:loadAd	(Lcom/admarvel/android/ads/AdMarvelAd;Lcom/admarvel/android/ads/AdMarvelXMLReader;)Lcom/admarvel/android/ads/AdMarvelAd;
    //   517: astore 26
    //   519: aload 26
    //   521: astore 19
    //   523: aload 19
    //   525: areturn
    //   526: astore 14
    //   528: aconst_null
    //   529: astore 15
    //   531: goto -367 -> 164
    //   534: aload_0
    //   535: aload 15
    //   537: putfield 36	com/admarvel/android/ads/q:a	Ljava/util/Map;
    //   540: goto -342 -> 198
    //   543: aconst_null
    //   544: astore 16
    //   546: goto -329 -> 217
    //   549: aload 12
    //   551: getstatic 89	com/admarvel/android/ads/a$a:a	Lcom/admarvel/android/ads/a$a;
    //   554: aload 13
    //   556: aload 4
    //   558: iload 5
    //   560: aload 6
    //   562: aload_0
    //   563: getfield 36	com/admarvel/android/ads/q:a	Ljava/util/Map;
    //   566: aload_2
    //   567: aload_3
    //   568: iload 7
    //   570: aload 8
    //   572: iconst_0
    //   573: aload 9
    //   575: aload 10
    //   577: invokevirtual 92	java/lang/Boolean:booleanValue	()Z
    //   580: aload 11
    //   582: invokevirtual 92	java/lang/Boolean:booleanValue	()Z
    //   585: iload 17
    //   587: invokevirtual 181	com/admarvel/android/ads/a:a	(Lcom/admarvel/android/ads/a$a;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLandroid/os/Handler;ZZZ)Ljava/lang/String;
    //   590: astore 18
    //   592: goto -313 -> 279
    //   595: astore 24
    //   597: aload 24
    //   599: invokestatic 187	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   602: invokestatic 192	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   605: aload 19
    //   607: getstatic 198	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   610: invokevirtual 202	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   613: aload 19
    //   615: sipush 303
    //   618: invokevirtual 206	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   621: aload 19
    //   623: areturn
    //   624: astore 21
    //   626: aload 21
    //   628: invokestatic 187	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   631: invokestatic 192	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   634: aload 19
    //   636: getstatic 198	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   639: invokevirtual 202	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   642: aload 19
    //   644: sipush 303
    //   647: invokevirtual 206	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   650: aload 19
    //   652: areturn
    //   653: astore 20
    //   655: aload 19
    //   657: getstatic 198	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   660: invokevirtual 202	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   663: aload 19
    //   665: sipush 303
    //   668: invokevirtual 206	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   671: aload 19
    //   673: areturn
    //   674: aload 19
    //   676: getstatic 198	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   679: invokevirtual 202	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   682: aload 19
    //   684: sipush 303
    //   687: invokevirtual 206	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   690: aload 19
    //   692: areturn
    //   693: aload 19
    //   695: getstatic 198	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   698: invokevirtual 202	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   701: aload 19
    //   703: sipush 303
    //   706: invokevirtual 206	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   709: aload 19
    //   711: areturn
    //   712: aconst_null
    //   713: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   143	160	526	java/lang/Exception
    //   480	492	595	java/lang/Exception
    //   497	519	595	java/lang/Exception
    //   441	452	624	java/lang/Exception
    //   457	475	624	java/lang/Exception
    //   597	621	624	java/lang/Exception
    //   674	690	624	java/lang/Exception
    //   626	650	653	java/lang/Exception
    //   693	709	653	java/lang/Exception
  }

  protected void a(AdMarvelAd paramAdMarvelAd)
  {
    try
    {
      super.onPostExecute(paramAdMarvelAd);
      if (paramAdMarvelAd == null)
      {
        AdMarvelView localAdMarvelView2 = (AdMarvelView)this.b.get();
        if (localAdMarvelView2 != null)
        {
          AdMarvelUtils.ErrorReason localErrorReason2 = ab.a(303);
          int j = ab.a(localErrorReason2);
          localAdMarvelView2.getListenerImpl().a(localAdMarvelView2.getContext(), localAdMarvelView2, j, localErrorReason2, null, 0, null, "");
        }
      }
      else if (paramAdMarvelAd.getAdType() == AdMarvelAd.AdType.ERROR)
      {
        AdMarvelView localAdMarvelView7 = (AdMarvelView)this.b.get();
        if (localAdMarvelView7 == null)
          return;
        AdMarvelUtils.ErrorReason localErrorReason3 = ab.a(paramAdMarvelAd.getErrorCode());
        int k = ab.a(localErrorReason3);
        localAdMarvelView7.getListenerImpl().a(localAdMarvelView7.getContext(), localAdMarvelView7, k, localErrorReason3, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      AdMarvelUtils.ErrorReason localErrorReason1 = ab.a(303);
      int i = ab.a(localErrorReason1);
      AdMarvelView localAdMarvelView1 = (AdMarvelView)this.b.get();
      if (localAdMarvelView1 != null)
      {
        localAdMarvelView1.getListenerImpl().a(localAdMarvelView1.getContext(), localAdMarvelView1, i, localErrorReason1, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
        return;
        if (this.b.get() != null)
        {
          AdMarvelView localAdMarvelView6 = (AdMarvelView)this.b.get();
          if ((localAdMarvelView6 != null) && (localAdMarvelView6.a()))
          {
            if (localAdMarvelView6.getListenerImpl() == null)
              return;
            localAdMarvelView6.getListenerImpl().a(localAdMarvelView6, paramAdMarvelAd);
            return;
          }
        }
        if (paramAdMarvelAd.getAdType() == AdMarvelAd.AdType.SDKCALL)
        {
          if (paramAdMarvelAd.getSdkNetwork() != null)
          {
            AdMarvelView localAdMarvelView5 = (AdMarvelView)this.b.get();
            Context localContext2 = (Context)this.c.get();
            if ((localAdMarvelView5 == null) || (localContext2 == null))
              return;
            localAdMarvelView5.a(this.a, paramAdMarvelAd, paramAdMarvelAd.getSdkNetwork(), localContext2);
            return;
          }
          if (paramAdMarvelAd.isDisableAdrequest())
          {
            String str = paramAdMarvelAd.getDisableAdDuration();
            if (str != null)
            {
              AdMarvelView localAdMarvelView4 = (AdMarvelView)this.b.get();
              Context localContext1 = (Context)this.c.get();
              if ((localAdMarvelView4 == null) || (localContext1 == null))
                return;
              localAdMarvelView4.a(str, paramAdMarvelAd, localContext1);
              return;
            }
          }
        }
        AdMarvelView localAdMarvelView3 = (AdMarvelView)this.b.get();
        if (localAdMarvelView3 != null)
          localAdMarvelView3.a(paramAdMarvelAd);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.q
 * JD-Core Version:    0.6.2
 */