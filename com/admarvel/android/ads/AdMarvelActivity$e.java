package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressLint({"SimpleDateFormat"})
class AdMarvelActivity$e
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
  private final WeakReference<AdMarvelActivity> k;
  private final WeakReference<AdMarvelInternalWebView> l;

  public AdMarvelActivity$e(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelActivity paramAdMarvelActivity, String paramString1, String paramString2, String paramString3)
  {
    this.k = new WeakReference(paramAdMarvelActivity);
    this.l = new WeakReference(paramAdMarvelInternalWebView);
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

  public AdMarvelActivity$e(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelActivity paramAdMarvelActivity, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt)
  {
    this.k = new WeakReference(paramAdMarvelActivity);
    this.l = new WeakReference(paramAdMarvelInternalWebView);
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

  public AdMarvelActivity$e(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelActivity paramAdMarvelActivity, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt2, int paramInt3, String paramString11)
  {
    this.k = new WeakReference(paramAdMarvelActivity);
    this.l = new WeakReference(paramAdMarvelInternalWebView);
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
    if (ac.a() >= 8)
      return "content://com.android.calendar/";
    return "content://calendar/";
  }

  public void run()
  {
    Cursor localCursor = null;
    AdMarvelActivity localAdMarvelActivity;
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    if (this.k != null)
    {
      localAdMarvelActivity = (AdMarvelActivity)this.k.get();
      if (this.l == null)
        break label52;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.l.get();
      label38: if ((localAdMarvelActivity != null) && (localAdMarvelInternalWebView != null))
        break label57;
    }
    while (true)
    {
      return;
      localAdMarvelActivity = null;
      break;
      label52: localAdMarvelInternalWebView = null;
      break label38;
      label57: ContentResolver localContentResolver = localAdMarvelActivity.getContentResolver();
      try
      {
        localCursor = localContentResolver.query(Uri.parse(a() + "calendars"), new String[] { "_id", "displayname" }, null, null, null);
        if ((localCursor != null) && (localCursor.moveToFirst()))
        {
          String[] arrayOfString = new String[localCursor.getCount()];
          int[] arrayOfInt = new int[localCursor.getCount()];
          for (int m = 0; m < arrayOfString.length; m++)
          {
            arrayOfInt[m] = localCursor.getInt(0);
            arrayOfString[m] = localCursor.getString(1);
            localCursor.moveToNext();
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
          if (this.j <= 0)
            localContentValues1.put("hasAlarm", Integer.valueOf(1));
          if ((this.h != null) && (this.h.length() > 0))
            localContentValues1.put("eventTimezone", this.h);
          Uri localUri1 = Uri.parse(a() + "events");
          Uri localUri2 = Uri.parse(a() + "reminders");
          Uri localUri3 = localContentResolver.insert(localUri1, localContentValues1);
          if (localUri3 == null)
            break label601;
          if (this.j <= 0)
          {
            ContentValues localContentValues2 = new ContentValues();
            localContentValues2.put("event_id", Long.valueOf(Long.parseLong(localUri3.getLastPathSegment())));
            localContentValues2.put("method", Integer.valueOf(1));
            localContentValues2.put("minutes", Integer.valueOf(Math.abs(this.j)));
            localContentResolver.insert(localUri2, localContentValues2);
          }
          if ((this.i != null) && (this.i.length() > 0))
            localAdMarvelInternalWebView.loadUrl("javascript:" + this.i + "(\"YES\")");
        }
        while (true)
        {
          return;
          label601: if ((this.i != null) && (this.i.length() > 0))
            localAdMarvelInternalWebView.loadUrl("javascript:" + this.i + "(\"NO\")");
        }
      }
      catch (Exception localException)
      {
        if ((this.i != null) && (this.i.length() > 0))
          localAdMarvelInternalWebView.loadUrl("javascript:" + this.i + "(\"NO\")");
        localException.printStackTrace();
        return;
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.e
 * JD-Core Version:    0.6.2
 */