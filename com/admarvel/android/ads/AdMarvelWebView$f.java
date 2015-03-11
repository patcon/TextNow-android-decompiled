package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelWebView$f
  implements Runnable
{
  private final String a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private final WeakReference<AdMarvelWebView> c;

  public AdMarvelWebView$f(String paramString, AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelWebView paramAdMarvelWebView)
  {
    this.a = paramString;
    this.b = new WeakReference(paramAdMarvelInternalWebView);
    this.c = new WeakReference(paramAdMarvelWebView);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	com/admarvel/android/ads/AdMarvelWebView$f:b	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 38	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 40	com/admarvel/android/ads/AdMarvelInternalWebView
    //   10: astore_3
    //   11: aload_0
    //   12: getfield 29	com/admarvel/android/ads/AdMarvelWebView$f:c	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 38	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 42	com/admarvel/android/ads/AdMarvelWebView
    //   21: astore 4
    //   23: aload 4
    //   25: ifnonnull +4 -> 29
    //   28: return
    //   29: aload_3
    //   30: ifnull +1247 -> 1277
    //   33: invokestatic 47	com/admarvel/android/ads/ac:a	()I
    //   36: bipush 9
    //   38: if_icmpge +1056 -> 1094
    //   41: aload 4
    //   43: invokevirtual 51	com/admarvel/android/ads/AdMarvelWebView:getResources	()Landroid/content/res/Resources;
    //   46: invokevirtual 57	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   49: getfield 63	android/content/res/Configuration:orientation	I
    //   52: istore 56
    //   54: iload 56
    //   56: iconst_1
    //   57: if_icmpne +1024 -> 1081
    //   60: iconst_0
    //   61: istore 6
    //   63: aload 4
    //   65: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   68: invokestatic 72	com/admarvel/android/ads/ab:a	(Landroid/content/Context;)Ljava/lang/String;
    //   71: astore 7
    //   73: aload 7
    //   75: ldc 74
    //   77: invokevirtual 80	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   80: ifne +1198 -> 1278
    //   83: aload 7
    //   85: ldc 82
    //   87: invokevirtual 80	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: ifeq +1242 -> 1332
    //   93: goto +1185 -> 1278
    //   96: aload 4
    //   98: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   101: ldc 84
    //   103: invokestatic 87	com/admarvel/android/ads/ab:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   106: istore 9
    //   108: aconst_null
    //   109: astore 10
    //   111: iload 9
    //   113: ifeq +12 -> 125
    //   116: invokestatic 92	com/admarvel/android/ads/l:a	()Lcom/admarvel/android/ads/l;
    //   119: aload_3
    //   120: invokevirtual 95	com/admarvel/android/ads/l:a	(Lcom/admarvel/android/ads/AdMarvelInternalWebView;)Landroid/location/Location;
    //   123: astore 10
    //   125: aload 10
    //   127: ifnull +1213 -> 1340
    //   130: new 97	java/lang/StringBuilder
    //   133: dup
    //   134: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   137: ldc 100
    //   139: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: aload 10
    //   144: invokevirtual 110	android/location/Location:getLatitude	()D
    //   147: invokevirtual 113	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   150: ldc 115
    //   152: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: aload 10
    //   157: invokevirtual 118	android/location/Location:getLongitude	()D
    //   160: invokevirtual 113	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   163: ldc 120
    //   165: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: aload 10
    //   170: invokevirtual 124	android/location/Location:getAccuracy	()F
    //   173: invokevirtual 127	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   176: ldc 129
    //   178: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: astore 11
    //   186: new 97	java/lang/StringBuilder
    //   189: dup
    //   190: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   193: ldc 135
    //   195: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: aload 4
    //   200: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   203: ldc 137
    //   205: invokestatic 87	com/admarvel/android/ads/ab:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   208: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   211: ldc 142
    //   213: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: astore 12
    //   218: aload 4
    //   220: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   223: ldc 144
    //   225: invokestatic 147	com/admarvel/android/ads/ab:d	(Landroid/content/Context;Ljava/lang/String;)Z
    //   228: ifne +1058 -> 1286
    //   231: aload 4
    //   233: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   236: ldc 149
    //   238: invokestatic 147	com/admarvel/android/ads/ab:d	(Landroid/content/Context;Ljava/lang/String;)Z
    //   241: ifeq +1107 -> 1348
    //   244: goto +1042 -> 1286
    //   247: aload 12
    //   249: iload 13
    //   251: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   254: ldc 151
    //   256: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: aload 4
    //   261: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   264: ldc 153
    //   266: invokestatic 87	com/admarvel/android/ads/ab:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   269: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   272: ldc 155
    //   274: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: aload 4
    //   279: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   282: ldc 153
    //   284: invokestatic 87	com/admarvel/android/ads/ab:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   287: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   290: ldc 157
    //   292: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: aload 4
    //   297: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   300: invokestatic 161	com/admarvel/android/ads/ab:j	(Landroid/content/Context;)Z
    //   303: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   306: ldc 163
    //   308: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: aload 4
    //   313: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   316: invokestatic 161	com/admarvel/android/ads/ab:j	(Landroid/content/Context;)Z
    //   319: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   322: ldc 165
    //   324: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: astore 14
    //   329: aload 4
    //   331: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   334: ldc 167
    //   336: invokestatic 147	com/admarvel/android/ads/ab:d	(Landroid/content/Context;Ljava/lang/String;)Z
    //   339: ifeq +1015 -> 1354
    //   342: aload 4
    //   344: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   347: ldc 169
    //   349: invokestatic 147	com/admarvel/android/ads/ab:d	(Landroid/content/Context;Ljava/lang/String;)Z
    //   352: ifeq +1002 -> 1354
    //   355: iconst_1
    //   356: istore 15
    //   358: aload 14
    //   360: iload 15
    //   362: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   365: ldc 171
    //   367: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: aload 4
    //   372: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   375: ldc 173
    //   377: invokestatic 87	com/admarvel/android/ads/ab:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   380: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   383: ldc 175
    //   385: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   391: astore 16
    //   393: aload_3
    //   394: getfield 178	com/admarvel/android/ads/AdMarvelInternalWebView:adMarvelViewReference	Ljava/lang/ref/WeakReference;
    //   397: invokevirtual 38	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   400: checkcast 180	com/admarvel/android/ads/AdMarvelView
    //   403: astore 17
    //   405: aload 17
    //   407: ifnull +837 -> 1244
    //   410: iconst_2
    //   411: newarray int
    //   413: astore 18
    //   415: aload_3
    //   416: aload 18
    //   418: invokevirtual 184	com/admarvel/android/ads/AdMarvelInternalWebView:getLocationOnScreen	([I)V
    //   421: aload 4
    //   423: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   426: instanceof 186
    //   429: ifeq +809 -> 1238
    //   432: aload 4
    //   434: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   437: checkcast 186	android/app/Activity
    //   440: astore 52
    //   442: aload 52
    //   444: ifnull +794 -> 1238
    //   447: aload 4
    //   449: invokestatic 190	com/admarvel/android/ads/AdMarvelWebView:p	(Lcom/admarvel/android/ads/AdMarvelWebView;)I
    //   452: ldc 191
    //   454: if_icmpeq +682 -> 1136
    //   457: aload 4
    //   459: invokestatic 190	com/admarvel/android/ads/AdMarvelWebView:p	(Lcom/admarvel/android/ads/AdMarvelWebView;)I
    //   462: iflt +674 -> 1136
    //   465: aload 4
    //   467: invokestatic 190	com/admarvel/android/ads/AdMarvelWebView:p	(Lcom/admarvel/android/ads/AdMarvelWebView;)I
    //   470: istore 20
    //   472: aload 18
    //   474: iconst_0
    //   475: iaload
    //   476: istore 21
    //   478: aload 18
    //   480: iconst_1
    //   481: iaload
    //   482: iload 20
    //   484: isub
    //   485: istore 22
    //   487: aload_3
    //   488: invokevirtual 194	com/admarvel/android/ads/AdMarvelInternalWebView:getWidth	()I
    //   491: istore 23
    //   493: aload_3
    //   494: invokevirtual 197	com/admarvel/android/ads/AdMarvelInternalWebView:getHeight	()I
    //   497: istore 24
    //   499: iconst_2
    //   500: newarray int
    //   502: astore 25
    //   504: aload 17
    //   506: aload 25
    //   508: invokevirtual 198	com/admarvel/android/ads/AdMarvelView:getLocationOnScreen	([I)V
    //   511: aload 25
    //   513: iconst_0
    //   514: iaload
    //   515: istore 26
    //   517: aload 25
    //   519: iconst_1
    //   520: iaload
    //   521: iload 20
    //   523: isub
    //   524: istore 27
    //   526: aload 17
    //   528: invokevirtual 199	com/admarvel/android/ads/AdMarvelView:getWidth	()I
    //   531: istore 28
    //   533: aload 17
    //   535: invokevirtual 200	com/admarvel/android/ads/AdMarvelView:getHeight	()I
    //   538: istore 29
    //   540: iload 27
    //   542: istore 30
    //   544: iload 26
    //   546: istore 31
    //   548: iload 24
    //   550: istore 32
    //   552: iload 23
    //   554: istore 33
    //   556: iload 22
    //   558: istore 34
    //   560: iload 21
    //   562: istore 35
    //   564: iload 29
    //   566: istore 36
    //   568: iload 28
    //   570: istore 37
    //   572: aload 4
    //   574: invokevirtual 204	com/admarvel/android/ads/AdMarvelWebView:getRootView	()Landroid/view/View;
    //   577: invokevirtual 209	android/view/View:getLeft	()I
    //   580: istore 38
    //   582: aload 4
    //   584: invokevirtual 204	com/admarvel/android/ads/AdMarvelWebView:getRootView	()Landroid/view/View;
    //   587: invokevirtual 212	android/view/View:getTop	()I
    //   590: istore 39
    //   592: aload 4
    //   594: invokevirtual 204	com/admarvel/android/ads/AdMarvelWebView:getRootView	()Landroid/view/View;
    //   597: invokevirtual 213	android/view/View:getWidth	()I
    //   600: istore 40
    //   602: aload 4
    //   604: invokevirtual 204	com/admarvel/android/ads/AdMarvelWebView:getRootView	()Landroid/view/View;
    //   607: invokevirtual 214	android/view/View:getHeight	()I
    //   610: istore 41
    //   612: aload 4
    //   614: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   617: instanceof 186
    //   620: ifeq +594 -> 1214
    //   623: aload 4
    //   625: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   628: checkcast 186	android/app/Activity
    //   631: astore 49
    //   633: aload 49
    //   635: ifnull +579 -> 1214
    //   638: aload 49
    //   640: invokestatic 217	com/admarvel/android/ads/ab:a	(Landroid/app/Activity;)Ljava/lang/String;
    //   643: astore 45
    //   645: aload 49
    //   647: invokevirtual 221	android/app/Activity:getWindow	()Landroid/view/Window;
    //   650: ldc 222
    //   652: invokevirtual 228	android/view/Window:findViewById	(I)Landroid/view/View;
    //   655: checkcast 230	android/view/ViewGroup
    //   658: astore 50
    //   660: aload 50
    //   662: invokevirtual 231	android/view/ViewGroup:getLeft	()I
    //   665: istore 44
    //   667: aload 50
    //   669: invokevirtual 232	android/view/ViewGroup:getTop	()I
    //   672: istore 46
    //   674: aload 50
    //   676: invokevirtual 233	android/view/ViewGroup:getWidth	()I
    //   679: istore 43
    //   681: aload 50
    //   683: invokevirtual 234	android/view/ViewGroup:getHeight	()I
    //   686: istore 51
    //   688: iload 51
    //   690: istore 42
    //   692: new 97	java/lang/StringBuilder
    //   695: dup
    //   696: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   699: ldc 236
    //   701: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   704: aload_0
    //   705: getfield 20	com/admarvel/android/ads/AdMarvelWebView$f:a	Ljava/lang/String;
    //   708: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   711: ldc 238
    //   713: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   716: iload 35
    //   718: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   721: ldc 243
    //   723: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   726: iload 34
    //   728: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   731: ldc 245
    //   733: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   736: iload 33
    //   738: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   741: ldc 247
    //   743: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   746: iload 32
    //   748: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   751: ldc 249
    //   753: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   756: iload 44
    //   758: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   761: ldc 251
    //   763: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   766: iload 46
    //   768: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   771: ldc 253
    //   773: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   776: iload 43
    //   778: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   781: ldc 255
    //   783: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   786: iload 42
    //   788: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   791: ldc_w 257
    //   794: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   797: iload 6
    //   799: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   802: ldc_w 259
    //   805: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   808: iload 31
    //   810: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   813: ldc_w 261
    //   816: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   819: iload 30
    //   821: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   824: ldc_w 263
    //   827: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   830: iload 37
    //   832: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   835: ldc_w 265
    //   838: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   841: iload 36
    //   843: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   846: ldc_w 267
    //   849: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   852: ldc_w 269
    //   855: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   858: aload 7
    //   860: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   863: ldc_w 269
    //   866: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   869: ldc_w 271
    //   872: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   875: ldc_w 269
    //   878: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   881: aload 8
    //   883: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   886: ldc_w 269
    //   889: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   892: ldc_w 273
    //   895: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   898: aload 4
    //   900: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   903: invokestatic 277	com/admarvel/android/ads/ab:g	(Landroid/content/Context;)I
    //   906: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   909: ldc_w 279
    //   912: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   915: aload 4
    //   917: invokevirtual 67	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   920: invokestatic 282	com/admarvel/android/ads/ab:h	(Landroid/content/Context;)I
    //   923: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   926: ldc_w 284
    //   929: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   932: ldc_w 269
    //   935: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   938: ldc_w 286
    //   941: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   944: ldc_w 269
    //   947: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   950: ldc_w 288
    //   953: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   956: aload 16
    //   958: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   961: ldc_w 290
    //   964: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   967: ldc_w 269
    //   970: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   973: ldc_w 292
    //   976: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   979: ldc_w 269
    //   982: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   985: ldc_w 294
    //   988: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   991: aload 11
    //   993: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   996: ldc_w 296
    //   999: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1002: ldc_w 269
    //   1005: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1008: aload 45
    //   1010: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1013: ldc_w 269
    //   1016: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1019: ldc_w 298
    //   1022: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1025: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1028: astore 48
    //   1030: aload_3
    //   1031: aload 48
    //   1033: invokevirtual 302	com/admarvel/android/ads/AdMarvelInternalWebView:loadUrl	(Ljava/lang/String;)V
    //   1036: new 97	java/lang/StringBuilder
    //   1039: dup
    //   1040: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   1043: ldc_w 304
    //   1046: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1049: aload 48
    //   1051: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1054: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1057: invokestatic 309	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1060: return
    //   1061: astore 47
    //   1063: aload 47
    //   1065: invokestatic 315	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1068: invokestatic 309	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1071: return
    //   1072: astore_2
    //   1073: aload_2
    //   1074: invokestatic 315	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1077: invokestatic 309	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1080: return
    //   1081: iload 56
    //   1083: iconst_2
    //   1084: if_icmpne +187 -> 1271
    //   1087: bipush 90
    //   1089: istore 6
    //   1091: goto -1028 -> 63
    //   1094: aload 4
    //   1096: invokestatic 318	com/admarvel/android/ads/AdMarvelWebView:o	(Lcom/admarvel/android/ads/AdMarvelWebView;)I
    //   1099: istore 5
    //   1101: iload 5
    //   1103: ifne +189 -> 1292
    //   1106: iconst_0
    //   1107: istore 6
    //   1109: goto -1046 -> 63
    //   1112: astore 19
    //   1114: aload 18
    //   1116: iconst_0
    //   1117: iconst_0
    //   1118: iastore
    //   1119: aload 18
    //   1121: iconst_1
    //   1122: iconst_0
    //   1123: iastore
    //   1124: goto -703 -> 421
    //   1127: astore_1
    //   1128: aload_1
    //   1129: invokestatic 315	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1132: invokestatic 309	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1135: return
    //   1136: aload 52
    //   1138: invokevirtual 221	android/app/Activity:getWindow	()Landroid/view/Window;
    //   1141: ldc 222
    //   1143: invokevirtual 228	android/view/Window:findViewById	(I)Landroid/view/View;
    //   1146: checkcast 230	android/view/ViewGroup
    //   1149: astore 53
    //   1151: new 320	android/util/DisplayMetrics
    //   1154: dup
    //   1155: invokespecial 321	android/util/DisplayMetrics:<init>	()V
    //   1158: astore 54
    //   1160: aload 52
    //   1162: invokevirtual 325	android/app/Activity:getWindowManager	()Landroid/view/WindowManager;
    //   1165: invokeinterface 331 1 0
    //   1170: aload 54
    //   1172: invokevirtual 337	android/view/Display:getMetrics	(Landroid/util/DisplayMetrics;)V
    //   1175: aload 54
    //   1177: getfield 340	android/util/DisplayMetrics:heightPixels	I
    //   1180: aload 53
    //   1182: invokevirtual 343	android/view/ViewGroup:getMeasuredHeight	()I
    //   1185: isub
    //   1186: istore 20
    //   1188: iload 20
    //   1190: iflt -718 -> 472
    //   1193: aload 4
    //   1195: invokestatic 190	com/admarvel/android/ads/AdMarvelWebView:p	(Lcom/admarvel/android/ads/AdMarvelWebView;)I
    //   1198: ldc 191
    //   1200: if_icmpne -728 -> 472
    //   1203: aload 4
    //   1205: iload 20
    //   1207: invokestatic 346	com/admarvel/android/ads/AdMarvelWebView:a	(Lcom/admarvel/android/ads/AdMarvelWebView;I)I
    //   1210: pop
    //   1211: goto -739 -> 472
    //   1214: iload 41
    //   1216: istore 42
    //   1218: iload 40
    //   1220: istore 43
    //   1222: iload 38
    //   1224: istore 44
    //   1226: ldc_w 348
    //   1229: astore 45
    //   1231: iload 39
    //   1233: istore 46
    //   1235: goto -543 -> 692
    //   1238: iconst_0
    //   1239: istore 20
    //   1241: goto -769 -> 472
    //   1244: iconst_0
    //   1245: istore 36
    //   1247: iconst_0
    //   1248: istore 37
    //   1250: iconst_0
    //   1251: istore 30
    //   1253: iconst_0
    //   1254: istore 31
    //   1256: iconst_0
    //   1257: istore 32
    //   1259: iconst_0
    //   1260: istore 33
    //   1262: iconst_0
    //   1263: istore 34
    //   1265: iconst_0
    //   1266: istore 35
    //   1268: goto -696 -> 572
    //   1271: iconst_m1
    //   1272: istore 6
    //   1274: goto -1211 -> 63
    //   1277: return
    //   1278: ldc_w 350
    //   1281: astore 8
    //   1283: goto -1187 -> 96
    //   1286: iconst_1
    //   1287: istore 13
    //   1289: goto -1042 -> 247
    //   1292: iload 5
    //   1294: iconst_1
    //   1295: if_icmpne +10 -> 1305
    //   1298: bipush 90
    //   1300: istore 6
    //   1302: goto -1239 -> 63
    //   1305: iload 5
    //   1307: iconst_2
    //   1308: if_icmpne +11 -> 1319
    //   1311: sipush 180
    //   1314: istore 6
    //   1316: goto -1253 -> 63
    //   1319: iload 5
    //   1321: iconst_3
    //   1322: if_icmpne -51 -> 1271
    //   1325: bipush 166
    //   1327: istore 6
    //   1329: goto -1266 -> 63
    //   1332: ldc_w 352
    //   1335: astore 8
    //   1337: goto -1241 -> 96
    //   1340: ldc_w 354
    //   1343: astore 11
    //   1345: goto -1159 -> 186
    //   1348: iconst_0
    //   1349: istore 13
    //   1351: goto -1104 -> 247
    //   1354: iconst_0
    //   1355: istore 15
    //   1357: goto -999 -> 358
    //
    // Exception table:
    //   from	to	target	type
    //   692	1060	1061	java/lang/Exception
    //   0	23	1072	java/lang/NullPointerException
    //   33	54	1072	java/lang/NullPointerException
    //   63	93	1072	java/lang/NullPointerException
    //   96	108	1072	java/lang/NullPointerException
    //   116	125	1072	java/lang/NullPointerException
    //   130	186	1072	java/lang/NullPointerException
    //   186	244	1072	java/lang/NullPointerException
    //   247	355	1072	java/lang/NullPointerException
    //   358	405	1072	java/lang/NullPointerException
    //   410	415	1072	java/lang/NullPointerException
    //   415	421	1072	java/lang/NullPointerException
    //   421	442	1072	java/lang/NullPointerException
    //   447	472	1072	java/lang/NullPointerException
    //   472	540	1072	java/lang/NullPointerException
    //   572	633	1072	java/lang/NullPointerException
    //   638	688	1072	java/lang/NullPointerException
    //   692	1060	1072	java/lang/NullPointerException
    //   1063	1071	1072	java/lang/NullPointerException
    //   1094	1101	1072	java/lang/NullPointerException
    //   1114	1124	1072	java/lang/NullPointerException
    //   1136	1188	1072	java/lang/NullPointerException
    //   1193	1211	1072	java/lang/NullPointerException
    //   415	421	1112	java/lang/Exception
    //   0	23	1127	java/lang/Exception
    //   33	54	1127	java/lang/Exception
    //   63	93	1127	java/lang/Exception
    //   96	108	1127	java/lang/Exception
    //   116	125	1127	java/lang/Exception
    //   130	186	1127	java/lang/Exception
    //   186	244	1127	java/lang/Exception
    //   247	355	1127	java/lang/Exception
    //   358	405	1127	java/lang/Exception
    //   410	415	1127	java/lang/Exception
    //   421	442	1127	java/lang/Exception
    //   447	472	1127	java/lang/Exception
    //   472	540	1127	java/lang/Exception
    //   572	633	1127	java/lang/Exception
    //   638	688	1127	java/lang/Exception
    //   1063	1071	1127	java/lang/Exception
    //   1094	1101	1127	java/lang/Exception
    //   1114	1124	1127	java/lang/Exception
    //   1136	1188	1127	java/lang/Exception
    //   1193	1211	1127	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.f
 * JD-Core Version:    0.6.2
 */