package com.admarvel.android.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

class r$e
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
  String j;
  String k;
  int l = 1;
  int m = 0;
  int n = 0;
  private final WeakReference<Context> o;
  private final WeakReference<d> p;

  public r$e(d paramd, Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.o = new WeakReference(paramContext);
    this.p = new WeakReference(paramd);
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
      localException.printStackTrace();
    }
  }

  public r$e(d paramd, Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt)
  {
    this.o = new WeakReference(paramContext);
    this.p = new WeakReference(paramd);
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
        this.l = (paramInt / 60);
        return;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  // ERROR //
  public r$e(d paramd, Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt2, int paramInt3, String paramString11)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 36	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 38	java/text/SimpleDateFormat
    //   8: dup
    //   9: ldc 40
    //   11: invokespecial 43	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   14: putfield 45	com/admarvel/android/ads/r$e:a	Ljava/text/SimpleDateFormat;
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield 47	com/admarvel/android/ads/r$e:b	Ljava/lang/Long;
    //   22: aload_0
    //   23: aconst_null
    //   24: putfield 49	com/admarvel/android/ads/r$e:c	Ljava/lang/Long;
    //   27: aload_0
    //   28: iconst_1
    //   29: putfield 51	com/admarvel/android/ads/r$e:l	I
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield 53	com/admarvel/android/ads/r$e:m	I
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield 55	com/admarvel/android/ads/r$e:n	I
    //   42: aload_0
    //   43: new 57	java/lang/ref/WeakReference
    //   46: dup
    //   47: aload_2
    //   48: invokespecial 60	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   51: putfield 62	com/admarvel/android/ads/r$e:o	Ljava/lang/ref/WeakReference;
    //   54: aload_0
    //   55: new 57	java/lang/ref/WeakReference
    //   58: dup
    //   59: aload_1
    //   60: invokespecial 60	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   63: putfield 64	com/admarvel/android/ads/r$e:p	Ljava/lang/ref/WeakReference;
    //   66: aload_3
    //   67: ifnull +21 -> 88
    //   70: aload_0
    //   71: aload_0
    //   72: getfield 45	com/admarvel/android/ads/r$e:a	Ljava/text/SimpleDateFormat;
    //   75: aload_3
    //   76: invokevirtual 68	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   79: invokevirtual 74	java/util/Date:getTime	()J
    //   82: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   85: putfield 47	com/admarvel/android/ads/r$e:b	Ljava/lang/Long;
    //   88: aload 8
    //   90: ifnull +193 -> 283
    //   93: aload_0
    //   94: aload_0
    //   95: getfield 45	com/admarvel/android/ads/r$e:a	Ljava/text/SimpleDateFormat;
    //   98: aload 8
    //   100: invokevirtual 68	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   103: invokevirtual 74	java/util/Date:getTime	()J
    //   106: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   109: putfield 49	com/admarvel/android/ads/r$e:c	Ljava/lang/Long;
    //   112: aload_0
    //   113: aload 4
    //   115: putfield 84	com/admarvel/android/ads/r$e:d	Ljava/lang/String;
    //   118: aload_0
    //   119: aload 5
    //   121: putfield 86	com/admarvel/android/ads/r$e:e	Ljava/lang/String;
    //   124: aload_0
    //   125: aload 6
    //   127: putfield 92	com/admarvel/android/ads/r$e:f	Ljava/lang/String;
    //   130: aload_0
    //   131: aload 7
    //   133: putfield 94	com/admarvel/android/ads/r$e:g	Ljava/lang/String;
    //   136: iload 9
    //   138: ifgt +12 -> 150
    //   141: aload_0
    //   142: iload 9
    //   144: bipush 60
    //   146: idiv
    //   147: putfield 51	com/admarvel/android/ads/r$e:l	I
    //   150: aload 10
    //   152: ifnull +100 -> 252
    //   155: aload 10
    //   157: invokevirtual 101	java/lang/String:length	()I
    //   160: istore 18
    //   162: iload 18
    //   164: ifle +88 -> 252
    //   167: aload 10
    //   169: ldc 103
    //   171: invokevirtual 107	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   174: astore 20
    //   176: aload 20
    //   178: arraylength
    //   179: iconst_2
    //   180: if_icmpne +184 -> 364
    //   183: aload 20
    //   185: iconst_0
    //   186: aaload
    //   187: ldc 109
    //   189: invokevirtual 113	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   192: ifeq +124 -> 316
    //   195: bipush 60
    //   197: aload 20
    //   199: iconst_0
    //   200: aaload
    //   201: iconst_1
    //   202: invokevirtual 117	java/lang/String:substring	(I)Ljava/lang/String;
    //   205: invokestatic 123	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   208: imul
    //   209: aload 20
    //   211: iconst_1
    //   212: aaload
    //   213: invokestatic 123	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   216: iadd
    //   217: istore 22
    //   219: sipush 1000
    //   222: iload 22
    //   224: bipush 60
    //   226: imul
    //   227: imul
    //   228: invokestatic 129	java/util/TimeZone:getAvailableIDs	(I)[Ljava/lang/String;
    //   231: astore 25
    //   233: aload 25
    //   235: ifnull +17 -> 252
    //   238: aload 25
    //   240: arraylength
    //   241: ifle +11 -> 252
    //   244: aload_0
    //   245: aload 25
    //   247: iconst_0
    //   248: aaload
    //   249: putfield 131	com/admarvel/android/ads/r$e:h	Ljava/lang/String;
    //   252: aload_0
    //   253: aload 12
    //   255: putfield 133	com/admarvel/android/ads/r$e:i	Ljava/lang/String;
    //   258: aload_0
    //   259: aload 13
    //   261: putfield 135	com/admarvel/android/ads/r$e:j	Ljava/lang/String;
    //   264: aload_0
    //   265: aload 16
    //   267: putfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   270: aload_0
    //   271: iload 14
    //   273: putfield 53	com/admarvel/android/ads/r$e:m	I
    //   276: aload_0
    //   277: iload 15
    //   279: putfield 55	com/admarvel/android/ads/r$e:n	I
    //   282: return
    //   283: aload_0
    //   284: ldc2_w 81
    //   287: aload_0
    //   288: getfield 45	com/admarvel/android/ads/r$e:a	Ljava/text/SimpleDateFormat;
    //   291: aload_3
    //   292: invokevirtual 68	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   295: invokevirtual 74	java/util/Date:getTime	()J
    //   298: ladd
    //   299: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   302: putfield 49	com/admarvel/android/ads/r$e:c	Ljava/lang/Long;
    //   305: goto -193 -> 112
    //   308: astore 17
    //   310: aload 17
    //   312: invokevirtual 89	java/lang/Exception:printStackTrace	()V
    //   315: return
    //   316: aload 20
    //   318: iconst_0
    //   319: aaload
    //   320: ldc 139
    //   322: invokevirtual 113	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   325: istore 26
    //   327: iconst_0
    //   328: istore 22
    //   330: iload 26
    //   332: ifeq -113 -> 219
    //   335: iconst_m1
    //   336: bipush 60
    //   338: aload 20
    //   340: iconst_0
    //   341: aaload
    //   342: iconst_1
    //   343: invokevirtual 117	java/lang/String:substring	(I)Ljava/lang/String;
    //   346: invokestatic 123	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   349: imul
    //   350: aload 20
    //   352: iconst_1
    //   353: aaload
    //   354: invokestatic 123	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   357: iadd
    //   358: imul
    //   359: istore 22
    //   361: goto -142 -> 219
    //   364: aload 20
    //   366: arraylength
    //   367: istore 21
    //   369: iconst_0
    //   370: istore 22
    //   372: iload 21
    //   374: iconst_1
    //   375: if_icmpne -156 -> 219
    //   378: aload 20
    //   380: iconst_0
    //   381: aaload
    //   382: ldc 109
    //   384: invokevirtual 113	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   387: ifeq +22 -> 409
    //   390: bipush 60
    //   392: aload 20
    //   394: iconst_0
    //   395: aaload
    //   396: iconst_1
    //   397: invokevirtual 117	java/lang/String:substring	(I)Ljava/lang/String;
    //   400: invokestatic 123	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   403: imul
    //   404: istore 22
    //   406: goto -187 -> 219
    //   409: aload 20
    //   411: iconst_0
    //   412: aaload
    //   413: ldc 139
    //   415: invokevirtual 113	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   418: istore 23
    //   420: iconst_0
    //   421: istore 22
    //   423: iload 23
    //   425: ifeq -206 -> 219
    //   428: aload 20
    //   430: iconst_0
    //   431: aaload
    //   432: iconst_1
    //   433: invokevirtual 117	java/lang/String:substring	(I)Ljava/lang/String;
    //   436: invokestatic 123	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   439: istore 24
    //   441: iconst_m1
    //   442: iload 24
    //   444: bipush 60
    //   446: imul
    //   447: imul
    //   448: istore 22
    //   450: goto -231 -> 219
    //   453: astore 19
    //   455: aload 19
    //   457: invokevirtual 89	java/lang/Exception:printStackTrace	()V
    //   460: goto -208 -> 252
    //
    // Exception table:
    //   from	to	target	type
    //   70	88	308	java/lang/Exception
    //   93	112	308	java/lang/Exception
    //   112	136	308	java/lang/Exception
    //   141	150	308	java/lang/Exception
    //   155	162	308	java/lang/Exception
    //   252	282	308	java/lang/Exception
    //   283	305	308	java/lang/Exception
    //   455	460	308	java/lang/Exception
    //   167	219	453	java/lang/Exception
    //   219	233	453	java/lang/Exception
    //   238	252	453	java/lang/Exception
    //   316	327	453	java/lang/Exception
    //   335	361	453	java/lang/Exception
    //   364	369	453	java/lang/Exception
    //   378	406	453	java/lang/Exception
    //   409	420	453	java/lang/Exception
    //   428	441	453	java/lang/Exception
  }

  // ERROR //
  @android.annotation.TargetApi(14)
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 62	com/admarvel/android/ads/r$e:o	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 147	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 149	android/content/Context
    //   10: astore_1
    //   11: aload_0
    //   12: getfield 64	com/admarvel/android/ads/r$e:p	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 147	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 151	com/admarvel/android/ads/d
    //   21: astore_2
    //   22: aload_1
    //   23: ifnull +7 -> 30
    //   26: aload_2
    //   27: ifnonnull +4 -> 31
    //   30: return
    //   31: aload_1
    //   32: invokevirtual 155	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   35: astore_3
    //   36: aload_3
    //   37: getstatic 161	android/provider/CalendarContract$Calendars:CONTENT_URI	Landroid/net/Uri;
    //   40: iconst_2
    //   41: anewarray 97	java/lang/String
    //   44: dup
    //   45: iconst_0
    //   46: ldc 163
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: ldc 165
    //   53: aastore
    //   54: aconst_null
    //   55: aconst_null
    //   56: aconst_null
    //   57: invokevirtual 171	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   60: astore 7
    //   62: aload 7
    //   64: astore 5
    //   66: aload 5
    //   68: ifnull +669 -> 737
    //   71: aload 5
    //   73: invokeinterface 177 1 0
    //   78: ifeq +659 -> 737
    //   81: aload 5
    //   83: invokeinterface 180 1 0
    //   88: anewarray 97	java/lang/String
    //   91: astore 8
    //   93: aload 5
    //   95: invokeinterface 180 1 0
    //   100: newarray int
    //   102: astore 9
    //   104: iconst_0
    //   105: istore 10
    //   107: iload 10
    //   109: aload 8
    //   111: arraylength
    //   112: if_icmpge +43 -> 155
    //   115: aload 9
    //   117: iload 10
    //   119: aload 5
    //   121: iconst_0
    //   122: invokeinterface 184 2 0
    //   127: iastore
    //   128: aload 8
    //   130: iload 10
    //   132: aload 5
    //   134: iconst_1
    //   135: invokeinterface 187 2 0
    //   140: aastore
    //   141: aload 5
    //   143: invokeinterface 190 1 0
    //   148: pop
    //   149: iinc 10 1
    //   152: goto -45 -> 107
    //   155: new 192	android/content/ContentValues
    //   158: dup
    //   159: invokespecial 193	android/content/ContentValues:<init>	()V
    //   162: astore 11
    //   164: aload 11
    //   166: ldc 195
    //   168: aload 9
    //   170: iconst_0
    //   171: iaload
    //   172: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   175: invokevirtual 202	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   178: aload_0
    //   179: getfield 84	com/admarvel/android/ads/r$e:d	Ljava/lang/String;
    //   182: ifnull +14 -> 196
    //   185: aload 11
    //   187: ldc 204
    //   189: aload_0
    //   190: getfield 84	com/admarvel/android/ads/r$e:d	Ljava/lang/String;
    //   193: invokevirtual 207	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   196: aload_0
    //   197: getfield 86	com/admarvel/android/ads/r$e:e	Ljava/lang/String;
    //   200: ifnull +14 -> 214
    //   203: aload 11
    //   205: ldc 209
    //   207: aload_0
    //   208: getfield 86	com/admarvel/android/ads/r$e:e	Ljava/lang/String;
    //   211: invokevirtual 207	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   214: aload_0
    //   215: getfield 92	com/admarvel/android/ads/r$e:f	Ljava/lang/String;
    //   218: ifnull +14 -> 232
    //   221: aload 11
    //   223: ldc 211
    //   225: aload_0
    //   226: getfield 92	com/admarvel/android/ads/r$e:f	Ljava/lang/String;
    //   229: invokevirtual 207	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   232: aload_0
    //   233: getfield 47	com/admarvel/android/ads/r$e:b	Ljava/lang/Long;
    //   236: ifnull +14 -> 250
    //   239: aload 11
    //   241: ldc 213
    //   243: aload_0
    //   244: getfield 47	com/admarvel/android/ads/r$e:b	Ljava/lang/Long;
    //   247: invokevirtual 216	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   250: aload_0
    //   251: getfield 49	com/admarvel/android/ads/r$e:c	Ljava/lang/Long;
    //   254: ifnull +14 -> 268
    //   257: aload 11
    //   259: ldc 218
    //   261: aload_0
    //   262: getfield 49	com/admarvel/android/ads/r$e:c	Ljava/lang/Long;
    //   265: invokevirtual 216	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   268: aload_0
    //   269: getfield 94	com/admarvel/android/ads/r$e:g	Ljava/lang/String;
    //   272: ifnull +44 -> 316
    //   275: aload_0
    //   276: getfield 94	com/admarvel/android/ads/r$e:g	Ljava/lang/String;
    //   279: invokevirtual 222	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   282: ldc 224
    //   284: invokevirtual 228	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   287: ifne +18 -> 305
    //   290: aload_0
    //   291: getfield 94	com/admarvel/android/ads/r$e:g	Ljava/lang/String;
    //   294: invokevirtual 222	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   297: ldc 230
    //   299: invokevirtual 228	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   302: ifeq +14 -> 316
    //   305: aload 11
    //   307: ldc 232
    //   309: iconst_1
    //   310: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   313: invokevirtual 202	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   316: aload_0
    //   317: getfield 51	com/admarvel/android/ads/r$e:l	I
    //   320: ifgt +14 -> 334
    //   323: aload 11
    //   325: ldc 234
    //   327: iconst_1
    //   328: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   331: invokevirtual 202	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   334: aload_0
    //   335: getfield 131	com/admarvel/android/ads/r$e:h	Ljava/lang/String;
    //   338: ifnull +255 -> 593
    //   341: aload_0
    //   342: getfield 131	com/admarvel/android/ads/r$e:h	Ljava/lang/String;
    //   345: invokevirtual 101	java/lang/String:length	()I
    //   348: ifle +245 -> 593
    //   351: aload 11
    //   353: ldc 236
    //   355: aload_0
    //   356: getfield 131	com/admarvel/android/ads/r$e:h	Ljava/lang/String;
    //   359: invokevirtual 207	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   362: aload_0
    //   363: getfield 133	com/admarvel/android/ads/r$e:i	Ljava/lang/String;
    //   366: ifnull +24 -> 390
    //   369: aload_0
    //   370: getfield 133	com/admarvel/android/ads/r$e:i	Ljava/lang/String;
    //   373: invokevirtual 101	java/lang/String:length	()I
    //   376: ifle +14 -> 390
    //   379: aload 11
    //   381: ldc 238
    //   383: aload_0
    //   384: getfield 133	com/admarvel/android/ads/r$e:i	Ljava/lang/String;
    //   387: invokevirtual 207	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   390: aload_0
    //   391: getfield 135	com/admarvel/android/ads/r$e:j	Ljava/lang/String;
    //   394: ifnull +24 -> 418
    //   397: aload_0
    //   398: getfield 135	com/admarvel/android/ads/r$e:j	Ljava/lang/String;
    //   401: invokevirtual 101	java/lang/String:length	()I
    //   404: ifle +14 -> 418
    //   407: aload 11
    //   409: ldc 240
    //   411: aload_0
    //   412: getfield 135	com/admarvel/android/ads/r$e:j	Ljava/lang/String;
    //   415: invokevirtual 207	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   418: aload 11
    //   420: ldc 242
    //   422: aload_0
    //   423: getfield 53	com/admarvel/android/ads/r$e:m	I
    //   426: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   429: invokevirtual 202	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   432: aload 11
    //   434: ldc 244
    //   436: aload_0
    //   437: getfield 55	com/admarvel/android/ads/r$e:n	I
    //   440: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   443: invokevirtual 202	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   446: aload_3
    //   447: getstatic 247	android/provider/CalendarContract$Events:CONTENT_URI	Landroid/net/Uri;
    //   450: aload 11
    //   452: invokevirtual 251	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   455: astore 12
    //   457: aload 12
    //   459: ifnull +214 -> 673
    //   462: aload_0
    //   463: getfield 51	com/admarvel/android/ads/r$e:l	I
    //   466: ifgt +70 -> 536
    //   469: new 192	android/content/ContentValues
    //   472: dup
    //   473: invokespecial 193	android/content/ContentValues:<init>	()V
    //   476: astore 13
    //   478: aload 13
    //   480: ldc 253
    //   482: aload 12
    //   484: invokevirtual 258	android/net/Uri:getLastPathSegment	()Ljava/lang/String;
    //   487: invokestatic 262	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   490: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   493: invokevirtual 216	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   496: aload 13
    //   498: ldc_w 264
    //   501: iconst_1
    //   502: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   505: invokevirtual 202	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   508: aload 13
    //   510: ldc_w 266
    //   513: aload_0
    //   514: getfield 51	com/admarvel/android/ads/r$e:l	I
    //   517: invokestatic 271	java/lang/Math:abs	(I)I
    //   520: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   523: invokevirtual 202	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   526: aload_3
    //   527: getstatic 274	android/provider/CalendarContract$Reminders:CONTENT_URI	Landroid/net/Uri;
    //   530: aload 13
    //   532: invokevirtual 251	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   535: pop
    //   536: aload_0
    //   537: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   540: ifnull +40 -> 580
    //   543: aload_0
    //   544: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   547: invokevirtual 101	java/lang/String:length	()I
    //   550: ifle +30 -> 580
    //   553: aload_2
    //   554: new 276	java/lang/StringBuilder
    //   557: dup
    //   558: invokespecial 277	java/lang/StringBuilder:<init>	()V
    //   561: aload_0
    //   562: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   565: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   568: ldc_w 283
    //   571: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   574: invokevirtual 286	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   577: invokevirtual 288	com/admarvel/android/ads/d:e	(Ljava/lang/String;)V
    //   580: aload 5
    //   582: ifnull -552 -> 30
    //   585: aload 5
    //   587: invokeinterface 291 1 0
    //   592: return
    //   593: aload 11
    //   595: ldc 236
    //   597: invokestatic 295	java/util/TimeZone:getDefault	()Ljava/util/TimeZone;
    //   600: invokevirtual 298	java/util/TimeZone:getID	()Ljava/lang/String;
    //   603: invokevirtual 207	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   606: goto -244 -> 362
    //   609: astore 4
    //   611: aload 4
    //   613: invokevirtual 89	java/lang/Exception:printStackTrace	()V
    //   616: aload_0
    //   617: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   620: ifnull +40 -> 660
    //   623: aload_0
    //   624: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   627: invokevirtual 101	java/lang/String:length	()I
    //   630: ifle +30 -> 660
    //   633: aload_2
    //   634: new 276	java/lang/StringBuilder
    //   637: dup
    //   638: invokespecial 277	java/lang/StringBuilder:<init>	()V
    //   641: aload_0
    //   642: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   645: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   648: ldc_w 300
    //   651: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   654: invokevirtual 286	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   657: invokevirtual 288	com/admarvel/android/ads/d:e	(Ljava/lang/String;)V
    //   660: aload 5
    //   662: ifnull -632 -> 30
    //   665: aload 5
    //   667: invokeinterface 291 1 0
    //   672: return
    //   673: aload_0
    //   674: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   677: ifnull -97 -> 580
    //   680: aload_0
    //   681: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   684: invokevirtual 101	java/lang/String:length	()I
    //   687: ifle -107 -> 580
    //   690: aload_2
    //   691: new 276	java/lang/StringBuilder
    //   694: dup
    //   695: invokespecial 277	java/lang/StringBuilder:<init>	()V
    //   698: aload_0
    //   699: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   702: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   705: ldc_w 300
    //   708: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   711: invokevirtual 286	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   714: invokevirtual 288	com/admarvel/android/ads/d:e	(Ljava/lang/String;)V
    //   717: goto -137 -> 580
    //   720: astore 6
    //   722: aload 5
    //   724: ifnull +10 -> 734
    //   727: aload 5
    //   729: invokeinterface 291 1 0
    //   734: aload 6
    //   736: athrow
    //   737: aload_0
    //   738: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   741: ifnull -161 -> 580
    //   744: aload_0
    //   745: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   748: invokevirtual 101	java/lang/String:length	()I
    //   751: ifle -171 -> 580
    //   754: aload_2
    //   755: new 276	java/lang/StringBuilder
    //   758: dup
    //   759: invokespecial 277	java/lang/StringBuilder:<init>	()V
    //   762: aload_0
    //   763: getfield 137	com/admarvel/android/ads/r$e:k	Ljava/lang/String;
    //   766: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   769: ldc_w 300
    //   772: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   775: invokevirtual 286	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   778: invokevirtual 288	com/admarvel/android/ads/d:e	(Ljava/lang/String;)V
    //   781: goto -201 -> 580
    //   784: astore 6
    //   786: aconst_null
    //   787: astore 5
    //   789: goto -67 -> 722
    //   792: astore 4
    //   794: aconst_null
    //   795: astore 5
    //   797: goto -186 -> 611
    //
    // Exception table:
    //   from	to	target	type
    //   71	104	609	java/lang/Exception
    //   107	149	609	java/lang/Exception
    //   155	196	609	java/lang/Exception
    //   196	214	609	java/lang/Exception
    //   214	232	609	java/lang/Exception
    //   232	250	609	java/lang/Exception
    //   250	268	609	java/lang/Exception
    //   268	305	609	java/lang/Exception
    //   305	316	609	java/lang/Exception
    //   316	334	609	java/lang/Exception
    //   334	362	609	java/lang/Exception
    //   362	390	609	java/lang/Exception
    //   390	418	609	java/lang/Exception
    //   418	457	609	java/lang/Exception
    //   462	536	609	java/lang/Exception
    //   536	580	609	java/lang/Exception
    //   593	606	609	java/lang/Exception
    //   673	717	609	java/lang/Exception
    //   737	781	609	java/lang/Exception
    //   71	104	720	finally
    //   107	149	720	finally
    //   155	196	720	finally
    //   196	214	720	finally
    //   214	232	720	finally
    //   232	250	720	finally
    //   250	268	720	finally
    //   268	305	720	finally
    //   305	316	720	finally
    //   316	334	720	finally
    //   334	362	720	finally
    //   362	390	720	finally
    //   390	418	720	finally
    //   418	457	720	finally
    //   462	536	720	finally
    //   536	580	720	finally
    //   593	606	720	finally
    //   611	660	720	finally
    //   673	717	720	finally
    //   737	781	720	finally
    //   36	62	784	finally
    //   36	62	792	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.r.e
 * JD-Core Version:    0.6.2
 */