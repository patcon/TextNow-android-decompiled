package com.admarvel.android.b;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import com.admarvel.android.ads.AdMarvelUtils;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class c extends AsyncTask<Void, Void, Void>
{
  private static boolean k = false;
  private static boolean l = false;
  private Activity a;
  private final WeakReference<Activity> b;
  private String c;
  private File d;
  private File e;
  private String f;
  private String g;
  private String h;
  private int i = -1;
  private ArrayList<String> j;

  public c(String paramString, Activity paramActivity)
  {
    this.b = new WeakReference(paramActivity);
    this.c = paramString;
  }

  private String a(Activity paramActivity, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    this.d = paramActivity.getDir("Admarvel", 0);
    this.e = new File(this.d, paramString);
    SharedPreferences localSharedPreferences = paramActivity.getSharedPreferences("admarvel_preferences", 0);
    String str1 = localSharedPreferences.getString("partner_id", "NULL");
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putString("partner_id", paramString);
    if (!str1.equals(paramString))
    {
      File localFile = new File(this.d, str1);
      if (localFile.isDirectory())
      {
        Logging.log("Offline SDK:deleting expired packages");
        d.a(localFile);
      }
    }
    boolean bool1 = this.e.mkdir();
    localEditor.putString("childDirectory", this.e.getAbsolutePath());
    localEditor.commit();
    this.f = "-1";
    boolean bool2 = localSharedPreferences.getBoolean("download_started", false);
    if (!bool1);
    try
    {
      String str2;
      if (this.e.isDirectory())
      {
        this.f = localSharedPreferences.getString("admarvel_current_version", "-1");
        str2 = localSharedPreferences.getString("admarvel_temp_version", "-1");
        if (this.f.equals("-1"))
          break label256;
        AdMarvelUtils.appendParams(localStringBuilder, "current_version", this.f);
      }
      while (true)
      {
        AdMarvelUtils.appendParams(localStringBuilder, "partner_id", paramString);
        AdMarvelUtils.appendParams(localStringBuilder, "banner_package", "1");
        return localStringBuilder.toString();
        label256: if ((bool2) && (!str2.equals("-1")))
          AdMarvelUtils.appendParams(localStringBuilder, "current_version", str2);
      }
    }
    catch (Exception localException)
    {
      Logging.log("Offline SDK:" + Log.getStackTraceString(localException));
    }
    return null;
  }

  private void a(SharedPreferences.Editor paramEditor, String paramString)
  {
    if ((paramEditor != null) && (paramString != null))
    {
      paramEditor.putString("admarvel_current_version", paramString);
      if (!paramEditor.commit())
      {
        Logging.log("Offline SDK:package cannot be downloaded because current version cannot be comitted ");
        k = false;
        l = false;
      }
    }
  }

  // ERROR //
  private void a(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +18 -> 19
    //   4: ldc 190
    //   6: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   9: new 50	java/lang/Exception
    //   12: dup
    //   13: ldc 192
    //   15: invokespecial 194	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   18: athrow
    //   19: new 52	java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   26: ldc 196
    //   28: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_1
    //   32: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   41: getstatic 30	com/admarvel/android/b/c:k	Z
    //   44: ifne +97 -> 141
    //   47: iconst_1
    //   48: putstatic 30	com/admarvel/android/b/c:k	Z
    //   51: new 198	com/admarvel/android/ads/AdMarvelXMLReader
    //   54: dup
    //   55: invokespecial 199	com/admarvel/android/ads/AdMarvelXMLReader:<init>	()V
    //   58: astore_2
    //   59: aload_2
    //   60: aload_1
    //   61: invokevirtual 202	com/admarvel/android/ads/AdMarvelXMLReader:parseXMLString	(Ljava/lang/String;)V
    //   64: aload_2
    //   65: invokevirtual 206	com/admarvel/android/ads/AdMarvelXMLReader:getParsedXMLData	()Lcom/admarvel/android/ads/AdMarvelXMLElement;
    //   68: astore 19
    //   70: aload_0
    //   71: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   74: ifnull +17 -> 91
    //   77: aload_0
    //   78: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   81: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   84: astore 23
    //   86: aload 23
    //   88: ifnonnull +54 -> 142
    //   91: iconst_0
    //   92: putstatic 30	com/admarvel/android/b/c:k	Z
    //   95: iconst_0
    //   96: putstatic 32	com/admarvel/android/b/c:l	Z
    //   99: aload_0
    //   100: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   103: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   106: checkcast 57	android/app/Activity
    //   109: ldc 72
    //   111: iconst_0
    //   112: invokevirtual 76	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   115: invokeinterface 90 1 0
    //   120: astore 20
    //   122: aload 20
    //   124: ldc 137
    //   126: iconst_0
    //   127: invokeinterface 214 3 0
    //   132: pop
    //   133: aload 20
    //   135: invokeinterface 131 1 0
    //   140: pop
    //   141: return
    //   142: aload 19
    //   144: invokevirtual 219	com/admarvel/android/ads/AdMarvelXMLElement:c	()Ljava/util/LinkedHashMap;
    //   147: astore 24
    //   149: aload 24
    //   151: ldc 221
    //   153: invokevirtual 226	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   156: checkcast 228	java/util/ArrayList
    //   159: astore 25
    //   161: aload 24
    //   163: ldc 230
    //   165: invokevirtual 226	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   168: checkcast 228	java/util/ArrayList
    //   171: iconst_0
    //   172: invokevirtual 233	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   175: checkcast 216	com/admarvel/android/ads/AdMarvelXMLElement
    //   178: invokevirtual 236	com/admarvel/android/ads/AdMarvelXMLElement:getAttributes	()Ljava/util/LinkedHashMap;
    //   181: astore 26
    //   183: aload_0
    //   184: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   187: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   190: checkcast 57	android/app/Activity
    //   193: ldc 72
    //   195: iconst_0
    //   196: invokevirtual 76	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   199: astore 27
    //   201: aload 27
    //   203: ifnonnull +67 -> 270
    //   206: ldc 238
    //   208: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   211: iconst_0
    //   212: putstatic 30	com/admarvel/android/b/c:k	Z
    //   215: iconst_0
    //   216: putstatic 32	com/admarvel/android/b/c:l	Z
    //   219: iconst_0
    //   220: putstatic 30	com/admarvel/android/b/c:k	Z
    //   223: iconst_0
    //   224: putstatic 32	com/admarvel/android/b/c:l	Z
    //   227: aload_0
    //   228: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   231: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   234: checkcast 57	android/app/Activity
    //   237: ldc 72
    //   239: iconst_0
    //   240: invokevirtual 76	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   243: invokeinterface 90 1 0
    //   248: astore 28
    //   250: aload 28
    //   252: ldc 137
    //   254: iconst_0
    //   255: invokeinterface 214 3 0
    //   260: pop
    //   261: aload 28
    //   263: invokeinterface 131 1 0
    //   268: pop
    //   269: return
    //   270: aload 27
    //   272: invokeinterface 90 1 0
    //   277: astore 31
    //   279: aload 31
    //   281: ldc 137
    //   283: iconst_1
    //   284: invokeinterface 214 3 0
    //   289: pop
    //   290: aload 31
    //   292: invokeinterface 131 1 0
    //   297: pop
    //   298: aload 26
    //   300: invokevirtual 242	java/util/LinkedHashMap:keySet	()Ljava/util/Set;
    //   303: invokeinterface 248 1 0
    //   308: astore 34
    //   310: aload 34
    //   312: invokeinterface 253 1 0
    //   317: ifeq +136 -> 453
    //   320: aload 34
    //   322: invokeinterface 256 1 0
    //   327: checkcast 98	java/lang/String
    //   330: astore 98
    //   332: aload 26
    //   334: aload 98
    //   336: invokevirtual 226	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   339: checkcast 98	java/lang/String
    //   342: ldc_w 258
    //   345: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   348: ifne -38 -> 310
    //   351: aload 31
    //   353: aload 98
    //   355: aload 26
    //   357: aload 98
    //   359: invokevirtual 226	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   362: checkcast 98	java/lang/String
    //   365: invokeinterface 96 3 0
    //   370: pop
    //   371: goto -61 -> 310
    //   374: astore 15
    //   376: new 52	java/lang/StringBuilder
    //   379: dup
    //   380: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   383: ldc 162
    //   385: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: aload 15
    //   390: invokevirtual 261	javax/xml/parsers/ParserConfigurationException:getMessage	()Ljava/lang/String;
    //   393: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   399: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   402: iconst_0
    //   403: putstatic 30	com/admarvel/android/b/c:k	Z
    //   406: iconst_0
    //   407: putstatic 32	com/admarvel/android/b/c:l	Z
    //   410: aload_0
    //   411: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   414: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   417: checkcast 57	android/app/Activity
    //   420: ldc 72
    //   422: iconst_0
    //   423: invokevirtual 76	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   426: invokeinterface 90 1 0
    //   431: astore 16
    //   433: aload 16
    //   435: ldc 137
    //   437: iconst_0
    //   438: invokeinterface 214 3 0
    //   443: pop
    //   444: aload 16
    //   446: invokeinterface 131 1 0
    //   451: pop
    //   452: return
    //   453: aload 31
    //   455: invokeinterface 131 1 0
    //   460: pop
    //   461: aload 25
    //   463: ifnull +1473 -> 1936
    //   466: aload 25
    //   468: invokevirtual 265	java/util/ArrayList:size	()I
    //   471: ifle +1465 -> 1936
    //   474: aload 25
    //   476: iconst_0
    //   477: invokevirtual 233	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   480: checkcast 216	com/admarvel/android/ads/AdMarvelXMLElement
    //   483: invokevirtual 267	com/admarvel/android/ads/AdMarvelXMLElement:b	()Ljava/lang/String;
    //   486: ldc_w 269
    //   489: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   492: ifeq +1504 -> 1996
    //   495: aload_0
    //   496: iconst_0
    //   497: putfield 38	com/admarvel/android/b/c:i	I
    //   500: aload_0
    //   501: ldc_w 271
    //   504: putfield 273	com/admarvel/android/b/c:g	Ljava/lang/String;
    //   507: ldc_w 275
    //   510: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   513: ldc_w 277
    //   516: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   519: invokestatic 283	java/lang/System:nanoTime	()J
    //   522: lstore 48
    //   524: aload_0
    //   525: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   528: ifnull +691 -> 1219
    //   531: aload_0
    //   532: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   535: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   538: checkcast 57	android/app/Activity
    //   541: astore 50
    //   543: aload_0
    //   544: aload 50
    //   546: putfield 285	com/admarvel/android/b/c:a	Landroid/app/Activity;
    //   549: aload 24
    //   551: ldc_w 287
    //   554: invokevirtual 226	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   557: checkcast 228	java/util/ArrayList
    //   560: astore 51
    //   562: aload 51
    //   564: ifnull +1685 -> 2249
    //   567: aload 51
    //   569: invokevirtual 265	java/util/ArrayList:size	()I
    //   572: ifle +1677 -> 2249
    //   575: aload_0
    //   576: aload 51
    //   578: iconst_0
    //   579: invokevirtual 233	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   582: checkcast 216	com/admarvel/android/ads/AdMarvelXMLElement
    //   585: invokevirtual 236	com/admarvel/android/ads/AdMarvelXMLElement:getAttributes	()Ljava/util/LinkedHashMap;
    //   588: ldc_w 289
    //   591: invokevirtual 226	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   594: checkcast 98	java/lang/String
    //   597: putfield 291	com/admarvel/android/b/c:h	Ljava/lang/String;
    //   600: aload 31
    //   602: ifnull +66 -> 668
    //   605: aload_0
    //   606: getfield 291	com/admarvel/android/b/c:h	Ljava/lang/String;
    //   609: ifnull +59 -> 668
    //   612: aload 31
    //   614: ldc 145
    //   616: aload_0
    //   617: getfield 291	com/admarvel/android/b/c:h	Ljava/lang/String;
    //   620: invokeinterface 96 3 0
    //   625: pop
    //   626: aload 31
    //   628: invokeinterface 131 1 0
    //   633: ifne +35 -> 668
    //   636: ldc 179
    //   638: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   641: iconst_0
    //   642: putstatic 30	com/admarvel/android/b/c:k	Z
    //   645: iconst_0
    //   646: putstatic 32	com/admarvel/android/b/c:l	Z
    //   649: aload 31
    //   651: ldc 137
    //   653: iconst_1
    //   654: invokeinterface 214 3 0
    //   659: pop
    //   660: aload 31
    //   662: invokeinterface 131 1 0
    //   667: pop
    //   668: aload_0
    //   669: aload 27
    //   671: ldc 143
    //   673: ldc 133
    //   675: invokeinterface 86 3 0
    //   680: putfield 135	com/admarvel/android/b/c:f	Ljava/lang/String;
    //   683: aload 51
    //   685: iconst_0
    //   686: invokevirtual 233	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   689: checkcast 216	com/admarvel/android/ads/AdMarvelXMLElement
    //   692: invokevirtual 267	com/admarvel/android/ads/AdMarvelXMLElement:b	()Ljava/lang/String;
    //   695: astore 55
    //   697: aload 31
    //   699: ldc_w 293
    //   702: aload 55
    //   704: invokeinterface 96 3 0
    //   709: pop
    //   710: aload 31
    //   712: invokeinterface 131 1 0
    //   717: pop
    //   718: new 295	com/admarvel/android/b/c$b
    //   721: dup
    //   722: aload_0
    //   723: new 297	java/net/URL
    //   726: dup
    //   727: aload 55
    //   729: invokespecial 298	java/net/URL:<init>	(Ljava/lang/String;)V
    //   732: aload_0
    //   733: getfield 70	com/admarvel/android/b/c:e	Ljava/io/File;
    //   736: invokevirtual 128	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   739: iconst_0
    //   740: aload_0
    //   741: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   744: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   747: checkcast 300	android/content/Context
    //   750: invokespecial 303	com/admarvel/android/b/c$b:<init>	(Lcom/admarvel/android/b/c;Ljava/net/URL;Ljava/lang/String;ZLandroid/content/Context;)V
    //   753: astore 58
    //   755: aload 58
    //   757: invokevirtual 306	com/admarvel/android/b/c$b:run	()V
    //   760: aload 58
    //   762: invokevirtual 309	com/admarvel/android/b/c$b:a	()Ljava/util/ArrayList;
    //   765: astore 59
    //   767: aload 59
    //   769: ifnull +1480 -> 2249
    //   772: aload 59
    //   774: invokevirtual 265	java/util/ArrayList:size	()I
    //   777: ifle +1472 -> 2249
    //   780: ldc_w 311
    //   783: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   786: aload_0
    //   787: getfield 63	com/admarvel/android/b/c:d	Ljava/io/File;
    //   790: aload 59
    //   792: iconst_0
    //   793: invokevirtual 233	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   796: checkcast 98	java/lang/String
    //   799: invokestatic 315	com/admarvel/android/b/a:b	(Ljava/io/File;Ljava/lang/String;)V
    //   802: aload_0
    //   803: getfield 63	com/admarvel/android/b/c:d	Ljava/io/File;
    //   806: aload 59
    //   808: iconst_1
    //   809: invokevirtual 233	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   812: checkcast 98	java/lang/String
    //   815: invokestatic 317	com/admarvel/android/b/a:a	(Ljava/io/File;Ljava/lang/String;)V
    //   818: ldc_w 319
    //   821: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   824: new 321	com/admarvel/android/b/b
    //   827: dup
    //   828: new 323	java/io/InputStreamReader
    //   831: dup
    //   832: new 325	java/io/FileInputStream
    //   835: dup
    //   836: aload 59
    //   838: iconst_1
    //   839: invokevirtual 233	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   842: checkcast 98	java/lang/String
    //   845: invokespecial 326	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   848: invokespecial 329	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   851: invokespecial 332	com/admarvel/android/b/b:<init>	(Ljava/io/Reader;)V
    //   854: astore 69
    //   856: aload 69
    //   858: invokevirtual 334	com/admarvel/android/b/b:c	()Ljava/util/ArrayList;
    //   861: astore 70
    //   863: new 228	java/util/ArrayList
    //   866: dup
    //   867: invokespecial 335	java/util/ArrayList:<init>	()V
    //   870: astore 71
    //   872: new 337	java/util/HashMap
    //   875: dup
    //   876: invokespecial 338	java/util/HashMap:<init>	()V
    //   879: astore 72
    //   881: aload 70
    //   883: ifnull +924 -> 1807
    //   886: aload 70
    //   888: invokeinterface 341 1 0
    //   893: astore 73
    //   895: aload 73
    //   897: invokeinterface 253 1 0
    //   902: ifeq +534 -> 1436
    //   905: aload 73
    //   907: invokeinterface 256 1 0
    //   912: checkcast 343	[Ljava/lang/String;
    //   915: astore 87
    //   917: aload_0
    //   918: invokevirtual 346	com/admarvel/android/b/c:isCancelled	()Z
    //   921: ifne -26 -> 895
    //   924: new 52	java/lang/StringBuilder
    //   927: dup
    //   928: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   931: aload 87
    //   933: iconst_0
    //   934: aaload
    //   935: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   938: ldc_w 348
    //   941: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   944: aload 87
    //   946: iconst_1
    //   947: aaload
    //   948: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   951: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   954: astore 88
    //   956: aload 71
    //   958: aload 88
    //   960: invokevirtual 351	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   963: pop
    //   964: aload 72
    //   966: aload 87
    //   968: iconst_0
    //   969: aaload
    //   970: aload 88
    //   972: invokevirtual 355	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   975: pop
    //   976: new 65	java/io/File
    //   979: dup
    //   980: new 52	java/lang/StringBuilder
    //   983: dup
    //   984: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   987: aload_0
    //   988: getfield 70	com/admarvel/android/b/c:e	Ljava/io/File;
    //   991: invokevirtual 128	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   994: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   997: ldc_w 357
    //   1000: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1003: aload 88
    //   1005: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1008: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1011: invokespecial 358	java/io/File:<init>	(Ljava/lang/String;)V
    //   1014: astore 91
    //   1016: aload 91
    //   1018: invokevirtual 106	java/io/File:isDirectory	()Z
    //   1021: ifne +9 -> 1030
    //   1024: aload 91
    //   1026: invokevirtual 361	java/io/File:mkdirs	()Z
    //   1029: pop
    //   1030: new 295	com/admarvel/android/b/c$b
    //   1033: dup
    //   1034: aload_0
    //   1035: new 297	java/net/URL
    //   1038: dup
    //   1039: aload 87
    //   1041: iconst_2
    //   1042: aaload
    //   1043: ldc_w 363
    //   1046: invokestatic 368	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1049: invokespecial 298	java/net/URL:<init>	(Ljava/lang/String;)V
    //   1052: new 52	java/lang/StringBuilder
    //   1055: dup
    //   1056: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   1059: aload_0
    //   1060: getfield 70	com/admarvel/android/b/c:e	Ljava/io/File;
    //   1063: invokevirtual 128	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1066: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1069: ldc_w 357
    //   1072: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1075: aload 88
    //   1077: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1080: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1083: aload_0
    //   1084: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   1087: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1090: checkcast 300	android/content/Context
    //   1093: invokespecial 371	com/admarvel/android/b/c$b:<init>	(Lcom/admarvel/android/b/c;Ljava/net/URL;Ljava/lang/String;Landroid/content/Context;)V
    //   1096: astore 92
    //   1098: new 373	java/lang/Thread
    //   1101: dup
    //   1102: aload 92
    //   1104: invokespecial 376	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   1107: astore 93
    //   1109: aload 93
    //   1111: invokevirtual 379	java/lang/Thread:start	()V
    //   1114: aload 93
    //   1116: invokevirtual 382	java/lang/Thread:join	()V
    //   1119: aload 92
    //   1121: getfield 384	com/admarvel/android/b/c$b:a	Z
    //   1124: ifeq -229 -> 895
    //   1127: aload_0
    //   1128: iconst_1
    //   1129: aload_0
    //   1130: getfield 38	com/admarvel/android/b/c:i	I
    //   1133: iadd
    //   1134: putfield 38	com/admarvel/android/b/c:i	I
    //   1137: goto -242 -> 895
    //   1140: astore 11
    //   1142: new 52	java/lang/StringBuilder
    //   1145: dup
    //   1146: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   1149: ldc 162
    //   1151: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1154: aload 11
    //   1156: invokevirtual 385	org/xml/sax/SAXException:getMessage	()Ljava/lang/String;
    //   1159: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1162: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1165: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1168: iconst_0
    //   1169: putstatic 30	com/admarvel/android/b/c:k	Z
    //   1172: iconst_0
    //   1173: putstatic 32	com/admarvel/android/b/c:l	Z
    //   1176: aload_0
    //   1177: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   1180: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1183: checkcast 57	android/app/Activity
    //   1186: ldc 72
    //   1188: iconst_0
    //   1189: invokevirtual 76	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1192: invokeinterface 90 1 0
    //   1197: astore 12
    //   1199: aload 12
    //   1201: ldc 137
    //   1203: iconst_0
    //   1204: invokeinterface 214 3 0
    //   1209: pop
    //   1210: aload 12
    //   1212: invokeinterface 131 1 0
    //   1217: pop
    //   1218: return
    //   1219: aconst_null
    //   1220: astore 50
    //   1222: goto -679 -> 543
    //   1225: astore 60
    //   1227: ldc_w 387
    //   1230: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1233: iconst_0
    //   1234: putstatic 30	com/admarvel/android/b/c:k	Z
    //   1237: iconst_0
    //   1238: putstatic 32	com/admarvel/android/b/c:l	Z
    //   1241: aload 31
    //   1243: ldc 137
    //   1245: iconst_1
    //   1246: invokeinterface 214 3 0
    //   1251: pop
    //   1252: aload 31
    //   1254: invokeinterface 131 1 0
    //   1259: pop
    //   1260: aload_0
    //   1261: aload 31
    //   1263: ldc 133
    //   1265: invokespecial 182	com/admarvel/android/b/c:a	(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)V
    //   1268: iconst_0
    //   1269: putstatic 30	com/admarvel/android/b/c:k	Z
    //   1272: iconst_0
    //   1273: putstatic 32	com/admarvel/android/b/c:l	Z
    //   1276: aload_0
    //   1277: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   1280: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1283: checkcast 57	android/app/Activity
    //   1286: ldc 72
    //   1288: iconst_0
    //   1289: invokevirtual 76	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1292: invokeinterface 90 1 0
    //   1297: astore 63
    //   1299: aload 63
    //   1301: ldc 137
    //   1303: iconst_0
    //   1304: invokeinterface 214 3 0
    //   1309: pop
    //   1310: aload 63
    //   1312: invokeinterface 131 1 0
    //   1317: pop
    //   1318: return
    //   1319: astore 66
    //   1321: ldc_w 389
    //   1324: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1327: iconst_0
    //   1328: putstatic 30	com/admarvel/android/b/c:k	Z
    //   1331: iconst_0
    //   1332: putstatic 32	com/admarvel/android/b/c:l	Z
    //   1335: aload 31
    //   1337: ldc 137
    //   1339: iconst_1
    //   1340: invokeinterface 214 3 0
    //   1345: pop
    //   1346: aload 31
    //   1348: invokeinterface 131 1 0
    //   1353: pop
    //   1354: goto -530 -> 824
    //   1357: astore 7
    //   1359: new 52	java/lang/StringBuilder
    //   1362: dup
    //   1363: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   1366: ldc 162
    //   1368: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1371: aload 7
    //   1373: invokevirtual 390	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1376: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1379: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1382: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1385: iconst_0
    //   1386: putstatic 30	com/admarvel/android/b/c:k	Z
    //   1389: iconst_0
    //   1390: putstatic 32	com/admarvel/android/b/c:l	Z
    //   1393: aload_0
    //   1394: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   1397: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1400: checkcast 57	android/app/Activity
    //   1403: ldc 72
    //   1405: iconst_0
    //   1406: invokevirtual 76	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1409: invokeinterface 90 1 0
    //   1414: astore 8
    //   1416: aload 8
    //   1418: ldc 137
    //   1420: iconst_0
    //   1421: invokeinterface 214 3 0
    //   1426: pop
    //   1427: aload 8
    //   1429: invokeinterface 131 1 0
    //   1434: pop
    //   1435: return
    //   1436: aload 69
    //   1438: invokevirtual 392	com/admarvel/android/b/b:b	()V
    //   1441: aload_0
    //   1442: getfield 63	com/admarvel/android/b/c:d	Ljava/io/File;
    //   1445: aload 72
    //   1447: ldc_w 394
    //   1450: invokestatic 397	com/admarvel/android/b/a:a	(Ljava/io/File;Ljava/lang/Object;Ljava/lang/String;)V
    //   1453: new 399	com/admarvel/android/b/a/b
    //   1456: dup
    //   1457: invokespecial 400	com/admarvel/android/b/a/b:<init>	()V
    //   1460: astore 80
    //   1462: aload 80
    //   1464: aload 71
    //   1466: invokevirtual 403	com/admarvel/android/b/a/b:a	(Ljava/util/ArrayList;)V
    //   1469: aload 27
    //   1471: ldc_w 405
    //   1474: ldc 80
    //   1476: invokeinterface 86 3 0
    //   1481: ldc 80
    //   1483: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1486: ifeq +197 -> 1683
    //   1489: aload 31
    //   1491: ldc_w 405
    //   1494: ldc_w 405
    //   1497: invokeinterface 96 3 0
    //   1502: pop
    //   1503: aload_0
    //   1504: getfield 63	com/admarvel/android/b/c:d	Ljava/io/File;
    //   1507: aload 80
    //   1509: ldc_w 405
    //   1512: invokestatic 397	com/admarvel/android/b/a:a	(Ljava/io/File;Ljava/lang/Object;Ljava/lang/String;)V
    //   1515: aload 31
    //   1517: invokeinterface 131 1 0
    //   1522: ifne +273 -> 1795
    //   1525: new 50	java/lang/Exception
    //   1528: dup
    //   1529: ldc_w 407
    //   1532: invokespecial 194	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   1535: athrow
    //   1536: astore_3
    //   1537: iconst_0
    //   1538: putstatic 30	com/admarvel/android/b/c:k	Z
    //   1541: iconst_0
    //   1542: putstatic 32	com/admarvel/android/b/c:l	Z
    //   1545: aload_0
    //   1546: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   1549: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1552: checkcast 57	android/app/Activity
    //   1555: ldc 72
    //   1557: iconst_0
    //   1558: invokevirtual 76	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1561: invokeinterface 90 1 0
    //   1566: astore 4
    //   1568: aload 4
    //   1570: ldc 137
    //   1572: iconst_0
    //   1573: invokeinterface 214 3 0
    //   1578: pop
    //   1579: aload 4
    //   1581: invokeinterface 131 1 0
    //   1586: pop
    //   1587: aload_3
    //   1588: athrow
    //   1589: astore 74
    //   1591: ldc_w 409
    //   1594: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1597: iconst_0
    //   1598: putstatic 30	com/admarvel/android/b/c:k	Z
    //   1601: iconst_0
    //   1602: putstatic 32	com/admarvel/android/b/c:l	Z
    //   1605: aload_0
    //   1606: aload 31
    //   1608: ldc 133
    //   1610: invokespecial 182	com/admarvel/android/b/c:a	(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)V
    //   1613: aload 31
    //   1615: ldc 137
    //   1617: iconst_1
    //   1618: invokeinterface 214 3 0
    //   1623: pop
    //   1624: aload 31
    //   1626: invokeinterface 131 1 0
    //   1631: pop
    //   1632: iconst_0
    //   1633: putstatic 30	com/admarvel/android/b/c:k	Z
    //   1636: iconst_0
    //   1637: putstatic 32	com/admarvel/android/b/c:l	Z
    //   1640: aload_0
    //   1641: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   1644: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1647: checkcast 57	android/app/Activity
    //   1650: ldc 72
    //   1652: iconst_0
    //   1653: invokevirtual 76	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1656: invokeinterface 90 1 0
    //   1661: astore 77
    //   1663: aload 77
    //   1665: ldc 137
    //   1667: iconst_0
    //   1668: invokeinterface 214 3 0
    //   1673: pop
    //   1674: aload 77
    //   1676: invokeinterface 131 1 0
    //   1681: pop
    //   1682: return
    //   1683: ldc_w 405
    //   1686: ldc_w 411
    //   1689: aload_0
    //   1690: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   1693: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1696: checkcast 300	android/content/Context
    //   1699: invokestatic 414	com/admarvel/android/b/a:a	(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/Object;
    //   1702: checkcast 399	com/admarvel/android/b/a/b
    //   1705: astore 81
    //   1707: aload 81
    //   1709: ifnull +86 -> 1795
    //   1712: aload 81
    //   1714: invokevirtual 415	com/admarvel/android/b/a/b:a	()Ljava/util/ArrayList;
    //   1717: aload 80
    //   1719: invokevirtual 415	com/admarvel/android/b/a/b:a	()Ljava/util/ArrayList;
    //   1722: invokevirtual 419	java/util/ArrayList:removeAll	(Ljava/util/Collection;)Z
    //   1725: pop
    //   1726: ldc_w 421
    //   1729: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1732: aload 81
    //   1734: invokevirtual 415	com/admarvel/android/b/a/b:a	()Ljava/util/ArrayList;
    //   1737: invokevirtual 422	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   1740: astore 83
    //   1742: aload 83
    //   1744: invokeinterface 253 1 0
    //   1749: ifeq +46 -> 1795
    //   1752: aload 83
    //   1754: invokeinterface 256 1 0
    //   1759: checkcast 98	java/lang/String
    //   1762: astore 84
    //   1764: new 65	java/io/File
    //   1767: dup
    //   1768: aload_0
    //   1769: getfield 70	com/admarvel/android/b/c:e	Ljava/io/File;
    //   1772: aload 84
    //   1774: invokespecial 68	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   1777: astore 85
    //   1779: aload 85
    //   1781: invokevirtual 106	java/io/File:isDirectory	()Z
    //   1784: ifeq -42 -> 1742
    //   1787: aload 85
    //   1789: invokestatic 119	com/admarvel/android/b/d:a	(Ljava/io/File;)V
    //   1792: goto -50 -> 1742
    //   1795: aload_0
    //   1796: getfield 63	com/admarvel/android/b/c:d	Ljava/io/File;
    //   1799: aload 80
    //   1801: ldc_w 405
    //   1804: invokestatic 397	com/admarvel/android/b/a:a	(Ljava/io/File;Ljava/lang/Object;Ljava/lang/String;)V
    //   1807: aload 70
    //   1809: ifnull +446 -> 2255
    //   1812: aload_0
    //   1813: getfield 38	com/admarvel/android/b/c:i	I
    //   1816: aload 70
    //   1818: invokeinterface 423 1 0
    //   1823: if_icmpne +432 -> 2255
    //   1826: aload_0
    //   1827: invokespecial 425	com/admarvel/android/b/c:d	()V
    //   1830: goto +425 -> 2255
    //   1833: aload 52
    //   1835: ifnull +152 -> 1987
    //   1838: aload_0
    //   1839: getfield 38	com/admarvel/android/b/c:i	I
    //   1842: aload 52
    //   1844: invokeinterface 423 1 0
    //   1849: if_icmpne +138 -> 1987
    //   1852: ldc2_w 426
    //   1855: invokestatic 283	java/lang/System:nanoTime	()J
    //   1858: lload 48
    //   1860: lsub
    //   1861: l2d
    //   1862: dmul
    //   1863: dstore 53
    //   1865: new 52	java/lang/StringBuilder
    //   1868: dup
    //   1869: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   1872: ldc_w 429
    //   1875: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1878: dload 53
    //   1880: invokevirtual 432	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   1883: ldc_w 434
    //   1886: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1889: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1892: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1895: new 52	java/lang/StringBuilder
    //   1898: dup
    //   1899: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   1902: ldc 162
    //   1904: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1907: aload_0
    //   1908: getfield 38	com/admarvel/android/b/c:i	I
    //   1911: invokevirtual 437	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1914: ldc_w 439
    //   1917: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1920: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1923: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1926: aload_0
    //   1927: aload 31
    //   1929: aload_0
    //   1930: getfield 291	com/admarvel/android/b/c:h	Ljava/lang/String;
    //   1933: invokespecial 182	com/admarvel/android/b/c:a	(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)V
    //   1936: iconst_0
    //   1937: putstatic 30	com/admarvel/android/b/c:k	Z
    //   1940: iconst_0
    //   1941: putstatic 32	com/admarvel/android/b/c:l	Z
    //   1944: aload_0
    //   1945: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   1948: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1951: checkcast 57	android/app/Activity
    //   1954: ldc 72
    //   1956: iconst_0
    //   1957: invokevirtual 76	android/app/Activity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1960: invokeinterface 90 1 0
    //   1965: astore 36
    //   1967: aload 36
    //   1969: ldc 137
    //   1971: iconst_0
    //   1972: invokeinterface 214 3 0
    //   1977: pop
    //   1978: aload 36
    //   1980: invokeinterface 131 1 0
    //   1985: pop
    //   1986: return
    //   1987: ldc_w 441
    //   1990: invokestatic 114	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1993: goto -57 -> 1936
    //   1996: aload 27
    //   1998: ldc 124
    //   2000: ldc 80
    //   2002: invokeinterface 86 3 0
    //   2007: astore 39
    //   2009: new 52	java/lang/StringBuilder
    //   2012: dup
    //   2013: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   2016: aload 39
    //   2018: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2021: ldc_w 357
    //   2024: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2027: aload_0
    //   2028: getfield 47	com/admarvel/android/b/c:c	Ljava/lang/String;
    //   2031: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2034: ldc_w 443
    //   2037: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2040: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2043: astore 40
    //   2045: aload 27
    //   2047: ldc 124
    //   2049: ldc 80
    //   2051: invokeinterface 86 3 0
    //   2056: astore 41
    //   2058: new 52	java/lang/StringBuilder
    //   2061: dup
    //   2062: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   2065: aload 41
    //   2067: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2070: ldc_w 357
    //   2073: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2076: aload_0
    //   2077: getfield 47	com/admarvel/android/b/c:c	Ljava/lang/String;
    //   2080: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2083: ldc_w 445
    //   2086: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2089: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2092: astore 42
    //   2094: new 65	java/io/File
    //   2097: dup
    //   2098: aload 40
    //   2100: invokespecial 358	java/io/File:<init>	(Ljava/lang/String;)V
    //   2103: astore 43
    //   2105: new 65	java/io/File
    //   2108: dup
    //   2109: aload 42
    //   2111: invokespecial 358	java/io/File:<init>	(Ljava/lang/String;)V
    //   2114: astore 44
    //   2116: aload 43
    //   2118: invokevirtual 448	java/io/File:exists	()Z
    //   2121: ifeq +11 -> 2132
    //   2124: aload 44
    //   2126: invokevirtual 448	java/io/File:exists	()Z
    //   2129: ifne +65 -> 2194
    //   2132: aload 27
    //   2134: ldc_w 293
    //   2137: ldc 80
    //   2139: invokeinterface 86 3 0
    //   2144: astore 45
    //   2146: aload 45
    //   2148: ldc 80
    //   2150: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2153: ifne +41 -> 2194
    //   2156: new 295	com/admarvel/android/b/c$b
    //   2159: dup
    //   2160: aload_0
    //   2161: new 297	java/net/URL
    //   2164: dup
    //   2165: aload 45
    //   2167: invokespecial 298	java/net/URL:<init>	(Ljava/lang/String;)V
    //   2170: aload_0
    //   2171: getfield 70	com/admarvel/android/b/c:e	Ljava/io/File;
    //   2174: invokevirtual 128	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   2177: iconst_0
    //   2178: aload_0
    //   2179: getfield 45	com/admarvel/android/b/c:b	Ljava/lang/ref/WeakReference;
    //   2182: invokevirtual 210	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   2185: checkcast 300	android/content/Context
    //   2188: invokespecial 303	com/admarvel/android/b/c$b:<init>	(Lcom/admarvel/android/b/c;Ljava/net/URL;Ljava/lang/String;ZLandroid/content/Context;)V
    //   2191: invokevirtual 306	com/admarvel/android/b/c$b:run	()V
    //   2194: aload 27
    //   2196: ldc_w 450
    //   2199: iconst_m1
    //   2200: invokeinterface 454 3 0
    //   2205: istore 46
    //   2207: aload 31
    //   2209: invokeinterface 131 1 0
    //   2214: pop
    //   2215: iload 46
    //   2217: iconst_m1
    //   2218: if_icmpeq +7 -> 2225
    //   2221: aload_0
    //   2222: invokespecial 456	com/admarvel/android/b/c:c	()V
    //   2225: aload_0
    //   2226: ldc_w 458
    //   2229: putfield 273	com/admarvel/android/b/c:g	Ljava/lang/String;
    //   2232: aload_0
    //   2233: invokevirtual 460	com/admarvel/android/b/c:a	()V
    //   2236: aload_0
    //   2237: aload 31
    //   2239: aload_0
    //   2240: getfield 291	com/admarvel/android/b/c:h	Ljava/lang/String;
    //   2243: invokespecial 182	com/admarvel/android/b/c:a	(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)V
    //   2246: goto -310 -> 1936
    //   2249: aconst_null
    //   2250: astore 52
    //   2252: goto -419 -> 1833
    //   2255: aload 70
    //   2257: astore 52
    //   2259: goto -426 -> 1833
    //
    // Exception table:
    //   from	to	target	type
    //   59	86	374	javax/xml/parsers/ParserConfigurationException
    //   142	201	374	javax/xml/parsers/ParserConfigurationException
    //   206	219	374	javax/xml/parsers/ParserConfigurationException
    //   270	310	374	javax/xml/parsers/ParserConfigurationException
    //   310	371	374	javax/xml/parsers/ParserConfigurationException
    //   453	461	374	javax/xml/parsers/ParserConfigurationException
    //   466	543	374	javax/xml/parsers/ParserConfigurationException
    //   543	562	374	javax/xml/parsers/ParserConfigurationException
    //   567	600	374	javax/xml/parsers/ParserConfigurationException
    //   605	668	374	javax/xml/parsers/ParserConfigurationException
    //   668	767	374	javax/xml/parsers/ParserConfigurationException
    //   772	786	374	javax/xml/parsers/ParserConfigurationException
    //   786	802	374	javax/xml/parsers/ParserConfigurationException
    //   802	824	374	javax/xml/parsers/ParserConfigurationException
    //   824	881	374	javax/xml/parsers/ParserConfigurationException
    //   886	895	374	javax/xml/parsers/ParserConfigurationException
    //   895	1030	374	javax/xml/parsers/ParserConfigurationException
    //   1030	1137	374	javax/xml/parsers/ParserConfigurationException
    //   1227	1268	374	javax/xml/parsers/ParserConfigurationException
    //   1321	1354	374	javax/xml/parsers/ParserConfigurationException
    //   1436	1441	374	javax/xml/parsers/ParserConfigurationException
    //   1441	1453	374	javax/xml/parsers/ParserConfigurationException
    //   1453	1536	374	javax/xml/parsers/ParserConfigurationException
    //   1591	1632	374	javax/xml/parsers/ParserConfigurationException
    //   1683	1707	374	javax/xml/parsers/ParserConfigurationException
    //   1712	1742	374	javax/xml/parsers/ParserConfigurationException
    //   1742	1792	374	javax/xml/parsers/ParserConfigurationException
    //   1795	1807	374	javax/xml/parsers/ParserConfigurationException
    //   1812	1830	374	javax/xml/parsers/ParserConfigurationException
    //   1838	1936	374	javax/xml/parsers/ParserConfigurationException
    //   1987	1993	374	javax/xml/parsers/ParserConfigurationException
    //   1996	2132	374	javax/xml/parsers/ParserConfigurationException
    //   2132	2194	374	javax/xml/parsers/ParserConfigurationException
    //   2194	2215	374	javax/xml/parsers/ParserConfigurationException
    //   2221	2225	374	javax/xml/parsers/ParserConfigurationException
    //   2225	2246	374	javax/xml/parsers/ParserConfigurationException
    //   59	86	1140	org/xml/sax/SAXException
    //   142	201	1140	org/xml/sax/SAXException
    //   206	219	1140	org/xml/sax/SAXException
    //   270	310	1140	org/xml/sax/SAXException
    //   310	371	1140	org/xml/sax/SAXException
    //   453	461	1140	org/xml/sax/SAXException
    //   466	543	1140	org/xml/sax/SAXException
    //   543	562	1140	org/xml/sax/SAXException
    //   567	600	1140	org/xml/sax/SAXException
    //   605	668	1140	org/xml/sax/SAXException
    //   668	767	1140	org/xml/sax/SAXException
    //   772	786	1140	org/xml/sax/SAXException
    //   786	802	1140	org/xml/sax/SAXException
    //   802	824	1140	org/xml/sax/SAXException
    //   824	881	1140	org/xml/sax/SAXException
    //   886	895	1140	org/xml/sax/SAXException
    //   895	1030	1140	org/xml/sax/SAXException
    //   1030	1137	1140	org/xml/sax/SAXException
    //   1227	1268	1140	org/xml/sax/SAXException
    //   1321	1354	1140	org/xml/sax/SAXException
    //   1436	1441	1140	org/xml/sax/SAXException
    //   1441	1453	1140	org/xml/sax/SAXException
    //   1453	1536	1140	org/xml/sax/SAXException
    //   1591	1632	1140	org/xml/sax/SAXException
    //   1683	1707	1140	org/xml/sax/SAXException
    //   1712	1742	1140	org/xml/sax/SAXException
    //   1742	1792	1140	org/xml/sax/SAXException
    //   1795	1807	1140	org/xml/sax/SAXException
    //   1812	1830	1140	org/xml/sax/SAXException
    //   1838	1936	1140	org/xml/sax/SAXException
    //   1987	1993	1140	org/xml/sax/SAXException
    //   1996	2132	1140	org/xml/sax/SAXException
    //   2132	2194	1140	org/xml/sax/SAXException
    //   2194	2215	1140	org/xml/sax/SAXException
    //   2221	2225	1140	org/xml/sax/SAXException
    //   2225	2246	1140	org/xml/sax/SAXException
    //   786	802	1225	java/lang/Exception
    //   802	824	1319	java/lang/Exception
    //   59	86	1357	java/io/IOException
    //   142	201	1357	java/io/IOException
    //   206	219	1357	java/io/IOException
    //   270	310	1357	java/io/IOException
    //   310	371	1357	java/io/IOException
    //   453	461	1357	java/io/IOException
    //   466	543	1357	java/io/IOException
    //   543	562	1357	java/io/IOException
    //   567	600	1357	java/io/IOException
    //   605	668	1357	java/io/IOException
    //   668	767	1357	java/io/IOException
    //   772	786	1357	java/io/IOException
    //   786	802	1357	java/io/IOException
    //   802	824	1357	java/io/IOException
    //   824	881	1357	java/io/IOException
    //   886	895	1357	java/io/IOException
    //   895	1030	1357	java/io/IOException
    //   1030	1137	1357	java/io/IOException
    //   1227	1268	1357	java/io/IOException
    //   1321	1354	1357	java/io/IOException
    //   1436	1441	1357	java/io/IOException
    //   1441	1453	1357	java/io/IOException
    //   1453	1536	1357	java/io/IOException
    //   1591	1632	1357	java/io/IOException
    //   1683	1707	1357	java/io/IOException
    //   1712	1742	1357	java/io/IOException
    //   1742	1792	1357	java/io/IOException
    //   1795	1807	1357	java/io/IOException
    //   1812	1830	1357	java/io/IOException
    //   1838	1936	1357	java/io/IOException
    //   1987	1993	1357	java/io/IOException
    //   1996	2132	1357	java/io/IOException
    //   2132	2194	1357	java/io/IOException
    //   2194	2215	1357	java/io/IOException
    //   2221	2225	1357	java/io/IOException
    //   2225	2246	1357	java/io/IOException
    //   59	86	1536	finally
    //   142	201	1536	finally
    //   206	219	1536	finally
    //   270	310	1536	finally
    //   310	371	1536	finally
    //   376	402	1536	finally
    //   453	461	1536	finally
    //   466	543	1536	finally
    //   543	562	1536	finally
    //   567	600	1536	finally
    //   605	668	1536	finally
    //   668	767	1536	finally
    //   772	786	1536	finally
    //   786	802	1536	finally
    //   802	824	1536	finally
    //   824	881	1536	finally
    //   886	895	1536	finally
    //   895	1030	1536	finally
    //   1030	1137	1536	finally
    //   1142	1168	1536	finally
    //   1227	1268	1536	finally
    //   1321	1354	1536	finally
    //   1359	1385	1536	finally
    //   1436	1441	1536	finally
    //   1441	1453	1536	finally
    //   1453	1536	1536	finally
    //   1591	1632	1536	finally
    //   1683	1707	1536	finally
    //   1712	1742	1536	finally
    //   1742	1792	1536	finally
    //   1795	1807	1536	finally
    //   1812	1830	1536	finally
    //   1838	1936	1536	finally
    //   1987	1993	1536	finally
    //   1996	2132	1536	finally
    //   2132	2194	1536	finally
    //   2194	2215	1536	finally
    //   2221	2225	1536	finally
    //   2225	2246	1536	finally
    //   1441	1453	1589	java/lang/Exception
  }

  private Void b()
  {
    int m = 8192;
    int n = 0;
    Logging.log("Offline SDK:checkforUpdate called");
    Activity localActivity;
    String str1;
    if (!l)
    {
      Logging.log("Offline SDK:isUpdateProcessStarted");
      l = true;
      File localFile = new File(Environment.getExternalStorageDirectory() + "/.admfiles");
      if (localFile.exists())
        d.a(localFile);
      if (this.b == null)
        break label159;
      localActivity = (Activity)this.b.get();
      this.a = localActivity;
      Logging.log("Offline SDK:check for update for offline package");
      if ((this.c != null) && (this.a != null) && (AdMarvelUtils.isNetworkAvailable(this.a)))
      {
        new a().a(this.a);
        str1 = a(this.a, this.c);
        if (str1 != null)
          break label165;
      }
    }
    label159: label165: label604: 
    while (true)
    {
      return null;
      localActivity = null;
      break;
      Logging.log("Offline SDK:checkforUpdate PostString :- " + str1);
      InputStream localInputStream;
      ArrayList localArrayList;
      int i2;
      try
      {
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL("http://ads.admarvel.com/fam/getOfflineAndroidPackage.php").openConnection();
        localHttpURLConnection.setRequestMethod("POST");
        localHttpURLConnection.setDoOutput(true);
        localHttpURLConnection.setDoInput(true);
        localHttpURLConnection.setUseCaches(false);
        localHttpURLConnection.setRequestProperty("User-Agent", new AdMarvelUtils(this.a).getUserAgent());
        localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        localHttpURLConnection.setRequestProperty("Content-Length", Integer.toString(str1.length()));
        localHttpURLConnection.setConnectTimeout(2000);
        localHttpURLConnection.setReadTimeout(10000);
        localHttpURLConnection.getOutputStream().write(str1.getBytes());
        int i1 = localHttpURLConnection.getResponseCode();
        localHttpURLConnection.getContentLength();
        if (i1 == 200)
        {
          localInputStream = (InputStream)localHttpURLConnection.getContent();
          localArrayList = new ArrayList();
          i2 = 0;
          while (m != -1)
          {
            byte[] arrayOfByte1 = new byte[8192];
            m = localInputStream.read(arrayOfByte1, 0, 8192);
            if (m > 0)
            {
              c.a locala1 = new c.a(null);
              locala1.a = arrayOfByte1;
              locala1.b = m;
              i2 += m;
              localArrayList.add(locala1);
            }
          }
        }
      }
      catch (Exception localException1)
      {
        Logging.log("Offline SDK:" + localException1.getMessage() + "Exception in checking for Update");
      }
      byte[] arrayOfByte2;
      for (String str2 = ""; ; str2 = new String(arrayOfByte2))
      {
        if (str2.length() <= 0)
          break label604;
        try
        {
          a(str2);
          return null;
        }
        catch (Exception localException2)
        {
          Logging.log("Offline SDK:" + localException2.getMessage() + "Exception in calling creating subdirectories method ");
          return null;
        }
        localInputStream.close();
        if (i2 <= 0)
          break;
        arrayOfByte2 = new byte[i2];
        int i3 = 0;
        while (n < localArrayList.size())
        {
          c.a locala2 = (c.a)localArrayList.get(n);
          System.arraycopy(locala2.a, 0, arrayOfByte2, i3, locala2.b);
          i3 += locala2.b;
          n++;
        }
      }
    }
  }

  private void c()
  {
    long l1 = System.nanoTime();
    Logging.log("Offline SDK:Admarvel Offline SDK download started");
    if (this.b.get() == null);
    SharedPreferences localSharedPreferences;
    do
    {
      return;
      localSharedPreferences = ((Activity)this.b.get()).getSharedPreferences("admarvel_preferences", 0);
    }
    while (localSharedPreferences == null);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    String str1 = this.e.getAbsolutePath() + "/" + this.c + "_banners.csv";
    this.i = localSharedPreferences.getInt("completed_banners_count", -1);
    b localb2;
    ArrayList localArrayList1;
    label207: ArrayList localArrayList2;
    HashMap localHashMap;
    try
    {
      b localb1 = new b(new InputStreamReader(new FileInputStream(str1)));
      localb2 = localb1;
      if (localb2 == null)
      {
        localArrayList1 = null;
        if ((localArrayList1 == null) || (this.i != localArrayList1.size()))
          break label207;
        localEditor.putInt("completed_banners_count", -1);
        localEditor.commit();
        d();
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
      {
        localFileNotFoundException.printStackTrace();
        localb2 = null;
        continue;
        localArrayList1 = localb2.c();
      }
      localArrayList2 = new ArrayList();
      localHashMap = new HashMap();
      if (localArrayList1 == null)
        break label658;
    }
    int m = localArrayList1.size();
    this.i = localSharedPreferences.getInt("completed_banners_count", -1);
    int n = this.i;
    while (true)
      if (n < m)
      {
        String[] arrayOfString = (String[])localArrayList1.get(n);
        String str3;
        if (!isCancelled())
        {
          str3 = arrayOfString[0] + "_" + arrayOfString[1];
          localArrayList2.add(str3);
          localHashMap.put(arrayOfString[0], str3);
          File localFile2 = new File(this.e.getAbsolutePath() + "/" + str3);
          if (!localFile2.isDirectory())
            localFile2.mkdirs();
        }
        try
        {
          c.b localb5 = new c.b(this, new URL(URLDecoder.decode(arrayOfString[2], "UTF-8")), this.e.getAbsolutePath() + "/" + str3, (Context)this.b.get());
          localb6 = localb5;
          if (localb6 != null)
          {
            localb6.run();
            this.i = (1 + this.i);
          }
          if (this.i == m)
            d();
          n++;
        }
        catch (MalformedURLException localMalformedURLException)
        {
          while (true)
          {
            Logging.log("Offline SDK:" + localMalformedURLException.getMessage());
            localb6 = null;
          }
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          while (true)
          {
            Logging.log("Offline SDK:" + localUnsupportedEncodingException.getMessage());
            c.b localb6 = null;
          }
        }
      }
    while (true)
    {
      com.admarvel.android.b.a.b localb3;
      try
      {
        localb2.b();
        a.a(this.d, localHashMap, "/banner_folder_map");
        localb3 = new com.admarvel.android.b.a.b();
        localb3.a(localArrayList2);
        if (localSharedPreferences.getString("/previous_banner_packages", "NULL").equals("NULL"))
        {
          localEditor.putString("/previous_banner_packages", "/previous_banner_packages");
          a.a(this.d, localb3, "/previous_banner_packages");
          a.a(this.d, localb3, "/previous_banner_packages");
          label658: d();
          double d1 = 1.E-09D * (System.nanoTime() - l1);
          Logging.log("Offline SDK:Admarvel Offline SDK download completed at ( " + d1 + "s");
          a(localEditor, this.h);
          return;
        }
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
        continue;
      }
      if (this.b.get() == null)
        break;
      com.admarvel.android.b.a.b localb4 = (com.admarvel.android.b.a.b)a.a("/previous_banner_packages", "BannerFolderName", (Context)this.b.get());
      if (localb4 != null)
      {
        localb4.a().removeAll(localb3.a());
        Iterator localIterator = localb4.a().iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          File localFile1 = new File(this.e, str2);
          if (localFile1.isDirectory())
            d.a(localFile1);
        }
      }
    }
  }

  private void d()
  {
    if (this.b.get() == null);
    SharedPreferences localSharedPreferences;
    do
    {
      return;
      localSharedPreferences = ((Activity)this.b.get()).getSharedPreferences("admarvel_preferences", 0);
    }
    while (localSharedPreferences == null);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    if (this.j == null)
      this.j = ((ArrayList)a.a("/complete_ad_content_path_list", "/complete_ad_content_path_list", (Context)this.b.get()));
    if (this.j == null)
    {
      localEditor.putString("admarvel_current_version", "-1");
      localEditor.commit();
      label101: b();
    }
    while (true)
    {
      File localFile1 = ((Activity)this.b.get()).getDir("Admarvel", 0);
      if (localFile1 == null)
        break;
      File localFile2 = new File(localFile1, "/complete_ad_content_path_list");
      if (!localFile2.exists())
        break;
      localFile2.delete();
      return;
      Iterator localIterator = this.j.iterator();
      if (localIterator.hasNext())
      {
        if (new File((String)localIterator.next()).exists())
          break label101;
        localEditor.putString("admarvel_current_version", "-1");
        localEditor.commit();
        b();
      }
    }
  }

  protected Void a(Void[] paramArrayOfVoid)
  {
    return b();
  }

  public void a()
  {
    HashMap localHashMap1 = (HashMap)a.a("/site_id_banner_map", "/site_id_banner_map", this.a);
    HashMap localHashMap2 = (HashMap)a.a("/ad_link_object", "/ad_link_object", this.a);
    String str = this.e.getAbsolutePath() + "/" + this.c + ".csv";
    if (((str != null) && (localHashMap1 == null)) || (localHashMap2 == null))
      a.b(this.d, str);
  }

  protected void a(Void paramVoid)
  {
    super.onPostExecute(paramVoid);
  }

  protected void onCancelled()
  {
    super.onCancelled();
    String str1 = this.e.getAbsolutePath() + "/" + this.c + "_banners.csv";
    String str2 = this.e.getAbsolutePath() + "/" + this.c + ".csv";
    File localFile1 = new File(str1);
    File localFile2 = new File(str2);
    if (this.b.get() == null);
    SharedPreferences localSharedPreferences;
    do
    {
      return;
      localSharedPreferences = ((Activity)this.b.get()).getSharedPreferences("admarvel_preferences", 0);
    }
    while (localSharedPreferences == null);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    if ((!localFile1.exists()) || (!localFile2.exists()))
      localEditor.putString("admarvel_current_version", "-1");
    localEditor.putInt("completed_banners_count", this.i);
    localEditor.commit();
    a.a(this.d, this.j, "/complete_ad_content_path_list");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.b.c
 * JD-Core Version:    0.6.2
 */