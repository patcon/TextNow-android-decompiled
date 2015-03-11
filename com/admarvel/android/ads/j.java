package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.Map;

class j extends AsyncTask<Object, Object, AdMarvelAd>
{
  private Map<String, Object> a;
  private AdMarvelInterstitialAds b;
  private final WeakReference<Context> c;

  public j(Context paramContext)
  {
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
    //   4: checkcast 30	java/util/Map
    //   7: putfield 32	com/admarvel/android/ads/j:a	Ljava/util/Map;
    //   10: aload_1
    //   11: iconst_1
    //   12: aaload
    //   13: checkcast 34	java/lang/String
    //   16: astore_2
    //   17: aload_1
    //   18: iconst_2
    //   19: aaload
    //   20: checkcast 34	java/lang/String
    //   23: astore_3
    //   24: aload_1
    //   25: iconst_3
    //   26: aaload
    //   27: checkcast 34	java/lang/String
    //   30: astore 4
    //   32: aload_1
    //   33: iconst_4
    //   34: aaload
    //   35: checkcast 36	java/lang/Integer
    //   38: invokevirtual 40	java/lang/Integer:intValue	()I
    //   41: istore 5
    //   43: aload_1
    //   44: iconst_5
    //   45: aaload
    //   46: checkcast 34	java/lang/String
    //   49: astore 6
    //   51: aload_0
    //   52: aload_1
    //   53: bipush 6
    //   55: aaload
    //   56: checkcast 42	com/admarvel/android/ads/AdMarvelInterstitialAds
    //   59: putfield 44	com/admarvel/android/ads/j:b	Lcom/admarvel/android/ads/AdMarvelInterstitialAds;
    //   62: aload_1
    //   63: bipush 7
    //   65: aaload
    //   66: checkcast 36	java/lang/Integer
    //   69: invokevirtual 40	java/lang/Integer:intValue	()I
    //   72: istore 7
    //   74: aload_1
    //   75: bipush 8
    //   77: aaload
    //   78: checkcast 34	java/lang/String
    //   81: astore 8
    //   83: aload_1
    //   84: bipush 9
    //   86: aaload
    //   87: checkcast 46	android/os/Handler
    //   90: astore 9
    //   92: aload_0
    //   93: getfield 25	com/admarvel/android/ads/j:c	Ljava/lang/ref/WeakReference;
    //   96: invokevirtual 50	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   99: checkcast 52	android/content/Context
    //   102: astore 10
    //   104: new 54	com/admarvel/android/ads/a
    //   107: dup
    //   108: invokespecial 55	com/admarvel/android/ads/a:<init>	()V
    //   111: astore 11
    //   113: aload 10
    //   115: ifnonnull +9 -> 124
    //   118: aconst_null
    //   119: astore 15
    //   121: aload 15
    //   123: areturn
    //   124: ldc 57
    //   126: aload 10
    //   128: invokestatic 62	com/admarvel/android/ads/c:a	(Ljava/lang/String;Landroid/content/Context;)Lcom/admarvel/android/ads/AdMarvelAnalyticsAdapter;
    //   131: aload_3
    //   132: aload_0
    //   133: getfield 32	com/admarvel/android/ads/j:a	Ljava/util/Map;
    //   136: invokevirtual 68	com/admarvel/android/ads/AdMarvelAnalyticsAdapter:getEnhancedTargetParams	(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    //   139: astore 24
    //   141: aload 24
    //   143: astore 13
    //   145: aload 13
    //   147: ifnull +21 -> 168
    //   150: aload_0
    //   151: getfield 32	com/admarvel/android/ads/j:a	Ljava/util/Map;
    //   154: ifnull +281 -> 435
    //   157: aload_0
    //   158: getfield 32	com/admarvel/android/ads/j:a	Ljava/util/Map;
    //   161: aload 13
    //   163: invokeinterface 72 2 0
    //   168: getstatic 76	com/admarvel/android/ads/AdMarvelInterstitialAds:enableOfflineSDK	Z
    //   171: ifeq +273 -> 444
    //   174: aload 11
    //   176: getstatic 81	com/admarvel/android/ads/a$a:b	Lcom/admarvel/android/ads/a$a;
    //   179: aload 10
    //   181: aload 4
    //   183: iload 5
    //   185: aload 6
    //   187: aload_0
    //   188: getfield 32	com/admarvel/android/ads/j:a	Ljava/util/Map;
    //   191: aload_2
    //   192: aload_3
    //   193: iload 7
    //   195: aload 8
    //   197: iconst_0
    //   198: aload 9
    //   200: iconst_0
    //   201: aload_0
    //   202: getfield 44	com/admarvel/android/ads/j:b	Lcom/admarvel/android/ads/AdMarvelInterstitialAds;
    //   205: invokevirtual 85	com/admarvel/android/ads/AdMarvelInterstitialAds:isAutoScalingEnabled	()Z
    //   208: invokevirtual 88	com/admarvel/android/ads/a:a	(Lcom/admarvel/android/ads/a$a;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLandroid/os/Handler;ZZ)Ljava/lang/String;
    //   211: astore 14
    //   213: new 90	com/admarvel/android/ads/AdMarvelAd
    //   216: dup
    //   217: aload 14
    //   219: aload_0
    //   220: getfield 32	com/admarvel/android/ads/j:a	Ljava/util/Map;
    //   223: aload_2
    //   224: aload_3
    //   225: aload 4
    //   227: iload 5
    //   229: aload 6
    //   231: iconst_0
    //   232: aload 10
    //   234: invokevirtual 94	android/content/Context:getPackageName	()Ljava/lang/String;
    //   237: invokespecial 97	com/admarvel/android/ads/AdMarvelAd:<init>	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V
    //   240: astore 15
    //   242: aload 15
    //   244: aload 11
    //   246: invokevirtual 100	com/admarvel/android/ads/a:a	()Lorg/json/JSONObject;
    //   249: invokevirtual 104	com/admarvel/android/ads/AdMarvelAd:setRequestJson	(Lorg/json/JSONObject;)V
    //   252: getstatic 76	com/admarvel/android/ads/AdMarvelInterstitialAds:enableOfflineSDK	Z
    //   255: ifeq +109 -> 364
    //   258: aload 10
    //   260: ldc 106
    //   262: iconst_0
    //   263: invokevirtual 110	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   266: astore 22
    //   268: aload 22
    //   270: ldc 112
    //   272: ldc 114
    //   274: invokeinterface 120 3 0
    //   279: astore 23
    //   281: aload 15
    //   283: new 122	java/lang/StringBuilder
    //   286: dup
    //   287: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   290: ldc 125
    //   292: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: aload 22
    //   297: ldc 131
    //   299: ldc 114
    //   301: invokeinterface 120 3 0
    //   306: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: ldc 133
    //   311: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: aload 23
    //   316: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   322: invokevirtual 140	com/admarvel/android/ads/AdMarvelAd:setOfflineBaseUrl	(Ljava/lang/String;)V
    //   325: aload 15
    //   327: new 122	java/lang/StringBuilder
    //   330: dup
    //   331: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   334: aload 22
    //   336: ldc 131
    //   338: ldc 114
    //   340: invokeinterface 120 3 0
    //   345: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: ldc 133
    //   350: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: aload 23
    //   355: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   361: invokevirtual 143	com/admarvel/android/ads/AdMarvelAd:setOfflinekeyUrl	(Ljava/lang/String;)V
    //   364: aload 14
    //   366: ifnull +219 -> 585
    //   369: aload 15
    //   371: aconst_null
    //   372: invokevirtual 147	com/admarvel/android/ads/AdMarvelAd:loadAd	(Ljava/io/File;)Lcom/admarvel/android/ads/AdMarvelXMLReader;
    //   375: astore 18
    //   377: aload 18
    //   379: ifnull +187 -> 566
    //   382: aload 15
    //   384: invokevirtual 150	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   387: ifnull -266 -> 121
    //   390: aload 15
    //   392: invokevirtual 150	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   395: invokevirtual 153	java/lang/String:length	()I
    //   398: istore 19
    //   400: iload 19
    //   402: ifle -281 -> 121
    //   405: ldc 155
    //   407: aload 15
    //   409: invokevirtual 150	com/admarvel/android/ads/AdMarvelAd:getSdkNetwork	()Ljava/lang/String;
    //   412: invokestatic 160	com/admarvel/android/ads/b:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/admarvel/android/ads/AdMarvelAdapter;
    //   415: aload 15
    //   417: aload 18
    //   419: invokevirtual 165	com/admarvel/android/ads/AdMarvelAdapter:loadAd	(Lcom/admarvel/android/ads/AdMarvelAd;Lcom/admarvel/android/ads/AdMarvelXMLReader;)Lcom/admarvel/android/ads/AdMarvelAd;
    //   422: astore 21
    //   424: aload 21
    //   426: areturn
    //   427: astore 12
    //   429: aconst_null
    //   430: astore 13
    //   432: goto -287 -> 145
    //   435: aload_0
    //   436: aload 13
    //   438: putfield 32	com/admarvel/android/ads/j:a	Ljava/util/Map;
    //   441: goto -273 -> 168
    //   444: aload 11
    //   446: getstatic 81	com/admarvel/android/ads/a$a:b	Lcom/admarvel/android/ads/a$a;
    //   449: aload 10
    //   451: aload 4
    //   453: iload 5
    //   455: aload 6
    //   457: aload_0
    //   458: getfield 32	com/admarvel/android/ads/j:a	Ljava/util/Map;
    //   461: aload_2
    //   462: aload_3
    //   463: iload 7
    //   465: aload 8
    //   467: iconst_0
    //   468: aload 9
    //   470: iconst_0
    //   471: aload_0
    //   472: getfield 44	com/admarvel/android/ads/j:b	Lcom/admarvel/android/ads/AdMarvelInterstitialAds;
    //   475: invokevirtual 85	com/admarvel/android/ads/AdMarvelInterstitialAds:isAutoScalingEnabled	()Z
    //   478: iconst_0
    //   479: invokevirtual 168	com/admarvel/android/ads/a:a	(Lcom/admarvel/android/ads/a$a;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLandroid/os/Handler;ZZZ)Ljava/lang/String;
    //   482: astore 14
    //   484: goto -271 -> 213
    //   487: astore 20
    //   489: aload 20
    //   491: invokestatic 174	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   494: invokestatic 179	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   497: aload 15
    //   499: getstatic 185	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   502: invokevirtual 189	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   505: aload 15
    //   507: sipush 303
    //   510: invokevirtual 193	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   513: aload 15
    //   515: areturn
    //   516: astore 17
    //   518: aload 17
    //   520: invokestatic 174	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   523: invokestatic 179	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   526: aload 15
    //   528: getstatic 185	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   531: invokevirtual 189	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   534: aload 15
    //   536: sipush 303
    //   539: invokevirtual 193	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   542: aload 15
    //   544: areturn
    //   545: astore 16
    //   547: aload 15
    //   549: getstatic 185	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   552: invokevirtual 189	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   555: aload 15
    //   557: sipush 303
    //   560: invokevirtual 193	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   563: aload 15
    //   565: areturn
    //   566: aload 15
    //   568: getstatic 185	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   571: invokevirtual 189	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   574: aload 15
    //   576: sipush 303
    //   579: invokevirtual 193	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   582: aload 15
    //   584: areturn
    //   585: aload 15
    //   587: getstatic 185	com/admarvel/android/ads/AdMarvelAd$AdType:ERROR	Lcom/admarvel/android/ads/AdMarvelAd$AdType;
    //   590: invokevirtual 189	com/admarvel/android/ads/AdMarvelAd:setAdType	(Lcom/admarvel/android/ads/AdMarvelAd$AdType;)V
    //   593: aload 15
    //   595: sipush 303
    //   598: invokevirtual 193	com/admarvel/android/ads/AdMarvelAd:setErrorCode	(I)V
    //   601: aload 15
    //   603: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   124	141	427	java/lang/Exception
    //   405	424	487	java/lang/Exception
    //   369	377	516	java/lang/Exception
    //   382	400	516	java/lang/Exception
    //   489	513	516	java/lang/Exception
    //   566	582	516	java/lang/Exception
    //   518	542	545	java/lang/Exception
    //   585	601	545	java/lang/Exception
  }

  protected void a(AdMarvelAd paramAdMarvelAd)
  {
    try
    {
      super.onPostExecute(paramAdMarvelAd);
      if (paramAdMarvelAd.getAdType() == AdMarvelAd.AdType.ERROR)
      {
        AdMarvelUtils.ErrorReason localErrorReason2 = ab.a(paramAdMarvelAd.getErrorCode());
        int j = ab.a(localErrorReason2);
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
      AdMarvelUtils.ErrorReason localErrorReason1 = ab.a(303);
      int i = ab.a(localErrorReason1);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.j
 * JD-Core Version:    0.6.2
 */