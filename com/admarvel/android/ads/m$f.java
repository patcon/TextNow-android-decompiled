package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class m$f
  implements Runnable
{
  private final String a;
  private final WeakReference<d> b;
  private final WeakReference<m> c;

  public m$f(String paramString, d paramd, m paramm)
  {
    this.a = paramString;
    this.b = new WeakReference(paramd);
    this.c = new WeakReference(paramm);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	com/admarvel/android/ads/m$f:b	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 38	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 40	com/admarvel/android/ads/d
    //   10: astore_3
    //   11: aload_0
    //   12: getfield 29	com/admarvel/android/ads/m$f:c	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 38	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 42	com/admarvel/android/ads/m
    //   21: astore 4
    //   23: aload 4
    //   25: ifnonnull +4 -> 29
    //   28: return
    //   29: aload_3
    //   30: ifnull +1312 -> 1342
    //   33: invokestatic 48	com/admarvel/android/ads/Version:getAndroidSDKVersion	()I
    //   36: bipush 9
    //   38: if_icmpge +1064 -> 1102
    //   41: aload 4
    //   43: invokevirtual 52	com/admarvel/android/ads/m:getResources	()Landroid/content/res/Resources;
    //   46: invokevirtual 58	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   49: getfield 64	android/content/res/Configuration:orientation	I
    //   52: istore 55
    //   54: iload 55
    //   56: iconst_1
    //   57: if_icmpne +1032 -> 1089
    //   60: iconst_0
    //   61: istore 6
    //   63: aload 4
    //   65: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   68: invokestatic 73	com/admarvel/android/ads/r:a	(Landroid/content/Context;)Ljava/lang/String;
    //   71: astore 7
    //   73: aload 7
    //   75: ldc 75
    //   77: invokevirtual 81	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   80: ifne +1263 -> 1343
    //   83: aload 7
    //   85: ldc 83
    //   87: invokevirtual 81	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: ifeq +1315 -> 1405
    //   93: goto +1250 -> 1343
    //   96: aload 4
    //   98: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   101: ldc 85
    //   103: invokestatic 88	com/admarvel/android/ads/r:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   106: ifeq +1224 -> 1330
    //   109: invokestatic 93	com/admarvel/android/util/c:a	()Lcom/admarvel/android/util/c;
    //   112: aload_3
    //   113: invokevirtual 96	com/admarvel/android/util/c:a	(Lcom/admarvel/android/ads/d;)Landroid/location/Location;
    //   116: astore 9
    //   118: aload 9
    //   120: ifnull +1293 -> 1413
    //   123: new 98	java/lang/StringBuilder
    //   126: dup
    //   127: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   130: ldc 101
    //   132: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: aload 9
    //   137: invokevirtual 111	android/location/Location:getLatitude	()D
    //   140: invokevirtual 114	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   143: ldc 116
    //   145: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload 9
    //   150: invokevirtual 119	android/location/Location:getLongitude	()D
    //   153: invokevirtual 114	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   156: ldc 121
    //   158: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: aload 9
    //   163: invokevirtual 125	android/location/Location:getAccuracy	()F
    //   166: invokevirtual 128	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   169: ldc 130
    //   171: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: astore 10
    //   179: new 98	java/lang/StringBuilder
    //   182: dup
    //   183: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   186: ldc 136
    //   188: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: aload 4
    //   193: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   196: ldc 138
    //   198: invokestatic 88	com/admarvel/android/ads/r:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   201: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   204: ldc 143
    //   206: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: astore 11
    //   211: aload 4
    //   213: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   216: ldc 145
    //   218: invokestatic 147	com/admarvel/android/ads/r:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   221: ifne +1130 -> 1351
    //   224: aload 4
    //   226: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   229: ldc 149
    //   231: invokestatic 147	com/admarvel/android/ads/r:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   234: ifeq +1187 -> 1421
    //   237: goto +1114 -> 1351
    //   240: aload 11
    //   242: iload 12
    //   244: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   247: ldc 151
    //   249: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: aload 4
    //   254: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   257: ldc 153
    //   259: invokestatic 88	com/admarvel/android/ads/r:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   262: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   265: ldc 155
    //   267: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload 4
    //   272: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   275: ldc 153
    //   277: invokestatic 88	com/admarvel/android/ads/r:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   280: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   283: ldc 157
    //   285: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: aload 4
    //   290: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   293: invokestatic 161	com/admarvel/android/ads/r:j	(Landroid/content/Context;)Z
    //   296: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   299: ldc 163
    //   301: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: aload 4
    //   306: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   309: invokestatic 161	com/admarvel/android/ads/r:j	(Landroid/content/Context;)Z
    //   312: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   315: ldc 165
    //   317: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: astore 13
    //   322: aload 4
    //   324: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   327: ldc 167
    //   329: invokestatic 147	com/admarvel/android/ads/r:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   332: ifeq +1095 -> 1427
    //   335: aload 4
    //   337: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   340: ldc 169
    //   342: invokestatic 147	com/admarvel/android/ads/r:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   345: ifeq +1082 -> 1427
    //   348: iconst_1
    //   349: istore 14
    //   351: aload 13
    //   353: iload 14
    //   355: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   358: ldc 171
    //   360: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: aload 4
    //   365: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   368: ldc 173
    //   370: invokestatic 88	com/admarvel/android/ads/r:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   373: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   376: ldc 175
    //   378: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   384: astore 15
    //   386: aload_3
    //   387: getfield 178	com/admarvel/android/ads/d:d	Ljava/lang/ref/WeakReference;
    //   390: invokevirtual 38	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   393: checkcast 180	com/admarvel/android/ads/AdMarvelView
    //   396: astore 16
    //   398: aload 16
    //   400: ifnull +903 -> 1303
    //   403: iconst_2
    //   404: newarray int
    //   406: astore 17
    //   408: aload_3
    //   409: aload 17
    //   411: invokevirtual 184	com/admarvel/android/ads/d:getLocationOnScreen	([I)V
    //   414: aload 4
    //   416: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   419: instanceof 186
    //   422: ifeq +875 -> 1297
    //   425: aload 4
    //   427: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   430: checkcast 186	android/app/Activity
    //   433: astore 52
    //   435: aload 52
    //   437: ifnull +860 -> 1297
    //   440: aload 4
    //   442: getfield 189	com/admarvel/android/ads/m:v	I
    //   445: ldc 190
    //   447: if_icmpeq +724 -> 1171
    //   450: aload 4
    //   452: getfield 189	com/admarvel/android/ads/m:v	I
    //   455: iflt +716 -> 1171
    //   458: aload 4
    //   460: getfield 189	com/admarvel/android/ads/m:v	I
    //   463: istore 19
    //   465: aload 17
    //   467: iconst_0
    //   468: iaload
    //   469: istore 20
    //   471: aload 17
    //   473: iconst_1
    //   474: iaload
    //   475: iload 19
    //   477: isub
    //   478: istore 21
    //   480: aload_3
    //   481: invokevirtual 193	com/admarvel/android/ads/d:getWidth	()I
    //   484: istore 22
    //   486: aload_3
    //   487: invokevirtual 196	com/admarvel/android/ads/d:getHeight	()I
    //   490: istore 23
    //   492: iconst_2
    //   493: newarray int
    //   495: astore 24
    //   497: aload 16
    //   499: aload 24
    //   501: invokevirtual 197	com/admarvel/android/ads/AdMarvelView:getLocationOnScreen	([I)V
    //   504: aload 24
    //   506: iconst_0
    //   507: iaload
    //   508: istore 25
    //   510: aload 24
    //   512: iconst_1
    //   513: iaload
    //   514: iload 19
    //   516: isub
    //   517: istore 26
    //   519: aload 4
    //   521: invokevirtual 201	com/admarvel/android/ads/m:getAdMarvelAd	()Lcom/admarvel/android/ads/AdMarvelAd;
    //   524: ifnull +735 -> 1259
    //   527: aload 4
    //   529: invokevirtual 201	com/admarvel/android/ads/m:getAdMarvelAd	()Lcom/admarvel/android/ads/AdMarvelAd;
    //   532: invokevirtual 206	com/admarvel/android/ads/AdMarvelAd:getAdMarvelViewWidth	()F
    //   535: ldc 207
    //   537: fcmpl
    //   538: ifeq +710 -> 1248
    //   541: aload 4
    //   543: invokevirtual 201	com/admarvel/android/ads/m:getAdMarvelAd	()Lcom/admarvel/android/ads/AdMarvelAd;
    //   546: invokevirtual 206	com/admarvel/android/ads/AdMarvelAd:getAdMarvelViewWidth	()F
    //   549: aload 4
    //   551: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   554: invokestatic 211	com/admarvel/android/ads/r:i	(Landroid/content/Context;)F
    //   557: fmul
    //   558: fstore 51
    //   560: goto +797 -> 1357
    //   563: aload 16
    //   565: invokevirtual 212	com/admarvel/android/ads/AdMarvelView:getHeight	()I
    //   568: istore 29
    //   570: iload 26
    //   572: istore 30
    //   574: iload 25
    //   576: istore 31
    //   578: iload 23
    //   580: istore 32
    //   582: iload 22
    //   584: istore 33
    //   586: iload 21
    //   588: istore 34
    //   590: iload 20
    //   592: istore 35
    //   594: iload 29
    //   596: istore 36
    //   598: iload 28
    //   600: istore 37
    //   602: aload 4
    //   604: invokevirtual 216	com/admarvel/android/ads/m:getRootView	()Landroid/view/View;
    //   607: invokevirtual 221	android/view/View:getLeft	()I
    //   610: istore 38
    //   612: aload 4
    //   614: invokevirtual 216	com/admarvel/android/ads/m:getRootView	()Landroid/view/View;
    //   617: invokevirtual 224	android/view/View:getTop	()I
    //   620: istore 39
    //   622: aload 4
    //   624: invokevirtual 216	com/admarvel/android/ads/m:getRootView	()Landroid/view/View;
    //   627: invokevirtual 225	android/view/View:getWidth	()I
    //   630: istore 40
    //   632: aload 4
    //   634: invokevirtual 216	com/admarvel/android/ads/m:getRootView	()Landroid/view/View;
    //   637: invokevirtual 226	android/view/View:getHeight	()I
    //   640: istore 41
    //   642: aload 4
    //   644: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   647: instanceof 186
    //   650: ifeq +623 -> 1273
    //   653: aload 4
    //   655: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   658: checkcast 186	android/app/Activity
    //   661: astore 48
    //   663: aload 48
    //   665: ifnull +608 -> 1273
    //   668: aload 48
    //   670: invokestatic 229	com/admarvel/android/ads/r:a	(Landroid/app/Activity;)Ljava/lang/String;
    //   673: astore 45
    //   675: aload 48
    //   677: invokevirtual 233	android/app/Activity:getWindow	()Landroid/view/Window;
    //   680: ldc 234
    //   682: invokevirtual 240	android/view/Window:findViewById	(I)Landroid/view/View;
    //   685: checkcast 242	android/view/ViewGroup
    //   688: astore 49
    //   690: aload 49
    //   692: invokevirtual 243	android/view/ViewGroup:getLeft	()I
    //   695: istore 44
    //   697: aload 49
    //   699: invokevirtual 244	android/view/ViewGroup:getTop	()I
    //   702: istore 46
    //   704: aload 49
    //   706: invokevirtual 245	android/view/ViewGroup:getWidth	()I
    //   709: istore 43
    //   711: aload 49
    //   713: invokevirtual 246	android/view/ViewGroup:getHeight	()I
    //   716: istore 50
    //   718: iload 50
    //   720: istore 42
    //   722: aload_3
    //   723: new 98	java/lang/StringBuilder
    //   726: dup
    //   727: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   730: ldc 248
    //   732: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   735: aload_0
    //   736: getfield 20	com/admarvel/android/ads/m$f:a	Ljava/lang/String;
    //   739: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   742: ldc 250
    //   744: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: iload 35
    //   749: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   752: ldc 255
    //   754: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   757: iload 34
    //   759: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   762: ldc_w 257
    //   765: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   768: iload 33
    //   770: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   773: ldc_w 259
    //   776: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   779: iload 32
    //   781: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   784: ldc_w 261
    //   787: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   790: iload 44
    //   792: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   795: ldc_w 263
    //   798: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   801: iload 46
    //   803: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   806: ldc_w 265
    //   809: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   812: iload 43
    //   814: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   817: ldc_w 267
    //   820: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   823: iload 42
    //   825: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   828: ldc_w 269
    //   831: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   834: iload 6
    //   836: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   839: ldc_w 271
    //   842: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   845: iload 31
    //   847: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   850: ldc_w 273
    //   853: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   856: iload 30
    //   858: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   861: ldc_w 275
    //   864: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   867: iload 37
    //   869: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   872: ldc_w 277
    //   875: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   878: iload 36
    //   880: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   883: ldc_w 279
    //   886: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   889: ldc_w 281
    //   892: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   895: aload 7
    //   897: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   900: ldc_w 281
    //   903: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   906: ldc_w 283
    //   909: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   912: ldc_w 281
    //   915: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   918: aload 8
    //   920: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   923: ldc_w 281
    //   926: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   929: ldc_w 285
    //   932: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   935: aload 4
    //   937: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   940: invokestatic 289	com/admarvel/android/ads/r:g	(Landroid/content/Context;)I
    //   943: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   946: ldc_w 291
    //   949: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   952: aload 4
    //   954: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   957: invokestatic 294	com/admarvel/android/ads/r:h	(Landroid/content/Context;)I
    //   960: invokevirtual 253	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   963: ldc_w 296
    //   966: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   969: ldc_w 281
    //   972: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   975: ldc_w 298
    //   978: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   981: ldc_w 281
    //   984: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   987: ldc_w 300
    //   990: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   993: aload 15
    //   995: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   998: ldc_w 302
    //   1001: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1004: ldc_w 281
    //   1007: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1010: ldc_w 304
    //   1013: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1016: ldc_w 281
    //   1019: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1022: ldc_w 306
    //   1025: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1028: aload 10
    //   1030: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1033: ldc_w 308
    //   1036: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1039: ldc_w 281
    //   1042: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1045: aload 45
    //   1047: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1050: ldc_w 281
    //   1053: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1056: ldc_w 310
    //   1059: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1062: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1065: invokevirtual 314	com/admarvel/android/ads/d:e	(Ljava/lang/String;)V
    //   1068: return
    //   1069: astore 47
    //   1071: aload 47
    //   1073: invokestatic 320	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1076: invokestatic 325	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1079: return
    //   1080: astore_2
    //   1081: aload_2
    //   1082: invokestatic 320	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1085: invokestatic 325	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1088: return
    //   1089: iload 55
    //   1091: iconst_2
    //   1092: if_icmpne +244 -> 1336
    //   1095: bipush 90
    //   1097: istore 6
    //   1099: goto -1036 -> 63
    //   1102: aload 4
    //   1104: aload 4
    //   1106: invokevirtual 68	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   1109: ldc_w 327
    //   1112: invokevirtual 333	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   1115: checkcast 335	android/view/WindowManager
    //   1118: invokeinterface 339 1 0
    //   1123: invokevirtual 344	android/view/Display:getRotation	()I
    //   1126: putfield 347	com/admarvel/android/ads/m:u	I
    //   1129: aload 4
    //   1131: getfield 347	com/admarvel/android/ads/m:u	I
    //   1134: istore 5
    //   1136: iload 5
    //   1138: ifne +227 -> 1365
    //   1141: iconst_0
    //   1142: istore 6
    //   1144: goto -1081 -> 63
    //   1147: astore 18
    //   1149: aload 17
    //   1151: iconst_0
    //   1152: iconst_0
    //   1153: iastore
    //   1154: aload 17
    //   1156: iconst_1
    //   1157: iconst_0
    //   1158: iastore
    //   1159: goto -745 -> 414
    //   1162: astore_1
    //   1163: aload_1
    //   1164: invokestatic 320	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1167: invokestatic 325	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1170: return
    //   1171: aload 52
    //   1173: invokevirtual 233	android/app/Activity:getWindow	()Landroid/view/Window;
    //   1176: ldc 234
    //   1178: invokevirtual 240	android/view/Window:findViewById	(I)Landroid/view/View;
    //   1181: checkcast 242	android/view/ViewGroup
    //   1184: astore 53
    //   1186: new 349	android/util/DisplayMetrics
    //   1189: dup
    //   1190: invokespecial 350	android/util/DisplayMetrics:<init>	()V
    //   1193: astore 54
    //   1195: aload 52
    //   1197: invokevirtual 354	android/app/Activity:getWindowManager	()Landroid/view/WindowManager;
    //   1200: invokeinterface 339 1 0
    //   1205: aload 54
    //   1207: invokevirtual 358	android/view/Display:getMetrics	(Landroid/util/DisplayMetrics;)V
    //   1210: aload 54
    //   1212: getfield 361	android/util/DisplayMetrics:heightPixels	I
    //   1215: aload 53
    //   1217: invokevirtual 364	android/view/ViewGroup:getMeasuredHeight	()I
    //   1220: isub
    //   1221: istore 19
    //   1223: iload 19
    //   1225: iflt -760 -> 465
    //   1228: aload 4
    //   1230: getfield 189	com/admarvel/android/ads/m:v	I
    //   1233: ldc 190
    //   1235: if_icmpne -770 -> 465
    //   1238: aload 4
    //   1240: iload 19
    //   1242: putfield 189	com/admarvel/android/ads/m:v	I
    //   1245: goto -780 -> 465
    //   1248: aload 16
    //   1250: invokevirtual 365	com/admarvel/android/ads/AdMarvelView:getWidth	()I
    //   1253: i2f
    //   1254: fstore 51
    //   1256: goto +101 -> 1357
    //   1259: aload 16
    //   1261: invokevirtual 365	com/admarvel/android/ads/AdMarvelView:getWidth	()I
    //   1264: istore 27
    //   1266: iload 27
    //   1268: istore 28
    //   1270: goto -707 -> 563
    //   1273: iload 41
    //   1275: istore 42
    //   1277: iload 40
    //   1279: istore 43
    //   1281: iload 38
    //   1283: istore 44
    //   1285: ldc_w 367
    //   1288: astore 45
    //   1290: iload 39
    //   1292: istore 46
    //   1294: goto -572 -> 722
    //   1297: iconst_0
    //   1298: istore 19
    //   1300: goto -835 -> 465
    //   1303: iconst_0
    //   1304: istore 36
    //   1306: iconst_0
    //   1307: istore 37
    //   1309: iconst_0
    //   1310: istore 30
    //   1312: iconst_0
    //   1313: istore 31
    //   1315: iconst_0
    //   1316: istore 32
    //   1318: iconst_0
    //   1319: istore 33
    //   1321: iconst_0
    //   1322: istore 34
    //   1324: iconst_0
    //   1325: istore 35
    //   1327: goto -725 -> 602
    //   1330: aconst_null
    //   1331: astore 9
    //   1333: goto -1215 -> 118
    //   1336: iconst_m1
    //   1337: istore 6
    //   1339: goto -1276 -> 63
    //   1342: return
    //   1343: ldc_w 369
    //   1346: astore 8
    //   1348: goto -1252 -> 96
    //   1351: iconst_1
    //   1352: istore 12
    //   1354: goto -1114 -> 240
    //   1357: fload 51
    //   1359: f2i
    //   1360: istore 28
    //   1362: goto -799 -> 563
    //   1365: iload 5
    //   1367: iconst_1
    //   1368: if_icmpne +10 -> 1378
    //   1371: bipush 90
    //   1373: istore 6
    //   1375: goto -1312 -> 63
    //   1378: iload 5
    //   1380: iconst_2
    //   1381: if_icmpne +11 -> 1392
    //   1384: sipush 180
    //   1387: istore 6
    //   1389: goto -1326 -> 63
    //   1392: iload 5
    //   1394: iconst_3
    //   1395: if_icmpne -59 -> 1336
    //   1398: bipush 166
    //   1400: istore 6
    //   1402: goto -1339 -> 63
    //   1405: ldc_w 371
    //   1408: astore 8
    //   1410: goto -1314 -> 96
    //   1413: ldc_w 373
    //   1416: astore 10
    //   1418: goto -1239 -> 179
    //   1421: iconst_0
    //   1422: istore 12
    //   1424: goto -1184 -> 240
    //   1427: iconst_0
    //   1428: istore 14
    //   1430: goto -1079 -> 351
    //
    // Exception table:
    //   from	to	target	type
    //   722	1068	1069	java/lang/Exception
    //   0	23	1080	java/lang/NullPointerException
    //   33	54	1080	java/lang/NullPointerException
    //   63	93	1080	java/lang/NullPointerException
    //   96	118	1080	java/lang/NullPointerException
    //   123	179	1080	java/lang/NullPointerException
    //   179	237	1080	java/lang/NullPointerException
    //   240	348	1080	java/lang/NullPointerException
    //   351	398	1080	java/lang/NullPointerException
    //   403	408	1080	java/lang/NullPointerException
    //   408	414	1080	java/lang/NullPointerException
    //   414	435	1080	java/lang/NullPointerException
    //   440	465	1080	java/lang/NullPointerException
    //   465	560	1080	java/lang/NullPointerException
    //   563	570	1080	java/lang/NullPointerException
    //   602	663	1080	java/lang/NullPointerException
    //   668	718	1080	java/lang/NullPointerException
    //   722	1068	1080	java/lang/NullPointerException
    //   1071	1079	1080	java/lang/NullPointerException
    //   1102	1136	1080	java/lang/NullPointerException
    //   1149	1159	1080	java/lang/NullPointerException
    //   1171	1223	1080	java/lang/NullPointerException
    //   1228	1245	1080	java/lang/NullPointerException
    //   1248	1256	1080	java/lang/NullPointerException
    //   1259	1266	1080	java/lang/NullPointerException
    //   408	414	1147	java/lang/Exception
    //   0	23	1162	java/lang/Exception
    //   33	54	1162	java/lang/Exception
    //   63	93	1162	java/lang/Exception
    //   96	118	1162	java/lang/Exception
    //   123	179	1162	java/lang/Exception
    //   179	237	1162	java/lang/Exception
    //   240	348	1162	java/lang/Exception
    //   351	398	1162	java/lang/Exception
    //   403	408	1162	java/lang/Exception
    //   414	435	1162	java/lang/Exception
    //   440	465	1162	java/lang/Exception
    //   465	560	1162	java/lang/Exception
    //   563	570	1162	java/lang/Exception
    //   602	663	1162	java/lang/Exception
    //   668	718	1162	java/lang/Exception
    //   1071	1079	1162	java/lang/Exception
    //   1102	1136	1162	java/lang/Exception
    //   1149	1159	1162	java/lang/Exception
    //   1171	1223	1162	java/lang/Exception
    //   1228	1245	1162	java/lang/Exception
    //   1248	1256	1162	java/lang/Exception
    //   1259	1266	1162	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.f
 * JD-Core Version:    0.6.2
 */