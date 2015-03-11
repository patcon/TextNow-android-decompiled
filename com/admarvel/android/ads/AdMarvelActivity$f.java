package com.admarvel.android.ads;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract.Calendars;
import android.provider.CalendarContract.Events;
import android.provider.CalendarContract.Reminders;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

class AdMarvelActivity$f
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
  private final WeakReference<AdMarvelActivity> o;
  private final WeakReference<AdMarvelInternalWebView> p;

  public AdMarvelActivity$f(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelActivity paramAdMarvelActivity, String paramString1, String paramString2, String paramString3)
  {
    this.o = new WeakReference(paramAdMarvelActivity);
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

  public AdMarvelActivity$f(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelActivity paramAdMarvelActivity, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt)
  {
    this.o = new WeakReference(paramAdMarvelActivity);
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
  public AdMarvelActivity$f(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelActivity paramAdMarvelActivity, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt2, int paramInt3, String paramString11)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 36	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 38	java/text/SimpleDateFormat
    //   8: dup
    //   9: ldc 40
    //   11: invokespecial 43	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   14: putfield 45	com/admarvel/android/ads/AdMarvelActivity$f:a	Ljava/text/SimpleDateFormat;
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield 47	com/admarvel/android/ads/AdMarvelActivity$f:b	Ljava/lang/Long;
    //   22: aload_0
    //   23: aconst_null
    //   24: putfield 49	com/admarvel/android/ads/AdMarvelActivity$f:c	Ljava/lang/Long;
    //   27: aload_0
    //   28: iconst_1
    //   29: putfield 51	com/admarvel/android/ads/AdMarvelActivity$f:l	I
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield 53	com/admarvel/android/ads/AdMarvelActivity$f:m	I
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield 55	com/admarvel/android/ads/AdMarvelActivity$f:n	I
    //   42: aload_0
    //   43: new 57	java/lang/ref/WeakReference
    //   46: dup
    //   47: aload_2
    //   48: invokespecial 60	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   51: putfield 62	com/admarvel/android/ads/AdMarvelActivity$f:o	Ljava/lang/ref/WeakReference;
    //   54: aload_0
    //   55: new 57	java/lang/ref/WeakReference
    //   58: dup
    //   59: aload_1
    //   60: invokespecial 60	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   63: putfield 64	com/admarvel/android/ads/AdMarvelActivity$f:p	Ljava/lang/ref/WeakReference;
    //   66: aload_3
    //   67: ifnull +21 -> 88
    //   70: aload_0
    //   71: aload_0
    //   72: getfield 45	com/admarvel/android/ads/AdMarvelActivity$f:a	Ljava/text/SimpleDateFormat;
    //   75: aload_3
    //   76: invokevirtual 68	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   79: invokevirtual 74	java/util/Date:getTime	()J
    //   82: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   85: putfield 47	com/admarvel/android/ads/AdMarvelActivity$f:b	Ljava/lang/Long;
    //   88: aload 8
    //   90: ifnull +193 -> 283
    //   93: aload_0
    //   94: aload_0
    //   95: getfield 45	com/admarvel/android/ads/AdMarvelActivity$f:a	Ljava/text/SimpleDateFormat;
    //   98: aload 8
    //   100: invokevirtual 68	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   103: invokevirtual 74	java/util/Date:getTime	()J
    //   106: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   109: putfield 49	com/admarvel/android/ads/AdMarvelActivity$f:c	Ljava/lang/Long;
    //   112: aload_0
    //   113: aload 4
    //   115: putfield 84	com/admarvel/android/ads/AdMarvelActivity$f:d	Ljava/lang/String;
    //   118: aload_0
    //   119: aload 5
    //   121: putfield 86	com/admarvel/android/ads/AdMarvelActivity$f:e	Ljava/lang/String;
    //   124: aload_0
    //   125: aload 6
    //   127: putfield 92	com/admarvel/android/ads/AdMarvelActivity$f:f	Ljava/lang/String;
    //   130: aload_0
    //   131: aload 7
    //   133: putfield 94	com/admarvel/android/ads/AdMarvelActivity$f:g	Ljava/lang/String;
    //   136: iload 9
    //   138: ifgt +12 -> 150
    //   141: aload_0
    //   142: iload 9
    //   144: bipush 60
    //   146: idiv
    //   147: putfield 51	com/admarvel/android/ads/AdMarvelActivity$f:l	I
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
    //   249: putfield 131	com/admarvel/android/ads/AdMarvelActivity$f:h	Ljava/lang/String;
    //   252: aload_0
    //   253: aload 12
    //   255: putfield 133	com/admarvel/android/ads/AdMarvelActivity$f:i	Ljava/lang/String;
    //   258: aload_0
    //   259: aload 13
    //   261: putfield 135	com/admarvel/android/ads/AdMarvelActivity$f:j	Ljava/lang/String;
    //   264: aload_0
    //   265: aload 16
    //   267: putfield 137	com/admarvel/android/ads/AdMarvelActivity$f:k	Ljava/lang/String;
    //   270: aload_0
    //   271: iload 14
    //   273: putfield 53	com/admarvel/android/ads/AdMarvelActivity$f:m	I
    //   276: aload_0
    //   277: iload 15
    //   279: putfield 55	com/admarvel/android/ads/AdMarvelActivity$f:n	I
    //   282: return
    //   283: aload_0
    //   284: ldc2_w 81
    //   287: aload_0
    //   288: getfield 45	com/admarvel/android/ads/AdMarvelActivity$f:a	Ljava/text/SimpleDateFormat;
    //   291: aload_3
    //   292: invokevirtual 68	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   295: invokevirtual 74	java/util/Date:getTime	()J
    //   298: ladd
    //   299: invokestatic 80	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   302: putfield 49	com/admarvel/android/ads/AdMarvelActivity$f:c	Ljava/lang/Long;
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

  public void run()
  {
    Cursor localCursor = null;
    AdMarvelActivity localAdMarvelActivity;
    if (this.o != null)
    {
      localAdMarvelActivity = (AdMarvelActivity)this.o.get();
      if (this.p == null)
        break label52;
    }
    label52: for (AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.p.get(); ; localAdMarvelInternalWebView = null)
    {
      if ((localAdMarvelActivity != null) && (localAdMarvelInternalWebView != null))
        break label57;
      return;
      localAdMarvelActivity = null;
      break;
    }
    label57: ContentResolver localContentResolver = localAdMarvelActivity.getContentResolver();
    while (true)
    {
      try
      {
        localCursor = localContentResolver.query(CalendarContract.Calendars.CONTENT_URI, new String[] { "_id", "calendar_displayName" }, null, null, null);
        if ((localCursor != null) && (localCursor.moveToFirst()))
        {
          String[] arrayOfString = new String[localCursor.getCount()];
          int[] arrayOfInt = new int[localCursor.getCount()];
          int i1 = 0;
          if (i1 < arrayOfString.length)
          {
            arrayOfInt[i1] = localCursor.getInt(0);
            arrayOfString[i1] = localCursor.getString(1);
            localCursor.moveToNext();
            i1++;
            continue;
          }
          ContentValues localContentValues1 = new ContentValues();
          localContentValues1.put("calendar_id", Integer.valueOf(arrayOfInt[0]));
          if (this.d != null)
            localContentValues1.put("title", this.d);
          if (this.e != null)
            localContentValues1.put("description", this.e);
          if (this.f != null)
            localContentValues1.put("eventLocation", this.f);
          if (this.b != null)
            localContentValues1.put("dtstart", this.b);
          if (this.c != null)
            localContentValues1.put("dtend", this.c);
          if ((this.g != null) && ((this.g.toLowerCase().equals("true")) || (this.g.toLowerCase().equals("yes"))))
            localContentValues1.put("allDay", Integer.valueOf(1));
          if (this.l <= 0)
            localContentValues1.put("hasAlarm", Integer.valueOf(1));
          if ((this.h != null) && (this.h.length() > 0))
          {
            localContentValues1.put("eventTimezone", this.h);
            if ((this.i != null) && (this.i.length() > 0))
              localContentValues1.put("rrule", this.i);
            if ((this.j != null) && (this.j.length() > 0))
              localContentValues1.put("exdate", this.j);
            localContentValues1.put("eventStatus", Integer.valueOf(this.m));
            localContentValues1.put("availability", Integer.valueOf(this.n));
            Uri localUri = localContentResolver.insert(CalendarContract.Events.CONTENT_URI, localContentValues1);
            if (localUri != null)
            {
              if (this.l <= 0)
              {
                ContentValues localContentValues2 = new ContentValues();
                localContentValues2.put("event_id", Long.valueOf(Long.parseLong(localUri.getLastPathSegment())));
                localContentValues2.put("method", Integer.valueOf(1));
                localContentValues2.put("minutes", Integer.valueOf(Math.abs(this.l)));
                localContentResolver.insert(CalendarContract.Reminders.CONTENT_URI, localContentValues2);
              }
              if ((this.k != null) && (this.k.length() > 0))
                localAdMarvelInternalWebView.loadUrl("javascript:" + this.k + "(\"YES\")");
            }
          }
          else
          {
            localContentValues1.put("eventTimezone", TimeZone.getDefault().getID());
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        if ((this.k != null) && (this.k.length() > 0))
          localAdMarvelInternalWebView.loadUrl("javascript:" + this.k + "(\"NO\")");
        return;
        if ((this.k == null) || (this.k.length() <= 0))
          continue;
        localAdMarvelInternalWebView.loadUrl("javascript:" + this.k + "(\"NO\")");
        continue;
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
      if ((this.k != null) && (this.k.length() > 0))
        localAdMarvelInternalWebView.loadUrl("javascript:" + this.k + "(\"NO\")");
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.f
 * JD-Core Version:    0.6.2
 */