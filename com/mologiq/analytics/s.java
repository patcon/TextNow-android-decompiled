package com.mologiq.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import java.lang.ref.WeakReference;

@SuppressLint({"UseSparseArrays", "NewApi"})
public final class s
  implements Runnable
{
  private final WeakReference<Context> a;

  public s(Context paramContext)
  {
    this.a = new WeakReference(paramContext);
  }

  // ERROR //
  private static void a(ac paramac, Context paramContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 34	com/mologiq/analytics/ab:d	(Landroid/content/Context;)Lcom/mologiq/analytics/ab;
    //   4: astore_3
    //   5: aload_3
    //   6: invokevirtual 38	com/mologiq/analytics/ab:h	()Z
    //   9: ifeq +58 -> 67
    //   12: aload_1
    //   13: invokevirtual 44	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   16: sipush 128
    //   19: invokevirtual 50	android/content/pm/PackageManager:getInstalledApplications	(I)Ljava/util/List;
    //   22: astore 40
    //   24: aload_1
    //   25: invokestatic 56	com/mologiq/analytics/ac:e	(Landroid/content/Context;)Ljava/util/Map;
    //   28: astore 41
    //   30: aload 40
    //   32: invokeinterface 62 1 0
    //   37: astore 42
    //   39: aconst_null
    //   40: astore 43
    //   42: aconst_null
    //   43: astore 44
    //   45: aload 42
    //   47: invokeinterface 67 1 0
    //   52: ifne +627 -> 679
    //   55: aload_0
    //   56: aload 44
    //   58: invokevirtual 70	com/mologiq/analytics/ac:a	(Ljava/util/List;)V
    //   61: aload_0
    //   62: aload 43
    //   64: invokevirtual 73	com/mologiq/analytics/ac:a	(Ljava/util/Map;)V
    //   67: aload_1
    //   68: invokevirtual 44	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   71: aload_1
    //   72: invokevirtual 77	android/content/Context:getPackageName	()Ljava/lang/String;
    //   75: iconst_0
    //   76: invokevirtual 81	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   79: astore 38
    //   81: aload_1
    //   82: invokevirtual 85	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   85: invokevirtual 44	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   88: astore 39
    //   90: aload 38
    //   92: ifnull +24 -> 116
    //   95: aload 39
    //   97: ifnull +19 -> 116
    //   100: aload_0
    //   101: aload 39
    //   103: aload 38
    //   105: invokevirtual 89	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   108: invokeinterface 94 1 0
    //   113: invokevirtual 98	com/mologiq/analytics/ac:b	(Ljava/lang/String;)V
    //   116: aload_1
    //   117: invokestatic 103	com/mologiq/analytics/e:a	(Landroid/content/Context;)Lcom/mologiq/analytics/e;
    //   120: astore 35
    //   122: aload 35
    //   124: invokevirtual 105	com/mologiq/analytics/e:a	()Ljava/lang/String;
    //   127: astore 36
    //   129: aload 35
    //   131: invokevirtual 107	com/mologiq/analytics/e:b	()Z
    //   134: istore 37
    //   136: aload 36
    //   138: ifnull +754 -> 892
    //   141: aload 36
    //   143: invokevirtual 113	java/lang/String:length	()I
    //   146: ifle +746 -> 892
    //   149: aload_0
    //   150: aload 36
    //   152: invokevirtual 116	com/mologiq/analytics/ac:i	(Ljava/lang/String;)V
    //   155: aload_0
    //   156: iload 37
    //   158: invokevirtual 119	com/mologiq/analytics/ac:a	(Z)V
    //   161: aload_0
    //   162: getstatic 125	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   165: invokevirtual 128	com/mologiq/analytics/ac:c	(Ljava/lang/String;)V
    //   168: aload_0
    //   169: getstatic 133	android/os/Build:MODEL	Ljava/lang/String;
    //   172: invokevirtual 135	com/mologiq/analytics/ac:d	(Ljava/lang/String;)V
    //   175: aload_0
    //   176: getstatic 138	android/os/Build:DEVICE	Ljava/lang/String;
    //   179: invokevirtual 140	com/mologiq/analytics/ac:e	(Ljava/lang/String;)V
    //   182: aload_0
    //   183: getstatic 143	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   186: invokevirtual 146	com/mologiq/analytics/ac:k	(Ljava/lang/String;)V
    //   189: aload_0
    //   190: getstatic 149	android/os/Build:BRAND	Ljava/lang/String;
    //   193: invokevirtual 152	com/mologiq/analytics/ac:g	(Ljava/lang/String;)V
    //   196: invokestatic 158	java/util/TimeZone:getDefault	()Ljava/util/TimeZone;
    //   199: astore 6
    //   201: aload 6
    //   203: invokestatic 163	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   206: invokevirtual 167	java/util/TimeZone:getDisplayName	(Ljava/util/Locale;)Ljava/lang/String;
    //   209: astore 7
    //   211: aload 7
    //   213: ifnull +9 -> 222
    //   216: aload_0
    //   217: aload 7
    //   219: invokevirtual 170	com/mologiq/analytics/ac:l	(Ljava/lang/String;)V
    //   222: aload 6
    //   224: invokevirtual 173	java/util/TimeZone:getID	()Ljava/lang/String;
    //   227: astore 8
    //   229: aload 8
    //   231: ifnull +9 -> 240
    //   234: aload_0
    //   235: aload 8
    //   237: invokevirtual 176	com/mologiq/analytics/ac:m	(Ljava/lang/String;)V
    //   240: aload_0
    //   241: invokestatic 163	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   244: invokevirtual 179	java/util/Locale:getCountry	()Ljava/lang/String;
    //   247: invokevirtual 182	com/mologiq/analytics/ac:n	(Ljava/lang/String;)V
    //   250: aload_1
    //   251: instanceof 184
    //   254: ifeq +55 -> 309
    //   257: aload_1
    //   258: invokevirtual 85	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   261: invokevirtual 188	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   264: invokevirtual 194	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   267: astore 34
    //   269: aload 34
    //   271: ifnull +38 -> 309
    //   274: aload_0
    //   275: new 196	java/lang/StringBuilder
    //   278: dup
    //   279: aload 34
    //   281: getfield 202	android/util/DisplayMetrics:widthPixels	I
    //   284: invokestatic 206	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   287: invokespecial 208	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   290: ldc 210
    //   292: invokevirtual 214	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: aload 34
    //   297: getfield 217	android/util/DisplayMetrics:heightPixels	I
    //   300: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   303: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   306: invokevirtual 224	com/mologiq/analytics/ac:o	(Ljava/lang/String;)V
    //   309: aload_0
    //   310: invokestatic 163	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   313: invokevirtual 227	java/util/Locale:getDisplayLanguage	()Ljava/lang/String;
    //   316: invokevirtual 229	com/mologiq/analytics/ac:h	(Ljava/lang/String;)V
    //   319: aload_1
    //   320: ldc 231
    //   322: invokestatic 236	com/mologiq/analytics/af:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   325: ifeq +139 -> 464
    //   328: aload_3
    //   329: invokevirtual 238	com/mologiq/analytics/ab:i	()Z
    //   332: ifeq +132 -> 464
    //   335: aload_0
    //   336: invokevirtual 242	java/lang/Object:getClass	()Ljava/lang/Class;
    //   339: pop
    //   340: new 244	com/mologiq/analytics/ae
    //   343: dup
    //   344: aload_0
    //   345: invokespecial 247	com/mologiq/analytics/ae:<init>	(Lcom/mologiq/analytics/ac;)V
    //   348: astore 24
    //   350: aload_1
    //   351: ldc 249
    //   353: invokevirtual 253	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   356: checkcast 255	android/net/wifi/WifiManager
    //   359: astore 25
    //   361: aload 25
    //   363: invokevirtual 259	android/net/wifi/WifiManager:getScanResults	()Ljava/util/List;
    //   366: astore 26
    //   368: new 261	java/util/ArrayList
    //   371: dup
    //   372: invokespecial 262	java/util/ArrayList:<init>	()V
    //   375: astore 27
    //   377: aload 26
    //   379: ifnull +68 -> 447
    //   382: aload 26
    //   384: invokeinterface 62 1 0
    //   389: astore 28
    //   391: aload 28
    //   393: invokeinterface 67 1 0
    //   398: ifne +516 -> 914
    //   401: aload 24
    //   403: aload 27
    //   405: invokevirtual 263	com/mologiq/analytics/ae:a	(Ljava/util/List;)V
    //   408: aload 25
    //   410: invokevirtual 267	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   413: astore 32
    //   415: new 269	com/mologiq/analytics/ah
    //   418: dup
    //   419: invokespecial 270	com/mologiq/analytics/ah:<init>	()V
    //   422: astore 33
    //   424: aload 33
    //   426: aload 32
    //   428: invokevirtual 275	android/net/wifi/WifiInfo:getSSID	()Ljava/lang/String;
    //   431: invokevirtual 277	com/mologiq/analytics/ah:a	(Ljava/lang/String;)V
    //   434: aload 24
    //   436: aload 33
    //   438: invokevirtual 280	com/mologiq/analytics/ae:a	(Lcom/mologiq/analytics/ah;)V
    //   441: aload_0
    //   442: aload 24
    //   444: invokevirtual 283	com/mologiq/analytics/ac:a	(Lcom/mologiq/analytics/ae;)V
    //   447: aload_0
    //   448: aload_1
    //   449: ldc_w 285
    //   452: invokevirtual 253	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   455: checkcast 287	android/telephony/TelephonyManager
    //   458: invokevirtual 290	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   461: invokevirtual 293	com/mologiq/analytics/ac:p	(Ljava/lang/String;)V
    //   464: getstatic 125	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   467: ldc_w 295
    //   470: invokevirtual 299	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   473: ifeq +498 -> 971
    //   476: iconst_3
    //   477: istore 9
    //   479: aload_0
    //   480: iload 9
    //   482: invokestatic 206	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   485: invokevirtual 302	com/mologiq/analytics/ac:f	(Ljava/lang/String;)V
    //   488: aload_3
    //   489: invokevirtual 304	com/mologiq/analytics/ab:g	()Z
    //   492: ifeq +688 -> 1180
    //   495: aload_1
    //   496: ldc_w 306
    //   499: invokevirtual 253	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   502: checkcast 308	android/location/LocationManager
    //   505: astore 10
    //   507: aload_1
    //   508: ldc_w 310
    //   511: invokestatic 236	com/mologiq/analytics/af:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   514: ifeq +653 -> 1167
    //   517: aload 10
    //   519: ldc_w 312
    //   522: invokevirtual 316	android/location/LocationManager:getLastKnownLocation	(Ljava/lang/String;)Landroid/location/Location;
    //   525: astore 11
    //   527: aload 11
    //   529: ifnull +450 -> 979
    //   532: aload 11
    //   534: invokevirtual 322	android/location/Location:getLatitude	()D
    //   537: dstore 12
    //   539: aload 11
    //   541: invokevirtual 325	android/location/Location:getLongitude	()D
    //   544: dstore 14
    //   546: new 196	java/lang/StringBuilder
    //   549: dup
    //   550: invokespecial 326	java/lang/StringBuilder:<init>	()V
    //   553: dload 12
    //   555: aload_3
    //   556: invokevirtual 328	com/mologiq/analytics/ab:m	()I
    //   559: i2d
    //   560: dmul
    //   561: d2i
    //   562: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   565: dload 14
    //   567: aload_3
    //   568: invokevirtual 328	com/mologiq/analytics/ab:m	()I
    //   571: i2d
    //   572: dmul
    //   573: d2i
    //   574: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   577: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   580: astore 16
    //   582: new 196	java/lang/StringBuilder
    //   585: dup
    //   586: invokespecial 326	java/lang/StringBuilder:<init>	()V
    //   589: aload_0
    //   590: invokevirtual 330	com/mologiq/analytics/ac:k	()D
    //   593: aload_3
    //   594: invokevirtual 328	com/mologiq/analytics/ab:m	()I
    //   597: i2d
    //   598: dmul
    //   599: d2i
    //   600: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   603: aload_0
    //   604: invokevirtual 332	com/mologiq/analytics/ac:l	()D
    //   607: aload_3
    //   608: invokevirtual 328	com/mologiq/analytics/ab:m	()I
    //   611: i2d
    //   612: dmul
    //   613: d2i
    //   614: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   617: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   620: aload 16
    //   622: invokevirtual 336	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   625: ifne +15 -> 640
    //   628: aload_0
    //   629: dload 12
    //   631: invokevirtual 339	com/mologiq/analytics/ac:a	(D)V
    //   634: aload_0
    //   635: dload 14
    //   637: invokevirtual 341	com/mologiq/analytics/ac:b	(D)V
    //   640: aload_0
    //   641: aload 11
    //   643: invokevirtual 345	android/location/Location:getAccuracy	()F
    //   646: f2d
    //   647: invokevirtual 347	com/mologiq/analytics/ac:d	(D)V
    //   650: aload_0
    //   651: aload 11
    //   653: invokevirtual 350	android/location/Location:getAltitude	()D
    //   656: invokevirtual 352	com/mologiq/analytics/ac:c	(D)V
    //   659: aload_0
    //   660: aload 11
    //   662: invokevirtual 355	android/location/Location:getSpeed	()F
    //   665: f2d
    //   666: invokevirtual 357	com/mologiq/analytics/ac:e	(D)V
    //   669: aload_0
    //   670: aload 11
    //   672: invokevirtual 361	android/location/Location:getTime	()J
    //   675: invokevirtual 364	com/mologiq/analytics/ac:a	(J)V
    //   678: return
    //   679: aload 42
    //   681: invokeinterface 368 1 0
    //   686: checkcast 370	android/content/pm/ApplicationInfo
    //   689: astore 45
    //   691: aload 41
    //   693: aload 45
    //   695: getfield 373	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   698: invokeinterface 378 2 0
    //   703: ifeq -658 -> 45
    //   706: aload 44
    //   708: ifnonnull +465 -> 1173
    //   711: new 261	java/util/ArrayList
    //   714: dup
    //   715: invokespecial 262	java/util/ArrayList:<init>	()V
    //   718: astore 46
    //   720: aload 41
    //   722: aload 45
    //   724: getfield 373	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   727: invokeinterface 382 2 0
    //   732: checkcast 384	com/mologiq/analytics/i
    //   735: astore 47
    //   737: aload 46
    //   739: aload 47
    //   741: invokevirtual 386	com/mologiq/analytics/i:c	()I
    //   744: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   747: invokeinterface 394 2 0
    //   752: pop
    //   753: aload 47
    //   755: invokevirtual 396	com/mologiq/analytics/i:a	()I
    //   758: ifle +423 -> 1181
    //   761: aload 43
    //   763: ifnonnull +12 -> 775
    //   766: new 398	java/util/HashMap
    //   769: dup
    //   770: invokespecial 399	java/util/HashMap:<init>	()V
    //   773: astore 43
    //   775: aload 43
    //   777: aload 47
    //   779: invokevirtual 396	com/mologiq/analytics/i:a	()I
    //   782: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   785: invokeinterface 378 2 0
    //   790: ifeq +56 -> 846
    //   793: iconst_1
    //   794: aload 43
    //   796: aload 47
    //   798: invokevirtual 396	com/mologiq/analytics/i:a	()I
    //   801: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   804: invokeinterface 382 2 0
    //   809: checkcast 388	java/lang/Integer
    //   812: invokevirtual 402	java/lang/Integer:intValue	()I
    //   815: iadd
    //   816: istore 50
    //   818: aload 43
    //   820: aload 47
    //   822: invokevirtual 396	com/mologiq/analytics/i:a	()I
    //   825: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   828: iload 50
    //   830: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   833: invokeinterface 406 3 0
    //   838: pop
    //   839: aload 46
    //   841: astore 44
    //   843: goto -798 -> 45
    //   846: aload 43
    //   848: aload 47
    //   850: invokevirtual 396	com/mologiq/analytics/i:a	()I
    //   853: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   856: iconst_1
    //   857: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   860: invokeinterface 406 3 0
    //   865: pop
    //   866: goto +315 -> 1181
    //   869: astore 4
    //   871: ldc_w 408
    //   874: invokestatic 409	com/mologiq/analytics/af:a	(Ljava/lang/String;)V
    //   877: goto -761 -> 116
    //   880: astore_2
    //   881: aload_2
    //   882: invokevirtual 413	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   885: invokevirtual 414	java/lang/Object:toString	()Ljava/lang/String;
    //   888: invokestatic 409	com/mologiq/analytics/af:a	(Ljava/lang/String;)V
    //   891: return
    //   892: aload_0
    //   893: aload_1
    //   894: invokevirtual 418	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   897: ldc_w 420
    //   900: invokestatic 426	android/provider/Settings$Secure:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   903: invokevirtual 429	com/mologiq/analytics/ac:j	(Ljava/lang/String;)V
    //   906: goto -745 -> 161
    //   909: astore 5
    //   911: goto -750 -> 161
    //   914: aload 28
    //   916: invokeinterface 368 1 0
    //   921: checkcast 431	android/net/wifi/ScanResult
    //   924: astore 29
    //   926: aload 29
    //   928: ifnull -537 -> 391
    //   931: aload 29
    //   933: getfield 434	android/net/wifi/ScanResult:SSID	Ljava/lang/String;
    //   936: ifnull -545 -> 391
    //   939: new 269	com/mologiq/analytics/ah
    //   942: dup
    //   943: invokespecial 270	com/mologiq/analytics/ah:<init>	()V
    //   946: astore 30
    //   948: aload 30
    //   950: aload 29
    //   952: getfield 434	android/net/wifi/ScanResult:SSID	Ljava/lang/String;
    //   955: invokevirtual 277	com/mologiq/analytics/ah:a	(Ljava/lang/String;)V
    //   958: aload 27
    //   960: aload 30
    //   962: invokeinterface 394 2 0
    //   967: pop
    //   968: goto -577 -> 391
    //   971: getstatic 437	android/os/Build$VERSION:SDK_INT	I
    //   974: istore 9
    //   976: goto -497 -> 479
    //   979: aload_1
    //   980: ldc_w 310
    //   983: invokestatic 236	com/mologiq/analytics/af:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   986: ifne +13 -> 999
    //   989: aload_1
    //   990: ldc_w 439
    //   993: invokestatic 236	com/mologiq/analytics/af:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   996: ifeq +165 -> 1161
    //   999: aload 10
    //   1001: ldc_w 441
    //   1004: invokevirtual 316	android/location/LocationManager:getLastKnownLocation	(Ljava/lang/String;)Landroid/location/Location;
    //   1007: astore 17
    //   1009: aload 17
    //   1011: ifnull +169 -> 1180
    //   1014: aload 17
    //   1016: invokevirtual 322	android/location/Location:getLatitude	()D
    //   1019: dstore 18
    //   1021: aload 17
    //   1023: invokevirtual 325	android/location/Location:getLongitude	()D
    //   1026: dstore 20
    //   1028: new 196	java/lang/StringBuilder
    //   1031: dup
    //   1032: invokespecial 326	java/lang/StringBuilder:<init>	()V
    //   1035: dload 18
    //   1037: aload_3
    //   1038: invokevirtual 328	com/mologiq/analytics/ab:m	()I
    //   1041: i2d
    //   1042: dmul
    //   1043: d2i
    //   1044: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1047: dload 20
    //   1049: aload_3
    //   1050: invokevirtual 328	com/mologiq/analytics/ab:m	()I
    //   1053: i2d
    //   1054: dmul
    //   1055: d2i
    //   1056: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1059: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1062: astore 22
    //   1064: new 196	java/lang/StringBuilder
    //   1067: dup
    //   1068: invokespecial 326	java/lang/StringBuilder:<init>	()V
    //   1071: aload_0
    //   1072: invokevirtual 330	com/mologiq/analytics/ac:k	()D
    //   1075: aload_3
    //   1076: invokevirtual 328	com/mologiq/analytics/ab:m	()I
    //   1079: i2d
    //   1080: dmul
    //   1081: d2i
    //   1082: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1085: aload_0
    //   1086: invokevirtual 332	com/mologiq/analytics/ac:l	()D
    //   1089: aload_3
    //   1090: invokevirtual 328	com/mologiq/analytics/ab:m	()I
    //   1093: i2d
    //   1094: dmul
    //   1095: d2i
    //   1096: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1099: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1102: aload 22
    //   1104: invokevirtual 336	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1107: ifne +15 -> 1122
    //   1110: aload_0
    //   1111: dload 18
    //   1113: invokevirtual 339	com/mologiq/analytics/ac:a	(D)V
    //   1116: aload_0
    //   1117: dload 20
    //   1119: invokevirtual 341	com/mologiq/analytics/ac:b	(D)V
    //   1122: aload_0
    //   1123: aload 17
    //   1125: invokevirtual 345	android/location/Location:getAccuracy	()F
    //   1128: f2d
    //   1129: invokevirtual 347	com/mologiq/analytics/ac:d	(D)V
    //   1132: aload_0
    //   1133: aload 17
    //   1135: invokevirtual 350	android/location/Location:getAltitude	()D
    //   1138: invokevirtual 352	com/mologiq/analytics/ac:c	(D)V
    //   1141: aload_0
    //   1142: aload 17
    //   1144: invokevirtual 355	android/location/Location:getSpeed	()F
    //   1147: f2d
    //   1148: invokevirtual 357	com/mologiq/analytics/ac:e	(D)V
    //   1151: aload_0
    //   1152: aload 17
    //   1154: invokevirtual 361	android/location/Location:getTime	()J
    //   1157: invokevirtual 364	com/mologiq/analytics/ac:a	(J)V
    //   1160: return
    //   1161: aconst_null
    //   1162: astore 17
    //   1164: goto -155 -> 1009
    //   1167: aconst_null
    //   1168: astore 11
    //   1170: goto -643 -> 527
    //   1173: aload 44
    //   1175: astore 46
    //   1177: goto -457 -> 720
    //   1180: return
    //   1181: aload 46
    //   1183: astore 44
    //   1185: goto -1140 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   67	90	869	java/lang/Exception
    //   100	116	869	java/lang/Exception
    //   0	39	880	java/lang/Exception
    //   45	67	880	java/lang/Exception
    //   161	211	880	java/lang/Exception
    //   216	222	880	java/lang/Exception
    //   222	229	880	java/lang/Exception
    //   234	240	880	java/lang/Exception
    //   240	269	880	java/lang/Exception
    //   274	309	880	java/lang/Exception
    //   309	377	880	java/lang/Exception
    //   382	391	880	java/lang/Exception
    //   391	447	880	java/lang/Exception
    //   447	464	880	java/lang/Exception
    //   464	476	880	java/lang/Exception
    //   479	527	880	java/lang/Exception
    //   532	640	880	java/lang/Exception
    //   640	678	880	java/lang/Exception
    //   679	706	880	java/lang/Exception
    //   711	720	880	java/lang/Exception
    //   720	761	880	java/lang/Exception
    //   766	775	880	java/lang/Exception
    //   775	839	880	java/lang/Exception
    //   846	866	880	java/lang/Exception
    //   871	877	880	java/lang/Exception
    //   914	926	880	java/lang/Exception
    //   931	968	880	java/lang/Exception
    //   971	976	880	java/lang/Exception
    //   979	999	880	java/lang/Exception
    //   999	1009	880	java/lang/Exception
    //   1014	1122	880	java/lang/Exception
    //   1122	1160	880	java/lang/Exception
    //   116	136	909	java/lang/Exception
    //   141	161	909	java/lang/Exception
    //   892	906	909	java/lang/Exception
  }

  public final void run()
  {
    Context localContext;
    do
    {
      ab localab;
      ac localac;
      try
      {
        WeakReference localWeakReference = this.a;
        localContext = null;
        if (localWeakReference == null)
          continue;
        localContext = (Context)this.a.get();
        continue;
        localab = ab.d(localContext);
        if (localab.b())
          break;
        localac = ac.b();
        localac.a(localContext);
        a(localac, localContext);
        if ((!localac.b(localContext)) && (System.currentTimeMillis() - localab.l() <= localab.k()))
          break;
        new af(localContext);
        if (localab.q() == 0)
        {
          String str4 = af.a(localab.c(), "", localContext, 500, 1000, false);
          if ((str4 == null) || (str4.length() <= 0))
            break;
          localab.a(Integer.parseInt(str4));
          localab.b(localContext);
          return;
        }
      }
      catch (Exception localException)
      {
        af.a(localException.getStackTrace().toString());
        return;
      }
      String str1 = localab.e();
      m localm = new m();
      localm.a("1.2.9");
      localm.b("2014-07-08");
      if (localContext.getPackageName() == null);
      String str3;
      for (Object localObject = ""; ; localObject = str3)
      {
        localm.c((String)localObject);
        localm.a(localac);
        String str2 = af.a(str1, localm.a(localContext), localContext, 500, 1000, true);
        if ((str2 != null) && (str2.length() > 0))
        {
          localab.b(str2);
          localab.a(System.currentTimeMillis());
          localab.b(localContext);
        }
        a(localac, localContext);
        localac.b(localContext);
        return;
        str3 = localContext.getPackageName();
      }
    }
    while (localContext != null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.s
 * JD-Core Version:    0.6.2
 */