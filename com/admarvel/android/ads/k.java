package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class k extends AsyncTask<Object, Object, AdMarvelAd>
{
  private Map<String, Object> a = new HashMap();
  private WeakReference<AdMarvelView> b;
  private final WeakReference<Context> c;

  public k(Context paramContext)
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
    //   50: new 25	java/lang/ref/WeakReference
    //   53: dup
    //   54: aload_1
    //   55: bipush 6
    //   57: aaload
    //   58: checkcast 45	com/admarvel/android/ads/AdMarvelView
    //   61: invokespecial 28	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   64: putfield 47	com/admarvel/android/ads/k:b	Ljava/lang/ref/WeakReference;
    //   67: aload_1
    //   68: bipush 7
    //   70: aaload
    //   71: checkcast 39	java/lang/Integer
    //   74: invokevirtual 43	java/lang/Integer:intValue	()I
    //   77: istore 8
    //   79: aload_1
    //   80: bipush 8
    //   82: aaload
    //   83: checkcast 37	java/lang/String
    //   86: astore 9
    //   88: aload_1
    //   89: bipush 9
    //   91: aaload
    //   92: checkcast 49	java/lang/Boolean
    //   95: astore 10
    //   97: aload_1
    //   98: bipush 10
    //   100: aaload
    //   101: checkcast 49	java/lang/Boolean
    //   104: astore 11
    //   106: new 51	com/admarvel/android/ads/AdFetcher
    //   109: dup
    //   110: invokespecial 52	com/admarvel/android/ads/AdFetcher:<init>	()V
    //   113: astore 12
    //   115: aload_0
    //   116: getfield 30	com/admarvel/android/ads/k:c	Ljava/lang/ref/WeakReference;
    //   119: invokevirtual 56	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   122: checkcast 58	android/content/Context
    //   125: astore 13
    //   127: aload 13
    //   129: ifnull +616 -> 745
    //   132: aload_2
    //   133: ifnull +17 -> 150
    //   136: aload_2
    //   137: monitorenter
    //   138: aload_0
    //   139: getfield 23	com/admarvel/android/ads/k:a	Ljava/util/Map;
    //   142: aload_2
    //   143: invokeinterface 62 2 0
    //   148: aload_2
    //   149: monitorexit
    //   150: ldc 64
    //   152: aload 13
    //   154: invokestatic 70	com/admarvel/android/ads/AdMarvelAnalyticsAdapterInstances:getInstance	(Ljava/lang/String;Landroid/content/Context;)Lcom/admarvel/android/ads/AdMarvelAnalyticsAdapter;
    //   157: aload 4
    //   159: aload_0
    //   160: getfield 23	com/admarvel/android/ads/k:a	Ljava/util/Map;
    //   163: invokevirtual 76	com/admarvel/android/ads/AdMarvelAnalyticsAdapter:getEnhancedTargetParams	(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    //   166: astore 30
    //   168: aload 30
    //   170: astore 15
    //   172: aload 15
    //   174: ifnull +32 -> 206
    //   177: aload_0
    //   178: getfield 23	com/admarvel/android/ads/k:a	Ljava/util/Map;
    //   181: ifnull +374 -> 555
    //   184: aload 15
    //   186: aload_0
    //   187: getfield 23	com/admarvel/android/ads/k:a	Ljava/util/Map;
    //   190: invokeinterface 62 2 0
    //   195: aload_0
    //   196: getfield 23	com/admarvel/android/ads/k:a	Ljava/util/Map;
    //   199: aload 15
    //   201: invokeinterface 62 2 0
    //   206: aload_0
    //   207: getfield 47	com/admarvel/android/ads/k:b	Ljava/lang/ref/WeakReference;
    //   210: ifnull +367 -> 577
    //   213: aload_0
    //   214: getfield 47	com/admarvel/android/ads/k:b	Ljava/lang/ref/WeakReference;
    //   217: invokevirtual 56	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   220: checkcast 45	com/admarvel/android/ads/AdMarvelView
    //   223: astore 16
    //   225: iconst_0
    //   226: istore 17
    //   228: aload 16
    //   230: ifnull +10 -> 240
    //   233: aload 16
    //   235: invokevirtual 79	com/admarvel/android/ads/AdMarvelView:b	()Z
    //   238: istore 17
    //   240: getstatic 82	com/admarvel/android/ads/AdMarvelView:a	Z
    //   243: ifeq +340 -> 583
    //   246: aload 12
    //   248: getstatic 88	com/admarvel/android/ads/AdFetcher$Adtype:BANNER	Lcom/admarvel/android/ads/AdFetcher$Adtype;
    //   251: aload 13
    //   253: aload 5
    //   255: iload 6
    //   257: aload 7
    //   259: aload_0
    //   260: getfield 23	com/admarvel/android/ads/k:a	Ljava/util/Map;
    //   263: aload_3
    //   264: aload 4
    //   266: iload 8
    //   268: aload 9
    //   270: aload 10
    //   272: invokevirtual 91	java/lang/Boolean:booleanValue	()Z
    //   275: aload 11
    //   277: invokevirtual 91	java/lang/Boolean:booleanValue	()Z
    //   280: invokevirtual 95	com/admarvel/android/ads/AdFetcher:fetchOfflineAd	(Lcom/admarvel/android/ads/AdFetcher$Adtype;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZ)Ljava/lang/String;
    //   283: astore 18
    //   285: new 97	com/admarvel/android/ads/AdMarvelAd
    //   288: dup
    //   289: aload 18
    //   291: aload_0
    //   292: getfield 23	com/admarvel/android/ads/k:a	Ljava/util/Map;
    //   295: aload_3
    //   296: aload 4
    //   298: aload 5
    //   300: iload 6
    //   302: aload 7
    //   304: aload 13
    //   306: invokevirtual 101	android/content/Context:getPackageName	()Ljava/lang/String;
    //   309: invokespecial 104	com/admarvel/android/ads/AdMarvelAd:<init>	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    //   312: astore 19
    //   314: invokestatic 109	com/admarvel/android/ads/AdMarvelUtils:isLogDumpEnabled	()Z
    //   317: ifeq +13 -> 330
    //   320: aload 19
    //   322: aload 12
    //   324: invokevirtual 113	com/admarvel/android/ads/AdFetcher:getRequestJson	()Lorg/json/JSONObject;
    //   327: invokevirtual 117	com/admarvel/android/ads/AdMarvelAd:setRequestJson	(Lorg/json/JSONObject;)V
    //   330: getstatic 82	com/admarvel/android/ads/AdMarvelView:a	Z
    //   333: ifeq +109 -> 442
    //   336: aload 13
    //   338: ldc 119
    //   340: iconst_0
    //   341: invokevirtual 123	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   344: astore 27
    //   346: aload 27
    //   348: ldc 125
    //   350: ldc 127
    //   352: invokeinterface 133 3 0
    //   357: astore 28
    //   359: aload 19
    //   361: new 135	java/lang/StringBuilder
    //   364: dup
    //   365: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   368: ldc 138
    //   370: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: aload 27
    //   375: ldc 144
    //   377: ldc 127
    //   379: invokeinterface 133 3 0
    //   384: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: ldc 146
    //   389: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: aload 28
    //   394: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   400: invokevirtual 153	com/admarvel/android/ads/AdMarvelAd:setOfflineBaseUrl	(Ljava/lang/String;)V
    //   403: aload 19
    //   405: new 135	java/lang/StringBuilder
    //   408: dup
    //   409: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   412: aload 27
    //   414: ldc 144
    //   416: ldc 127
    //   418: invokeinterface 133 3 0
    //   423: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: ldc 146
    //   428: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   431: aload 28
    //   433: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   439: invokevirtual 156	com/admarvel/android/ads/AdMarvelAd:setOfflinekeyUrl	(Ljava/lang/String;)V
    //   442: aload 18
    //   444: ifnull +282 -> 726
    //   447: aload 19
    //   449: aload 13
    //   451: invokevirtual 160	com/admarvel/android/ads/AdMarvelAd:loadAd	(Landroid/content/Context;)Lcom/admarvel/android/ads/AdMarvelXMLReader;
    //   454: astore 22
    //   456: aload 22
    //   458: ifnull +249 -> 707
    //   461: aload 19
    //   463: invokevirtual 163	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   466: ifnull +61 -> 527
    //   469: aload 19
    //   471: invokevirtual 163	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   474: invokevirtual 166	java/lang/String:length	()I
    //   477: istore 23
    //   479: iload 23
    //   481: ifle +46 -> 527
    //   484: aload_0
    //   485: getfield 47	com/admarvel/android/ads/k:b	Ljava/lang/ref/WeakReference;
    //   488: invokevirtual 56	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   491: checkcast 45	com/admarvel/android/ads/AdMarvelView
    //   494: astore 25
    //   496: aload 25
    //   498: ifnull +29 -> 527
    //   501: aload 25
    //   503: getfield 169	com/admarvel/android/ads/AdMarvelView:b	Ljava/lang/String;
    //   506: aload 19
    //   508: invokevirtual 163	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   511: invokestatic 174	com/admarvel/android/ads/AdMarvelAdapterInstances:getInstance	(Ljava/lang/String;Ljava/lang/String;)Lcom/admarvel/android/ads/AdMarvelAdapter;
    //   514: aload 19
    //   516: aload 22
    //   518: invokevirtual 179	com/admarvel/android/ads/AdMarvelAdapter:loadAd	(Lcom/admarvel/android/ads/AdMarvelAd;Lcom/admarvel/android/ads/AdMarvelXMLReader;)Lcom/admarvel/android/ads/AdMarvelAd;
    //   521: astore 26
    //   523: aload 26
    //   525: astore 19
    //   527: aload 19
    //   529: areturn
    //   530: astore 32
    //   532: aload_2
    //   533: monitorexit
    //   534: aload 32
    //   536: athrow
    //   537: astore 31
    //   539: aload_0
    //   540: aconst_null
    //   541: putfield 23	com/admarvel/android/ads/k:a	Ljava/util/Map;
    //   544: goto -394 -> 150
    //   547: astore 14
    //   549: aconst_null
    //   550: astore 15
    //   552: goto -380 -> 172
    //   555: aload_0
    //   556: aload 15
    //   558: putfield 23	com/admarvel/android/ads/k:a	Ljava/util/Map;
    //   561: goto -355 -> 206
    //   564: astore 29
    //   566: aload 29
    //   568: invokestatic 185	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   571: invokestatic 190	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   574: goto -368 -> 206
    //   577: aconst_null
    //   578: astore 16
    //   580: goto -355 -> 225
    //   583: aload 12
    //   585: getstatic 88	com/admarvel/android/ads/AdFetcher$Adtype:BANNER	Lcom/admarvel/android/ads/AdFetcher$Adtype;
    //   588: aload 13
    //   590: aload 5
    //   592: iload 6
    //   594: aload 7
    //   596: aload_0
    //   597: getfield 23	com/admarvel/android/ads/k:a	Ljava/util/Map;
    //   600: aload_3
    //   601: aload 4
    //   603: iload 8
    //   605: aload 9
    //   607: aload 10
    //   609: invokevirtual 91	java/lang/Boolean:booleanValue	()Z
    //   612: aload 11
    //   614: invokevirtual 91	java/lang/Boolean:booleanValue	()Z
    //   617: iload 17
    //   619: aconst_null
    //   620: invokevirtual 194	com/admarvel/android/ads/AdFetcher:fetchAd	(Lcom/admarvel/android/ads/AdFetcher$Adtype;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZZLcom/admarvel/android/ads/AdMarvelNetworkHandler;)Ljava/lang/String;
    //   623: astore 18
    //   625: goto -340 -> 285
    //   628: astore 24
    //   630: aload 24
    //   632: invokestatic 185	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   635: invokestatic 190	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   638: aload 19
    //   640: getstatic 200	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   643: invokevirtual 204	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   646: aload 19
    //   648: sipush 303
    //   651: invokevirtual 208	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   654: aload 19
    //   656: areturn
    //   657: astore 21
    //   659: aload 21
    //   661: invokestatic 185	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   664: invokestatic 190	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   667: aload 19
    //   669: getstatic 200	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   672: invokevirtual 204	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   675: aload 19
    //   677: sipush 303
    //   680: invokevirtual 208	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   683: aload 19
    //   685: areturn
    //   686: astore 20
    //   688: aload 19
    //   690: getstatic 200	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   693: invokevirtual 204	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   696: aload 19
    //   698: sipush 303
    //   701: invokevirtual 208	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   704: aload 19
    //   706: areturn
    //   707: aload 19
    //   709: getstatic 200	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   712: invokevirtual 204	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   715: aload 19
    //   717: sipush 303
    //   720: invokevirtual 208	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   723: aload 19
    //   725: areturn
    //   726: aload 19
    //   728: getstatic 200	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   731: invokevirtual 204	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   734: aload 19
    //   736: sipush 303
    //   739: invokevirtual 208	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   742: aload 19
    //   744: areturn
    //   745: aconst_null
    //   746: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   138	150	530	finally
    //   136	138	537	java/lang/Exception
    //   532	537	537	java/lang/Exception
    //   150	168	547	java/lang/Exception
    //   177	206	564	java/lang/Exception
    //   555	561	564	java/lang/Exception
    //   484	496	628	java/lang/Exception
    //   501	523	628	java/lang/Exception
    //   447	456	657	java/lang/Exception
    //   461	479	657	java/lang/Exception
    //   630	654	657	java/lang/Exception
    //   707	723	657	java/lang/Exception
    //   659	683	686	java/lang/Exception
    //   726	742	686	java/lang/Exception
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
          AdMarvelUtils.ErrorReason localErrorReason2 = r.a(303);
          int j = r.a(localErrorReason2);
          localAdMarvelView2.getListenerImpl().a(localAdMarvelView2.getContext(), localAdMarvelView2, j, localErrorReason2, null, 0, null, "");
        }
      }
      else if (paramAdMarvelAd.getAdType() == AdMarvelAd.AdType.ERROR)
      {
        AdMarvelView localAdMarvelView7 = (AdMarvelView)this.b.get();
        if (localAdMarvelView7 == null)
          return;
        AdMarvelUtils.ErrorReason localErrorReason3 = r.a(paramAdMarvelAd.getErrorCode());
        int k = r.a(localErrorReason3);
        localAdMarvelView7.getListenerImpl().a(localAdMarvelView7.getContext(), localAdMarvelView7, k, localErrorReason3, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      AdMarvelUtils.ErrorReason localErrorReason1 = r.a(303);
      int i = r.a(localErrorReason1);
      AdMarvelView localAdMarvelView1 = (AdMarvelView)this.b.get();
      if (localAdMarvelView1 != null)
      {
        localAdMarvelView1.getListenerImpl().a(localAdMarvelView1.getContext(), localAdMarvelView1, i, localErrorReason1, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
        return;
        if (this.b.get() != null)
        {
          AdMarvelView localAdMarvelView6 = (AdMarvelView)this.b.get();
          if ((localAdMarvelView6 != null) && (localAdMarvelView6.b()))
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.k
 * JD-Core Version:    0.6.2
 */