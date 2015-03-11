package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class f extends AsyncTask<Object, Object, AdMarvelAd>
{
  private Map<String, Object> a = new HashMap();
  private AdMarvelInterstitialAds b;
  private final WeakReference<Context> c;

  public f(Context paramContext)
  {
    this.c = new WeakReference(paramContext);
  }

  // ERROR //
  protected AdMarvelAd a(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: aaload
    //   3: checkcast 35	java/util/Map
    //   6: astore_2
    //   7: aload_1
    //   8: iconst_1
    //   9: aaload
    //   10: checkcast 37	java/lang/String
    //   13: astore_3
    //   14: aload_1
    //   15: iconst_2
    //   16: aaload
    //   17: checkcast 37	java/lang/String
    //   20: astore 4
    //   22: aload_1
    //   23: iconst_3
    //   24: aaload
    //   25: checkcast 37	java/lang/String
    //   28: astore 5
    //   30: aload_1
    //   31: iconst_4
    //   32: aaload
    //   33: checkcast 39	java/lang/Integer
    //   36: invokevirtual 43	java/lang/Integer:intValue	()I
    //   39: istore 6
    //   41: aload_1
    //   42: iconst_5
    //   43: aaload
    //   44: checkcast 37	java/lang/String
    //   47: astore 7
    //   49: aload_0
    //   50: aload_1
    //   51: bipush 6
    //   53: aaload
    //   54: checkcast 45	com/admarvel/android/ads/AdMarvelInterstitialAds
    //   57: putfield 47	com/admarvel/android/ads/f:b	Lcom/admarvel/android/ads/AdMarvelInterstitialAds;
    //   60: aload_1
    //   61: bipush 7
    //   63: aaload
    //   64: checkcast 39	java/lang/Integer
    //   67: invokevirtual 43	java/lang/Integer:intValue	()I
    //   70: istore 8
    //   72: aload_1
    //   73: bipush 8
    //   75: aaload
    //   76: checkcast 37	java/lang/String
    //   79: astore 9
    //   81: aload_0
    //   82: getfield 30	com/admarvel/android/ads/f:c	Ljava/lang/ref/WeakReference;
    //   85: invokevirtual 51	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   88: checkcast 53	android/content/Context
    //   91: astore 10
    //   93: new 55	com/admarvel/android/ads/AdFetcher
    //   96: dup
    //   97: invokespecial 56	com/admarvel/android/ads/AdFetcher:<init>	()V
    //   100: astore 11
    //   102: aload 10
    //   104: ifnonnull +9 -> 113
    //   107: aconst_null
    //   108: astore 15
    //   110: aload 15
    //   112: areturn
    //   113: aload_2
    //   114: ifnull +17 -> 131
    //   117: aload_2
    //   118: monitorenter
    //   119: aload_0
    //   120: getfield 23	com/admarvel/android/ads/f:a	Ljava/util/Map;
    //   123: aload_2
    //   124: invokeinterface 60 2 0
    //   129: aload_2
    //   130: monitorexit
    //   131: ldc 62
    //   133: aload 10
    //   135: invokestatic 68	com/admarvel/android/ads/AdMarvelAnalyticsAdapterInstances:getInstance	(Ljava/lang/String;Landroid/content/Context;)Lcom/admarvel/android/ads/AdMarvelAnalyticsAdapter;
    //   138: aload 4
    //   140: aload_0
    //   141: getfield 23	com/admarvel/android/ads/f:a	Ljava/util/Map;
    //   144: invokevirtual 74	com/admarvel/android/ads/AdMarvelAnalyticsAdapter:getEnhancedTargetParams	(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    //   147: astore 25
    //   149: aload 25
    //   151: astore 13
    //   153: aload 13
    //   155: ifnull +32 -> 187
    //   158: aload_0
    //   159: getfield 23	com/admarvel/android/ads/f:a	Ljava/util/Map;
    //   162: ifnull +308 -> 470
    //   165: aload 13
    //   167: aload_0
    //   168: getfield 23	com/admarvel/android/ads/f:a	Ljava/util/Map;
    //   171: invokeinterface 60 2 0
    //   176: aload_0
    //   177: getfield 23	com/admarvel/android/ads/f:a	Ljava/util/Map;
    //   180: aload 13
    //   182: invokeinterface 60 2 0
    //   187: getstatic 78	com/admarvel/android/ads/AdMarvelInterstitialAds:enableOfflineSDK	Z
    //   190: ifeq +302 -> 492
    //   193: aload 11
    //   195: getstatic 84	com/admarvel/android/ads/AdFetcher$Adtype:INTERSTITIAL	Lcom/admarvel/android/ads/AdFetcher$Adtype;
    //   198: aload 10
    //   200: aload 5
    //   202: iload 6
    //   204: aload 7
    //   206: aload_0
    //   207: getfield 23	com/admarvel/android/ads/f:a	Ljava/util/Map;
    //   210: aload_3
    //   211: aload 4
    //   213: iload 8
    //   215: aload 9
    //   217: iconst_0
    //   218: aload_0
    //   219: getfield 47	com/admarvel/android/ads/f:b	Lcom/admarvel/android/ads/AdMarvelInterstitialAds;
    //   222: invokevirtual 88	com/admarvel/android/ads/AdMarvelInterstitialAds:isAutoScalingEnabled	()Z
    //   225: invokevirtual 92	com/admarvel/android/ads/AdFetcher:fetchOfflineAd	(Lcom/admarvel/android/ads/AdFetcher$Adtype;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZ)Ljava/lang/String;
    //   228: astore 14
    //   230: new 94	com/admarvel/android/ads/AdMarvelAd
    //   233: dup
    //   234: aload 14
    //   236: aload_0
    //   237: getfield 23	com/admarvel/android/ads/f:a	Ljava/util/Map;
    //   240: aload_3
    //   241: aload 4
    //   243: aload 5
    //   245: iload 6
    //   247: aload 7
    //   249: aload 10
    //   251: invokevirtual 98	android/content/Context:getPackageName	()Ljava/lang/String;
    //   254: invokespecial 101	com/admarvel/android/ads/AdMarvelAd:<init>	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    //   257: astore 15
    //   259: aload 15
    //   261: aload 11
    //   263: invokevirtual 105	com/admarvel/android/ads/AdFetcher:getRequestJson	()Lorg/json/JSONObject;
    //   266: invokevirtual 109	com/admarvel/android/ads/AdMarvelAd:setRequestJson	(Lorg/json/JSONObject;)V
    //   269: getstatic 78	com/admarvel/android/ads/AdMarvelInterstitialAds:enableOfflineSDK	Z
    //   272: ifeq +109 -> 381
    //   275: aload 10
    //   277: ldc 111
    //   279: iconst_0
    //   280: invokevirtual 115	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   283: astore 22
    //   285: aload 22
    //   287: ldc 117
    //   289: ldc 119
    //   291: invokeinterface 125 3 0
    //   296: astore 23
    //   298: aload 15
    //   300: new 127	java/lang/StringBuilder
    //   303: dup
    //   304: invokespecial 128	java/lang/StringBuilder:<init>	()V
    //   307: ldc 130
    //   309: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: aload 22
    //   314: ldc 136
    //   316: ldc 119
    //   318: invokeinterface 125 3 0
    //   323: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: ldc 138
    //   328: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: aload 23
    //   333: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   339: invokevirtual 145	com/admarvel/android/ads/AdMarvelAd:setOfflineBaseUrl	(Ljava/lang/String;)V
    //   342: aload 15
    //   344: new 127	java/lang/StringBuilder
    //   347: dup
    //   348: invokespecial 128	java/lang/StringBuilder:<init>	()V
    //   351: aload 22
    //   353: ldc 136
    //   355: ldc 119
    //   357: invokeinterface 125 3 0
    //   362: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: ldc 138
    //   367: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: aload 23
    //   372: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   378: invokevirtual 148	com/admarvel/android/ads/AdMarvelAd:setOfflinekeyUrl	(Ljava/lang/String;)V
    //   381: aload 14
    //   383: ifnull +249 -> 632
    //   386: aload 15
    //   388: aload 10
    //   390: invokevirtual 152	com/admarvel/android/ads/AdMarvelAd:loadAd	(Landroid/content/Context;)Lcom/admarvel/android/ads/AdMarvelXMLReader;
    //   393: astore 18
    //   395: aload 18
    //   397: ifnull +216 -> 613
    //   400: aload 15
    //   402: invokevirtual 155	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   405: ifnull -295 -> 110
    //   408: aload 15
    //   410: invokevirtual 155	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   413: invokevirtual 158	java/lang/String:length	()I
    //   416: istore 19
    //   418: iload 19
    //   420: ifle -310 -> 110
    //   423: ldc 160
    //   425: aload 15
    //   427: invokevirtual 155	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   430: invokestatic 165	com/admarvel/android/ads/AdMarvelAdapterInstances:getInstance	(Ljava/lang/String;Ljava/lang/String;)Lcom/admarvel/android/ads/AdMarvelAdapter;
    //   433: aload 15
    //   435: aload 18
    //   437: invokevirtual 170	com/admarvel/android/ads/AdMarvelAdapter:loadAd	(Lcom/admarvel/android/ads/AdMarvelAd;Lcom/admarvel/android/ads/AdMarvelXMLReader;)Lcom/admarvel/android/ads/AdMarvelAd;
    //   440: astore 21
    //   442: aload 21
    //   444: areturn
    //   445: astore 27
    //   447: aload_2
    //   448: monitorexit
    //   449: aload 27
    //   451: athrow
    //   452: astore 26
    //   454: aload_0
    //   455: aconst_null
    //   456: putfield 23	com/admarvel/android/ads/f:a	Ljava/util/Map;
    //   459: goto -328 -> 131
    //   462: astore 12
    //   464: aconst_null
    //   465: astore 13
    //   467: goto -314 -> 153
    //   470: aload_0
    //   471: aload 13
    //   473: putfield 23	com/admarvel/android/ads/f:a	Ljava/util/Map;
    //   476: goto -289 -> 187
    //   479: astore 24
    //   481: aload 24
    //   483: invokestatic 176	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   486: invokestatic 181	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   489: goto -302 -> 187
    //   492: aload 11
    //   494: getstatic 84	com/admarvel/android/ads/AdFetcher$Adtype:INTERSTITIAL	Lcom/admarvel/android/ads/AdFetcher$Adtype;
    //   497: aload 10
    //   499: aload 5
    //   501: iload 6
    //   503: aload 7
    //   505: aload_0
    //   506: getfield 23	com/admarvel/android/ads/f:a	Ljava/util/Map;
    //   509: aload_3
    //   510: aload 4
    //   512: iload 8
    //   514: aload 9
    //   516: iconst_0
    //   517: aload_0
    //   518: getfield 47	com/admarvel/android/ads/f:b	Lcom/admarvel/android/ads/AdMarvelInterstitialAds;
    //   521: invokevirtual 88	com/admarvel/android/ads/AdMarvelInterstitialAds:isAutoScalingEnabled	()Z
    //   524: iconst_0
    //   525: aconst_null
    //   526: invokevirtual 185	com/admarvel/android/ads/AdFetcher:fetchAd	(Lcom/admarvel/android/ads/AdFetcher$Adtype;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZZLcom/admarvel/android/ads/AdMarvelNetworkHandler;)Ljava/lang/String;
    //   529: astore 14
    //   531: goto -301 -> 230
    //   534: astore 20
    //   536: aload 20
    //   538: invokestatic 176	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   541: invokestatic 181	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   544: aload 15
    //   546: getstatic 191	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   549: invokevirtual 195	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   552: aload 15
    //   554: sipush 303
    //   557: invokevirtual 199	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   560: aload 15
    //   562: areturn
    //   563: astore 17
    //   565: aload 17
    //   567: invokestatic 176	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   570: invokestatic 181	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   573: aload 15
    //   575: getstatic 191	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   578: invokevirtual 195	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   581: aload 15
    //   583: sipush 303
    //   586: invokevirtual 199	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   589: aload 15
    //   591: areturn
    //   592: astore 16
    //   594: aload 15
    //   596: getstatic 191	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   599: invokevirtual 195	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   602: aload 15
    //   604: sipush 303
    //   607: invokevirtual 199	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   610: aload 15
    //   612: areturn
    //   613: aload 15
    //   615: getstatic 191	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   618: invokevirtual 195	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   621: aload 15
    //   623: sipush 303
    //   626: invokevirtual 199	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   629: aload 15
    //   631: areturn
    //   632: aload 15
    //   634: getstatic 191	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   637: invokevirtual 195	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   640: aload 15
    //   642: sipush 303
    //   645: invokevirtual 199	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   648: aload 15
    //   650: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   119	131	445	finally
    //   117	119	452	java/lang/Exception
    //   447	452	452	java/lang/Exception
    //   131	149	462	java/lang/Exception
    //   158	187	479	java/lang/Exception
    //   470	476	479	java/lang/Exception
    //   423	442	534	java/lang/Exception
    //   386	395	563	java/lang/Exception
    //   400	418	563	java/lang/Exception
    //   536	560	563	java/lang/Exception
    //   613	629	563	java/lang/Exception
    //   565	589	592	java/lang/Exception
    //   632	648	592	java/lang/Exception
  }

  protected void a(AdMarvelAd paramAdMarvelAd)
  {
    try
    {
      super.onPostExecute(paramAdMarvelAd);
      if (paramAdMarvelAd.getAdType() == AdMarvelAd.AdType.ERROR)
      {
        AdMarvelUtils.ErrorReason localErrorReason2 = r.a(paramAdMarvelAd.getErrorCode());
        int j = r.a(localErrorReason2);
        Context localContext5 = (Context)this.c.get();
        if (localContext5 != null)
          AdMarvelInterstitialAds.getListener().a(localContext5, null, null, j, localErrorReason2, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
      }
      else if (paramAdMarvelAd.getAdType() == AdMarvelAd.AdType.SDKCALL)
      {
        if (paramAdMarvelAd.getSdkNetwork() != null)
        {
          Context localContext4 = (Context)this.c.get();
          this.b.requestPendingAdapterAd(this.a, paramAdMarvelAd, paramAdMarvelAd.getSdkNetwork(), localContext4);
          return;
        }
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      AdMarvelUtils.ErrorReason localErrorReason1 = r.a(303);
      int i = r.a(localErrorReason1);
      Context localContext1 = (Context)this.c.get();
      if (localContext1 != null)
      {
        AdMarvelInterstitialAds.getListener().a(localContext1, null, null, i, localErrorReason1, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
        return;
        if (paramAdMarvelAd.isDisableAdrequest())
        {
          String str = paramAdMarvelAd.getDisableAdDuration();
          if (str != null)
          {
            Context localContext3 = (Context)this.c.get();
            if ((this.b == null) || (localContext3 == null))
              return;
            this.b.disableAdRequest(str, paramAdMarvelAd, localContext3);
            return;
          }
        }
        if (this.c != null);
        for (Context localContext2 = (Context)this.c.get(); ; localContext2 = null)
        {
          this.b.requestPendingAdMarvelAd(paramAdMarvelAd, localContext2);
          return;
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.f
 * JD-Core Version:    0.6.2
 */