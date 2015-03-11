package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelWebView$u
  implements Runnable
{
  private final String a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private final WeakReference<AdMarvelWebView> c;

  public AdMarvelWebView$u(String paramString, AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelWebView paramAdMarvelWebView)
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
    //   1: getfield 27	com/admarvel/android/ads/AdMarvelWebView$u:b	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 38	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 40	com/admarvel/android/ads/AdMarvelInternalWebView
    //   10: astore_3
    //   11: aload_0
    //   12: getfield 29	com/admarvel/android/ads/AdMarvelWebView$u:c	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 38	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 42	com/admarvel/android/ads/AdMarvelWebView
    //   21: astore 4
    //   23: aload 4
    //   25: ifnonnull +4 -> 29
    //   28: return
    //   29: aload_3
    //   30: ifnull +1150 -> 1180
    //   33: aload 4
    //   35: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   38: invokestatic 51	com/admarvel/android/ads/ab:a	(Landroid/content/Context;)Ljava/lang/String;
    //   41: astore 5
    //   43: invokestatic 56	com/admarvel/android/ads/ac:a	()I
    //   46: bipush 9
    //   48: if_icmpge +961 -> 1009
    //   51: aload 4
    //   53: invokevirtual 60	com/admarvel/android/ads/AdMarvelWebView:getResources	()Landroid/content/res/Resources;
    //   56: invokevirtual 66	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   59: getfield 72	android/content/res/Configuration:orientation	I
    //   62: istore 47
    //   64: iload 47
    //   66: iconst_1
    //   67: if_icmpne +929 -> 996
    //   70: iconst_0
    //   71: istore 7
    //   73: aload 5
    //   75: ldc 74
    //   77: invokevirtual 80	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   80: ifne +1101 -> 1181
    //   83: aload 5
    //   85: ldc 82
    //   87: invokevirtual 80	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: ifeq +1145 -> 1235
    //   93: goto +1088 -> 1181
    //   96: aload 4
    //   98: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
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
    //   127: ifnull +1116 -> 1243
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
    //   200: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   203: ldc 137
    //   205: invokestatic 87	com/admarvel/android/ads/ab:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   208: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   211: ldc 142
    //   213: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: astore 12
    //   218: aload 4
    //   220: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   223: ldc 144
    //   225: invokestatic 147	com/admarvel/android/ads/ab:d	(Landroid/content/Context;Ljava/lang/String;)Z
    //   228: ifne +961 -> 1189
    //   231: aload 4
    //   233: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   236: ldc 149
    //   238: invokestatic 147	com/admarvel/android/ads/ab:d	(Landroid/content/Context;Ljava/lang/String;)Z
    //   241: ifeq +1010 -> 1251
    //   244: goto +945 -> 1189
    //   247: aload 12
    //   249: iload 13
    //   251: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   254: ldc 151
    //   256: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: aload 4
    //   261: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   264: ldc 153
    //   266: invokestatic 87	com/admarvel/android/ads/ab:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   269: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   272: ldc 155
    //   274: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: aload 4
    //   279: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   282: ldc 153
    //   284: invokestatic 87	com/admarvel/android/ads/ab:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   287: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   290: ldc 157
    //   292: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: aload 4
    //   297: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   300: invokestatic 161	com/admarvel/android/ads/ab:j	(Landroid/content/Context;)Z
    //   303: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   306: ldc 163
    //   308: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: aload 4
    //   313: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   316: invokestatic 161	com/admarvel/android/ads/ab:j	(Landroid/content/Context;)Z
    //   319: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   322: ldc 165
    //   324: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: astore 14
    //   329: aload 4
    //   331: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   334: ldc 167
    //   336: invokestatic 147	com/admarvel/android/ads/ab:d	(Landroid/content/Context;Ljava/lang/String;)Z
    //   339: ifeq +918 -> 1257
    //   342: aload 4
    //   344: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   347: ldc 169
    //   349: invokestatic 147	com/admarvel/android/ads/ab:d	(Landroid/content/Context;Ljava/lang/String;)Z
    //   352: ifeq +905 -> 1257
    //   355: iconst_1
    //   356: istore 15
    //   358: aload 14
    //   360: iload 15
    //   362: invokevirtual 140	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   365: ldc 171
    //   367: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: aload 4
    //   372: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
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
    //   407: ifnull +752 -> 1159
    //   410: iconst_2
    //   411: newarray int
    //   413: astore 18
    //   415: aload_3
    //   416: aload 18
    //   418: invokevirtual 184	com/admarvel/android/ads/AdMarvelInternalWebView:getLocationOnScreen	([I)V
    //   421: aload 4
    //   423: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   426: instanceof 186
    //   429: ifeq +724 -> 1153
    //   432: aload 4
    //   434: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   437: checkcast 186	android/app/Activity
    //   440: astore 43
    //   442: aload 43
    //   444: ifnull +709 -> 1153
    //   447: aload 4
    //   449: invokestatic 190	com/admarvel/android/ads/AdMarvelWebView:p	(Lcom/admarvel/android/ads/AdMarvelWebView;)I
    //   452: ldc 191
    //   454: if_icmpeq +597 -> 1051
    //   457: aload 4
    //   459: invokestatic 190	com/admarvel/android/ads/AdMarvelWebView:p	(Lcom/admarvel/android/ads/AdMarvelWebView;)I
    //   462: iflt +589 -> 1051
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
    //   487: aload 17
    //   489: invokevirtual 194	com/admarvel/android/ads/AdMarvelView:getWidth	()I
    //   492: istore 23
    //   494: aload 17
    //   496: invokevirtual 197	com/admarvel/android/ads/AdMarvelView:getHeight	()I
    //   499: istore 24
    //   501: aload_3
    //   502: iload 21
    //   504: putfield 200	com/admarvel/android/ads/AdMarvelInternalWebView:mInitLayoutX	I
    //   507: aload_3
    //   508: iload 22
    //   510: putfield 203	com/admarvel/android/ads/AdMarvelInternalWebView:mInitLayoutY	I
    //   513: iload 24
    //   515: istore 25
    //   517: iload 23
    //   519: istore 26
    //   521: iload 22
    //   523: istore 27
    //   525: iload 21
    //   527: istore 28
    //   529: aload 4
    //   531: invokevirtual 207	com/admarvel/android/ads/AdMarvelWebView:getRootView	()Landroid/view/View;
    //   534: invokevirtual 212	android/view/View:getLeft	()I
    //   537: istore 29
    //   539: aload 4
    //   541: invokevirtual 207	com/admarvel/android/ads/AdMarvelWebView:getRootView	()Landroid/view/View;
    //   544: invokevirtual 215	android/view/View:getTop	()I
    //   547: istore 30
    //   549: aload 4
    //   551: invokevirtual 207	com/admarvel/android/ads/AdMarvelWebView:getRootView	()Landroid/view/View;
    //   554: invokevirtual 216	android/view/View:getWidth	()I
    //   557: istore 31
    //   559: aload 4
    //   561: invokevirtual 207	com/admarvel/android/ads/AdMarvelWebView:getRootView	()Landroid/view/View;
    //   564: invokevirtual 217	android/view/View:getHeight	()I
    //   567: istore 32
    //   569: aload 4
    //   571: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   574: instanceof 186
    //   577: ifeq +552 -> 1129
    //   580: aload 4
    //   582: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   585: checkcast 186	android/app/Activity
    //   588: astore 40
    //   590: aload 40
    //   592: ifnull +537 -> 1129
    //   595: aload 40
    //   597: invokestatic 220	com/admarvel/android/ads/ab:a	(Landroid/app/Activity;)Ljava/lang/String;
    //   600: astore 36
    //   602: aload 40
    //   604: invokevirtual 224	android/app/Activity:getWindow	()Landroid/view/Window;
    //   607: ldc 225
    //   609: invokevirtual 231	android/view/Window:findViewById	(I)Landroid/view/View;
    //   612: checkcast 233	android/view/ViewGroup
    //   615: astore 41
    //   617: aload 41
    //   619: invokevirtual 234	android/view/ViewGroup:getLeft	()I
    //   622: istore 35
    //   624: aload 41
    //   626: invokevirtual 235	android/view/ViewGroup:getTop	()I
    //   629: istore 37
    //   631: aload 41
    //   633: invokevirtual 236	android/view/ViewGroup:getWidth	()I
    //   636: istore 34
    //   638: aload 41
    //   640: invokevirtual 237	android/view/ViewGroup:getHeight	()I
    //   643: istore 42
    //   645: iload 42
    //   647: istore 33
    //   649: new 97	java/lang/StringBuilder
    //   652: dup
    //   653: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   656: ldc 239
    //   658: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   661: aload_0
    //   662: getfield 20	com/admarvel/android/ads/AdMarvelWebView$u:a	Ljava/lang/String;
    //   665: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   668: ldc 241
    //   670: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   673: iload 28
    //   675: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   678: ldc 246
    //   680: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   683: iload 27
    //   685: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   688: ldc 248
    //   690: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   693: iload 26
    //   695: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   698: ldc 250
    //   700: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   703: iload 25
    //   705: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   708: ldc 252
    //   710: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   713: iload 35
    //   715: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   718: ldc 254
    //   720: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   723: iload 37
    //   725: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   728: ldc_w 256
    //   731: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   734: iload 34
    //   736: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   739: ldc_w 258
    //   742: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   745: iload 33
    //   747: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   750: ldc_w 260
    //   753: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   756: iload 7
    //   758: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   761: ldc_w 262
    //   764: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   767: ldc_w 264
    //   770: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   773: aload 5
    //   775: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: ldc_w 264
    //   781: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   784: ldc_w 266
    //   787: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   790: ldc_w 264
    //   793: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   796: aload 8
    //   798: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   801: ldc_w 264
    //   804: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   807: ldc_w 268
    //   810: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   813: aload 4
    //   815: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   818: invokestatic 272	com/admarvel/android/ads/ab:g	(Landroid/content/Context;)I
    //   821: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   824: ldc_w 274
    //   827: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   830: aload 4
    //   832: invokevirtual 46	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   835: invokestatic 277	com/admarvel/android/ads/ab:h	(Landroid/content/Context;)I
    //   838: invokevirtual 244	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   841: ldc_w 279
    //   844: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   847: ldc_w 264
    //   850: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   853: ldc_w 281
    //   856: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   859: ldc_w 264
    //   862: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   865: ldc_w 283
    //   868: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   871: aload 16
    //   873: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   876: ldc_w 285
    //   879: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   882: ldc_w 264
    //   885: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   888: ldc_w 287
    //   891: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   894: ldc_w 264
    //   897: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   900: ldc_w 289
    //   903: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   906: aload 11
    //   908: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   911: ldc_w 291
    //   914: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   917: ldc_w 264
    //   920: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   923: aload 36
    //   925: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   928: ldc_w 264
    //   931: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   934: ldc_w 293
    //   937: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   940: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   943: astore 39
    //   945: new 97	java/lang/StringBuilder
    //   948: dup
    //   949: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   952: ldc_w 295
    //   955: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   958: aload 39
    //   960: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   963: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   966: invokestatic 301	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   969: aload_3
    //   970: aload 39
    //   972: invokevirtual 304	com/admarvel/android/ads/AdMarvelInternalWebView:loadUrl	(Ljava/lang/String;)V
    //   975: return
    //   976: astore 38
    //   978: aload 38
    //   980: invokestatic 310	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   983: invokestatic 301	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   986: return
    //   987: astore_2
    //   988: aload_2
    //   989: invokestatic 310	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   992: invokestatic 301	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   995: return
    //   996: iload 47
    //   998: iconst_2
    //   999: if_icmpne +175 -> 1174
    //   1002: bipush 90
    //   1004: istore 7
    //   1006: goto -933 -> 73
    //   1009: aload 4
    //   1011: invokestatic 313	com/admarvel/android/ads/AdMarvelWebView:o	(Lcom/admarvel/android/ads/AdMarvelWebView;)I
    //   1014: istore 6
    //   1016: iload 6
    //   1018: ifne +177 -> 1195
    //   1021: iconst_0
    //   1022: istore 7
    //   1024: goto -951 -> 73
    //   1027: astore 19
    //   1029: aload 18
    //   1031: iconst_0
    //   1032: iconst_0
    //   1033: iastore
    //   1034: aload 18
    //   1036: iconst_1
    //   1037: iconst_0
    //   1038: iastore
    //   1039: goto -618 -> 421
    //   1042: astore_1
    //   1043: aload_1
    //   1044: invokestatic 310	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1047: invokestatic 301	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1050: return
    //   1051: aload 43
    //   1053: invokevirtual 224	android/app/Activity:getWindow	()Landroid/view/Window;
    //   1056: ldc 225
    //   1058: invokevirtual 231	android/view/Window:findViewById	(I)Landroid/view/View;
    //   1061: checkcast 233	android/view/ViewGroup
    //   1064: astore 44
    //   1066: new 315	android/util/DisplayMetrics
    //   1069: dup
    //   1070: invokespecial 316	android/util/DisplayMetrics:<init>	()V
    //   1073: astore 45
    //   1075: aload 43
    //   1077: invokevirtual 320	android/app/Activity:getWindowManager	()Landroid/view/WindowManager;
    //   1080: invokeinterface 326 1 0
    //   1085: aload 45
    //   1087: invokevirtual 332	android/view/Display:getMetrics	(Landroid/util/DisplayMetrics;)V
    //   1090: aload 45
    //   1092: getfield 335	android/util/DisplayMetrics:heightPixels	I
    //   1095: aload 44
    //   1097: invokevirtual 338	android/view/ViewGroup:getMeasuredHeight	()I
    //   1100: isub
    //   1101: istore 20
    //   1103: iload 20
    //   1105: iflt -633 -> 472
    //   1108: aload 4
    //   1110: invokestatic 190	com/admarvel/android/ads/AdMarvelWebView:p	(Lcom/admarvel/android/ads/AdMarvelWebView;)I
    //   1113: ldc 191
    //   1115: if_icmpne -643 -> 472
    //   1118: aload 4
    //   1120: iload 20
    //   1122: invokestatic 341	com/admarvel/android/ads/AdMarvelWebView:a	(Lcom/admarvel/android/ads/AdMarvelWebView;I)I
    //   1125: pop
    //   1126: goto -654 -> 472
    //   1129: iload 32
    //   1131: istore 33
    //   1133: iload 31
    //   1135: istore 34
    //   1137: iload 29
    //   1139: istore 35
    //   1141: ldc_w 343
    //   1144: astore 36
    //   1146: iload 30
    //   1148: istore 37
    //   1150: goto -501 -> 649
    //   1153: iconst_0
    //   1154: istore 20
    //   1156: goto -684 -> 472
    //   1159: iconst_0
    //   1160: istore 25
    //   1162: iconst_0
    //   1163: istore 26
    //   1165: iconst_0
    //   1166: istore 27
    //   1168: iconst_0
    //   1169: istore 28
    //   1171: goto -642 -> 529
    //   1174: iconst_m1
    //   1175: istore 7
    //   1177: goto -1104 -> 73
    //   1180: return
    //   1181: ldc_w 345
    //   1184: astore 8
    //   1186: goto -1090 -> 96
    //   1189: iconst_1
    //   1190: istore 13
    //   1192: goto -945 -> 247
    //   1195: iload 6
    //   1197: iconst_1
    //   1198: if_icmpne +10 -> 1208
    //   1201: bipush 90
    //   1203: istore 7
    //   1205: goto -1132 -> 73
    //   1208: iload 6
    //   1210: iconst_2
    //   1211: if_icmpne +11 -> 1222
    //   1214: sipush 180
    //   1217: istore 7
    //   1219: goto -1146 -> 73
    //   1222: iload 6
    //   1224: iconst_3
    //   1225: if_icmpne -51 -> 1174
    //   1228: bipush 166
    //   1230: istore 7
    //   1232: goto -1159 -> 73
    //   1235: ldc_w 347
    //   1238: astore 8
    //   1240: goto -1144 -> 96
    //   1243: ldc_w 349
    //   1246: astore 11
    //   1248: goto -1062 -> 186
    //   1251: iconst_0
    //   1252: istore 13
    //   1254: goto -1007 -> 247
    //   1257: iconst_0
    //   1258: istore 15
    //   1260: goto -902 -> 358
    //
    // Exception table:
    //   from	to	target	type
    //   649	975	976	java/lang/Exception
    //   0	23	987	java/lang/NullPointerException
    //   33	64	987	java/lang/NullPointerException
    //   73	93	987	java/lang/NullPointerException
    //   96	108	987	java/lang/NullPointerException
    //   116	125	987	java/lang/NullPointerException
    //   130	186	987	java/lang/NullPointerException
    //   186	244	987	java/lang/NullPointerException
    //   247	355	987	java/lang/NullPointerException
    //   358	405	987	java/lang/NullPointerException
    //   410	415	987	java/lang/NullPointerException
    //   415	421	987	java/lang/NullPointerException
    //   421	442	987	java/lang/NullPointerException
    //   447	472	987	java/lang/NullPointerException
    //   472	513	987	java/lang/NullPointerException
    //   529	590	987	java/lang/NullPointerException
    //   595	645	987	java/lang/NullPointerException
    //   649	975	987	java/lang/NullPointerException
    //   978	986	987	java/lang/NullPointerException
    //   1009	1016	987	java/lang/NullPointerException
    //   1029	1039	987	java/lang/NullPointerException
    //   1051	1103	987	java/lang/NullPointerException
    //   1108	1126	987	java/lang/NullPointerException
    //   415	421	1027	java/lang/Exception
    //   0	23	1042	java/lang/Exception
    //   33	64	1042	java/lang/Exception
    //   73	93	1042	java/lang/Exception
    //   96	108	1042	java/lang/Exception
    //   116	125	1042	java/lang/Exception
    //   130	186	1042	java/lang/Exception
    //   186	244	1042	java/lang/Exception
    //   247	355	1042	java/lang/Exception
    //   358	405	1042	java/lang/Exception
    //   410	415	1042	java/lang/Exception
    //   421	442	1042	java/lang/Exception
    //   447	472	1042	java/lang/Exception
    //   472	513	1042	java/lang/Exception
    //   529	590	1042	java/lang/Exception
    //   595	645	1042	java/lang/Exception
    //   978	986	1042	java/lang/Exception
    //   1009	1016	1042	java/lang/Exception
    //   1029	1039	1042	java/lang/Exception
    //   1051	1103	1042	java/lang/Exception
    //   1108	1126	1042	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.u
 * JD-Core Version:    0.6.2
 */