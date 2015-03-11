package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class m$r
  implements Runnable
{
  private final String a;
  private final WeakReference<d> b;
  private final WeakReference<m> c;

  public m$r(String paramString, d paramd, m paramm)
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
    //   1: getfield 27	com/admarvel/android/ads/m$r:b	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 38	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 40	com/admarvel/android/ads/d
    //   10: astore_3
    //   11: aload_0
    //   12: getfield 29	com/admarvel/android/ads/m$r:c	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 38	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 42	com/admarvel/android/ads/m
    //   21: astore 4
    //   23: aload 4
    //   25: ifnonnull +4 -> 29
    //   28: return
    //   29: aload_3
    //   30: ifnull +1214 -> 1244
    //   33: aload 4
    //   35: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   38: invokestatic 51	com/admarvel/android/ads/r:a	(Landroid/content/Context;)Ljava/lang/String;
    //   41: astore 5
    //   43: invokestatic 57	com/admarvel/android/ads/Version:getAndroidSDKVersion	()I
    //   46: bipush 9
    //   48: if_icmpge +968 -> 1016
    //   51: aload 4
    //   53: invokevirtual 61	com/admarvel/android/ads/m:getResources	()Landroid/content/res/Resources;
    //   56: invokevirtual 67	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   59: getfield 73	android/content/res/Configuration:orientation	I
    //   62: istore 46
    //   64: iload 46
    //   66: iconst_1
    //   67: if_icmpne +936 -> 1003
    //   70: iconst_0
    //   71: istore 7
    //   73: aload 5
    //   75: ldc 75
    //   77: invokevirtual 81	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   80: ifne +1165 -> 1245
    //   83: aload 5
    //   85: ldc 83
    //   87: invokevirtual 81	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: ifeq +1217 -> 1307
    //   93: goto +1152 -> 1245
    //   96: aload 4
    //   98: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   101: ldc 85
    //   103: invokestatic 88	com/admarvel/android/ads/r:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   106: ifeq +1126 -> 1232
    //   109: invokestatic 93	com/admarvel/android/util/c:a	()Lcom/admarvel/android/util/c;
    //   112: aload_3
    //   113: invokevirtual 96	com/admarvel/android/util/c:a	(Lcom/admarvel/android/ads/d;)Landroid/location/Location;
    //   116: astore 9
    //   118: aload 9
    //   120: ifnull +1195 -> 1315
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
    //   193: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   196: ldc 138
    //   198: invokestatic 88	com/admarvel/android/ads/r:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   201: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   204: ldc 143
    //   206: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: astore 11
    //   211: aload 4
    //   213: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   216: ldc 145
    //   218: invokestatic 147	com/admarvel/android/ads/r:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   221: ifne +1032 -> 1253
    //   224: aload 4
    //   226: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   229: ldc 149
    //   231: invokestatic 147	com/admarvel/android/ads/r:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   234: ifeq +1089 -> 1323
    //   237: goto +1016 -> 1253
    //   240: aload 11
    //   242: iload 12
    //   244: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   247: ldc 151
    //   249: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: aload 4
    //   254: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   257: ldc 153
    //   259: invokestatic 88	com/admarvel/android/ads/r:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   262: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   265: ldc 155
    //   267: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload 4
    //   272: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   275: ldc 153
    //   277: invokestatic 88	com/admarvel/android/ads/r:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   280: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   283: ldc 157
    //   285: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: aload 4
    //   290: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   293: invokestatic 161	com/admarvel/android/ads/r:j	(Landroid/content/Context;)Z
    //   296: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   299: ldc 163
    //   301: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: aload 4
    //   306: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   309: invokestatic 161	com/admarvel/android/ads/r:j	(Landroid/content/Context;)Z
    //   312: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   315: ldc 165
    //   317: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: astore 13
    //   322: aload 4
    //   324: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   327: ldc 167
    //   329: invokestatic 147	com/admarvel/android/ads/r:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   332: ifeq +997 -> 1329
    //   335: aload 4
    //   337: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   340: ldc 169
    //   342: invokestatic 147	com/admarvel/android/ads/r:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   345: ifeq +984 -> 1329
    //   348: iconst_1
    //   349: istore 14
    //   351: aload 13
    //   353: iload 14
    //   355: invokevirtual 141	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   358: ldc 171
    //   360: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: aload 4
    //   365: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
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
    //   400: ifnull +817 -> 1217
    //   403: iconst_2
    //   404: newarray int
    //   406: astore 17
    //   408: aload_3
    //   409: aload 17
    //   411: invokevirtual 184	com/admarvel/android/ads/d:getLocationOnScreen	([I)V
    //   414: aload 4
    //   416: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   419: instanceof 186
    //   422: ifeq +789 -> 1211
    //   425: aload 4
    //   427: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   430: checkcast 186	android/app/Activity
    //   433: astore 43
    //   435: aload 43
    //   437: ifnull +774 -> 1211
    //   440: aload 4
    //   442: getfield 189	com/admarvel/android/ads/m:v	I
    //   445: ldc 190
    //   447: if_icmpeq +638 -> 1085
    //   450: aload 4
    //   452: getfield 189	com/admarvel/android/ads/m:v	I
    //   455: iflt +630 -> 1085
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
    //   480: aload 4
    //   482: invokevirtual 194	com/admarvel/android/ads/m:getAdMarvelAd	()Lcom/admarvel/android/ads/AdMarvelAd;
    //   485: ifnull +688 -> 1173
    //   488: aload 4
    //   490: invokevirtual 194	com/admarvel/android/ads/m:getAdMarvelAd	()Lcom/admarvel/android/ads/AdMarvelAd;
    //   493: invokevirtual 199	com/admarvel/android/ads/AdMarvelAd:getAdMarvelViewWidth	()F
    //   496: ldc 200
    //   498: fcmpl
    //   499: ifeq +663 -> 1162
    //   502: aload 4
    //   504: invokevirtual 194	com/admarvel/android/ads/m:getAdMarvelAd	()Lcom/admarvel/android/ads/AdMarvelAd;
    //   507: invokevirtual 199	com/admarvel/android/ads/AdMarvelAd:getAdMarvelViewWidth	()F
    //   510: aload 4
    //   512: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   515: invokestatic 204	com/admarvel/android/ads/r:i	(Landroid/content/Context;)F
    //   518: fmul
    //   519: fstore 42
    //   521: goto +738 -> 1259
    //   524: aload 16
    //   526: invokevirtual 207	com/admarvel/android/ads/AdMarvelView:getHeight	()I
    //   529: istore 24
    //   531: aload_3
    //   532: iload 20
    //   534: putfield 210	com/admarvel/android/ads/d:h	I
    //   537: aload_3
    //   538: iload 21
    //   540: putfield 212	com/admarvel/android/ads/d:i	I
    //   543: iload 24
    //   545: istore 25
    //   547: iload 23
    //   549: istore 26
    //   551: iload 21
    //   553: istore 27
    //   555: iload 20
    //   557: istore 28
    //   559: aload 4
    //   561: invokevirtual 216	com/admarvel/android/ads/m:getRootView	()Landroid/view/View;
    //   564: invokevirtual 221	android/view/View:getLeft	()I
    //   567: istore 29
    //   569: aload 4
    //   571: invokevirtual 216	com/admarvel/android/ads/m:getRootView	()Landroid/view/View;
    //   574: invokevirtual 224	android/view/View:getTop	()I
    //   577: istore 30
    //   579: aload 4
    //   581: invokevirtual 216	com/admarvel/android/ads/m:getRootView	()Landroid/view/View;
    //   584: invokevirtual 227	android/view/View:getWidth	()I
    //   587: istore 31
    //   589: aload 4
    //   591: invokevirtual 216	com/admarvel/android/ads/m:getRootView	()Landroid/view/View;
    //   594: invokevirtual 228	android/view/View:getHeight	()I
    //   597: istore 32
    //   599: aload 4
    //   601: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   604: instanceof 186
    //   607: ifeq +580 -> 1187
    //   610: aload 4
    //   612: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   615: checkcast 186	android/app/Activity
    //   618: astore 39
    //   620: aload 39
    //   622: ifnull +565 -> 1187
    //   625: aload 39
    //   627: invokestatic 231	com/admarvel/android/ads/r:a	(Landroid/app/Activity;)Ljava/lang/String;
    //   630: astore 36
    //   632: aload 39
    //   634: invokevirtual 235	android/app/Activity:getWindow	()Landroid/view/Window;
    //   637: ldc 236
    //   639: invokevirtual 242	android/view/Window:findViewById	(I)Landroid/view/View;
    //   642: checkcast 244	android/view/ViewGroup
    //   645: astore 40
    //   647: aload 40
    //   649: invokevirtual 245	android/view/ViewGroup:getLeft	()I
    //   652: istore 35
    //   654: aload 40
    //   656: invokevirtual 246	android/view/ViewGroup:getTop	()I
    //   659: istore 37
    //   661: aload 40
    //   663: invokevirtual 247	android/view/ViewGroup:getWidth	()I
    //   666: istore 34
    //   668: aload 40
    //   670: invokevirtual 248	android/view/ViewGroup:getHeight	()I
    //   673: istore 41
    //   675: iload 41
    //   677: istore 33
    //   679: aload_3
    //   680: new 98	java/lang/StringBuilder
    //   683: dup
    //   684: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   687: ldc 250
    //   689: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   692: aload_0
    //   693: getfield 20	com/admarvel/android/ads/m$r:a	Ljava/lang/String;
    //   696: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: ldc 252
    //   701: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   704: iload 28
    //   706: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   709: ldc_w 257
    //   712: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   715: iload 27
    //   717: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   720: ldc_w 259
    //   723: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   726: iload 26
    //   728: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   731: ldc_w 261
    //   734: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   737: iload 25
    //   739: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   742: ldc_w 263
    //   745: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   748: iload 35
    //   750: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   753: ldc_w 265
    //   756: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   759: iload 37
    //   761: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   764: ldc_w 267
    //   767: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   770: iload 34
    //   772: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   775: ldc_w 269
    //   778: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   781: iload 33
    //   783: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   786: ldc_w 271
    //   789: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   792: iload 7
    //   794: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   797: ldc_w 273
    //   800: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   803: ldc_w 275
    //   806: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   809: aload 5
    //   811: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   814: ldc_w 275
    //   817: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   820: ldc_w 277
    //   823: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   826: ldc_w 275
    //   829: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   832: aload 8
    //   834: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   837: ldc_w 275
    //   840: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   843: ldc_w 279
    //   846: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   849: aload 4
    //   851: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   854: invokestatic 283	com/admarvel/android/ads/r:g	(Landroid/content/Context;)I
    //   857: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   860: ldc_w 285
    //   863: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   866: aload 4
    //   868: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   871: invokestatic 287	com/admarvel/android/ads/r:h	(Landroid/content/Context;)I
    //   874: invokevirtual 255	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   877: ldc_w 289
    //   880: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   883: ldc_w 275
    //   886: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   889: ldc_w 291
    //   892: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   895: ldc_w 275
    //   898: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   901: ldc_w 293
    //   904: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   907: aload 15
    //   909: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   912: ldc_w 295
    //   915: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   918: ldc_w 275
    //   921: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   924: ldc_w 297
    //   927: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   930: ldc_w 275
    //   933: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   936: ldc_w 299
    //   939: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   942: aload 10
    //   944: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   947: ldc_w 301
    //   950: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   953: ldc_w 275
    //   956: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   959: aload 36
    //   961: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   964: ldc_w 275
    //   967: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   970: ldc_w 303
    //   973: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   976: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   979: invokevirtual 307	com/admarvel/android/ads/d:e	(Ljava/lang/String;)V
    //   982: return
    //   983: astore 38
    //   985: aload 38
    //   987: invokestatic 313	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   990: invokestatic 318	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   993: return
    //   994: astore_2
    //   995: aload_2
    //   996: invokestatic 313	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   999: invokestatic 318	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1002: return
    //   1003: iload 46
    //   1005: iconst_2
    //   1006: if_icmpne +232 -> 1238
    //   1009: bipush 90
    //   1011: istore 7
    //   1013: goto -940 -> 73
    //   1016: aload 4
    //   1018: aload 4
    //   1020: invokevirtual 46	com/admarvel/android/ads/m:getContext	()Landroid/content/Context;
    //   1023: ldc_w 320
    //   1026: invokevirtual 326	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   1029: checkcast 328	android/view/WindowManager
    //   1032: invokeinterface 332 1 0
    //   1037: invokevirtual 337	android/view/Display:getRotation	()I
    //   1040: putfield 340	com/admarvel/android/ads/m:u	I
    //   1043: aload 4
    //   1045: getfield 340	com/admarvel/android/ads/m:u	I
    //   1048: istore 6
    //   1050: iload 6
    //   1052: ifne +215 -> 1267
    //   1055: iconst_0
    //   1056: istore 7
    //   1058: goto -985 -> 73
    //   1061: astore 18
    //   1063: aload 17
    //   1065: iconst_0
    //   1066: iconst_0
    //   1067: iastore
    //   1068: aload 17
    //   1070: iconst_1
    //   1071: iconst_0
    //   1072: iastore
    //   1073: goto -659 -> 414
    //   1076: astore_1
    //   1077: aload_1
    //   1078: invokestatic 313	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1081: invokestatic 318	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1084: return
    //   1085: aload 43
    //   1087: invokevirtual 235	android/app/Activity:getWindow	()Landroid/view/Window;
    //   1090: ldc 236
    //   1092: invokevirtual 242	android/view/Window:findViewById	(I)Landroid/view/View;
    //   1095: checkcast 244	android/view/ViewGroup
    //   1098: astore 44
    //   1100: new 342	android/util/DisplayMetrics
    //   1103: dup
    //   1104: invokespecial 343	android/util/DisplayMetrics:<init>	()V
    //   1107: astore 45
    //   1109: aload 43
    //   1111: invokevirtual 347	android/app/Activity:getWindowManager	()Landroid/view/WindowManager;
    //   1114: invokeinterface 332 1 0
    //   1119: aload 45
    //   1121: invokevirtual 351	android/view/Display:getMetrics	(Landroid/util/DisplayMetrics;)V
    //   1124: aload 45
    //   1126: getfield 354	android/util/DisplayMetrics:heightPixels	I
    //   1129: aload 44
    //   1131: invokevirtual 357	android/view/ViewGroup:getMeasuredHeight	()I
    //   1134: isub
    //   1135: istore 19
    //   1137: iload 19
    //   1139: iflt -674 -> 465
    //   1142: aload 4
    //   1144: getfield 189	com/admarvel/android/ads/m:v	I
    //   1147: ldc 190
    //   1149: if_icmpne -684 -> 465
    //   1152: aload 4
    //   1154: iload 19
    //   1156: putfield 189	com/admarvel/android/ads/m:v	I
    //   1159: goto -694 -> 465
    //   1162: aload 16
    //   1164: invokevirtual 358	com/admarvel/android/ads/AdMarvelView:getWidth	()I
    //   1167: i2f
    //   1168: fstore 42
    //   1170: goto +89 -> 1259
    //   1173: aload 16
    //   1175: invokevirtual 358	com/admarvel/android/ads/AdMarvelView:getWidth	()I
    //   1178: istore 22
    //   1180: iload 22
    //   1182: istore 23
    //   1184: goto -660 -> 524
    //   1187: iload 32
    //   1189: istore 33
    //   1191: iload 31
    //   1193: istore 34
    //   1195: iload 29
    //   1197: istore 35
    //   1199: ldc_w 360
    //   1202: astore 36
    //   1204: iload 30
    //   1206: istore 37
    //   1208: goto -529 -> 679
    //   1211: iconst_0
    //   1212: istore 19
    //   1214: goto -749 -> 465
    //   1217: iconst_0
    //   1218: istore 25
    //   1220: iconst_0
    //   1221: istore 26
    //   1223: iconst_0
    //   1224: istore 27
    //   1226: iconst_0
    //   1227: istore 28
    //   1229: goto -670 -> 559
    //   1232: aconst_null
    //   1233: astore 9
    //   1235: goto -1117 -> 118
    //   1238: iconst_m1
    //   1239: istore 7
    //   1241: goto -1168 -> 73
    //   1244: return
    //   1245: ldc_w 362
    //   1248: astore 8
    //   1250: goto -1154 -> 96
    //   1253: iconst_1
    //   1254: istore 12
    //   1256: goto -1016 -> 240
    //   1259: fload 42
    //   1261: f2i
    //   1262: istore 23
    //   1264: goto -740 -> 524
    //   1267: iload 6
    //   1269: iconst_1
    //   1270: if_icmpne +10 -> 1280
    //   1273: bipush 90
    //   1275: istore 7
    //   1277: goto -1204 -> 73
    //   1280: iload 6
    //   1282: iconst_2
    //   1283: if_icmpne +11 -> 1294
    //   1286: sipush 180
    //   1289: istore 7
    //   1291: goto -1218 -> 73
    //   1294: iload 6
    //   1296: iconst_3
    //   1297: if_icmpne -59 -> 1238
    //   1300: bipush 166
    //   1302: istore 7
    //   1304: goto -1231 -> 73
    //   1307: ldc_w 364
    //   1310: astore 8
    //   1312: goto -1216 -> 96
    //   1315: ldc_w 366
    //   1318: astore 10
    //   1320: goto -1141 -> 179
    //   1323: iconst_0
    //   1324: istore 12
    //   1326: goto -1086 -> 240
    //   1329: iconst_0
    //   1330: istore 14
    //   1332: goto -981 -> 351
    //
    // Exception table:
    //   from	to	target	type
    //   679	982	983	java/lang/Exception
    //   0	23	994	java/lang/NullPointerException
    //   33	64	994	java/lang/NullPointerException
    //   73	93	994	java/lang/NullPointerException
    //   96	118	994	java/lang/NullPointerException
    //   123	179	994	java/lang/NullPointerException
    //   179	237	994	java/lang/NullPointerException
    //   240	348	994	java/lang/NullPointerException
    //   351	398	994	java/lang/NullPointerException
    //   403	408	994	java/lang/NullPointerException
    //   408	414	994	java/lang/NullPointerException
    //   414	435	994	java/lang/NullPointerException
    //   440	465	994	java/lang/NullPointerException
    //   465	521	994	java/lang/NullPointerException
    //   524	543	994	java/lang/NullPointerException
    //   559	620	994	java/lang/NullPointerException
    //   625	675	994	java/lang/NullPointerException
    //   679	982	994	java/lang/NullPointerException
    //   985	993	994	java/lang/NullPointerException
    //   1016	1050	994	java/lang/NullPointerException
    //   1063	1073	994	java/lang/NullPointerException
    //   1085	1137	994	java/lang/NullPointerException
    //   1142	1159	994	java/lang/NullPointerException
    //   1162	1170	994	java/lang/NullPointerException
    //   1173	1180	994	java/lang/NullPointerException
    //   408	414	1061	java/lang/Exception
    //   0	23	1076	java/lang/Exception
    //   33	64	1076	java/lang/Exception
    //   73	93	1076	java/lang/Exception
    //   96	118	1076	java/lang/Exception
    //   123	179	1076	java/lang/Exception
    //   179	237	1076	java/lang/Exception
    //   240	348	1076	java/lang/Exception
    //   351	398	1076	java/lang/Exception
    //   403	408	1076	java/lang/Exception
    //   414	435	1076	java/lang/Exception
    //   440	465	1076	java/lang/Exception
    //   465	521	1076	java/lang/Exception
    //   524	543	1076	java/lang/Exception
    //   559	620	1076	java/lang/Exception
    //   625	675	1076	java/lang/Exception
    //   985	993	1076	java/lang/Exception
    //   1016	1050	1076	java/lang/Exception
    //   1063	1073	1076	java/lang/Exception
    //   1085	1137	1076	java/lang/Exception
    //   1142	1159	1076	java/lang/Exception
    //   1162	1170	1076	java/lang/Exception
    //   1173	1180	1076	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.r
 * JD-Core Version:    0.6.2
 */