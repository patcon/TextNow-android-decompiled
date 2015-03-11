package com.admarvel.android.ads;

import android.content.Context;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

class r$d
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
  private final WeakReference<Context> k;
  private final WeakReference<d> l;

  public r$d(d paramd, Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.k = new WeakReference(paramContext);
    this.l = new WeakReference(paramd);
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

  public r$d(d paramd, Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt)
  {
    this.k = new WeakReference(paramContext);
    this.l = new WeakReference(paramd);
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

  public r$d(d paramd, Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt2, int paramInt3, String paramString11)
  {
    this.k = new WeakReference(paramContext);
    this.l = new WeakReference(paramd);
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
    if (Version.getAndroidSDKVersion() >= 8)
      return "content://com.android.calendar/";
    return "content://calendar/";
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	com/admarvel/android/ads/r$d:k	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 123	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 125	android/content/Context
    //   10: astore_1
    //   11: aload_0
    //   12: getfield 56	com/admarvel/android/ads/r$d:l	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 123	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 127	com/admarvel/android/ads/d
    //   21: astore_2
    //   22: aload_1
    //   23: ifnull +7 -> 30
    //   26: aload_2
    //   27: ifnonnull +4 -> 31
    //   30: return
    //   31: aload_1
    //   32: invokevirtual 131	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   35: astore_3
    //   36: aload_3
    //   37: new 133	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   44: aload_0
    //   45: invokevirtual 136	com/admarvel/android/ads/r$d:a	()Ljava/lang/String;
    //   48: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: ldc 142
    //   53: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: invokestatic 150	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   62: iconst_2
    //   63: anewarray 100	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: ldc 152
    //   70: aastore
    //   71: dup
    //   72: iconst_1
    //   73: ldc 154
    //   75: aastore
    //   76: aconst_null
    //   77: aconst_null
    //   78: aconst_null
    //   79: invokevirtual 160	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   82: astore 7
    //   84: aload 7
    //   86: astore 5
    //   88: aload 5
    //   90: ifnull +477 -> 567
    //   93: aload 5
    //   95: invokeinterface 166 1 0
    //   100: ifeq +467 -> 567
    //   103: aload 5
    //   105: invokeinterface 169 1 0
    //   110: anewarray 100	java/lang/String
    //   113: astore 8
    //   115: aload 5
    //   117: invokeinterface 169 1 0
    //   122: newarray int
    //   124: astore 9
    //   126: iconst_0
    //   127: istore 10
    //   129: iload 10
    //   131: aload 8
    //   133: arraylength
    //   134: if_icmpge +43 -> 177
    //   137: aload 9
    //   139: iload 10
    //   141: aload 5
    //   143: iconst_0
    //   144: invokeinterface 173 2 0
    //   149: iastore
    //   150: aload 8
    //   152: iload 10
    //   154: aload 5
    //   156: iconst_1
    //   157: invokeinterface 177 2 0
    //   162: aastore
    //   163: aload 5
    //   165: invokeinterface 180 1 0
    //   170: pop
    //   171: iinc 10 1
    //   174: goto -45 -> 129
    //   177: new 182	android/content/ContentValues
    //   180: dup
    //   181: invokespecial 183	android/content/ContentValues:<init>	()V
    //   184: astore 11
    //   186: aload 11
    //   188: ldc 185
    //   190: aload 9
    //   192: iconst_0
    //   193: iaload
    //   194: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   197: invokevirtual 194	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   200: aload_0
    //   201: getfield 76	com/admarvel/android/ads/r$d:d	Ljava/lang/String;
    //   204: ifnull +14 -> 218
    //   207: aload 11
    //   209: ldc 196
    //   211: aload_0
    //   212: getfield 76	com/admarvel/android/ads/r$d:d	Ljava/lang/String;
    //   215: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   218: aload_0
    //   219: getfield 78	com/admarvel/android/ads/r$d:e	Ljava/lang/String;
    //   222: ifnull +14 -> 236
    //   225: aload 11
    //   227: ldc 201
    //   229: aload_0
    //   230: getfield 78	com/admarvel/android/ads/r$d:e	Ljava/lang/String;
    //   233: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   236: aload_0
    //   237: getfield 92	com/admarvel/android/ads/r$d:f	Ljava/lang/String;
    //   240: ifnull +14 -> 254
    //   243: aload 11
    //   245: ldc 203
    //   247: aload_0
    //   248: getfield 92	com/admarvel/android/ads/r$d:f	Ljava/lang/String;
    //   251: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   254: aload_0
    //   255: getfield 43	com/admarvel/android/ads/r$d:b	Ljava/lang/Long;
    //   258: ifnull +14 -> 272
    //   261: aload 11
    //   263: ldc 205
    //   265: aload_0
    //   266: getfield 43	com/admarvel/android/ads/r$d:b	Ljava/lang/Long;
    //   269: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   272: aload_0
    //   273: getfield 45	com/admarvel/android/ads/r$d:c	Ljava/lang/Long;
    //   276: ifnull +14 -> 290
    //   279: aload 11
    //   281: ldc 210
    //   283: aload_0
    //   284: getfield 45	com/admarvel/android/ads/r$d:c	Ljava/lang/Long;
    //   287: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   290: aload_0
    //   291: getfield 94	com/admarvel/android/ads/r$d:g	Ljava/lang/String;
    //   294: ifnull +44 -> 338
    //   297: aload_0
    //   298: getfield 94	com/admarvel/android/ads/r$d:g	Ljava/lang/String;
    //   301: invokevirtual 213	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   304: ldc 215
    //   306: invokevirtual 219	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   309: ifne +18 -> 327
    //   312: aload_0
    //   313: getfield 94	com/admarvel/android/ads/r$d:g	Ljava/lang/String;
    //   316: invokevirtual 213	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   319: ldc 221
    //   321: invokevirtual 219	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   324: ifeq +14 -> 338
    //   327: aload 11
    //   329: ldc 223
    //   331: iconst_1
    //   332: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   335: invokevirtual 194	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   338: aload_0
    //   339: getfield 47	com/admarvel/android/ads/r$d:j	I
    //   342: ifgt +14 -> 356
    //   345: aload 11
    //   347: ldc 225
    //   349: iconst_1
    //   350: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   353: invokevirtual 194	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   356: aload_0
    //   357: getfield 106	com/admarvel/android/ads/r$d:h	Ljava/lang/String;
    //   360: ifnull +24 -> 384
    //   363: aload_0
    //   364: getfield 106	com/admarvel/android/ads/r$d:h	Ljava/lang/String;
    //   367: invokevirtual 104	java/lang/String:length	()I
    //   370: ifle +14 -> 384
    //   373: aload 11
    //   375: ldc 227
    //   377: aload_0
    //   378: getfield 106	com/admarvel/android/ads/r$d:h	Ljava/lang/String;
    //   381: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   384: new 133	java/lang/StringBuilder
    //   387: dup
    //   388: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   391: aload_0
    //   392: invokevirtual 136	com/admarvel/android/ads/r$d:a	()Ljava/lang/String;
    //   395: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: ldc 229
    //   400: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   406: invokestatic 150	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   409: astore 12
    //   411: new 133	java/lang/StringBuilder
    //   414: dup
    //   415: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   418: aload_0
    //   419: invokevirtual 136	com/admarvel/android/ads/r$d:a	()Ljava/lang/String;
    //   422: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: ldc 231
    //   427: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   433: invokestatic 150	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   436: astore 13
    //   438: aload_3
    //   439: aload 12
    //   441: aload 11
    //   443: invokevirtual 235	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   446: astore 14
    //   448: aload 14
    //   450: ifnull +130 -> 580
    //   453: aload_0
    //   454: getfield 47	com/admarvel/android/ads/r$d:j	I
    //   457: ifgt +67 -> 524
    //   460: new 182	android/content/ContentValues
    //   463: dup
    //   464: invokespecial 183	android/content/ContentValues:<init>	()V
    //   467: astore 15
    //   469: aload 15
    //   471: ldc 237
    //   473: aload 14
    //   475: invokevirtual 240	android/net/Uri:getLastPathSegment	()Ljava/lang/String;
    //   478: invokestatic 244	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   481: invokestatic 72	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   484: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   487: aload 15
    //   489: ldc 246
    //   491: iconst_1
    //   492: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   495: invokevirtual 194	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   498: aload 15
    //   500: ldc 248
    //   502: aload_0
    //   503: getfield 47	com/admarvel/android/ads/r$d:j	I
    //   506: invokestatic 253	java/lang/Math:abs	(I)I
    //   509: invokestatic 190	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   512: invokevirtual 194	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   515: aload_3
    //   516: aload 13
    //   518: aload 15
    //   520: invokevirtual 235	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   523: pop
    //   524: aload_0
    //   525: getfield 108	com/admarvel/android/ads/r$d:i	Ljava/lang/String;
    //   528: ifnull +39 -> 567
    //   531: aload_0
    //   532: getfield 108	com/admarvel/android/ads/r$d:i	Ljava/lang/String;
    //   535: invokevirtual 104	java/lang/String:length	()I
    //   538: ifle +29 -> 567
    //   541: aload_2
    //   542: new 133	java/lang/StringBuilder
    //   545: dup
    //   546: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   549: aload_0
    //   550: getfield 108	com/admarvel/android/ads/r$d:i	Ljava/lang/String;
    //   553: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   556: ldc 255
    //   558: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   561: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   564: invokevirtual 257	com/admarvel/android/ads/d:e	(Ljava/lang/String;)V
    //   567: aload 5
    //   569: ifnull -539 -> 30
    //   572: aload 5
    //   574: invokeinterface 260 1 0
    //   579: return
    //   580: aload_0
    //   581: getfield 108	com/admarvel/android/ads/r$d:i	Ljava/lang/String;
    //   584: ifnull -17 -> 567
    //   587: aload_0
    //   588: getfield 108	com/admarvel/android/ads/r$d:i	Ljava/lang/String;
    //   591: invokevirtual 104	java/lang/String:length	()I
    //   594: ifle -27 -> 567
    //   597: aload_2
    //   598: new 133	java/lang/StringBuilder
    //   601: dup
    //   602: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   605: aload_0
    //   606: getfield 108	com/admarvel/android/ads/r$d:i	Ljava/lang/String;
    //   609: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   612: ldc_w 262
    //   615: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   621: invokevirtual 257	com/admarvel/android/ads/d:e	(Ljava/lang/String;)V
    //   624: goto -57 -> 567
    //   627: astore 4
    //   629: aload_0
    //   630: getfield 108	com/admarvel/android/ads/r$d:i	Ljava/lang/String;
    //   633: ifnull +40 -> 673
    //   636: aload_0
    //   637: getfield 108	com/admarvel/android/ads/r$d:i	Ljava/lang/String;
    //   640: invokevirtual 104	java/lang/String:length	()I
    //   643: ifle +30 -> 673
    //   646: aload_2
    //   647: new 133	java/lang/StringBuilder
    //   650: dup
    //   651: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   654: aload_0
    //   655: getfield 108	com/admarvel/android/ads/r$d:i	Ljava/lang/String;
    //   658: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   661: ldc_w 262
    //   664: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   667: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   670: invokevirtual 257	com/admarvel/android/ads/d:e	(Ljava/lang/String;)V
    //   673: aload 4
    //   675: invokevirtual 97	java/lang/Exception:printStackTrace	()V
    //   678: aload 5
    //   680: ifnull -650 -> 30
    //   683: aload 5
    //   685: invokeinterface 260 1 0
    //   690: return
    //   691: astore 6
    //   693: aconst_null
    //   694: astore 5
    //   696: aload 5
    //   698: ifnull +10 -> 708
    //   701: aload 5
    //   703: invokeinterface 260 1 0
    //   708: aload 6
    //   710: athrow
    //   711: astore 6
    //   713: goto -17 -> 696
    //   716: astore 4
    //   718: aconst_null
    //   719: astore 5
    //   721: goto -92 -> 629
    //
    // Exception table:
    //   from	to	target	type
    //   93	126	627	java/lang/Exception
    //   129	171	627	java/lang/Exception
    //   177	218	627	java/lang/Exception
    //   218	236	627	java/lang/Exception
    //   236	254	627	java/lang/Exception
    //   254	272	627	java/lang/Exception
    //   272	290	627	java/lang/Exception
    //   290	327	627	java/lang/Exception
    //   327	338	627	java/lang/Exception
    //   338	356	627	java/lang/Exception
    //   356	384	627	java/lang/Exception
    //   384	448	627	java/lang/Exception
    //   453	524	627	java/lang/Exception
    //   524	567	627	java/lang/Exception
    //   580	624	627	java/lang/Exception
    //   36	84	691	finally
    //   93	126	711	finally
    //   129	171	711	finally
    //   177	218	711	finally
    //   218	236	711	finally
    //   236	254	711	finally
    //   254	272	711	finally
    //   272	290	711	finally
    //   290	327	711	finally
    //   327	338	711	finally
    //   338	356	711	finally
    //   356	384	711	finally
    //   384	448	711	finally
    //   453	524	711	finally
    //   524	567	711	finally
    //   580	624	711	finally
    //   629	673	711	finally
    //   673	678	711	finally
    //   36	84	716	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.r.d
 * JD-Core Version:    0.6.2
 */