package com.admarvel.android.ads;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.OptionalUtils;
import com.admarvel.android.util.a.b;
import com.admarvel.android.util.k;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AdFetcher
{
  private static final String ADMARVEL_ENDPOINT = "http://ads.admarvel.com/fam/androidGetAd.php";
  public static final String SDK_SUPPORTED = Version.getSDKSupported();
  public static String lastAdRequestPostString;
  private String googleAdID = "VALUE_NOT_DEFINED";
  private JSONObject requestJson;
  private int userOptOutPreference = -2147483648;

  // ERROR //
  private String buildParamString(AdFetcher.Adtype paramAdtype, Context paramContext, int paramInt1, String paramString1, Map<String, Object> paramMap, String paramString2, String paramString3, int paramInt2, String paramString4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    // Byte code:
    //   0: new 41	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   7: astore 13
    //   9: aload 5
    //   11: ldc 44
    //   13: invokestatic 50	com/admarvel/android/ads/r:a	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   16: astore 15
    //   18: aload 13
    //   20: ldc 52
    //   22: aload 7
    //   24: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   27: aload 13
    //   29: ldc 57
    //   31: aload 6
    //   33: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   36: aload 13
    //   38: ldc 59
    //   40: sipush 5000
    //   43: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   46: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   49: aload 13
    //   51: ldc 67
    //   53: ldc 69
    //   55: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   58: aload 13
    //   60: ldc 71
    //   62: ldc 73
    //   64: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   67: aload 13
    //   69: ldc 75
    //   71: ldc 77
    //   73: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   76: aload 13
    //   78: ldc 79
    //   80: ldc 81
    //   82: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   85: aload 13
    //   87: ldc 83
    //   89: ldc 85
    //   91: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   94: iload 12
    //   96: ifeq +720 -> 816
    //   99: aload 13
    //   101: ldc 87
    //   103: ldc 89
    //   105: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   108: aload 13
    //   110: ldc 91
    //   112: getstatic 96	android/os/Build:MODEL	Ljava/lang/String;
    //   115: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   118: aload 13
    //   120: ldc 98
    //   122: getstatic 101	android/os/Build:ID	Ljava/lang/String;
    //   125: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload 13
    //   130: ldc 103
    //   132: getstatic 108	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   135: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   138: aload 13
    //   140: ldc 110
    //   142: invokestatic 114	com/admarvel/android/ads/Version:getAndroidSDKVersion	()I
    //   145: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   148: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   151: aload 13
    //   153: ldc 116
    //   155: iload 8
    //   157: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   160: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   163: aload 13
    //   165: ldc 118
    //   167: aload 9
    //   169: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   172: iload_3
    //   173: iconst_2
    //   174: if_icmpne +667 -> 841
    //   177: aload 13
    //   179: ldc 120
    //   181: ldc 122
    //   183: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   186: aload 13
    //   188: ldc 124
    //   190: aload 4
    //   192: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   195: aload_2
    //   196: invokestatic 128	com/admarvel/android/ads/r:g	(Landroid/content/Context;)I
    //   199: istore 16
    //   201: iload 16
    //   203: ifle +27 -> 230
    //   206: aload 13
    //   208: ldc 130
    //   210: iload 16
    //   212: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   215: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   218: aload 13
    //   220: ldc 132
    //   222: iload 16
    //   224: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   227: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   230: aload_2
    //   231: invokestatic 135	com/admarvel/android/ads/r:h	(Landroid/content/Context;)I
    //   234: istore 17
    //   236: iload 17
    //   238: ifle +27 -> 265
    //   241: aload 13
    //   243: ldc 137
    //   245: iload 17
    //   247: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   250: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   253: aload 13
    //   255: ldc 139
    //   257: iload 17
    //   259: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   262: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   265: aload 13
    //   267: ldc 141
    //   269: new 41	java/lang/StringBuilder
    //   272: dup
    //   273: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   276: ldc 89
    //   278: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: aload_2
    //   282: invokestatic 149	com/admarvel/android/ads/r:i	(Landroid/content/Context;)F
    //   285: invokevirtual 152	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   288: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   291: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   294: aload 13
    //   296: ldc 157
    //   298: ldc 159
    //   300: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   303: aload_1
    //   304: getstatic 165	com/admarvel/android/ads/AdFetcher$Adtype:BANNER	Lcom/admarvel/android/ads/AdFetcher$Adtype;
    //   307: invokevirtual 169	com/admarvel/android/ads/AdFetcher$Adtype:equals	(Ljava/lang/Object;)Z
    //   310: ifeq +544 -> 854
    //   313: aload 13
    //   315: ldc 171
    //   317: ldc 173
    //   319: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   322: iload_3
    //   323: iconst_2
    //   324: if_icmpne +576 -> 900
    //   327: iload 17
    //   329: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   332: astore 18
    //   334: iload_3
    //   335: iconst_2
    //   336: if_icmpne +574 -> 910
    //   339: iload 16
    //   341: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   344: astore 19
    //   346: new 46	com/admarvel/android/ads/r
    //   349: dup
    //   350: aload_2
    //   351: invokespecial 176	com/admarvel/android/ads/r:<init>	(Landroid/content/Context;)V
    //   354: astore 20
    //   356: aload 13
    //   358: ldc 178
    //   360: new 41	java/lang/StringBuilder
    //   363: dup
    //   364: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   367: ldc 180
    //   369: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: getstatic 183	android/os/Build:BRAND	Ljava/lang/String;
    //   375: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: ldc 185
    //   380: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: getstatic 96	android/os/Build:MODEL	Ljava/lang/String;
    //   386: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: ldc 187
    //   391: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: aload 18
    //   396: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: ldc 189
    //   401: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   404: aload 19
    //   406: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: ldc 191
    //   411: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   414: getstatic 108	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   417: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: ldc 193
    //   422: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: aload 20
    //   427: invokevirtual 195	com/admarvel/android/ads/r:a	()Ljava/lang/String;
    //   430: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   436: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   439: aload_2
    //   440: ifnull +633 -> 1073
    //   443: aload_2
    //   444: invokevirtual 200	android/content/Context:getPackageName	()Ljava/lang/String;
    //   447: astore 21
    //   449: aload 21
    //   451: ifnull +20 -> 471
    //   454: aload 21
    //   456: invokevirtual 203	java/lang/String:length	()I
    //   459: ifle +12 -> 471
    //   462: aload 13
    //   464: ldc 205
    //   466: aload 21
    //   468: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   471: aload_2
    //   472: instanceof 207
    //   475: ifeq +141 -> 616
    //   478: aload_2
    //   479: checkcast 207	android/app/Activity
    //   482: astore 28
    //   484: aload 28
    //   486: ifnull +130 -> 616
    //   489: aload 28
    //   491: invokevirtual 211	android/app/Activity:getWindow	()Landroid/view/Window;
    //   494: ldc 212
    //   496: invokevirtual 218	android/view/Window:findViewById	(I)Landroid/view/View;
    //   499: checkcast 220	android/view/ViewGroup
    //   502: astore 29
    //   504: iconst_0
    //   505: invokestatic 225	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   508: astore 30
    //   510: invokestatic 114	com/admarvel/android/ads/Version:getAndroidSDKVersion	()I
    //   513: bipush 11
    //   515: if_icmplt +89 -> 604
    //   518: aload_1
    //   519: getstatic 165	com/admarvel/android/ads/AdFetcher$Adtype:BANNER	Lcom/admarvel/android/ads/AdFetcher$Adtype;
    //   522: invokevirtual 169	com/admarvel/android/ads/AdFetcher$Adtype:equals	(Ljava/lang/Object;)Z
    //   525: istore 31
    //   527: iload 31
    //   529: ifeq +402 -> 931
    //   532: ldc 220
    //   534: ldc 227
    //   536: iconst_0
    //   537: anewarray 229	java/lang/Class
    //   540: invokevirtual 233	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   543: aload 29
    //   545: aconst_null
    //   546: invokevirtual 239	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   549: astore 33
    //   551: aload 33
    //   553: ifnull +513 -> 1066
    //   556: aload 33
    //   558: instanceof 222
    //   561: ifeq +505 -> 1066
    //   564: aload 33
    //   566: checkcast 222	java/lang/Boolean
    //   569: astore 34
    //   571: aload 34
    //   573: invokevirtual 243	java/lang/Boolean:booleanValue	()Z
    //   576: ifeq +24 -> 600
    //   579: iload 10
    //   581: ifeq +19 -> 600
    //   584: invokestatic 246	com/admarvel/android/ads/r:c	()Z
    //   587: ifeq +13 -> 600
    //   590: iconst_0
    //   591: invokestatic 225	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   594: astore 36
    //   596: aload 36
    //   598: astore 34
    //   600: aload 34
    //   602: astore 30
    //   604: aload 13
    //   606: ldc 248
    //   608: aload 30
    //   610: invokevirtual 249	java/lang/Boolean:toString	()Ljava/lang/String;
    //   613: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   616: aload 5
    //   618: ldc 251
    //   620: invokeinterface 257 2 0
    //   625: checkcast 61	java/lang/String
    //   628: astore 22
    //   630: aload 22
    //   632: ifnull +21 -> 653
    //   635: aload 22
    //   637: invokevirtual 203	java/lang/String:length	()I
    //   640: ifle +13 -> 653
    //   643: aload 13
    //   645: ldc_w 259
    //   648: aload 22
    //   650: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   653: aload_2
    //   654: invokestatic 265	com/admarvel/android/ads/AdMarvelUtils:isTabletDevice	(Landroid/content/Context;)Z
    //   657: ifne +293 -> 950
    //   660: aload 13
    //   662: ldc_w 267
    //   665: ldc_w 269
    //   668: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   671: aload 13
    //   673: ldc_w 271
    //   676: ldc_w 273
    //   679: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   682: aload_2
    //   683: invokestatic 276	com/admarvel/android/ads/r:c	(Landroid/content/Context;)Ljava/lang/String;
    //   686: astore 23
    //   688: aload 23
    //   690: ldc_w 278
    //   693: invokevirtual 279	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   696: ifne +13 -> 709
    //   699: aload 13
    //   701: ldc_w 281
    //   704: aload 23
    //   706: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   709: aload_2
    //   710: invokestatic 284	com/admarvel/android/ads/r:b	(Landroid/content/Context;)Ljava/lang/String;
    //   713: astore 24
    //   715: aload 23
    //   717: ldc 89
    //   719: invokevirtual 279	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   722: ifne +13 -> 735
    //   725: aload 13
    //   727: ldc_w 286
    //   730: aload 24
    //   732: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   735: iload 12
    //   737: ifeq +14 -> 751
    //   740: aload 13
    //   742: ldc_w 288
    //   745: ldc_w 269
    //   748: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   751: invokestatic 114	com/admarvel/android/ads/Version:getAndroidSDKVersion	()I
    //   754: bipush 21
    //   756: if_icmplt +219 -> 975
    //   759: invokestatic 291	com/admarvel/android/ads/AdFetcher$a:a	()Ljava/lang/String;
    //   762: astore 27
    //   764: aload 27
    //   766: ifnull +21 -> 787
    //   769: aload 27
    //   771: invokevirtual 203	java/lang/String:length	()I
    //   774: ifle +13 -> 787
    //   777: aload 13
    //   779: ldc_w 293
    //   782: aload 27
    //   784: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   787: aload 15
    //   789: ifnull +21 -> 810
    //   792: aload 15
    //   794: invokevirtual 203	java/lang/String:length	()I
    //   797: ifle +13 -> 810
    //   800: aload 13
    //   802: ldc_w 295
    //   805: aload 15
    //   807: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   810: aload 13
    //   812: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   815: areturn
    //   816: aload 13
    //   818: ldc 87
    //   820: getstatic 25	com/admarvel/android/ads/AdFetcher:SDK_SUPPORTED	Ljava/lang/String;
    //   823: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   826: goto -718 -> 108
    //   829: astore 14
    //   831: aload 14
    //   833: invokestatic 301	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   836: invokestatic 307	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   839: aconst_null
    //   840: areturn
    //   841: aload 13
    //   843: ldc 120
    //   845: ldc_w 309
    //   848: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   851: goto -665 -> 186
    //   854: aload_1
    //   855: getstatic 312	com/admarvel/android/ads/AdFetcher$Adtype:INTERSTITIAL	Lcom/admarvel/android/ads/AdFetcher$Adtype;
    //   858: invokevirtual 169	com/admarvel/android/ads/AdFetcher$Adtype:equals	(Ljava/lang/Object;)Z
    //   861: ifeq +16 -> 877
    //   864: aload 13
    //   866: ldc 171
    //   868: ldc_w 314
    //   871: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   874: goto -552 -> 322
    //   877: aload_1
    //   878: getstatic 317	com/admarvel/android/ads/AdFetcher$Adtype:NATIVE	Lcom/admarvel/android/ads/AdFetcher$Adtype;
    //   881: invokevirtual 169	com/admarvel/android/ads/AdFetcher$Adtype:equals	(Ljava/lang/Object;)Z
    //   884: ifeq -562 -> 322
    //   887: aload 13
    //   889: ldc 171
    //   891: ldc_w 319
    //   894: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   897: goto -575 -> 322
    //   900: iload 16
    //   902: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   905: astore 18
    //   907: goto -573 -> 334
    //   910: iload 17
    //   912: invokestatic 65	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   915: astore 19
    //   917: goto -571 -> 346
    //   920: aload 32
    //   922: invokestatic 301	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   925: invokestatic 307	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   928: goto -324 -> 604
    //   931: aload_1
    //   932: getstatic 312	com/admarvel/android/ads/AdFetcher$Adtype:INTERSTITIAL	Lcom/admarvel/android/ads/AdFetcher$Adtype;
    //   935: invokevirtual 169	com/admarvel/android/ads/AdFetcher$Adtype:equals	(Ljava/lang/Object;)Z
    //   938: ifeq -334 -> 604
    //   941: iconst_1
    //   942: invokestatic 225	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   945: astore 30
    //   947: goto -343 -> 604
    //   950: aload 13
    //   952: ldc_w 267
    //   955: ldc_w 273
    //   958: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   961: aload 13
    //   963: ldc_w 271
    //   966: ldc_w 269
    //   969: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   972: goto -290 -> 682
    //   975: invokestatic 114	com/admarvel/android/ads/Version:getAndroidSDKVersion	()I
    //   978: bipush 8
    //   980: if_icmplt +42 -> 1022
    //   983: invokestatic 114	com/admarvel/android/ads/Version:getAndroidSDKVersion	()I
    //   986: bipush 20
    //   988: if_icmpgt +34 -> 1022
    //   991: invokestatic 322	com/admarvel/android/ads/AdFetcher$c:a	()Ljava/lang/String;
    //   994: astore 26
    //   996: aload 26
    //   998: ifnull -211 -> 787
    //   1001: aload 26
    //   1003: invokevirtual 203	java/lang/String:length	()I
    //   1006: ifle -219 -> 787
    //   1009: aload 13
    //   1011: ldc_w 293
    //   1014: aload 26
    //   1016: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   1019: goto -232 -> 787
    //   1022: invokestatic 325	com/admarvel/android/ads/AdFetcher$b:a	()Ljava/lang/String;
    //   1025: astore 25
    //   1027: aload 25
    //   1029: ifnull -242 -> 787
    //   1032: aload 25
    //   1034: invokevirtual 203	java/lang/String:length	()I
    //   1037: ifle -250 -> 787
    //   1040: aload 13
    //   1042: ldc_w 293
    //   1045: aload 25
    //   1047: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   1050: goto -263 -> 787
    //   1053: astore 35
    //   1055: aload 34
    //   1057: astore 30
    //   1059: aload 35
    //   1061: astore 32
    //   1063: goto -143 -> 920
    //   1066: aload 30
    //   1068: astore 34
    //   1070: goto -499 -> 571
    //   1073: aconst_null
    //   1074: astore 21
    //   1076: goto -627 -> 449
    //   1079: astore 32
    //   1081: goto -161 -> 920
    //
    // Exception table:
    //   from	to	target	type
    //   9	94	829	java/lang/Exception
    //   99	108	829	java/lang/Exception
    //   108	172	829	java/lang/Exception
    //   177	186	829	java/lang/Exception
    //   186	201	829	java/lang/Exception
    //   206	230	829	java/lang/Exception
    //   230	236	829	java/lang/Exception
    //   241	265	829	java/lang/Exception
    //   265	322	829	java/lang/Exception
    //   327	334	829	java/lang/Exception
    //   339	346	829	java/lang/Exception
    //   346	439	829	java/lang/Exception
    //   443	449	829	java/lang/Exception
    //   454	471	829	java/lang/Exception
    //   471	484	829	java/lang/Exception
    //   489	527	829	java/lang/Exception
    //   604	616	829	java/lang/Exception
    //   616	630	829	java/lang/Exception
    //   635	653	829	java/lang/Exception
    //   653	682	829	java/lang/Exception
    //   682	709	829	java/lang/Exception
    //   709	735	829	java/lang/Exception
    //   740	751	829	java/lang/Exception
    //   751	764	829	java/lang/Exception
    //   769	787	829	java/lang/Exception
    //   792	810	829	java/lang/Exception
    //   816	826	829	java/lang/Exception
    //   841	851	829	java/lang/Exception
    //   854	874	829	java/lang/Exception
    //   877	897	829	java/lang/Exception
    //   900	907	829	java/lang/Exception
    //   910	917	829	java/lang/Exception
    //   920	928	829	java/lang/Exception
    //   931	947	829	java/lang/Exception
    //   950	972	829	java/lang/Exception
    //   975	996	829	java/lang/Exception
    //   1001	1019	829	java/lang/Exception
    //   1022	1027	829	java/lang/Exception
    //   1032	1050	829	java/lang/Exception
    //   571	579	1053	java/lang/Exception
    //   584	596	1053	java/lang/Exception
    //   532	551	1079	java/lang/Exception
    //   556	571	1079	java/lang/Exception
  }

  private String fetchAdFromLocal(AdFetcher.Adtype paramAdtype, Context paramContext, String paramString1, int paramInt1, String paramString2, Map<String, Object> paramMap, String paramString3, String paramString4, int paramInt2, String paramString5, boolean paramBoolean)
  {
    return new b().a(paramAdtype, paramContext, paramString1, paramInt1, paramString2, paramMap, paramString3, paramString4, paramInt2, paramString5, false, new Handler(), paramBoolean);
  }

  // ERROR //
  public String fetchAd(AdFetcher.Adtype paramAdtype, Context paramContext, String paramString1, int paramInt1, String paramString2, Map<String, Object> paramMap, String paramString3, String paramString4, int paramInt2, String paramString5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, AdMarvelNetworkHandler paramAdMarvelNetworkHandler)
  {
    // Byte code:
    //   0: new 342	java/util/HashMap
    //   3: dup
    //   4: invokespecial 343	java/util/HashMap:<init>	()V
    //   7: astore 15
    //   9: aload_2
    //   10: ifnonnull +5 -> 15
    //   13: aconst_null
    //   14: areturn
    //   15: aload 6
    //   17: ifnull +18 -> 35
    //   20: aload 6
    //   22: monitorenter
    //   23: aload 15
    //   25: aload 6
    //   27: invokeinterface 347 2 0
    //   32: aload 6
    //   34: monitorexit
    //   35: aload 15
    //   37: ldc_w 349
    //   40: ldc_w 351
    //   43: invokeinterface 355 3 0
    //   48: pop
    //   49: invokestatic 114	com/admarvel/android/ads/Version:getAndroidSDKVersion	()I
    //   52: bipush 8
    //   54: if_icmple +235 -> 289
    //   57: aload_2
    //   58: invokestatic 360	com/admarvel/android/util/k:c	(Landroid/content/Context;)Lcom/admarvel/android/util/k;
    //   61: astore 40
    //   63: aload_0
    //   64: aload 40
    //   66: aload_2
    //   67: invokevirtual 361	com/admarvel/android/util/k:b	(Landroid/content/Context;)Ljava/lang/String;
    //   70: putfield 32	com/admarvel/android/ads/AdFetcher:googleAdID	Ljava/lang/String;
    //   73: aload_0
    //   74: aload 40
    //   76: aload_2
    //   77: invokevirtual 363	com/admarvel/android/util/k:a	(Landroid/content/Context;)I
    //   80: putfield 35	com/admarvel/android/ads/AdFetcher:userOptOutPreference	I
    //   83: aload_0
    //   84: getfield 32	com/admarvel/android/ads/AdFetcher:googleAdID	Ljava/lang/String;
    //   87: ifnull +184 -> 271
    //   90: aload_0
    //   91: getfield 32	com/admarvel/android/ads/AdFetcher:googleAdID	Ljava/lang/String;
    //   94: ldc 30
    //   96: invokevirtual 279	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   99: ifne +172 -> 271
    //   102: aload 15
    //   104: ldc 251
    //   106: aload_0
    //   107: getfield 32	com/admarvel/android/ads/AdFetcher:googleAdID	Ljava/lang/String;
    //   110: invokeinterface 355 3 0
    //   115: pop
    //   116: aload 15
    //   118: ldc_w 365
    //   121: aload_0
    //   122: getfield 35	com/admarvel/android/ads/AdFetcher:userOptOutPreference	I
    //   125: invokestatic 369	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   128: invokeinterface 355 3 0
    //   133: pop
    //   134: aload 15
    //   136: ldc_w 371
    //   139: invokeinterface 257 2 0
    //   144: ifnonnull +37 -> 181
    //   147: aload_0
    //   148: getfield 32	com/admarvel/android/ads/AdFetcher:googleAdID	Ljava/lang/String;
    //   151: ifnull +156 -> 307
    //   154: aload_0
    //   155: getfield 32	com/admarvel/android/ads/AdFetcher:googleAdID	Ljava/lang/String;
    //   158: ldc 30
    //   160: invokevirtual 279	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   163: ifne +144 -> 307
    //   166: aload 15
    //   168: ldc_w 371
    //   171: aload_0
    //   172: getfield 32	com/admarvel/android/ads/AdFetcher:googleAdID	Ljava/lang/String;
    //   175: invokeinterface 355 3 0
    //   180: pop
    //   181: aload_0
    //   182: aload_1
    //   183: aload_2
    //   184: iload 4
    //   186: aload 5
    //   188: aload 15
    //   190: aload 7
    //   192: aload 8
    //   194: iload 9
    //   196: aload 10
    //   198: iload 11
    //   200: iload 12
    //   202: iload 13
    //   204: invokespecial 373	com/admarvel/android/ads/AdFetcher:buildParamString	(Lcom/admarvel/android/ads/AdFetcher$Adtype;Landroid/content/Context;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZZ)Ljava/lang/String;
    //   207: astore 19
    //   209: new 41	java/lang/StringBuilder
    //   212: dup
    //   213: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   216: ldc_w 375
    //   219: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: aload 19
    //   224: ldc_w 377
    //   227: invokestatic 383	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   230: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: invokestatic 307	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   239: aload 19
    //   241: putstatic 385	com/admarvel/android/ads/AdFetcher:lastAdRequestPostString	Ljava/lang/String;
    //   244: aload 19
    //   246: ifnonnull +108 -> 354
    //   249: aconst_null
    //   250: areturn
    //   251: astore 44
    //   253: aload 6
    //   255: monitorexit
    //   256: aload 44
    //   258: athrow
    //   259: astore 16
    //   261: aload 16
    //   263: invokestatic 301	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   266: invokestatic 307	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   269: aconst_null
    //   270: areturn
    //   271: aload 15
    //   273: ldc_w 387
    //   276: aload_2
    //   277: invokestatic 392	com/admarvel/android/util/OptionalUtils:getId	(Landroid/content/Context;)Ljava/lang/String;
    //   280: invokeinterface 355 3 0
    //   285: pop
    //   286: goto -152 -> 134
    //   289: aload 15
    //   291: ldc_w 387
    //   294: aload_2
    //   295: invokestatic 392	com/admarvel/android/util/OptionalUtils:getId	(Landroid/content/Context;)Ljava/lang/String;
    //   298: invokeinterface 355 3 0
    //   303: pop
    //   304: goto -170 -> 134
    //   307: aload 15
    //   309: ldc_w 371
    //   312: aload_2
    //   313: invokestatic 392	com/admarvel/android/util/OptionalUtils:getId	(Landroid/content/Context;)Ljava/lang/String;
    //   316: invokeinterface 355 3 0
    //   321: pop
    //   322: goto -141 -> 181
    //   325: astore 20
    //   327: new 41	java/lang/StringBuilder
    //   330: dup
    //   331: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   334: ldc_w 375
    //   337: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: aload 19
    //   342: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   348: invokestatic 307	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   351: goto -112 -> 239
    //   354: aload_0
    //   355: new 394	org/json/JSONObject
    //   358: dup
    //   359: invokespecial 395	org/json/JSONObject:<init>	()V
    //   362: putfield 397	com/admarvel/android/ads/AdFetcher:requestJson	Lorg/json/JSONObject;
    //   365: new 399	java/text/SimpleDateFormat
    //   368: dup
    //   369: ldc_w 401
    //   372: invokespecial 403	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   375: astore 30
    //   377: aload 30
    //   379: ldc_w 405
    //   382: invokestatic 411	java/util/TimeZone:getTimeZone	(Ljava/lang/String;)Ljava/util/TimeZone;
    //   385: invokevirtual 415	java/text/SimpleDateFormat:setTimeZone	(Ljava/util/TimeZone;)V
    //   388: new 399	java/text/SimpleDateFormat
    //   391: dup
    //   392: ldc_w 401
    //   395: invokespecial 403	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   398: astore 31
    //   400: invokestatic 421	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   403: invokevirtual 425	java/util/Calendar:getTime	()Ljava/util/Date;
    //   406: astore 32
    //   408: invokestatic 431	java/lang/System:currentTimeMillis	()J
    //   411: invokestatic 436	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   414: astore 33
    //   416: aload_0
    //   417: getfield 397	com/admarvel/android/ads/AdFetcher:requestJson	Lorg/json/JSONObject;
    //   420: ldc_w 438
    //   423: aload 19
    //   425: invokevirtual 441	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   428: pop
    //   429: aload_0
    //   430: getfield 397	com/admarvel/android/ads/AdFetcher:requestJson	Lorg/json/JSONObject;
    //   433: ldc_w 443
    //   436: aload 33
    //   438: invokestatic 446	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   441: invokevirtual 441	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   444: pop
    //   445: aload_0
    //   446: getfield 397	com/admarvel/android/ads/AdFetcher:requestJson	Lorg/json/JSONObject;
    //   449: ldc_w 448
    //   452: aload 30
    //   454: aload 32
    //   456: invokevirtual 451	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   459: invokevirtual 441	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   462: pop
    //   463: aload_0
    //   464: getfield 397	com/admarvel/android/ads/AdFetcher:requestJson	Lorg/json/JSONObject;
    //   467: ldc_w 453
    //   470: aload 31
    //   472: aload 32
    //   474: invokevirtual 451	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   477: invokevirtual 441	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   480: pop
    //   481: new 455	com/admarvel/android/util/d
    //   484: dup
    //   485: invokespecial 456	com/admarvel/android/util/d:<init>	()V
    //   488: astore 22
    //   490: new 41	java/lang/StringBuilder
    //   493: dup
    //   494: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   497: astore 23
    //   499: aload 23
    //   501: ldc_w 458
    //   504: ldc 81
    //   506: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   509: aload 23
    //   511: ldc_w 460
    //   514: aload 22
    //   516: aload 19
    //   518: invokevirtual 463	com/admarvel/android/util/d:a	(Ljava/lang/String;)Ljava/lang/String;
    //   521: invokestatic 55	com/admarvel/android/ads/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   524: new 465	com/admarvel/android/ads/AdMarvelHttpPost
    //   527: dup
    //   528: invokespecial 466	com/admarvel/android/ads/AdMarvelHttpPost:<init>	()V
    //   531: astore 25
    //   533: aload 25
    //   535: ldc 8
    //   537: invokevirtual 469	com/admarvel/android/ads/AdMarvelHttpPost:setEndpointUrl	(Ljava/lang/String;)V
    //   540: aload 23
    //   542: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   545: invokevirtual 203	java/lang/String:length	()I
    //   548: ifle +157 -> 705
    //   551: aload 25
    //   553: aload 23
    //   555: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   558: invokevirtual 472	com/admarvel/android/ads/AdMarvelHttpPost:setPostString	(Ljava/lang/String;)V
    //   561: new 342	java/util/HashMap
    //   564: dup
    //   565: invokespecial 343	java/util/HashMap:<init>	()V
    //   568: astore 26
    //   570: aload 26
    //   572: ldc_w 474
    //   575: new 46	com/admarvel/android/ads/r
    //   578: dup
    //   579: aload_2
    //   580: invokespecial 176	com/admarvel/android/ads/r:<init>	(Landroid/content/Context;)V
    //   583: invokevirtual 195	com/admarvel/android/ads/r:a	()Ljava/lang/String;
    //   586: invokeinterface 355 3 0
    //   591: pop
    //   592: aload 26
    //   594: ldc_w 476
    //   597: ldc_w 478
    //   600: invokeinterface 355 3 0
    //   605: pop
    //   606: aload 25
    //   608: aload 26
    //   610: invokevirtual 481	com/admarvel/android/ads/AdMarvelHttpPost:setHttpHeaders	(Ljava/util/Map;)V
    //   613: aload 14
    //   615: ifnonnull +12 -> 627
    //   618: new 483	com/admarvel/android/ads/g
    //   621: dup
    //   622: invokespecial 484	com/admarvel/android/ads/g:<init>	()V
    //   625: astore 14
    //   627: aload 14
    //   629: aload 25
    //   631: invokeinterface 490 2 0
    //   636: astore 29
    //   638: aload 29
    //   640: ifnull +75 -> 715
    //   643: aload 29
    //   645: invokevirtual 203	java/lang/String:length	()I
    //   648: ifle +67 -> 715
    //   651: new 41	java/lang/StringBuilder
    //   654: dup
    //   655: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   658: ldc_w 492
    //   661: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   664: new 61	java/lang/String
    //   667: dup
    //   668: aload 29
    //   670: invokespecial 493	java/lang/String:<init>	(Ljava/lang/String;)V
    //   673: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   676: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   679: invokestatic 307	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   682: aload 29
    //   684: areturn
    //   685: astore 21
    //   687: aload 21
    //   689: invokevirtual 496	java/lang/Exception:printStackTrace	()V
    //   692: goto -211 -> 481
    //   695: astore 24
    //   697: aload 24
    //   699: invokevirtual 497	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   702: goto -178 -> 524
    //   705: aload 25
    //   707: aload 19
    //   709: invokevirtual 472	com/admarvel/android/ads/AdMarvelHttpPost:setPostString	(Ljava/lang/String;)V
    //   712: goto -151 -> 561
    //   715: ldc_w 499
    //   718: invokestatic 307	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   721: aload 29
    //   723: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   23	35	251	finally
    //   20	23	259	java/lang/Exception
    //   35	134	259	java/lang/Exception
    //   134	181	259	java/lang/Exception
    //   253	259	259	java/lang/Exception
    //   271	286	259	java/lang/Exception
    //   289	304	259	java/lang/Exception
    //   307	322	259	java/lang/Exception
    //   209	239	325	java/lang/Exception
    //   354	481	685	java/lang/Exception
    //   499	524	695	java/io/UnsupportedEncodingException
  }

  public String fetchOfflineAd(AdFetcher.Adtype paramAdtype, Context paramContext, String paramString1, int paramInt1, String paramString2, Map<String, Object> paramMap, String paramString3, String paramString4, int paramInt2, String paramString5, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramContext == null)
      return null;
    HashMap localHashMap = new HashMap();
    if (paramMap != null);
    while (true)
    {
      try
      {
        try
        {
          localHashMap.putAll(paramMap);
          localHashMap.put("RESPONSE_TYPE", "xml_with_xhtml");
          if (Version.getAndroidSDKVersion() <= 8)
            break label254;
          k localk = k.c(paramContext);
          this.googleAdID = localk.b(paramContext);
          this.userOptOutPreference = localk.a(paramContext);
          if ((this.googleAdID != null) && (!this.googleAdID.equals("VALUE_NOT_DEFINED")))
          {
            localHashMap.put("ANDROID_ADVERTISING_ID", this.googleAdID);
            localHashMap.put("ANDROID_ADVERTISING_ID_OPT_OUT", Integer.toString(this.userOptOutPreference));
            if (paramString1 != null)
              break label290;
            str = this.googleAdID;
            if (localHashMap.get("UNIQUE_ID") == null)
            {
              if ((this.googleAdID == null) || (this.googleAdID.equals("VALUE_NOT_DEFINED")))
                break label272;
              localHashMap.put("UNIQUE_ID", this.googleAdID);
            }
            return fetchAdFromLocal(paramAdtype, paramContext, str, paramInt1, paramString2, paramMap, paramString3, paramString4, paramInt2, paramString5, paramBoolean1);
          }
        }
        finally
        {
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return null;
      }
      localHashMap.put("ANDROID_ID", OptionalUtils.getId(paramContext));
      continue;
      label254: localHashMap.put("ANDROID_ID", OptionalUtils.getId(paramContext));
      continue;
      label272: localHashMap.put("UNIQUE_ID", OptionalUtils.getId(paramContext));
      continue;
      label290: String str = paramString1;
    }
  }

  public JSONObject getRequestJson()
  {
    return this.requestJson;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdFetcher
 * JD-Core Version:    0.6.2
 */