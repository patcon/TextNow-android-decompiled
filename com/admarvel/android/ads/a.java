package com.admarvel.android.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class a
{
  public static String a;
  private static final String b = ac.c();
  private static final Uri c = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
  private JSONObject d;
  private String e = "VALUE_NOT_DEFINED";
  private int f = -2147483648;

  private com.admarvel.android.b.a.a a(HashMap<Integer, com.admarvel.android.b.a.a> paramHashMap)
  {
    while (true)
    {
      try
      {
        new HashMap();
        HashMap localHashMap1 = a(paramHashMap, -1);
        if (localHashMap1.size() > 0)
        {
          if (localHashMap1.size() == 1)
            return (com.admarvel.android.b.a.a)((Map.Entry)localHashMap1.entrySet().iterator().next()).getValue();
          return a(localHashMap1, false);
          if (i <= 10)
          {
            HashMap localHashMap2 = a(paramHashMap, i);
            if (localHashMap2.size() <= 0)
              break label241;
            if (localHashMap2.size() == 1)
              return (com.admarvel.android.b.a.a)((Map.Entry)localHashMap2.entrySet().iterator().next()).getValue();
            return a(localHashMap2, true);
          }
          HashMap localHashMap3 = a(paramHashMap, 0);
          if (localHashMap3.size() > 0)
          {
            if (localHashMap3.size() == 1)
              return (com.admarvel.android.b.a.a)((Map.Entry)localHashMap3.entrySet().iterator().next()).getValue();
            com.admarvel.android.b.a.a locala = a(localHashMap3, false);
            return locala;
          }
          return null;
        }
      }
      catch (Exception localException)
      {
        Logging.log(localException.getMessage() + "Offline SDK:" + "Exception in offline getAdBasedOnWeightAndPriority");
        return null;
      }
      int i = 1;
      continue;
      label241: i++;
    }
  }

  private com.admarvel.android.b.a.a a(HashMap<Integer, com.admarvel.android.b.a.a> paramHashMap, boolean paramBoolean)
  {
    int i = 0;
    if (!paramBoolean);
    while (true)
    {
      try
      {
        int[] arrayOfInt2 = { paramHashMap.size(), 2 };
        int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, arrayOfInt2);
        Iterator localIterator2 = paramHashMap.keySet().iterator();
        int n = 0;
        int i1 = 0;
        if (localIterator2.hasNext())
        {
          Integer localInteger2 = (Integer)localIterator2.next();
          arrayOfInt[n][0] = (i1 + ((com.admarvel.android.b.a.a)paramHashMap.get(localInteger2)).g());
          arrayOfInt[n][1] = ((com.admarvel.android.b.a.a)paramHashMap.get(localInteger2)).f();
          int i5 = arrayOfInt[n][0];
          n++;
          i1 = i5;
          continue;
        }
        int i2 = 1 + arrayOfInt[(-1 + arrayOfInt.length)][0];
        int i3 = (int)(100.0D * Math.random() * i2 % i2);
        int i4 = arrayOfInt.length;
        if (i < i4)
        {
          if (arrayOfInt[i][0] < i3)
            break label470;
          return (com.admarvel.android.b.a.a)paramHashMap.get(Integer.valueOf(arrayOfInt[i][1]));
          int[] arrayOfInt1 = { paramHashMap.size(), 2 };
          float[][] arrayOfFloat = (float[][])Array.newInstance(Float.TYPE, arrayOfInt1);
          Iterator localIterator1 = paramHashMap.keySet().iterator();
          int j = 0;
          float f1 = 0.0F;
          if (localIterator1.hasNext())
          {
            Integer localInteger1 = (Integer)localIterator1.next();
            arrayOfFloat[j][0] = (f1 + ((com.admarvel.android.b.a.a)paramHashMap.get(localInteger1)).c());
            arrayOfFloat[j][1] = ((com.admarvel.android.b.a.a)paramHashMap.get(localInteger1)).f();
            float f4 = arrayOfFloat[j][0];
            j++;
            f1 = f4;
            continue;
          }
          float f2 = 1.0F + arrayOfFloat[(-1 + arrayOfFloat.length)][0];
          if (f2 < 1.0F)
            f2 = 1.0F;
          float f3 = (float)(100.0D * Math.random() * f2 % f2);
          int k = arrayOfFloat.length;
          int m = 0;
          if (m < k)
          {
            if (arrayOfFloat[m][0] >= f3)
            {
              com.admarvel.android.b.a.a locala = (com.admarvel.android.b.a.a)paramHashMap.get(Integer.valueOf((int)arrayOfFloat[m][1]));
              return locala;
            }
            m++;
            continue;
          }
        }
        return null;
      }
      catch (Exception localException)
      {
        Logging.log(localException.getMessage() + "Offline SDK:" + "Exception in offline getAdBasedOnWeight");
        return null;
      }
      label470: i++;
    }
  }

  private String a(Context paramContext)
  {
    String[] arrayOfString = { "aid" };
    Cursor localCursor = paramContext.getContentResolver().query(c, arrayOfString, null, null, null);
    if (localCursor != null);
    try
    {
      boolean bool = localCursor.moveToFirst();
      if (!bool)
      {
        localObject1 = null;
        return localObject1;
      }
      String str = localCursor.getString(localCursor.getColumnIndex("aid"));
      Object localObject1 = str;
      return localObject1;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
  }

  // ERROR //
  private String a(a.a parama, Context paramContext, int paramInt1, String paramString1, Map<String, Object> paramMap, String paramString2, String paramString3, int paramInt2, String paramString4, Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    // Byte code:
    //   0: new 84	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   7: astore 14
    //   9: aload 5
    //   11: ldc 193
    //   13: invokestatic 198	com/admarvel/android/ads/ab:a	(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    //   16: astore 16
    //   18: aload 14
    //   20: ldc 200
    //   22: aload 7
    //   24: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   27: aload 14
    //   29: ldc 205
    //   31: aload 6
    //   33: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   36: aload 14
    //   38: ldc 207
    //   40: sipush 5000
    //   43: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   46: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   49: aload 14
    //   51: ldc 211
    //   53: ldc 213
    //   55: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   58: aload 14
    //   60: ldc 215
    //   62: ldc 217
    //   64: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   67: aload 14
    //   69: ldc 219
    //   71: ldc 221
    //   73: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   76: aload 14
    //   78: ldc 223
    //   80: ldc 225
    //   82: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   85: aload 14
    //   87: ldc 227
    //   89: ldc 229
    //   91: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   94: iload 13
    //   96: ifeq +713 -> 809
    //   99: aload 14
    //   101: ldc 231
    //   103: ldc 233
    //   105: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   108: aload 14
    //   110: ldc 235
    //   112: getstatic 240	android/os/Build:MODEL	Ljava/lang/String;
    //   115: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   118: aload 14
    //   120: ldc 242
    //   122: getstatic 245	android/os/Build:ID	Ljava/lang/String;
    //   125: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload 14
    //   130: ldc 247
    //   132: getstatic 252	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   135: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   138: aload 14
    //   140: ldc 254
    //   142: invokestatic 256	com/admarvel/android/ads/ac:a	()I
    //   145: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   148: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   151: aload 14
    //   153: ldc_w 258
    //   156: iload 8
    //   158: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   161: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   164: aload 14
    //   166: ldc_w 260
    //   169: aload 9
    //   171: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   174: iload_3
    //   175: iconst_2
    //   176: if_icmpne +658 -> 834
    //   179: aload 14
    //   181: ldc_w 262
    //   184: ldc_w 264
    //   187: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   190: aload 14
    //   192: ldc_w 266
    //   195: aload 4
    //   197: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   200: aload_2
    //   201: invokestatic 269	com/admarvel/android/ads/ab:g	(Landroid/content/Context;)I
    //   204: istore 17
    //   206: iload 17
    //   208: ifle +29 -> 237
    //   211: aload 14
    //   213: ldc_w 271
    //   216: iload 17
    //   218: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   221: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   224: aload 14
    //   226: ldc_w 273
    //   229: iload 17
    //   231: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   234: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   237: aload_2
    //   238: invokestatic 276	com/admarvel/android/ads/ab:h	(Landroid/content/Context;)I
    //   241: istore 18
    //   243: iload 18
    //   245: ifle +29 -> 274
    //   248: aload 14
    //   250: ldc_w 278
    //   253: iload 18
    //   255: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   258: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   261: aload 14
    //   263: ldc_w 280
    //   266: iload 18
    //   268: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   271: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   274: aload 14
    //   276: ldc_w 282
    //   279: new 84	java/lang/StringBuilder
    //   282: dup
    //   283: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   286: ldc 233
    //   288: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: aload_2
    //   292: invokestatic 286	com/admarvel/android/ads/ab:i	(Landroid/content/Context;)F
    //   295: invokevirtual 289	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   298: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   301: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   304: aload 14
    //   306: ldc_w 291
    //   309: ldc_w 293
    //   312: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   315: aload_1
    //   316: getstatic 298	com/admarvel/android/ads/a$a:a	Lcom/admarvel/android/ads/a$a;
    //   319: invokevirtual 302	com/admarvel/android/ads/a$a:equals	(Ljava/lang/Object;)Z
    //   322: ifeq +526 -> 848
    //   325: aload 14
    //   327: ldc_w 304
    //   330: ldc_w 306
    //   333: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   336: iload_3
    //   337: iconst_2
    //   338: if_icmpne +534 -> 872
    //   341: iload 18
    //   343: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   346: astore 19
    //   348: iload_3
    //   349: iconst_2
    //   350: if_icmpne +532 -> 882
    //   353: iload 17
    //   355: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   358: astore 20
    //   360: new 195	com/admarvel/android/ads/ab
    //   363: dup
    //   364: aload_2
    //   365: aload 10
    //   367: invokespecial 309	com/admarvel/android/ads/ab:<init>	(Landroid/content/Context;Landroid/os/Handler;)V
    //   370: astore 21
    //   372: aload 14
    //   374: ldc_w 311
    //   377: new 84	java/lang/StringBuilder
    //   380: dup
    //   381: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   384: ldc_w 313
    //   387: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: getstatic 316	android/os/Build:BRAND	Ljava/lang/String;
    //   393: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: ldc_w 318
    //   399: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: getstatic 240	android/os/Build:MODEL	Ljava/lang/String;
    //   405: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: ldc_w 320
    //   411: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   414: aload 19
    //   416: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: ldc_w 322
    //   422: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: aload 20
    //   427: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: ldc_w 324
    //   433: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: getstatic 252	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   439: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: ldc_w 326
    //   445: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: aload 21
    //   450: invokevirtual 328	com/admarvel/android/ads/ab:a	()Ljava/lang/String;
    //   453: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   459: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   462: aload_2
    //   463: ifnull +504 -> 967
    //   466: aload_2
    //   467: invokevirtual 331	android/content/Context:getPackageName	()Ljava/lang/String;
    //   470: astore 22
    //   472: aload 22
    //   474: ifnull +21 -> 495
    //   477: aload 22
    //   479: invokevirtual 334	java/lang/String:length	()I
    //   482: ifle +13 -> 495
    //   485: aload 14
    //   487: ldc_w 336
    //   490: aload 22
    //   492: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   495: aload_2
    //   496: instanceof 338
    //   499: ifeq +145 -> 644
    //   502: aload_2
    //   503: checkcast 338	android/app/Activity
    //   506: astore 26
    //   508: aload 26
    //   510: ifnull +134 -> 644
    //   513: aload 26
    //   515: invokevirtual 342	android/app/Activity:getWindow	()Landroid/view/Window;
    //   518: ldc_w 343
    //   521: invokevirtual 349	android/view/Window:findViewById	(I)Landroid/view/View;
    //   524: checkcast 351	android/view/ViewGroup
    //   527: astore 27
    //   529: iconst_0
    //   530: invokestatic 356	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   533: astore 28
    //   535: invokestatic 256	com/admarvel/android/ads/ac:a	()I
    //   538: bipush 11
    //   540: if_icmplt +91 -> 631
    //   543: aload_1
    //   544: getstatic 298	com/admarvel/android/ads/a$a:a	Lcom/admarvel/android/ads/a$a;
    //   547: invokevirtual 302	com/admarvel/android/ads/a$a:equals	(Ljava/lang/Object;)Z
    //   550: istore 29
    //   552: iload 29
    //   554: ifeq +349 -> 903
    //   557: ldc_w 351
    //   560: ldc_w 358
    //   563: iconst_0
    //   564: anewarray 360	java/lang/Class
    //   567: invokevirtual 364	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   570: aload 27
    //   572: aconst_null
    //   573: invokevirtual 370	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   576: astore 31
    //   578: aload 31
    //   580: ifnull +380 -> 960
    //   583: aload 31
    //   585: instanceof 353
    //   588: ifeq +372 -> 960
    //   591: aload 31
    //   593: checkcast 353	java/lang/Boolean
    //   596: astore 32
    //   598: aload 32
    //   600: invokevirtual 373	java/lang/Boolean:booleanValue	()Z
    //   603: ifeq +24 -> 627
    //   606: iload 11
    //   608: ifeq +19 -> 627
    //   611: invokestatic 375	com/admarvel/android/ads/ab:c	()Z
    //   614: ifeq +13 -> 627
    //   617: iconst_0
    //   618: invokestatic 356	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   621: astore 34
    //   623: aload 34
    //   625: astore 32
    //   627: aload 32
    //   629: astore 28
    //   631: aload 14
    //   633: ldc_w 377
    //   636: aload 28
    //   638: invokevirtual 378	java/lang/Boolean:toString	()Ljava/lang/String;
    //   641: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   644: aload 5
    //   646: ldc_w 380
    //   649: invokeinterface 383 2 0
    //   654: checkcast 160	java/lang/String
    //   657: astore 23
    //   659: aload 23
    //   661: ifnull +21 -> 682
    //   664: aload 23
    //   666: invokevirtual 334	java/lang/String:length	()I
    //   669: ifle +13 -> 682
    //   672: aload 14
    //   674: ldc_w 385
    //   677: aload 23
    //   679: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   682: aload_2
    //   683: invokestatic 391	com/admarvel/android/ads/AdMarvelUtils:isTabletDevice	(Landroid/content/Context;)Z
    //   686: ifne +236 -> 922
    //   689: aload 14
    //   691: ldc_w 393
    //   694: ldc_w 395
    //   697: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   700: aload 14
    //   702: ldc_w 397
    //   705: ldc_w 399
    //   708: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   711: aload_2
    //   712: invokestatic 401	com/admarvel/android/ads/ab:c	(Landroid/content/Context;)Ljava/lang/String;
    //   715: astore 24
    //   717: aload 24
    //   719: ldc_w 403
    //   722: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   725: ifne +13 -> 738
    //   728: aload 14
    //   730: ldc_w 406
    //   733: aload 24
    //   735: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   738: aload_2
    //   739: invokestatic 408	com/admarvel/android/ads/ab:b	(Landroid/content/Context;)Ljava/lang/String;
    //   742: astore 25
    //   744: aload 24
    //   746: ldc 233
    //   748: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   751: ifne +13 -> 764
    //   754: aload 14
    //   756: ldc_w 410
    //   759: aload 25
    //   761: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   764: iload 13
    //   766: ifeq +14 -> 780
    //   769: aload 14
    //   771: ldc_w 412
    //   774: ldc_w 395
    //   777: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   780: aload 16
    //   782: ifnull +21 -> 803
    //   785: aload 16
    //   787: invokevirtual 334	java/lang/String:length	()I
    //   790: ifle +13 -> 803
    //   793: aload 14
    //   795: ldc_w 414
    //   798: aload 16
    //   800: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   803: aload 14
    //   805: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   808: areturn
    //   809: aload 14
    //   811: ldc 231
    //   813: getstatic 23	com/admarvel/android/ads/a:b	Ljava/lang/String;
    //   816: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   819: goto -711 -> 108
    //   822: astore 15
    //   824: aload 15
    //   826: invokestatic 420	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   829: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   832: aconst_null
    //   833: areturn
    //   834: aload 14
    //   836: ldc_w 262
    //   839: ldc_w 422
    //   842: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   845: goto -655 -> 190
    //   848: aload_1
    //   849: getstatic 424	com/admarvel/android/ads/a$a:b	Lcom/admarvel/android/ads/a$a;
    //   852: invokevirtual 302	com/admarvel/android/ads/a$a:equals	(Ljava/lang/Object;)Z
    //   855: ifeq -519 -> 336
    //   858: aload 14
    //   860: ldc_w 304
    //   863: ldc_w 426
    //   866: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   869: goto -533 -> 336
    //   872: iload 17
    //   874: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   877: astore 19
    //   879: goto -531 -> 348
    //   882: iload 18
    //   884: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   887: astore 20
    //   889: goto -529 -> 360
    //   892: aload 30
    //   894: invokestatic 420	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   897: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   900: goto -269 -> 631
    //   903: aload_1
    //   904: getstatic 424	com/admarvel/android/ads/a$a:b	Lcom/admarvel/android/ads/a$a;
    //   907: invokevirtual 302	com/admarvel/android/ads/a$a:equals	(Ljava/lang/Object;)Z
    //   910: ifeq -279 -> 631
    //   913: iconst_1
    //   914: invokestatic 356	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   917: astore 28
    //   919: goto -288 -> 631
    //   922: aload 14
    //   924: ldc_w 393
    //   927: ldc_w 399
    //   930: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   933: aload 14
    //   935: ldc_w 397
    //   938: ldc_w 395
    //   941: invokestatic 203	com/admarvel/android/ads/ab:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   944: goto -233 -> 711
    //   947: astore 33
    //   949: aload 32
    //   951: astore 28
    //   953: aload 33
    //   955: astore 30
    //   957: goto -65 -> 892
    //   960: aload 28
    //   962: astore 32
    //   964: goto -366 -> 598
    //   967: aconst_null
    //   968: astore 22
    //   970: goto -498 -> 472
    //   973: astore 30
    //   975: goto -83 -> 892
    //
    // Exception table:
    //   from	to	target	type
    //   9	94	822	java/lang/Exception
    //   99	108	822	java/lang/Exception
    //   108	174	822	java/lang/Exception
    //   179	190	822	java/lang/Exception
    //   190	206	822	java/lang/Exception
    //   211	237	822	java/lang/Exception
    //   237	243	822	java/lang/Exception
    //   248	274	822	java/lang/Exception
    //   274	336	822	java/lang/Exception
    //   341	348	822	java/lang/Exception
    //   353	360	822	java/lang/Exception
    //   360	462	822	java/lang/Exception
    //   466	472	822	java/lang/Exception
    //   477	495	822	java/lang/Exception
    //   495	508	822	java/lang/Exception
    //   513	552	822	java/lang/Exception
    //   631	644	822	java/lang/Exception
    //   644	659	822	java/lang/Exception
    //   664	682	822	java/lang/Exception
    //   682	711	822	java/lang/Exception
    //   711	738	822	java/lang/Exception
    //   738	764	822	java/lang/Exception
    //   769	780	822	java/lang/Exception
    //   785	803	822	java/lang/Exception
    //   809	819	822	java/lang/Exception
    //   834	845	822	java/lang/Exception
    //   848	869	822	java/lang/Exception
    //   872	879	822	java/lang/Exception
    //   882	889	822	java/lang/Exception
    //   892	900	822	java/lang/Exception
    //   903	919	822	java/lang/Exception
    //   922	944	822	java/lang/Exception
    //   598	606	947	java/lang/Exception
    //   611	623	947	java/lang/Exception
    //   557	578	973	java/lang/Exception
    //   583	598	973	java/lang/Exception
  }

  private String a(a.a parama, Context paramContext, String paramString1, int paramInt1, String paramString2, Map<String, Object> paramMap, String paramString3, String paramString4, int paramInt2, String paramString5, boolean paramBoolean1, Handler paramHandler, boolean paramBoolean2)
  {
    if (paramContext == null)
      return null;
    HashMap localHashMap1 = (HashMap)com.admarvel.android.b.a.a("/site_id_banner_map", "/site_id_banner_map", paramContext);
    if (localHashMap1 == null)
      return null;
    ArrayList localArrayList = (ArrayList)localHashMap1.get(paramString4);
    if (localArrayList == null)
      return null;
    HashMap localHashMap2 = (HashMap)com.admarvel.android.b.a.a("/ad_link_object", "/ad_link_object", paramContext);
    if (localHashMap2 == null)
      return null;
    Iterator localIterator = localHashMap2.keySet().iterator();
    while (localIterator.hasNext())
      if (!localArrayList.contains(String.valueOf((Integer)localIterator.next())))
        localIterator.remove();
    HashMap localHashMap3 = a(parama, paramContext, paramInt1, paramString2, paramMap, paramString3, paramString4, paramInt2, paramString5, paramHandler, paramBoolean2);
    Logging.log("Offline SDK:postString: &site_id=" + paramString4 + "&partner_id=" + paramString3 + localHashMap3);
    HashMap localHashMap4 = a(paramContext, localHashMap2, localHashMap3);
    if (localHashMap4 == null)
      return null;
    com.admarvel.android.b.a.a locala = a(localHashMap4);
    if (locala == null)
      return null;
    HashMap localHashMap5 = (HashMap)com.admarvel.android.b.a.a("/banner_folder_map", "/banner_folder_map", paramContext);
    if (localHashMap5 == null)
      return null;
    String str1 = (String)localHashMap5.get(String.valueOf(locala.f()));
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("admarvel_preferences", 0);
    if (localSharedPreferences == null)
      return null;
    String str2 = localSharedPreferences.getString("childDirectory", "NULL") + "/" + str1;
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putString("banner_folder", str1);
    localEditor.commit();
    if (str1 != null)
    {
      String str3 = com.admarvel.android.b.a.a(str2, str1.split("_")[0] + ".xml");
      Logging.log("Offline SDK:Admarvel XML Response:" + str3);
      return str3;
    }
    return null;
  }

  private HashMap<Integer, com.admarvel.android.b.a.a> a(Context paramContext, HashMap<Integer, com.admarvel.android.b.a.a> paramHashMap, HashMap<String, Object> paramHashMap1)
  {
    while (true)
    {
      Iterator localIterator;
      com.admarvel.android.b.a.a locala;
      HashMap localHashMap2;
      try
      {
        HashMap localHashMap1 = (HashMap)com.admarvel.android.b.a.a("/banner_folder_map", "/banner_folder_map", paramContext);
        if (localHashMap1 == null)
          return null;
        localIterator = paramHashMap.keySet().iterator();
        if (!localIterator.hasNext())
          break;
        locala = (com.admarvel.android.b.a.a)paramHashMap.get((Integer)localIterator.next());
        localHashMap2 = locala.e();
        SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("admarvel_preferences", 0);
        String str = localSharedPreferences.getString("childDirectory", "NULL") + "/" + (String)localHashMap1.get(String.valueOf(locala.f())) + "/" + String.valueOf(locala.f()) + ".xml";
        Logging.log("Offline SDK:Path of banner selected" + str);
        if (!new File(str).exists())
        {
          Logging.log("Offline SDK:Ad rejected beacause it is not downloaded yet" + str);
          localIterator.remove();
          continue;
        }
      }
      catch (Exception localException)
      {
        Logging.log(localException.getMessage() + "Offline SDK:" + "Exception in offline discardNonMatchingAd ");
        return null;
      }
      if (a(locala.b()))
      {
        Logging.log("Offline SDK:Ad rejected beacause it is Expired ");
        localIterator.remove();
      }
      else if (!b(locala.a()))
      {
        Logging.log("Offline SDK:Ad rejected beacause campaign not started yet");
        localIterator.remove();
      }
      else if ((localHashMap2 != null) && (!a(localHashMap2, paramHashMap1)))
      {
        Logging.log("Offline SDK:Ad rejected beacause targetOption doesnot matched");
        localIterator.remove();
      }
    }
    return paramHashMap;
  }

  // ERROR //
  private HashMap<String, Object> a(a.a parama, Context paramContext, int paramInt1, String paramString1, Map<String, Object> paramMap, String paramString2, String paramString3, int paramInt2, String paramString4, Handler paramHandler, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 48	java/util/HashMap
    //   3: dup
    //   4: invokespecial 49	java/util/HashMap:<init>	()V
    //   7: astore 12
    //   9: aload_2
    //   10: ifnonnull +13 -> 23
    //   13: aconst_null
    //   14: astore 14
    //   16: aload 14
    //   18: ifnonnull +18 -> 36
    //   21: aconst_null
    //   22: areturn
    //   23: aload_2
    //   24: ldc_w 466
    //   27: iconst_0
    //   28: invokevirtual 470	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   31: astore 14
    //   33: goto -17 -> 16
    //   36: aload 14
    //   38: ldc_w 545
    //   41: ldc_w 474
    //   44: invokeinterface 479 3 0
    //   49: ldc_w 474
    //   52: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   55: ifne +25 -> 80
    //   58: aload 12
    //   60: ldc_w 545
    //   63: aload 14
    //   65: ldc_w 545
    //   68: ldc_w 474
    //   71: invokeinterface 479 3 0
    //   76: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   79: pop
    //   80: aload 14
    //   82: ldc_w 551
    //   85: ldc_w 474
    //   88: invokeinterface 479 3 0
    //   93: ldc_w 474
    //   96: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   99: ifne +25 -> 124
    //   102: aload 12
    //   104: ldc_w 551
    //   107: aload 14
    //   109: ldc_w 551
    //   112: ldc_w 474
    //   115: invokeinterface 479 3 0
    //   120: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   123: pop
    //   124: aload 14
    //   126: ldc_w 553
    //   129: ldc_w 474
    //   132: invokeinterface 479 3 0
    //   137: ldc_w 474
    //   140: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   143: ifne +25 -> 168
    //   146: aload 12
    //   148: ldc_w 553
    //   151: aload 14
    //   153: ldc_w 553
    //   156: ldc_w 474
    //   159: invokeinterface 479 3 0
    //   164: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   167: pop
    //   168: aload 14
    //   170: ldc_w 555
    //   173: ldc_w 474
    //   176: invokeinterface 479 3 0
    //   181: ldc_w 474
    //   184: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   187: ifne +25 -> 212
    //   190: aload 12
    //   192: ldc_w 555
    //   195: aload 14
    //   197: ldc_w 555
    //   200: ldc_w 474
    //   203: invokeinterface 479 3 0
    //   208: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   211: pop
    //   212: aload 14
    //   214: ldc_w 557
    //   217: ldc_w 474
    //   220: invokeinterface 479 3 0
    //   225: ldc_w 474
    //   228: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   231: ifne +25 -> 256
    //   234: aload 12
    //   236: ldc_w 557
    //   239: aload 14
    //   241: ldc_w 557
    //   244: ldc_w 474
    //   247: invokeinterface 479 3 0
    //   252: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   255: pop
    //   256: aload 14
    //   258: ldc_w 559
    //   261: ldc_w 474
    //   264: invokeinterface 479 3 0
    //   269: ldc_w 474
    //   272: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   275: ifne +25 -> 300
    //   278: aload 12
    //   280: ldc_w 559
    //   283: aload 14
    //   285: ldc_w 559
    //   288: ldc_w 474
    //   291: invokeinterface 479 3 0
    //   296: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   299: pop
    //   300: aload 14
    //   302: ldc_w 561
    //   305: ldc_w 474
    //   308: invokeinterface 479 3 0
    //   313: ldc_w 474
    //   316: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   319: ifne +25 -> 344
    //   322: aload 12
    //   324: ldc_w 561
    //   327: aload 14
    //   329: ldc_w 561
    //   332: ldc_w 474
    //   335: invokeinterface 479 3 0
    //   340: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   343: pop
    //   344: aload 14
    //   346: ldc_w 563
    //   349: ldc_w 474
    //   352: invokeinterface 479 3 0
    //   357: ldc_w 474
    //   360: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   363: ifne +25 -> 388
    //   366: aload 12
    //   368: ldc_w 563
    //   371: aload 14
    //   373: ldc_w 563
    //   376: ldc_w 474
    //   379: invokeinterface 479 3 0
    //   384: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   387: pop
    //   388: aload 14
    //   390: ldc_w 565
    //   393: ldc_w 474
    //   396: invokeinterface 479 3 0
    //   401: ldc_w 474
    //   404: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   407: ifne +25 -> 432
    //   410: aload 12
    //   412: ldc_w 565
    //   415: aload 14
    //   417: ldc_w 565
    //   420: ldc_w 474
    //   423: invokeinterface 479 3 0
    //   428: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   431: pop
    //   432: aload 12
    //   434: ldc 223
    //   436: ldc 225
    //   438: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   441: pop
    //   442: aload 12
    //   444: ldc 235
    //   446: getstatic 240	android/os/Build:MODEL	Ljava/lang/String;
    //   449: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   452: pop
    //   453: aload 12
    //   455: ldc 242
    //   457: getstatic 245	android/os/Build:ID	Ljava/lang/String;
    //   460: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   463: pop
    //   464: aload 12
    //   466: ldc 247
    //   468: getstatic 252	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   471: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   474: pop
    //   475: aload 12
    //   477: ldc 227
    //   479: ldc 229
    //   481: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   484: pop
    //   485: aload 12
    //   487: ldc 231
    //   489: getstatic 23	com/admarvel/android/ads/a:b	Ljava/lang/String;
    //   492: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   495: pop
    //   496: aload 12
    //   498: ldc_w 258
    //   501: iload 8
    //   503: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   506: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   509: pop
    //   510: aload 12
    //   512: ldc_w 260
    //   515: aload 9
    //   517: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   520: pop
    //   521: aload_2
    //   522: invokestatic 269	com/admarvel/android/ads/ab:g	(Landroid/content/Context;)I
    //   525: istore 23
    //   527: iload 23
    //   529: ifle +31 -> 560
    //   532: aload 12
    //   534: ldc_w 271
    //   537: iload 23
    //   539: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   542: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   545: pop
    //   546: aload 12
    //   548: ldc_w 273
    //   551: iload 23
    //   553: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   556: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   559: pop
    //   560: aload_2
    //   561: invokestatic 276	com/admarvel/android/ads/ab:h	(Landroid/content/Context;)I
    //   564: istore 26
    //   566: iload 26
    //   568: ifle +31 -> 599
    //   571: aload 12
    //   573: ldc_w 278
    //   576: iload 26
    //   578: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   581: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   584: pop
    //   585: aload 12
    //   587: ldc_w 280
    //   590: iload 26
    //   592: invokestatic 209	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   595: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   598: pop
    //   599: aload 12
    //   601: ldc_w 282
    //   604: new 84	java/lang/StringBuilder
    //   607: dup
    //   608: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   611: ldc 233
    //   613: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   616: aload_2
    //   617: invokestatic 286	com/admarvel/android/ads/ab:i	(Landroid/content/Context;)F
    //   620: invokevirtual 289	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   623: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   626: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   629: pop
    //   630: aload 12
    //   632: ldc_w 291
    //   635: ldc_w 293
    //   638: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   641: pop
    //   642: aload_1
    //   643: getstatic 298	com/admarvel/android/ads/a$a:a	Lcom/admarvel/android/ads/a$a;
    //   646: invokevirtual 302	com/admarvel/android/ads/a$a:equals	(Ljava/lang/Object;)Z
    //   649: ifeq +180 -> 829
    //   652: aload 12
    //   654: ldc_w 304
    //   657: ldc_w 306
    //   660: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   663: pop
    //   664: aload_2
    //   665: instanceof 338
    //   668: ifeq +146 -> 814
    //   671: aload_2
    //   672: checkcast 338	android/app/Activity
    //   675: astore 32
    //   677: aload 32
    //   679: ifnull +135 -> 814
    //   682: aload 32
    //   684: invokevirtual 342	android/app/Activity:getWindow	()Landroid/view/Window;
    //   687: ldc_w 343
    //   690: invokevirtual 349	android/view/Window:findViewById	(I)Landroid/view/View;
    //   693: checkcast 351	android/view/ViewGroup
    //   696: astore 33
    //   698: iconst_0
    //   699: invokestatic 356	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   702: astore 34
    //   704: invokestatic 256	com/admarvel/android/ads/ac:a	()I
    //   707: bipush 11
    //   709: if_icmplt +91 -> 800
    //   712: aload_1
    //   713: getstatic 298	com/admarvel/android/ads/a$a:a	Lcom/admarvel/android/ads/a$a;
    //   716: invokevirtual 302	com/admarvel/android/ads/a$a:equals	(Ljava/lang/Object;)Z
    //   719: istore 36
    //   721: iload 36
    //   723: ifeq +156 -> 879
    //   726: ldc_w 351
    //   729: ldc_w 358
    //   732: iconst_0
    //   733: anewarray 360	java/lang/Class
    //   736: invokevirtual 364	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   739: aload 33
    //   741: aconst_null
    //   742: invokevirtual 370	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   745: astore 39
    //   747: aload 39
    //   749: ifnull +166 -> 915
    //   752: aload 39
    //   754: instanceof 353
    //   757: ifeq +158 -> 915
    //   760: aload 39
    //   762: checkcast 353	java/lang/Boolean
    //   765: astore 40
    //   767: aload 40
    //   769: invokevirtual 373	java/lang/Boolean:booleanValue	()Z
    //   772: ifeq +24 -> 796
    //   775: iload 11
    //   777: ifeq +19 -> 796
    //   780: invokestatic 375	com/admarvel/android/ads/ab:c	()Z
    //   783: ifeq +13 -> 796
    //   786: iconst_0
    //   787: invokestatic 356	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   790: astore 42
    //   792: aload 42
    //   794: astore 40
    //   796: aload 40
    //   798: astore 34
    //   800: aload 12
    //   802: ldc_w 377
    //   805: aload 34
    //   807: invokevirtual 378	java/lang/Boolean:toString	()Ljava/lang/String;
    //   810: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   813: pop
    //   814: aload 5
    //   816: ifnull +106 -> 922
    //   819: aload 12
    //   821: aload 5
    //   823: invokevirtual 569	java/util/HashMap:putAll	(Ljava/util/Map;)V
    //   826: goto +96 -> 922
    //   829: aload_1
    //   830: getstatic 424	com/admarvel/android/ads/a$a:b	Lcom/admarvel/android/ads/a$a;
    //   833: invokevirtual 302	com/admarvel/android/ads/a$a:equals	(Ljava/lang/Object;)Z
    //   836: ifeq -172 -> 664
    //   839: aload 12
    //   841: ldc_w 304
    //   844: ldc_w 426
    //   847: invokevirtual 549	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   850: pop
    //   851: goto -187 -> 664
    //   854: astore 13
    //   856: aload 13
    //   858: invokestatic 420	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   861: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   864: aconst_null
    //   865: areturn
    //   866: astore 38
    //   868: aload 38
    //   870: invokestatic 420	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   873: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   876: goto -76 -> 800
    //   879: aload_1
    //   880: getstatic 424	com/admarvel/android/ads/a$a:b	Lcom/admarvel/android/ads/a$a;
    //   883: invokevirtual 302	com/admarvel/android/ads/a$a:equals	(Ljava/lang/Object;)Z
    //   886: ifeq -86 -> 800
    //   889: iconst_1
    //   890: invokestatic 356	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   893: astore 37
    //   895: aload 37
    //   897: astore 34
    //   899: goto -99 -> 800
    //   902: astore 41
    //   904: aload 40
    //   906: astore 34
    //   908: aload 41
    //   910: astore 38
    //   912: goto -44 -> 868
    //   915: aload 34
    //   917: astore 40
    //   919: goto -152 -> 767
    //   922: aload 12
    //   924: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   23	33	854	java/lang/Exception
    //   36	80	854	java/lang/Exception
    //   80	124	854	java/lang/Exception
    //   124	168	854	java/lang/Exception
    //   168	212	854	java/lang/Exception
    //   212	256	854	java/lang/Exception
    //   256	300	854	java/lang/Exception
    //   300	344	854	java/lang/Exception
    //   344	388	854	java/lang/Exception
    //   388	432	854	java/lang/Exception
    //   432	527	854	java/lang/Exception
    //   532	560	854	java/lang/Exception
    //   560	566	854	java/lang/Exception
    //   571	599	854	java/lang/Exception
    //   599	664	854	java/lang/Exception
    //   664	677	854	java/lang/Exception
    //   682	721	854	java/lang/Exception
    //   800	814	854	java/lang/Exception
    //   819	826	854	java/lang/Exception
    //   829	851	854	java/lang/Exception
    //   868	876	854	java/lang/Exception
    //   879	895	854	java/lang/Exception
    //   726	747	866	java/lang/Exception
    //   752	767	866	java/lang/Exception
    //   767	775	902	java/lang/Exception
    //   780	792	902	java/lang/Exception
  }

  private HashMap<Integer, com.admarvel.android.b.a.a> a(HashMap<Integer, com.admarvel.android.b.a.a> paramHashMap, int paramInt)
  {
    HashMap localHashMap;
    try
    {
      localHashMap = new HashMap();
      Iterator localIterator = paramHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        com.admarvel.android.b.a.a locala = (com.admarvel.android.b.a.a)paramHashMap.get(localInteger);
        if (locala.d() == paramInt)
          localHashMap.put(localInteger, locala);
      }
    }
    catch (Exception localException)
    {
      Logging.log(localException.getMessage() + "Offline SDK:" + "Exception in offline filterAdsByCampaignPriority");
      return null;
    }
    return localHashMap;
  }

  private boolean a(long paramLong)
  {
    return (paramLong >= 0L) && (paramLong < System.currentTimeMillis());
  }

  private boolean a(String paramString1, String paramString2)
  {
    boolean bool = true;
    try
    {
      if ((Pattern.compile("-?[0-9]+").matcher(paramString1).matches()) && (Pattern.compile("-?[0-9]+").matcher(paramString2).matches()))
      {
        if (Integer.valueOf(paramString1).intValue() <= Integer.valueOf(paramString2).intValue())
          break label230;
        return bool;
      }
      if ((Pattern.compile("^[-]?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][+-]?[0-9]+)?$").matcher(paramString1).matches()) && (Pattern.compile("^[-]?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][+-]?[0-9]+)?$").matcher(paramString2).matches()))
      {
        if (Double.valueOf(paramString1).doubleValue() <= Double.valueOf(paramString2).doubleValue())
          break label230;
      }
      else
      {
        int i = paramString1.compareToIgnoreCase(paramString2);
        if (i <= 0)
          break label230;
        return bool;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Logging.log(localNumberFormatException.getMessage() + "Offline SDK:" + "Exception in offline isGreater ");
      return false;
    }
    catch (NullPointerException localNullPointerException)
    {
      Logging.log(localNullPointerException.getMessage() + "Offline SDK:" + "Exception in offline isGreater ");
      return false;
    }
    catch (Exception localException)
    {
      Logging.log(localException.getMessage() + "Offline SDK:" + "Exception in offline isGreater ");
      bool = false;
    }
    return bool;
    label230: return false;
  }

  private boolean a(String paramString1, String paramString2, String paramString3)
  {
    int i;
    try
    {
      if (paramString1.equals("=="))
      {
        if (paramString2.equals(paramString3))
          break label207;
        return false;
      }
      if (paramString1.equals("!="))
      {
        if (!paramString2.equals(paramString3))
          break label207;
      }
      else
      {
        if (paramString1.equals("gt"))
        {
          if (a(paramString3, paramString2))
            break label216;
          i = 1;
          break label209;
        }
        if (paramString1.equals("lt"))
        {
          if (b(paramString3, paramString2))
            break label207;
          return false;
        }
        if (paramString1.equals("=x"))
        {
          if (paramString2.equals(paramString3))
            break label207;
          return false;
        }
        if (paramString1.equals("!x"))
        {
          if (!paramString2.equals(paramString3))
            break label207;
          return false;
        }
        if (paramString1.equals("=~"))
        {
          if (paramString3.contains(paramString2))
            break label207;
          return false;
        }
        if (!paramString1.equals("!~"))
          break label207;
        boolean bool = paramString3.contains(paramString2);
        if (!bool)
          break label207;
        return false;
      }
    }
    catch (Exception localException)
    {
      Logging.log(localException.getMessage() + "Offline SDK:" + "Exception in offline comparatorCheck ");
    }
    return false;
    while (true)
    {
      label207: return true;
      label209: 
      while (i != 0)
      {
        return false;
        label216: i = 0;
      }
    }
  }

  private boolean a(HashMap<String, ArrayList<String[]>> paramHashMap, HashMap<String, Object> paramHashMap1)
  {
    try
    {
      Iterator localIterator1 = paramHashMap.keySet().iterator();
      boolean bool;
      do
      {
        String str;
        Iterator localIterator2;
        while (!localIterator2.hasNext())
        {
          if (!localIterator1.hasNext())
            break label110;
          str = (String)localIterator1.next();
          if (!paramHashMap1.containsKey(str))
            break;
          localIterator2 = ((ArrayList)paramHashMap.get(str)).iterator();
        }
        String[] arrayOfString = (String[])localIterator2.next();
        bool = a(arrayOfString[0], arrayOfString[1], (String)paramHashMap1.get(str));
      }
      while (bool);
      return false;
      return false;
      label110: return true;
    }
    catch (Exception localException)
    {
      Logging.log(localException.getMessage() + "Offline SDK:" + "Exception in offline isValidAd ");
    }
    return false;
  }

  private String b(Context paramContext)
  {
    if (paramContext == null);
    String str;
    do
    {
      return null;
      str = a(paramContext);
    }
    while ((str == null) || (str.length() <= 0));
    return "FBATTRID:" + str;
  }

  private boolean b(long paramLong)
  {
    return paramLong <= System.currentTimeMillis();
  }

  private boolean b(String paramString1, String paramString2)
  {
    try
    {
      if ((Pattern.compile("-?[0-9]+").matcher(paramString1).matches()) && (Pattern.compile("-?[0-9]+").matcher(paramString2).matches()))
      {
        if (Integer.valueOf(paramString1).intValue() < Integer.valueOf(paramString2).intValue())
          break label224;
        return false;
      }
      if ((Pattern.compile("^[-]?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][+-]?[0-9]+)?$").matcher(paramString1).matches()) && (Pattern.compile("^[-]?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][+-]?[0-9]+)?$").matcher(paramString2).matches()))
      {
        if (Double.valueOf(paramString1).doubleValue() < Double.valueOf(paramString2).doubleValue())
          break label224;
      }
      else
      {
        int i = paramString2.compareToIgnoreCase(paramString1);
        if (i >= 0)
          break label224;
        return false;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Logging.log(localNumberFormatException.getMessage() + "Offline SDK:" + "Exception in offline isLessThan ");
      return false;
    }
    catch (NullPointerException localNullPointerException)
    {
      Logging.log(localNullPointerException.getMessage() + "Offline SDK:" + "Exception in offline isLessThan ");
      return false;
    }
    catch (Exception localException)
    {
      Logging.log(localException.getMessage() + "Offline SDK:" + "Exception in offline isLessThan ");
    }
    return false;
    label224: return true;
  }

  // ERROR //
  public String a(a.a parama, Context paramContext, String paramString1, int paramInt1, String paramString2, Map<String, Object> paramMap, String paramString3, String paramString4, int paramInt2, String paramString5, boolean paramBoolean1, Handler paramHandler, boolean paramBoolean2, boolean paramBoolean3)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 48	java/util/HashMap
    //   9: dup
    //   10: invokespecial 49	java/util/HashMap:<init>	()V
    //   13: astore 15
    //   15: aload 6
    //   17: ifnull +18 -> 35
    //   20: aload 6
    //   22: monitorenter
    //   23: aload 15
    //   25: aload 6
    //   27: invokeinterface 667 2 0
    //   32: aload 6
    //   34: monitorexit
    //   35: iload 11
    //   37: iconst_1
    //   38: if_icmpne +136 -> 174
    //   41: aload 15
    //   43: ldc_w 669
    //   46: ldc_w 671
    //   49: invokeinterface 672 3 0
    //   54: pop
    //   55: aload_0
    //   56: aload_2
    //   57: invokespecial 673	com/admarvel/android/ads/a:b	(Landroid/content/Context;)Ljava/lang/String;
    //   60: astore 22
    //   62: aload 22
    //   64: astore 18
    //   66: aload 18
    //   68: ifnull +29 -> 97
    //   71: aload 15
    //   73: ldc_w 675
    //   76: invokeinterface 383 2 0
    //   81: ifnonnull +16 -> 97
    //   84: aload 15
    //   86: ldc_w 675
    //   89: aload 18
    //   91: invokeinterface 672 3 0
    //   96: pop
    //   97: aload_3
    //   98: ifnull +28 -> 126
    //   101: aload 15
    //   103: ldc_w 677
    //   106: invokeinterface 383 2 0
    //   111: ifnonnull +15 -> 126
    //   114: aload 15
    //   116: ldc_w 677
    //   119: aload_3
    //   120: invokeinterface 672 3 0
    //   125: pop
    //   126: aload_0
    //   127: aload_1
    //   128: aload_2
    //   129: aload_3
    //   130: iload 4
    //   132: aload 5
    //   134: aload 6
    //   136: aload 7
    //   138: aload 8
    //   140: iload 9
    //   142: aload 10
    //   144: iload 11
    //   146: aload 12
    //   148: iload 13
    //   150: invokespecial 679	com/admarvel/android/ads/a:a	(Lcom/admarvel/android/ads/a$a;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLandroid/os/Handler;Z)Ljava/lang/String;
    //   153: areturn
    //   154: astore 24
    //   156: aload 6
    //   158: monitorexit
    //   159: aload 24
    //   161: athrow
    //   162: astore 19
    //   164: aload 19
    //   166: invokestatic 420	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   169: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   172: aconst_null
    //   173: areturn
    //   174: aload 15
    //   176: ldc_w 669
    //   179: ldc_w 681
    //   182: invokeinterface 672 3 0
    //   187: pop
    //   188: goto -133 -> 55
    //   191: astore 17
    //   193: aconst_null
    //   194: astore 18
    //   196: goto -130 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   23	35	154	finally
    //   20	23	162	java/lang/Exception
    //   41	55	162	java/lang/Exception
    //   71	97	162	java/lang/Exception
    //   101	126	162	java/lang/Exception
    //   156	162	162	java/lang/Exception
    //   174	188	162	java/lang/Exception
    //   55	62	191	java/lang/Exception
  }

  // ERROR //
  public String a(a.a parama, Context paramContext, String paramString1, int paramInt1, String paramString2, Map<String, Object> paramMap, String paramString3, String paramString4, int paramInt2, String paramString5, boolean paramBoolean1, Handler paramHandler, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    // Byte code:
    //   0: new 48	java/util/HashMap
    //   3: dup
    //   4: invokespecial 49	java/util/HashMap:<init>	()V
    //   7: astore 16
    //   9: aload_2
    //   10: ifnonnull +5 -> 15
    //   13: aconst_null
    //   14: areturn
    //   15: aload 6
    //   17: ifnull +18 -> 35
    //   20: aload 6
    //   22: monitorenter
    //   23: aload 16
    //   25: aload 6
    //   27: invokeinterface 667 2 0
    //   32: aload 6
    //   34: monitorexit
    //   35: iload 11
    //   37: iconst_1
    //   38: if_icmpne +276 -> 314
    //   41: aload 16
    //   43: ldc_w 669
    //   46: ldc_w 671
    //   49: invokeinterface 672 3 0
    //   54: pop
    //   55: aload_0
    //   56: aload_2
    //   57: invokespecial 673	com/admarvel/android/ads/a:b	(Landroid/content/Context;)Ljava/lang/String;
    //   60: astore 56
    //   62: aload 56
    //   64: astore 19
    //   66: aload 19
    //   68: ifnull +29 -> 97
    //   71: aload 16
    //   73: ldc_w 675
    //   76: invokeinterface 383 2 0
    //   81: ifnonnull +16 -> 97
    //   84: aload 16
    //   86: ldc_w 675
    //   89: aload 19
    //   91: invokeinterface 672 3 0
    //   96: pop
    //   97: aload_2
    //   98: invokestatic 687	com/admarvel/android/util/e:c	(Landroid/content/Context;)Lcom/admarvel/android/util/e;
    //   101: astore 21
    //   103: aload_0
    //   104: aload 21
    //   106: aload_2
    //   107: invokevirtual 688	com/admarvel/android/util/e:b	(Landroid/content/Context;)Ljava/lang/String;
    //   110: putfield 40	com/admarvel/android/ads/a:e	Ljava/lang/String;
    //   113: aload_0
    //   114: aload 21
    //   116: aload_2
    //   117: invokevirtual 690	com/admarvel/android/util/e:a	(Landroid/content/Context;)I
    //   120: putfield 43	com/admarvel/android/ads/a:f	I
    //   123: aload_0
    //   124: getfield 40	com/admarvel/android/ads/a:e	Ljava/lang/String;
    //   127: ifnull +204 -> 331
    //   130: aload_0
    //   131: getfield 40	com/admarvel/android/ads/a:e	Ljava/lang/String;
    //   134: ldc 38
    //   136: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   139: ifne +192 -> 331
    //   142: aload 16
    //   144: ldc_w 380
    //   147: aload_0
    //   148: getfield 40	com/admarvel/android/ads/a:e	Ljava/lang/String;
    //   151: invokeinterface 672 3 0
    //   156: pop
    //   157: aload 16
    //   159: ldc_w 692
    //   162: aload_0
    //   163: getfield 43	com/admarvel/android/ads/a:f	I
    //   166: invokestatic 694	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   169: invokeinterface 672 3 0
    //   174: pop
    //   175: aload 16
    //   177: ldc_w 677
    //   180: invokeinterface 383 2 0
    //   185: ifnonnull +37 -> 222
    //   188: aload_0
    //   189: getfield 40	com/admarvel/android/ads/a:e	Ljava/lang/String;
    //   192: ifnull +157 -> 349
    //   195: aload_0
    //   196: getfield 40	com/admarvel/android/ads/a:e	Ljava/lang/String;
    //   199: ldc 38
    //   201: invokevirtual 404	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   204: ifne +145 -> 349
    //   207: aload 16
    //   209: ldc_w 677
    //   212: aload_0
    //   213: getfield 40	com/admarvel/android/ads/a:e	Ljava/lang/String;
    //   216: invokeinterface 672 3 0
    //   221: pop
    //   222: aload_0
    //   223: aload_1
    //   224: aload_2
    //   225: iload 4
    //   227: aload 5
    //   229: aload 16
    //   231: aload 7
    //   233: aload 8
    //   235: iload 9
    //   237: aload 10
    //   239: aload 12
    //   241: iload 13
    //   243: iload 14
    //   245: iload 15
    //   247: invokespecial 696	com/admarvel/android/ads/a:a	(Lcom/admarvel/android/ads/a$a;Landroid/content/Context;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Landroid/os/Handler;ZZZ)Ljava/lang/String;
    //   250: astore 23
    //   252: new 84	java/lang/StringBuilder
    //   255: dup
    //   256: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   259: ldc_w 698
    //   262: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: aload 23
    //   267: ldc_w 700
    //   270: invokestatic 705	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   273: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   279: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   282: aload 23
    //   284: putstatic 707	com/admarvel/android/ads/a:a	Ljava/lang/String;
    //   287: aload 23
    //   289: ifnonnull +107 -> 396
    //   292: aconst_null
    //   293: areturn
    //   294: astore 58
    //   296: aload 6
    //   298: monitorexit
    //   299: aload 58
    //   301: athrow
    //   302: astore 20
    //   304: aload 20
    //   306: invokestatic 420	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   309: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   312: aconst_null
    //   313: areturn
    //   314: aload 16
    //   316: ldc_w 669
    //   319: ldc_w 681
    //   322: invokeinterface 672 3 0
    //   327: pop
    //   328: goto -273 -> 55
    //   331: aload 16
    //   333: ldc_w 709
    //   336: aload_2
    //   337: invokestatic 714	com/admarvel/android/util/OptionalUtils:getId	(Landroid/content/Context;)Ljava/lang/String;
    //   340: invokeinterface 672 3 0
    //   345: pop
    //   346: goto -171 -> 175
    //   349: aload 16
    //   351: ldc_w 677
    //   354: aload_2
    //   355: invokestatic 714	com/admarvel/android/util/OptionalUtils:getId	(Landroid/content/Context;)Ljava/lang/String;
    //   358: invokeinterface 672 3 0
    //   363: pop
    //   364: goto -142 -> 222
    //   367: astore 24
    //   369: new 84	java/lang/StringBuilder
    //   372: dup
    //   373: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   376: ldc_w 698
    //   379: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: aload 23
    //   384: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   390: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   393: goto -111 -> 282
    //   396: aload_0
    //   397: new 716	org/json/JSONObject
    //   400: dup
    //   401: invokespecial 717	org/json/JSONObject:<init>	()V
    //   404: putfield 719	com/admarvel/android/ads/a:d	Lorg/json/JSONObject;
    //   407: new 721	java/text/SimpleDateFormat
    //   410: dup
    //   411: ldc_w 723
    //   414: invokespecial 724	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   417: astore 43
    //   419: aload 43
    //   421: ldc_w 726
    //   424: invokestatic 732	java/util/TimeZone:getTimeZone	(Ljava/lang/String;)Ljava/util/TimeZone;
    //   427: invokevirtual 736	java/text/SimpleDateFormat:setTimeZone	(Ljava/util/TimeZone;)V
    //   430: new 721	java/text/SimpleDateFormat
    //   433: dup
    //   434: ldc_w 723
    //   437: invokespecial 724	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   440: astore 44
    //   442: invokestatic 742	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   445: invokevirtual 746	java/util/Calendar:getTime	()Ljava/util/Date;
    //   448: astore 45
    //   450: invokestatic 578	java/lang/System:currentTimeMillis	()J
    //   453: invokestatic 751	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   456: astore 46
    //   458: aload_0
    //   459: getfield 719	com/admarvel/android/ads/a:d	Lorg/json/JSONObject;
    //   462: ldc_w 753
    //   465: aload 23
    //   467: invokevirtual 756	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   470: pop
    //   471: aload_0
    //   472: getfield 719	com/admarvel/android/ads/a:d	Lorg/json/JSONObject;
    //   475: ldc_w 758
    //   478: aload 46
    //   480: invokestatic 441	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   483: invokevirtual 756	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   486: pop
    //   487: aload_0
    //   488: getfield 719	com/admarvel/android/ads/a:d	Lorg/json/JSONObject;
    //   491: ldc_w 760
    //   494: aload 43
    //   496: aload 45
    //   498: invokevirtual 763	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   501: invokevirtual 756	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   504: pop
    //   505: aload_0
    //   506: getfield 719	com/admarvel/android/ads/a:d	Lorg/json/JSONObject;
    //   509: ldc_w 765
    //   512: aload 44
    //   514: aload 45
    //   516: invokevirtual 763	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   519: invokevirtual 756	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   522: pop
    //   523: new 767	java/net/URL
    //   526: dup
    //   527: ldc_w 769
    //   530: invokespecial 770	java/net/URL:<init>	(Ljava/lang/String;)V
    //   533: invokevirtual 774	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   536: checkcast 776	java/net/HttpURLConnection
    //   539: astore 27
    //   541: aload 27
    //   543: ldc_w 778
    //   546: invokevirtual 781	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   549: aload 27
    //   551: iconst_1
    //   552: invokevirtual 785	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   555: aload 27
    //   557: iconst_1
    //   558: invokevirtual 788	java/net/HttpURLConnection:setDoInput	(Z)V
    //   561: aload 27
    //   563: iconst_0
    //   564: invokevirtual 791	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   567: aload 27
    //   569: ldc_w 793
    //   572: new 195	com/admarvel/android/ads/ab
    //   575: dup
    //   576: aload_2
    //   577: aload 12
    //   579: invokespecial 309	com/admarvel/android/ads/ab:<init>	(Landroid/content/Context;Landroid/os/Handler;)V
    //   582: invokevirtual 328	com/admarvel/android/ads/ab:a	()Ljava/lang/String;
    //   585: invokevirtual 797	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   588: aload 27
    //   590: ldc_w 799
    //   593: ldc_w 801
    //   596: invokevirtual 797	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   599: aload 27
    //   601: ldc_w 803
    //   604: aload 23
    //   606: invokevirtual 334	java/lang/String:length	()I
    //   609: invokestatic 694	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   612: invokevirtual 797	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   615: aload 27
    //   617: sipush 2000
    //   620: invokevirtual 807	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   623: aload 27
    //   625: sipush 10000
    //   628: invokevirtual 810	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   631: aload 27
    //   633: invokevirtual 814	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   636: aload 23
    //   638: invokevirtual 818	java/lang/String:getBytes	()[B
    //   641: invokevirtual 824	java/io/OutputStream:write	([B)V
    //   644: aload 27
    //   646: invokevirtual 827	java/net/HttpURLConnection:getResponseCode	()I
    //   649: istore 28
    //   651: aload 27
    //   653: invokevirtual 830	java/net/HttpURLConnection:getContentLength	()I
    //   656: istore 29
    //   658: new 84	java/lang/StringBuilder
    //   661: dup
    //   662: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   665: ldc_w 832
    //   668: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   671: iload 28
    //   673: invokevirtual 835	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   676: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   679: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   682: new 84	java/lang/StringBuilder
    //   685: dup
    //   686: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   689: ldc_w 837
    //   692: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   695: iload 29
    //   697: invokevirtual 835	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   700: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   703: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   706: iload 28
    //   708: sipush 200
    //   711: if_icmpne +261 -> 972
    //   714: aload 27
    //   716: invokevirtual 840	java/net/HttpURLConnection:getContent	()Ljava/lang/Object;
    //   719: checkcast 842	java/io/InputStream
    //   722: astore 30
    //   724: new 436	java/util/ArrayList
    //   727: dup
    //   728: invokespecial 843	java/util/ArrayList:<init>	()V
    //   731: astore 31
    //   733: sipush 8192
    //   736: istore 32
    //   738: iconst_0
    //   739: istore 33
    //   741: iload 32
    //   743: iconst_m1
    //   744: if_icmpeq +94 -> 838
    //   747: sipush 8192
    //   750: newarray byte
    //   752: astore 34
    //   754: aload 30
    //   756: aload 34
    //   758: iconst_0
    //   759: sipush 8192
    //   762: invokevirtual 847	java/io/InputStream:read	([BII)I
    //   765: istore 32
    //   767: iload 32
    //   769: ifle -28 -> 741
    //   772: new 849	com/admarvel/android/ads/a$b
    //   775: dup
    //   776: aconst_null
    //   777: invokespecial 852	com/admarvel/android/ads/a$b:<init>	(Lcom/admarvel/android/ads/a$1;)V
    //   780: astore 35
    //   782: aload 35
    //   784: aload 34
    //   786: putfield 855	com/admarvel/android/ads/a$b:a	[B
    //   789: aload 35
    //   791: iload 32
    //   793: putfield 857	com/admarvel/android/ads/a$b:b	I
    //   796: iload 33
    //   798: iload 32
    //   800: iadd
    //   801: istore 33
    //   803: aload 31
    //   805: aload 35
    //   807: invokeinterface 862 2 0
    //   812: pop
    //   813: goto -72 -> 741
    //   816: astore 26
    //   818: aload 26
    //   820: invokestatic 420	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   823: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   826: aconst_null
    //   827: areturn
    //   828: astore 25
    //   830: aload 25
    //   832: invokevirtual 865	java/lang/Exception:printStackTrace	()V
    //   835: goto -312 -> 523
    //   838: aload 30
    //   840: invokevirtual 866	java/io/InputStream:close	()V
    //   843: iload 33
    //   845: ifle +127 -> 972
    //   848: iload 33
    //   850: newarray byte
    //   852: astore 37
    //   854: iconst_0
    //   855: istore 38
    //   857: iconst_0
    //   858: istore 39
    //   860: iload 39
    //   862: aload 31
    //   864: invokeinterface 867 1 0
    //   869: if_icmpge +51 -> 920
    //   872: aload 31
    //   874: iload 39
    //   876: invokeinterface 870 2 0
    //   881: checkcast 849	com/admarvel/android/ads/a$b
    //   884: astore 42
    //   886: aload 42
    //   888: getfield 855	com/admarvel/android/ads/a$b:a	[B
    //   891: iconst_0
    //   892: aload 37
    //   894: iload 38
    //   896: aload 42
    //   898: getfield 857	com/admarvel/android/ads/a$b:b	I
    //   901: invokestatic 874	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   904: iload 38
    //   906: aload 42
    //   908: getfield 857	com/admarvel/android/ads/a$b:b	I
    //   911: iadd
    //   912: istore 38
    //   914: iinc 39 1
    //   917: goto -57 -> 860
    //   920: new 160	java/lang/String
    //   923: dup
    //   924: aload 37
    //   926: invokespecial 876	java/lang/String:<init>	([B)V
    //   929: astore 40
    //   931: aload 40
    //   933: invokevirtual 877	java/lang/String:toString	()Ljava/lang/String;
    //   936: astore 41
    //   938: new 84	java/lang/StringBuilder
    //   941: dup
    //   942: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   945: ldc_w 879
    //   948: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   951: new 160	java/lang/String
    //   954: dup
    //   955: aload 41
    //   957: invokespecial 880	java/lang/String:<init>	(Ljava/lang/String;)V
    //   960: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   963: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   966: invokestatic 105	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   969: aload 41
    //   971: areturn
    //   972: ldc 233
    //   974: astore 40
    //   976: goto -45 -> 931
    //   979: astore 18
    //   981: aconst_null
    //   982: astore 19
    //   984: goto -918 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   23	35	294	finally
    //   20	23	302	java/lang/Exception
    //   41	55	302	java/lang/Exception
    //   71	97	302	java/lang/Exception
    //   97	175	302	java/lang/Exception
    //   175	222	302	java/lang/Exception
    //   296	302	302	java/lang/Exception
    //   314	328	302	java/lang/Exception
    //   331	346	302	java/lang/Exception
    //   349	364	302	java/lang/Exception
    //   252	282	367	java/lang/Exception
    //   523	706	816	java/lang/Exception
    //   714	733	816	java/lang/Exception
    //   747	767	816	java/lang/Exception
    //   772	796	816	java/lang/Exception
    //   803	813	816	java/lang/Exception
    //   838	843	816	java/lang/Exception
    //   848	854	816	java/lang/Exception
    //   860	914	816	java/lang/Exception
    //   920	931	816	java/lang/Exception
    //   396	523	828	java/lang/Exception
    //   55	62	979	java/lang/Exception
  }

  public JSONObject a()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.a
 * JD-Core Version:    0.6.2
 */