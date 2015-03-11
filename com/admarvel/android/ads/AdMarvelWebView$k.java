package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

class AdMarvelWebView$k
  implements Runnable
{
  SimpleDateFormat a = new SimpleDateFormat("yyyyMMddhhmm");
  Long b = null;
  Long c = null;
  String d;
  String e;
  String f;
  String g;
  String h;
  String i;
  int j = 1;
  private final WeakReference<AdMarvelWebView> k;
  private final WeakReference<AdMarvelInternalWebView> l;

  public AdMarvelWebView$k(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelWebView paramAdMarvelWebView, String paramString1, String paramString2, String paramString3)
  {
    this.k = new WeakReference(paramAdMarvelWebView);
    this.l = new WeakReference(paramAdMarvelInternalWebView);
    if (paramString1 != null);
    try
    {
      this.b = Long.valueOf(this.a.parse(paramString1).getTime());
      this.c = Long.valueOf(3600000L + this.a.parse(paramString1).getTime());
      this.d = paramString2;
      this.e = paramString3;
      return;
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  public AdMarvelWebView$k(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelWebView paramAdMarvelWebView, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt)
  {
    this.k = new WeakReference(paramAdMarvelWebView);
    this.l = new WeakReference(paramAdMarvelInternalWebView);
    if (paramString1 != null);
    try
    {
      this.b = Long.valueOf(this.a.parse(paramString1).getTime());
      if (paramString6 != null);
      for (this.c = Long.valueOf(this.a.parse(paramString6).getTime()); ; this.c = Long.valueOf(3600000L + this.a.parse(paramString1).getTime()))
      {
        this.d = paramString2;
        this.e = paramString3;
        this.f = paramString4;
        this.g = paramString5;
        if (paramInt > 0)
          break;
        this.j = (paramInt / 60);
        return;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public AdMarvelWebView$k(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelWebView paramAdMarvelWebView, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt2, int paramInt3, String paramString11)
  {
    this.k = new WeakReference(paramAdMarvelWebView);
    this.l = new WeakReference(paramAdMarvelInternalWebView);
    if (paramString1 != null);
    try
    {
      this.b = Long.valueOf(this.a.parse(paramString1).getTime());
      if (paramString6 != null);
      for (this.c = Long.valueOf(this.a.parse(paramString6).getTime()); ; this.c = Long.valueOf(3600000L + this.a.parse(paramString1).getTime()))
      {
        this.d = paramString2;
        this.e = paramString3;
        this.f = paramString4;
        this.g = paramString5;
        if (paramInt1 <= 0)
          this.j = (paramInt1 / 60);
        if ((paramString7 != null) && (paramString7.length() > 0))
          this.h = paramString7;
        this.i = paramString11;
        return;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  String a()
  {
    if (ac.a() >= 8)
      return "content://com.android.calendar/";
    return "content://calendar/";
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	com/admarvel/android/ads/AdMarvelWebView$k:k	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 122	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 124	com/admarvel/android/ads/AdMarvelWebView
    //   10: astore_1
    //   11: aload_0
    //   12: getfield 56	com/admarvel/android/ads/AdMarvelWebView$k:l	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 122	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 126	com/admarvel/android/ads/AdMarvelInternalWebView
    //   21: astore_2
    //   22: aload_1
    //   23: ifnull +7 -> 30
    //   26: aload_2
    //   27: ifnonnull +4 -> 31
    //   30: return
    //   31: aload_1
    //   32: invokevirtual 130	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   35: invokevirtual 136	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   38: astore_3
    //   39: aload_3
    //   40: new 138	java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   47: aload_0
    //   48: invokevirtual 141	com/admarvel/android/ads/AdMarvelWebView$k:a	()Ljava/lang/String;
    //   51: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: ldc 147
    //   56: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: invokestatic 155	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   65: iconst_2
    //   66: anewarray 100	java/lang/String
    //   69: dup
    //   70: iconst_0
    //   71: ldc 157
    //   73: aastore
    //   74: dup
    //   75: iconst_1
    //   76: ldc 159
    //   78: aastore
    //   79: aconst_null
    //   80: aconst_null
    //   81: aconst_null
    //   82: invokevirtual 165	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   85: astore 7
    //   87: aload 7
    //   89: astore 5
    //   91: aload 5
    //   93: ifnull +484 -> 577
    //   96: aload 5
    //   98: invokeinterface 171 1 0
    //   103: ifeq +474 -> 577
    //   106: aload 5
    //   108: invokeinterface 174 1 0
    //   113: anewarray 100	java/lang/String
    //   116: astore 8
    //   118: aload 5
    //   120: invokeinterface 174 1 0
    //   125: newarray int
    //   127: astore 9
    //   129: iconst_0
    //   130: istore 10
    //   132: iload 10
    //   134: aload 8
    //   136: arraylength
    //   137: if_icmpge +43 -> 180
    //   140: aload 9
    //   142: iload 10
    //   144: aload 5
    //   146: iconst_0
    //   147: invokeinterface 178 2 0
    //   152: iastore
    //   153: aload 8
    //   155: iload 10
    //   157: aload 5
    //   159: iconst_1
    //   160: invokeinterface 182 2 0
    //   165: aastore
    //   166: aload 5
    //   168: invokeinterface 185 1 0
    //   173: pop
    //   174: iinc 10 1
    //   177: goto -45 -> 132
    //   180: new 187	android/content/ContentValues
    //   183: dup
    //   184: invokespecial 188	android/content/ContentValues:<init>	()V
    //   187: astore 11
    //   189: aload 11
    //   191: ldc 190
    //   193: aload 9
    //   195: iconst_0
    //   196: iaload
    //   197: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   200: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   203: aload_0
    //   204: getfield 76	com/admarvel/android/ads/AdMarvelWebView$k:d	Ljava/lang/String;
    //   207: ifnull +14 -> 221
    //   210: aload 11
    //   212: ldc 201
    //   214: aload_0
    //   215: getfield 76	com/admarvel/android/ads/AdMarvelWebView$k:d	Ljava/lang/String;
    //   218: invokevirtual 204	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   221: aload_0
    //   222: getfield 78	com/admarvel/android/ads/AdMarvelWebView$k:e	Ljava/lang/String;
    //   225: ifnull +14 -> 239
    //   228: aload 11
    //   230: ldc 206
    //   232: aload_0
    //   233: getfield 78	com/admarvel/android/ads/AdMarvelWebView$k:e	Ljava/lang/String;
    //   236: invokevirtual 204	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   239: aload_0
    //   240: getfield 92	com/admarvel/android/ads/AdMarvelWebView$k:f	Ljava/lang/String;
    //   243: ifnull +14 -> 257
    //   246: aload 11
    //   248: ldc 208
    //   250: aload_0
    //   251: getfield 92	com/admarvel/android/ads/AdMarvelWebView$k:f	Ljava/lang/String;
    //   254: invokevirtual 204	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   257: aload_0
    //   258: getfield 43	com/admarvel/android/ads/AdMarvelWebView$k:b	Ljava/lang/Long;
    //   261: ifnull +14 -> 275
    //   264: aload 11
    //   266: ldc 210
    //   268: aload_0
    //   269: getfield 43	com/admarvel/android/ads/AdMarvelWebView$k:b	Ljava/lang/Long;
    //   272: invokevirtual 213	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   275: aload_0
    //   276: getfield 45	com/admarvel/android/ads/AdMarvelWebView$k:c	Ljava/lang/Long;
    //   279: ifnull +14 -> 293
    //   282: aload 11
    //   284: ldc 215
    //   286: aload_0
    //   287: getfield 45	com/admarvel/android/ads/AdMarvelWebView$k:c	Ljava/lang/Long;
    //   290: invokevirtual 213	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   293: aload_0
    //   294: getfield 94	com/admarvel/android/ads/AdMarvelWebView$k:g	Ljava/lang/String;
    //   297: ifnull +44 -> 341
    //   300: aload_0
    //   301: getfield 94	com/admarvel/android/ads/AdMarvelWebView$k:g	Ljava/lang/String;
    //   304: invokevirtual 218	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   307: ldc 220
    //   309: invokevirtual 224	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   312: ifne +18 -> 330
    //   315: aload_0
    //   316: getfield 94	com/admarvel/android/ads/AdMarvelWebView$k:g	Ljava/lang/String;
    //   319: invokevirtual 218	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   322: ldc 226
    //   324: invokevirtual 224	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   327: ifeq +14 -> 341
    //   330: aload 11
    //   332: ldc 228
    //   334: iconst_1
    //   335: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   338: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   341: aload_0
    //   342: getfield 47	com/admarvel/android/ads/AdMarvelWebView$k:j	I
    //   345: ifgt +14 -> 359
    //   348: aload 11
    //   350: ldc 230
    //   352: iconst_1
    //   353: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   356: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   359: aload_0
    //   360: getfield 106	com/admarvel/android/ads/AdMarvelWebView$k:h	Ljava/lang/String;
    //   363: ifnull +24 -> 387
    //   366: aload_0
    //   367: getfield 106	com/admarvel/android/ads/AdMarvelWebView$k:h	Ljava/lang/String;
    //   370: invokevirtual 104	java/lang/String:length	()I
    //   373: ifle +14 -> 387
    //   376: aload 11
    //   378: ldc 232
    //   380: aload_0
    //   381: getfield 106	com/admarvel/android/ads/AdMarvelWebView$k:h	Ljava/lang/String;
    //   384: invokevirtual 204	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   387: new 138	java/lang/StringBuilder
    //   390: dup
    //   391: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   394: aload_0
    //   395: invokevirtual 141	com/admarvel/android/ads/AdMarvelWebView$k:a	()Ljava/lang/String;
    //   398: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: ldc 234
    //   403: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   409: invokestatic 155	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   412: astore 12
    //   414: new 138	java/lang/StringBuilder
    //   417: dup
    //   418: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   421: aload_0
    //   422: invokevirtual 141	com/admarvel/android/ads/AdMarvelWebView$k:a	()Ljava/lang/String;
    //   425: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: ldc 236
    //   430: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   436: invokestatic 155	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   439: astore 13
    //   441: aload_3
    //   442: aload 12
    //   444: aload 11
    //   446: invokevirtual 240	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   449: astore 14
    //   451: aload 14
    //   453: ifnull +137 -> 590
    //   456: aload_0
    //   457: getfield 47	com/admarvel/android/ads/AdMarvelWebView$k:j	I
    //   460: ifgt +67 -> 527
    //   463: new 187	android/content/ContentValues
    //   466: dup
    //   467: invokespecial 188	android/content/ContentValues:<init>	()V
    //   470: astore 15
    //   472: aload 15
    //   474: ldc 242
    //   476: aload 14
    //   478: invokevirtual 245	android/net/Uri:getLastPathSegment	()Ljava/lang/String;
    //   481: invokestatic 249	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   484: invokestatic 72	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   487: invokevirtual 213	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   490: aload 15
    //   492: ldc 251
    //   494: iconst_1
    //   495: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   498: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   501: aload 15
    //   503: ldc 253
    //   505: aload_0
    //   506: getfield 47	com/admarvel/android/ads/AdMarvelWebView$k:j	I
    //   509: invokestatic 258	java/lang/Math:abs	(I)I
    //   512: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   515: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   518: aload_3
    //   519: aload 13
    //   521: aload 15
    //   523: invokevirtual 240	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   526: pop
    //   527: aload_0
    //   528: getfield 108	com/admarvel/android/ads/AdMarvelWebView$k:i	Ljava/lang/String;
    //   531: ifnull +46 -> 577
    //   534: aload_0
    //   535: getfield 108	com/admarvel/android/ads/AdMarvelWebView$k:i	Ljava/lang/String;
    //   538: invokevirtual 104	java/lang/String:length	()I
    //   541: ifle +36 -> 577
    //   544: aload_2
    //   545: new 138	java/lang/StringBuilder
    //   548: dup
    //   549: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   552: ldc_w 260
    //   555: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   558: aload_0
    //   559: getfield 108	com/admarvel/android/ads/AdMarvelWebView$k:i	Ljava/lang/String;
    //   562: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   565: ldc_w 262
    //   568: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   571: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   574: invokevirtual 265	com/admarvel/android/ads/AdMarvelInternalWebView:loadUrl	(Ljava/lang/String;)V
    //   577: aload 5
    //   579: ifnull -549 -> 30
    //   582: aload 5
    //   584: invokeinterface 268 1 0
    //   589: return
    //   590: aload_0
    //   591: getfield 108	com/admarvel/android/ads/AdMarvelWebView$k:i	Ljava/lang/String;
    //   594: ifnull -17 -> 577
    //   597: aload_0
    //   598: getfield 108	com/admarvel/android/ads/AdMarvelWebView$k:i	Ljava/lang/String;
    //   601: invokevirtual 104	java/lang/String:length	()I
    //   604: ifle -27 -> 577
    //   607: aload_2
    //   608: new 138	java/lang/StringBuilder
    //   611: dup
    //   612: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   615: ldc_w 260
    //   618: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   621: aload_0
    //   622: getfield 108	com/admarvel/android/ads/AdMarvelWebView$k:i	Ljava/lang/String;
    //   625: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   628: ldc_w 270
    //   631: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   634: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   637: invokevirtual 265	com/admarvel/android/ads/AdMarvelInternalWebView:loadUrl	(Ljava/lang/String;)V
    //   640: goto -63 -> 577
    //   643: astore 4
    //   645: aload_0
    //   646: getfield 108	com/admarvel/android/ads/AdMarvelWebView$k:i	Ljava/lang/String;
    //   649: ifnull +46 -> 695
    //   652: aload_0
    //   653: getfield 108	com/admarvel/android/ads/AdMarvelWebView$k:i	Ljava/lang/String;
    //   656: invokevirtual 104	java/lang/String:length	()I
    //   659: ifle +36 -> 695
    //   662: aload_2
    //   663: new 138	java/lang/StringBuilder
    //   666: dup
    //   667: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   670: ldc_w 260
    //   673: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   676: aload_0
    //   677: getfield 108	com/admarvel/android/ads/AdMarvelWebView$k:i	Ljava/lang/String;
    //   680: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   683: ldc_w 270
    //   686: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   689: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   692: invokevirtual 265	com/admarvel/android/ads/AdMarvelInternalWebView:loadUrl	(Ljava/lang/String;)V
    //   695: aload 4
    //   697: invokevirtual 97	java/lang/Exception:printStackTrace	()V
    //   700: aload 5
    //   702: ifnull -672 -> 30
    //   705: aload 5
    //   707: invokeinterface 268 1 0
    //   712: return
    //   713: astore 6
    //   715: aconst_null
    //   716: astore 5
    //   718: aload 5
    //   720: ifnull +10 -> 730
    //   723: aload 5
    //   725: invokeinterface 268 1 0
    //   730: aload 6
    //   732: athrow
    //   733: astore 6
    //   735: goto -17 -> 718
    //   738: astore 4
    //   740: aconst_null
    //   741: astore 5
    //   743: goto -98 -> 645
    //
    // Exception table:
    //   from	to	target	type
    //   96	129	643	java/lang/Exception
    //   132	174	643	java/lang/Exception
    //   180	221	643	java/lang/Exception
    //   221	239	643	java/lang/Exception
    //   239	257	643	java/lang/Exception
    //   257	275	643	java/lang/Exception
    //   275	293	643	java/lang/Exception
    //   293	330	643	java/lang/Exception
    //   330	341	643	java/lang/Exception
    //   341	359	643	java/lang/Exception
    //   359	387	643	java/lang/Exception
    //   387	451	643	java/lang/Exception
    //   456	527	643	java/lang/Exception
    //   527	577	643	java/lang/Exception
    //   590	640	643	java/lang/Exception
    //   39	87	713	finally
    //   96	129	733	finally
    //   132	174	733	finally
    //   180	221	733	finally
    //   221	239	733	finally
    //   239	257	733	finally
    //   257	275	733	finally
    //   275	293	733	finally
    //   293	330	733	finally
    //   330	341	733	finally
    //   341	359	733	finally
    //   359	387	733	finally
    //   387	451	733	finally
    //   456	527	733	finally
    //   527	577	733	finally
    //   590	640	733	finally
    //   645	695	733	finally
    //   695	700	733	finally
    //   39	87	738	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.k
 * JD-Core Version:    0.6.2
 */