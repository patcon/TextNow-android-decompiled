package com.admarvel.android.ads;

import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

class AdMarvelWebView$l
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
  private final WeakReference<AdMarvelWebView> o;
  private final WeakReference<AdMarvelInternalWebView> p;

  public AdMarvelWebView$l(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelWebView paramAdMarvelWebView, String paramString1, String paramString2, String paramString3)
  {
    this.o = new WeakReference(paramAdMarvelWebView);
    this.p = new WeakReference(paramAdMarvelInternalWebView);
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

  public AdMarvelWebView$l(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelWebView paramAdMarvelWebView, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt)
  {
    this.o = new WeakReference(paramAdMarvelWebView);
    this.p = new WeakReference(paramAdMarvelInternalWebView);
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
  public AdMarvelWebView$l(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelWebView paramAdMarvelWebView, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt2, int paramInt3, String paramString11)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 36	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 38	java/text/SimpleDateFormat
    //   8: dup
    //   9: ldc 40
    //   11: invokespecial 43	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   14: putfield 45	com/admarvel/android/ads/AdMarvelWebView$l:a	Ljava/text/SimpleDateFormat;
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield 47	com/admarvel/android/ads/AdMarvelWebView$l:b	Ljava/lang/Long;
    //   22: aload_0
    //   23: aconst_null
    //   24: putfield 49	com/admarvel/android/ads/AdMarvelWebView$l:c	Ljava/lang/Long;
    //   27: aload_0
    //   28: iconst_1
    //   29: putfield 51	com/admarvel/android/ads/AdMarvelWebView$l:l	I
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield 53	com/admarvel/android/ads/AdMarvelWebView$l:m	I
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield 55	com/admarvel/android/ads/AdMarvelWebView$l:n	I
    //   42: aload_0
    //   43: new 57	java/lang/ref/WeakReference
    //   46: dup
    //   47: aload_2
    //   48: invokespecial 60	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   51: putfield 62	com/admarvel/android/ads/AdMarvelWebView$l:o	Ljava/lang/ref/WeakReference;
    //   54: aload_0
    //   55: new 57	java/lang/ref/WeakReference
    //   58: dup
    //   59: aload_1
    //   60: invokespecial 60	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   63: putfield 64	com/admarvel/android/ads/AdMarvelWebView$l:p	Ljava/lang/ref/WeakReference;
    //   66: aload_3
    //   67: ifnull +21 -> 88
    //   70: aload_0
    //   71: aload_0
    //   72: getfield 45	com/admarvel/android/ads/AdMarvelWebView$l:a	Ljava/text/SimpleDateFormat;
    //   75: aload_3
    //   76: invokevirtual 68	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   79: invokevirtual 74	java/util/Date:getTime	()J
    //   82: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   85: putfield 47	com/admarvel/android/ads/AdMarvelWebView$l:b	Ljava/lang/Long;
    //   88: aload 8
    //   90: ifnull +193 -> 283
    //   93: aload_0
    //   94: aload_0
    //   95: getfield 45	com/admarvel/android/ads/AdMarvelWebView$l:a	Ljava/text/SimpleDateFormat;
    //   98: aload 8
    //   100: invokevirtual 68	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   103: invokevirtual 74	java/util/Date:getTime	()J
    //   106: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   109: putfield 49	com/admarvel/android/ads/AdMarvelWebView$l:c	Ljava/lang/Long;
    //   112: aload_0
    //   113: aload 4
    //   115: putfield 84	com/admarvel/android/ads/AdMarvelWebView$l:d	Ljava/lang/String;
    //   118: aload_0
    //   119: aload 5
    //   121: putfield 86	com/admarvel/android/ads/AdMarvelWebView$l:e	Ljava/lang/String;
    //   124: aload_0
    //   125: aload 6
    //   127: putfield 92	com/admarvel/android/ads/AdMarvelWebView$l:f	Ljava/lang/String;
    //   130: aload_0
    //   131: aload 7
    //   133: putfield 94	com/admarvel/android/ads/AdMarvelWebView$l:g	Ljava/lang/String;
    //   136: iload 9
    //   138: ifgt +12 -> 150
    //   141: aload_0
    //   142: iload 9
    //   144: bipush 60
    //   146: idiv
    //   147: putfield 51	com/admarvel/android/ads/AdMarvelWebView$l:l	I
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
    //   249: putfield 131	com/admarvel/android/ads/AdMarvelWebView$l:h	Ljava/lang/String;
    //   252: aload_0
    //   253: aload 12
    //   255: putfield 133	com/admarvel/android/ads/AdMarvelWebView$l:i	Ljava/lang/String;
    //   258: aload_0
    //   259: aload 13
    //   261: putfield 135	com/admarvel/android/ads/AdMarvelWebView$l:j	Ljava/lang/String;
    //   264: aload_0
    //   265: aload 16
    //   267: putfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   270: aload_0
    //   271: iload 14
    //   273: putfield 53	com/admarvel/android/ads/AdMarvelWebView$l:m	I
    //   276: aload_0
    //   277: iload 15
    //   279: putfield 55	com/admarvel/android/ads/AdMarvelWebView$l:n	I
    //   282: return
    //   283: aload_0
    //   284: ldc2_w 81
    //   287: aload_0
    //   288: getfield 45	com/admarvel/android/ads/AdMarvelWebView$l:a	Ljava/text/SimpleDateFormat;
    //   291: aload_3
    //   292: invokevirtual 68	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   295: invokevirtual 74	java/util/Date:getTime	()J
    //   298: ladd
    //   299: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   302: putfield 49	com/admarvel/android/ads/AdMarvelWebView$l:c	Ljava/lang/Long;
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
    //   1: getfield 62	com/admarvel/android/ads/AdMarvelWebView$l:o	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 147	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 149	com/admarvel/android/ads/AdMarvelWebView
    //   10: astore_1
    //   11: aload_0
    //   12: getfield 64	com/admarvel/android/ads/AdMarvelWebView$l:p	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 147	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 151	com/admarvel/android/ads/AdMarvelInternalWebView
    //   21: astore_2
    //   22: aload_1
    //   23: ifnull +7 -> 30
    //   26: aload_2
    //   27: ifnonnull +4 -> 31
    //   30: return
    //   31: aload_1
    //   32: invokevirtual 155	com/admarvel/android/ads/AdMarvelWebView:getContext	()Landroid/content/Context;
    //   35: invokevirtual 161	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   38: astore_3
    //   39: aload_3
    //   40: getstatic 167	android/provider/CalendarContract$Calendars:CONTENT_URI	Landroid/net/Uri;
    //   43: iconst_2
    //   44: anewarray 97	java/lang/String
    //   47: dup
    //   48: iconst_0
    //   49: ldc 169
    //   51: aastore
    //   52: dup
    //   53: iconst_1
    //   54: ldc 171
    //   56: aastore
    //   57: aconst_null
    //   58: aconst_null
    //   59: aconst_null
    //   60: invokevirtual 177	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   63: astore 7
    //   65: aload 7
    //   67: astore 5
    //   69: aload 5
    //   71: ifnull +688 -> 759
    //   74: aload 5
    //   76: invokeinterface 183 1 0
    //   81: ifeq +678 -> 759
    //   84: aload 5
    //   86: invokeinterface 186 1 0
    //   91: anewarray 97	java/lang/String
    //   94: astore 8
    //   96: aload 5
    //   98: invokeinterface 186 1 0
    //   103: newarray int
    //   105: astore 9
    //   107: iconst_0
    //   108: istore 10
    //   110: iload 10
    //   112: aload 8
    //   114: arraylength
    //   115: if_icmpge +43 -> 158
    //   118: aload 9
    //   120: iload 10
    //   122: aload 5
    //   124: iconst_0
    //   125: invokeinterface 190 2 0
    //   130: iastore
    //   131: aload 8
    //   133: iload 10
    //   135: aload 5
    //   137: iconst_1
    //   138: invokeinterface 193 2 0
    //   143: aastore
    //   144: aload 5
    //   146: invokeinterface 196 1 0
    //   151: pop
    //   152: iinc 10 1
    //   155: goto -45 -> 110
    //   158: new 198	android/content/ContentValues
    //   161: dup
    //   162: invokespecial 199	android/content/ContentValues:<init>	()V
    //   165: astore 11
    //   167: aload 11
    //   169: ldc 201
    //   171: aload 9
    //   173: iconst_0
    //   174: iaload
    //   175: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   178: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   181: aload_0
    //   182: getfield 84	com/admarvel/android/ads/AdMarvelWebView$l:d	Ljava/lang/String;
    //   185: ifnull +14 -> 199
    //   188: aload 11
    //   190: ldc 210
    //   192: aload_0
    //   193: getfield 84	com/admarvel/android/ads/AdMarvelWebView$l:d	Ljava/lang/String;
    //   196: invokevirtual 213	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   199: aload_0
    //   200: getfield 86	com/admarvel/android/ads/AdMarvelWebView$l:e	Ljava/lang/String;
    //   203: ifnull +14 -> 217
    //   206: aload 11
    //   208: ldc 215
    //   210: aload_0
    //   211: getfield 86	com/admarvel/android/ads/AdMarvelWebView$l:e	Ljava/lang/String;
    //   214: invokevirtual 213	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   217: aload_0
    //   218: getfield 92	com/admarvel/android/ads/AdMarvelWebView$l:f	Ljava/lang/String;
    //   221: ifnull +14 -> 235
    //   224: aload 11
    //   226: ldc 217
    //   228: aload_0
    //   229: getfield 92	com/admarvel/android/ads/AdMarvelWebView$l:f	Ljava/lang/String;
    //   232: invokevirtual 213	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   235: aload_0
    //   236: getfield 47	com/admarvel/android/ads/AdMarvelWebView$l:b	Ljava/lang/Long;
    //   239: ifnull +14 -> 253
    //   242: aload 11
    //   244: ldc 219
    //   246: aload_0
    //   247: getfield 47	com/admarvel/android/ads/AdMarvelWebView$l:b	Ljava/lang/Long;
    //   250: invokevirtual 222	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   253: aload_0
    //   254: getfield 49	com/admarvel/android/ads/AdMarvelWebView$l:c	Ljava/lang/Long;
    //   257: ifnull +14 -> 271
    //   260: aload 11
    //   262: ldc 224
    //   264: aload_0
    //   265: getfield 49	com/admarvel/android/ads/AdMarvelWebView$l:c	Ljava/lang/Long;
    //   268: invokevirtual 222	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   271: aload_0
    //   272: getfield 94	com/admarvel/android/ads/AdMarvelWebView$l:g	Ljava/lang/String;
    //   275: ifnull +44 -> 319
    //   278: aload_0
    //   279: getfield 94	com/admarvel/android/ads/AdMarvelWebView$l:g	Ljava/lang/String;
    //   282: invokevirtual 228	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   285: ldc 230
    //   287: invokevirtual 234	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   290: ifne +18 -> 308
    //   293: aload_0
    //   294: getfield 94	com/admarvel/android/ads/AdMarvelWebView$l:g	Ljava/lang/String;
    //   297: invokevirtual 228	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   300: ldc 236
    //   302: invokevirtual 234	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   305: ifeq +14 -> 319
    //   308: aload 11
    //   310: ldc 238
    //   312: iconst_1
    //   313: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   316: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   319: aload_0
    //   320: getfield 51	com/admarvel/android/ads/AdMarvelWebView$l:l	I
    //   323: ifgt +14 -> 337
    //   326: aload 11
    //   328: ldc 240
    //   330: iconst_1
    //   331: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   334: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   337: aload_0
    //   338: getfield 131	com/admarvel/android/ads/AdMarvelWebView$l:h	Ljava/lang/String;
    //   341: ifnull +262 -> 603
    //   344: aload_0
    //   345: getfield 131	com/admarvel/android/ads/AdMarvelWebView$l:h	Ljava/lang/String;
    //   348: invokevirtual 101	java/lang/String:length	()I
    //   351: ifle +252 -> 603
    //   354: aload 11
    //   356: ldc 242
    //   358: aload_0
    //   359: getfield 131	com/admarvel/android/ads/AdMarvelWebView$l:h	Ljava/lang/String;
    //   362: invokevirtual 213	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   365: aload_0
    //   366: getfield 133	com/admarvel/android/ads/AdMarvelWebView$l:i	Ljava/lang/String;
    //   369: ifnull +24 -> 393
    //   372: aload_0
    //   373: getfield 133	com/admarvel/android/ads/AdMarvelWebView$l:i	Ljava/lang/String;
    //   376: invokevirtual 101	java/lang/String:length	()I
    //   379: ifle +14 -> 393
    //   382: aload 11
    //   384: ldc 244
    //   386: aload_0
    //   387: getfield 133	com/admarvel/android/ads/AdMarvelWebView$l:i	Ljava/lang/String;
    //   390: invokevirtual 213	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   393: aload_0
    //   394: getfield 135	com/admarvel/android/ads/AdMarvelWebView$l:j	Ljava/lang/String;
    //   397: ifnull +24 -> 421
    //   400: aload_0
    //   401: getfield 135	com/admarvel/android/ads/AdMarvelWebView$l:j	Ljava/lang/String;
    //   404: invokevirtual 101	java/lang/String:length	()I
    //   407: ifle +14 -> 421
    //   410: aload 11
    //   412: ldc 246
    //   414: aload_0
    //   415: getfield 135	com/admarvel/android/ads/AdMarvelWebView$l:j	Ljava/lang/String;
    //   418: invokevirtual 213	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   421: aload 11
    //   423: ldc 248
    //   425: aload_0
    //   426: getfield 53	com/admarvel/android/ads/AdMarvelWebView$l:m	I
    //   429: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   432: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   435: aload 11
    //   437: ldc 250
    //   439: aload_0
    //   440: getfield 55	com/admarvel/android/ads/AdMarvelWebView$l:n	I
    //   443: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   446: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   449: aload_3
    //   450: getstatic 253	android/provider/CalendarContract$Events:CONTENT_URI	Landroid/net/Uri;
    //   453: aload 11
    //   455: invokevirtual 257	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   458: astore 12
    //   460: aload 12
    //   462: ifnull +227 -> 689
    //   465: aload_0
    //   466: getfield 51	com/admarvel/android/ads/AdMarvelWebView$l:l	I
    //   469: ifgt +71 -> 540
    //   472: new 198	android/content/ContentValues
    //   475: dup
    //   476: invokespecial 199	android/content/ContentValues:<init>	()V
    //   479: astore 13
    //   481: aload 13
    //   483: ldc_w 259
    //   486: aload 12
    //   488: invokevirtual 264	android/net/Uri:getLastPathSegment	()Ljava/lang/String;
    //   491: invokestatic 268	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   494: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   497: invokevirtual 222	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   500: aload 13
    //   502: ldc_w 270
    //   505: iconst_1
    //   506: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   509: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   512: aload 13
    //   514: ldc_w 272
    //   517: aload_0
    //   518: getfield 51	com/admarvel/android/ads/AdMarvelWebView$l:l	I
    //   521: invokestatic 277	java/lang/Math:abs	(I)I
    //   524: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   527: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   530: aload_3
    //   531: getstatic 280	android/provider/CalendarContract$Reminders:CONTENT_URI	Landroid/net/Uri;
    //   534: aload 13
    //   536: invokevirtual 257	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   539: pop
    //   540: aload_0
    //   541: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   544: ifnull +46 -> 590
    //   547: aload_0
    //   548: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   551: invokevirtual 101	java/lang/String:length	()I
    //   554: ifle +36 -> 590
    //   557: aload_2
    //   558: new 282	java/lang/StringBuilder
    //   561: dup
    //   562: invokespecial 283	java/lang/StringBuilder:<init>	()V
    //   565: ldc_w 285
    //   568: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   571: aload_0
    //   572: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   575: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   578: ldc_w 291
    //   581: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: invokevirtual 294	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   587: invokevirtual 297	com/admarvel/android/ads/AdMarvelInternalWebView:loadUrl	(Ljava/lang/String;)V
    //   590: aload 5
    //   592: ifnull -562 -> 30
    //   595: aload 5
    //   597: invokeinterface 300 1 0
    //   602: return
    //   603: aload 11
    //   605: ldc 242
    //   607: invokestatic 304	java/util/TimeZone:getDefault	()Ljava/util/TimeZone;
    //   610: invokevirtual 307	java/util/TimeZone:getID	()Ljava/lang/String;
    //   613: invokevirtual 213	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   616: goto -251 -> 365
    //   619: astore 4
    //   621: aload 4
    //   623: invokevirtual 89	java/lang/Exception:printStackTrace	()V
    //   626: aload_0
    //   627: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   630: ifnull +46 -> 676
    //   633: aload_0
    //   634: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   637: invokevirtual 101	java/lang/String:length	()I
    //   640: ifle +36 -> 676
    //   643: aload_2
    //   644: new 282	java/lang/StringBuilder
    //   647: dup
    //   648: invokespecial 283	java/lang/StringBuilder:<init>	()V
    //   651: ldc_w 285
    //   654: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   657: aload_0
    //   658: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   661: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   664: ldc_w 309
    //   667: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   670: invokevirtual 294	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   673: invokevirtual 297	com/admarvel/android/ads/AdMarvelInternalWebView:loadUrl	(Ljava/lang/String;)V
    //   676: aload 5
    //   678: ifnull -648 -> 30
    //   681: aload 5
    //   683: invokeinterface 300 1 0
    //   688: return
    //   689: aload_0
    //   690: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   693: ifnull -103 -> 590
    //   696: aload_0
    //   697: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   700: invokevirtual 101	java/lang/String:length	()I
    //   703: ifle -113 -> 590
    //   706: aload_2
    //   707: new 282	java/lang/StringBuilder
    //   710: dup
    //   711: invokespecial 283	java/lang/StringBuilder:<init>	()V
    //   714: ldc_w 285
    //   717: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   720: aload_0
    //   721: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   724: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   727: ldc_w 309
    //   730: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   733: invokevirtual 294	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   736: invokevirtual 297	com/admarvel/android/ads/AdMarvelInternalWebView:loadUrl	(Ljava/lang/String;)V
    //   739: goto -149 -> 590
    //   742: astore 6
    //   744: aload 5
    //   746: ifnull +10 -> 756
    //   749: aload 5
    //   751: invokeinterface 300 1 0
    //   756: aload 6
    //   758: athrow
    //   759: aload_0
    //   760: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   763: ifnull -173 -> 590
    //   766: aload_0
    //   767: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   770: invokevirtual 101	java/lang/String:length	()I
    //   773: ifle -183 -> 590
    //   776: aload_2
    //   777: new 282	java/lang/StringBuilder
    //   780: dup
    //   781: invokespecial 283	java/lang/StringBuilder:<init>	()V
    //   784: ldc_w 285
    //   787: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   790: aload_0
    //   791: getfield 137	com/admarvel/android/ads/AdMarvelWebView$l:k	Ljava/lang/String;
    //   794: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   797: ldc_w 309
    //   800: invokevirtual 289	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   803: invokevirtual 294	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   806: invokevirtual 297	com/admarvel/android/ads/AdMarvelInternalWebView:loadUrl	(Ljava/lang/String;)V
    //   809: goto -219 -> 590
    //   812: astore 6
    //   814: aconst_null
    //   815: astore 5
    //   817: goto -73 -> 744
    //   820: astore 4
    //   822: aconst_null
    //   823: astore 5
    //   825: goto -204 -> 621
    //
    // Exception table:
    //   from	to	target	type
    //   74	107	619	java/lang/Exception
    //   110	152	619	java/lang/Exception
    //   158	199	619	java/lang/Exception
    //   199	217	619	java/lang/Exception
    //   217	235	619	java/lang/Exception
    //   235	253	619	java/lang/Exception
    //   253	271	619	java/lang/Exception
    //   271	308	619	java/lang/Exception
    //   308	319	619	java/lang/Exception
    //   319	337	619	java/lang/Exception
    //   337	365	619	java/lang/Exception
    //   365	393	619	java/lang/Exception
    //   393	421	619	java/lang/Exception
    //   421	460	619	java/lang/Exception
    //   465	540	619	java/lang/Exception
    //   540	590	619	java/lang/Exception
    //   603	616	619	java/lang/Exception
    //   689	739	619	java/lang/Exception
    //   759	809	619	java/lang/Exception
    //   74	107	742	finally
    //   110	152	742	finally
    //   158	199	742	finally
    //   199	217	742	finally
    //   217	235	742	finally
    //   235	253	742	finally
    //   253	271	742	finally
    //   271	308	742	finally
    //   308	319	742	finally
    //   319	337	742	finally
    //   337	365	742	finally
    //   365	393	742	finally
    //   393	421	742	finally
    //   421	460	742	finally
    //   465	540	742	finally
    //   540	590	742	finally
    //   603	616	742	finally
    //   621	676	742	finally
    //   689	739	742	finally
    //   759	809	742	finally
    //   39	65	812	finally
    //   39	65	820	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.l
 * JD-Core Version:    0.6.2
 */